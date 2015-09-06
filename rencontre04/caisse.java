import outilsCoursJava.*;

public class Caisse{
public static void main(String[] args) {
	double taxe = 14.975;
	System.out.println("Entrez le prix du premiere item: ");
	double prix1 = Keyboard.readDouble();
	System.out.println("Entrez le prix du deuxieme item: ");
	double prix2 = Keyboard.readDouble();
	System.out.println("Entrez le prix du troisieme item: ");
	double prix3 = Keyboard.readDouble();
	double subTotal = (prix1+prix2+prix3);
	System.out.println("Le prix avant taxes est de: "+subTotal);
	double prixTotal = (((100+taxe)/100)*subTotal);
	int prixFinalInt = ((int)prixTotal*100);
	double prixFinalDouble = (prixTotal/100);
	System.out.println ("Le prix est: "+prixTotal);
	}
}