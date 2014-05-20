package com.batey.examples;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class NotesApplication extends Application<NotesConfiguration> {

    @Override
    public String getName() {
        return "NotesApplication";
    }
    @Override
    public void initialize(Bootstrap<NotesConfiguration> notesConfigurationBootstrap) {

    }

    @Override
    public void run(NotesConfiguration notesConfiguration, Environment environment) throws Exception {

    }
}
