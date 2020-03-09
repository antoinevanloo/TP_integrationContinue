package inscription.modele;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;

    @Basic
    private String nom_client;

    @Basic
    private String prenom_client;


//    @OneToMany
//    @JoinColumn(name = "contrat_id")
//    private Contrat contrat;
//
//    @OneToMany
//    @JoinColumn(name = "type_utilisateur_id")
//    private Type_utilisateur type_utilisateur;

    @OneToMany(cascade = { CascadeType.ALL },mappedBy = "reservation")
   private List<Personne> personnes = new ArrayList<Personne>();


}
