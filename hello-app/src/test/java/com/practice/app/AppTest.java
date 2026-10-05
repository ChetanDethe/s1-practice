package com.practice.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.practice.hello.api.Greeter;
import org.junit.jupiter.api.Test;

/** Proves that this module compiles, reaches hello-core, and that its tests run. */
class AppTest {

    /** The app greets through the api of hello-core. */
    @Test
    void greetsThroughHelloCore() {
        assertEquals("Hello, Ana!", Greeter.greet("Ana"));
    }
}
