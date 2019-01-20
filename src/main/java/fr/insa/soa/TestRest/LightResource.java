package fr.insa.soa.TestRest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("light")
public class LightResource {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Light getStatus() {
		Light light = new Light();
		String status = "On";
		String name = "Lamp";
		int id = 1;
		light.setStatus(status);
		light.setName(name);
		light.setId(id);
		return light;
	}
	
}
