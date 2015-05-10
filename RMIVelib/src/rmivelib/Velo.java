/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmivelib;

/**
 * Classe permettant de representer un vélo de par son
 * identifiant  et son etat
 * @author M1 MIAGE
 */
public class Velo {
    private String idVelo;
    private enum Etat{NEUF, MOYEN, INUTILISABLE};
    private static Etat monEtat;
    
    /**
     * Constructeur par défaut
     */
    public Velo(){
        idVelo = "0000";
        monEtat = Etat.NEUF;
    }
    
    /**
     * Constructeur prenant l'id du vélo
     * @param num du vélo
     */
    public Velo(String num){
        super();
        idVelo = num;
    }
    
    /***************************
     *   GETTERS & SETTERS     *
     * *************************/
    public String getId(){
        return idVelo;
    }
    
    public Etat getEtat(){
        return monEtat;
    }
    
    public void setId(String id){
        idVelo = id;
    }
    
    public void setEtat(Etat newEtat){
        monEtat = newEtat;
    }
}
