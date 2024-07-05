package contaSalario;

import java.util.Scanner;

public class Conta_salario {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		

		System.out.println("###Cálculo Sálario###");
		System.out.println("Insira seu nome: ");
		String nome = s.nextLine();
		System.out.println("Bem-vindo(a) " + nome);
		System.out.println("Insira seu Salário Bruto.");
		double sal = s.nextDouble();
		double ir = (sal*0.11);
		System.out.printf("IR: %2.2f\n",(sal - (sal - ir)));
		double inss = (sal * 0.08);
		System.out.printf("INSS: %2.2f\n", (sal - (sal - inss)));
		double sin = (sal * 0.05);
		System.out.printf("Sindicato: %2.2f\n",(sal - (sal - sin)));
		double con = (sal * 0.235);
		System.out.printf("Consiguinado: %2.2f\n", (sal - (sal - con)));
		System.out.printf("Salário líquido: %2.2f\n",   sal - ( ir + inss + sin + con));
		
		
	
	}

}
