import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Personnage extends JLabel implements java.io.Serializable {


    private int posX = 100;
    private int posY = 100;
    private int energy = 10;
    private int mana = 100;
    private int niveau = 0;


    
    private boolean regime=false;

    ImageIcon HAUT, BAS, GAUCHE, DROITE;
    public boolean stopwork = false;


    public final int ICON_WIDTH = 48, ICON_HEIGHT = 48;


    // TODO:
    public int getMana(){
    	return this.mana;
    }
    // TODO: 
    public void setMana(int n){
    	this.mana=n;
    }
    
    // TODO: 
    public int getEnergy(){
    	return this.energy;
    }
    
    // TODO:
    public void setEnergy(int n){
    	this.energy=n;
    }
    // TODO: 
    public int getPosX() {
        return this.posX;
    }
    // TODO: 
    public int getPosY() {
        return this.posY;
    }

    // TODO: constructeur pour positionner le perso dans la frame avec le bon icone
    public Personnage() {
        super();
        	

            DROITE = new ImageIcon("./resources/joueur_droite.png");
            GAUCHE = new ImageIcon("./resources/joueur_gauche.png");
            BAS = new ImageIcon("./resources/joueur_bas.png");
            HAUT = new ImageIcon("./resources/joueur_haut.png");
            setIcon(BAS);
            this.setSize(this.getPreferredSize());
            setLocation(getPosX(),getPosY());
            setVisible(true);
            
    }
    // fin TODO
    
    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int n) {
        niveau = n;
    }

    public void setRegime (boolean r){
    	regime=r;
    }
    public boolean getRegime (){
    	return regime;
    }    

    

    
    public void bouger(int i, int nposx, int nposy, Map m) {
        if(stopwork)
            return;

        if (i==1)
    		setIcon(HAUT);
    	else if(i==2)
    		setIcon(BAS);
      	else if(i==3)
    		setIcon(GAUCHE);
      	else setIcon(DROITE);
        this.posX =nposx;
        this.posY = nposy;
        
        setLocation(posX,posY);
    }
    
}