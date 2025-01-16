// Addition of Two Numbers                                            User Define Program

import java.util.Scanner;                                   //Imported scanner class which we can use in program. which takes the input from user 
public class AdditionUserDefine                                  // class (File Name)
{                                                                //Starting of Class
    public static void main(String[] args)                       // main Function
    {                                                            // Starting of main Function          Starts Compilation here
        Scanner scanner=new Scanner(System.in);                  // created a Scanner object to read input
        int a,b,c;                                               // Int is Datatype which stores Integer values in a,b and c Variables
        System.out.println("Enter Any Two Numbers:");          //S.O.P which print the statement
        a=scanner.nextInt();                                     //Takes A's Integer Value from user 
        b=scanner.nextInt();                                     //Takes B's Integer Value from user
        c=a+b;                                                   //Addition Expression where a and b values add and stores in C
        System.out.println();                                   // this taken for One line Space between User input and answer
        System.out.println(c);                                   //S.O.P print the Value of C
        System.out.println("Sum="+c);                            // for output   Sum=(answer)
        System.out.println(a+"+"+b+"="+c);                       // Output  a+b=c
    }                                                            //End of Main Function                End Compilation here
}                                                               // End of Class 
      




