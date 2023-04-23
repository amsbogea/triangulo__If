package triangulo__If;

import java.util.Scanner;

public class Triangulo__If {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		
		System.out.println("Digite o valor do lado 1 do triângulo:");
		lado1 = input.nextDouble();
		
		System.out.println("Digite o valor do lado 2 do triângulo:");
		lado2 = input.nextDouble();
		
		System.out.println("Digite o valor do lado 3 do triângulo:");
		lado3 = input.nextDouble();
		
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("Triângulo Equilátero");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Triângulo Isóscele");
		}else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("Triângulo Escaleno");
		}
	}
	
	

}
