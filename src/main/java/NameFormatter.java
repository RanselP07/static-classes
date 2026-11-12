import java.util.Scanner;

public class NameFormatter {

    private String firstName;
    private String lastName;

    private NameFormatter() {}

    public static String format(String firstName, String lastName) {
        String fullName = "";

        if (firstName.isBlank() || lastName.isBlank()) {
            System.err.println("You did not enter a first or last name!");
        } else {
            fullName = lastName + ", ";
            Scanner myScanner = new Scanner(System.in);

            System.out.println("Enter the info that is applicable to you.");

            System.out.print("Prefix: ");
            String prefix = myScanner.nextLine();

            System.out.print("Middle name: ");
            String middleName = myScanner.nextLine();

            System.out.print("Suffix: ");
            String suffix = myScanner.nextLine();


            if (prefix != null && !prefix.isBlank()) {
                fullName += prefix.trim() + " " + firstName.trim();
            } else {
                fullName += firstName.trim();
            }

            if(middleName != null && !middleName.isBlank()){
                fullName += " " + middleName.trim();
            }

            if (suffix != null && !suffix.isBlank()){
                fullName += ", " + suffix.trim();
            }
        }
        return fullName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        String fullName = "";

        if(firstName.isBlank() || lastName.isBlank()){
            System.err.println("You did not enter a first or last name!");
        }else {

            fullName = lastName + ", ";

            if (!prefix.isBlank()) {
                fullName += prefix.trim() + " " + firstName.trim();
            } else {
                fullName += firstName.trim();
            }

            if (!middleName.isBlank()) {
                fullName += " " + middleName.trim();
            }
            if (!suffix.isBlank()) {
                fullName += ", " + suffix.trim();
            }
        }

        return fullName;
    }

    public static String format(String fullName){
        if (fullName.isBlank()){
            System.err.println("I need a name");
        }
        return fullName;
    }
}
