import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Reloj
{
	private static Reloj miReloj = new Reloj();
	private long momentoCero; 
	
	private Reloj()
	{
		
	}
	
	public static Reloj getReloj()
	{
		return miReloj;
	}

	public void imprimirHoraActual()
	{
		Calendar c = new GregorianCalendar();
		int h12, h24, min, seg;

		h12 = c.get(Calendar.HOUR);
		h24 = c.get(Calendar.HOUR_OF_DAY);
		min = c.get(Calendar.MINUTE);
		seg = c.get(Calendar.SECOND);
		
		System.out.println(String.format("(Formato 24h) Son las %02d:%02d:%02d", h24, min, seg));
		System.out.println(String.format("(Formato 12h) Son las %02d:%02d:%02d", h12, min, seg));
	}
	
	public void ponerACero()
	{
		this.momentoCero = System.currentTimeMillis();
	}
	
	public int obtenerSegundosTranscurridos()
	{
		return (int) (System.currentTimeMillis() - momentoCero) / 1000;
	}
	
	public void pausar(int pSegundos)
	{
		 try {
			Thread.sleep(pSegundos*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
