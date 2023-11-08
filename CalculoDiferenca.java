package JavaInicial;

import java.util.Scanner;

public class CalculoDiferenca {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,n4,diferenca;
		
		System.out.println("\n Digite o primeiro numero: ");
		n1 = leia.nextFloat();
		
		System.out.println("\n Digite o segundo numero: ");
		n2 = leia.nextFloat();
		
		System.out.println("\n Digite o terceiro numero: ");
		n3 = leia.nextFloat();
		
		System.out.println("\n Digite o quarto numero: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		 
		System.out.println("\n A diferença é: "+ diferenca);

	}

}
 