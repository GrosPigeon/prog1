import outilsCoursJava.*;

public class Exercice4{
public static void main(String[] args) {
	int tpsInt = (((100+5)/100)*prixTotalNoTax)*100;
	double tps = (tpsInt/100);
	int tvqInt = ((100+9.975)/100)*100;
	double tvq = (tvqInt/100);
	System.out.println("Quelle distance devrez vous parcourir?");
	int distance = Keyboard.readInt();
	int coutDistance = ((distance/50)*10);
	System.out.println("Le prix relatif a la distance: "+coutDistance);
	double coutBase = 200.00;
	System.out.println("Quelle volume devez vous transporter?");
	double volume = Keyboard.readDouble();
	double coutVolume = Math.ceil(volume/50)*75;
	System.out.println("Le cout relatif au volume: "+coutVolume);
	double prixTotalNoTax = (coutBase+coutDistance+coutVolume);
	System.out.println("TPS: "+tps);
	System.out.println("TVQ: "+tvq);
	double prixTotal = prixTotalNoTax*((100+tps+tvq)/100);
	System.out.println("Le prix total avant taxes est de: "+prixTotalNoTax);
	System.out.println("Le prix total avec taxes: "+prixTotal);
	}
}