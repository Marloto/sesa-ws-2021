import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static Connection init() throws SQLException, ClassNotFoundException {
        String dbName = "example";
        String dbUsername = "example";
        String dbPassword = "example";
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost:3306/";
        

        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL + dbName,
                dbUsername,
                dbPassword);
		return con;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = init();
		
		PreparedStatement st1 = con.prepareStatement("insert into employees values(?, ?)");
        st1.setInt(1, 1);
        st1.setString(2, "Test");
        st1.executeUpdate();
        
        PreparedStatement st2 = con.prepareStatement("select id, name from employees");
        ResultSet resultSet = st2.executeQuery();
		

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            System.out.println(id+ ':' + name);
        }
	}
}
