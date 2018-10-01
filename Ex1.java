import java.util.*;

public class Ex1 {
    public static void main(String args []){
        int num1=0;
        int num2=0;
        char operator;
        double answer = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first number");
        num1=scanner.nextInt();
        System.out.println("Insert the second number");
        num2=scanner.nextInt();
        System.out.println("What will be the operation?");
        operator=scanner.next().charAt(0);

        switch (operator) {
            case '+': answer= num1 + num2;
                    break;
            case '-': answer= num1 - num2;
                    break;
            case '*': answer= num1 * num2;
                    break;
            case '/': answer= num1/num2;
                    break;
        }
        System.out.println(num1+" "+operator+" "+num2+" = "+answer);
    }
} 