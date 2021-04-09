package pioupiou;

public class Jokalaria {
	
	//ATRIBUTUAK
	private int adina;
	private ListaKarta eskukoKartak;
	private ListaArrautza eskukoArrautzak;
	private Konbinazioak konbi;
	
	//ERAIKITZAILEA
	public Jokalaria(int pAdina) {
		this.adina = pAdina;
		this.konbi = Konbinazioak.getNireKonbinazioak();
	}	
	
	//BESTE METODOAK
	//GET ESKUKO KARTAK METODOA
	public ListaKarta getEskukoKartak() {
		return this.eskukoKartak;
	}
	
	//GET ESKUKO ARRAUTZAK METODOA
	public ListaArrautza getEskukoArrautzak() {
		return this.eskukoArrautzak;
	}
	
	//GET ADINA METODOA
	public int getAdina() {
		return this.adina;
	}
	
	//GET KONBINAZIOAK METODOA
	protected Konbinazioak getKonbinazioak() {
		return this.konbi;
	}
	
	
	
	
	
}
