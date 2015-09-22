import java.util.Scanner;
public class FrankOcean {

	public static void main (String [] args){
		
		String adj = "";
		String noun = "";
		String animal = "";
		String noise = "";
		
		Scanner first = new Scanner (System.in);
		Scanner second = new Scanner (System.in);
		Scanner third = new Scanner (System.in);
		Scanner  fourth = new Scanner (System.in);
		
		
		System.out.print("Hook me with a adjective:");
		adj = first.nextLine();
		
		System.out.print("Hook me with a noun:");
		noun = second.nextLine();
		
		System.out.println("Hook me with a animal:");
		animal = third.nextLine();
		
		System.out.println("Hook me with a noise:");
		noise = fourth.nextLine();
	
		
		
		System.out.println(adj +" Macdonald had a " + noun +  ", E-I-E-I-O and on that " + noun + " he had an " + animal + ", E-I-E-I-O with a " + noise + " here and a " + noise + " there, here a " + noise + ", there a " + noise + ",everywhere a " + noise + "," + adj + " Macdonald had a " + noun + ", E-I-E-I-O.");
		
	}
}
