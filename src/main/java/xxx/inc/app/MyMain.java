package xxx.inc.app;

import org.jboss.shrinkwrap.api.Filters;
import org.jboss.shrinkwrap.api.GenericArchive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ClassLoaderAsset;
import org.jboss.shrinkwrap.api.importer.ExplodedImporter;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.bootstrap.Main;
import org.wildfly.swarm.datasources.DatasourcesFraction;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

import java.io.File;

public class MyMain {
    
    private static final String WEBAPP_SRC = "src/main/webapp";

    public static void main(String... args) throws Exception {
        // Instantiate the container
            Swarm swarm = new Swarm()
//                .fraction(new DatasourcesFraction()
//                .jdbcDriver("h2", (d) -> {
//                    d.driverClassName("org.h2.Driver");
//                    d.xaDatasourceClass("org.h2.jdbcx.JdbcDataSource");
//                    d.driverModuleName("com.h2database.h2");
//                })
//                .dataSource("ExampleDS", (ds) -> {
//                    ds.driverName("h2");
//                    ds.connectionUrl("jd  bc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
//                    ds.userName("foo");
//                    ds.password("bar");
//                }));
;
        // Create one or more deployments
        JAXRSArchive jaxrsArchive = ShrinkWrap.create(JAXRSArchive.class);//, "swarmtest-1.0-SNAPSHOT.war");
        WebArchive webArchive = ShrinkWrap.create(WebArchive.class);//, "test.war");//, "swarmtest-1.0-SNAPSHOT.war");
        jaxrsArchive.addPackage(MyMain.class.getPackage());
        jaxrsArchive.addAllDependencies();
        webArchive.merge(jaxrsArchive);
        webArchive.merge(ShrinkWrap.create(GenericArchive.class).as(ExplodedImporter.class)
                        .importDirectory(WEBAPP_SRC).as(GenericArchive.class),
                "/", Filters.exclude("WEB-INF"));
//        for (File f : new File(WEBAPP_SRC).listFiles()) {
//            webArchive.addAsWebResource(f);
//        }
//        webArchive.merge(jaxrsArchive);
//        deployment.addAllDependencies();
//        deployment.addAsW
//        System.out.println("+ " + MyMain.class.getClassLoader().getResource("project-defaults.yml"));
//        deployment.addAsWebResource(
//                new ClassLoaderAsset("index.html", MyMain.class.getClassLoader()), "index.html");
//
//        deployment.addAsWebInfResource(
//                new ClassLoaderAsset("WEB-INF/web.xml", MyMain.class.getClassLoader()), "web.xml");

        // Add resource to deployment
//        deployment.addClass(MyResource.class);

        swarm.start();
//        swarm.deploy(jaxrsArchive);
        swarm.deploy(webArchive);
    }
}
