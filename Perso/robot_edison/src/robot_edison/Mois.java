package robot_edison;



public enum Mois {

	/* switch (Mois)
		JANVIER -- retourner 1
		FEVRIER -- retourner 2
		etc.
		
			switch (methode)
				case JANVIER:
					'code'
					break;
				case FEVRIER:
					'code'
					break;
				etc.
	*/
	JANVIER(1, 31),  
	FEVRIER(2, 28),
	MARS(3, 31),
	AVRIL(4, 30),
	MAI(5, 31),
	JUIN(6, 31),
	JUILLET(7, 31),
	AOUT(8, 31),
	SEPTEMBRE(9, 30),
	OCTOBRE(10, 31),
	NOVEMBRE(11, 30),
	DECEMBRE(12, 31);
	
	private int mois;
	private int jours;
		
		// Constructeur dans Class et enum
		Mois(int _mois, int _jours)
			{
			this.mois = _mois;
			this.jours = _jours;
			}	
		
	static void setFevrier(int _anneeA)
	{
		boolean estBissextile = (_anneeA%4 ==0 && _anneeA%100 != 0) || _anneeA%400 == 0;
			if(Mois.FEVRIER.mois == 2 && estBissextile)
			{
				Mois.FEVRIER.jours = 29;
			}
			else if(Mois.FEVRIER.mois == 2 && !estBissextile)
			{
				Mois.FEVRIER.jours = 28;
			}
	}
	static Mois[] getMonthThirty()
		{
		return new Mois[] {AVRIL, SEPTEMBRE, NOVEMBRE}; // new -- nouveau tableau
		}
	static Mois[] getMonthThirtyOne()
		{
		return new Mois[] {JANVIER, MARS, MAI, JUIN, JUILLET, AOUT, OCTOBRE, DECEMBRE};
		}
	static Mois getFevrier()
		{
		Mois FEVRIER;
		return getFevrier();
		}			
}		
		//private static final List<Integer> MOIS = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12); // Mois et leur index



	

	

