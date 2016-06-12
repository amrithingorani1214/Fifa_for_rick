import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

public class MenuSetup extends JFrame implements ActionListener{

public static void main (String[] args){



      JFrame.setDefaultLookAndFeelDecorated(true);

      MenuSetup frame = new MenuSetup();

  frame.setVisible(true);
  frame.setSize(1000,400);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPanel panel = new JPanel();
  frame.add(panel);
  JButton button = new JButton("Transfer Market");
  panel.add(button);
  button.addActionListener (new Action1());
  JButton button2 = new JButton("Lineup");
  panel.add(button2);
  button2.addActionListener (new Action2());
  JButton button3 = new JButton("Ranking");
  panel.add(button3);
  button3.addActionListener (new Action3());
  JButton button4 = new JButton("Training");
  panel.add(button4);
  button4.addActionListener (new Action4());
  JButton button5 = new JButton("Roster");
  panel.add(button5);
  button5.addActionListener (new Action5());
  
}
static class Action1 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
    JFrame frame2 = new JFrame("Transfer Market");
    frame2.setVisible(true);
    frame2.setSize(700,400);
   
    JPanel panel = new JPanel();
    
    ImageIcon warnIcon = new ImageIcon("bicyclekick.jpg");
    Image icon = warnIcon.getImage();
    Image warnIconnew = icon.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final1 = new ImageIcon(warnIconnew);
    JButton button = new JButton(final1);
    button.setText("Buy Gold Attacker");
    button.addActionListener (new Action100());
    
    ImageIcon warnIcon2 = new ImageIcon("attacker.jpg");
    Image icon2 = warnIcon2.getImage();
    Image warnIconnew2 = icon2.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final2 = new ImageIcon(warnIconnew2);
    JButton button2 = new JButton(final2);
    button2.setText("Buy Silver Attacker");
    button2.addActionListener (new Action90());
    
   ImageIcon warnIcon3 = new ImageIcon("header.jpg");
    Image icon3 = warnIcon3.getImage();
    Image warnIconnew3 = icon3.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final3 = new ImageIcon(warnIconnew3);
    JButton button3 = new JButton(final3);
    button3.setText("Buy Bronze Attacker");
    button3.addActionListener (new Action80());
    
       ImageIcon warnIcon4 = new ImageIcon("midgold.jpg");
    Image icon4 = warnIcon4.getImage();
    Image warnIconnew4 = icon4.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final4 = new ImageIcon(warnIconnew3);
    JButton button4 = new JButton(final4);
    button4.setText("Buy Gold Midfielder");
    button.addActionListener (new Action101());
    
       ImageIcon warnIcon5 = new ImageIcon("midsilver.png");
    Image icon5 = warnIcon5.getImage();
    Image warnIconnew5 = icon5.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final5 = new ImageIcon(warnIconnew5);
    JButton button5 = new JButton(final5);
    button5.setText("Buy Silver Midfielder");
    button5.addActionListener (new Action91());
    
           ImageIcon warnIcon6 = new ImageIcon("midsilver.jpg");
    Image icon6 = warnIcon6.getImage();
    Image warnIconnew6 = icon6.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final6 = new ImageIcon(warnIconnew6);
    JButton button6 = new JButton(final6);
    button6.setText("Buy Bronze Midfielder");
    button6.addActionListener (new Action81());
    
           ImageIcon warnIcon7 = new ImageIcon("defgold.jpg");
    Image icon7 = warnIcon7.getImage();
    Image warnIconnew7 = icon7.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final7 = new ImageIcon(warnIconnew7);
    JButton button7 = new JButton(final7);
    button7.setText("Buy Gold Defender");
    button7.addActionListener (new Action102());
  
              ImageIcon warnIcon8 = new ImageIcon("defsilver.png");
    Image icon8 = warnIcon8.getImage();
    Image warnIconnew8 = icon8.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final8 = new ImageIcon(warnIconnew8);
    JButton button8 = new JButton(final8);
    button8.setText("Buy Silver Defender");
    button8.addActionListener (new Action92());
    
                  ImageIcon warnIcon9 = new ImageIcon("defbronze.jpg");
    Image icon9 = warnIcon9.getImage();
    Image warnIconnew9 = icon9.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final9 = new ImageIcon(warnIconnew9);
    JButton button9 = new JButton(final9);
    button9.setText("Buy Bronze Defender");
    button9.addActionListener (new Action82());
    
                      ImageIcon warnIcon10 = new ImageIcon("goalgold.jpg");
    Image icon10 = warnIcon10.getImage();
    Image warnIconnew10 = icon10.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final10 = new ImageIcon(warnIconnew10);
    JButton button10 = new JButton(final10);
    button10.setText("Buy Gold Goalkeeper");
    button10.addActionListener (new Action103());
    
