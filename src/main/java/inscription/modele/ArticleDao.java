package inscription.modele;

import javax.persistence.EntityManager;
import java.util.List;

public class ArticleDao {

    EntityManager em;

    public ArticleDao(EntityManager em) {
        this.em = em;
    }

    public void creer(Article e) {
        this.em.persist(e);
    }

    public List<Article> getArticles() {
        return em.createQuery("select a from Article a", Article.class)
                .getResultList();
    }
}
