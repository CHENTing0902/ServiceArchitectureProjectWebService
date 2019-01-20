package fr.insa.soa.TestRest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("light")
public class LightResource {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Light getLight() {
		Light light = new Light();
		String status = "On";
		String name = "Lamp";
		int id = 1;
		light.setStatus(status);
		light.setName(name);
		light.setId(id);
		return light;
	}
	
	@GET
	@Path("/{idLight}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Light getLight(@PathParam("idLight") int id) {
		Light light = new Light();
		String status = "On";
		String name = "Lamp";
		light.setId(id);
		light.setStatus(status);
		light.setName(name);
		return light;
	}
	
	@PUT
	@Path("/{idLight}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Light changeStatus(@PathParam("idLight") int id) {
		Light light = new Light();
		String status = "Off";
		String name = "Lamp";
		light.setId(id);
		light.setStatus(status);
		light.setName(name);
		return light;
	}
	
}
