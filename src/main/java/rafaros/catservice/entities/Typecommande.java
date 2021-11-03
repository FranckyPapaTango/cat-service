package rafaros.catservice.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@EqualsAndHashCode(callSuper=false)
@Data @NoArgsConstructor @AllArgsConstructor// @ToString
public class Typecommande //extends AbstractEntity 
        implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TYPECOMMANDE")
    private Long idTypecommande;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "LIBELLETYPE")
    private String libelletype;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTypecommande")
//    private Collection<Produit> produitCollection;
    
   @Override
    public String toString() {
    return this.libelletype;
    }
}
