package rafaros.catservice.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

import rafaros.catservice.entities.Produit;

@Transactional
@CrossOrigin("*")//<= autorise tout appel/requête distant: 
@RepositoryRestResource //<= ceci crée automatiquement les restfull web services
@Repository//<=pour les JpaRepsitory
public interface ProduitRepository extends JpaRepository<Produit, Long>{
    
//    @RestResource(path = "/byIdTypecommande")//<=permet l'accès/l'appel via REST 
//    public List<Produit> findByIdTypecommandeContains(@Param("mc") String des);
    
    @RestResource(path = "/byDesignation")//<=permet l'accès/l'appel via REST 
    public List<Produit> findByDesignationContains(@Param("mc") String des);
    @RestResource(path = "/byDesignationPage")//<=permet l'accès/l'appel via REST 
    public Page<Produit> findByDesignationContains(@Param("mc") String des, Pageable pageable);

}
