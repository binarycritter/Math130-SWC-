import java.util.*;

/*************************
 * Christopher Lieberman *
 * Lab # 3
 * Math-130-03           *
 * September 8, 2015     *
 * Professor Rasky       *
 *************************/
public class Lab3_B 
{

    public static void main(String [] args)
    {
        // Part 2 of Lab # 3
        int num1,num2,num3,num4,num5;
        double sumVar;
        Scanner keyboard = new Scanner (System.in);
        
        //prompt and get user input
        System.out.print("Please enter an integer between 1 to 100: ");
        num1 = keyboard.nextInt();
        System.out.print("Please enter an integer between 1 to 100: ");
        num2 = keyboard.nextInt();
        System.out.print("Please enter an integer between 1 to 100: ");
        num3 = keyboard.nextInt();
        System.out.print("Please enter an integer between 1 to 100: ");
        num4 = keyboard.nextInt();
        System.out.print("Please enter an integer between 1 to 100: ");
        num5 = keyboard.nextInt();
        
        //data validation 
        if(num1 > 100 )
            num1 = 100;
        
        else if(num1 <= 0)
            num1 = 1;
        
        if(num2 > 100)
            num2 = 100;
        
        else if (num2 <= 0)
            num2 = 1;
        
        if(num3 > 100)
            num3 = 100;
        
        else if (num3 <= 0)
            num3 = 1;
        
        if (num4 > 100)
            num4 = 100;
        
        else if (num4 <= 0)
            num4 = 1;
        
        if (num5 > 100)
            num5 = 100;
        
        else if(num5 <= 0 )
            num5 = 1;
        
        //processing calculating
        sumVar = (1.0/num1) + (1.0/num2) + (1.0/num3) + (1.0/num4) +
                (1.0/num5) ;
        
        
        //Display sum of integers
        System.out.println();
        System.out.printf("1/%1d + 1/%1d + 1/%1d + 1/%1d + 1/%1d = %1.2f \n",
                num1,num2,num3,num4,num5,sumVar);
        System.out.println();
    }//end of main
    
}//end of class
