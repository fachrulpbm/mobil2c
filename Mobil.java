public class Mobil{

	int kecepatan;
	int ban;	
	int spion;
	String merk;
	int fuel;
	int maxFuel;

	public void maju(){
		System.out.println("Mobil majuuu..");
	}

	public void mundur(){
		System.out.println("Mobil munduuur..");
	}

	public int addKecepatan(int a){
		return kecepatan = kecepatan + a;
	}

	public int showKecepatan(){
		return kecepatan;
	}

	public String showMerk(){
		return merk;
	}

	public int fillingFuel(int bensin){		
		if( (fuel + bensin) <= maxFuel ){
			fuel = fuel + bensin;
			return fuel;
		}else{
			return -1;
		}
	}
	
}