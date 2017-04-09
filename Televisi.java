//Nama  : Euis Sulastri
//Kelas : TIF W14
class Televisi {
	
	public void ditonton() {
	  System.out.println ("Televisi dapat Ditonton");

	}
}
 class Plasma extends Televisi{
 public void ditonton() {
 System.out.println ("TV Plasma dapat ditonton");
 super.ditonton();
 }
 }