package com.batal.demo.quarkus.rest;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloResource {

    @ConfigProperty(name = "name2")
    String foo;

    @Inject
    Template hello;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        final Message helloMessage = new Message();
        helloMessage.name = "Hayri " + foo;
        helloMessage.title = "Learning Qute Templating Engine";

        return hello.data("message", helloMessage);
    }
}