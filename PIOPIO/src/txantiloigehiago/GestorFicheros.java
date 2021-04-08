import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class GestorFicheros
{
	private static GestorFicheros miGF = new GestorFicheros();
	
	private GestorFicheros()
	{
		
	}
	
	public static GestorFicheros getGestorFicheros()
	{
		return miGF;
	}
	
	public void imprimirDatos(String pPathIn)
	{
	   InputStream fich = null;
	   try {
		fich = new FileInputStream(pPathIn);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   Scanner sc = new Scanner(fich);
	   while (sc.hasNextLine())
	   {
	      String linea = sc.nextLine();
	      System.out.println(linea);
	   }
	   sc.close();
	}

	public void escribirEnFicheroHolaMundo(String pPathOut)
	{
	     FileWriter fichero = null;
	     PrintWriter pw = null;

	     try {
			fichero = new FileWriter(pPathOut, true); // true: modo append
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	                                     
	     pw = new PrintWriter(fichero);

	     pw.println("Hola mundo!!");
	     pw.close();
	}

	
}
