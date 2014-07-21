package com.cucumber.mavenCucumberPrototype;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
    	System.out.println("one");
    	System.out.println("two");
    	System.out.println("three");
    	System.out.println("four");
    	System.out.println("five");
    	System.out.println("six");
    	System.out.println("seven");
    	assertTrue( true );
        
    }
}
