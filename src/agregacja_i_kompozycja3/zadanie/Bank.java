package agregacja_i_kompozycja3.zadanie;

public class Bank {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "98971234569";

        Address address1 = new Address();
        address1.city = "Wrocław";
        address1.street = "Piękna";
        address1.homeNumber = 120;
        address1.flatNumber = 12;
        address1.codePost = "50-123";

        person1.livingAddress = address1;
        person1.registeredAddress = address1;

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 20000;

        Person person2 = new Person();
        person2.firstName = "Marta";
        person2.lastName = "Kowalska";
        person2.pesel = "91070645628";
        person2.registeredAddress = new Address();
        person2.registeredAddress.city = "Kraków";
        person2.registeredAddress.codePost = "30-333";
        person2.registeredAddress.street = "Mickiewicza";
        person2.registeredAddress.homeNumber = 15;
        person2.registeredAddress.flatNumber = 8;
        person2.livingAddress = address1;

        //drugie konto bankowe
        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5_000;

        System.out.println("Osoba 1:");
        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.println("mieszka w miejscowości: " + person1.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);

        System.out.println("Osoba 2:");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("mieszka w miejscowości: " + person2.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);


        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 2000;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.05;
        credit1.termMonts = 12;

        System.out.println("Osoba " );
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("posiada konto bankowe z kwotą " + account1.balance);
        System.out.println("Oraz kredyt na kwotę " + credit1.cashBorrowed);
    }
}
