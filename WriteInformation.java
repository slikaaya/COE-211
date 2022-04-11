
package Chapter6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class WriteInformation {
    public static void main(String[] args) throws FileNotFoundException{
        String studentName;
        int n;
        Scanner input=new Scanner(System.in);
        Random rand1=new Random();
        
        System.out.print("Enter the number of students: ");
        n=input.nextInt();
        input.nextLine();
        
        PrintWriter output=new PrintWriter("Database.txt");
        System.out.println();
        while(n>0){
            System.out.print("Enter the student full name (separated by .): ");
            studentName=input.nextLine();
            output.println(studentName+"###"+studentName.charAt(0)+(rand1.nextInt(Integer.MAX_VALUE-1000)+1001));
            n--;
        }
        output.close();
        
    }
}
