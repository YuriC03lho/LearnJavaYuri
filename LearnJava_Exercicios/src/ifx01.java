import java.util.Scanner;
public class ifx01 {
public static void main(String[]args) {
	
	
	Scanner sc = new Scanner(System.in);
	
	int _InputInt = sc.nextInt();
	
	if(_InputInt < 0) 
	{
		
	System.out.printf("Parabéns, valor %d é negativo", _InputInt);
		
		
		
	}
	else{
		System.out.printf("Parabéns, o valor %d é positivo", _InputInt);
		}
	sc.close();
}
}
