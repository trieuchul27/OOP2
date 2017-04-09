public class TVsub extends TVsuper {
    String warna;
	String merk;
	int type = 50;
	
	
	public void dinyalakan(){
		System.out.println("Sub Televisi Dapat Dinyalakan");
	}
	
	public void ditonton(){
		System.out.println("Sub Televisi Dapat Ditonton");
	}
	
	public void dimatikan(){
		System.out.println("Sub Televisi Dapat Dimatikan");
	}

	public void TVsuper() {
		dinyalakan();
		super.dinyalakan();
		ditonton();
		super.ditonton();
		dimatikan();
		super.dimatikan();
		System.out.println("type pada sub kelas Televisi= " + type);
		System.out.println("type pada super kelas Televisi= " + super.type);
	}

	public static void main(String[] args){
		TVsub Tvku =new TVsub();
		Tvku.TVsuper();
	}
}