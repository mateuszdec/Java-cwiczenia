package lekcja4_metody_i_konstruktory.konstruktory;


public class CompuetrStore {
    public static void main(String[] args) {

        Computer comp1 = new Computer("Intel i5", 8192);
//        comp1.processor = "Intel i5";
//        comp1.memory = 8192;

//        Computer comp2 = new Computer();

        comp1.printInfo();
    }
}
