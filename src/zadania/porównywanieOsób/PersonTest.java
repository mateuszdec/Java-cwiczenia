package zadania.porównywanieOsób;

class PersonTest {
    public static void main(String[] args) {
        Address address1 = new Address("Wrocław", "50-555", "62", "13");
        Address address2 = new Address("Wrocław", "50-555", "62", "13");
        Person person1 = new Person("Jan", "Kowalski", "123456789", 22, address1);
        Person person2 = new Person("Jan", "Kowalski", "123456789", 22, address2);
        Person person3 = new Person("Marta", "Zawadzka", "987654321", 20, address1);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        printCompareInfo(person1, person2, "person1", "person2");
        printCompareInfo(person1, person3, "person1", "person3");
        printCompareInfo(person1, person3, "person2", "person3");

    }

    private static void printCompareInfo(Person person1, Person person2, String s1, String s2) {
        if (person1.equals(person2)) {
            System.out.printf("%s jest równe %s\n", s1, s2);
        } else {
            System.out.printf("%s jest różne od %s\n", s1, s2);
        }
    }
}
