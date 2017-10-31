/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisia_mall.Interface;

import javafx.collections.ObservableList;
import tunisia_mall.models.Boutique;

/**
 *
 * @author ahmed
 */
public interface IBoutiqueService extends IService<Boutique, Integer> {

    public ObservableList<Boutique> displayall();

    public ObservableList<String> displayallnom();

    public ObservableList<String> displayallBshopowner();

    public ObservableList<Boutique> findBoutiqueByName(String search);

    public Boutique findBoutiqueByNom(String nom);
     public boolean idbutilise(int id);
     
         
 

}
