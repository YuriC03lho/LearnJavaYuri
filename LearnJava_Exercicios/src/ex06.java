import java.util.Locale;
import java.util.Scanner;
public class ex06 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A,B,C, pi, area, resultado;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		pi = 3.14159;
		
		System.out.println("trinagulo: "+ A * C / 2.0  );
		System.out.println("Circulo" + pi * C * C);
		System.out.println("Trapezio: "+ (A + B) /2.0 * C); 
		System.out.println("Quadrado: " + B*B);
		System.out.println("Retangulo: " + A * B);
		
		
		
	}
}
