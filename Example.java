import java.sql.*;
import java.util.*;
class  Example
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
System.out.println("give input");
Scanner ob=new Scanner(System.in);
int clgcode=ob.nextInt();
//int nob=ob.nextInt();
//String clgname=ob.next();
String sql="select * from college";
boolean result=false;
ResultSet rs=sct.executeQuery(sql);
while(rs.next())
{
 	if(clgcode==rs.getInt(1))
{
	System.out.println("hello"+rs.getInt(2)+" "+rs.getString(3));
	break;
}
else
{
System.out.println("invalid user");
}
}

}
catch(Exception e)
{
System.out.println(e);
}
}
}