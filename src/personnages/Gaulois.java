package personnages;

public class Gaulois {
private String nom;
private int force;
private int effetPotion;

public Gaulois(String nom, int force , int effetPotion) {
this.nom = nom;
this.force = force;
this.effetPotion=effetPotion;
}
public String getNom() {
return nom;
}
public void parler(String texte) {
System.out.println(prendreParole() + "« " + texte + "»");
}
private String prendreParole() {
return "Le gaulois " + nom + " : ";
}
public void frapper(Romain romain) {
System.out.println(nom + " envoie un grand coup dans la mâchoire de "
+ romain.getNom());
romain.recevoirCoup(force / 3);
}



//public String toString() {return "Gaulois [nom=" + nom + ", force=" + force+ ", effetPotion=" + effetPotion + "]";
//}
public static void main(String[] args) {
	Gaulois asterix = new Gaulois("Astérix",8,5);
	System.out.print(asterix);
	System.out.println("le nom est :" + asterix.getNom() + "la Force est  : " + asterix.force);
	System.out.println(asterix);
	System.out.println(asterix.getNom());
	System.out.print(asterix);
	System.out.println();
	asterix.parler(" Hello");
	Romain combattant = new Romain("Dany",15) ;
	asterix.frapper(combattant);
	
	
	

}
}

