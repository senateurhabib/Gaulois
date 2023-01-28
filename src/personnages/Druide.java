
package personnages;
import java.util.*;

public class Druide {
private String nom;
private int effetPotionMin;
private int effetPotionMax;
private int forcePotion = 1;

public Druide(String nom, int effetPotionMin, int effetPotionMax) {
this.nom = nom;
this.effetPotionMin = effetPotionMin;
this.effetPotionMax = effetPotionMax;
parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
}
public int preparation() {
	Random i = new Random();
	int forcePortion = i.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;
	if (forcePotion>=7) {
		System.out.println(prendreParole() + " j'ai prepare une sper portion de force " + forcePotion);
	}
	else {
		System.out.println(prendreParole()+ "je n'ai pas trouve tous les ingrediens , ma potion est seulement de force " + forcePotion);
	}
	return forcePotion;
}
public String getNom() {
return nom;
}
public void parler(String texte) {
System.out.println(prendreParole() + "« " + texte + "»");
}
private String prendreParole() {
return "Le druide " + nom + " : ";
}
}