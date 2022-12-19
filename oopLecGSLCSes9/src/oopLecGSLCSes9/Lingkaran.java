package oopLecGSLCSes9;

public class Lingkaran extends Bidang implements IBisaJadiRoda{
	private int jari2;

	public Lingkaran(String nama, int jari2) {
		super(nama);
		this.jari2 = jari2;
	}

	public int getJari2() {
		return jari2;
	}

	public void setJari2(int jari2) {
		this.jari2 = jari2;
	}
	
	//method override dari abstract class Bidang yang menjadi parent class dari class ini
	@Override
	public void hitungLuas() {
		System.out.println((float)3.14*(jari2*jari2));
		
	}

	@Override
	public void hitungKeliling() {
		System.out.println((float)2*3.14*jari2);
	}

	//method override dari interface class IBisaJadiRoda yang diimplementasi ke class ini.
	@Override
	public void jadiRoda() {
		System.out.println(this.getNama() + " bisa jadi roda kendaraan!");
		
	}
}