  import javax.swing.*;
  import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.util.ArrayList;

public class MyFrame extends JFrame {

  
    
    public static void main ( String[] args )
{
    JPanel middlePanel = new JPanel ();
  

    // create the middle panel components

    JTextArea display = new JTextArea ( 16, 58 );
    display.setEditable ( false ); // set textArea non-editable
    JScrollPane scroll = new JScrollPane ( display );
    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

    //Add Textarea in to middle panel
    middlePanel.add ( scroll );

        
    // My code
    JFrame frame = new JFrame("GAMEDAY");
    
    frame.add ( middlePanel );
    frame.pack ();
    frame.setLocationRelativeTo ( null );

    
    TextField aTextField = new TextField("");
   
 frame.add(aTextField);
   frame.setVisible ( true );
       display.setLineWrap(true);
display.setWrapStyleWord(true);
//Team1
ArrayList<Player> team1 = new ArrayList<Player>();
team1.add(new Player("Abbiatti", "G", 25, 90, 90, 90));
team1.add(new Player("Pepe", "D", 25, 90, 90, 90));
team1.add(new Player("Ramos", "D", 25, 90, 90, 90));
team1.add(new Player("Alaba", "D", 25, 90, 90, 90));
team1.add(new Player("Marquinhos", "D", 25, 90, 90, 90));
team1.add(new Player("Kaka", "M", 25, 90, 90, 90));
team1.add(new Player("Reus", "M", 25, 90, 90, 90));
team1.add(new Player("Ozil", "M", 25, 90, 90, 90));
team1.add(new Player("Messi", "A", 25, 90, 90, 90));
team1.add(new Player("Ronaldo", "A", 25, 90, 90, 90));
team1.add(new Player("Suarez", "A", 25, 90, 90, 90));
//Team2
ArrayList<Player> team2 = new ArrayList<Player>();
team2.add(new Player("Cech", "G", 25, 80, 80, 80));
team2.add(new Player("Alves", "D", 25, 80, 80, 80));
team2.add(new Player("Vermaelen", "D", 25, 80, 80, 80));
team2.add(new Player("Boateng", "D", 25, 80, 80, 80));
team2.add(new Player("Barta", "D", 25, 80, 80, 80));
team2.add(new Player("Rakitic", "M", 25, 80, 80, 80));
team2.add(new Player("Xavi", "M", 25, 80, 80, 80));
team2.add(new Player("Iniesta", "M", 25, 80, 80, 80));
team2.add(new Player("Sanchez", "A", 25, 80, 80, 80));
team2.add(new Player("Douglas", "A", 25, 80, 80, 80));
team2.add(new Player("Benzema", "A", 25, 80, 80, 80));
String text = Simulation.gamerun("Best Team",  team1 , "Bad Team", team2, team1.get(10), team2.get(10), team1.get(5), team2.get(5));   
   String str = "";

    while (text.length() > 0) {
    str += text.substring(0,text.indexOf("\n"));
    text = text.substring(text.indexOf("\n") + 1,text.length()-1);
    str += "\n";
        aTextField.setText(str);
     try {
    Thread.sleep(1000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}

// frame.invalidate();
//frame.validate();
frame.repaint();
//   while (text.length() > 0) {
//    str += text.substring(0,text.indexOf("\n"));

//    text = text.substring(text.indexOf("\n"),text.length()-1);
//        frame.add(new TextField(str));
 /*    try {
    Thread.sleep(5);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
*/
//getContentPane().revalidate();
//frame.invalidate();
//frame.validate();
//frame.repaint();
}

}
}
  
   

