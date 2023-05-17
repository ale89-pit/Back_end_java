package esercizio2_15maggio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DbConnect {
	String url = "jdbc:postgresql://localhost:5432/";
	String name = "studenti";
	String user = "postgres";
	String pass = "root";
	Connection conn;
	Statement st;
	
	
	public DbConnect() throws SQLException {
		conn = DriverManager.getConnection(url+name, user, pass);
		st = conn.createStatement();
	}
	
	public void insertStudent(Student s) throws SQLException {
			String sql = "INSERT INTO student_school(name,lastname,gender,birthdate,avg, min_vote,max_vote)"
	+ "VALUES ('"+s.getName()+"',"
				+"'"+s.getLastname()+"',"
				+"'"+s.getGender()+"',"
				+"'"+s.getBirthdate()+"',"
				+"'"+s.getAvg()+"',"
				+"'"+s.getMin_vote()+"',"
				+"'"+s.getMax_vote()+"')";
			st.executeUpdate(sql);
			System.out.println(s.getName()+s.getLastname()+" inserito nel DB");
			
				
	}
	
	public void updateStudent(Student s) throws SQLException {
		String sql ="UPDATE student_school SET "
				+ "name = '"+s.getName()+"',"
				+ "lastname = '"+s.getLastname()+"',"
				+ "gender = '"+s.getGender()+"',"
				+ "birthdate = '"+s.getBirthdate()+"',"
				+ "avg ='"+s.getAvg()+"',"
				+ "min_vote = '"+s.getMin_vote()+"',"
				+ "max_vote = '"+s.getMax_vote()+"' "
				+ "WHERE id = "+s.getId();
		st.executeUpdate(sql);
		System.out.println(" modificato nel DB");
		
	}
	
}
