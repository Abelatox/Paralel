import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ParalelP2 {

	public static void main(String[] args)
	{
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader bufReader = new BufferedReader(isReader);
		String llegir = null;
	    try { 
	        llegir=bufReader.readLine();
	    }
	    catch (Exception e) {
	    
	    }
	    System.out.println(llegir);
	    String [] text = llegir.split(" ");
	    int[] nombres = new int[text.length];
	    int[] repetits = new int[10];
	    for(int i =0; i<nombres.length;i++){
	    	nombres[i] = Integer.parseInt(text[i]);
	    	System.out.print(nombres[i]+" ");
	    }
	    
	    for(int j=0;j<10;j++){
	    	for(int i=0;i<nombres.length;i++){
	    		if(nombres[i] == j){
	    			repetits[j]++;
	    		}
	    	}
	    }
	    
	    for(int i=0;i<repetits.length;i++){
	    	System.out.println(i+": "+repetits[i]);
	    }
	}
}