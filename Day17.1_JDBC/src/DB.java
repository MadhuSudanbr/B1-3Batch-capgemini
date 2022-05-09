import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DB {

	public static void main(String[] args) {
		
String dbDriver="com.mysql.cj.jdbc.Driver ";
String dbURL="jdbc:mysql://127.0.0.1: 3306/CG1";
String username="root";
String password="root";
String query="select * from employee";
try 
{
	Class.forName(dbDriver);
}
catch (ClassNotFoundException e)
{
	e.printStackTrace();
}
try {
	Connection con=DriverManager.getConnection(dbURL, username, password);
	Statement st=con.createStatement();
	ResultSet r=st.executeQuery(query);
	while(r.next())
	{
		String EmployeeData="";
		for (int i=1;i<=3;i++)
		{
			EmployeeData=EmployeeData+""+r.getString(i);
			
		}
		System.out.println(EmployeeData);
	}
}

		catch (SQLException e)
		{
			System.out.println("invalid Username and password");
		}
	}
	
}

	


