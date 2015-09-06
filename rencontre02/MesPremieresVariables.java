import outilsCoursJava.*;
public class MesPremieresVariables{
	public static void main(String[] args) {
		int nb1, nb2;
		int somme;
		System.out.println("Entrez le premier nombre");
		nb1 = Keyboard.readInt();
		System.out.println ("Entrez le deuxieme nombre");
		nb2 = Keyboard.readInt();
		somme = nb1+nb2;
		System.out.println("La somme est "+ somme);
	}
}