public class SuryaPower implements Power, Socket, Televisi{
	public String suryaPower(){
		return "Ini Surya Power";
	}
	
	public void ditonton(){
		System.out.println("Televisi dapat ditonton pada jam istirahat ");
	}

	public void dinyalakan(){
		System.out.println("Televisi dapat dinyalakan pada jam istirahat");
	}

	public String getPower(){
		return "Ini adalah tenaga Udara";
	}

	public void countPower(){
		System.out.println("Perhitungan tenaga Udara");
	}
}