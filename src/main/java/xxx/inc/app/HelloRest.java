package xxx.inc.app;


import jdk.nashorn.internal.objects.annotations.Getter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/h")
public class HelloRest {

    @GET
    @Produces( {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("hello")
    public String hello() {
        return "Hi doo\n\n" ;
    }


    @GET
    @Produces( {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("some")
    public Something some() {
        return  new Something(0, "dude");
    }

    @GET
    @Produces( {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("some/{id}")
    public Something someid(@PathParam("id") int id ) {
        return  new Something(id, "dude");
    }
}


