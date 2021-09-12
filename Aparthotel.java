
import java.text.DecimalFormat;

public class Aparthotel extends Apartamento {
	private double rentabilidadeMensal;
	
	public Aparthotel(int quartos, int banheiros, String setor, double rentabilidadeMensal) {
		super(quartos, banheiros, setor);
		this.rentabilidadeMensal = rentabilidadeMensal;
	}
	
	public String mostraApartamento () {
		DecimalFormat df = new DecimalFormat("#0.00");
		String texto = "- Apartamento de " + setqtdeQuartos() + " quartos, " + setqtdeBanheiros() + " banheiros, " + " no setor " + setsetor();
		texto = texto + " com a rentabildade mensal de R$ " + df.format(this.rentabilidadeMensal);
		texto = texto + "\nApart Hotel / Flat";
		return texto;
	}
	
}
