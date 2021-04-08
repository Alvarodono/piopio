
import java.util.ArrayList;
import java.util.Iterator;

public class ListaStrings
{
	private ArrayList<String> lista;
		
	public ListaStrings()
	{
		this.lista = new ArrayList<String>();
	}

	private Iterator<String> getIterador()
	{
		return lista.iterator();
	}
	
	public void imprimir()
	{
		Iterator<String> it = this.getIterador();
		
		while(it.hasNext())
		{
			String unString = it.next();
			System.out.println(unString);
		}
	}
	
	public boolean esta(String pString)
	{
		Iterator<String> it = this.getIterador();
		boolean enc = false;
		
		while(it.hasNext() && !enc) 
		{
			String unString = it.next();
			if (unString.equalsIgnoreCase(pString))
			{
				enc = true;
			}
		}
		return enc;
	}
	
}
