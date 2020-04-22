package ge.edu.btu.name.surname.regform;

import ge.edu.btu.name.surname.regform.model.Animal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/animalservlet")
public class AnimalServlet extends HttpServlet {

    public static final String VIEW = "/showAnimal.jsp";

    Animal animal=new Animal();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("animal", animal);

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        animal.setName(req.getParameter("name"));
        animal.setBreed(req.getParameter("breed"));
        animal.setSex(req.getParameter("sex"));
        animal.setAge(Integer.parseInt(req.getParameter("age")));

        animal.printInfo();
    }
}
