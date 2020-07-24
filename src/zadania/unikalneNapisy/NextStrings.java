package zadania.unikalneNapisy;

import java.util.Scanner;

class NextStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start");
        String previous = scanner.nextLine();
        do {
            String next = scanner.nextLine();
            if (previous.equals(next))
                break;
            previous = next;
        } while (true);
        System.out.println("Stop");
    }
}
