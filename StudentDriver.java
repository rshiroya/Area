import java.io.*;
import java.util.*;
/**
 * A driver class to open the data file and use the tokenizer to 4
 * seperate the field values into variables.
 * @author Shiroya R.
 * @version 03-11-2020
 */

public class StudentDriver 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner keyboard = new Scanner(new File("StudentData.txt"));
        while (keyboard.hasNext()) 
        {
            String line = keyboard.nextLine();
            
            StringTokenizer tokenizer = new StringTokenizer(line, ",");
            
            String lastName = tokenizer.nextToken();
            String firstName = tokenizer.nextToken();
            String studentID = tokenizer.nextToken();
            String strCreditHours = tokenizer.nextToken();
            String GPAinStr = tokenizer.nextToken();
            
            double gpa = Double.parseDouble(GPAinStr);
            int creditHours = Integer.parseInt(strCreditHours);
             
            Student student1 = new Student(lastName, firstName, studentID, gpa, creditHours);
            System.out.println(student1);

        }

        keyboard.close();

    }
}