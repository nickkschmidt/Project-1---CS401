package address;
import address.data.AddressEntry;
import address.data.AddressBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Contains prompts to collect user input for AddressEntry's
 * @author Nick
 * @since Exercise 1
 */
public class Menu {

    /**
     * Displays menu options and prompts user to input their decision
     */
    public static void displayMenu() {
        System.out.println(" ");
        System.out.println("Welcome to my Address Book Application.");
        System.out.println("Please select a menu choice: ");
        System.out.println("    1. Add New Address Entry.");
        System.out.println("    2. Delete Address Entry.");
        System.out.println("    3. Find Address Entry.");
        System.out.println("    4. Read Entries From File.");
        System.out.println("    5. List Entries in Alphabetical Order.");
        System.out.println("    6. Exit Application.");
        System.out.println("Enter your choice here: ");
    }

    /**
     * Creates AddressEntry instance to later add to AddressBook
     * Prompts user to enter each variable of the AddressEntry and collects this data
     * Adds newly created, user-inputted AddressEntry instance into AddressBook using the Add method
     */
    public static void menu_choice1() {
        System.out.println(" ");
        AddressEntry ae = new AddressEntry();
        ae.firstName = Menu.prompt_FirstName();
        ae.lastName = Menu.prompt_LastName();
        ae.street = Menu.prompt_Street();
        ae.city = Menu.prompt_City();
        ae.state = Menu.prompt_State();
        ae.zip = Menu.prompt_Zip();
        ae.phone = Menu.prompt_Telephone();
        ae.email = Menu.prompt_Email();
        AddressBookApplication.addbk.add(ae);
        AddressEntry.iter = 1;
    }


    /**
     * Prompts user to enter the Last name of the AddressEntry that they would like to delete
     * Calls the remove method to remove the selected AddressEntry from the AddressBook
     */
    public static void menu_choice2() {
        Scanner scnr = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter the Last Name of the address entry you would like to delete: ");
        String user_choice2 = scnr.nextLine();
        AddressBookApplication.addbk.remove(user_choice2);
        AddressEntry.iter = 1;
    }


    /**
     * Prompts the user to enter the Last name of the AddressEntry they would like to print
     * Calls the find method and passes user input in order to print each AddressEntry that matches the user-inputted last name
     */
    public static void menu_choice3() {
        Scanner scnr = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter the Last Name of the Entry you are Searching for: ");
        String user_choice3 = scnr.nextLine();
        AddressBookApplication.addbk.find(user_choice3);

    }


    /**
     * Prompts user to enter a filename which will be scanned
     * Calls read method which passes user-inputted file name and reads file
     * Each AddressEntry scanned from file is added to AddressBook
     */
    public static void menu_choice4() {
        Scanner scnr = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter the name of the file you would like to load: ");
        String user_choice4 = scnr.nextLine();
        AddressBookApplication.addbk.read(user_choice4);
    }


    /**
     * Calls list method which prints each AddressEntry in AddressBook
     */
    public static void menu_choice5() {
        System.out.println(" ");
        AddressBookApplication.addbk.list();
    }

    /**
     * Terminates application by setting loop bool to true
     */
    public static void menu_choice6() {
        System.out.println(" ");
        System.out.println("Exiting Application.");
    }


    /**
     * Each prompt asks user to enter respective data
     * Returns each respective data based on prompt
     */
    public static String prompt_FirstName() {
        String fn;
        Scanner scnr = new Scanner(System.in);
        System.out.println("First Name: ");
        fn = scnr.nextLine();
        return fn;
    }
    public static String prompt_LastName() {
        String ln;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Last Name: ");
        ln = scnr.nextLine();
        return ln;
    }
    public static String prompt_Street() {
        String strt;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Street: ");
        strt = scnr.nextLine();
        return strt;
    }
    public static String prompt_City() {
        String cty;
        Scanner scnr = new Scanner(System.in);
        System.out.println("City: ");
        cty = scnr.nextLine();
        return cty;
    }
    public static String prompt_State() {
        String stt;
        Scanner scnr = new Scanner(System.in);
        System.out.println("State: ");
        stt = scnr.nextLine();
        return stt;
    }
    public static String prompt_Zip() {
        String zip;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Zip: ");
        zip = scnr.nextLine();
        return zip;
    }
    public static String prompt_Telephone() {
        String tele;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Telephone: ");
        tele = scnr.nextLine();
        return tele;
    }
    public static String prompt_Email() {
        String eml;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Email: ");
        eml = scnr.nextLine();
        return eml;
    }
}
