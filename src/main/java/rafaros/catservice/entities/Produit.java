package rafaros.catservice.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Produit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8297616679631006161L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	private double price;
	private int quantity;
//    @JoinColumn(name = "ID_TYPECOMMANDE", referencedColumnName = "ID_TYPECOMMANDE")
//    @ManyToOne(optional = false)
//    private Typecommande idTypecommande;

}
