public class RunPower{

	public static void main(String[] args){
		Socket runNuclear = new NuclearPower();
		System.out.println(runNuclear.getPower());
		runNuclear.countPower();

		Socket runPanas   = new PanasPower();
		System.out.println(runPanas.getPower());
		runPanas.countPower();
	}

}