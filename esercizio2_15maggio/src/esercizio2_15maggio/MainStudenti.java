package esercizio2_15maggio;

import java.sql.SQLException;
import java.time.LocalDate;

public class MainStudenti {

	public static void main(String[] args) {
		try {
			DbConnect db = new DbConnect();
			
			Student s = new Student("Marco","Viola","m", LocalDate.of(1980, 11, 22),6.5,5.0,8.0);
			Student s1 = new Student("Giulia","Carta","f", LocalDate.of(1996, 8, 4),8,7.0,9.0);
//			
//			
//			db.insertStudent(s1);
//			
			s1.setAvg(8.5);
			System.out.println(s1);
			s.setLastname("Pinco");
			db.updateStudent(s);
			db.updateStudent(s1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
