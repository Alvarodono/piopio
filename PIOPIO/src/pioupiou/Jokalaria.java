package pioupiou;

public class Jokalaria {
	
	//ATRIBUTUAK
	private int adina;
	private static ListaKarta nireEskukoKartak = null;
	private static ListaArrautza nireEskukoArrautzak;
	private Konbinazioak konbi;
	private int puntuak;
	private boolean azeriaErabiliDu = false;
	
	//ERAIKITZAILEA
	protected Jokalaria(int pAdina) {
		this.adina = pAdina;
		this.konbi = Konbinazioak.getNireKonbinazioak();
		this.puntuak = 0;
	}	
	
	//BESTE METODOAK
	//GET NIRE ESKUKO KARTAK METODOA
	public static synchronized ListaKarta getNireEskukoKartak() {
		if (nireEskukoKartak == null) {
			nireEskukoKartak = new ListaKarta();
		}
		return nireEskukoKartak;
	}
	
	//GET NIRE ESKUKO ARRAUTZAK METODOA
	public static synchronized ListaArrautza getNireEskukoArrautzak() {
		if (nireEskukoArrautzak == null) {
			nireEskukoArrautzak = new ListaArrautza();
		}
		return nireEskukoArrautzak;
	}
	
	//GET ADINA METODOA
	public int getAdina() {
		return this.adina;
	}
	
	//GET KONBINAZIOAK METODOA
	protected Konbinazioak getKonbinazioak() {
		return this.konbi;
	}
	
	//PUNTUAK ERRESETEATU METODOA
	public void puntuakErreseteatu() {
		puntuak = 0;
	}
	
	//DENA ERRESETEATU METODOA 
	public void denaErreseteatu() {
		this.getNireEskukoKartak().erreseteatu();
		this.getNireEskukoArrautzak().erreseteatu();
		puntuakErreseteatu();
	}
	
	//GET PUNTUAK METODOA
	public int getPuntuak() {
		return this.puntuak;
	}
	
	//GET AZERIA ERABILI DU METODOA
	public boolean azeriaErabiliDu() {
		return this.azeriaErabiliDu;
	}
	
	
	
	
	
	
	
	
	
}
