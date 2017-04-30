

import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test
 */
@WebServlet("/test") 
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		// TODO Auto-generated method stub
				response.setContentType("text/html");
				ArrayList<String> list=new ArrayList<String>();
				
				PrintWriter out=response.getWriter();
				list.add(request.getParameter("ename"));
				list.add(request.getParameter("enum"));
				list.add(request.getParameter("edept"));
				list.add(request.getParameter("edoj"));
				
				try {
					
					//Class.forName("com.mysql.jdbc.driver");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8020/emp","system","tiger");
					Statement st=con.createStatement();
					int row=st.executeUpdate("Insert into employee values('"+list.get(0)+"','"+list.get(1)+"','"+list.get(2)+"','"+list.get(3)+"');");
					if(row>0){
						Iterator itr=list.iterator();  
						  while(itr.hasNext()){  
						   out.println(itr.next());  
						  }  
						out.print("Above Data Inserted Succesfully");	
					}
					
				} catch (ClassNotFoundException e) {
				e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}



	}


