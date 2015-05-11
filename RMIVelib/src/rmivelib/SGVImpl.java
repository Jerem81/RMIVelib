/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmivelib;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

/**
 *
 * @author Julie
 */
public class SGVImpl extends UnicastRemoteObject implements SGV {
    
    // TODO je sais plus ce que c'est
    String id;                     
    
    // TODO par défaut mais je sais pas à combien on le fixe
    final double COUT_MIN = 0.01; 
    
    // Liste des comptes 
    HashMap<String, Compte> comptes;
    
    // Liste dse vélos 
    HashMap<String, Velo> velos;
    
    // Liste des stations 
    HashMap<String, Station> stations;
    
    /*
     * Constructeur par défaut
     */
    public SGVImpl() throws RemoteException {
        super();
    }
    
    /*
     * Calcule le coût de l'emprunt du vélo 
     * @param idVelo : Identifiant du vélo emprunté
     * @return le coût en euros pour l'emprunt du vélo
     */
    public synchronized double calculCout(String idVelo) {
        return 0.0;  // Bouchon
    }
    
    /* TODO 
     * Je sais plus s'il s'agit de la cnnexion à la BD ou autre 
     */
    public synchronized boolean connexion(String idCarte, String code) {
        return false;  // Bouchon
    }
    
    /*
     * Enregistrement du retrait d'un vélo 
     * @param idCpt : Identifiant du compte emprunteur
     * @param code : Code du compte emprunteur
     */
    @Override
    public void retirer(String idCpt, String code) throws java.rmi.RemoteException {
        // TODO
    }
    
    /*
     * Enregistrement du dépot d'un vélo 
     * @param veloId : Identifiant du vélo déposé
     */
    @Override
    public void deposer(String veloId) throws java.rmi.RemoteException {
        // TODO 
    }
    
    /*
     * Indique les stations les plus proches correspondant au besoin du client 
     * (retrait ou dépôt de vélo)
     * @return un tableau contenant les stations les plus proches
     */
    @Override
    public Station[] redirection() throws java.rmi.RemoteException {
        // TODO
        return new Station[1]; // Bouchon
    }
    
    /*
     * Enregistre un nouveau client
     * @param cpt : Compte du nouveau client
     * @return true si l'enregistrement s'est correctement terminé
     *         false sinon
     */
    @Override
    public boolean ajoutClient(Compte cpt) throws java.rmi.RemoteException {
        // TODO
        return false;  // Bouchon
    }
    
    /*
     * Enregistre une nouvelle station de vélo
     * @param st : La nouvelle station à enregistrer
     * @return true si l'enregistrement s'est correctement terminé
     *         false sinon
     */
    @Override
    public boolean ajoutStation(Station st) throws java.rmi.RemoteException {
        // TODO
        return false;  // Bouchon
    }
    
    /*
     * Enregistre un nouveau vélo
     * @param velo : Le nouveau vélo à enregistrer
     * @return true si l'enregistrement s'est correctement terminé
     *         false sinon
     */
    @Override
    public boolean ajoutVelo(Velo velo) throws java.rmi.RemoteException {
        // TODO 
        return false; // Bouchon
    }
    
    /*
     * Lancement du système de gestion de vélos
     */
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        Naming.rebind("MonSystemeDeGestionDeVelos", new SGVImpl());
	System.out.println("Mon système est enregistré");
    }
    
}
