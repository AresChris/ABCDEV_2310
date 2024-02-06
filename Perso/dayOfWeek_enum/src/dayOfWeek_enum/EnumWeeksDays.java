package dayOfWeek_enum;

public enum EnumWeeksDays {
	
	
	LUNDI(1),
	MARDI(2),
	MERCREDI(3),
	JEUDI(4),
	VENDREDI(5),
	SAMEDI(6),
	DIMANCHE(7);

	private int index;

	EnumWeeksDays(int index)
		{
		this.index = index;
		}
	void EnumWeeksDays(int index2) 
		{
		getIndex();
		}
	// Getters
	public int getIndex()
		{
		return index;
		}
	public void getEnumWeeksDays(int index)
		{
		EnumWeeksDays(index);
		}
	// Fin des getters
	
}
	
