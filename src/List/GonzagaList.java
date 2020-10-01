package List;

import java.util.Arrays;

public class GonzagaList<T> {

	private static final int INITIAL_ALLOCATION = 10;
	private static final int MAX = 100;
	@SuppressWarnings("unchecked")
	private T[] array = (T[]) new Object [INITIAL_ALLOCATION];
	private int par = 0;
	private int impar = 1;
	private int inseridos;
	private int contador = 0;
	
	public void add(T o) throws ListaLotadaException {	
		if (inseridos == array.length) {
			@SuppressWarnings("unchecked")
			T[] novoArray = (T[]) new Object [array.length + INITIAL_ALLOCATION];
			for (int i = 0; i < array.length; i++) {
				novoArray[i] = array[i];
			}
			array = novoArray;
		}
		if (inseridos == MAX) {
			throw new ListaLotadaException();
		}
		if (impar <= MAX && contador <5){
			array[impar]= o;
			impar += 2;
			inseridos++;
			contador++;
			}
		
		else if (par <= MAX && contador <10){
			array[par] = o;
			par += 2;
			inseridos++;
			contador++;
			
			if (contador == 10) {
				contador = 0;
				}
		}
	}
	
	public int size() {
		return inseridos;
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}
	
}
