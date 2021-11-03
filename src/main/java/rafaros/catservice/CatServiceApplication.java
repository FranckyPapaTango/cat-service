package rafaros.catservice;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import rafaros.catservice.dao.repository.ProduitRepository;
import rafaros.catservice.dao.repository.TypecommandeRepository;
import rafaros.catservice.entities.Produit;
import rafaros.catservice.entities.Typecommande;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {
	
	@Autowired
	private ProduitRepository produitRepository ;
        
	@Autowired
	private TypecommandeRepository typecommandeRepository ;
        
	@Autowired    //pour l'exposition des ID 
	private RepositoryRestConfiguration restConfiguration; 

	public static void main(String[] args) {
		SpringApplication.run(CatServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		restConfiguration.exposeIdsFor(Produit.class);//pour l'exposition des ID 
                restConfiguration.exposeIdsFor(Typecommande.class);//pour l'exposition des ID 
                
            // On définit les tpes de commande/produit:
//            Typecommande t1 = new Typecommande(null, "Application mobile", new ArrayList());
//            Typecommande t2 = new Typecommande(null, "ERP", new ArrayList());
//            Typecommande t3 = new Typecommande(null, "Portail Web", new ArrayList());
            Typecommande t1 = new Typecommande(null, "Application mobile");
            Typecommande t2 = new Typecommande(null, "ERP");
            Typecommande t3 = new Typecommande(null, "Portail Web");            
            
            typecommandeRepository.save(t1);
            typecommandeRepository.save(t2);
            typecommandeRepository.save(t3);
		
		// On enregistre quelques Produits:
//		produitRepository.save(new Produit(null,"Ordinateur Lx 45",6700,3,t2));
//		produitRepository.save(new Produit(null,"Imprimante HP",1700,2,t3));
//		produitRepository.save(new Produit(null,"Smartphone Samsung S9",8000,13,t1));
		produitRepository.save(new Produit(null,"Ordinateur Lx 45",6700,3));
		produitRepository.save(new Produit(null,"Imprimante HP",1700,2));
		produitRepository.save(new Produit(null,"Smartphone Samsung S9",8000,13));
                
		//on affiche ces données
        typecommandeRepository.findAll().forEach(t->{System.out.println(t.toString());});
	produitRepository.findAll().forEach(p->{System.out.println(p.toString());});
	
	}

}
