import java.util.Scanner;

public class NumberSlicer {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
            System.out.println("Enter number to slice here: ");
        int quotient = scan.nextInt();
        System.out.println("Slice by how many? Insert here: ");
        int divider = scan.nextInt();
       int Dividend = quotient / divider;
        System.out.println(Dividend);



    }


}
