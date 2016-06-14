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

  
    
  public static void main ( String[] args ) {}
 
  
  public static void runmatchday() {
    
    Team team1 = new Team();
    Team team2 = new Team();
    
    //DAY 1
    if ((Driver.matchday % 5) == 1) {
      team1 = Driver.MyTeam;
      team2 = Driver.CompTeam1; 
      Driver.MyTeam._lineup = Team.setLineup(Driver.MyTeam._roster);
      Driver.CompTeam1._lineup = Team.setLineup(Driver.CompTeam1._roster);
      ArrayList<Player> team1lineup = Driver.MyTeam._lineup;
      ArrayList<Player> team2lineup = Driver.CompTeam1._lineup;
      
      String team1name = Driver.MyTeam._name;
      String team2name = Driver.CompTeam1._name;
      Player freekicktaker1 = Driver.MyTeam._lineup.get(10);
      Player freekicktaker2 = Driver.CompTeam1._lineup.get(10);
      Player cornerkicktaker1 = Driver.MyTeam._lineup.get(6);
      Player cornerkicktaker2 = Driver.CompTeam1._lineup.get(6);
      Player penaltytaker1 = Driver.MyTeam._lineup.get(9);
      Player penaltytaker2 = Driver.CompTeam1._lineup.get(9);
      
     
  /*    MyFrame.gamerun1("My Team", team1lineup, "De Godenzonen" , team2lineup, Driver.MyTeam._lineup.get(10), Driver.CompTeam1._lineup.get(10), Driver.MyTeam._lineup.get(6), Driver.CompTeam1._lineup.get(6),
                       Driver.MyTeam._lineup.get(10), Driver.CompTeam1._lineup.get(10));
  
  public static void gamerun1(String team1name, ArrayList<Player> team1, String team2name, ArrayList<Player> team2, Player freekicktaker1, Player freekicktaker2,
                                Player cornerkicktaker1, Player cornerkicktaker2, Player penaltytaker1, Player penaltytaker2){
    
    */
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
 // Team team1 = new Team("Hello", 0,0,1,0,0,4,0,0,3,0,0,3);
  /*
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
  */

  //Team2
//  Team team2 = new Team("helo", 0,1,0,0,4,0,0,3,0,0,3,0);
  /*
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
  */

  String text = Simulation.gamerun(team1name, team1lineup, team2name, team2lineup, freekicktaker1,  freekicktaker2,
                                 cornerkicktaker1,  cornerkicktaker2,  penaltytaker1,  penaltytaker2);   
     String str = "";

     while (text.length() > 0) {
      str += text.substring(0,text.indexOf("\n"));
      text = text.substring(text.indexOf("\n") +1);
      str += "\n";
         aTextField.setText(str);
       try {
       Thread.sleep(2000);                 //1000 milliseconds is one second.
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
        //DAY 2
    if ((Driver.matchday % 5) == 2) {
      team1 = Driver.MyTeam;
      team2 = Driver.CompTeam2; 
      Driver.MyTeam._lineup = Team.setLineup(Driver.MyTeam._roster);
      Driver.CompTeam2._lineup = Team.setLineup(Driver.CompTeam2._roster);
      ArrayList<Player> team1lineup = Driver.MyTeam._lineup;
      ArrayList<Player> team2lineup = Driver.CompTeam2._lineup;
      
      String team1name = Driver.MyTeam._name;
      String team2name = Driver.CompTeam2._name;
      Player freekicktaker1 = Driver.MyTeam._lineup.get(10);
      Player freekicktaker2 = Driver.CompTeam2._lineup.get(10);
      Player cornerkicktaker1 = Driver.MyTeam._lineup.get(6);
      Player cornerkicktaker2 = Driver.CompTeam2._lineup.get(6);
      Player penaltytaker1 = Driver.MyTeam._lineup.get(9);
      Player penaltytaker2 = Driver.CompTeam2._lineup.get(9);
      
     
  /*    MyFrame.gamerun1("My Team", team1lineup, "De Godenzonen" , team2lineup, Driver.MyTeam._lineup.get(10), Driver.CompTeam1._lineup.get(10), Driver.MyTeam._lineup.get(6), Driver.CompTeam1._lineup.get(6),
                       Driver.MyTeam._lineup.get(10), Driver.CompTeam1._lineup.get(10));
  
  public static void gamerun1(String team1name, ArrayList<Player> team1, String team2name, ArrayList<Player> team2, Player freekicktaker1, Player freekicktaker2,
                                Player cornerkicktaker1, Player cornerkicktaker2, Player penaltytaker1, Player penaltytaker2){
    
    */
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
 // Team team1 = new Team("Hello", 0,0,1,0,0,4,0,0,3,0,0,3);
  /*
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
  */

  //Team2
//  Team team2 = new Team("helo", 0,1,0,0,4,0,0,3,0,0,3,0);
  /*
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
  */

  String text = Simulation.gamerun(team1name, team1lineup, team2name, team2lineup, freekicktaker1,  freekicktaker2,
                                 cornerkicktaker1,  cornerkicktaker2,  penaltytaker1,  penaltytaker2);   
     String str = "";

     while (text.length() > 0) {
      str += text.substring(0,text.indexOf("\n"));
      text = text.substring(text.indexOf("\n") +1);
      str += "\n";
         aTextField.setText(str);
       try {
       Thread.sleep(2000);                 //1000 milliseconds is one second.
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
    
            //DAY 3
    if ((Driver.matchday % 5) == 3) {
      team1 = Driver.MyTeam;
      team2 = Driver.CompTeam3; 
      Driver.MyTeam._lineup = Team.setLineup(Driver.MyTeam._roster);
      Driver.CompTeam3._lineup = Team.setLineup(Driver.CompTeam3._roster);
      ArrayList<Player> team1lineup = Driver.MyTeam._lineup;
      ArrayList<Player> team2lineup = Driver.CompTeam3._lineup;
      
      String team1name = Driver.MyTeam._name;
      String team2name = Driver.CompTeam3._name;
      Player freekicktaker1 = Driver.MyTeam._lineup.get(10);
      Player freekicktaker2 = Driver.CompTeam3._lineup.get(10);
      Player cornerkicktaker1 = Driver.MyTeam._lineup.get(6);
      Player cornerkicktaker2 = Driver.CompTeam3._lineup.get(6);
      Player penaltytaker1 = Driver.MyTeam._lineup.get(9);
      Player penaltytaker2 = Driver.CompTeam3._lineup.get(9);
      
     
  /*    MyFrame.gamerun1("My Team", team1lineup, "De Godenzonen" , team2lineup, Driver.MyTeam._lineup.get(10), Driver.CompTeam1._lineup.get(10), Driver.MyTeam._lineup.get(6), Driver.CompTeam1._lineup.get(6),
                       Driver.MyTeam._lineup.get(10), Driver.CompTeam1._lineup.get(10));
  
  public static void gamerun1(String team1name, ArrayList<Player> team1, String team2name, ArrayList<Player> team2, Player freekicktaker1, Player freekicktaker2,
                                Player cornerkicktaker1, Player cornerkicktaker2, Player penaltytaker1, Player penaltytaker2){
    
    */
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
 // Team team1 = new Team("Hello", 0,0,1,0,0,4,0,0,3,0,0,3);
  /*
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
  */

  //Team2
//  Team team2 = new Team("helo", 0,1,0,0,4,0,0,3,0,0,3,0);
  /*
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
  */

  String text = Simulation.gamerun(team1name, team1lineup, team2name, team2lineup, freekicktaker1,  freekicktaker2,
                                 cornerkicktaker1,  cornerkicktaker2,  penaltytaker1,  penaltytaker2);   
     String str = "";

     while (text.length() > 0) {
      str += text.substring(0,text.indexOf("\n"));
      text = text.substring(text.indexOf("\n") +1);
      str += "\n";
         aTextField.setText(str);
       try {
       Thread.sleep(2000);                 //1000 milliseconds is one second.
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
                //DAY 4
    if ((Driver.matchday % 5) == 4) {
      team1 = Driver.MyTeam;
      team2 = Driver.CompTeam4; 
      Driver.MyTeam._lineup = Team.setLineup(Driver.MyTeam._roster);
      Driver.CompTeam4._lineup = Team.setLineup(Driver.CompTeam4._roster);
      ArrayList<Player> team1lineup = Driver.MyTeam._lineup;
      ArrayList<Player> team2lineup = Driver.CompTeam4._lineup;
      
      String team1name = Driver.MyTeam._name;
      String team2name = Driver.CompTeam4._name;
      Player freekicktaker1 = Driver.MyTeam._lineup.get(10);
      Player freekicktaker2 = Driver.CompTeam4._lineup.get(10);
      Player cornerkicktaker1 = Driver.MyTeam._lineup.get(6);
      Player cornerkicktaker2 = Driver.CompTeam4._lineup.get(6);
      Player penaltytaker1 = Driver.MyTeam._lineup.get(9);
      Player penaltytaker2 = Driver.CompTeam4._lineup.get(9);
      
     
  /*    MyFrame.gamerun1("My Team", team1lineup, "De Godenzonen" , team2lineup, Driver.MyTeam._lineup.get(10), Driver.CompTeam1._lineup.get(10), Driver.MyTeam._lineup.get(6), Driver.CompTeam1._lineup.get(6),
                       Driver.MyTeam._lineup.get(10), Driver.CompTeam1._lineup.get(10));
  
  public static void gamerun1(String team1name, ArrayList<Player> team1, String team2name, ArrayList<Player> team2, Player freekicktaker1, Player freekicktaker2,
                                Player cornerkicktaker1, Player cornerkicktaker2, Player penaltytaker1, Player penaltytaker2){
    
    */
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
 // Team team1 = new Team("Hello", 0,0,1,0,0,4,0,0,3,0,0,3);
  /*
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
  */

  //Team2
//  Team team2 = new Team("helo", 0,1,0,0,4,0,0,3,0,0,3,0);
  /*
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
  */

  String text = Simulation.gamerun(team1name, team1lineup, team2name, team2lineup, freekicktaker1,  freekicktaker2,
                                 cornerkicktaker1,  cornerkicktaker2,  penaltytaker1,  penaltytaker2);   
     String str = "";

     while (text.length() > 0) {
      str += text.substring(0,text.indexOf("\n"));
      text = text.substring(text.indexOf("\n") +1);
      str += "\n";
         aTextField.setText(str);
       try {
       Thread.sleep(2000);                 //1000 milliseconds is one second.
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
                //DAY 5
    if ((Driver.matchday % 5) == 0) {
      team1 = Driver.MyTeam;
      team2 = Driver.CompTeam5; 
      Driver.MyTeam._lineup = Team.setLineup(Driver.MyTeam._roster);
      Driver.CompTeam5._lineup = Team.setLineup(Driver.CompTeam5._roster);
      ArrayList<Player> team1lineup = Driver.MyTeam._lineup;
      ArrayList<Player> team2lineup = Driver.CompTeam5._lineup;
      
      String team1name = Driver.MyTeam._name;
      String team2name = Driver.CompTeam5._name;
      Player freekicktaker1 = Driver.MyTeam._lineup.get(10);
      Player freekicktaker2 = Driver.CompTeam5._lineup.get(10);
      Player cornerkicktaker1 = Driver.MyTeam._lineup.get(6);
      Player cornerkicktaker2 = Driver.CompTeam5._lineup.get(6);
      Player penaltytaker1 = Driver.MyTeam._lineup.get(9);
      Player penaltytaker2 = Driver.CompTeam5._lineup.get(9);
      
     
  /*    MyFrame.gamerun1("My Team", team1lineup, "De Godenzonen" , team2lineup, Driver.MyTeam._lineup.get(10), Driver.CompTeam1._lineup.get(10), Driver.MyTeam._lineup.get(6), Driver.CompTeam1._lineup.get(6),
                       Driver.MyTeam._lineup.get(10), Driver.CompTeam1._lineup.get(10));
  
  public static void gamerun1(String team1name, ArrayList<Player> team1, String team2name, ArrayList<Player> team2, Player freekicktaker1, Player freekicktaker2,
                                Player cornerkicktaker1, Player cornerkicktaker2, Player penaltytaker1, Player penaltytaker2){
    
    */
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
 // Team team1 = new Team("Hello", 0,0,1,0,0,4,0,0,3,0,0,3);
  /*
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
  */

  //Team2
//  Team team2 = new Team("helo", 0,1,0,0,4,0,0,3,0,0,3,0);
  /*
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
  */

  String text = Simulation.gamerun(team1name, team1lineup, team2name, team2lineup, freekicktaker1,  freekicktaker2,
                                 cornerkicktaker1,  cornerkicktaker2,  penaltytaker1,  penaltytaker2);   
     String str = "";

     while (text.length() > 0) {
      str += text.substring(0,text.indexOf("\n"));
      text = text.substring(text.indexOf("\n") +1);
      str += "\n";
         aTextField.setText(str);
       try {
       Thread.sleep(2000);                 //1000 milliseconds is one second.
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
   Driver.matchday++; 
}
}
   

