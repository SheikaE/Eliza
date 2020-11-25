package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");
        String name = keyboard.nextLine();
        System.out.println(name);

        System.out.println("Nice to meet you, " + name + ", Hows has your day been?");
        String answer = keyboard.nextLine();

        System.out.println("Okay, Anything in particular that makes you feel that It has been a splendid day! ?");
        String response = keyboard.nextLine();

        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day");



    }
}
