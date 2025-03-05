/*
Week 1
Objective: To understand the basic concepts of Object Oriented Programming System and to
get familiar with object and class.
-
Assignment 2.
Write a Java program to add two numbers
*/
public class Main {
    public static void main(String[] args) {
        addTwoNumbers firstTwoNumbers = new addTwoNumbers();
        firstTwoNumbers.setNumber1(7.3);
        firstTwoNumbers.setNumber2(2.7);
        System.out.println(firstTwoNumbers.getNumber1()+" + "+firstTwoNumbers.getNumber2()+" = "+firstTwoNumbers.addNumbers());

        addTwoNumbers TwoNumbers = new addTwoNumbers(7.3,2.7);
        System.out.println(TwoNumbers.addNumbers());

    }
}