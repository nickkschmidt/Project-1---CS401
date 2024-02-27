package address.data;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;


import address.AddressBookApplication;
import address.data.AddressEntry;

/**
 * Contains:
 *         instance of AddressEntryList object collection and instances of individual objects
 *         list method which prints contents to system out
 *         add method which adds new objects to object collection
 * @author Nick
 * @since exercise 1
 */
public class AddressBook {

    /**
     * Creates instance of AddressEntryList object collection
     * @since exercise 1
     */
    public ArrayList<AddressEntry> AddressEntryList = new ArrayList<AddressEntry>(10);

    /**
     * Creates individual instances of AddressEntryList objects
     * @since exercise 1
     */
    public AddressBook() {
    }

    /**
     * Prints contents of AddressEntryList to system out
     * @since exercise 1
     */
    public void list() {
        for (int i = 0; i < AddressEntryList.size(); i++) {
        System.out.println(AddressEntryList.get(i).toString());
        }
        AddressEntry.iter = 1;
    }

    /**
     * Adds new AddressEntry to AddressEntryList object collection
     * @since exercise 1
     * @param ae
     */
    public void add(AddressEntry ae) {
        AddressEntryList.add(ae);
        AddressEntry.iter = 1;
    }


    /**
     * Removes AddressEntry from AddressBook based on Last Name inputted
     * @since exercise 3
     * @param ln
     */
    public void remove(String ln) {
        for (int i = 0; i < AddressEntryList.size(); i++) {
            if (Objects.equals(ln, AddressEntryList.get(i).lastName)) {
                AddressEntryList.remove(i);
            }
        }
        AddressEntry.iter = 1;
    }

    /**
     * Searches for and prints AddressEntry from AddressBook based on Last Name inputted
     * @since exercise 3
     * @param ln
     */
    public void find(String ln) {
        System.out.println(" ");
        for (int i = 0; i < AddressEntryList.size(); i++) {
            if (Objects.equals(ln, AddressEntryList.get(i).lastName)) {
                System.out.println(AddressEntryList.get(i).toString());
            }
        }
        AddressEntry.iter = 1;
    }

    /**
     * Reads AddressEntry data from file and adds these Entries to AddressBook
     * @since exercise 3
     * @param fn
     */
    public void read(String fn) {
        System.out.println(" ");
        AddressEntry ae = new AddressEntry();
        File file = new File(fn);
//        System.out.println(new File().getAbsolutePath());
//        Scanner scnr = new Scanner(file);
        Scanner scnr = new Scanner(fn);
        scnr.useDelimiter(",");
        while (scnr.hasNext()) {
//            ae.setFirstName(scnr.next());
//            ae.setLastName(scnr.next());
//            ae.setStreet(scnr.next());
//            ae.setCity(scnr.next());
//            ae.setState(scnr.next());
//            ae.setZip(scnr.next());
//            ae.setPhone(scnr.next());
//            ae.setEmail(scnr.next());
            AddressEntryList.add(ae);
        }
        AddressEntry.iter = 1;
    }
}
