package sit.int202.lab02.servlets;


import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.int202.lab02.models.Student;
import sit.int202.lab02.models.StudentRepository;
import java.io.IOException;
import java.io.PrintWriter;




@WebServlet(name = "AddStudentServlet", value = "/add-student")
public class AddStudentServlet extends HttpServlet {



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        StudentRepository studentRepository = new StudentRepository();
//        Student student = new Student(90001, "New Student", 3.59);
//        studentRepository.save(student);
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<body style='padding: 100px'>");
            out.println("<h3>Add new Student</h3><hr><br>");
            out.println("<form method='post' action='add-student'>");//action คือไปที่ value นี้และ ไที่ method นี่
            out.println("<h2>ID : <input type='text' name='id'></h2><br>");
            out.println("<h2>Name : <input type='text' name='name'></h2><br>");
            out.println("<h2>GPAX : <input type='text' name='gpax'></h2><br>");
            out.println("<p><input type='submit' value='submit'></p>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");///เอามาจาก input id ที่ตรงกันจาก doGet
        String name = request.getParameter("name");
        String gpax = request.getParameter("gpax");
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Student Resistration Form Data</h1>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.print("<a href='student-list'>[Go list]</a>");
        printWriter.close();
        StudentRepository studentRepository = new StudentRepository();
        Student student = new Student(Integer.parseInt(id),name,Double.parseDouble(gpax));
        studentRepository.save(student);

    }
}

