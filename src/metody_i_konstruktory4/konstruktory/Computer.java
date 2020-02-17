package metody_i_konstruktory4.konstruktory;

public class Computer {

    String processor;
    int memory;

    Computer(String proc, int m) {
        processor = proc;
        memory = m;
    }

    void printInfo() {
        System.out.println(processor + " " + memory);
    }
}
