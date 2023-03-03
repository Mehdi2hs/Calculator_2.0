public class ThreeNumberOp {

    int a;
    int b;
    int c;
    char operator1;
    char operator2;
    double result;

    ThreeNumberOp() {
    }

    public void compute(String token0, String token1, String token2, String token3, String token4) {
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
        try {
            c = Integer.parseInt(token4);
        }
        catch(NumberFormatException nfe){
            System.out.println("\nAn exception occurred: " + nfe.getMessage() + " . This is not a compatible input, please enter an integer");
            System.out.println("\nExiting application");
            System.exit(0);
        }

        verify(a);
        verify(b);
        verify(c);

        operator1 = token1.charAt(0);
        operator2 = token3.charAt(0);

        if(operator1=='+') {

            switch (operator2) {
                case '+': result = a + b + c; break;
                case '-': result = a + b - c; break;
                case '*': result = a + b * c; break;
                case '/': result = (double) a + (double) b / (double) c; break;
                default: {
                    Xceptions wrongOperator = new Xceptions();
                    wrongOperator.wrong_operator();
                }
            }
        }

        else if (operator1=='-') {

            switch (operator2) {
                case '+': result = a - b + c; break;
                case '-': result = a - b - c; break;
                case '*': result = a - b * c; break;
                case '/': result = (double) a - (double) b / (double) c; break;
                default: {
                    Xceptions wrongOperator = new Xceptions();
                    wrongOperator.wrong_operator();
                }
            }
        }

        else if (operator1=='*') {

            switch (operator2) {
                case '+': result = a * b + c; break;
                case '-': result = a * b - c; break;
                case '*': result = a * b * c; break;
                case '/': result = (double) a * (double) b / (double) c; break;
                default: {
                    Xceptions wrongOperator = new Xceptions();
                    wrongOperator.wrong_operator();
                }
            }
        }

        else if (operator1=='/') {

            switch (operator2) {
                case '+': result = (double) a / (double) b + (double) c; break;
                case '-': result = (double) a / (double) b - (double) c; break;
                case '*': result = (double) a / (double) b * (double) c; break;
                case '/': result = (double) a / (double) b / (double) c; break;
                default: {
                    Xceptions wrongOperator = new Xceptions();
                    wrongOperator.wrong_operator();
                }
            }
        }

        else {
            Xceptions wrongOperator = new Xceptions();
            wrongOperator.wrong_operator();
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