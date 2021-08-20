package sit.int202.lab02.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.lab02.models.Student;
import sit.int202.lab02.models.StudentRepository;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RemoveStudentServlet", value = "/remove-student")
public class RemoveStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentRepository studentRepository = new StudentRepository();
        String reid = request.getParameter("id");

        Integer id=null;
        if (reid != null) {
            try {
                id = Integer.valueOf(reid);
            } finally {
            }
        }
        Student student = studentRepository.remove(id);
        try {
            PrintWriter printWriter = response.getWriter();
            printWriter.print("<html>");
            printWriter.print("<body style='padding: '100px'>");
            printWriter.print("<form>");
            printWriter.print("<table>");
            printWriter.print("<h2>Remove Student ID : <input type='text' name='id'></h2><br>");
            if (student != null) {
                printWriter.println("<tr><td>Id: </td> <td>" + student.getId() + "</td></tr>");
                printWriter.println("<tr><td>Name: </td> <td>" + student.getName() + "</td></tr>");
                printWriter.println("<tr><td>GPAX: </td> <td>" + student.getGpax() + "</td></tr>");
            } else {
                printWriter.println("<tr><td> Student ID: '" + reid + "' does not exist !!</td></tr>");
            }
            printWriter.print("<input type='submit' value='Remove'><br>");
            printWriter.println("<a href='index.jsp'>[Back]</a><br>");
            printWriter.println("</table>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }finally {

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
