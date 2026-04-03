package April2;

public class execution {
    public static void main(String[] args) {
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");

        int a = 1;
        int b = 2;
        if (a == b) {
            System.out.println("equal");
        } else {
            System.out.println("a is not equal to b");
        }

        do {
            System.out.println("looping");
            a++;
            System.out.println(a + "a");
        }
        while (a > b);

    }
}

