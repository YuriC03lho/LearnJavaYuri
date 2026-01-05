import java.util.Scanner;
import java.util.Locale;
public class ex04 {
public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int _HoursWorked, _ColaboratorNumber;
	double _SalaryWorked, _Result;
	
	_ColaboratorNumber = sc.nextInt();
	_HoursWorked = sc.nextInt();
	_SalaryWorked = sc.nextDouble();
	
	
	_Result = (double) _HoursWorked * _SalaryWorked;
	System.out.println("Colaborator Number: " + _ColaboratorNumber);
	System.out.printf("Salary Totaly:  %.2f  U$", _Result);
	
	
	sc.close();
	}
}
