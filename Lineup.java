import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.JList;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Lineup extends JApplet{

public static void main(String[] args) {
    GlassView view = new GlassView(new ComboBoxes());
}
public static void runstuff() {
   GlassView view = new GlassView(new ComboBoxes());
}
  


private static class GlassView extends JFrame {
    private int width = 1000;
    private int height = 750;

    public GlassView(JApplet applet) {
        this.setSize(width, height);

        

        JPanel glass = new JPanel();
        glass.setSize(450, 750);
        glass.setBackground(Color.GREEN);
        glass.setVisible(true);
        glass.setLayout(null);
        
           JComboBox jComboBox1 = new JComboBox();
    jComboBox1.addItem("Messi");
    jComboBox1.addItem("Ronaldo");
    jComboBox1.addItem("Suarez");
    jComboBox1.addItem("Neymar");
    Object cmboitem = jComboBox1.getSelectedItem();
    //System.out.println(cmboitem);
    jComboBox1.setBounds(100, 80, 150, 50);

    glass.add(jComboBox1);
    
           JComboBox jComboBox2 = new JComboBox();
    jComboBox2.addItem("Iniesta");
    jComboBox2.addItem("Rakitic");
    jComboBox2.addItem("Modric");
    jComboBox2.addItem("Xavi");
    Object cmboitem2 = jComboBox2.getSelectedItem();
   // System.out.println(cmboitem2);
jComboBox2.setBounds(350, 80, 150, 50);
    glass.add(jComboBox2);
    
               JComboBox jComboBox3 = new JComboBox();
    jComboBox3.addItem("Iniesta");
    jComboBox3.addItem("Rakitic");
    jComboBox3.addItem("Modric");
    jComboBox3.addItem("HLELEOO");
    Object cmboitem3 = jComboBox3.getSelectedItem();
   // System.out.println(cmboitem3);
jComboBox3.setBounds(600, 80, 150, 50);
    glass.add(jComboBox3);

 
               JComboBox jComboBox4 = new JComboBox();
    jComboBox4.addItem("Iniesta");
    jComboBox4.addItem("Rakitic");
    jComboBox4.addItem("Modric");
    jComboBox4.addItem("WEEB");
    Object cmboitem4 = jComboBox4.getSelectedItem();
   // System.out.println(cmboitem3);
   jComboBox4.setBounds(100, 260, 150, 50);
    glass.add(jComboBox4);
    
                   JComboBox jComboBox5 = new JComboBox();
    jComboBox5.addItem("Iniesta");
    jComboBox5.addItem("Rakitic");
    jComboBox5.addItem("Modric");
    jComboBox5.addItem("WEEB");
    Object cmboitem5 = jComboBox5.getSelectedItem();
   // System.out.println(cmboitem3);
   jComboBox5.setBounds(350, 260, 150, 50);
    glass.add(jComboBox5);
    
                       JComboBox jComboBox6 = new JComboBox();
    jComboBox6.addItem("Iniesta");
    jComboBox6.addItem("Rakitic");
    jComboBox6.addItem("Modric");
    jComboBox6.addItem("WEEB");
    Object cmboitem6 = jComboBox6.getSelectedItem();
   // System.out.println(cmboitem3);
   jComboBox6.setBounds(600, 260, 150, 50);
    glass.add(jComboBox6);
    
    
        JComboBox jComboBox8 = new JComboBox();
    jComboBox8.addItem("Iniesta");
    jComboBox8.addItem("Rakitic");
    jComboBox8.addItem("Modric");
    jComboBox8.addItem("WEEB");
    Object cmboitem8 = jComboBox8.getSelectedItem();
   // System.out.println(cmboitem3);
   jComboBox8.setBounds(50, 450, 150, 50);
    glass.add(jComboBox8);
    
            JComboBox jComboBox9 = new JComboBox();
    jComboBox9.addItem("Iniesta");
    jComboBox9.addItem("Rakitic");
    jComboBox9.addItem("Modric");
    jComboBox9.addItem("WEEB");
    Object cmboitem9 = jComboBox9.getSelectedItem();
   // System.out.println(cmboitem3);
   jComboBox9.setBounds(250, 450, 150, 50);
    glass.add(jComboBox9);
    
            JComboBox jComboBox10 = new JComboBox();
    jComboBox10.addItem("Iniesta");
    jComboBox10.addItem("Rakitic");
    jComboBox10.addItem("Modric");
    jComboBox10.addItem("WEEB");
    Object cmboitem10 = jComboBox10.getSelectedItem();
   // System.out.println(cmboitem3);
   jComboBox10.setBounds(450, 450, 150, 50);
    glass.add(jComboBox10);
    
            JComboBox jComboBox7 = new JComboBox();
    jComboBox7.addItem("Iniesta");
    jComboBox7.addItem("Rakitic");
    jComboBox7.addItem("Modric");
    jComboBox7.addItem("WEEB");
    Object cmboitem7 = jComboBox7.getSelectedItem();
   // System.out.println(cmboitem3);
   jComboBox7.setBounds(650, 450, 150, 50);
    glass.add(jComboBox7);
    
                JComboBox jComboBox11 = new JComboBox();
    jComboBox11.addItem("Iniesta");
    jComboBox11.addItem("Rakitic");
    jComboBox11.addItem("Modric");
    jComboBox11.addItem("WEEB");
    Object cmboitem11 = jComboBox11.getSelectedItem();
   // System.out.println(cmboitem3);
   jComboBox11.setBounds(350, 650, 150, 50);
    glass.add(jComboBox11);
    
    JPanel rectangle = new JPanel();//New.   
        rectangle.setBackground( Color.gray);//New.   
        rectangle.setBounds(335, 690, 175, 50);//New.
        glass.add( rectangle );//New.
        
    
        JPanel controls = new JPanel();
        controls.setSize(150, 750);
        controls.setBackground(Color.WHITE);
        
        
         String[] columns = new String[] {
          "Player", "Rating"};
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
          {"Messi", "98"},{"Ronaldo", "99"}
        };
 
        //create table with data
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        controls.add(table);
         
        table.setFont(new Font("Arial", Font.BOLD, 12));
        controls.setVisible(true);

        JSplitPane splitPane = new JSplitPane();
        splitPane.setSize(width, height);
        splitPane.setDividerSize(0);
        splitPane.setDividerLocation(150);
        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setLeftComponent(controls);
        splitPane.setRightComponent(glass);

        this.add(splitPane);
                this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

}
