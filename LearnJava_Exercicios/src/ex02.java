import java.util.Locale;
import java.util.Scanner;
public class ex02 {
public static void main(String[]args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	double circulo, pi, area;
	
	
	pi = 3.14159;
	
	
	
	circulo = sc.nextDouble();
	
	area = circulo * circulo * pi;
	System.out.printf("Valor da area é: %.4f", area);
	
	sc.close();
	
	//Valores de teste. 100.64 , 2.0 , 150.0
}
}
