import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Calculator v1.0");
        Scanner scanner = new Scanner(System.in);
        String[] input;
        do{
            System.out.println("Input a command");

            int i = 0;
            String inputString = scanner.nextLine();
            input = inputString.split(" ");
            int answer = 0;

            int number1 = 0;
            if(input.length > 1){
               number1 = Integer.parseInt(input[1]);
            }
            int number2 = 0;
            if(input.length > 2){
                number2 = Integer.parseInt(input[2]);
            }

            switch (input[0]){
                case "add":
                    answer = calculator.add(number1, number2);
                    break;
                case "subtract":
                    answer = calculator.subtract(number1, number2);

                    break;
                case "multiply":
                    answer = calculator.multiply(number1, number2);

                    break;
                case "divide":
                    answer = calculator.divide(number1, number2);

                    break;
                case "fibonacci":
                    answer = calculator.fibonacciNumberFinder(number1);

                    break;
                case "binary":
                    answer = Integer.parseInt(calculator.intToBinaryNumber(number1));

                    break;
                case "quit":
                    return;
                default:

                    break;
            }
            System.out.println(answer);

        }while(true);

    }


}
