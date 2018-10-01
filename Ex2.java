import java.util.*;

public class Ex2 {
    public static void main(String args []){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the size of the array");

        int size = scanner.nextInt();
        int aray1 [] = new int [size];
        int aray2 [] = new int [size];
        int result [] = new int [size];
        System.out.println("Give me " +size+ " numbers " );

        for(int i = 0; i < aray1.length; i++){
            aray1[i] = scanner.nextInt();
        }
        System.out.println("Give me more " +size+ " numbers ");

        for(int i = 0; i < aray2.length; i++){
            aray2[i] = scanner.nextInt();
        }

        for(int i = 0; i < result.length; i++){
            result[i] = aray1[i] + aray2[i];
        }
        System.out.println("result " + Arrays.toString(result));
    }
}