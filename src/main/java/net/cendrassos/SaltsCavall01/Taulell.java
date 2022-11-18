package net.cendrassos.SaltsCavall01;

public class Taulell {
	int[][] taulell = new int [8][8];			// taulell amb el cavall
	int salt = 0; 
	
	
	public Taulell() {
		salt = 1; 				// primer salt
		
		// inicialització taulell
		
		for (int x = 0; x < 8; x++)
			for (int y = 0; y < 8; y++)
				taulell[x][y] = -1;
	}
	
	
	int mou(int i, int j) {
		int r = 0;
		
		if (taulell[i][j] != -1)
			taulell[i][j] = salt++; 		
		else 
			r = -1;							// moviment a una posició ja visitada
		return r;
	}
	
	// donada una posició (col,fila) torna conversió notació escacs
	
	String xy2escacs(int i, int j) {
		String s = "00";
		
		// columna ASCII a:97 a h:104 
		char c = (char) (i += 97); 
		s = String.valueOf(c);
		
		// fila +1
		
		s += String.valueOf(j+1);
		
		return s;
	}
	
	/*
	 * Donada una posició (col,fil) torna una matriu amb les posicions a les que es pot 
	 * moure el cavall
	 */
	
	int[][] mPosicions(int i, int j){
		int [][] s = new int[8][8];
		
		for(int p = 1, n = -1; p < 2 & n < -2; p++, n--) {
			
		}
		
		// (i-1,j-2/j+2)
		
		// (i-2,j-1/j+1)
		
		// (i+1,j-2/j+2)
		
		// (i+2,j-1/j+1)
		
		return s;
	}
	
	

}
