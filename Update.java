import java.sql.*;
class Update 
{
    public static void main (String[]args) throws ClassNotFoundException, SQLException 
    {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Gauri","root","Gauri@10");
        Statement st = con.createStatement ();
        int rows = st.executeUpdate ("update STUDENT set STUDENT_NO = 105 where STUDENT_NO=103");
        System.out.println (rows + " rows modified");    
        st.close ();    
        con.close ();
    } 
}