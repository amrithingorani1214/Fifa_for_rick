import java.io.*;
import java.util.ArrayList;

public class Team {
    
    public String _name;
 public ArrayList<Player> _roster;
    public int _numGoalie;
    public int _numDefend;
    public int _numMid;
    public int _numAtt;
 public int _points;
 public int _wins;
 public int _losses;
 public int _draws;
 public int _goalsfor;
 public int _goalsagainst;
 public ArrayList<Player> _lineup;

 public Team() {
   
 }
 public Team(String name, int bg, int sg, int gg, int bd, int sd, int gd, int bm, int sm, int gm, int ba, int sa, int ga) throws IOException {
_roster = new ArrayList<Player>();
  _name = name;

/******************Initializing roster***********************/

  _roster = new ArrayList<Player>();
  
  for (int k = 0; k < bg; k++) {
   _roster.add(TransferMarket.BronzeGoalie());
   _numGoalie++;
  }
  for (int k = 0; k < sg; k++) {
   _roster.add(TransferMarket.SilverGoalie());
   _numGoalie++;
  }
  for (int k = 0; k < gg; k++) {
   _roster.add(TransferMarket.GoldGoalie());
   _numGoalie++;
  }
  for (int k = 0; k < bd; k++) {
   _roster.add(TransferMarket.BronzeDefender());
   _numDefend++;
  }
  for (int k = 0; k < sd; k++) {
   _roster.add(TransferMarket.SilverDefender());
   _numDefend++;
  }
  for (int k = 0; k < gd; k++) {
   _roster.add(TransferMarket.GoldDefender());
   _numDefend++;
  }
  for (int k = 0; k < bm; k++) {
   _roster.add(TransferMarket.BronzeMidfielder());
   _numMid++;
  }
  for (int k = 0; k < sm; k++) {
   _roster.add(TransferMarket.SilverMidfielder());
   _numMid++;
  }
  for (int k = 0; k < gm; k++) {
   _roster.add(TransferMarket.GoldMidfielder());
   _numMid++;
  }
  for (int k = 0; k < ba; k++) {
   _roster.add(TransferMarket.BronzeAttacker());
   _numAtt++;
  }
  for (int k = 0; k < sa; k++) {
   _roster.add(TransferMarket.SilverAttacker());
   _numAtt++;
  }
  for (int k = 0; k < ga; k++) {
   _roster.add(TransferMarket.GoldAttacker());
   _numAtt++;
  }

/*********************Done adding Players*****************/

  _points = 0;
  _wins = 0;
  _losses = 0;
  _draws = 0;
  _goalsfor = 0;
  _goalsagainst = 0;

/********************Adding Players back to text file******************/

  for (int i = 0; i < _numGoalie; i++) {
      Player p = _roster.get(i);
   PrintWriter writer;
   if (p._defense >= 88) {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/GoldGoalkeepers.txt")));
   } else if (p._defense >= 75) {  
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/SilverGoalkeepers.txt")));
   } else {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/BronzeGoalkeepers.txt")));
   }
   writer.println(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
      writer.flush();
      writer.close();
  }
 
  for (int i = 0; i < _numDefend; i++) {
      Player p = _roster.get(i + _numGoalie);
   PrintWriter writer;
   if (p._defense >= 88) {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/GoldDefenders.txt")));
      } else if (p._defense >= 75) {  
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/SilverDefenders.txt")));
   } else {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/BronzeDefenders.txt")));
   }
      writer.println(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
      writer.flush();
      writer.close();
  }
 
  for (int i = 0; i < _numMid; i++) {
      Player p = _roster.get(i + _numGoalie + _numDefend);
   PrintWriter writer;
   if (p._overall >= 88) {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/GoldMidfielders.txt")));
      } else if (p._overall >= 75) {  
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/SilverMidfielders.txt")));
   } else {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/BronzeMidfielders.txt")));
   }
      writer.println(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
      writer.flush();
      writer.close();
  }
 
  for (int i = 0; i < _numAtt; i++) {
      Player p = _roster.get(i + _numGoalie + _numDefend + _numMid);
   PrintWriter writer;
   if (p._attack >= 88) {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/GoldAttackers.txt")));
      } else if (p._attack >= 75) {  
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/SilverAttackers.txt")));
   } else {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/BronzeAttackers.txt")));
   }
      writer.println(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
      writer.flush();
      writer.close();
  }

/***************Done Adding players back*****************/
    }

    public void merge(int bg, int sg, int gg, int bd, int sd, int gd, int bm, int sm, int gm, int ba, int sa, int ga) throws IOException {

/******************Adding to original roster***********************/

  for (int k = 0; k < bg; k++) {
   this._roster.add(TransferMarket.BronzeGoalie());
   _numGoalie++;
  }
  for (int k = 0; k < sg; k++) {
   this._roster.add(TransferMarket.SilverGoalie());
   _numGoalie++;
  }
  for (int k = 0; k < gg; k++) {
   this._roster.add(TransferMarket.GoldGoalie());
   _numGoalie++;
  }
  for (int k = 0; k < bd; k++) {
   this._roster.add(TransferMarket.BronzeDefender());
   _numDefend++;
  }
  for (int k = 0; k < sd; k++) {
   this._roster.add(TransferMarket.SilverDefender());
   _numDefend++;
  }
  for (int k = 0; k < gd; k++) {
   this._roster.add(TransferMarket.GoldDefender());
   _numDefend++;
  }
  for (int k = 0; k < bm; k++) {
   this._roster.add(TransferMarket.BronzeMidfielder());
   _numMid++;
  }
  for (int k = 0; k < sm; k++) {
   this._roster.add(TransferMarket.SilverMidfielder());
   _numMid++;
  }
  for (int k = 0; k < gm; k++) {
   this._roster.add(TransferMarket.GoldMidfielder());
   _numMid++;
  }
  for (int k = 0; k < ba; k++) {
   this._roster.add(TransferMarket.BronzeAttacker());
   _numAtt++;
  }
  for (int k = 0; k < sa; k++) {
   this._roster.add(TransferMarket.SilverAttacker());
   _numAtt++;
  }
  for (int k = 0; k < ga; k++) {
   this._roster.add(TransferMarket.GoldAttacker());
   _numAtt++;
  }

/*********************Done adding Players*****************/

/********************Adding Players back to text file******************/

  for (int i = 0; i < _numGoalie; i++) {
      Player p = _roster.get(i);
   PrintWriter writer;
   if (p._defense >= 88) {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/GoldGoalkeepers.txt")));
   } else if (p._defense >= 75) {  
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/SilverGoalkeepers.txt")));
   } else {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/BronzeGoalkeepers.txt")));
   }
   writer.println(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
      writer.flush();
      writer.close();
  }
 
  for (int i = 0; i < _numDefend; i++) {
      Player p = _roster.get(i + _numGoalie);
   PrintWriter writer;
   if (p._defense >= 88) {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/GoldDefenders.txt")));
      } else if (p._defense >= 75) {  
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/SilverDefenders.txt")));
   } else {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/BronzeDefenders.txt")));
   }
      writer.println(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
      writer.flush();
      writer.close();
  }
 
  for (int i = 0; i < _numMid; i++) {
      Player p = _roster.get(i + _numGoalie + _numDefend);
   PrintWriter writer;
   if (p._overall >= 88) {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/GoldMidfielders.txt")));
      } else if (p._overall >= 75) {  
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/SilverMidfielders.txt")));
   } else {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/BronzeMidfielders.txt")));
   }
      writer.println(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
      writer.flush();
      writer.close();
  }
 
  for (int i = 0; i < _numAtt; i++) {
      Player p = _roster.get(i + _numGoalie + _numDefend + _numMid);
   PrintWriter writer;
   if (p._attack >= 88) {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/GoldAttackers.txt")));
      } else if (p._attack >= 75) {  
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/SilverAttackers.txt")));
   } else {
    writer = new PrintWriter(new BufferedWriter(new FileWriter("res/BronzeAttackers.txt")));
   }
      writer.println(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
      writer.flush();
      writer.close();
  }

/***************Done Adding players back*****************/
 }
    
   
    
    public static ArrayList<Player> setLineup(ArrayList<Player> random) {
      ArrayList<Player> newlineup = new ArrayList<Player>();
        ArrayList<Player> Attackers = new ArrayList<Player>();
        ArrayList<Player> Midfielders = new ArrayList<Player>();
        ArrayList<Player> Defenders = new ArrayList<Player>();
        ArrayList<Player> Goalkeepers = new ArrayList<Player>();
        
        for (int i = 0; i < random.size(); i ++) {
          if (random.get(i)._pos.equals("A")) {
            Attackers.add(random.get(i));
          }
          if (random.get(i)._pos.equals("M")) {
            Midfielders.add(random.get(i));
          }
          if (random.get(i)._pos.equals("D")) {
            Defenders.add(random.get(i));
          }
          if (random.get(i)._pos.equals("G")) {
            Goalkeepers.add(random.get(i));
          }
        }
        
        newlineup.add(Goalkeepers.get((int) (Math.random() * Goalkeepers.size())));
       newlineup.add(Defenders.get((int) (Math.random() * Defenders.size())));
       newlineup.add(Defenders.get((int) (Math.random() * Defenders.size())));
                   newlineup.add(Defenders.get((int) (Math.random() * Defenders.size())));
                               newlineup.add(Defenders.get((int) (Math.random() * Defenders.size())));
       newlineup.add(Midfielders.get((int) (Math.random() * Midfielders.size())));
       newlineup.add(Midfielders.get((int) (Math.random() * Midfielders.size())));
       newlineup.add(Midfielders.get((int) (Math.random() * Midfielders.size())));
                  newlineup.add(Attackers.get((int) (Math.random() * Attackers.size())));
       newlineup.add(Attackers.get((int) (Math.random() * Attackers.size())));
      newlineup.add(Attackers.get((int) (Math.random() * Attackers.size())));
      return newlineup;
      }
    

    
 public static void main(String[] args) {
 }
    
}
