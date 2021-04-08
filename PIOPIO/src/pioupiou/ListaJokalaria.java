package pioupiou;

import java.util.ArrayList;	
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class ListaJokalaria {
	
	//ATRIBUTUAK
	private Jokalaria[]lista;
	private static ListaJokalaria nireListaJokalaria = null;
	
	
	//ERAIKITZAILEA
	public ListaJokalaria() {
		this.lista = new Jokalaria[2];
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
		File txt= new File ("res/Hasiera.txt");
		irakurri(txt);
		int sarrera=Teklatua.getNireTeklatua().irakurriOsoa();
		try{
			if(sarrera==1){
				partidaJolastu();
			}
			else if(sarrera==2){
				File txt1= new File ("res/ARAUAK.txt");
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
		
		
	
	
	
	//PARTIDA JOLASTU METODOA	
	public void partidaJolastu() {
		
	}
	
	public void txandaJolastu() {
		
	}
	
	public void txandaBukatu() {
		
	}
	
	
}
