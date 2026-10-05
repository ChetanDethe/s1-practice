package com.practice.hello.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** Tests the greeting. */
class GreeterTest {

    /** A name is greeted. */
    @Test
    void greetsAName() {
        assertEquals("Hello, Ana!", Greeter.greet("Ana"));
    }

    /** An empty name greets the world. */
    @Test
    void greetsTheWorldWithoutAName() {
        assertEquals("Hello, world!", Greeter.greet(" "));
    }
}
