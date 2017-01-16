package com.develogical.app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {
    private QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("ivan"), containsString("teacher"));
    }

    @Test
    public void knowsAboutDarwin() throws Exception {
        assertThat(queryProcessor.process("darwin"), containsString("cutie"));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }


    @Test
    public void knowsAboutSami() throws Exception {
        assertThat(queryProcessor.process("sami"), containsString("student"));
    }

    @Test
    public void knowsAboutCameron() throws Exception {
        assertThat(queryProcessor.process("cameron"), containsString("referendum"));
    }
}
