package RajdeepException;

import java.io.*;
import java.util.InputMismatchException;
class calculator
{
    double a,b;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public calculator() {
        a=b=0;
    }
    public void inputNo()
    {
        try {
            System.out.println("Enter 1st No");
            a=Double.valueOf(br.readLine());
            System.out.println("Enter 2nd No");
            b=Double.valueOf(br.readLine());
        }
        catch(Exception e)
        {
        System.out.println("error occured. Please enter correct inputs.");
        }
    }
    public void sum()
    {
        inputNo();
        double c=a+b;
        System.out.println("Sum is: "+c);
    }
    public void sub()
    {
        inputNo();
        double c=a-b;
        System.out.println("Substraction is: "+c);
    }
    public void mul()
    {
        inputNo();
        double c=a*b;
        System.out.println("Multipaction is: "+c);
    }
    public void div()
    {
        inputNo();
        double c=a/b;
        System.out.println("Division is: "+c);
    }
    public void mod()
    {
        inputNo();
        double c=a%b;
        System.out.println("Modulus is: "+c);
    }
}
public class TestCalculator
{
    public static void main(String args[])
    {
        calculator oc=new calculator();
        int ch;
        try {
            if(oc!=null)
            {
                do {
                    System.out.println("Main Menu\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulus");
                    System.out.println("Your Choice: ");
                    ch = Integer.parseInt(new calculator().br.readLine());
                    switch(ch)
                    {
                        case 1:
                            try
                            {
                                oc.sum();
                            }
                            catch(InputMismatchException e)
                            {
                                e.printStackTrace();
                            }
                            break;
                        case 2:
                            try
                            {
                                oc.sub();
                            }
                            catch(InputMismatchException e)
                            {
                                e.printStackTrace();
                            }
                            break;
                        case 3:
                            try
                            {
                                oc.mul();
                            }
                            catch(InputMismatchException e)
                            {
                                e.printStackTrace();
                            }
                            break;
                        case 4:
                            try
                            {
                                oc.div();
                            }
                            catch(InputMismatchException e)
                            {
                                e.printStackTrace();
                            }
                            catch(ArithmeticException A)
                            {
                                A.printStackTrace();
                            }
                            break;
                        case 5:
                            try
                            {
                                oc.mod();
                            }
                            catch(InputMismatchException e)
                            {
                                e.printStackTrace();
                            }
                            catch(ArithmeticException A)
                            {
                                A.printStackTrace();
                            }
                            break;
                    }
                }while(ch<6);
            }
        }
        catch(NullPointerException N)
        {
            N.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}


