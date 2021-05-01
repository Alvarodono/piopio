package pioupiou;

public class JokalariArrunta extends Jokalaria {
	
	//ATRIBUTUAK
	private String izena;
	private int aukera=0;
	
	
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
		this.getNireEskukoKartak().imprimatuKartak();
	}
	
	//JOKALDIA EGIN METODOA
	public void jokaldiaEgin() {
		int sarrera;
		imprimatuEskua();
		if(!this.getKonbinazioak().konbinazioNormalikAhalDago(getNireEskukoKartak())) {
			System.out.println("Baztertu karta bat");
			sarrera = Teklatua.getNireTeklatua().irakurriOsoa();
			ListaKartaBaztertzeko.getnNireListaKartaBaztertzeko().gehituKarta(this.getNireEskukoKartak().getKarta(sarrera));
			this.getNireEskukoKartak().kenduKartaZenbakiz(sarrera);
			this.getNireEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
			
				
			
		}
		
		
		
		
		 
		
	}
	
	//AUKERATU ESKUKO KARTA METODOA
	public Karta aukeratuEskukoKarta() {
		Karta k=null;
		Boolean denaOndo=false;
		String sarrera=Teklatua.getNireTeklatua().irakurriString();
		try {
			aukera=Integer.parseInt(sarrera);
			denaOndo=true;
		}catch(NumberFormatException e) {
			System.out.println("Sarrera zenbaki bat izan behar da.");
			this.aukeratuEskukoKarta();
		}
		if(denaOndo) {	
			try {
				k=getNireEskukoKartak().getKarta(aukera-1);
			}catch(IndexOutOfBoundsException e){
				System.out.println("Aukeratutako posizioan ez dago kartarik");
				this.aukeratuEskukoKarta();
			}
		}
		return k;
		
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
