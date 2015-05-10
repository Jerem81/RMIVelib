/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmivelib;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Julie
 */
public interface SGVNotification extends Remote {
	
    // TODO Trouver ce qu'on va notifier 
    // Peut être idStation et si elle est en "surcharge" ou en "sous charge" 
    public void notification(double valeur, double mini) throws RemoteException;
    
}
