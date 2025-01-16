package ulaval.glo2003;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("")
public class RootResource {
    @GET
    public Response root() {
        return Response.ok("OK").build();
    }
}
