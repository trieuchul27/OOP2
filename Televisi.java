//Nama  : Euis Sulastri
//Kelas : TIF W14

class Televisi{
	//Atribut class pada Televisi{
	String warna;
	String merk;
	String type;
	
	
	void dinyalakanTelevisi(){
		System.out.println("Televisi Dinyalakan");
	}
	
	void ditonton(){
		System.out.println("Televisi Ditonton");
	}
	
	void dimatikan(){
		System.out.println("Televisi Dimatikan");
	}
	
	public static void main(String[] args){
		Televisi Tvku =new Televisi(); //class yang Dibuat
		Tvku.warna="Hitam"; //Memakai data warna
		Tvku.merk="TV Sharp"; //Memakai data Merk
		Tvku.type="LCD"; //Memakai data Type
		
		System.out.println(Tvku.warna);
		System.out.println(Tvku.merk);
		System.out.println(Tvku.type);
		
		//Memanghil method dinyalakanTelevisi
		Tvku.dinyalakanTelevisi();
		//Memanggil Method ditonton
		Tvku.ditonton();
		//Memanggil Method dimatikan
		Tvku.dimatikan();
	}
}