public class oops1 {

	public static void main(String[] args) {
		// maaritellaan minkalaisesta luokasta on kyse		

		// muodostetaan elain-luokasta olio:

		Elain olio1 = new Elain();
		olio1.laji = "koira";
		olio1.rotu = "labradorinnoutaja";
		olio1.sukupuoli = "kastrUros";

		// kutsutaan kyseisen olion metodeja: 
		olio1.leikkii();
		olio1.haukkuu();
		System.out.println("Se on minun " + olio1.rotu + ".");		

		// muodostetaan elain-luokasta toinenkin olio:
		Elain olio2 = new Elain();
		olio2.laji = "kissa";
		olio2.rotu = "kotikissa";
		olio2.vari = "musta";

		// kutsutaan kyseisen olion metodeja: 
		olio2.nukkuu();
		olio2.kehraa();
		System.out.println("Se on minun ihana " + olio2.vari + " " + olio2.laji + ".");						
	}
}   // main loppuu


class Elain {
	// kyseisen olion tarkempia ominaisuuksia:
	String laji;
	String rotu;
	String sukupuoli;
	String vari; 	

	// toiminnallisuudet, eli mitä tämä olio tekee: 
	public void leikkii()
	{
		System.out.println("Nyt se leikkii.");
	}

	public void haukkuu()
	{
		System.out.println("Nyt se haukkuu.");
	}	

	// toiminnallisuudet, eli mitä toinen olio tekee:
	public void kehraa() 
	{
		System.out.println("Ja se kehrää nukkuessaankin.");	
	}

	public void nukkuu() 
	{
		System.out.println("Nyt se nukkuu sohvalla.");	
	}

}