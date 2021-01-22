package pplab2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final String menu = "Interface:\n" +
                "1 - print a list of customers\n" +
                "2 - print all customers with certain name\n" +
                "3 - print all customers with card number within certain interval\n" +
                "4 - print all customers in debt\n" +
                "0 - exit the program\n";

        Scanner read = new Scanner(System.in);
        ArrayList<Customer> array = new ArrayList<>();

        System.out.println("Start inputting customer's data(0 in the name field to end the input):");
        createArray(array, read);
        
        int option;
        System.out.println(menu);
        while (true) {
            System.out.println("Choose an option: ");
            option = read.nextInt();
            switch (option) {
                case 1:
                    Functions.printArray(array);
                    break;
                case 2:
                    Functions.printByName(array, read);
                    break;
                case 3:
                    Functions.printByInterval(array, read);
                    break;
                case 4:
                    Functions.printByDebt(array);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Wrong option, please try again..." + "\n\n" + menu);
            }
        }
    }

    public static void createArray(ArrayList<Customer> array, Scanner read) {
        int count = 0;

        while (true) {
            array.add(new Customer());
            System.out.println((count+1) + ". Name: ");
            array.get(count).setName(read.next());
            if (array.get(count).getName().equals("0")) {
                return;
            }
            System.out.println("Surname: ");
            array.get(count).setSurname(read.next());
            System.out.println("Middle Name: ");
            array.get(count).setMiddleName(read.next());
            System.out.println("ID: ");
            array.get(count).setId(read.nextInt());
            System.out.println("Address: ");
            array.get(count).setAdress(read.next());
            System.out.println("Card number: ");
            array.get(count).setCardnum(read.nextLong());
            System.out.println("Balance: ");
            array.get(count).setBalance(read.nextInt());
            count++;
        }
    }
}
