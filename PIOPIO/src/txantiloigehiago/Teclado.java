

import java.util.Scanner;

public class Teclado
{
	private Scanner sc;
	private static Teclado miTeclado = new Teclado();
	
	public static Teclado getTeclado()
	{
		return miTeclado;
	}
	
	private Teclado()
	{
		sc = new Scanner(System.in);
	}
	
	
	public String leerString(String pMensaje)
	{
		System.out.println(pMensaje);
		String rdo = sc.nextLine();
		return rdo;
	}
	
	public int leerEntero(String pMensaje, int pDesde, int pHasta)
	{
		int rdo = pDesde -1;

		do
		{
			System.out.println(pMensaje);
			String str = sc.nextLine();
			try
			{
				rdo = Integer.parseInt(str);
			}
		    catch (Exception e)
			{
		    	System.out.println("Valor no válido");
			}
		
		}while(rdo < pDesde || rdo >pHasta);
		
		return rdo;
	}
	
	public boolean leerSiNo(String pMensaje, String pSi, String pNo)
	{
		String rdo;
		do
		{
			System.out.println(pMensaje);
			rdo = sc.nextLine();
		}while(!rdo.equalsIgnoreCase(pNo) && !rdo.equalsIgnoreCase(pSi));
		
		return rdo.equalsIgnoreCase(pSi);
	}
	
	public String leerOpcion(String pMensaje, ListaStrings pLista)
	{
		String rdo;
		do
		{
			System.out.println(pMensaje);
			pLista.imprimir();
			rdo = sc.nextLine();
		}while(!pLista.esta(rdo));
		
		return rdo;
		
	}
	


}
