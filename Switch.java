import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter First number : ");
        double firstNumber = input.nextDouble();
        System.out.printf("Enter Second number : ");
        double secondNumber = input.nextDouble();
        System.out.printf("choose an operation you want to perform : %n1. Add ( + )%n2. Subtract ( - )%n3. Multiply ( * )%n4. Divide ( / )%n%nYour choice : ");
        String operation = input.next();

        if(operation.equals("1") || operation.equals("+")){
            operation = "add";
        }
        else if(operation.equals("2") || operation.equals("-")){
            operation = "subtract";
        }
        else if(operation.equals("3") || operation.equals("*")){
            operation = "multiply";
        }
        else if(operation.equals("4") || operation.equals("/")){
            operation = "divide";
        }

        switch(operation.toLowerCase()){
            case "add":{
                Double result = firstNumber + secondNumber;
                System.out.printf("Sum = %f",result);
                break;
            }

            case "subtract": {
                Double result = firstNumber - secondNumber;
                System.out.printf("Difference = %f", result);
                break;
            }

            case "multiply": {
                Double result = firstNumber * secondNumber;
                System.out.printf("Multiplication = %f", result);
                break;
            }

            case "divide": {
                Double result = firstNumber / secondNumber;
                System.out.printf("Division = %f", result);
                break;
            }

            default:
                System.out.printf("Invalid operator");

        }//end switch
    }//end main
}//end class
