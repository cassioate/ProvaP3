package List;

public class LunaList {

	private Conta contas;
	private Conta cabeca;
	private int inseridos;
	
	public Conta getContas() {
		return contas;
	}
	public void setContas(Conta contas) {
		this.contas = contas;
	}
	public Conta getCabeca() {
		return cabeca;
	}
	public void setCabeca(Conta cabeca) {
		this.cabeca = cabeca;
	}
	public int getInseridos() {
		return inseridos;
	}
	public void setInseridos(int inseridos) {
		this.inseridos = inseridos;
	}
	
	public void addInicio (Conta c) throws ListaLotadaException {
		
		if (inseridos == 30) {
			throw new ListaLotadaException();
		}
		
		else if 
		(cabeca == null ) {
			cabeca = c;
				
		} else if (inseridos <= 30) {
		c.setProximo(cabeca);
		cabeca.setAnterior(c);
		cabeca = c;
		}
		inseridos++;
	}
	
	public void addFinal (Conta c) throws ListaLotadaException {
		if (inseridos == 30) {
			throw new ListaLotadaException();
		}
		else if (cabeca == null) {
					cabeca = c;
		} else {
			Conta temp = cabeca;
			while (temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(c);
			inseridos++;
		}
	}
	
	public int size() {
		return inseridos;
	}
	
}
