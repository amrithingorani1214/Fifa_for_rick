import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class Ranking extends JFrame{
  
  public static JLabel scorer3;
  public static String record = "Your record: ";

  public Ranking() {
     JFrame frame4 = new JFrame("Ranking");
    frame4.setSize(400,400);
    
    
    int max = 0;
    Player maxplayer = new Player();
    
    for (Player i : Driver.CompTeam1._roster) {
      if (i._goals > max) {
       maxplayer = i; 
       max = i._goals;
      }
    }
    
        for (Player i : Driver.CompTeam2._roster) {
      if (i._goals > max) {
       maxplayer = i; 
       max = i._goals;
      }
    }
            for (Player i : Driver.CompTeam3._roster) {
      if (i._goals > max) {
       maxplayer = i; 
       max = i._goals;
      }
    }
    
                for (Player i : Driver.CompTeam4._roster) {
      if (i._goals > max) {
       maxplayer = i; 
       max = i._goals;
      }
    }
                
                    for (Player i : Driver.CompTeam5._roster) {
      if (i._goals > max) {
       maxplayer = i; 
       max = i._goals;
      }
    }
                        for (Player i : Driver.MyTeam._roster) {
      if (i._goals >= max) {
       maxplayer = i; 
       max = i._goals;
      }
    }
                                JPanel main = new JPanel();
                                JLabel scorer = new JLabel();
                                
      scorer.setText("Top Scorer: " + maxplayer._name + " " + max + " goals                    ");                  
        main.add(scorer);
        scorer.setLocation(2,2);
        
        
        //ASSISTS
         int maxa = 0;
    Player maxplayera = new Player();
    
    for (Player i : Driver.CompTeam1._roster) {
      if (i._assists > maxa) {
       maxplayera = i; 
       maxa = i._assists;
      }
    }
    
        for (Player i : Driver.CompTeam2._roster) {
      if (i._assists > maxa) {
       maxplayera = i; 
       maxa = i._assists;
      }
    }
            for (Player i : Driver.CompTeam3._roster) {
      if (i._assists > maxa) {
       maxplayera = i; 
       maxa = i._assists;
      }
    }
    
                for (Player i : Driver.CompTeam4._roster) {
      if (i._assists > maxa) {
       maxplayera = i; 
       maxa = i._assists;
      }
    }
                
                    for (Player i : Driver.CompTeam5._roster) {
      if (i._assists > maxa) {
       maxplayera = i; 
       maxa = i._assists;
      }
    }
                        for (Player i : Driver.MyTeam._roster) {
      if (i._assists >= maxa) {
       maxplayera = i; 
       maxa = i._assists;
      }
    }
                               
                                JLabel scorer2 = new JLabel();
                                
      scorer2.setText("Highest Assists: " + maxplayera._name + " " + maxa + " assists                               ");     
      
        main.add(scorer2);
        scorer2.setLocation(30,30);
    
        scorer3 = new JLabel();
                                
      scorer3.setText(record);   
       scorer3.setLocation(50,30);
       main.add(scorer3);
        
  /*
   *
   String[] columns = new String[] {
     
          "Team", "Wins", "Losses", "Draws", "Points", "Position", "Goals For", "Goals Against", "Goal Difference"};
         
        //actual data for the table in a 2d array
       
 
        ArrayList<Team> standings = new ArrayList<Team>();
        
        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(Driver.MyTeam._points);
        points.add(Driver.CompTeam1._points);
        points.add(Driver.CompTeam2._points);
        points.add(Driver.CompTeam3._points);
        points.add(Driver.CompTeam4._points);
        points.add(Driver.CompTeam5._points);
        
        for (int i = 0; i < 6; i++) {
        int maxpoints = 0;
        int maxpos = 0;
        
        for (int a = 0; a < points.size(); a++) {
          if (points.get(a) > maxpoints) {
            maxpos = a;
            maxpoints = points.get(a);
          }
          
        }
        
          for (int a : points) {
      if (a >= maxpoints) {
       maxpoints = a;
       maxpos = points.indexOf(a);
      }
      }
      
    if (maxpos == 0) {
      standings.add(Driver.MyTeam);}
    if (maxpos == 1) {
      standings.add(Driver.CompTeam1);}
    if (maxpos == 2) {
      standings.add(Driver.CompTeam2);}
    if (maxpos == 3) {
      standings.add(Driver.CompTeam3);}
    if (maxpos == 4) {
      standings.add(Driver.CompTeam4);}
    if (maxpos == 5) {
      standings.add(Driver.CompTeam5);}
    
   // while (maxpos != -1) {
      points.set(maxpos, -1);
      
        }
        
    
        Object[][] data = new Object[][] {
          {standings.get(0)._name, standings.get(0)._wins, standings.get(0)._losses, standings.get(0)._draws, standings.get(0)._points, standings.get(0)._goalsfor, standings.get(0)._goalsagainst,
            (standings.get(0)._goalsfor - standings.get(0)._goalsagainst)}
          ,
          {standings.get(1)._name, standings.get(1)._wins, standings.get(1)._losses, standings.get(1)._draws, standings.get(1)._points, standings.get(1)._goalsfor, standings.get(1)._goalsagainst,
            (standings.get(1)._goalsfor - standings.get(1)._goalsagainst)}
          ,{standings.get(2)._name, standings.get(2)._wins, standings.get(2)._losses, standings.get(2)._draws, standings.get(2)._points, standings.get(2)._goalsfor, standings.get(2)._goalsagainst,
            (standings.get(2)._goalsfor - standings.get(2)._goalsagainst)}
          , 
          {standings.get(3)._name, standings.get(3)._wins, standings.get(3)._losses, standings.get(3)._draws, standings.get(3)._points, standings.get(3)._goalsfor, standings.get(3)._goalsagainst,
            (standings.get(3)._goalsfor - standings.get(3)._goalsagainst)}
          ,{standings.get(4)._name, standings.get(4)._wins, standings.get(4)._losses, standings.get(4)._draws, standings.get(4)._points, standings.get(4)._goalsfor, standings.get(4)._goalsagainst,
            (standings.get(4)._goalsfor - standings.get(4)._goalsagainst)}
          ,{standings.get(5)._name, standings.get(5)._wins, standings.get(5)._losses, standings.get(5)._draws, standings.get(5)._points, standings.get(5)._goalsfor, standings.get(5)._goalsagainst,
            (standings.get(5)._goalsfor - standings.get(5)._goalsagainst)}
        };
        //create table with data
        JTable table = new JTable(data, columns);
        table.setSize(200,200);
        //add the table to the frame
        main.add(table);
       */
        frame4.add(main);
       // table.setVisible(true);
        main.setVisible(true);
            frame4.setVisible(true);
 
  }
  
   public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ranking();
            }
        });

     
    }
  
  public static void running() {
     SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ranking();
            }
        });

     
    }
}