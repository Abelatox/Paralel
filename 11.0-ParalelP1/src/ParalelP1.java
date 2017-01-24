public class ParalelP1 {
	public static void main(String[] args) {
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int freq = Integer.parseInt(args[2]);
		int longitud = ((max-min)+1)*freq;
		int[] array = new int[longitud];
		int comptador = 0;
		String resultat = "";
		
		for(int i=min;i<=max;){
			array[i-min] = i;
			resultat=resultat+i+" ";
			comptador++;
			if(comptador%freq==0)
				i++;
		}
		System.out.println(resultat.trim());
	}
}
