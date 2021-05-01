package pioupiou;

public abstract class Jokalaria {
	
	//ATRIBUTUAK
	private int adina;
	private Konbinazioak konbi;
	private int puntuak;
	private boolean azeriaErabiliDu = false;
	private ListaKarta eskukoKartak;
	private ListaArrautza eskukoArrautzak;
	
	//ERAIKITZAILEA
	protected Jokalaria(int pAdina) {
		this.eskukoKartak = new ListaKarta();
		this.eskukoArrautzak = new ListaArrautza();
		this.adina = pAdina;
		this.konbi = Konbinazioak.getNireKonbinazioak();
		this.puntuak = 0;
	}	
	
	//BESTE METODOAK
	//GET  ESKUKO KARTAK METODOA
	protected ListaKarta getEskukoKartak(){
		return this.eskukoKartak;
	}
		
	//GET ESKUKO ARRAUTZAK METODOA
	protected ListaArrautza getEskukoArrautzak(){
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
	
	//PUNTUAK ERRESETEATU METODOA
	public void puntuakErreseteatu() {
		puntuak = 0;
	}
	
	//DENA ERRESETEATU METODOA 
	public void denaErreseteatu() {
		this.getEskukoKartak().erreseteatu();
		this.getEskukoArrautzak().erreseteatu();
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
	
	
	//JOKALDIA EGIN METODOA
	public abstract void jokaldiaEgin();
	
	
	
	
	
	
	
	
	
}
