/**
Aaron Galipeau
CSC6301 Software Design & Documentation
Module 04: Assignment 01 - Project 04 - Linked List and Collections Framework
Merrimack College
Gautham Krishnamurthy (GK)
*/

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This program reads a list of integer numbers from user input, stores them in a LinkedList,
 * and sorts them in ascending order using Java Collections Framework.
 * The program can be executed from the command line and does not require an IDE.
 * 
 * To compile: javac SortedLinkedList.java
 * To run: java SortedLinkedList
 * To generate javadoc: javadoc SortedLinkedList.java
 */
public class SortedLinkedList {

    /**
     * The main method which executes the program.
     * It reads integer inputs, stores them in a LinkedList, and sorts the list.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();
        
        System.out.println("Enter an integer, press Enter, and repeat (type 'end' to finish):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer, or type 'end' to stop.");
            }
        }
        
        // Reuse Java's built-in sorting method (Collections Framework), no need to reinvent sorting algorithms
        Collections.sort(numbers);

        System.out.println("Your sorted list of integers is: " + numbers);

        scanner.close();
    }
}
