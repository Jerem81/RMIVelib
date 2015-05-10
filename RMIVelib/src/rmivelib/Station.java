/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmivelib;

/**
 * Clase permettant de representer l'objet station,
 * une station est décrite par son nom, et sa position
 * @author M1 MIAGE
 */
public class Station {
    private String nom;
    private double latitude;
    private double longitude;
    
    /**
     * Constructeur par défaut
     */
    Station(){
        nom       = "Default";
        latitude  = 0;
        longitude = 0;
    }
    
    /**
     * Constructeur prenant trois parametres
     * @param nom de la station
     * @param latitude de la station
     * @param longitude de la station
     */
    Station(String nom, int latitude, int longitude){
        super();
        nom = this.nom;
        this.latitude  = latitude;
        this.longitude = longitude;
    }
 
    /*********************************************
     *             GETTERS & SETTERS             * 
     * *******************************************/
    public void setNom (String name){
        this.nom = name;
    }
    
    public void setLongitude (double lon){
        this.longitude = lon;
    }
    
    public void setLatitude (double lat){
        this.latitude = lat;
    }
    
    public String getNom(){
        return nom;
    }
    
    public double getLatitude(){
        return latitude;
    }
    
    public double getLongitude(){
        return longitude;
    }
    
}
