package org.example;

import static input.InputUtils.stringInput;

public class Main {
    public static void main(String[] args)
    {String name = stringInput("What is you name: ");
        System.out.println("Hello world!");
        System.out.println("Hello" + name);
    }
}