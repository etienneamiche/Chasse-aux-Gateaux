

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

import javax.swing.*;

public class Menu extends JMenuBar {

	//tout crÃ©er ici (menus, items..)
    private JMenuItem item6 = new JMenuItem("Changer Touche");
	private GateauArrayList cake; 
	private NutritionisteArrayList nut;
	private Personnage perso;
	private MoveNutritionisteArrayList mnal;
    private ShowOnMap som;
    private UIKey u;
    private Move mov;
    private Map map;

    JOptionPane jop = new JOptionPane();

//TODO: complÃ©ter le menu du haut
	public Menu(GateauArrayList g, NutritionisteArrayList n, Personnage p, MoveNutritionisteArrayList mnalp, final ShowOnMap somp, UIKey up, Map mp, Move movp){

		cake=g;
		perso=p;
		nut=n;
        mnal=mnalp;
        som=somp;
        u=up;
        map = mp;
        mov = movp;

	//TODO: crÃ©er menu et items et leur ajouter un action listener
            
            // pour redÃ©finir les touches de jeu. Rien Ã  faire ici
        	item6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mnal.stopwork = true;
                perso.stopwork = true;
                som.stopwork = true;

               String inputKeyW= jop.showInputDialog(null, "Entrer la touche que vous souhaitez modifier : " +
                        "1:HAUT,2:BAS,3:GAUCHE,4:DROITE,5:Katon,6:Pause"
                        );
                int inputKey = Integer.parseInt(inputKeyW);
                String newKeyS = jop.showInputDialog(null, "Entrer la nouvelle touche pour " + inputKeyW);
                int newKey = KeyEvent.getExtendedKeyCodeForChar(newKeyS.charAt(0));

                System.out.println(inputKey);

                if(!(inputKey>0  && inputKey<7) || u.alreadyUsed(newKey)){
                    jop.showMessageDialog(null, "touche dÃ©jÃ  utilisÃ© ou erreur ^^ ");
                }
                u.changeSetting(inputKey,newKey);
                mnal.stopwork = false;
                perso.stopwork = false;
                som.stopwork = false;

            }
        });

	    
	}
	
	
	class QuitActionListener implements ActionListener {
		  public void actionPerformed(ActionEvent e) {
			  // TODO

		  }
	}
	

	class AproposActionListener implements ActionListener {
		  public void actionPerformed(ActionEvent e) {	
			//TODO: pop up qui informe de qui a fait le jeu, etc...
		  }
	}
	
	
}