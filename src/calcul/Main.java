package calcul;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operations operation = new Operations();
		
		System.out.println("Entrer vos deux nombres pour l'opération de votre choix");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrer votre premier nombre : ");
		operation.setNombre1(scanner.nextFloat()); 
		scanner.nextLine();
		System.out.print("Entrer votre deuxième nombre : ");
		operation.setNombre2( scanner.nextFloat());
		scanner.nextLine();
		
		System.out.print("Parmi les opérations suivantes faites votre choix : + - * / : ");
		operation.setChoix(scanner.nextLine());
		scanner.close();
		
		if(operation.getNombre2() == 0 && operation.getChoix().equals("/")) {
			System.out.print("Impossible de faire une division par 0");
		}else {
			System.out.print("Selon votre opérateur " + operation.getChoix()+ " " + operation.getNombre1()+ " " + operation.getChoix()+ " " + operation.getNombre2()+" est égal à "+ operation.calculer());
		}
		
	}
	
}
