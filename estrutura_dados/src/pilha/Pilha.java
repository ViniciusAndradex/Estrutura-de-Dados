package pilha;

public class Pilha {
    public int topo;
	public float pilha[] = new float [200];
	public String expressao;
	
	public Pilha(String expressao) {
		this.expressao = expressao;
	}
	
	public void teste_exp() {
		try {
			if(expressao.length() == 0) {
				throw new Exception("Expressao NULA, invalido.");
			}
			topo = -1; 
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
