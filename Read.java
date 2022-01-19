import java.sql.*;
import java.util.*;
class Read
{  
    public static void main (String[]args) throws ClassNotFoundException, SQLException 
    {
        Scanner sc = new Scanner (System.in);  
        System.out.println ("ENTER STUDENT NUMBER");   
        int sno = sc.nextInt ();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Gauri","root","Gauri@10");
        Statement st = con.createStatement ();    
        ResultSet rs = st.executeQuery ("select * from STUDENT where STUDENT_NO =" + sno);
        if (rs.next ())
        { 
            System.out.println ("STUDENT NO: " + rs.getInt (1));
            System.out.println ("STUDENT NAME: " + rs.getString (2));
            System.out.println ("DATE OF BIRTH : " + rs.getDate (3)); 
            System.out.println ("DATE OF JOINING: " + rs.getDate (4));      
        }
        else
            System.out.println ("student record doesnot exist");
    
        rs.close ();
        st.close ();
        con.close (); 
    }
}