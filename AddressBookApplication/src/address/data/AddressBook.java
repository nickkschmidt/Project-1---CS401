package address.data;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;


import address.AddressBookApplication;

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
    public int cnt = 0;
    public int index = 0;
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
     */
    public void remove() {
        cnt = 0;
        Scanner scnr = new Scanner(System.in);
        AddressBookApplication.addbk.find();
        int ln;
        System.out.println("Enter the Entry # You Would Like to Delete: ");
//        System.out.println(cnt);
        ln = scnr.nextInt();
        for (int i = 0; i < AddressEntryList.size(); i++) {
            if (index == i) AddressEntryList.remove(i);
        }
        AddressEntry.iter = 1;
    }

    /**
     * Searches for and prints AddressEntry from AddressBook based on Last Name inputted
     * @since exercise 3
     */
    public int find() {
        cnt = 0;
        Scanner scnr = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter the Last Name of the Address Entry: ");
        String ln;
        ln = scnr.nextLine();
        for (int i = 0; i < AddressEntryList.size(); i++) {
            if (Objects.equals((ln), AddressEntryList.get(i).lastName)) {
                System.out.println(AddressEntryList.get(i).toString());
                cnt++;
                index = i;
            }
        }
        AddressEntry.iter = 1;
        return cnt;
    }

    /**
     * Reads AddressEntry data from file and adds these Entries to AddressBook
     * @since exercise 3
     * @param fn
     */
    public void read(String fn) {
        System.out.println(" ");
        File txt = new File(fn);
//        System.out.println(txt.exists());
        Scanner scnr = new Scanner(fn);
        scnr.useDelimiter(",");
        try {
            scnr = new Scanner(txt, StandardCharsets.UTF_8);
            while (scnr.hasNext()) {
                AddressEntry ae = new AddressEntry();
                ae.setFirstName(scnr.next().replace(",", ""));
                ae.setLastName(scnr.next().replace(",", ""));
                ae.setStreet(scnr.next().replace(",", ""));
                ae.setCity(scnr.next().replace(",", ""));
                ae.setState(scnr.next().replace(",", ""));
                ae.setZip(scnr.next().replace(",", ""));
                ae.setPhone(scnr.next().replace(",", ""));
                ae.setEmail(scnr.next().replace(",", ""));
                AddressEntryList.add(ae);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        AddressEntry.iter = 1;
    }
}
