public class PatternNumber {
    public static void main(String[] args) {

        // ------------------- triangle Fibonacci
        // ------------------------------------------------
        System.err.println();
        int num1 = 0, num2 = 1, temp = 0;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print( num1+"   ");
                temp = num1;
                num1 = num2;
                num2 = temp + num2;
            }
            System.out.println();
        }

    }

}
