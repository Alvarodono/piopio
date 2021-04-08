package pioupiou;

public class Jokalaria {
	
	//ATRIBUTUAK
	private int adina;
	private ListaKarta eskukoKartak;
	
	//ERAIKITZAILEA
	public Jokalaria(int pAdina) {
		this.adina = pAdina;
	}
	
	//BESTE METODOAK
	public ListaKarta getEskukoKartak() {
		return this.eskukoKartak;
	}
}
