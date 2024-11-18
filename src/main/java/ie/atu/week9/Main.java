package ie.atu.week9;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scan.nextLine();
        System.out.println("please enter your address");
        String address = scan.nextLine();
        System.out.println("please enter your phone");
        String phone = scan.nextLine();
        System.out.println("please enter your customer number");
        String custNumber = scan.nextLine();
        System.out.println("Do you want mailing list");
        boolean list = scan. hasNextBoolean();
        Customer newCust = new Customer(name, address, phone, custNumber , list);
        System.out.println("you entered " + newCust.toString());

        }
    }
