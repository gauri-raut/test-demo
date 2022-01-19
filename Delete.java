import java.sql.*;
import java.util.*;
class Delete
{
    public static void main (String[]args) throws ClassNotFoundException, SQLException 
    {  
        Scanner sc = new Scanner (System.in);  
        System.out.println ("ENTER STUDENT NUMBER:");   
        int sno = sc.nextInt ();    
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Gauri","root","Gauri@10");
        Statement st = con.createStatement (); 
        int c = st.executeUpdate ("delete from STUDENT where STUDENT_NO =" + sno);
        if (c == 0)    
            System.out.println ("student record doesnot exist");  
        else
            System.out.println ("student record deleted successfully");
        st.close ();   
        con.close (); 
    } 
}