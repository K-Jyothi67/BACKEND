import java.sql.*;
import java.util.*;
class  Example3
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC93","IPC93");
System.out.println("ESTABLISHED");
Statement sct=con.createStatement();
Scanner ob=new Scanner(System.in);
System.out.println("");
PreparedStatement ps=con.prepareStatement("insert into college values(?,?,?)");
ps.setInt(1,13);
ps.setInt(2,3);
ps.setString(3,"vikas");
ps.executeUpdate();
}
catch(Exception e)
{
System.out.println(e);
}
}
}