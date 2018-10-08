package tienda;

import java.util.Scanner;

public class user {

	    void datos() {
		System.out.println("\tintroduzca los datos requeridos");
		Scanner name =new Scanner(System.in);
		String name1;
		Scanner email =new Scanner(System.in);
		String email1;
		Scanner password =new Scanner(System.in);
		String password1;
		System.out.println("introduzca su nombre");
		name1=name.nextLine();
		System.out.println("introduzca su correo");
		email1=email.nextLine();
		System.out.println("introduzca su password");
		password1=password.nextLine();
	}
	    void buscar() {
			System.out.println("introduzca el nombre del libro");
			Scanner nombre1=new Scanner(System.in);
			String nombre;
	    }
	    
	public static void main(String[] args) {
		Scanner respuesta1=new Scanner(System.in);
		int respuesta;
		
		System.out.println("\tbienvenido a nuestro almacen que accion desea realizar");
		
				System.out.println(" -1- darse de alta");
				System.out.println(" -2- buscar libro");
				System.out.println(" -3- salir");
				
				System.out.println("introduzca un numero");
				respuesta = respuesta1.nextInt();
				
				
				switch(respuesta) {
				case 1:
					user jony = new user();
					jony.datos();
					break;
				case 2: 
					 user paco=new user();
					 paco.buscar();
					 break;
				case 3: 
					System.out.println("gracias por su visita");
					break;

				}
				
	}
	

	
}


