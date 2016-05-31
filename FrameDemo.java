import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
/* FrameDemo.java requires no other files. */
public class FrameDemo implements ActionListener { 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JMenuBar menuBar = createMenu();
	frame.setJMenuBar(menuBar);
 
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    private static JMenuBar createMenu() {
	//Where the GUI is created:
	JMenuBar menuBar;
	JMenu menu, submenu;
	JMenuItem menuItem;

	//Create the menu bar.
	menuBar = new JMenuBar();

	//Build the first menu.
	menu = new JMenu("A Menu");
	menu.setMnemonic(KeyEvent.VK_A);
	menu.getAccessibleContext().setAccessibleDescription(
            "The only menu in this program that has menu items");
	menuBar.add(menu);

	//a group of JMenuItems
	menuItem = new JMenuItem("Roster",
				 KeyEvent.VK_T);
	menuItem.setAccelerator(KeyStroke.getKeyStroke(
						       KeyEvent.VK_1, ActionEvent.ALT_MASK));
	menuItem.getAccessibleContext().setAccessibleDescription(
								 "This doesn't really do anything");
	menuItem.addActionListener(this);
	menu.add(menuItem);

	menuItem = new JMenuItem("Both text and icon",
				 new ImageIcon("images/middle.gif"));
	menuItem.setMnemonic(KeyEvent.VK_B);
	menuItem.addActionListener(this);
	menu.add(menuItem);

	menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
	menuItem.setMnemonic(KeyEvent.VK_D);
	menuItem.addActionListener(this);
	menu.add(menuItem);

	//a submenu
	menu.addSeparator();
	submenu = new JMenu("A submenu");
	submenu.setMnemonic(KeyEvent.VK_S);

	menuItem = new JMenuItem("An item in the submenu");
	menuItem.setAccelerator(KeyStroke.getKeyStroke(
						       KeyEvent.VK_2, ActionEvent.ALT_MASK));
	menuItem.addActionListener(this);
	submenu.add(menuItem);

	menuItem = new JMenuItem("Another item");
	menuItem.addActionListener(this);
	submenu.add(menuItem);
	menu.add(submenu);

	//Build second menu in the menu bar.
	menu = new JMenu("Another Menu");
	menu.setMnemonic(KeyEvent.VK_N);
	menu.getAccessibleContext().setAccessibleDescription(
            "This menu does nothing");
	menuBar.add(menu);
	
	return menuBar;
    }

    public void actionPerformed(ActionEvent e) {
	//...Get information from the action event...
	//...Display it in the text area...
	JMenuItem source = (JMenuItem)(e.getSource());
        this.setVisible(false);
	new FrmMain().setVisible(true);
    }
    
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
      JButton button = new JButton("Click This");  
      //button.addActionListener
      
    }
}
