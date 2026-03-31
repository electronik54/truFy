package march28;

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


        //HOMEWORK: REVERSE THE CONTENTS ON THE STRING WITHOUT CREATING ANOTHER STRING
//RESULT: Students={tapu,vini,bharti,trupti,nikhil}
        String[] students = new String[]{"nikhil", "trupti", "bharti", "vini", "tapu"};

        //FOR - to reverse the content
        for (int list = students.length - 1; list >= 0; list--) {
            System.out.println("Reverse Students " + students[list]);
        }

        //FOR - to print the content
        for (String student : students) {
            System.out.println(student);
        }





    }
}
