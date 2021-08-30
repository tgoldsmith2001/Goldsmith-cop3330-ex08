/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("How many people? ");
        String Str1=input.nextLine();
        System.out.print("How many pizzas do you have? ");
        String Str2=input.nextLine();
        System.out.print("How many slices per pizza? ");
        String Str3=input.nextLine();
        int people= Integer.parseInt(Str1);
        int pizzas= Integer.parseInt(Str2);
        int slices= Integer.parseInt(Str3);
        int total=slices*pizzas;
        System.out.format("%d people with %d pizzas (%d slices)\n",people,pizzas,total);
        //Integer division rounds down
        int per_person= total/people;
        int leftover=total%people;
        System.out.format("Each person gets %d pieces of pizza.\n" +
                "There are %d leftover pieces.",per_person,leftover);
    }
}