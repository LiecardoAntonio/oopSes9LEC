package oopLecGSLCSes9;

public class Persegi extends Bidang{
	private int panjang;
	private int lebar;
	

	public Persegi(String nama, int panjang, int lebar) {
		super(nama);
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public int getPanjang() {
		return panjang;
	}

	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}

	public int getLebar() {
		return lebar;
	}

	public void setLebar(int lebar) {
		this.lebar = lebar;
	}
	
	// method override dari abstract class Bidang yang menjadi parent class dari class ini
	@Override
	public void hitungLuas() {
		System.out.println(panjang*lebar);
	}

	@Override
	public void hitungKeliling() {
		System.out.println(2*(panjang+lebar));
	}
	
}
