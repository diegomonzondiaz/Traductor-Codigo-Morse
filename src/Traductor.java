// LIBRERIAS UTILIZADAS
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;


public class Traductor {    
			// METODOS DE ESCANER Y HASHTABLE
	private Hashtable<String, String> letrasycodigo;
	
		
	public Traductor () {
			// TABLA DE LETRAS EN PARES ORDENADOS
			letrasycodigo = new Hashtable <String,String>();
			letrasycodigo.put("A", ".-" );
			letrasycodigo.put("B", "-...");
			letrasycodigo.put("C", "-.-.");
		    letrasycodigo.put("D", "-..");
		    letrasycodigo.put("E", ".");
		    letrasycodigo.put("F", "..-.");
		    letrasycodigo.put("G", "--.");
		    letrasycodigo.put("H", "....");
		    letrasycodigo.put("I", "..");
		    letrasycodigo.put("J", ".---");
		    letrasycodigo.put("K", "-.-");
		    letrasycodigo.put("L", ".-..");
		    letrasycodigo.put("M", "--");
		    letrasycodigo.put("N", "-.");
		    letrasycodigo.put("O", "---");
		    letrasycodigo.put("P", ".--.");
		    letrasycodigo.put("Q", "--.-");
		    letrasycodigo.put("R", ".-.");
		    letrasycodigo.put("S", "..." );
		    letrasycodigo.put("T", "-");
		    letrasycodigo.put("U", "..-");
		    letrasycodigo.put("V", "...-");
		    letrasycodigo.put("W", ".--");
		    letrasycodigo.put("Y", "-.--");
		    letrasycodigo.put("X", "-..-");
		    letrasycodigo.put("Z", "--..");
		    letrasycodigo.put("!", "No tiene traduccion");
		    letrasycodigo.put("@", "No tiene traduccion");
		    letrasycodigo.put("#", "No tiene traduccion");
		    letrasycodigo.put("$", "No tiene traduccion");
		    letrasycodigo.put("%", "No tiene traduccion");
		    letrasycodigo.put("&", "No tiene traduccion");
		    letrasycodigo.put("/", "No tiene traduccion");
		    letrasycodigo.put("(", "No tiene traduccion");
		    letrasycodigo.put(")", "No tiene traduccion");
		    letrasycodigo.put("=", "No tiene traduccion");
		    letrasycodigo.put("*", "No tiene traduccion");
		    letrasycodigo.put(";", "No tiene traduccion");
		    letrasycodigo.put("a", ".-" );
			letrasycodigo.put("b", "-...");
			letrasycodigo.put("c", "-.-.");
		    letrasycodigo.put("d", "-..");
		    letrasycodigo.put("e", ".");
		    letrasycodigo.put("f", "..-.");
		    letrasycodigo.put("g", "--.");
		    letrasycodigo.put("h", "....");
		    letrasycodigo.put("i", "..");
		    letrasycodigo.put("j", ".---");
		    letrasycodigo.put("k", "-.-");
		    letrasycodigo.put("l", ".-..");
		    letrasycodigo.put("m", "--");
		    letrasycodigo.put("n", "-.");
		    letrasycodigo.put("o", "---");
		    letrasycodigo.put("p", ".--.");
		    letrasycodigo.put("q", "--.-");
		    letrasycodigo.put("r", ".-.");
		    letrasycodigo.put("s", "..." );
		    letrasycodigo.put("t", "-");
		    letrasycodigo.put("u", "..-");
		    letrasycodigo.put("v", "...-");
		    letrasycodigo.put("w", ".--");
		    letrasycodigo.put("y", "-.--");
		    letrasycodigo.put("x", "-..-");
		    letrasycodigo.put("z", "--..");
		    letrasycodigo.put("1", ".----");
		    letrasycodigo.put("2", "..---");
		    letrasycodigo.put("3", "...--");
		    letrasycodigo.put("4", "....-");
		    letrasycodigo.put("5", ".....");
		    letrasycodigo.put("6", "-....");
		    letrasycodigo.put("7", "--...");
		    letrasycodigo.put("8", "---..");
		    letrasycodigo.put("9", "----.");
		    letrasycodigo.put("0", "-----");
		    letrasycodigo.put(".-", "A");
			letrasycodigo.put("-...", "B");
			letrasycodigo.put("-.-.", "C");
		    letrasycodigo.put("-..", "D");
		    letrasycodigo.put(".", "E");
		    letrasycodigo.put("..-.", "F");
		    letrasycodigo.put("--.", "G");
		    letrasycodigo.put("....", "H");
		    letrasycodigo.put("..", "I");
		    letrasycodigo.put(".---", "J");
		    letrasycodigo.put("-.-", "K");
		    letrasycodigo.put(".-..", "L");
		    letrasycodigo.put("--", "M");
		    letrasycodigo.put("-.", "N");
		    letrasycodigo.put("---", "O");
		    letrasycodigo.put(".--.", "P");
		    letrasycodigo.put("--.-", "Q");
		    letrasycodigo.put(".-.", "R");
		    letrasycodigo.put("...", "S" );
		    letrasycodigo.put("-", "T");
		    letrasycodigo.put("..-", "S");
		    letrasycodigo.put("...-", "V");
		    letrasycodigo.put(".--", "W");
		    letrasycodigo.put("-.--", "Y");
		    letrasycodigo.put("-..-", "X");
		    letrasycodigo.put("--..", "Z");
		   
	}
	
	
	
	// FUNCION DE TRADUCIR TEXTO A CODIGO
	private String traducirTextoACodigo(String texto) {
		String salida = "";
		//Partir es para separar por letras el texto a traducir
		String[] partir = texto.split("(?!^)");
   		//System.out.println("Su traduccion es");
		// BUCLE PARA TRADUCIR EL TEXTO A CODIGO
		for (int i=0; i<texto.length(); i++) { 
			String a= partir[i];
			String Letra= letrasycodigo.get(a);
			System.out.print(Letra);
			salida = salida + " " + Letra;
			// salida es la variable en la que se almacena y luego muestra la  traduccion
		}
		
		return salida;
   }
	// FUNCION DE TRADUCIR CODIGO A TEXTO
	private String traducirCodigoATexto(String texto) {
	   
	    String Salida = "";
	   
   		String[] Partir = texto.split(" ");
   		// BUCLE PARA TRADUCIR EL CODIGO A TEXTO
   		for(int i = 0; i <Partir.length; i++){
   			String traduccion= letrasycodigo.get(Partir [i]);
          	Salida = Salida + " " + traduccion;
         // salida es la variable en la que se almacena y luego muestra la  traduccion
   		}
   		
   		return Salida;
   }
   //IDENTIFICAR DE QUE A QUE SE TRADUCE
  public String Traducir (String texto) {
	  
	    String salida = "";
	    //String texto;
	    //System.out.println("escriba lo que desea traducir");
	    // texto= teclado.nextLine();
	    // SACAR LOS ESPACIOS COMO DICE ES PARA QUE NO QUEDEN ESPACIOS Y PARA SEPARAR LAS LETRAS Y TRADUCIRLAS
	  	String Sinespacio= texto.replaceAll("\s+","");
	    String[] split = Sinespacio.split("(?!^)");
	    List<String> temp= new ArrayList<>(Arrays.asList(split));
	    boolean bar= temp.contains("-");
	    boolean dot = temp.contains(".");
	    if ( (bar != true) || (dot != true)) {
	    	salida=traducirTextoACodigo(Sinespacio);
	    }
	      else {
	    	salida= traducirCodigoATexto(texto);
	     }
	    
	    return salida;
  }
}