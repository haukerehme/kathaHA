/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Katha
 */
@Stateless
public class VertragFacade extends AbstractFacade<Vertrag> {
    @PersistenceContext(unitName = "HausarbeitKBSEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VertragFacade() {
        super(Vertrag.class);
    }
    
}
