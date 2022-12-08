public class autooop {

	public static void main(String[] args) {

		Auto olio1 = new Auto();
		olio1.merkki = "Porsche";
		olio1.malli = "Cayenne";
		olio1.bensanMaara = 35;			

		System.out.print("Tämä auto on ");
		olio1.naytaTiedot();		
		olio1.Kiihdyta();	
		olio1.Jarruta();
	}

} 

class Auto 

{
	// kyseisen luokan ominaisuuksia:
	public String merkki;
	public String malli;
	public int bensanMaara = 0;

	public void Jarruta() 
	{
		System.out.println("Auto jarruttaa.");	
	}

	public void Kiihdyta() 	
	{	
		bensanMaara = bensanMaara - 1;
		System.out.println(merkki + " kiihtyy, bensaa jäljellä " + bensanMaara + " litraa.");		
		}

	public void naytaTiedot() 
	{
	System.out.println(merkki + " " + malli + ", bensaa tankissa " + bensanMaara + ".");
	}

}