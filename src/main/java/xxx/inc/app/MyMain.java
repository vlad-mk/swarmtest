package xxx.inc.app;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ClassLoaderAsset;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.bootstrap.Main;
import org.wildfly.swarm.datasources.DatasourcesFraction;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class MyMain {
    

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
        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);//, "swarmtest-1.0-SNAPSHOT.war");
        deployment.addPackage(MyMain.class.getPackage());
 
        deployment.addAllDependencies();
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
        swarm.deploy(deployment);
    }
}
