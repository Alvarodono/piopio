package pioupiou;


import java.util.Random;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class ListaJokalaria {
	
	//ATRIBUTUAK
	private Jokalaria[]lista;
	private static ListaJokalaria nireListaJokalaria = null;
	private int jokalariKop = 2;
	
	//ERAIKITZAILEA
	public ListaJokalaria() {
		this.lista = new Jokalaria[this.jokalariKop];
	}
	
	//BESTE METODOAK
	//GET NIRE LISTA JOKALARIAK METODOA	
	public static synchronized ListaJokalaria getNireListaJokalariak() {
		if (ListaJokalaria.nireListaJokalaria == null) {
			ListaJokalaria.nireListaJokalaria = new ListaJokalaria();
		}
		return ListaJokalaria.nireListaJokalaria;		
	}
	
	//GET ZERRENDA METODOA
	public Jokalaria[] getZerrenda() {
		return lista;
	}
	
	
	//IRAKURRI METODOA
	public static void irakurri(File txt){
		FileReader fr=null;
		BufferedReader br=null;
		
		try{
			fr= new FileReader(txt);
			br= new BufferedReader(fr);
			String lerroa;
			while((lerroa=br.readLine())!=null)
				System.out.println(lerroa);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	//PARTIDA HASIERATU METODOA
	public void partidaHasieratu() {
		File txt= new File ("E:/Alvaro/pmoo/PIOU PIOU/res/Hasiera.txt");
		irakurri(txt);
		System.out.println("Sakatu 1 jolasteko edo 2 arauak irakurtzeko");
		int sarrera = Teklatua.getNireTeklatua().irakurriOsoa();
		try{
			if(sarrera==1){
				partidaJolastu();
			}
			else if(sarrera==2){
				File txt1= new File ("E:/Alvaro/pmoo/PIOU PIOU/res/Arauak.txt");
				irakurri(txt1);
				System.out.println("Sakatu enter menura itzultzeko");
				Teklatua.getNireTeklatua().irakurriEnter();
				partidaHasieratu();
				}			
			else
				throw new HasieranAukeraOkerraSalbuespena();
		}catch(HasieranAukeraOkerraSalbuespena e){
			e.inprimatuMezua();
			partidaHasieratu();
		}
	}
	
	//TXANDA JOLASTU METODOA
	public void txandaJolastu() {
		
	}
	
	//TXANDA BUKATU METODOA
	public void txandaBukatu() {
		
	}
	
	//KARTAK BANATU METODOA
	public void kartakBanatu() {
		int kont = 4;
		while (kont > 0) {
			Karta k = null;
			k = HasierakoBaraja.getNireHasierakoBaraja().banaketa();
			this.getZerrenda()[0].getEskukoKartak().gehituKarta(k);
			k = HasierakoBaraja.getNireHasierakoBaraja().banaketa();
			this.getZerrenda()[1].getEskukoKartak().gehituKarta(k);
			kont--;
		}
	}		
	
	
	
	//PARTIDA JOLASTU METODOA	
	public void partidaJolastu() {
		int j,m;
		System.out.println("Sartu zure izena");		
		String izena = Teklatua.getNireTeklatua().irakurriString();
		System.out.println("Sartu zure adina");
		Teklatua.getNireTeklatua();
		int adina = Teklatua.irakurriZenb();
		Random rd = new Random();
		int adinaCPU = rd.nextInt(100)+1;
		ListaJokalaria.getNireListaJokalariak().getZerrenda()[j] = new JokalariArrunta(izena,adina);
		ListaJokalaria.getNireListaJokalariak().getZerrenda()[m] = new JokalariCPU(adinaCPU);
		if (adinaCPU > adina) {
			System.out.println("Makina lehenengo jokalaria da");
			m = 0;
			j = 1;
		}
		else {
			System.out.println("Lehenengo jokalaria zara");
			j = 0;
			m = 1;
		}
		while (!bukaera()) {
			rondaJolastu();
			rondaBukatu();
		}
	}
	
	
	
	//JOKOA BERRABIARAZI METODOA
	public void jokoaBerrabiarazi() {
		this.getZerrenda()[0].denaErreseteatu();
		this.getZerrenda()[1].denaErreseteatu();
		HasierakoBaraja.getNireHasierakoBaraja().reset();
		ListaKartaBaztertzeko.getnNireListaKartaBaztertzeko().erreseteatu();
		ListaKartaHartzeko.getListaKartaHartzeko().erreseteatu();		
	}
	
	
	
	//BUKAERA METODOA
	public boolean bukaera() {
		return this.getZerrenda()[0].getPuntuak() == 3 || this.getZerrenda()[1].getPuntuak() == 3;
	}
	
	//RONDA JOLASTU METODOA
	public void rondaJolastu() {
		this.jokoaBerrabiarazi();
		this.kartakBanatu();
		this.getZerrenda()[0].jokaldiaEgin();
		this.getZerrenda()[1].jokaldiaEgin();
	}
	
	
}
