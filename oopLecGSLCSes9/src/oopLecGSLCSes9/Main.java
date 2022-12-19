package oopLecGSLCSes9;

import oopLecGSLCSes9.Bidang;
import oopLecGSLCSes9.Lingkaran;
import oopLecGSLCSes9.Persegi;

public class Main {

	public Main() {
		// A. Penjelasan Project : 
		/* saya membuat abstract parent class Bidang yang akan menjadi parent bagi
		   class Lingkaran dan Persegi, disini saya menunjukkan pembuatan abstract method
		   yaitu method hitungLuas dan hitungKeliling di class Bidang yang nantinya akan 
		   saya override di class Lingkaran dan Persegi karna kedua child class tersebut
		   memiliki teknik perhitungan luas dan keliling yang berbeda. Selain itu,
		   saya juga membuat sebuah class intergace IBisaJadiRoda yang mengindikasikan sebuah
		   class itu memungkinkan untuk menjadi roda kendaraan, dan saya implements ke
		   class lingkaran karena lingkaran bisa jadi roda sedangkan class persegi tidak bisa
		*/
		
		// B. pembuatan objek
		// 1. membuat objek persegi
		Persegi persegi1 = new Persegi("Kotak", 15,15);
		persegi1.hitungLuas(); // menghitung luas persegi1
		persegi1.hitungKeliling(); // menghitung keliling persegi1
		
		// 2. membuat objek lingkaran
		Lingkaran lingkaran1 = new Lingkaran("Bulat", 14);
		lingkaran1.hitungLuas(); //menghitung luas lingkaran1
		lingkaran1.hitungKeliling(); // menghitung keliling lingkaran1
		lingkaran1.jadiRoda(); // mengindikasikan bahwa lingkaran bisa menjadi roda kendaraan
		
		
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
