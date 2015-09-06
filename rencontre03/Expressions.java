public class Expressions{
	public static void main(String[] args){
		int nb1, nb2;
		int resultatDivision1;
		double resultatDivision2;
		nb1 = 10;
		nb2 = 6;
		resultatDivision1 = nb1/nb2;
		resultatDivision2 = nb1/nb2;
		System.out.println("resultat 1:"+resultatDivision1);
		System.out.println("resultat 2:"+resultatDivision2);
			
		
		float nb3, nb4;
		nb3 = 10.0f;
		nb4 = 6;
		float resultatDivision3 = nb3/nb4;
		int resultatDivision4 = (int)(nb3/nb4);
		System.out.println("resultat 3:"+resultatDivision3);
		System.out.println("resultat 4:"+resultatDivision4);
		
		
		double racineCarree = Math.sqrt(4.68);
		System.out.println ("la racine: "+racineCarree);
		double exposant = Math.pow(2,4);
		System.out.println("resultat5: "+exposant);
	}
}