package com.test.inmarsat.samplerest;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


public class SampleRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		restConfiguration().component("restlet").port(9091);
		rest("/expose")
		.get("/rest").produces("text/plain")
		.to("direct:samplerest");
		
		
		//from("cxfrs:http://localhost:8081?resourceClasses=com.test.inmarsat.samplerest.SampleService&bindingStyle=SimpleConsumer")
		from("direct:samplerest")
		.log("Inside the Rest sample Project Setting the body")
	    .setBody().constant("Hello from the Rest project") 
		.log("the body :: ${body}");
	    
	}

	
	
}
