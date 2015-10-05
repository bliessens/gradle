package be.cegeka.gradle.impl;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AwesomeServiceImplTest {

    private AwesomeServiceImpl service = new AwesomeServiceImpl();

    @Test
    public void shouldStartWithLoremIpsum() throws Exception {
        assertTrue("Start of text is not correct", service.loremIpsum().startsWith("Lorem ipsum"));
    }
}