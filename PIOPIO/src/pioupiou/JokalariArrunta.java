package pioupiou;

public class JokalariArrunta extends Jokalaria {
	
	//ATRIBUTUAK
	private String izena;
	
	
	//ERAIKITZAILEA
	public JokalariArrunta(String pIzena, int pAdina){
		super(pAdina);
		this.izena = pIzena;
	}
	
	//BESTE METODOAK
	//IMPRIMATU ESKUA METODOA
	public void imprimatuEskua() {
		System.out.println("Zure eskuko kartak:");
		System.out.println(" ");
		this.getEskukoKartak().imprimatuKartak();
	}
	
	//JOKALDIA EGIN METODOA
	public void jokaldiaEgin() {
		
	}
	
	//AUKERATU ESKUKO KARTA METODOA
	public void aukeratuEskukoKarta() {
		
	}
	
	//AUKERATU MAHAIKO KARTAK METODOA
	public void aukeratuMahaikoKartak() {
		
	}
	
	//MAHAIKO AUKERAKETA EGIN
	public void mahaikoAukeraketaEgin() {
		
	}
	
	//TURNOA BUKATU METODOA
	public void turnoaBukatu() {
		
	}

}
