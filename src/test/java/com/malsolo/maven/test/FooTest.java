package com.malsolo.maven.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class FooTest {
	
	@Rule
    final public TestRule traceTestWatcher = new TestWatcher() {
        @Override
        protected void starting(Description d) {
            System.err.println(d);
        }
    };
    
    @Test
    public void testBar() {
    }

}
