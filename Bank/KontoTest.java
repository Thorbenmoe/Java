package Bank;

public class KontoTest 
{
	public KontoTest(int kontoNummer, double kontoStand, double dispoLimit, boolean karteAngenommen) 
	{
		this.kontoNummer=kontoNummer;
		this.kontoStand=kontoStand;
		this.dispoLimit=dispoLimit;
		this.karteAngenommen=karteAngenommen;	// TODO Auto-generated constructor stub
	}
	int kontoNummer;
	double kontoStand;
	double dispoLimit=1000;
	boolean karteAngenommen=false;


	void setKarteAngenommen(boolean karteAngenommen)
	{
		this.karteAngenommen=karteAngenommen;
	}

	
	void setKontoNummer(int kontoNummer)
	{
		this.kontoNummer=kontoNummer;
	}
	

	void setDispoLimit(double dispoLimit)
	{
		this.dispoLimit=dispoLimit;
	}
	
	
	void setKontostand(double kontoStand)
	{
		this.kontoStand=kontoStand;
	}
	
	
	int getKontoNummer()
	{
		return this.kontoNummer;
	}
	
	
	boolean getKarteAngenommen()
	{
		return this.karteAngenommen;
	}
	
	
	double getKontostand()
	{
		return this.kontoStand;
	}

}
