package calculo_imc;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bem-vindo(a).\nPressione Enter para prosseguir ou 'x' para sair.");
		 switch(s.nextLine()) {
		 case("x"):
			System.out.println("Aplicação encerrada");s.close();break;
		  }
		 
		String g;
		String n;
		double peso;
		double h;
		double imc;
		
			while((g = s.nextLine())!="esc") {
				System.out.println("Insira seu nome.");
				n = s.nextLine();
					//if(n == "x") {
					//	System.out.println("Aplicação encerrada");s.close();
				System.out.println("Bem vindo(a) " + n);
				System.out.println("Selecione um gênero (M/F)");
				g = s.nextLine();
				
				
				switch(g) {
				case ("M"):
				System.out.println("Gênero selecionado.");
				System.out.println("Insira seu peso. ");
				peso = s.nextDouble();
				System.out.println("Insira sua altura. ");
				h = s.nextDouble();
				
				
				imc = (peso/(h*h));
				System.out.printf("IMC: %2.2f\n",imc);
				if((imc<16)) {
					System.out.println("Magreza severa");
				}else if((imc<17)) {
					System.out.println("Magreza");
				}else if((imc<25)) {
					System.out.println("Ideal");
				}else if((imc<30)) {
					System.out.println("Sobrepeso");
				}else if((imc<35)) {
					System.out.println("Obesidade");
				}else if((imc<45)) {
					System.out.println("Obesidade Severa");
				}else {
				System.out.println("Out Range");
				}
				System.out.println("Consulta finalizada com sucesso. \nRealize nova consulta ou pressione 'x' para sair. \nObrigado(a).");
				break;
				
					
				case ("F"): 
				System.out.println("Gênero selecionado.");
				System.out.println("Insira seu peso. ");
				peso = s.nextDouble();
				System.out.println("Insira sua altura. ");
				h = s.nextDouble();
				
				
					imc = ((peso/(h*h) - 1) );
				System.out.printf("IMC: %2.2f\n", imc);
				if((imc<16)) {
					System.out.println("Magreza severa");
				}else if((imc<17)) {
					System.out.println("Magreza");
				}else if((imc<25)) {
					System.out.println("Ideal");
				}else if((imc<30)) {
					System.out.println("Sobrepeso");
				}else if((imc<35)) {
					System.out.println("Obesidade");
				}else if((imc<45)) {
					System.out.println("Obesidade Severa");
				}else {
				System.out.println("Out Range");
				}
				System.out.println("Consulta finalizada com sucesso. \nRealize nova consulta ou pressione 'x' para sair. \nObrigado(a).");
				break; 
				
				
			}
				
		}

	}
}

		