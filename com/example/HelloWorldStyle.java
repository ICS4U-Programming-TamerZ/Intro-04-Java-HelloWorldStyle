package com.example;

/**
 * Prints Hello world with Style.
 *
 * @author Tamer
 * @version 1.0
 * @since 2024/02/08
 */

// Class
public final class HelloWorldStyle {

  /**
   * This is a private constructor used to satisfy the style checker.
   *
   * @exception IllegalStateException utility class
   * @see IllegalStateException
   */
  private HelloWorldStyle() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  // Main Entry point method
  public static void main(final String[] args) {
    // Output to Console saying "Hello, World!".
    System.out.println("Hello Van, with Style!");
    System.out.println("How are you!");
  }
}
