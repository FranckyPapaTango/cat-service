/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaros.catservice.entities;


import org.springframework.data.rest.core.config.Projection;
/**
 *
 * @author BigWave
 */
@Projection(name="P1",types=Produit.class)
public interface ProduitProjection {
    
    public double getPrice();    
}
