import java.util.Scanner;

public class AverageNumber {

    public static void main (String[]args ){
    int num1;
    int num2;
    int num3;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter first num:");
    num1 = input.nextInt();

    System.out.println("Enter second num:");
    num2 = input.nextInt();

    System.out.println("Enter third num:");
    num3 = input.nextInt();

    int answer1;
    int answer2;

 answer1 = num1 + (num2 + num3);
 answer2 = answer1 / 3;

System.out.println(answer2);


    }
}
