package lekcja4_metody_i_konstruktory.metody;

public class Computer {
    String processor;
    int memory;

    void printInfo() {
        System.out.println(processor + " " + memory);
    }

    String getInfo() {
        String description = processor + " " + memory;
        return description;

        //lub
//        return processor + " " + memory;
    }
}
