public class controlFlowStatements {
    public static void main(String[] args) {
        int x = 21;
        int i = 0;
        int f = 0;
        int g = 0;

        //if statement
        if (x < 10) {
            System.out.println(x);
        } else {
            x = 11;
            System.out.println(x);
        }

        //switch statement
        switch (x) {
            case 0:
                System.out.println(0);
                break;

            case 10:
                System.out.println("x is 10");
                break;

            default:
                System.out.println("x is not 0 or 10");
        }

        //for loop
        for (i = 0; i < 3; i++) {
            System.out.println(x);
        }

        //while loop
        while (f < 3) {
            System.out.println(x + 1);
            f += 1;
        }

        //do while loop
        
        do {
            System.out.println(x + 2);
            g += 1;
        } while (g < 3);
    }
}