package com.luizalabs;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

  @GET
  public List<User> all() {
    return User.listAll();
  }

  @GET
  @Path("/{id}")
  public User findById(@PathParam("id") Long id) {
    return User.findById(id);
  }

  @POST
  public User create(User user) {
    User.persist(user);
    return user;
  }

}