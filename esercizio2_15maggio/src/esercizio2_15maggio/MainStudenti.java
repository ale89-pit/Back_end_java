package esercizio2_15maggio;

import java.sql.SQLException;
import java.time.LocalDate;

public class MainStudenti {

	public static void main(String[] args) {
		try {
			DbConnect db = new DbConnect();
			
			Student s = new Student("Marco","Viola","m", LocalDate.of(1980, 11, 22),6.5,5.0,8.0);
			db.insertStudent(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
