package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import java.util.Scanner;
import java.io.File;

/**
 * Contains:
 *         Main method which creates AddressBook object and calls the initialize function
 *         Initialize method (initAddressBookExercise) which creates 2 instances of AddressEntry object, adds them to AddressBook object collection, and calls list function to print to system out
 * @author Nick
 * @since exercise 1
 */
public class AddressBookApplication {

    public static AddressBook addbk = new AddressBook();
    /**
     * Creates instance of AddressBook object
     * Calls initAddressBookExercise to initialize created instance of AddressBook object
     * @param ab - address book being initialized
     * @since exercise 1
     * @return void
     */
    public static void initAddressBookExercise(AddressBook ab) {
//        AddressEntry ae1 = new AddressEntry();
//
//        AddressEntry ae2 = new AddressEntry("Test First Name", "Test Last Name", "Test Street", "Test City", "Test State", "Test Zip", "Test Phone", "Test Email");
//
//        ab.add(ae1);
//        ab.add(ae2);

    }

    /**
     * Creates new AddressBook object instance
     * Calls display menu method to display menu options and prompts user input to decide which menu option to call
     * Calls user inputted menu option
     * Loops as long as user doesn't enter option 6
     * @param args
     * @since exercise 1
     * @return void
     */
    public static void main(String[] args) {

        initAddressBookExercise(addbk);

        Boolean loop = false;
        while (loop == false) {

            Menu.displayMenu();

            Scanner scnr = new Scanner(System.in);
            int user_choice = scnr.nextInt();

            if (user_choice == 1) {
                Menu.menu_choice1();
            }

            if (user_choice == 2) {
                Menu.menu_choice2();
            }

            if (user_choice == 3) {
                Menu.menu_choice3();
            }

            if (user_choice == 4) {
                Menu.menu_choice4();
            }

            if (user_choice == 5) {
                Menu.menu_choice5();
            }

            if (user_choice == 6) {
                Menu.menu_choice6();
                loop = true;
            }
        }
    }
}
