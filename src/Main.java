import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userInput;
        String[] inputTokens;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your desired operation : ");
        userInput = scan.nextLine().trim();
        inputTokens = userInput.split(" ");

        switch(inputTokens.length) {

            case 3:
                TwoNumberOp twoNumberOperation = new TwoNumberOp();
                twoNumberOperation.compute(inputTokens[0], inputTokens[1] ,inputTokens[2]);
                break;
            case 5:
                ThreeNumberOp threeNumberOp = new ThreeNumberOp();
                threeNumberOp.compute(inputTokens[0], inputTokens[1] ,inputTokens[2],inputTokens[3] ,inputTokens[4]);
                break;
            default:
                Xceptions wrongString = new Xceptions();
                wrongString.string_not_match();
        }

    }

}
