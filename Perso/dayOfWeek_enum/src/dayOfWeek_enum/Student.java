package dayOfWeek_enum;

public class Student {

	private StudentSchedule schedule;
	private String name;
	private boolean goToSchool;
	
	Student(String _name, boolean _goToSchool)
	{
		name = _name;
		goToSchool = _goToSchool;
	}
	/*boolean wakeUp()
	{
		if(this.getDaysOfWeek() == DaysOfWeek.DIMANCHE)
		{
			System.out.println("Restes au pieu gros !");
		}
		else
		{
			System.out.println("Debout, sors-toi les doigts !");
		}
		return true;
	}
	
	static void getSchedule()
	{
		StudentSchedule.jourSemaine();
	}
	static void getDaysOfWeek()
	{
		DaysOfWeek.DaysOfWeek();
	}*/
}
