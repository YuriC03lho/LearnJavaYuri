import java.util.Scanner;
public class ex03 {
public static void main(String[]args) {
	int  A,B,C,D, resultado;
	
	Scanner sc = new Scanner(System.in);
	
	A = sc.nextInt();
	B = sc.nextInt();
	C = sc.nextInt();
	D = sc.nextInt();
	
	resultado = A * B - C * D;
	
	System.out.println("Diferença: " + resultado);
	
	sc.close();
	}
}
