public class Overloading {
public static void  main(String[] args) {
		MethodOverloading method = new MethodOverloading ();
		method.methodTampilkan("Belajar Java Yuks");
		method.methodTampilkan("Belajar Java Yuks","Hingga Mengerti");
	}
		 private void methodTampilkan (String nama){
		 System.out.println (nama);
	}
	private void methodTampilkan (String nama 1 ,String nama 2){
		System.out.println(nama1 + nama2);
	}
}