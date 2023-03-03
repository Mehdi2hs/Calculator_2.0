public class TwoNumberOp {

    int a;
    int b;
    char operator;
    double result;

    TwoNumberOp() {
    }

     public void compute(String token0, String token1, String token2) {
        try {
            a = Integer.parseInt(token0);
        }
        catch(NumberFormatException nfe){
            System.out.println("\nAn exception occurred: " + nfe.getMessage() + " . This is not a compatible input, please enter an integer.");
            System.out.println("\nExiting application");
            System.exit(0);
        }
        try {
            b = Integer.parseInt(token2);
        }
        catch(NumberFormatException nfe){
            System.out.println("\nAn exception occurred: " + nfe.getMessage() + " . This is not a compatible input, please enter an integer.");
            System.out.println("\nExiting application...");
            System.exit(0);
        }

        verify(a);
        verify(b);

        operator = token1.charAt(0);
        switch (operator) {

            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = (double) a / (double) b; break;
            default: {
                Xceptions wrongOperator = new Xceptions();
                wrongOperator.wrong_operator();
            }
        }
        System.out.println("\nThe result of your operation is : " + result);
    }

    public static void verify(int number) {
        if(number < 1 || number > 10){
            Xceptions numberNotInRange = new Xceptions();
            numberNotInRange.numbers_not_in_range();

        }
    }

}