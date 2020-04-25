package in.nit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nit.dao.IStudentDao;
import in.nit.dao.impl.StudentDaoImpl;
import in.nit.model.Student;

@WebServlet("/edit")
public class StudentShowEditServlet extends HttpServlet{

	
	@Override
	protected void doGet(
			HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException 
	{
		
		//1. Read Parameter Id
		String sid=req.getParameter("id");
		
		//2. Parse Id to int type
		int id=Integer.parseInt(sid);
		//3. create Dao object
		IStudentDao dao=new StudentDaoImpl();
		
		//4. call getOneStudent method
		Student s=dao.getOneStudent(id);
		
		//5. send data to UI
		req.setAttribute("ob", s);
		
		//6. Dispatch to Edit Page
		RequestDispatcher rd=req.getRequestDispatcher("Edit.jsp");
		rd.forward(req, resp);
		
		
	
	}
}








