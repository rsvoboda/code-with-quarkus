package org.acme;

import io.smallrye.mutiny.Multi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/server-sent-events-pong")
public class ServerSentEventsPongResource {

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    public Multi<String> getPong() {
        System.out.println(" ===  PONG === ");
        return Multi.createFrom().item("pong");
    }
}
