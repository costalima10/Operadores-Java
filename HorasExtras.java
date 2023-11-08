package JavaInicial;

import java.util.Locale;
import java.util.Scanner;

public class HorasExtras {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		float salario,noturno,extra,desconto,liquido;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite o seu salario: ");
		salario = leia.nextFloat();
		
		System.out.println("\n Digite o seu Adicional noturno: ");
		noturno = leia.nextFloat();
		
		System.out.println("\n Digite suas horas extras: ");
		extra = leia.nextFloat();
		
		System.out.println("\n Digite seu desconto: ");
		desconto = leia.nextFloat();
		
		liquido = salario + noturno + (extra*5) - desconto;
		
		System.out.printf("\n O seu salario liquido é: %.2f%n ", liquido );
		
	}

}
 