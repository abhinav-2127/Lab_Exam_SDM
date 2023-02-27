<<<<<<< HEAD

//Java Program to find the Factorial of a Number

import java.util.*;

public class Factorial
{
     public static void main(String []args)
     {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Enter the number: ");

        int num = scanner.nextInt();

        int i=1, fact=1;

        while(i<=num)
        {
            fact=fact*i;
            i++;
        } 

        System.out.println("\n Factorial of the number: " + fact);  
     }   
=======

//Java Program to find the Factorial of a Number

import java.util.*;

public class Factorial
{
     public static void main(String []args)
     {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Enter the number: ");

        int num = scanner.nextInt();

        int i=1, fact=1;

        while(i<=num)
        {
            fact=fact*i;
            i++;
        } 

        System.out.println("\n Factorial of the number: " + fact);  
     }   
>>>>>>> 3bc91eff8ae9b19b3350140c87e94ac17f33d682
}