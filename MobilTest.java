public class MobilTest{
	public static void main(String []args){
		Mobil m1 = new Mobil();
		m1.maxFuel = 2000; //set maxFuel = 2000
		m1.fillingFuel(1500); //menambah nilai fuel = 1500
		m1.addKecepatan(50); //menambah nilai kecepatan = 50
		m1.merk = "Toyota";
		System.out.println(m1.showMerk()); //Toyota
	    System.out.println(m1.showKecepatan()); //menampilkan nilai kecepatan = 0		
	}
}











// m1.maju(); //majuuu
		// m1.mundur(); //mundur
		// m1.tambahKecepatan(50); //Tidak muncul apa-apa
		// System.out.println(m1.kecepatan); //50
		// m1.merk = "Daihatsu";
		// System.out.println(m1.lihatMerk()); //Daihatsu		

		// Mobil m2 = new Mobil();
		// System.out.println(m2.lihatMerk()); //Tidak muncul apa-apa //Daihatsu