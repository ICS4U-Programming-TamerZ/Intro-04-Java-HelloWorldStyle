package com.example;

/**
 * Prints Hello world with Style.
 *
 * @author Tamer
 * @version 1.0
 * @since 2024-02-08
 */

// Class
public class HelloWorldStyle {

    /**
     * This is a private constructor used to prevent instantiation.
     */
    private HelloWorldStyle() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    /**
     * This is the main method.
     *
     * @param args Unused
     */
    public static void main(final String[] args) {
        System.out.println("Hello Van, with Style!");
        System.out.println("How are you!");
    }
}
