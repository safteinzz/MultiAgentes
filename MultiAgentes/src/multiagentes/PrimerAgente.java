/**
 *
 * @author SaFteiNZz
 */
package multiagentes;

/*
DOC
https://www.iro.umontreal.ca/~vaucher/Agents/Jade/primer4.html
http://jade.tilab.com/pipermail/jade-develop/2007q4/011578.html
*/

//Imports
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.*;
import javax.swing.JFrame;


public class PrimerAgente extends Agent {
    @Override
    protected void setup() {
        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                ACLMessage msg = new ACLMessage (ACLMessage.REQUEST); 
                msg.setContent("Hola de parte del primer agente");
                msg.addReceiver(new AID("Receptor",AID.ISLOCALNAME));
                send(msg);
            }
        });
    }	
}
