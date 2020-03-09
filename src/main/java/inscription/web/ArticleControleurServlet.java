	package inscription.web;

    import inscription.modele.*;

    import javax.persistence.EntityManager;
    import javax.persistence.EntityManagerFactory;
    import javax.persistence.Persistence;
    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import java.io.IOException;
    import java.text.ParseException;

    @WebServlet("/article")
public class ArticleControleurServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("melinda");
        Article unArticle = null;
        try {
            EntityManager em = emf.createEntityManager();
            try {
                ArticleDao aDAO = new ArticleDao(em);

                em.getTransaction().begin();
                unArticle = aDAO.getArticle("1");
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        } finally {
            emf.close();
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/article.jsp");
        rd.forward(req, resp);
    }

}
