package pplab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Functions {

    public static void printArray(ArrayList<Customer> array) {
        System.out.println("Recieved data: ");
        for (int i = 0; i < array.size() - 1; i++) {
            System.out.println(array.get(i).toString());
        }
    }

    public static void printByName(ArrayList<Customer> array, Scanner read) {
        System.out.println("Enter a name to search for: ");
        String name = read.next();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getName().equals(name)) {
                System.out.println(array.get(i).toString());
            }
        }
    }

    public static void printByInterval(ArrayList<Customer> array, Scanner read) {
        long lower, higher;
        System.out.println("Enter a lower limit of interval: ");
        lower = read.nextLong();
        System.out.println("Enter a higher limit of interval: ");
        higher = read.nextLong();
        System.out.println("List of people with card number of given interval: ");
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getCardnum() >= lower && array.get(i).getCardnum() <= higher) {
                System.out.println(array.get(i).toString());
            }
        }
    }

    public static void printByDebt(ArrayList<Customer> array) {
        System.out.println("List of people in debt: ");
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getBalance() < 0) {
                System.out.println(array.get(i).toString());
            }
        }
    }
}