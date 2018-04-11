import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class SevletDatabase extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
PrintWriter pw=response.getWriter();
	    pw.println("<html><body>");
	    pw.println("Welcome to servlet");
	    pw.println("</html></body>");
	    pw.close();          
/*String uname=request.getParameter("uname");  
String pass=request.getParameter("pass");  

          
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/b87","root","root");  
  
PreparedStatement ps=con.prepareStatement( "insert into login values(?,?)");  
  
ps.setString(1,uname);  
ps.setString(2,pass);  

          
int i=ps.executeUpdate();
if(i>0)  
out.print("You are successfully registered...");  
      
          
}catch (Exception e2) 
{System.out.println(e2);}  
          
out.close();  */
}  
  
}  