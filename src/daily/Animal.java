/**
 * @author N'ZO LAGOU
 * Dans cet exercice, vous implémenterez l'héritage unique,

créer une baseclasse avec une méthode et

puis héritez de la classe de base créée dans la derivedclasse à 
l'aide du mot-clé "extends".

Accédez ensuite à la méthode héritée à partir de l' derivedobjet de classe.
 */


package daily;

public class Animal {

	public void seNourrir() {
		System.out.println("il mange des insects");
	}

	public void seDeplacer() {
		System.out.println("je vol pour me deplacer");
	}

	public void seCoucher() {
		System.out.println("j'ai droit au sommeil");
	}

}
