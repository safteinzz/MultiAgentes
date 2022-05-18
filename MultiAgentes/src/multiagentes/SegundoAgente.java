/**
 *
 * @author SaFteiNZz
 */
package multiagentes;

//Imports
import javax.swing.JOptionPane;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.*;


public class SegundoAgente extends Agent {
    @Override
    protected void setup() {
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                System.out.println("Agente "+getLocalName()+": Esperando mensage...");                
                ACLMessage msg = blockingReceive(MessageTemplate.MatchPerformative(ACLMessage.REQUEST));
                System.out.println("Agente "+getLocalName()+": Mensaje recibido: "+msg.getContent());
                JOptionPane.showMessageDialog(null, "Mensaje recibido: "+msg.getContent());
            }	
        });
    }
}

