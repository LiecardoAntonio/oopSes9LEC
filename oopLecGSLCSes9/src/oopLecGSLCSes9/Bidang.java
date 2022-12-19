package oopLecGSLCSes9;

public abstract class Bidang {
	// bidang menjadi parent class untuk Lingkaran dan Persegi
	private String nama;
	
	public Bidang(String nama){
		super();
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public abstract void hitungLuas();
	public abstract void hitungKeliling();
}
