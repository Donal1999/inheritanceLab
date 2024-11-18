package ie.atu.week9;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scan.nextLine();
        System.out.println("please enter your address");
        String address = scan.nextLine();
        System.out.println("please enter your phone");
        String phone = scan.nextLine();
        System.out.println("please enter your customer number");
        String custNumber = scan.nextLine();
        System.out.println("Do you want mailing list");
        boolean list = scan. hasNextBoolean();*/

        PreferredCustomer preferredCustomer = new PreferredCustomer();
        preferredCustomer.setName("Donal");
        preferredCustomer.setAddress("ATU");
        preferredCustomer.setPhone("08723243");
        preferredCustomer.setCustNumber("1002");
        preferredCustomer.setMailingList(false);
        preferredCustomer.setLoyaltyPoints(700);
        preferredCustomer.setDiscount();
        System.out.println(preferredCustomer);// calls preferred customer class displays info





        }
    }
