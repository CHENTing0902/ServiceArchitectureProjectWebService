package fr.insa.soa.TestRest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("blind")
public class BlindResource {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Blind getBlind() {
		Blind blind = new Blind();
		int id = 1;
		String status = "Open";
		String name = "Blind";
		blind.setId(id);
		blind.setStatus(status);
		blind.setName(name);
		return blind;
	}
	
	@GET
	@Path("/{idBlind}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Blind getBlind(@PathParam("idBlind") int id) {
		Blind blind = new Blind();
		String status = "Open";
		String name = "Blind";
		blind.setId(id);
		blind.setStatus(status);
		blind.setName(name);
		return blind;
	}
	
	@PUT
	@Path("/{idBlind}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Blind changeStatus(@PathParam("idBlind") int id) {
		Blind blind = new Blind();
		String status = "Close";
		String name = "Blind";
		blind.setId(id);
		blind.setStatus(status);
		blind.setName(name);
		return blind;
	}
}
