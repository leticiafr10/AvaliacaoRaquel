import java.util.Scanner;

public class Questao24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o custo  um carro: ");
		double custoFabrica = scanner.nextDouble();
		
		double porcelDistribuidor = 28.0 / 100;
		double impostos = 45.0 / 100;
		
		double porceDistribuidor = custoFabrica * impostos;
		double imposto= custoFabrica * porceDistribuidor;
		
		double valorFinal = custoFabrica + porceDistribuidor + imposto;
		
		System.out.println("o custo final ao consumidor é" + valorFinal );
		

	}

}

