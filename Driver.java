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
import java.io.*;

public class Driver extends JFrame {
  
  //Gold: 20000
  //Silver: 14000
  //Bronze: 7500
  public static int money = 160000;

  //public static ArrayList<Player> _roster = new ArrayList<Player>();

/*
  public static ArrayList<Player> MyTeamAttackers = new ArrayList<Player>();
  public static ArrayList<Player> MyTeamMidfielders = new ArrayList<Player>();
  public static ArrayList<Player> MyTeamDefenders = new ArrayList<Player>();
  public static ArrayList<Player> MyTeamGoalkeepers = new ArrayList<Player>();
*/
  public static Team MyTeam;
  public static Team CompTeam1;
  public static Team CompTeam2;
  public static Team CompTeam3;
  public static Team CompTeam4;
  public static Team CompTeam5;
  
  public static String CompTeam1name = "De Godenzonen";
  public static String CompTeam2name = "Tractor Boys";
  public static String CompTeam3name = "The Magical Magyars";
  public static String CompTeam4name = "The Indomitable Lions ";
  public static String CompTeam5name = "Socceroos";
/*
  public static int MyTeampoints= MyTeam._points;
  public static int CompTeam1points= CompTeam1._points;
  public static int CompTeam2points= CompTeam2._points;
  public static int CompTeam3points= CompTeam3._points;
  public static int CompTeam4points= CompTeam4._points;
  public static int CompTeam5points= CompTeam5._points;
  
  public static int MyTeamgoalsfor= MyTeam._goalsfor;
  public static int CompTeam1goalsfor= CompTeam1._goalsfor;
  public static int CompTeam2goalsfor= CompTeam2._goalsfor;
  public static int CompTeam3goalsfor= CompTeam3._goalsfor;
  public static int CompTeam4goalsfor= CompTeam4._goalsfor;
  public static int CompTeam5goalsfor= CompTeam5._goalsfor;
  
  public static int MyTeamgoalsagainst= MyTeam._goalsagainst;
  public static int CompTeam1goalsagainst= CompTeam1._goalsagainst;
  public static int CompTeam2goalsagainst= CompTeam2._goalsagainst;
  public static int CompTeam3goalsagainst= CompTeam3._goalsagainst;
  public static int CompTeam4goalsagainst= CompTeam4._goalsagainst;
  public static int CompTeam5goalsagainst= CompTeam5._goalsagainst;
  
  public static int MyTeamwins= MyTeam._wins;
  public static int CompTeam1wins= CompTeam1._g;
  public static int CompTeam2wins= 0;
  public static int CompTeam3wins= 0;
  public static int CompTeam4wins= 0;
  public static int CompTeam5wins= 0;

  public static int MyTeamlosses= 0;
  public static int CompTeam1losses= 0;
  public static int CompTeam2losses= 0;
  public static int CompTeam3losses= 0;
  public static int CompTeam4losses= 0;
  public static int CompTeam5losses= 0;
  
  public static int MyTeamdraws= 0;
  public static int CompTeam1draws= 0;
  public static int CompTeam2draws= 0;
  public static int CompTeam3draws= 0;
  public static int CompTeam4draws= 0;
  public static int CompTeam5draws= 0;
*/
  
  public static void main(String[] args) throws IOException {
    setupteams();
  }
  
