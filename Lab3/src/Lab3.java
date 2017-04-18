import java.util.*;

/*************************
 * Christopher Lieberman *
 * Lab # 3               *
 * Math-130-03           *
 * September 8, 2015     *
 * Professor Rasky       *
 *************************/

public class Lab3 
{

    public static void main(String [] args)
    {
        /* I put all of the variables at the very top to gear up for C++ 
         There must be an better way to declare multple variables...                   
        Part 1 of Lab # 3
        */
        int n, numPages;
        int num1,num2,num3,num4,num5;
        double sumVar;
        Scanner keyboard = new Scanner(System.in);
            
        // prompt and ger user input for number of pages
        System.out.print("Please enter desired amount of pages: ");
        n = keyboard.nextInt();
        numPages = n / 4; //calculate number of pages
            
        // calculate the remaining sides on the broadsheets
        if (n % 4 > 0)
            {
                      numPages += 1;
            }
              
     // output
     System.out.println("The required number of pages you need is " + numPages + " pages.");    

     
 // Part 2 of Lab # 3
     
        
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
        
        if (num1 > 100 && num2 > 100 && num3 > 100 && num4 > 100 && num5 > 100)
        {
            num1 = 100; 
            num2 = 100;
            num3 = 100;
            num4 = 100;
            num5 = 100;
        }
        else if (num1 <= 0 && num2 <= 0 && num3 <= 0 && num4 <= 0 && num5 <= 0)
        {
            num1 = 1;
            num2 = 1;
            num3 = 1;
            num4 = 1;
            num5 = 1;
        }
        
     //processing calculating
       sumVar = (1.0/num1) + (1.0/num2) + (1.0/num3) + (1.0/num4) +
                (1.0/num5) ;
        
        
        //Display sum of integers
        System.out.println();
        System.out.printf("1/%1d + 1/%1d + 1/%1d + 1/%1d + 1/%1d = %1.2f \n",
                num1,num2,num3,num4,num5,sumVar);
        System.out.println();
     
    }//end of main
        
}//end of Lab3 class
