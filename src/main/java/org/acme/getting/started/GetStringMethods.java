package org.acme.getting.started;

import org.acme.getting.started.model.Person;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/get")
public class GetStringMethods {
    @GET
    @Path("/indexOf/{word}")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer getIndexOf(@PathParam String word){
        return word.indexOf('a',2);
    }

    @GET
    @Path("/toCharArray/{word}")
    public char[] getToCharArray(@PathParam String word){
        return word.toCharArray();
    }

    @GET
    @Path("/charAt")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer getCharAt(){
        Integer counter=0;
        Person person=new Person("ALex",30,"Cluj-Napoca");
        for(int i=0;i<person.getPlaceOfBirth().length();i++){
            if (person.getPlaceOfBirth().charAt(i) == 'a')
                counter++;
        }
        return counter;
    }

    @GET
    @Path("/concat/{word}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getConcat(@PathParam String word){
        return word.concat("TEST");
    }

    @GET
    @Path("/replace/{word}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getReplace(@PathParam String word){
        return word.replace("a","A");
    }

    @GET
    @Path("/substring/{word}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getSubstring(@PathParam String word){
        return word.substring(3);
    }

    @GET
    @Path("/split/{word}")
    public String[] getSplit(@PathParam String word){
        return word.split(",");
    }

    @GET
    @Path("/compareTo/{word}")
    public String getCompareTo(@PathParam String word){
        if(word.compareTo("here") == 0)
            return "Same word";
        else
            return "Not the same word";
    }

    @GET
    @Path("/strip/{word}")
    public String getStrip(@PathParam String word){
        return word.strip();
    }

    @GET
    @Path("/valueOf")
    public String getValueOf(){
        char array[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        return String.valueOf(array);
    }
}
