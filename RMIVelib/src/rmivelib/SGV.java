/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmivelib;

/**
 *
 * @author Julie
 */
public interface SGV extends java.rmi.Remote {
    
    public void retirer(String carte, String code) throws java.rmi.RemoteException;
    
    public void deposer(String veloId) throws java.rmi.RemoteException;
    
    public Station[] redirection() throws java.rmi.RemoteException;
    
    public boolean ajoutClient(Compte cpt) throws java.rmi.RemoteException;
    
    public boolean ajoutStation(Station st) throws java.rmi.RemoteException;
    
    public boolean ajoutVelo(Velo velo) throws java.rmi.RemoteException;
}
