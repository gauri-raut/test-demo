// CreateTable.java
import java.sql.*;
class Create
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Gauri","root","Gauri@10");
			Statement pst = con.createStatement();
			boolean status = pst.execute("create table Gauri.STUDENT(STUDENT_NO INT PRIMARY KEY,STUDENT_NAME TEXT(30),STUDENT_DOB DATE,STUDENT_DOJ DATE)");
			if(status==false)
			{
				System.out.println("Table created successfully");
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
