package pioupiou;

public class JokalariCPU extends Jokalaria{
	//ATRIBUTUAK
	private String izena;
	private ListaKarta eskukoKartak;
	private ListaArrautza eskukoArrautzak;
	
	//ERAIKITZAILEA 
	public JokalariCPU(int pAdina) {
		super(pAdina);
		this.izena = "CPU"; 
	}
	
	//BESTE METODOAK	
	//JOKALDIA EGIN METODOA
	public void jokaldiaEgin() {
		
	}
	
	//JOKALDI EXTRA EGIN METODOA
		public void jokaldiExtraEgin() {
			
		}
	
	
	//TURNOA BUKATU METODOA
	public void turnoaBukatu() {
		
	}
	
	
	//KONBINAZIO ONENA METODOA
	public ListaKarta konbinazioOnena() {
		int i = 0;
		Karta k = null;
		Karta kt = this.getEskukoKartak().getKarta(i);
		String ktm = kt.getMota();					
	}
	
	
	
	
}
