class Hewan {

	protected void nama () {
		System.out.println("Nama Hewan");
	}
}

class Ayam extends Hewan {

	
	protected void nama () {
		System.out.println("Nama Ayam");
	}
}
class Bebek extends Hewan {


protected void nama () {
	System.out.println("Nama Bebek");
}
}

public class MainHewan {

	public static void main(String[]args) {
		Hewan ayamBoiler = new Ayam ();
		Hewan bebekAngsa = new Bebek ();
		ayamBoiler.nama ();
		bebekAngsa.nama ();
	}
}