     ImageIcon warnIcon11 = new ImageIcon("defbronze.jpg");
    Image icon11 = warnIcon11.getImage();
    Image warnIconnew11 = icon11.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final11 = new ImageIcon(warnIconnew11);
    JButton button11 = new JButton(final11);
    button11.setText("Buy Silver Goalkeeper");
    button11.addActionListener (new Action93());
    
          ImageIcon warnIcon12 = new ImageIcon("defbronze.jpg");
    Image icon12 = warnIcon12.getImage();
    Image warnIconnew12 = icon12.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
    Icon final12 = new ImageIcon(warnIconnew12);
    JButton button12 = new JButton(final12);
    button12.setText("Buy Bronze Goalkeeper");
    button12.addActionListener (new Action83());
    
  panel.add(button);
  panel.add(button2);
  panel.add(button3);
    panel.add(button4);
  panel.add(button5);
  panel.add(button6);
    panel.add(button7);
  panel.add(button8);
  panel.add(button9);
    panel.add(button10);
  panel.add(button11);
  panel.add(button12);
  button.addActionListener (new Action1());
    frame2.add(panel);
 
  }
}

static class Action2 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Lineup.runstuff();
    /* JFrame frame3 = new JFrame("Lineup");
    frame3.setVisible(true);
    frame3.setSize(400,400);

    JLabel label = new JLabel("Squad");
    JPanel panel = new JPanel();
    frame3.add(panel);
    panel.add(label);*/
  }
}
static class Action3 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
    JFrame frame4 = new JFrame("Ranking");
    frame4.setVisible(true);
    frame4.setSize(400,400);

    JLabel label = new JLabel("Leaderboard");
    JPanel panel = new JPanel();
    frame4.add(panel);
    panel.add(label);
  }
}
static class Action4 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
    JFrame frame5 = new JFrame("Training");
    frame5.setVisible(true);
    frame5.setSize(400,400);

    JLabel label = new JLabel("Click here");
    JPanel panel = new JPanel();
    frame5.add(panel);
    panel.add(label);
  }
}
static class Action5 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
    JFrame frame6 = new JFrame("Training");
    frame6.setVisible(true);
    frame6.setSize(400,400);

    JLabel label = new JLabel("Click here");
    JPanel panel = new JPanel();
    frame6.add(panel);
    panel.add(label);
  }
}

public JMenuBar createMenuBar() {
    JMenuBar menuBar = new JMenuBar();

    JMenu menu = new JMenu("Home");
    menuBar.add(menu);

    JMenuItem menuItem = new JMenuItem("Transfer Market");
    menuItem.addActionListener(new Action1());
    menu.add(menuItem);

    menuItem = new JMenuItem("Lineup");
    menuItem.addActionListener(new Action2());
    menu.add(menuItem);

    menuItem = new JMenuItem("Ranking");
    menuItem.addActionListener(new Action3());
    menu.add(menuItem);

    menuItem = new JMenuItem("Another One");
    menuItem.addActionListener(new Action4());
    menu.add(menuItem);

    menuItem = new JMenuItem("Quit");
    menuItem.setActionCommand("quit");
    menuItem.addActionListener(this);
    menu.add(menuItem);

    return menuBar;
}

static class Action100 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.GoldAttacker());
  Driver.money -= 20000;
  }}

static class Action90 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.SilverAttacker());
  Driver.money -= 14000;
  }}

static class Action80 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.BronzeAttacker());
  Driver.money -= 7500;
  }}

static class Action101 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.GoldAttacker());
  Driver.money -= 20000;
  }}

static class Action91 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.SilverAttacker());
  Driver.money -= 14000;
  }}

static class Action81 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.BronzeAttacker());
  Driver.money -= 7500;
  }}

static class Action102 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.GoldAttacker());
  Driver.money -= 20000;
  }}

static class Action92 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.SilverAttacker());
  Driver.money -= 14000;
  }}

static class Action82 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.BronzeAttacker());
  Driver.money -= 7500;
  }}
static class Action103 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.GoldAttacker());
  Driver.money -= 20000;
  }}

static class Action93 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.SilverAttacker());
  Driver.money -= 14000;
  }}

static class Action83 implements ActionListener {
  public void actionPerformed (ActionEvent e) {
  Driver.MyTeamAttackers.add(TransferMarket.BronzeAttacker());
  Driver.money -= 7500;
  }}

public void actionPerformed(ActionEvent e) {
    if (!true) {

    } else {
        quit();
    }
}
protected void quit() {
    System.exit(0);
}

public MenuSetup() {
    super("Fifa for Rick");
    setJMenuBar(createMenuBar());
}
}
