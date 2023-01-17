package org.acme;

import io.smallrye.mutiny.Multi;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient
public interface ServerSentEventsPongClient {
    @GET
    @Path("/server-sent-events-pong")
    @Produces(MediaType.SERVER_SENT_EVENTS)
    Multi<String> getPong();

}
