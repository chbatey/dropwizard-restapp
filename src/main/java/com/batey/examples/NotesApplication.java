package com.batey.examples;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class NotesApplication extends Application<NotesConfiguration> {

    public static void main(String[] args) throws Exception {
        new NotesApplication().run(args);
    }

    @Override
    public String getName() {
        return "NotesApplication";
    }
    @Override
    public void initialize(Bootstrap<NotesConfiguration> notesConfigurationBootstrap) {

    }

    @Override
    public void run(NotesConfiguration notesConfiguration, Environment environment) throws Exception {
        NotesResource resource = new NotesResource();
        environment.jersey().register(resource);
    }
}
