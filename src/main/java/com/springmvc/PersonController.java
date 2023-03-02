package com.springmvc;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person")
public class PersonController {

    static ArrayList<Person> person1 = new ArrayList<>();
    Person p2 = new Person("sherif", 23);
        Person p1 = new Person("hassan", 27);
        

    @RequestMapping(method = RequestMethod.GET)
    public Person getUser() {
        person1.add(p1);
        person1.add(p2);
        return person1.get(0);
    }

    // @POST
    // @Consumes(MediaType.APPLICATION_JSON)
    // public Response postUser(Person p) {
    //     person1.add(p);
    //     URI uri = UriBuilder.fromPath("/{persons}").build(p);
    //     return Response.created(uri).entity(person1).build();
    // }

    // @DELETE
    // @Path("{name}")
    // @Produces(MediaType.APPLICATION_JSON)
    // public Response deleteUser(@PathParam("name") String name) {
    //     for (int i = 0; i < person1.size(); i++) {
    //         if (person1.get(i).getName().equals(name)) {
    //             person1.remove(i);
    //         }
    //     }
    //     return Response.ok().entity(person1).build();
    // }

    // @PUT
    // @Path("{name}")
    // @Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
    // public Response updateUser(@PathParam("name") String name, String input) {

    //     for (int i = 0; i < person1.size(); i++) {
    //         if (person1.get(i).getName().equals(name)) {
    //             person1.get(i).setName(input);
    //         }
    //     }
    //     return Response.accepted().entity(person1).build();
    // }

}
