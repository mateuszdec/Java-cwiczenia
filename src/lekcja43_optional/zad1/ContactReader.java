package lekcja43_optional.zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Optional;
import java.util.Scanner;

public class ContactReader {
    static Optional<ContactManager> readFile(String fileName) {
        ContactManager contactManager = null;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            contactManager = new ContactManager();
            while (scanner.hasNextLine()) {
                Contact contact = createContactFromText(scanner.nextLine());
                contactManager.addContact(contact);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku o nazwie " + fileName);
        }
        return Optional.ofNullable(contactManager);
    }

    private static Contact createContactFromText(String text) {
        String[] data = text.split(";");
        return new Contact(data[0], data[1], data[2], data[3]);
    }
}
