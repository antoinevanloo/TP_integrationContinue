package inscription.modele;

import javax.persistence.*;

@Entity
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_contrat;

    @Basic
    private float marge;

}
