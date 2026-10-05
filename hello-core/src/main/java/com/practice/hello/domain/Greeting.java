package com.practice.hello.domain;

/** Pure logic: the text of one greeting. */
public record Greeting(String text) {

    /** Makes the greeting for a name; an empty name greets the world. */
    public static Greeting forName(String name) {
        String who = name == null || name.isBlank() ? "world" : name.strip();
        return new Greeting("Hello, " + who + "!");
    }
}
