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
		
		System.out.println("sus datos son:");
		System.out.println("su nombre es: "+ name1);
		System.out.println("su email es: "+ email1);
		System.out.println("su password is *******");
		System.out.println();

	}
	    
	     void buscar() {
	    	Scanner respuesta =new Scanner(System.in);
	 		int respuesta1;
			System.out.println("introduzca el nombre del libro");
			Scanner nombre1=new Scanner(System.in);
			String nombre;
			nombre=nombre1.nextLine();
			product.setNombre_producto(nombre);
			System.out.println("el nombre del libro es:"+ nombre);
			System.out.println();

			System.out.println("Desea ver los detalles del libro "+ nombre+ " pulse 1 para continuar");
			respuesta1=respuesta.nextInt();
			
			
			if (respuesta1==1) {
				System.out.println("el nombre del libro es:"+ nombre);
				System.out.println("el libro se encuentra en :"+ product.localizacion);
				System.out.println("quedan "+product.unidades+ " ejemplares del "+nombre);
				System.out.println("el libro pertenece al genero de "+ book.genero);
				System.out.println("el libro cuesta "+ book.precio+"€");
				System.out.println();

			}
			


			
	    }
	     void convertir() {
	 		Scanner respuesta1=new Scanner(System.in);
	 		int respuesta=0;
	 		Scanner price1=new Scanner(System.in);
            double price = 0;
		    System.out.println("introduzca el precio deseado");
			 price = price1.nextInt();
	 		
	 		while(respuesta!=3) {
			System.out.println();

		    System.out.println("si desea convertir el precio seleccione la opcion:");
			System.out.println();

			System.out.println("si desea pasar de euros a dolares: pulse 1");
			System.out.println("si desea pasar de dolares a euros: pulse 2");
			System.out.println("para volver al menu pulse 3");

			 respuesta = respuesta1.nextInt();
			 
			 switch(respuesta) {
			 
			 case 1:
				 double price2 = 0;
				 price2 = price * 1.15;
					System.out.println(price + "€ son "+ price2 + "$" );
					System.out.println();

				 break;
			 case 2:
				 double price3 = 0;
				 price3 =  price / 1.15;
					System.out.println(price + "$ son "+ price3 + "€" );
					System.out.println();

				 break;
			 }
				
	 		}
	     }
	    
	     void comprar_libro() {
		 	

				
	    	 
	     }
	     
	     
	     
	public static void main(String[] args) {
		Scanner respuesta1=new Scanner(System.in);
		int respuesta = 0;
		
		while(respuesta!=5) {
		System.out.println("\tbienvenido a nuestro almacen que accion desea realizar");
		
				System.out.println(" -1- darse de alta");
				System.out.println(" -2- buscar libro");
				System.out.println(" -3- cambiar moneda");
				System.out.println(" -4- comprar libro");
				System.out.println(" -5- salir");
				
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
					
					user pepe=new user();
					pepe.convertir();

					break;
				case 4: 
					user pedro=new user();
					 pedro.comprar_libro();
					break;
				case 5: 
					System.out.println("\tgracias por su visita");
					break;

				}
				
				
				
	}
	}

	
}


