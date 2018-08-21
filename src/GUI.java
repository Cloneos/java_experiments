import java.awt.*;
import java.awt.event.*;

//import het spaceship bestand hier straks

public class GUI extends Frame {
    //declaring components
    private TextField shipNameBox;
    private Button checkButton;
    private TextArea shipStatusTextArea;

    //Here go the variables
    String displayedShipStatus;
    //String enteredShipName; for later

    //here go the GUI components
    public GUI() {
        setLayout(new FlowLayout());

        Panel namePanel = new Panel();
            shipNameBox = new TextField("Enter Ship Name");
            namePanel.add(shipNameBox);

        Panel buttonPanel = new Panel();
            checkButton = new Button("Check schip status");
            buttonPanel.add(checkButton);

        Panel statusPanel = new Panel();
            shipStatusTextArea = new TextArea(displayedShipStatus);
            statusPanel.add(shipStatusTextArea);

        setTitle("Ship checker");

        setSize(500,500);

        setVisible(true);
        }

    //main()
    public static void main (String[] args) {
        GUI testwindow = new GUI();
    }
}