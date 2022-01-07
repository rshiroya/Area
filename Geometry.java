import java.util.*;
/**
 * Write a description of class Geometry here.
 *
 * @author Shiroya R.
 * @version 03-11-2020
 */
public class Geometry
{
    public static final double pi = 3.14159;
    public static double circleArea(double radius)
    {
        if(radius<0)
        {
            System.err.print("Please input positive integers. Radius Cannot be negative. : ");
            return 0;
        }
        return pi*radius*radius;
    }
    public static double rectangleArea(double length, double breadth)
    {
        if(length < 0 || breadth <0)
        {
            System.err.println("Please input positive integers. Length/breadth cannot be negative. : ");
            return 0;
        }
        return length * breadth;
    }
    public static double triangleArea(double height, double base)
    {
        if(height<0 || base<0)
        {
            System.err.println("Please input positive integers. Base/height cannot be negative. : ");
            return 0;
        }
        return (1/2)*height*base;
    }
    
    
}
