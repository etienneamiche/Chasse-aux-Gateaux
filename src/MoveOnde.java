import javax.swing.JLabel;


public class MoveOnde extends Thread {
	Oonde onde;
	Map map;
    JLabel KATON = new JLabel("KATON : HOUSENKA NO JUTSU !!!");


	public MoveOnde(Oonde o, Map m){
		super();
		onde=o;
		map=m;
		KATON.setSize(300, 50);
	}

	

	public void run(){
		// TODO: dÃ©placement de l'onde sur la map en 3 images. Placer la premiere autour du personnage, 
		// puis la seconde, puis la troisiÃ¨me, puis cela disparaÃ®t.
		
		//KATON.setLocation(...,...);
		//map.add(KATON);
		// ....
	}
	
	
}