package pioupiou;

public class JokalariCPU extends Jokalaria{
	//ATRIBUTUAK
	private String izena;
	
	
	//ERAIKITZAILEA 
	public JokalariCPU(int pAdina) {
		super(pAdina);
		this.izena = "CPU"; 
	}
	
	//BESTE METODOAK
	//JOKALDIA EGIN METODOA
	public void jokaldiaEgin() {
		
	}
	
	
	//TURNOA BUKATU METODOA
	public void turnoaBukatu() {
		
	}
	
	
	//KONBINAZIO ONENA METODOA
	public ListaKarta konbinazioOnena() {
		int i = 0;
		Karta k = null;
		Karta kt = this.getNireEskukoKartak().getKarta(i);
		String ktm = kt.getMota();	
		
			
				
	}
	
	
}
