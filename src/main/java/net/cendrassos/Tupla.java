package net.cendrassos.SaltsCavall01;

class Tupla {
	int c = 0; 			// column
	int r = 0;			// row
	
	public Tupla() {
		this.c = 0; this.r = 0;
	}
	
	public Tupla(int x, int y) {
		this.c = x; this.r = y;
	}
	
	
	/*
	 * Donat un moviment escats (Ca3: Cavall -> columna a, fila 3), retorna la Tupla amb posició columna, fila
	 * Moviment: Cf3 C:caval a columna:f fila:3
	 * Domini entrada:
	 * columna: a..h, ascii (97..104) fila: 1..8. 
	 * Domini sortida
	 * columna:0..7, fila:0..7
	 */
	public Tupla getTupla(String m) {
		char f = m.charAt(0); // figura: C = cavall, A: Alfil, P: peó ....
		Tupla t = new Tupla();
		
		t.c = ((int) m.substring(1, 1).charAt(0)) - 97; 		// ASCII(a) = 97
		t.r = ((int) m.substring(2, 1).charAt(0)) - 1;
		
		return (t);
	}
	
	public void setTupla(int x, int y) {
		this.c = x;
		this.r = y;
	}
	
	public void setCol(int x) {
		this.c = x;
	}
	
	public void setRow(int y) {
		this.r = y;
	}
	
	Tupla getTupla() {
		return (this);
	}

	int getCol() {
		return(this.c);
	}
	
	int getRow() {
		return(this.r);
	}
	
	int getCol(Tupla t) {
		return (t.c);
	}
	
	int getRow(Tupla t) {
		return (t.r);
	}
	
	public void mostraTupla() {
		System.out.println("(" + this.c + "," + this.r +")");
	}
}
