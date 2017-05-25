import javax.swing.*;
import java.awt.*;
import java.util.Random;


// TODO: la map complÃ¨te ???
public class Map extends JPanel {

    public static final Color CITY = new Color(214, 217, 223);
    public static final Color DESERT = new Color(255, 204, 102);
    public static final Color DIRT_ROAD = new Color(153, 102, 0);
    public static final Color FOREST = new Color(0, 102, 0);
    public static final Color HILLS = new Color(51, 153, 0);
    public static final Color LAKE = new Color(0, 153, 153);
    public static final Color MOUNTAINS = new Color(102, 102, 255);
    public static final Color OCEAN = new Color(0, 0, 153);
    public static final Color PAVED_ROAD = new Color(51, 51, 0);
    public static final Color PLAINS = new Color(102, 153, 0);

    public static final Color[] TERRAIN = {
            CITY,
            DESERT,
            DIRT_ROAD,
            FOREST,
            HILLS,
            LAKE,
            MOUNTAINS,
            OCEAN,
            PAVED_ROAD,
            PLAINS
    };

    public static final int NUM_ROWS = 50;
    public static final int NUM_COLS = 50;
    public static final int PREFERRED_GRID_SIZE_PIXELS = 10;


    int indexTile = 0;


    private  Color[][] terrainGrid;


    private Dimension jframedim;

    public Map(Dimension d) {
        super(null);
        //TODO: par exemple une grille pour avoir une couleur differente Ã  chaque endroit.
        setBackground(TERRAIN[1]);
    }

    // TODO: modifier la couleur du fond quand on change de niveau (indexTile)
    public void paintComponent(Graphics g) {

        
        }

    }
