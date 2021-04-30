package pioupiou;


public class ListaArrautzaHartzeko {
	
	//ATRIBUTUAK
	private ListaArrautza lista;
	private static ListaArrautza NireListaArrautzaHartzeko = null;
	
	//ERAIKITZAILEA 
	private ListaArrautzaHartzeko() {
		this.lista = new ListaArrautza();
	}
	
	//BESTE METODOAK
	//GET NIRE LISTA ARRAUTZA HARTZEKO 
	public static synchronized ListaArrautza getNireListaArrautzaHartzeko() {
		if(NireListaArrautzaHartzeko == null) {
			NireListaArrautzaHartzeko = new ListaArrautza();
		}
		return NireListaArrautzaHartzeko;
	}

}
