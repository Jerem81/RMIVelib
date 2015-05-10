/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmivelib;

/**
 * Classe permettant de representer le compte, celui ci peut concerner
 * un client ou encore un employé de l'entreprise gérant les Vélib
 * @author M1 MIAGE
 */
public class Compte {
    private String idCompte;
    private String mdp;
    private boolean estClient;
    private String nom;
    private String prenom;
    private String adresse;
    
    /**
     * Constructeur par defaut
     */
    public Compte(){
        idCompte = "user";
        mdp      = "1234";
        estClient= true;
        nom      = "Monsieur";
        prenom   = "X";
        adresse  = "1 rue de la banane";
    }
    
    /**
     * Constructeur prenant toutes les infos en parametre
     * @param idCpt
     * @param mdp
     * @param estCli
     * @param nom
     * @param prenom
     * @param adr 
     */
    public Compte(String idCpt, String mdp, boolean estCli, 
                  String nom, String prenom, String adr){
        super();
        this.idCompte  = idCpt;
        this.mdp  = mdp;
        this.estClient = estCli;
        this.nom  = nom;
        this.prenom = prenom;
        this.adresse = adr;
    }
    
    /******************************************
     *          GETTERS & SETTERS             *
     * ****************************************/
    public String getId(){
        return idCompte;
    }
    
    public String getMdp(){
        return mdp;
    }
    
    public boolean getStatut(){
        return estClient;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public String getAdresse(){
        return adresse;
    }
    
    public void setMdp(String mdp){
       this.mdp = mdp;
    }
    
    public void setStatut(boolean estCli){
        estClient = estCli;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
            
}
