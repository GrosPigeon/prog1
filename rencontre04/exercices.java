import outilsCoursJava.*;

public class exercices{
public static void main(String[] args) {
	System.out.println("Entrez votre premiere note");
	int note1 = Keyboard.readInt();
	System.out.println("Entrez votre deuxieme note");
	int note2 = Keyboard.readInt();
	System.out.println("Entrez votre troisieme note");
	int note3 = Keyboard.readInt();
	System.out.println("Entrez votre quatrieme note");
	int note4 = Keyboard.readInt();
	System.out.println("Entrez votre cinquieme note");
	int note5 = Keyboard.readInt();
	int moyenneNoMath = ((note1+note2+note3+note4+note5)/5);
	int moyenne = (int)Math.round(moyenneNoMath);
	System.out.println ("Votre moyenne est: "+moyenne);
	}
}