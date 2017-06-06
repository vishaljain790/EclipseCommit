package com.sample.restcall;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/printdata")
public class PrintData {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getData(){
		
		String sample = "Test case";
		
		
		return sample;
		
	}
	
}
