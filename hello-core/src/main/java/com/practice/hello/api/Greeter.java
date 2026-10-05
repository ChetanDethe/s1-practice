package com.practice.hello.api;

import com.practice.hello.domain.Greeting;

/** What other modules may use: makes a greeting for a name. */
public final class Greeter {

    /** No objects: only a static helper. */
    private Greeter() {
    }

    /** Returns "Hello, Ana!" for "Ana", and "Hello, world!" for an empty name. */
    public static String greet(String name) {
        return Greeting.forName(name).text();
    }
}
