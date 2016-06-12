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

    public Team(String name, int bg, int sg, int gg, int bd, int sd, int gd, int bm, int sm, int gm, int ba, int sa, int ga) throws IOException {

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
			FileWriter writer;
			if (p._defense >= 88) {
				writer = new FileWriter(new File("res/GoldGoalkeepers.txt"));
			} else if (p._defense >= 75) {		
				writer = new FileWriter(new File("res/SilverGoalkeepers.txt"));
			} else {
				writer = new FileWriter(new File("res/BronzeGoalkeepers.txt"));
			}
			writer.write(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
		    writer.flush();
		    writer.close();
		}
	
		for (int i = 0; i < _numDefend; i++) {
		    Player p = _roster.get(i + _numGoalie);
			FileWriter writer;
			if (p._defense >= 88) {
				writer = new FileWriter(new File("res/GoldDefenders.txt"));
		    } else if (p._defense >= 75) {		
				writer = new FileWriter(new File("res/SilverDefenders.txt"));
			} else {
				writer = new FileWriter(new File("res/BronzeDefenders.txt"));
			}
		    writer.write(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
		    writer.flush();
		    writer.close();
		}
	
		for (int i = 0; i < _numMid; i++) {
		    Player p = _roster.get(i + _numGoalie + _numDefend);
			FileWriter writer;
			if (p._overall >= 88) {
				writer = new FileWriter(new File("res/GoldMidfielders.txt"));
		    } else if (p._overall >= 75) {		
				writer = new FileWriter(new File("res/SilverMidfielders.txt"));
			} else {
				writer = new FileWriter(new File("res/BronzeMidfielders.txt"));
			}
		    writer.write(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
		    writer.flush();
		    writer.close();
		}
	
		for (int i = 0; i < _numAtt; i++) {
		    Player p = _roster.get(i + _numGoalie + _numDefend + _numMid);
			FileWriter writer;
			if (p._attack >= 88) {
				writer = new FileWriter(new File("res/GoldAttackers.txt"));
		    } else if (p._attack >= 75) {		
				writer = new FileWriter(new File("res/SilverAttackers.txt"));
			} else {
				writer = new FileWriter(new File("res/BronzeAttackers.txt"));
			}
		    writer.write(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
		    writer.flush();
		    writer.close();
		}

/***************Done Adding players back*****************/
    }

    public void merge(int bg, int sg, int gg, int bd, int sd, int gd, int bm, int sm, int gm, int ba, int sa, int ga) throws IOException {

/******************Adding to original roster***********************/

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

/********************Adding Players back to text file******************/

		for (int i = 0; i < _numGoalie; i++) {
		    Player p = _roster.get(i);
			FileWriter writer;
			if (p._defense >= 88) {
				writer = new FileWriter(new File("res/GoldGoalkeepers.txt"));
			} else if (p._defense >= 75) {		
				writer = new FileWriter(new File("res/SilverGoalkeepers.txt"));
			} else {
				writer = new FileWriter(new File("res/BronzeGoalkeepers.txt"));
			}
			writer.write(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
		    writer.flush();
		    writer.close();
		}
	
		for (int i = 0; i < _numDefend; i++) {
		    Player p = _roster.get(i + _numGoalie);
			FileWriter writer;
			if (p._defense >= 88) {
				writer = new FileWriter(new File("res/GoldDefenders.txt"));
		    } else if (p._defense >= 75) {		
				writer = new FileWriter(new File("res/SilverDefenders.txt"));
			} else {
				writer = new FileWriter(new File("res/BronzeDefenders.txt"));
			}
		    writer.write(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
		    writer.flush();
		    writer.close();
		}
	
		for (int i = 0; i < _numMid; i++) {
		    Player p = _roster.get(i + _numGoalie + _numDefend);
			FileWriter writer;
			if (p._overall >= 88) {
				writer = new FileWriter(new File("res/GoldMidfielders.txt"));
		    } else if (p._overall >= 75) {		
				writer = new FileWriter(new File("res/SilverMidfielders.txt"));
			} else {
				writer = new FileWriter(new File("res/BronzeMidfielders.txt"));
			}
		    writer.write(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
		    writer.flush();
		    writer.close();
		}
	
		for (int i = 0; i < _numAtt; i++) {
		    Player p = _roster.get(i + _numGoalie + _numDefend + _numMid);
			FileWriter writer;
			if (p._attack >= 88) {
				writer = new FileWriter(new File("res/GoldAttackers.txt"));
		    } else if (p._attack >= 75) {		
				writer = new FileWriter(new File("res/SilverAttackers.txt"));
			} else {
				writer = new FileWriter(new File("res/BronzeAttackers.txt"));
			}
		    writer.write(p._name + " " + p._pos + " " + p._age + " " + p._attack + " " + p._defense + " " + p._overall);
		    writer.flush();
		    writer.close();
		}

/***************Done Adding players back*****************/
	}

	public static void main(String[] args) {

	}
    
}
