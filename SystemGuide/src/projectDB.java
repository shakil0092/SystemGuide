import java.sql.*;

import javax.swing.*;

public class projectDB {
	Connection conn=null;
	public static Connection dbConnector() {
		try{		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sgdb","root","ice301");
		//JOptionPane.showMessageDialog(null, "Connection Successful");
		return conn;
		
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	
	}

}
		
	
	
		