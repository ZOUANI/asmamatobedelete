/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YOUNES
 */
public class CompteService extends AbstractFacade<Compte> {

    public void initDB(){
        for (int i = 1; i < 10; i++) {
            ouvrir("EE"+i, i*100);
        }
    }
    public int ouvrir(String rib, double solde) {
        Compte loadedCompte = find(rib);
        if (loadedCompte != null) {
            return -1;
        } else {
            Compte compte = new Compte(rib, solde);
            compte.setOuvert(true);
            create(compte);
            return 1;
        }
    }

    public int debiter(String rib, double montant) {
        Compte loadedCompte = find(rib);
        if (loadedCompte == null) {
            return -1;
        } else if (loadedCompte.isOuvert() == false) {
            return -2;
        } else if (loadedCompte.getSolde() < montant) {
            return -3;
        } else {
           loadedCompte.setSolde(loadedCompte.getSolde() - montant);
            edit(loadedCompte);
            return 1;
        }
    }
    
    public List<Compte> findBySolde(double soldeMin){
       List<Compte> comptes = findAll();
       List<Compte> res = new ArrayList<>();
       for (Compte compte : comptes) {
            if(compte.getSolde() > soldeMin){
                res.add(compte);
            }
        }
       return res;
    }
    
    public int removeFermer(){
      List<Compte> comptes = findAll();
       for (Compte compte : comptes) {
            if(compte.isOuvert() == false && compte.getSolde() == 0){
                remove(compte);
            }
        }
       return 1;
    }

    public CompteService() {
        super(Compte.class);
    }

}
