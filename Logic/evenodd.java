/* 
 * Finding whether the inputted number is Even or Odd
*/

import java.util.*;

public class evenodd {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        if(n%2 == 0) {
            System.out.println(n+" is an Even number.");
        } else {
            System.out.println(n+" is an Odd number");
        }

    }
}
