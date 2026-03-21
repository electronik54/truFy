package mar11;

public class Main {
    public static void main(String[] args) {

        // + - * / %

        int firstNum = 5;
        int secondNum = 19;

        int addition = firstNum + secondNum;
        System.out.println("Add:"+addition);

        int substraction = firstNum - secondNum;
        System.out.println("sub:" + substraction);

        int multiplication = firstNum * secondNum;
        System.out.println("multi:" + multiplication);

        int division = secondNum / firstNum;
        System.out.println("div:" + division);

        int mod =  secondNum % firstNum;
        System.out.println("mod:" + mod);


        // += -=
        System.out.println("------------");
        System.out.println("first_Num:"+firstNum);
        firstNum = firstNum + 1;
        System.out.println("firstNum=firstNum+1 :" + firstNum);

        System.out.println();
        System.out.println("------------");
        System.out.println("(2) firstNum: " + firstNum);
        firstNum += 1;
        System.out.println("firstNum +=1 :" + firstNum);

        System.out.println();
        System.out.println("------------");
        System.out.println("(3) firstNum: " + firstNum);
        firstNum++;
        System.out.println("firstNum++ :" + firstNum);



//        int[] arrAge =  new int[]{12,20,34,45,56,67};
//
//        for(int age : arrAge){
//            System.out.println("Age: " + age);
//        }
//
//        System.out.println("My age is" + arrAge[3]);

    }
}
