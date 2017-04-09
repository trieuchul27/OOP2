class Hewan {
	
	public void makan() {
	  System.out.println ("Hewan bisa makan");

	}
}
 class Ayam extends Hewan{
 public void makan() {
 System.out.println ("Ayam bisa makan");
 super.makan();
 }
 }