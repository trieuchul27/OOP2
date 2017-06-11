public class Konkrit  {
	private String  type;

	public String  getType(){
		return type;
	}

	public void setType(String  type) {
		this.type = type;
	}
	
	private static <N> void anythingYouWanted(N freePartType){
	   	System.out.println(freePartType);
	}
	public static void main (String[]args)
	{
		anythingYouWanted(2);
	}
}