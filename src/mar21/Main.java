package mar21;

public class Main {
    public static void main(String[] args) {
        String list = "sugar, salt, tea";
        String[] arrList = list.split(",");

        String[] arrlist2 = new String[3];
        arrlist2[0] = "sugar";
        arrlist2[1] = "salt";
        arrlist2[2] = "tea";

        String[] arrlist3 = new String[]{"sugar", "salt", "tea"};

        // = + - ++ -- | Arithmetic operation
        //> < == >= <= | COMPARISON OPERATORS
        int a = 100;
        if (a >= 100) {
            System.out.println("a is greater or equal than 100");
        } else {
            System.out.println("WE are in else");
        }

        // &&-(AND) ||-(OR) !-(NOT)    LOGICAL OPERATOR
        /*
        T   N
        1   1   > AND=1   OR=1
        1   0   > AND=0   OR=1
        0   1   > AND=0   OR=1
        0   0   > AND=0   OR=0

        0   > NOT=1
        1   > NOT=0
        */

        boolean truptisDecision;
        boolean nikhilsDecision;
        boolean buttersDecision;
        int questionCount = 1;

        System.out.println("QUESTION(" + questionCount + "): IS JAVA EASY?");
        truptisDecision = false;
        nikhilsDecision = true;
        System.out.println("ANSWER(" + questionCount + "):" + (truptisDecision && nikhilsDecision));
        questionCount++;
        System.out.println();

        System.out.println("QUESTION(" + questionCount + "): CAN TRUPTI GO TO DHANU FESTIVAL?");
        truptisDecision = true;
        nikhilsDecision = false;
        System.out.println("ANSWER(" + questionCount + "):" + (truptisDecision && nikhilsDecision));
        questionCount++;
        System.out.println();

        System.out.println("QUESTION(" + questionCount + "): NOT TO ALLOW BUTTER IN OUR ROOM?");
        truptisDecision = false;
        nikhilsDecision = false;
        buttersDecision = true;
        System.out.println("ANSWER(" + questionCount + "):" + (truptisDecision || nikhilsDecision || buttersDecision));
        questionCount++;
        System.out.println();

        System.out.println("QUESTION(" + questionCount + "): OPERATE BANK ACCOUNT?");
        truptisDecision = true;
        nikhilsDecision = false;
        System.out.println("ANSWER(" + questionCount + "):" + (truptisDecision || nikhilsDecision));
        questionCount++;
        System.out.println();

        System.out.println("QUESTION(" + questionCount + "): IS TRUPTI HUNGRY?");
        truptisDecision = true;
        System.out.println("ANSWER(" + questionCount + "):" + (truptisDecision));
        questionCount++;
        System.out.println();

        System.out.println("QUESTION(" + questionCount + "): LETS DO JAVA AFTER DINNER?");
        truptisDecision = true;
        nikhilsDecision = true;
        System.out.println("ANSWER(" + questionCount + "):" + (truptisDecision && nikhilsDecision));
        System.out.println("BUTTERS ANSWER(" + questionCount + "):" + !(truptisDecision && nikhilsDecision));
        questionCount++;
        System.out.println();

        //camalcasing
        int moneyIsTruptisWallet=1000;
    }
}
