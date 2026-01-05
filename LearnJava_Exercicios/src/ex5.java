import java.util.Locale;
import java.util.Scanner;

public class ex5 {
public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	int _CodPc1, _NPc1;
	int _CodPc2, _NPc2;
	
	double _ValuerPc1, _ValuerPc2, _Resultado;
	System.out.println("Digite a Peça 1");
	_CodPc1 = sc.nextInt();
	_NPc1 = sc.nextInt();
	_ValuerPc1 = sc.nextDouble();
	
	System.out.println("Digite a Peça 2");
	_CodPc2 = sc.nextInt();
	_NPc2 = sc.nextInt();
	_ValuerPc2 = sc.nextDouble();
	
	_Resultado =  (double) (_ValuerPc2 * _NPc2) + _ValuerPc1 * _NPc1;
	System.out.printf("Valor a pagar: R$ %.2f", _Resultado);
	
	sc.close();
	}
}
