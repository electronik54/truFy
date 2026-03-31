package march30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("WHAT IS YOUR NAME?");
        String name = sc.nextLine();
        System.out.println("HELLO " + name);





        String firstName = "Nikhil";
        boolean isTruptiFemale = true;
        boolean isNikhilFemale = false;
        //gender : m OR f
        char gender = 'm';
        int age = 32;
        int yearOfBirth = 1990;
        float height = 20.0123456789f;
        double salary = 2000.012345678911121314;


        //ARITHMETIC OPS : + = - ++ -- * / %
        int result = yearOfBirth / age;
        System.out.println("result(yearOfBirth / age):" + result);

        result = yearOfBirth % age;
        System.out.println("result(yearOfBirth % age):" + result);

        //COMPARISON OPS : > < == >= <=
        boolean result2 = age == yearOfBirth;
        System.out.println("result2(age == yearOfBirth):" + result2);

        //LOGICAL OPERATORS &&(and) !(not) ||(or)
        // is age > yearofbirth AND is salary == height

        boolean ageYobComparison = age < yearOfBirth;
        boolean salHeightComparison = salary > height;
        boolean finalComparison = ageYobComparison && salHeightComparison;
        System.out.println("finalComparison: " + finalComparison);

        //CONDITION STATEMENTS (if(else), while/do-while)
        //print "category1" if salary > 1000 AND age > 25
        //print "category2" if salary > 2000 AND age > 30
        //print "category3" if salary > 3000 AND age > 35
        //print "category0" for other

        if (salary > 1000 && age > 25) {
            System.out.println("category1");
        } else if (salary > 2000 && age > 30) {
            System.out.println("category2");
        } else if (salary > 3000 && age > 35) {
            System.out.println("category3");
        } else {
            System.out.println("category0");
        }


        salary = 8000;
        System.out.println();
        System.out.println("------------------------------------------------");
        //while salary < 6000 -> Add salary by 1000
        while (salary < 6000) {

            System.out.println("CURRENT SALARY IS " + salary);
            System.out.println("ADD ADDITION AMOUNT:");
            int addSalary = sc.nextInt();

            salary = salary + addSalary; // OR salary += 1000;
            System.out.println("NEW SALARY IS " + salary);
            System.out.println("------------------------------------------------");
            System.out.println();

        }
//        char continueLoop = 'y';
//        while (continueLoop == 'y') {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("CONTINUE? [y]>YES [ELSE]>NO");
//            continueLoop = scan.nextLine().charAt(0);
//        }

        salary = 15000;
        System.out.println();
        System.out.println("----DO-WHILE---------DO-WHILE---------DO-WHILE----");
        do{

            System.out.println("CURRENT SALARY IS " + salary);
            System.out.println("ADD ADDITION AMOUNT:");
            int addSalary = sc.nextInt();

            salary = salary + addSalary; // OR salary += 1000;
            System.out.println("NEW SALARY IS " + salary);
            System.out.println("------------------------------------------------");
            System.out.println();

        }while(salary < 12000);

    }
}
