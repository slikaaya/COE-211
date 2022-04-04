import java.io.FileWriter;
import java.io.IOException; 
import java.util.Scanner;
import java.io.FileReader;
public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      FileWriter fw=new FileWriter("expenses.txt");
      FileReader fr=new FileReader("expenses.txt");
      Scanner scan=new Scanner(System.in);
      String yn;
      String name;
      String purchase;
      Double cost;
     do{ 
      System.out.println("input your name");
      name=scan.nextLine();
      System.out.println("what did you purchase");
      purchase=scan.nextLine();
      System.out.println("how much did you pay");
      cost=scan.nextDouble();
      fw.write(name+"purchased"+purchase+"for"+cost+"US Dollars");
    
  

      
    System.out.println("would you like to purchase?(y/n)");
    scan.nextLine();
    yn=scan.nextLine();
     }while(yn.equals("y"));
      System.out.println("would you like to read a summary of your purchases");
      yn=scan.nextLine();
      if(yn.equals("Y")){
          int data=fr.read();
          while(data!= -1){
              System.out.println((char)data);
              data=fr.read();
          }
      }
       
       
       
        fw.close();
        scan.close();
  }
  
}
    

