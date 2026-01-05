import java.util.Scanner;
public class ex01 {
	public static void main (String[]args) 
	{
		
	Scanner sc = new Scanner(System.in);
	
	int n1,n2,soma;
	
	
	
	
	System.out.println("Infome por Gentileza os Valores para a Soma:");
	
	n1 = sc.nextInt();
	System.out.printf("Valor de N1: %d%n", n1);
	n2 = sc.nextInt();
	System.out.printf("Valor de N2: %d%n", n2);
	
	soma = n1+n2;
	System.out.println("Total é: " + soma);
	
	sc.close();
	}
}
