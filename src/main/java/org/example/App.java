package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = se.nextLine();

        System.out.print("Who said it? ");
        String author = se.nextLine();

        System.out.println(author + " says, \"" + quote + "\"");
    }
}

