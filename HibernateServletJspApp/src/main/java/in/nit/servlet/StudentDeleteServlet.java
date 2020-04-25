package in.nit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.nit.dao.IStudentDao;
import in.nit.dao.impl.StudentDaoImpl;
import in.nit.model.Student;

@WebServlet("/delete")
public class StudentDeleteServlet extends HttpServlet{

	@Override
	protected void doGet(
			HttpServletRequest req, 
			HttpServletResponse resp)
					throws ServletException, IOException 
	{
	
		//1. Read ID param from Request URL
		String sid=req.getParameter("id");
		
		//2. Parse Id to int type
		int id=Integer.parseInt(sid);
		
		//3. create dao object and call deleteStudent() method
		IStudentDao dao=new StudentDaoImpl();
		String message=dao.deleteStudent(id);
		
		//4. send this message to UI
		req.setAttribute("message", message);
		
		//5. read new data from DB table send to UI
		List<Student> list=dao.getAllStudents();
		req.setAttribute("list", list);
		
		//6. Goto UI page
		RequestDispatcher rd=req.getRequestDispatcher("Data.jsp");
		rd.forward(req, resp);
	}
}









