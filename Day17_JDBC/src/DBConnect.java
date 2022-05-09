
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) {
		String dbDriver="com.mysql.cj.jdbc.Driver ";
		String dbURL="jdbc:mysql://127.0.0.1: 3306/CG1";
		String username="root";
		String password="root";
		try
		{
			
		/*	String sql="SELECT * From employee22";
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(sql);
			int count=1;
			while(r.next())
			{
				int id=r.getInt(0);
				String name=r.getString(1);
				String password1 =r.getString(2);
				String email1=r.getString(4);
				String result="User : %d %s %s %s";
				System.out.println(String.format(result,count++,name,password1,email1));
				
				
			}con.close();*/
			Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="insert into employee22(user_name,password) values(?,?)";
			PreparedStatement s=con.prepareStatement(sql);
			s.setString(1,"suraj");
			s.setString(2,"pass@123");
			
			int rows=s.executeUpdate();
			if (rows>0)
			{
				System.out.println("A new user info entered successfully");
				
			}
			con.close();
		}
			catch(SQLException e)
			{
				System.out.println("Exception ouccured"+e);
			}
	}
}
	


