package address.data;

import address.AddressBookApplication;

/**
 * Contains all attributes for an AddressEntry object
 * Contains all getters and setters for AddressEntry objects
 * @author Nick
 * @since exercise 1
 */
public class AddressEntry {
    /**
     * Data attributes for each AddressEntry object
     */
    public String firstName;
    public String lastName;
    public String street;
    public String city;
    public String state;
    public String zip;
    public String phone;
    public String email;

    /**
     * Iterator attribute, records how many AddressEntry's are added to AddressBook
     */
    public static int iter = 1;

    /**
     * All getters and setters for attributes
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Default Constructor for AddressEntry objects
     */
    public AddressEntry() {
        setFirstName("Default First Name");
        setLastName("Default Last Name");
        setStreet("Default Street");
        setCity("Default City");
        setState("Default State");
        setZip("Default Zip");
        setPhone("Default Phone");
        setEmail("Default Email");
    }


    /**
     * Nondefault Constructor for AddressEntry objects
     * @param FN
     * @param LN
     * @param Street
     * @param City
     * @param State
     * @param Zip
     * @param Phone
     * @param Email
     */
    public AddressEntry(String FN, String LN, String Street, String City, String State, String Zip, String Phone, String Email) {
        setFirstName(FN);
        setLastName(LN);
        setStreet(Street);
        setCity(City);
        setState(State);
        setZip(Zip);
        setPhone(Phone);
        setEmail(Email);
    }


    /**
     * @return string - returns formatted list of AddressEntry attributes
     */
    public String toString() {
        String temp;
        String newline = System.getProperty("line.separator");
        temp = "Entry " + iter + " |" + newline +
                "   First Name: " + this.firstName + newline +
                "   Last Name: " + this.lastName + newline +
                "   Street: " + this.street + newline +
                "   City: " + this.city + newline +
                "   State: " + this.state + newline +
                "   Zip: " + this.zip + newline +
                "   Phone: " + this.phone + newline +
                "   Email: " + this.email + newline + newline;
        iter++;
        return temp;
    }
}
