package com.batey.examples;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/notes")
@Produces(MediaType.APPLICATION_JSON)
public class NotesResource {

    @GET
    public Note retrieveNote(@QueryParam("id") int id) {
        return new Note(id, "Chris", "Something");
    }
}
