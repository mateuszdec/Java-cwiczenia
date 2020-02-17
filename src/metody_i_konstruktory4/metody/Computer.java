package metody_i_konstruktory4.metody;

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
