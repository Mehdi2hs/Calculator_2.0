public class Xceptions {

    Xceptions() {

    }

    void numbers_not_in_range() {

        System.out.println("\nOne or more numbers in your operation do not match the expected input." +
                           "\nOnly integers ranging from 1 to 10 are accepted : ");
        System.out.println("\nExiting application...");
        System.exit(0);
    }


    void string_not_match() {

        System.out.println("\nThe operation you entered does not match the expected input." +
                           "\nPlease make sure your operation is in the right format : " +
                           "\n--> This calculator can perform operations with 2 or 3 numbers only. " +
                           "\n--> Do not forget to space your numbers and operators : a + b, a / b , a - b * c ...");
        System.out.println("\nExiting application...");
        System.exit(0);

    }

    void wrong_operator() {

            System.out.println("\nAn exception occurred : The operator you entered is invalid, please enter + , - , * or / ");
            System.out.println("\nExiting application...");
            System.exit(0);

    }

}
