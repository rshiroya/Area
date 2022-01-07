import java.util.Scanner;
/**
 * Write a description of class Driver here.
 *
 * @author Shiroya R.
 * @version 03-11-2020
 */
public class Driver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        
        System.out.println("1. Calculate the area of the circle: ");
        System.out.println("2. Calculate the area of the rectangle: ");
        System.out.println("3. Calculate the area of the triangle: ");
        System.out.println("4. Quit. ");
    
        choice = keyboard.nextInt();
        
        char goAgain = 'y';
        while(goAgain == 'y')
        {
        
            if(choice == 1)
            {
                System.out.print("\nPlease enter the radius of the circle: ");
                double radius = keyboard.nextDouble();
                double areaCircle = Geometry.circleArea(radius);
                System.out.print("The area of the circle is:" + areaCircle);
               
            }
            else if( choice == 2)
            {
                System.out.print("\nPlease enter the length of the circle: ");
                double length = keyboard.nextDouble();
                System.out.print("Please enter the breadth of the circle: ");
                double breadth = keyboard.nextDouble();
                double areaRectangle = Geometry.rectangleArea(length, breadth);
                System.out.print("The area of the rectangle is:" + areaRectangle);
                
            }
            else if (choice ==3)
            {
                System.out.print("\nPlease enter the base of the triangle: ");
                double base = keyboard.nextDouble();
                System.out.print("Please enter the height of the triangle: ");
                double height = keyboard.nextDouble();
                double areaTriangle = Geometry.triangleArea(height, base);
                System.out.print("The Area of the triangle is: " + areaTriangle);
                
            }
            else if(choice == 4)
            {
                System.out.println("Thank You. Please come again.");
                goAgain = 'n';
            }
            else{
                System.out.print("Please enter a valid number (1-4): ");
                choice = keyboard.nextInt();
            }
        }
        keyboard.close();
        
    }
}

    

