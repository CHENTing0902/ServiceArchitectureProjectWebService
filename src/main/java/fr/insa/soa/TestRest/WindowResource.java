package fr.insa.soa.TestRest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("window")
public class WindowResource {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Window getWindow() {
		Window window = new Window();
		int id = 1;
		String status = "Open";
		String name = "Window";
		window.setId(id);
		window.setStatus(status);
		window.setName(name);
		return window;
	}

	@GET
	@Path("/{idWindow}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Window getWindow(@PathParam("idWindow") int id) {
		Window window = new Window();
		String status = "Open";
		String name = "Window";
		window.setId(id);
		window.setStatus(status);
		window.setName(name);
		return window;
	}
	
	@PUT
	@Path("{idWindow}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Window changeStatus(@PathParam("idWindow") int id) {
		Window window = new Window();
		String status = "Close";
		String name = "Window";
		window.setId(id);
		window.setStatus(status);
		window.setName(name);
		return window;
	}
}
