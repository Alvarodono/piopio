package pioupiou;


public class ListaArrautzaHartzeko {
	
	//ATRIBUTUAK
	public static ListaArrautza lista;
	private static ListaArrautzaHartzeko nireLista = null;
	public int kopurua = 0;
	
	//ERAIKITZAILEA 
	public ListaArrautzaHartzeko() {		
		lista = new ListaArrautza();
	}
	
	//BESTE METODOAK	
	//GET NIRE HASIERAKO BARAJA METODOA
	public static synchronized ListaArrautzaHartzeko getNireListaArrautzaHartzeko() {
		if (nireLista == null) {
			nireLista = new ListaArrautzaHartzeko();
		}
		return nireLista;
	}
		
		
	//GET KOPURUA METODOA
	public int getKopurua() {
		return this.kopurua;
	}
	
	//GET LISTA ARRAUTZA METODOA
	public static ListaArrautza getListaArrautza() {
		return lista;
	}

	//LISTA ARRAUTZA BETE METODOA
	public void listaArrautzaBete() {
		int i = 0;
		while (i<18) {
			lista.gehituArrautza(new Arrautza (false)); 
			kopurua++;
			i++;
		}
		this.kopurua = 18;			
	}

	//RESET METODOA
	public void reset() {
		lista.erreseteatu();
		listaArrautzaBete();
	}
}
