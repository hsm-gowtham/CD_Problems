package MultiLevel_Inheritance;

public class OfficerSal extends WorkerDetail{
	public OfficerSal() {
		super(code,name,sal);
		
	}

	public double da()
	{
		return(0.98f*sal);
	}
}
