package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane; 
import java.sql.ResultSet;

public class DAO implements ProInter {
	/*public void update_product(Product product){           //update
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1","root", "eslam122");
		PreparedStatement psmt = conn.prepareStatement("update Product set Type=?, Manufacturer=?, Prod_Date=?, Exp_Date=? where Product_id = ?");
		psmt.setString(1,product.getType());
		psmt.setString(2,product.getMan());
		psmt.setString(3,product.getExp());
		psmt.setString(4,product.getPro());
		psmt.setString(5,product.getID());
		int i = psmt.executeUpdate();
		if (i > 0) {
			JOptionPane.showMessageDialog(null, "Product was successfully updated");
		}
		else {
			JOptionPane.showMessageDialog(null, "Product was not updated");
	}
	}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
	}*/
		



	/*public void insert_product(Product product){            //insert
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1","root", "eslam122");
		PreparedStatement psmt = conn.prepareStatement("insert into Product values (?,?,?,?,?)");
		psmt.setString(1,product.getID());
		psmt.setString(2,product.getType());
		psmt.setString(3,product.getMan());
		psmt.setString(4,product.getExp());
		psmt.setString(5,product.getPro());
		
		int i = psmt.executeUpdate();
		if (i > 0) {
			JOptionPane.showMessageDialog(null, "Product was successfully added");
		}
		else {
			JOptionPane.showMessageDialog(null, "Product was not added");
	}
	}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
	}
}*/
	
	
	
	
	/*public void delete_product(String id){           //delete
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1","root", "eslam122");
			PreparedStatement psmt = conn.prepareStatement("delete from Product where Product_id = ?");
			psmt.setString(1,id);
			int i = psmt.executeUpdate();
			if (i > 0) {
				JOptionPane.showMessageDialog(null, "Product was successfully deleted");
			}
			else {
				JOptionPane.showMessageDialog(null, "Product was not deleted");
		}
		}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
	
}
}*/
	
	
	
	
	
	
	/*public void retrieve_product(String manufacturer) {        //retrieve
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String sql = "select Product_id, Type, Prod_Date, Exp_Date from Product where Manufacturer = ?";
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1","root", "eslam122");
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1,manufacturer);
			ResultSet result= psmt.executeQuery();
			while(result.next()) {
					 String Id = result.getString("Product_id");
					 String type = result.getString("Type");
					 String pro_date = result.getString("Prod_Date");
					 String exp_date = result.getString("Exp_Date");
					 JOptionPane.showMessageDialog(null, "ID:"+Id +System.lineSeparator() +"TYPE:"+type+System.lineSeparator() +"Production_Date:"+pro_date+System.lineSeparator() + "Expired by:"+exp_date);					 
			}
				
			if(result.next() ) {
					JOptionPane.showMessageDialog(null, "Product was not found");
							}
			
			}
	
		catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
					
						}

	}*/
}
	

	
	

	
	
	
	
	
	
	
	


