import outilsCoursJava.*;

public class OperationChaine{
public static void main(String[] args) {
	System.out.println("Entrez une chaine de caractere de votre choix: ");
	String motUtilisateur = Keyboard.readString();
	int longueurChaine = motUtilisateur.length();
	System.out.println("Nombre de caracteres dans votre mot: "+longueurChaine);
	char first = motUtilisateur.charAt(0);
	char last =motUtilisateur.charAt(longueurChaine-1);
	System.out.println ("Premiere et derniere lettres de votre mot: "+first+last);
	String noLast = motUtilisateur.substring(0, longueurChaine-1);
	System.out.println("Votre mot sans sa derniere lettre: "+noLast);
	
	}
}