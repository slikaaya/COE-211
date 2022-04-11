import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 int[]assignments = new int[5];
	 double attendance, midterm, attendanceGrade, midtermGrade;
	 Scanner scan=new Scanner(System.in);
	 for(int idx=0;idx<assignments.length;idx++){
	     int asn=idx+1;
	     System.out.println("input the grade of assignment"+asn);
	     assignments[idx]=scan.nextInt();
	 }
	
	    System.out.println("input the number of attended labs");
	    attendance=scan.nextInt();
	    
	    System.out.println("input the midterm grade");
	    midterm=scan.nextInt();
	    
	    int total=0;
	    
	    for(int idx=0;idx<assignments.length;idx++){
	       total+=assignments[idx];
	    }
	     double avr=total/assignments.length;
	     double assignmentsGrade=avr*0.3;
	     System.out.println("assignment(30%):"+assignmentsGrade); 
	     attendanceGrade=(attendance/7.0)*5;
	     System.out.println("Attendence(5%):"+attendanceGrade);
	     midtermGrade=midterm*0.3;
	     System.out.println("Midterm(30%):"+midtermGrade);
	    }
	}
