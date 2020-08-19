package MultiLevel_Inheritance;

public class WorkerDetail {
	String code;
	String name;
	int sal;
	public WorkerDetail()
	{
		this.code=code;
		this.name=name;
		this.sal=sal;
	}
	public double hra()
	{
		System.out.println(sal);
		return(0.6f*sal);
	}
}
