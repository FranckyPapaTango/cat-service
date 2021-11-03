package rafaros.catservice.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import rafaros.catservice.entities.Typecommande;


@Transactional
@CrossOrigin("*")            
@RepositoryRestResource      
@Repository 
public interface TypecommandeRepository extends JpaRepository<Typecommande, Long>{

}