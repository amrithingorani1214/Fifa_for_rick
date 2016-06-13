import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 import java.util.Arrays;
  import java.util.ArrayList;
  import java.io.*;
 
public class Roster extends JFrame
{
    public Roster()
    {

        //headers for the table
        String[] columns = new String[] {
          "Position", "Name", "Age", "Attack", "Defense", "Overall", "Goals", "Assists", "Injury", "Suspended"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[Driver.MyTeam._roster.size()][10];
        
        ArrayList<Object> Attackers = new ArrayList<Object>();
        ArrayList<Object> Midfielders = new ArrayList<Object>();
        ArrayList<Object> Defenders = new ArrayList<Object>();
        ArrayList<Object> Goalkeepers = new ArrayList<Object>();
        
        for (int i = 0; i < Driver.MyTeam._roster.size(); i ++) {
          if (Driver.MyTeam._roster.get(i)._pos.equals("A")) {
            Attackers.add("A");
            Attackers.add(Driver.MyTeam._roster.get(i)._name);
            Attackers.add(Driver.MyTeam._roster.get(i)._age);
            Attackers.add(Driver.MyTeam._roster.get(i)._attack);
            Attackers.add(Driver.MyTeam._roster.get(i)._overall);
            Attackers.add(Driver.MyTeam._roster.get(i)._defense);
            Attackers.add(Driver.MyTeam._roster.get(i)._goals);
            Attackers.add(Driver.MyTeam._roster.get(i)._assists);
            Attackers.add(Driver.MyTeam._roster.get(i)._injury);
            Attackers.add(Driver.MyTeam._roster.get(i)._suspended);
          }
          if (Driver.MyTeam._roster.get(i)._pos.equals("M")) {
            Midfielders.add("M");
            Midfielders.add(Driver.MyTeam._roster.get(i)._name);
            Midfielders.add(Driver.MyTeam._roster.get(i)._age);
            Midfielders.add(Driver.MyTeam._roster.get(i)._attack);
            Midfielders.add(Driver.MyTeam._roster.get(i)._overall);
            Midfielders.add(Driver.MyTeam._roster.get(i)._defense);
            Midfielders.add(Driver.MyTeam._roster.get(i)._goals);
            Midfielders.add(Driver.MyTeam._roster.get(i)._assists);
            Midfielders.add(Driver.MyTeam._roster.get(i)._injury);
            Midfielders.add(Driver.MyTeam._roster.get(i)._suspended);
          }
          if (Driver.MyTeam._roster.get(i)._pos.equals("D")) {
            Defenders.add("D");
            Defenders.add(Driver.MyTeam._roster.get(i)._name);
            Defenders.add(Driver.MyTeam._roster.get(i)._age);
            Defenders.add(Driver.MyTeam._roster.get(i)._attack);
            Defenders.add(Driver.MyTeam._roster.get(i)._overall);
            Defenders.add(Driver.MyTeam._roster.get(i)._defense);
            Defenders.add(Driver.MyTeam._roster.get(i)._goals);
            Defenders.add(Driver.MyTeam._roster.get(i)._assists);
            Defenders.add(Driver.MyTeam._roster.get(i)._injury);
            Defenders.add(Driver.MyTeam._roster.get(i)._suspended);
          }
          if (Driver.MyTeam._roster.get(i)._pos.equals("G")) {
            Goalkeepers.add("G");
            Goalkeepers.add(Driver.MyTeam._roster.get(i)._name);
            Goalkeepers.add(Driver.MyTeam._roster.get(i)._age);
            Goalkeepers.add(Driver.MyTeam._roster.get(i)._attack);
            Goalkeepers.add(Driver.MyTeam._roster.get(i)._overall);
            Goalkeepers.add(Driver.MyTeam._roster.get(i)._defense);
            Goalkeepers.add(Driver.MyTeam._roster.get(i)._goals);
            Goalkeepers.add(Driver.MyTeam._roster.get(i)._assists);
            Goalkeepers.add(Driver.MyTeam._roster.get(i)._injury);
            Goalkeepers.add(Driver.MyTeam._roster.get(i)._suspended);
          }
        }
        while (Midfielders.size() > 0) {
         Attackers.add(Midfielders.get(0));
         Midfielders.remove(0);
        }
        while (Defenders.size() > 0) {
         Attackers.add(Defenders.get(0));
         Defenders.remove(0);
        }
        while (Goalkeepers.size() > 0) {
         Attackers.add(Goalkeepers.get(0));
         Goalkeepers.remove(0);
        }
        int placeholder = 0;
        while (Attackers.size() > 0) {
         data[placeholder / 10][placeholder % 10] = Attackers.get(0);
         Attackers.remove(0);
        }
        
        
 
        //create table with data
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
        table.setBackground(Color.green);
        table.setFont(new Font("Arial", Font.BOLD, 12));
    }
     
    public static void running() {
     
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Roster();
            }
        });

     
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Roster();
            }
        });

    }   
}