import java.awt.*;
import java.awt.event.*;

//import het spaceship bestand hier straks

public class GUI extends Frame implements ActionListener {
    //declaring components
    private TextField shipNameBox;
    private Button checkButton;
    private TextArea shipStatusTextArea;

    //Here go the variables
    String displayedShipStatus;
    //String enteredShipName; for later

    //here is the user interface layout defined
    public GUI() {
        setLayout(new FlowLayout());

            //components go here
            shipNameBox = new TextField("Enter Ship Name");
            add(shipNameBox);

            checkButton = new Button("Check schip status");
            add(checkButton);
                checkButton.addActionListener(this);

            shipStatusTextArea = new TextArea(displayedShipStatus);
            add(shipStatusTextArea);

        setTitle("Ship checker");

        setSize(500,500);

        setVisible(true);
        }

    //main()
    public static void main (String[] args) {
        GUI testwindow = new GUI();


        @Override
        public void  actionPerformed(ActionEvent e) {
            standardship.checkShip();
        }
    }
}