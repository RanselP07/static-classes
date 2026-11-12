import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        String name1 = NameFormatter.format("Mel", "Johnson");
        System.out.println(name1);

        String name2 = NameFormatter.format("Dr.", "Mel",  "B",  "Johnson", "PhD");
        System.out.println(name2);

        String name3 = NameFormatter.format("Dr. Mel B Johnson, PhD");
        System.out.println(name3);

    }
}
