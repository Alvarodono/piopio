package proiektua;
import java.util.*;

class Teklatua {

private static Scanner sc;
private static Teklatua nireTeklatua;

private Teklatua() {
this.sc= new Scanner(System.in);
}
public static Teklatua getNireTeklatua() {
if(nireTeklatua==null) {
nireTeklatua= new Teklatua();
}
return nireTeklatua;
}

public static int irakurriZenb() throws NumberFormatException {

//honela eginez gero,metodohonek ez du NumberFormatException salbuespena hemen tratatzen eta goratzen du
String sar= sc.nextLine();//Irakurri lerro bat enter sartu arte
int zenb= Integer.parseInt(sar);//saiatu bihurtzen idatzitakoa integer batetan
return zenb;

}


public String irakurriString(String pMezua)
	{
		System.out.println(pMezua);
		String emaitza = sc.nextLine();//irakurri teklatutik enter bat sartu arte
		return emaitza;
	}
	
public int irakurriInteger(String pMezua, int pNundik, int pNora)
	{//Kasu honetan
		int emaitza = pNundik -1;
                boolean denaOndo=false;
		do
		{
			System.out.println(pMezua);
			String str = sc.nextLine();
			try
			{
				emaitza = Integer.parseInt(str);
                               if(emaitza < pNundik || emaitza >pNora){
                                         throw new LimiteakGainditutaExc();//sortu beharkoduzue salbuezpen hau
                               }
                              denaOndo=true;
} 
                 catch (NumberFormatException e) { System.out.println("Balioa ez da numerikoa"); }
                 catch (LimiteakGainditutaExc e) { e.mezuaInprimatu(); }

 }while(!denaOndo);
 return emaitza; } 
public boolean irakurriBaiEz(String pMezua, String pBai, String pEz) { 
	String emaitza; 
	do { System.out.println(pMezua); 
	emaitza = sc.nextLine(); 
	}while(!emaitza.equalsIgnoreCase(pEz) && !emaitza.equalsIgnoreCase(pBai)); 
	return emaitza.equalsIgnoreCase(pBai); } 
public String irakurriAukera(String pMezua, ListaStrings pLista) { 
	String emaitza; 
	do { 
		System.out.println(pMezua); 
		pLista.inprimatu(); 
		emaitza = sc.nextLine(); 
		}while(!pLista.badago(emaitza)); 
	return emaitza; }
public void itxi()
{//metodo haubukabukaeraninbokatubehar da. Jokoa bukatzean
sc.close();
}


}