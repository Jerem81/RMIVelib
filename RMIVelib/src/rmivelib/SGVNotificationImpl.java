/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmivelib;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Julie
 */
public class SGVNotificationImpl extends UnicastRemoteObject implements SGVNotification {
    
    private String id;

    public SGVNotificationImpl(String id) throws RemoteException {
            super() ;
            this.id = id;
    }

    @Override
    public void notification(double valeur, double mini) throws RemoteException {
        // TODO Trouver quoi notifier
        /* Exemple de notification     
        System.out.println("Votre compte "+id+" est inferieur au mini : "+
                                mini+" solde : "+valeur);*/
    }
    
}
