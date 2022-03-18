import java.util.Scanner;

public class EntryPoint {
	public static void main(String[] args){
	    String repeat;
	    Scanner scan = new Scanner(System.in);
            
	    System.out.println("Which service would you like to use?");
	    System.out.println("[1]: Basic week visualizer");
	    System.out.println("[2]: Advanced week visualizer");
	    System.out.println("[3]: Basic calculator");
            System.out.println("[4]: Employee repertoire");
	    
	    String input = scan.nextLine();
	    
	    if (input.equals("1")){
		BasicWeek week1 = new BasicWeek();
		week1.printDays();
	    } else if (input.equals("2")) {
		 AdvancedWeek week2 = new AdvancedWeek();
		 week2.printDays();
	    } else if (input.equals("3")){
		  Calculator calc = new Calculator();
		  System.out.println(calc);
	    } else if (input.equals("4")){
		   Employee emp = new Employee();
		   System.out.println(emp);
	    }
		
	}
}