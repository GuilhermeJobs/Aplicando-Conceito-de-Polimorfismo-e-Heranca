
class Apartamento {
	private int qtdeQuartos;
	private int qtdeBanheiros;
	private String setor;
	static int qtdd = 0;
	
	Apartamento (int quartos, int banheiros, String setor) {
		qtdd++;
		qtdeQuartos = quartos;
		qtdeBanheiros = banheiros;
		this.setor = setor;
	}
	
	public String mostraApartamento () {
		return "- Apartamento de " + qtdeQuartos + " quartos, " + qtdeBanheiros + 
				" banheiros, " + " no setor " + this.setor;
	}
	
	public int setqtdeQuartos() {
		return qtdeQuartos;
	}
	
	public int setqtdeBanheiros() {
		return qtdeBanheiros;
	}
	
	public String setsetor() {
		return setor;
	}
	
}
