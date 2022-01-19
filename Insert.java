import java.sql.*;
class Insert
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Gauri","root","Gauri@10");
		Statement st = con.createStatement();
        int c = st.executeUpdate("insert into STUDENT values(103,'GANESH','1997-02-14','2022-01-19')");
        System.out.println(c + "Record stored successfully");
        st.close();
        con.close();
    }
}