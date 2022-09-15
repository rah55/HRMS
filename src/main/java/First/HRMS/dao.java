package First.HRMS;
import java.sql.*;

public class dao {
	 Connection con= null;
		public void connect() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");// here we load and register the driver
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capegemini","root","Rahul123@"); //here we set up the connection with database
	
		}
		
		//THIS IS FOR  ADDING A NEW ACCOUNT IN THE TABLE
		public int addAccount(entity e1)throws Exception {
			String query = " insert into management(empName,empDomain,empLocation,empSalary,empPhone) values(?,?,?,?,?)"; //HERE WE MAKE A QUERY TO INSERT NEW ACCOUNT IN TABLE
			
			PreparedStatement pst = con.prepareStatement(query);
		
			pst.setString(1,e1.empName); // HERE WE NEED TO GIVE ? PLACE NUMBER AND VALUE OF THE COLUMS
			pst.setString(2,e1.empDomain); // HERE WE NEED TO GIVE ? PLACE NUMBER AND VALUE OF THE COLUMS
			pst.setString(3,e1.empLocation); // HERE WE NEED TO GIVE ? PLACE NUMBER AND VALUE OF THE COLUMS
			pst.setInt(4,e1.empSalary); // HERE WE NEED TO GIVE ? PLACE NUMBER AND VALUE OF THE COLUMS
			pst.setString(5,e1.empPhone); // HERE WE NEED TO GIVE ? PLACE NUMBER AND VALUE OF THE COLUMS
			int count = pst.executeUpdate(); // WE USE EXECUTEUPDATE BECAUSE IT UPDATE THE VALUES IN TABLE
			return count;
			
			}
		
		
		//THIS IS FOR REMOVE THE EXISTING ACCOUNT FROM TABLE
		public int removeAccount(entity e1) throws Exception{
			String query = "delete from management where empName = ?";//HERE WE MAKE A QUERY TO REMOVE ACCOUNT FROM  TABLE BY USING EMPLYEE NAME
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,e1.empName);           // HERE WE NEED TO GIVE ? PLACE NUMBER AND VALUE OF THE COLUMS
			int count = pst.executeUpdate();// WE USE EXECUTEUPDATE BECAUSE IT UPDATE THE VALUES IN TABLE
			return count;
			
		}
		
	//THIS IS FOR REMOVE THE EXISTING ACCCOUNT FROM TABLE
		public int increment(entity e1) throws Exception{
			String query ="update management set empSalary =empSalary+(empSalary*10)/100 where empName= ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,e1.empName);           // HERE WE NEED TO GIVE ? PLACE NUMBER AND VALUE OF THE COLUMS
			int count = pst.executeUpdate();// WE USE EXECUTEUPDATE BECAUSE IT UPDATE THE VALUES IN TABLE
			return count;
			
		}

			
			
			
		}
