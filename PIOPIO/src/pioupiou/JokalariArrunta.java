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
	
	//

}
