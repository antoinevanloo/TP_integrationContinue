package inscription.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listeInfos")
public class ListeInfosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO : récupérer infos de la bdd et les transmettre au jsp
    	
    	req.getRequestDispatcher("info.jsp").forward(req, resp);
    }
    
}
