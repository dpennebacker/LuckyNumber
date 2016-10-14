package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Lucky Number Generator");
        int inputNum = -1;
        Scanner kbInput = new Scanner(System.in);
        String person = null;
        int lucky = 0;

        while(inputNum != 0 && inputNum != 1)
        {
            System.out.println("Enter 0 to Exit or 1 to print names or 2 to enter a name");

            if(inputNum != 0 && inputNum != 1)
            {
                System.out.println("Please enter the first name you want for a lucky number");
                Scanner kbInput2 = new Scanner(System.in);
                String name = kbInput2.nextLine();
                perfectRandom Person = new perfectRandom(name);
                person = Person.perfectName;
                lucky = Person.perfectSqRandom;
                System.out.println("Enter 0 to Exit or 1 to print the lucky number or 2 to enter another name");

            }
            inputNum = kbInput.nextInt();
        }
        if(inputNum == 0)
        {
            System.out.println("See ya!");
        }
        else
        {
            System.out.println("Here is your printout:");
            System.out.println(person + " " + lucky);

        }
    }
}
