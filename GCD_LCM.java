//Gcd and lcm_of_two_number 
import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1=sc.nextInt();
         System.out.print("Enter the 2nd  number: ");
        int n2=sc.nextInt();int big,small;
        if(n1>n2)
        {
            big=n1;
            small=n2;
        }
       else
        {
           big=n2;
            small=n1; 
        }
        int rem=big%small;
        while(rem!=0)
        {
            big=small;
            small=rem;
            rem=big%small;
        }
        int lcm=(n1*n2)/small;
        System.out.println("Gcd of " +n1+ " and " +n2+ " is " +small);
        System.out.println("Lcm of " +n1+ " and " +n2+ " is " +lcm);
    }
}
