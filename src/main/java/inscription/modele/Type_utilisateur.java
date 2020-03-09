package inscription.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Type_utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_utilisateur;
}
