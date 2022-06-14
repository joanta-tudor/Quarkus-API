package org.acme.getting.started;

import org.acme.getting.started.model.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/getPerson")
public class GetPerson {

    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public Person getPersonXML(){
        return new Person("Stefan",24,"Lisabona");
    }

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonJson(){
        return new Person("Andrei",22,"Paris");
    }
}
