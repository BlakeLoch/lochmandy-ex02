/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class Solution02 {
    /*
        Print "What is the input string?"
        'string' = read string from user
        Print 'string+" has "+'string'.length+" characters."

     */

    public static void main(String[] args) {
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        System.out.println(string+" has "+string.length()+" characters.");
    }
}