  public static void setupteams() throws IOException {
    
   MyTeam = new Team("My Team",0,0,0,0,0,0,0,0,0,0,0,0);
  CompTeam1 = new Team("De Godenzonen",0,0,0,0,0,0,0,0,0,0,0,0);
  CompTeam2 = new Team("Tractor Boys",0,0,0,0,0,0,0,0,0,0,0,0);
  CompTeam3 = new Team("The Magical Magyars",0,0,0,0,0,0,0,0,0,0,0,0);
  CompTeam4 = new Team("The Indomitable Lions",0,0,0,0,0,0,0,0,0,0,0,0);
  CompTeam5 = new Team("Socceroos",0,0,0,0,0,0,0,0,0,0,0,0);

   //4,5,2
 CompTeam1.merge(0,0,1,1,3,0,1,2,0,0,0,3);
 //MyTeam._roster.add(new Player("Abbiatti", "G", 25, 90.0, 90.0, 90.0));
// MyTeam._roster.get(0)._goals = 100;
/*
  CompTeam1.add(TransferMarket.GoldGoalie());
  CompTeam1.add(TransferMarket.SilverDefender());
  CompTeam1.add(TransferMarket.BronzeDefender());
  CompTeam1.add(TransferMarket.SilverDefender());
  CompTeam1.add(TransferMarket.SilverDefender());
    CompTeam1.add(TransferMarket.BronzeMidfielder());
      CompTeam1.add(TransferMarket.SilverMidfielder());
        CompTeam1.add(TransferMarket.SilverMidfielder());
  CompTeam1.add(TransferMarket.GoldAttacker());
  CompTeam1.add(TransferMarket.GoldAttacker());
  CompTeam1.add(TransferMarket.GoldAttacker()); 
*/

 //1,6,4
 CompTeam2.merge(0,1,0,2,2,0,1,2,0,1,1,1);
/*
   CompTeam2.add(TransferMarket.SilverGoalie());
  CompTeam2.add(TransferMarket.BronzeDefender());
  CompTeam2.add(TransferMarket.BronzeDefender());
  CompTeam2.add(TransferMarket.SilverDefender());
  CompTeam2.add(TransferMarket.SilverDefender());
    CompTeam2.add(TransferMarket.SilverMidfielder());
      CompTeam2.add(TransferMarket.SilverMidfielder());
        CompTeam2.add(TransferMarket.BronzeMidfielder());
  CompTeam2.add(TransferMarket.SilverAttacker());
  CompTeam2.add(TransferMarket.GoldAttacker());
  CompTeam2.add(TransferMarket.BronzeAttacker());
*/

 //4,1,6
 CompTeam3.merge(0,1,0,0,0,4,3,0,0,3,0,0);
 /*
     CompTeam3.add(TransferMarket.SilverGoalie());
  CompTeam3.add(TransferMarket.GoldDefender());
  CompTeam3.add(TransferMarket.GoldDefender());
  CompTeam3.add(TransferMarket.GoldDefender());
  CompTeam3.add(TransferMarket.GoldDefender());
    CompTeam3.add(TransferMarket.BronzeMidfielder());
      CompTeam3.add(TransferMarket.BronzeMidfielder());
        CompTeam3.add(TransferMarket.BronzeMidfielder());
  CompTeam3.add(TransferMarket.BronzeAttacker());
  CompTeam3.add(TransferMarket.BronzeAttacker());
  CompTeam3.add(TransferMarket.BronzeAttacker());
   */
  
 //6,0,5
 CompTeam4.merge(1,0,0,4,0,0,0,0,3,0,0,3);
 /*
       CompTeam4.add(TransferMarket.BronzeGoalie());
  CompTeam4.add(TransferMarket.BronzeDefender());
  CompTeam4.add(TransferMarket.BronzeDefender());
  CompTeam4.add(TransferMarket.BronzeDefender());
  CompTeam4.add(TransferMarket.BronzeDefender());
    CompTeam4.add(TransferMarket.GoldMidfielder());
      CompTeam4.add(TransferMarket.GoldMidfielder());
        CompTeam4.add(TransferMarket.GoldMidfielder());
  CompTeam4.add(TransferMarket.GoldAttacker());
  CompTeam4.add(TransferMarket.GoldAttacker());
  CompTeam4.add(TransferMarket.GoldAttacker());
 */

 //0,11,0
 CompTeam5.merge(0,1,0,0,4,0,0,3,0,0,3,0);
 /*
         CompTeam5.add(TransferMarket.SilverGoalie());
  CompTeam5.add(TransferMarket.SilverDefender());
  CompTeam5.add(TransferMarket.SilverDefender());
  CompTeam5.add(TransferMarket.SilverDefender());
  CompTeam5.add(TransferMarket.SilverDefender());
    CompTeam5.add(TransferMarket.SilverMidfielder());
      CompTeam5.add(TransferMarket.SilverMidfielder());
        CompTeam5.add(TransferMarket.SilverMidfielder());
  CompTeam5.add(TransferMarket.SilverAttacker());
  CompTeam5.add(TransferMarket.SilverAttacker());
  CompTeam5.add(TransferMarket.SilverAttacker());
   */
   MenuSetup.running(); 
  }
}

  
