package inscription.modele;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_article;

    @Basic
    private String nom_article;

    @Basic
    private String cout_fabrication;

    public int getId_article() {
        return id_article;
    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    public String getNom_article() {
        return nom_article;
    }

    public void setNom_article(String nom_article) {
        this.nom_article = nom_article;
    }

    public String getCout_fabrication() {
        return cout_fabrication;
    }

    public void setCout_fabrication(String cout_fabrication) {
        this.cout_fabrication = cout_fabrication;
    }
}
