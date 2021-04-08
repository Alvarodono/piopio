import java.util.Random;


public class Dado
{
	private static Dado miDado = new Dado(6);
	
	private int nCaras;
	
	private Dado(int pnumCaras)
	{
		this.nCaras = pnumCaras;
	}
	
	public static Dado getDado()
	{
		return miDado;
	}
	
	public int tirarDado()
	{
	   Random r = new Random();
	   int tirada = r.nextInt(nCaras) + 1;
	   return tirada;
	}

	public int tirarDadoTrucado()
	{
	   return Teclado.getTeclado().leerEntero("Elige el valor de la tirada (entre 1 y " + nCaras + "): ", 1, nCaras);
	}

}
