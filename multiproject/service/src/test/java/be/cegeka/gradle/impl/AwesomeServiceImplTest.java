package be.cegeka.gradle.impl;

import be.cegeka.gradle.domain.AbstractDomainTest;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AwesomeServiceImplTest extends AbstractDomainTest {

    private AwesomeServiceImpl service = new AwesomeServiceImpl();

    @Test
    public void shouldStartWithLoremIpsum() throws Exception {
        assertTrue("Start of text is not correct", service.loremIpsum().startsWith("Lorem ipsum"));
    }
}