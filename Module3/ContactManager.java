import java.util.*;

public class ContactManager {

    public static void main(String[] args) {
        HashMap<String, Contact> contacts = new HashMap<>();
        contacts.put("Ada Lovelace", new Contact("Ada Lovelace", "+1 617 555 0101"));
        contacts.put("Bob", new Contact("Bob", "987-654-3210"));
        contacts.put("Charlie", new Contact("Charlie", "555-555-5555"));
        contacts.put("David", new Contact("David", "111-222-3333"));
        contacts.put("Eve", new Contact("Eve", "444-555-6666"));

       //Use contacts.get("Ada Lovelace") to retrieve the contact.  
        if (contacts.get("Ada Lovelace") == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(contacts.get("Ada Lovelace"));
        }

        if (contacts.get("Subramani") == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(contacts.get("Bob"));
        }

        //Create an ArrayList from the HashMap’s values:  
        ArrayList<Contact> sorted = new ArrayList<>(contacts.values());
//ArrayList<Contact> sorted = new ArrayList<>(contacts.values()); 
//Sort it alphabetically by name using this one line:  
        sorted.sort((a, b) -> a.getName().compareTo(b.getName()));
//Loop through the sorted list and print each contact.
        System.out.println("print contact in sorted list below:");
        for (Contact contact : sorted) {
            System.out.println(contact);
        }   
    }


}

