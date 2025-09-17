package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for HelloWorld.
 */
public class HelloWorldTest {
    
    @Test
    public void testGetGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        String expected = "Hello World";
        String actual = helloWorld.getGreeting();
        assertEquals(expected, actual, "The greeting message should be 'Hello World'");
    }
    
    @Test
    public void testHelloWorldExists() {
        // Test that we can instantiate HelloWorld
        HelloWorld helloWorld = new HelloWorld();
        assertNotNull(helloWorld, "HelloWorld instance should not be null");
    }
}