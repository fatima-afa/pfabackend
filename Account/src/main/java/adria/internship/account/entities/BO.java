package adria.internship.account.entities;

import adria.internship.account.entities.*;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class BO extends User {
    private String matricule;
    @ManyToOne
    private Admin admin;
    @ManyToOne
    protected Ville ville;

    @OneToMany(mappedBy = "bo",fetch = FetchType.LAZY)
    private List<Abonne> abonnes;

    @OneToMany(mappedBy = "bo",fetch = FetchType.LAZY)
    private List<Message> messages;

    @OneToMany(mappedBy = "bo", fetch = FetchType.LAZY)
    private List<Contrat> contrats;
}
