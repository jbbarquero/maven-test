package com.malsolo.maven.test;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.printf("Everything seems to be %s, do you agree?\n", new App().howAreYouDoing());
        System.out.println( "Bye World!" );
    }
    
    public boolean isOk() {
    	return new Random().nextBoolean();
    }
    
    public String howAreYouDoing() {
    	return isOk()?Status.OK.toString():Status.KO.toString();
    }
}
