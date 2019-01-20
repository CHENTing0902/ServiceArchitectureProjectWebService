package fr.insa.soa.TestRest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Light {
	String status;
	String name;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void turnOnLight() {
		this.status = "On";
	}
	
	public void turnOffLight() {
		this.status = "Off";
	}

}
