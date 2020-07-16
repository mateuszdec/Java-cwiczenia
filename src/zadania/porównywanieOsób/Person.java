package zadania.porównywanieOsób;

import java.util.Objects;

class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private int age;
    private Address address;

    public Person(String firstName, String lastName, String pesel, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
        this.address = address;
    }

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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(pesel, person.pesel) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel, age, address);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", pesel: " + pesel + ", wiek: " + age;
    }
}
