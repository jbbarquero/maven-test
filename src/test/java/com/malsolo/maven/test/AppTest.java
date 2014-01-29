package com.malsolo.maven.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
	public void testMarkerMethod() {
    }

    /**
     * Rigourous Test :-)
     */
    @Test
	public void testApp() {
        assertTrue( true );
    }
    
    @Test
	public void testHowAreYouDoing() {
    	App app = new App();
    	assertNotNull( app.howAreYouDoing() );
    }
    
}
