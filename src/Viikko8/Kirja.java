package Viikko8;

public class Kirja {

	private String nimi;
	private String isbn;
	private double hinta;
	private int julkaisuvuosi;
	private Kustantaja kustantaja;
	
	public Kirja() {
		nimi = "";
		isbn = "";
		hinta = 0.00;
		julkaisuvuosi = 0;
		kustantaja = null;
	}

	public Kirja(String nimi, String isbn, double hinta, int julkaisuvuosi, Kustantaja kustantaja) {
		super();
		this.nimi = nimi;
		this.isbn = isbn;
		this.hinta = hinta;
		this.julkaisuvuosi = julkaisuvuosi;
		this.kustantaja = kustantaja;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public int getJulkaisuvuosi() {
		return julkaisuvuosi;
	}

	public void setJulkaisuvuosi(int julkaisuvuosi) {
		this.julkaisuvuosi = julkaisuvuosi;
	}

	public Kustantaja getKustantaja() {
		return kustantaja;
	}

	public void setKustantaja(Kustantaja kustantaja) {
		this.kustantaja = kustantaja;
	}

	@Override
	public String toString() {
		return "Kirja [nimi=" + nimi + ", isbn=" + isbn + ", hinta=" + hinta + ", julkaisuvuosi=" + julkaisuvuosi
				+ ", kustantaja=" + kustantaja + "]";
	}
	
}
