package dbconnect;

import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
try {
			
			DbConncetion db = new DbConncetion();
			
			//Cliente c = new Cliente("Marco", "Viola", LocalDate.of(1980, 11, 22), "Toscana");
			//db.inserisciCliente(c);
			
			//Cliente c = db.leggiCliente(5);
			//System.out.println(c);
			
			//c.setRegione_residenza("Toscana");
			//db.modificaCliente(c);
			
			//db.cancellaCliente(c);
			
			List<Cliente> listaClienti = db.leggiTuttiClienti();
			listaClienti.forEach(c -> System.out.println(c));
			
			//Cliente giallino = listaClienti.get(2);
			//giallino.setCognome("Giallino");
			//db.modificaCliente(giallino);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
