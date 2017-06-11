
public class GenApp{
	private static <T> void printArray(T[] a)
	{
		for (Object o : a){
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		Integer iArr[] = new Integer[3];
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		printArray(iArr);

		String sArr[] = new String[3];
		sArr[0] = "Sepuluh";
		sArr[1] = "Duapuluh";
		sArr[2] = "Tigapuluh";
		printArray(sArr);

		Double dArr[] = new	 Double[3];
		dArr[0] = 1.1;
		dArr[1] = 2.0;
		dArr[2] = 3.0;
		printArray(dArr);

		Character cArr[] = new	 Character[3];
		cArr[0] = 'b';
		cArr[1] = 'c';
		cArr[2] = 'j';
		printArray(cArr);


	}
}