
import java.util.Scanner;
public class AddSubMulDiv                              //class (File name)
{                                                                              //Starting of Class
    public static void main(String[] args)                                   //Main Function
    {                                                     //Starting of main Function                   start Compilation
        Scanner s = new Scanner(System.in);
        int a, b, c, d;                                   // int is a Datatype Which is use for Storing the Integer Values
        System.out.println("Enter Any Two Numbers:");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Which Operation You want : 1=Add 2=Sub 3=Mul 4=Div");
        d = s.nextInt();
        switch (d) 
        {
            case 1:
                c = a + b;
                System.out.println(c);
                System.out.println("Sum="+c);
                System.out.println(a+"+"+b+"="+c);
                break;
            case 2:
                c = a - b;
                System.out.println(c);
                System.out.println("Sub="+c);
                System.out.println(a+"-"+b+"="+c);
                break;
            case 3:
                c = a * b;
                System.out.println(c);
                System.out.println("Mul="+c);
                System.out.println(a+"*"+b+"="+c);
                break;
            case 4:
                c = a / b;
                System.out.println(c);
                System.out.println("Div="+c);
                System.out.println(a+"/"+b+"="+c);
                break;
            default:
                System.out.println("Invalid Input!");
        }

    }                                                    //End Main Function
}                                                         //End Class

