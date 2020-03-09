package inscription.modele;

import javax.persistence.EntityManager;

public class ArticleDao {

    EntityManager em;

    public ArticleDao(EntityManager em) {
        this.em = em;
    }

    public void creer(Evenement e) {
        this.em.persist(e);
    }

    public Article getArticle(String code) {
        return em.createQuery("select e from Article e where e.id_article = :code", Article.class)
                .setParameter("code", code)
                .getSingleResult();
    }

    public Long getNbPersonnes(String code){
        return em.createQuery("select count(p) from Personne p join p.reservation r where r.evenement.code_evenement = :code", Long.class)
                .setParameter("code",code)
                .getSingleResult();
    }
}
