package JavaInicial;

import java.util.Scanner;

public class calculoSalarioAbono {

	public static void main(String[] args) {
		
		float salario,abono, resultado;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite o seu salario: ");
		salario = leia.nextFloat();
		System.out.println("\n Digite o seu Abono: ");
		abono = leia.nextFloat();
		
		resultado = salario + abono ;
		
		System.out.printf("\n Seu novo salario é : %.2f%n", resultado);
		
		
		

	}

}
