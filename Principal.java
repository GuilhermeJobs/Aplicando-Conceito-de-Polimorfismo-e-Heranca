
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList <Apartamento> aps = new ArrayList <Apartamento>();
		
		Apartamento ap = new Apartamento(4,2,"Eldorado");
		aps.add(ap);
		
		ap = new Apartamento(2,2,"Marista");
		aps.add(ap);
		
		ap = new Aparthotel(5,3,"Nova Suíça", 3500);
		aps.add(ap);
		
		ap = new Aparthotel(3,1,"Bueno", 1500);
		aps.add(ap);
		
		for (int i=0;i<aps.size();i++) {
			System.out.println(aps.get(i).mostraApartamento());
		}
		
		//System.out.println("Quantidade de apartamentos alocados: " + ap.qtdd);
		
	}

}
