package com.tesfayeeshetie.object;

// TODO:  1. Create a new class named 'Cow'.
public class Cow {

// TODO:  2. Create a private variable named 'name'. It should be a String, and once it's set we shouldn't be able to change it.

    private final String name;

    // TODO: 3. Add a constructor that takes a String argument, and in the constructor use that String argument to populate the 'name' variable.
    public Cow(String name) {
        this.name = name;
    }

    // TODO: 4. Create a getter to return the name of the Cow.

    public String getName() {
        return name;
    }
}


