package com.mallika.webservices.messages;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("message")
public class MessageResources {
 @GET
 @Produces(MediaType.TEXT_PLAIN)
	public String writeMessage() {
		return "hello sindhu";
	}
	
}
