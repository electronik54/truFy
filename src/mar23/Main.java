package mar23;

public class Main {
    public static void main(String[] args) {

        String firstName = "Nikhil";
        String secondName = "Trupti";

        String temporaryName;

        temporaryName = firstName;
        firstName = secondName;
        secondName = temporaryName;


        System.out.println("firstName:" + firstName);
        System.out.println("secondName:" + secondName);
        /*
        firstName = Trupti
        secondName = Nikhil
         */

    }
}
