package com.malsolo.maven.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, EmptyTest.class, NameRuleTest.class, FooTest.class })
public class AllTestsSuite {
}
