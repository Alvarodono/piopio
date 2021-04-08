import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Baraja {

	private static Baraja miBaraja = new Baraja();
	private ArrayList<Carta> cartas;

	private Baraja(){
		cartas = new ArrayList<Carta>();
		this.cargarBaraja();
	}

	private void cargarBaraja()
	{
		String[] nombres = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey"};
		String[] palos = {"Oros", "Copas", "Bastos", "Espadas"};
		double[] valoresSieteYMedio = {1,2,3,4,5,6,7,0.5,0.5,0.5};

		for(String nom : nombres)
		{
			int pos = 0;
			for (String pal : palos)
			{
				Carta c = new Carta(nom, pal, valoresSieteYMedio[pos]);
				anadirCarta(c);
				pos ++;
			}
		}
	}

	public static Baraja getBaraja()
	{
		return miBaraja;
	}

	private Iterator<Carta> getIterador()
	{
		return cartas.iterator();
	}
	
	public void barajar()
	{
		Collections.shuffle(this.cartas);
	}

	public Carta robar()
	{
		Carta cartaDev = this.cartas.get(0);
		this.cartas.remove(cartaDev);
		return cartaDev;
	}

	public void anadirCarta(Carta pCarta)
	{
		this.cartas.add(pCarta);
	}
	
	public void imprimirBaraja()
	{
		for (Carta c : this.cartas)
		{
			c.imprimir();
		}
	}
	
	private Carta buscarCarta(String pNombre, String pPalo)
	{
		boolean enc = false;
		Iterator<Carta> itr = this.getIterador();
		Carta unaCarta = null;
		
		while(!enc && itr.hasNext())
		{
			unaCarta = itr.next();
			if(unaCarta.getPalo().equalsIgnoreCase(pPalo) && unaCarta.getNombre().equalsIgnoreCase(pNombre))
			{
				enc = true;
			}
		}
		
		if(!enc)
		{
			unaCarta = null;
			System.out.println("Baraja.buscarCarta() no encuentra la carta " + pNombre + " de " + pPalo);
		}
		
		return unaCarta;
	}
	
	public void colocarCarta(String pNombre, String pPalo, int pPos)
	{
	     Carta laCarta = buscarCarta(pNombre, pPalo);    
	     this.cartas.remove(laCarta);
	     this.cartas.add(pPos, laCarta);
	}


}
