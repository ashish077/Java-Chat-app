package Reservation;

import java.sql.*;
import java.lang.*;
public class Connect
{
public Connection con;
public Connect()
{
/*try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ"
		+ "=Railway.mdb;DriverID=22");
}
catch(Exception e1)
{
System.out.println("Connection failed:"+e1);
}*/
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		Statement st=con.createStatement();
		String  sql="create table passenger(pid integer,name varchar(20),age integer,gender varchar(5),address varchar(20))";
		 sql="insert into passenger values(2,'ankit',21,blr)";
		
		 //String sql = "select * from new1";
		ResultSet rs=st.executeQuery(sql);
		//while(rs.next())
				//System.out.println(rs.getInt(1)+ " "+rs.getString(2));
		con.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}