import javax.swing.*;
import java.awt.*;


public class Gateau extends JLabel implements java.io.Serializable {
    ImageIcon img, img2;
    int type;
    public final int ICON_WIDTH = 32, ICON_HEIGHT = 32;

// TODO: placement alÃ©atoire des gateaux sur la map
    public Gateau(Map m) {

        img  = new ImageIcon("./resources/gateau.png");
        img2  = new ImageIcon("./resources/gateau2.png");
        // TODO: placement alÃ©atoire des gateaux sur la map	
        // dÃ©finir un type de gateau par dÃ©faut, 1 pour la vie, 2 pour le mana, et son icone associÃ©

        // ensuite placer alÃ©atoirement le gateau sur la map.
    }
    
    public void setIcon(int i){
    	// TODO: dÃ©finir l'image, et le type 1 ou 2.    	

    }
    
    public int getGateau(){
    	return type;
    }


}