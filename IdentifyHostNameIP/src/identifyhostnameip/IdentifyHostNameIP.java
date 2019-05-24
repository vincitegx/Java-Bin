/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identifyhostnameip;
import java.net.*;
/**
 *
 * @author DAVID TEGA
 */
public class IdentifyHostNameIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            try {
            InetAddress address = InetAddress.getByName("localhost");
            System.out.print("Host name: " + address.getHostName() + "\n");
            System.out.println("IP address: " + address.getHostAddress());
           }
           catch (UnknownHostException ex) {
           System.err.println("Unknown host or IP address " + args[i]);
           }
           }
    }
    
}
