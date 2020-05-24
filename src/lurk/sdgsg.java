package lurk;

import java.util.List;
import java.util.Scanner;


public class sdgsg {
	static Scanner sc = new Scanner(System.in);
	static String s;
	static int i;
	public static void main(String[] args) {
		
		
		while (true) {
			System.out.println(" Välj ett alternativ genom att skriva in en siffra för det alternativ du vill välja och tryck enter");
			System.out.println(" 1. Registrera en ny användare");
			System.out.println(" 2. Söka på användarid");
			System.out.println(" 3. Avsluta");
			
			if (sc.hasNextInt() == false) {
				System.err.println("Du måste ange ett nummer");
				sc.nextLine();
				continue;
				
			}else {
				i = sc.nextInt(); 
				if (i == 1){
					newUser();
					continue;
				} else if (i == 2) {
					idSearch();
					sc.nextLine();
					continue;
				} else if (i == 3){
					System.exit(0);
				}
			}
		}
						
//			} else if (sc.nextInt() == 1){
//				newUser();
//				continue;
//			} else if (sc.nextInt() == 2) {
//				idSearch();
//				continue;
//			} else if (sc.nextInt() == 3){
//				break;
//			}
			

		
	
	}
	
	private static void idSearch() {
		System.out.println("skriv in id på personen du vill söka efter");
		while (true) {
			
			if (sc.hasNextInt() == false) {
				System.err.println("Du måste ange ett nummer");
				sc.nextLine();
				continue;
			} else {
				// här ska metoden för idsökning anropas
				System.out.println("Lägg in en metod för idsökning här");
				System.out.println(sc.nextInt());
				break;
			}
		}
		
	}

	public static void newUser() {
		
		System.out.println("Ange förnamn på personen som ska registreras");
		sc.nextLine();
		s = sc.nextLine();
		System.out.println(s);
		
		System.out.println("Ange efternamn på personen som ska registreras");
		System.out.println(s + " " + sc.nextLine());
		}
}

