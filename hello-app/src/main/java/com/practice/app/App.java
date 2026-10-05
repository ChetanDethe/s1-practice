package com.practice.app;

import com.practice.hello.api.Greeter;

/** The small program: prints a greeting. It uses only the api package of hello-core. */
public final class App {

    /** No objects: only main. */
    private App() {
    }

    /** Prints "Hello, <first argument>!", or "Hello, world!" without an argument. */
    public static void main(String[] args) {
        System.out.println(Greeter.greet(args.length > 0 ? args[0] : ""));
    }
}
