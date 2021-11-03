package rafaros.catweb.controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rafaros.catservice.dao.repository.ProduitRepository;
import rafaros.catservice.entities.Produit;

/**
 *
 * @author BigWave
 */
@RestController
public class ProduitRestContoller {
    
    @Autowired
    private ProduitRepository produitRepository;
    
    @GetMapping(value="/listproduits",produces={MediaType.APPLICATION_JSON_VALUE})
    private List<Produit> listProduit(){
        return produitRepository.findAll();
    }
    
    @GetMapping(value="/listproduits/{id}",produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    private Produit listProduit(@PathVariable(name="id") Long id){
        return produitRepository.findById(id).get();
    }
    
    //Mettre à jour un produit :
    @PutMapping(value="/listproduits/{id}")
    private Produit listProduit(@PathVariable(name="id") Long id, @RequestBody Produit p){
        p.setId(id);
        return produitRepository.save(p);
    }
    
    //Enregistrer un produit :
    @PostMapping(value="/listproduits")
    private Produit save(@RequestBody Produit p){
        return produitRepository.save(p);
    }
    
    //Supprimer un produit :
    @DeleteMapping(value="/listproduits/{id}")
    private void delete(@PathVariable(name="id") Long id){
        produitRepository.deleteById(id);
    }
}
