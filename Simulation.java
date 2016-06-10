import java.util.ArrayList;

public class Simulation {
  
  public static void main (String[] args) {
    System.out.println("try the other class");
    
  }
  
  
  //1: clean tackle, possession swtiches
  //2: bad tackle, foul, free kick
  //3: bad tackle, foul, free kick, yellow card (check if 2nd yellow)
  //4: bad tackle, foul, free kick, red card (remove from game, set to null in the team list, for each situation if null, skip)
  //5: bad tackle, foul, penalty
  //6: bad tackle, foul, penalty, yellow card (check if 2nd yellow)
  //7: bad tackle, foul, free kick, red card (remove from game, set to null in the team list, for each situation if null, skip)
  //8: Trick, get past defender
  //9: Trick, get past defender, get past goalie, GOAL
  //10: Trick, get past defender, goalie stops it, SAVE, possession switches
  //11: Trick, get past defender, goalie stops it, SAVE, corner kick, delivers corner, missed shot
  //12: Trick, get past defender, goalie stops it, SAVE, corner kick, delivers corner, shot, GOAL
  //13: Pass,...
  
    public static String gamerun(String team1name, ArrayList<Player> team1, String team2name, ArrayList<Player> team2,Player freekicktaker1, Player freekicktaker2,
                                Player cornerkicktaker1, Player cornerkicktaker2) {
      //4-3-3 lineup
      ArrayList<Player> yellowcarded = new ArrayList<Player>();
      ArrayList<Player> redcarded = new ArrayList<Player>();
      int minute = 1;
      int score1 = 0;
      int score2 = 0;
      int pos = 0;
      String matchday = "";
   // int turns = 30 + (int) (Math.random()*20);
   // for (int i = 0; i < turns; i++) {
      while (minute <= 90) {
      minute += (int) (1+ Math.random() * 4);
      double situation = Math.random();
      double possession = Math.random();
      if (possession <.5) {pos = 0;}
      else {pos = 1;}
      double ballcontrol = Math.random();
      Player withball = new Player();
      Player beforeball = new Player();
      if (pos == 0) {
        if (ballcontrol <.2) {
          withball = pickdefense(team1);
          beforeball = pickdefensemid(team1);
        }
        if (ballcontrol > .6) {
         withball = pickattack(team1);
         beforeball = pickmidattack(team1);
         if ((ballcontrol >.2) && (ballcontrol <.6)) {
           withball = pickmid(team1);
           beforeball = pickdefensemid(team1);
           }
        }
      }
            if (pos == 1) {
        if (ballcontrol <.2) {
          withball = pickdefense(team2);
          beforeball = pickdefensemid(team1);
        }
        if (ballcontrol > .6) {
         withball = pickattack(team2);
         beforeball = pickmidattack(team1);
         if ((ballcontrol >.2) && (ballcontrol <.6)) {
           withball = pickmid(team2);
         beforeball = pickdefensemid(team1);}
        }
      }
            
            //DEFENSE
            if (withball._pos.equals("D")) {
              //defenders can...
              //turnover  DONE .1
              //take a shot  DONE .1
              //take a corner-kick DONE .1
              //get fouled and win a free-kick DONE .2
              //long pass the ball up to the attack DONE .1
              //pass the ball to midfield DONE .2
              //go on a solo run DONE .1
              //cross into the box DONE .1
              if (situation < .1) {
             //turnover the ball 
              matchday += minute + "'   " + withball._name + " loses control of the ball in the back." + "\n";
              double turnoversituation = Math.random();
              if (turnoversituation > .7) {
                matchday += minute + "'   " + team1.get(1 + team1.indexOf(withball))._name + " regains control and saves the day. That was a close call for " + team1name + "!" + "\n";
              }
              else {
                Player Goalie = new Player();
              if (pos == 0) {
                beforeball = withball;
                withball = pickattack(team2);
                Goalie = team1.get(0);
              }
              else {
                beforeball = withball;
                withball = pickattack(team1);
                Goalie = team2.get(0);
              }
              pos = (pos +1) % 2;
              matchday += minute + "'   " + withball._name + " steals the ball away and the break is on!" + "\n";
         if (((int) (Math.random() * withball._attack)) >= ((int) (Math.random() * Goalie._defense))) {
           matchday += minute + "'   " + withball._name + " beats " + Goalie._name + " with a " + randomshot() + "! Great solo play by " + withball._name + " after the dreadful mistake by " + beforeball + ". \n";
           if (pos == 0) {   
             team1.get(team1.indexOf(withball))._goals++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(withball))._goals++; }
         if (withball._goals > 5) {matchday += withball._name + " is on fire, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (withball._goals < 5) {matchday += withball._name + " is just getting started, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (pos == 0) score1++;
          else score2++;
         matchday += "Score Update: " + score1 + " to " + score2 + "\n";
               
         }
         else{
           matchday += minute + "'   " + withball._name + " is in the clear and takes a shot but " + Goalie._name + " shuts him down with a nice save." + "\n";
         }
      }
              }
              if ((situation > .1) && (situation < .2)) {
                //Win a corner kick
                String cornerteam = "";
                if (pos == 0) {cornerteam = team1name;}
                else {cornerteam = team2name;}
                
                matchday += minute + "'    " + withball._name + "wins a corner kick for " + cornerteam + "." + "\n";
                
                if (pos == 0) {matchday += minute + "'    " + cornerkicktaker1._name + " delivers the corner." + "\n";
                beforeball = cornerkicktaker1;}
                else {cornerteam = team2name;
                  matchday += minute + "'    " + cornerkicktaker2._name + " delivers the corner." + "\n";
                beforeball = cornerkicktaker2;}
                if (pos == 0) {
                 withball = team1.get((int) (1 + (Math.random() *10))); 
                }
                else {withball = team2.get((int) (1 + (Math.random() *10)));}
                matchday += minute + "'    The ball falls to " + withball._name + " and he heads it towards goal..." + "\n";
                Player Goalie = new Player();
                if (pos == 0) {
                Goalie = team2.get(0);
                }
                if (pos == 1) {
                Goalie = team1.get(0); 
                }
                double ontarget = Math.random();
                if (ontarget < .75) {
                if (((int) (Math.random() * withball._attack)) >= ((int) (Math.random() * Goalie._defense))) {
                matchday += minute + "'    The ball flies past the goalkeeper's outstretched hands... What a goal!" + "\n";
                if (pos == 0) {   
             team1.get(team1.indexOf(withball))._goals++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(withball))._goals++; }
           if (withball._goals > 10) {matchday += withball._name + " is on fire, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (withball._goals < 10) {matchday += withball._name + " is just getting started, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (pos == 0) score1++;
          else score2++;
         matchday += "Score Update: " + score1 + " to " + score2 + "\n";
           if (pos == 0) {   
             team1.get(team1.indexOf(beforeball))._assists++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(beforeball))._assists++; }
         matchday += "Assist by: " + beforeball._name + ", his " + suffix(beforeball._assists) + " of the season." + "\n";
               
              }
                else {
                  matchday += minute + "'    Nice save by " + Goalie._name + " and the fans breathe a sigh of relief. " + "\n";
                } }
              
             
                else {
                  matchday += minute + "'    " + randommissedshot() + "  " + "\n";
                }
                
              }
              if ((situation > .2) && (situation < .4)) {
                Player Goalie = new Player();
                if (pos == 0) {
                Goalie = team2.get(0);
                }
                if (pos == 1) {
                Goalie = team1.get(0); 
                }
                String team3 = "";
                Player freekickman = new Player();
                if (pos == 0) { 
                  team3 = team1name; 
                  freekickman = freekicktaker1;}
                if (pos == 1) 
                {team3 = team2name;
                  freekickman = freekicktaker2;}
                Player fouler = new Player();
                if (pos == 0) {
                  fouler = pickdefensemid(team2);
                }
                if (pos == 1) {
                  fouler = pickdefensemid(team1);
                }
                matchday += minute + "'    " + withball._name + " gains possession deep in his own half. He tries to run the ball up but is fouled by " + fouler._name + "." + "\n";
                double foul = Math.random();
                if (foul > .8) {
                  matchday += minute + "'    " + fouler._name + " recieves a yellow card! " + "\n";
                  if (pos == 0) { 
                  yellowcarded.add(team2.get(team2.indexOf(fouler)));
                  }
                  else{
                    yellowcarded.add(team1.get(team1.indexOf(fouler)));
                  }
                }
                if (foul < .05) {
                  String teamname = "";
                  if (pos == 0) {
                   teamname = team2name; 
                  }
                  else {teamname = team1name;}
                  matchday += minute + "'    The referee gives " + fouler._name + " a red card! What a blow for " +  teamname + "!"+ "\n";
                  if (pos == 0) { 
                  redcarded.add(team2.get(team2.indexOf(fouler)));
                  }
                  else{
                    redcarded.add(team1.get(team1.indexOf(fouler)));
                  }
                }
                withball = freekickman;
                matchday += minute + "'    Free kick for" + team3 + ". " + freekickman._name+ " stands over the ball." + "\n";
                matchday += minute + "'    The referee blows a shrill blast on his whistle and " + freekickman._name + " sends the ball soaring towards the goal. " +  "\n";
                matchday += minute + "'    The ball dips and curves mid-air and the goalkeeper struggles to keep track of it under the blinding stadium lights" +  "\n";
               if (((int) (Math.random() * withball._attack)) >= ((int) (Math.random() * Goalie._defense))) {
                matchday += minute + "'    The net bulges! GGGOOOOOAAAALLLL!!!" + "\n";
                if (pos == 0) {   
             team1.get(team1.indexOf(withball))._goals++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(withball))._goals++; }
           if (withball._goals > 10) {matchday += withball._name + " is on fire, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (withball._goals < 10) {matchday += withball._name + " is just getting started, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (pos == 0) score1++;
          else score2++;
         matchday += "Score Update: " + score1 + " to " + score2 + "\n";
               
              }
                else {
                  matchday += minute + "'    Saved by" + Goalie._name + "!" + randomgoaliemove() + "\n";
                } 
                
              }
              if ((situation > .4 ) && (situation < .5)){
                //long pass up to attack
                Player receiver = new Player();
                if (pos == 0) {
                  receiver = pickattack(team1);}
                else {receiver = pickattack(team2);}
                Player defender = new Player();
                if (pos == 0) {
                  defender = pickdefense(team2);}
                else {defender = pickdefense(team1);}
                Player Goalie = new Player();
                if (pos == 0) {
                  Goalie = team2.get(0);}
                else {Goalie = team1.get(0);}
                 matchday += minute + "'    " + withball._name + " has the ball in the defense. He looks up and bombs it forward for " +  receiver._name + "\n";
                 beforeball = withball;
                 withball = receiver;
                 matchday += minute + "'    " + withball._name + " brings the ball down and finds himself face-to-face with " +  defender._name + "\n";
                 if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defender._defense))) {
                    matchday += minute + "'   " + withball._name + " slips past " + defender._name + " with a " + randommove() + "\n";
                 matchday += minute + "'   " + withball._name + " only has the goalkeeper to beat! " + "\n";
                  if (((int) (Math.random() * withball._attack)) >= ((int) (Math.random() * Goalie._defense))) {
                matchday += minute + "'    " + withball._name + " scores! " + "\n";
                if (pos == 0) {   
             team1.get(team1.indexOf(withball))._goals++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(withball))._goals++; }
           if (withball._goals > 10) {matchday += withball._name + " is on fire, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (withball._goals < 10) {matchday += withball._name + " is just getting started, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (pos == 0) score1++;
          else score2++;
         matchday += "Score Update: " + score1 + " to " + score2 + "\n";
              }
                else {
                  matchday += minute + "'    " + Goalie._name + " blocks the shot. " + randomgoaliemove() + "\n";
                }
                 
                 }
      else{
           matchday += minute + "'   " + defender._name + " tackles " + withball._name + " with a nice slide tackle and wins the ball cleanly. That could have been dangerous!" + "\n";
                 }
              }
              if ((situation > .5 ) && (situation < .7)){
                //pass to midfield
                Player receivermid = new Player();
                if (pos == 0) {
                  receivermid = pickmid(team1);}
                else {receivermid = pickmid(team2);}
                Player receivermid2 = new Player();
                if (pos == 0) {
                  receivermid2 = pickmid(team1);}
                else {receivermid2 = pickmid(team2);}
                Player defendermid = new Player();
                if (pos == 0) {
                  defendermid = pickmid(team2);}
                else {defendermid = pickmid(team1);}
                Player Goalie = new Player();
                if (pos == 0) {
                  Goalie = team2.get(0);}
                else {Goalie = team1.get(0);}
                
                String tname = "";
                if (pos == 0) {
                  tname = team1name;
                }
                if (pos == 1) {
                  tname = team2name;
                }
                Player defender = new Player();
                if (pos == 0) {
                  defender = pickdefense(team2);}
                else {defender = pickdefense(team1);}
                Player attacker = new Player();
                if (pos == 0) {
                  attacker = pickattack(team1);}
                else {attacker = pickattack(team2);}
              matchday += minute + "'    " + withball._name + " has the ball in the defense. He knocks it up to " +  receivermid._name + "\n";
              beforeball = withball;
              withball = receivermid;
              matchday += minute + "'    " + withball._name + " passes to " +  receivermid2._name + "\n";
              beforeball = withball;
              withball = receivermid;
              if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defendermid._defense))) {
                    matchday += minute + "'   " + withball._name + " slips past " + defendermid._name + " with a " + randommove() + ". This is some nice football from " + tname + ". \n";
                    minute++;
                    matchday += minute + "'   " + withball._name + " sees " + attacker._name + " starting a good run behind the defense and tries a through ball to him. " + ". \n";
                    beforeball = receivermid;
                    withball = attacker;
                    if (((int) (Math.random() * withball._overall)) < 40) {matchday += minute + "'     Off-target pass by " + beforeball._name + " and the pass squirts away from " + withball._name + ". \n";}
                    else {matchday += minute + "'    Great pass by " + beforeball._name + " and " + withball._name + " is through on goal! " + "\n";
                     if (((int) (Math.random() * withball._attack)) >= ((int) (Math.random() * Goalie._defense))) {
                matchday += minute + "'    " + withball._name + "takes a shot and..." + "\n";
                matchday += minute + "'    He scores!!! Coolly slotted past the keeper!" + "\n";
                if (pos == 0) {   
             team1.get(team1.indexOf(withball))._goals++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(withball))._goals++; }
           if (withball._goals > 10) {matchday += withball._name + " is on fire, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (withball._goals < 10) {matchday += withball._name + " is just getting started, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (pos == 0) score1++;
          else score2++;
         matchday += "Score Update: " + score1 + " to " + score2 + "\n";
          team1.get(team1.indexOf(beforeball))._assists++; 
           if (pos == 1) {   
             team2.get(team2.indexOf(beforeball))._assists++; }
           matchday += "Assist by: " + beforeball._name + ", his " + suffix(beforeball._assists) + "assist of the season." + "\n";
              }
                else {
                  matchday += minute + "'    " + Goalie._name + " blocks the shot. Disappointing effort by " + withball._name + "\n";
                }
                    }}
                    else {
                       matchday += minute + "'   " + defendermid._name + " wins the ball back and shuts down the attack!"  + "\n";
                    }
               
              }
              if ((situation > .7 ) && (situation < .8)){
                //solo run
                Player defendermid = new Player();
                if (pos == 0) {
                  defendermid = pickmid(team2);}
                else {defendermid = pickmid(team1);}
                
                Player Goalie = new Player();
                if (pos == 0) {
                  Goalie = team2.get(0);}
                else {Goalie = team1.get(0);}
                
                String tname = "";
                if (pos == 0) {
                  tname = team2name;
                }
                if (pos == 1) {
                  tname = team1name;
                }
                
                Player defender = new Player();
                if (pos == 0) {
                  defender = pickdefense(team2);}
                else {defender = pickdefense(team1);}
                Player defender2 = new Player();
                if (pos == 0) {
                  defender2 = pickdefense(team2);}
                else {defender2 = pickdefense(team1);}
                
                matchday += minute + "'   " + withball._name + " gets possession in the defense. Everyone looks marked man-to-man so he decides to go for it himself."  + "\n";
                if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defendermid._defense))) {
                    matchday += minute + "'   " + withball._name + " slips past " + defendermid._name + " with a " + randommove() + ". \n";
                    matchday += minute + "'   " + withball._name + " is still running but " + defender._name + " moves up to close him off. \n";
                    if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defender._defense))) {
                      matchday += minute + "'   " + withball._name + " makes a fool of " + defender._name + " with a " + randommove() + "! No one can stop him! \n";
                    minute++;
                    matchday += minute + "'   " + defender2._name + " is the last defender left!. \n";
                    if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defender2._defense))) {
                    matchday += minute + "'   " + withball._name + " skills " + defender._name + " with a " + randommove() + "! He's through! \n";
                    if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * Goalie._defense))) {
                    matchday += minute + "'    He scores!!! What a solo effort! He made " + tname + " look foolish! \n";
                if (pos == 0) {   
             team1.get(team1.indexOf(withball))._goals++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(withball))._goals++; }
           if (withball._goals > 10) {matchday += withball._name + " is on fire, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (withball._goals < 10) {matchday += withball._name + " is just getting started, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (pos == 0) score1++;
          else score2++;
         matchday += "Score Update: " + score1 + " to " + score2 + "\n";
                    }
                    else {
                      matchday += minute + "'    " + Goalie._name + " blocks the shot. \n";} }
                    else {matchday += minute + "'   " + defender._name + " wins the ball back and stops " +  withball._name + " dead in his tracks." + "\n";
                    }
                    }
                    
                    else {matchday += minute + "'   " + defender._name + " wins the ball back and stops " +  withball._name + " dead in his tracks." + "\n";
                    }
                }
                    else {
                       matchday += minute + "'   " + defendermid._name + " wins the ball back and stops " +  withball._name + " dead in his tracks." + "\n";
                    }
              }
              if ((situation > .8 ) && (situation < .9)){
                //cross into the box
                Player Goalie = new Player();
                if (pos == 0) {
                  Goalie = team2.get(0);}
                else {Goalie = team1.get(0);}
                String tname = "";
                if (pos == 0) {
                  tname = team1name;
                }
                if (pos == 1) {
                  tname = team2name;
                }
                
                Player defender = new Player();
                if (pos == 0) {
                  defender = pickdefense(team2);}
                else {defender = pickdefense(team1);}
                Player attacker = new Player();
                if (pos == 0) {
                  attacker = pickattack(team1);}
                else {attacker = pickattack(team1);}
                
                matchday += minute + "'    " + withball._name + " has the ball on the wing after some nice build-up play by " + tname +". \n";
                matchday += minute + "'    " + withball._name + " fires a cross into the box. \n";
                if (((int) (Math.random() * withball._attack)) >= ((int) (Math.random() * defender._defense))) {
                matchday += minute + "'    " + attacker._name + " rises above " + defender._name + " and heads the ball towards goal. \n";
                double ontarget = Math.random();
                if (ontarget < .75) {
                if (((int) (Math.random() * attacker._attack)) >= ((int) (Math.random() * Goalie._defense))) {
                matchday += minute + "'    " + attacker._name + " scores! " + "\n";
                if (pos == 0) {   
             team1.get(team1.indexOf(attacker))._goals++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(attacker))._goals++; }
           if (attacker._goals > 10) {matchday += attacker._name + " is on fire, scoring his " + suffix(attacker._goals) + " goal of the season." + "\n";}
         if (attacker._goals < 10) {matchday += attacker._name + " is just getting started, scoring his " + suffix(attacker._goals) + " goal of the season." + "\n";}
         if (pos == 0) score1++;
          else score2++;
         matchday += "Score Update: " + score1 + " to " + score2 + "\n";
               
              }
                else {
                  matchday += minute + "'    Saved by " + Goalie._name + randomgoaliemove() + "\n";
                }
              
              }
                else {
                  matchday += minute + "'    " + randommissedshot() + "  " + "\n";
                }
              
                
                }
                else {
                  matchday += minute + "'    " + defender._name + " rises above " + attacker._name + " and heads the ball away from danger. \n";
                }
                
              }
              if (situation >.9) { //chance to score
                Player Goalie = new Player();
                if (pos == 0) {
                Goalie = team2.get(0);
                }
                if (pos == 1) {
                Goalie = team1.get(0); 
                }
                matchday += minute + "'    The ball falls from the sky for " + withball._name + " and he smashes it goalwards. " + "\n";
                double ontarget = Math.random();
                if (ontarget < .75) {
                if (((int) (Math.random() * withball._attack)) >= ((int) (Math.random() * Goalie._defense))) {
                matchday += minute + "'    " + withball._name + " scores! " + "\n";
                if (pos == 0) {   
             team1.get(team1.indexOf(withball))._goals++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(withball))._goals++; }
           if (withball._goals > 10) {matchday += withball._name + " is on fire, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (withball._goals < 10) {matchday += withball._name + " is just getting started, scoring his " + suffix(withball._goals) + " goal of the season." + "\n";}
         if (pos == 0) score1++;
          else score2++;
         matchday += "Score Update: " + score1 + " to " + score2 + "\n";
               if (pos == 0) {   
             team1.get(team1.indexOf(withball))._assists++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(withball))._assists++; }
         matchday += "Assist by: " + withball._name + ", his " + suffix(withball._assists) + " of the season." + "\n";
         
              }
                else {
                  matchday += minute + "'    Brilliant stop by " + Goalie._name + " and the fans breathe a sigh of relief. " + "\n";
                }
              
              }
                else {
                  matchday += minute + "'    " + randommissedshot() + "  " + "\n";
                }
              }
            }
            
            //MIDFIELD
            if (withball._pos.equals("M")) {
              //pass to attack
              //play a 1-2
              //get fouled, free-kick
              //turnover, counter-attack
              //take a shot
              //win a corner-kick
              //solo run
              //cross into the box
              
              
            }
            
            //ATTACK
            if (withball._pos.equals("A")) {
              //pass to another attacker
              //play a 1-2
              //get fouled, free-kick
              //get fouled, penalty
              //take a shot
              //win a corner-kick
              //solo run (dribble defenders)
              //cross into the box
              
              
            }
            
            
            
      //foul, clean tackle, tricked
      //--YC, RC, penalty, freekick
      //shot on goal, shot off target
      //-goal, assist OG
      //corner
      //pass
      Player Aplayer = new Player();
      Player Dplayer = new Player();
      Player Gplayer = new Player();
      if (pos == 0) {Aplayer = team1.get(0);
      Dplayer = team2.get(0);}
      if (pos == 1) {Aplayer = team2.get(0);
      Dplayer = team1.get(0);}
            Player Passplayer = new Player();
      Passplayer._name = "Rakitic";
      Passplayer._overall = 88;
      
     // if (Math.random() ==)
      //head-to-head situation
      //Aplayer
      //Dplayer
      if ((situation > .2) &&( situation < .5)) {
      if (pos == 0) {Aplayer = team1.get(8 + (int) (Math.random() * 3));
      Dplayer = team2.get(1 + (int) (Math.random() * 4));
      Gplayer = team2.get(0);}
      if (pos == 1) {Aplayer = team2.get(8 + (int) (Math.random() * 3));
      Dplayer = team1.get(1 + (int) (Math.random() * 4));
      Gplayer = team1.get(0);}
      if (((int) (Math.random() * Aplayer._attack)) >= ((int) (Math.random() * Dplayer._defense))) {
         matchday += minute + "'   " + Aplayer._name + " gets past " + Dplayer._name + " with a " + randommove() + "\n";
         if (((int) (Math.random() * Aplayer._attack)) >= ((int) (Math.random() * Gplayer._defense))) {
           matchday += minute + "'   " + Aplayer._name + " beats " + Gplayer._name + " with a " + randomshot() + "\n";
               Aplayer._goals++;
         if (Aplayer._goals > 10) {matchday += Aplayer._name + " is on fire, scoring his " + suffix(Aplayer._goals) + " goal of the season." + "\n";}
         if (Aplayer._goals < 10) {matchday += Aplayer._name + " is just getting started, scoring his " + suffix(Aplayer._goals) + " goal of the season." + "\n";}
         if (pos == 0) score1++;
          else score2++;
         matchday += "Score Update: " + score1 + " to " + score2 + "\n";
                  Passplayer._assists++;
         matchday += "Assist by: " + Passplayer._name + ", his " + suffix(Passplayer._assists) + " of the season." + "\n";
         }
         else{
           matchday += minute + "'   " + Aplayer._name + " is in the clear and takes the shot but " + Gplayer._name + " shuts him down with a nice save." + "\n";
         }
      }
      else{
           matchday += minute + "'   " + Dplayer._name + " tackles " + Aplayer._name + " nice slide tackle and wins the ball cleanly." + "\n";
      }
      
      }
      
      if (situation < .2) {
        /*
      Player Aplayer = new Player();
      Aplayer._name = "Messi";
      Aplayer._attack = 95;
      Player Dplayer = new Player();
      Dplayer._name = "Ramos";
      Dplayer._defense = 90;
      */
      double situation2 = Math.random();
      if (situation2 < .8) {
      if (((int) (Math.random() * Aplayer._attack)) >= ((int) (Math.random() * Dplayer._defense))) {
         matchday += minute + "'   " + Aplayer._name + " slips past " + Dplayer._name + " with a " + randommove() + "\n";
      }
      else{
           matchday += minute + "'   " + Dplayer._name + " tackles " + Aplayer._name + " nice slide tackle and wins the ball cleanly." + "\n";
      }
      }
      else {
        matchday += minute + "'   " + Dplayer._name + " fouls " + Aplayer._name + "\n";
      }
      
      }
     
      else {
  /*      Player Aplayer = new Player();
      Aplayer._name = "Messi";
      Aplayer._attack = 95;
            Player Dplayer = new Player();
      Dplayer._name = "Cech";
      Dplayer._defense = 90;
      */


       if (((int) (Math.random() * Aplayer._attack)) >= ((int) (Math.random() * Dplayer._defense))) {
         matchday += minute + "'   " + Aplayer._name + " takes a shot on " + Dplayer._name + " and scores with a " + randomshot() + "\n";
         Aplayer._goals++;
         if (Aplayer._goals > 10) {matchday += Aplayer._name + " is on fire, scoring his " + suffix(Aplayer._goals) + " goal of the season." + "\n";}
         if (Aplayer._goals < 10) {matchday += Aplayer._name + " is just getting started, scoring his " + suffix(Aplayer._goals) + " goal of the season." + "\n";}
                  if (pos == 0) score1++;
          else score2++;
         matchday += "Score Update: " + score1 + " to " + score2 + "\n";
                  Passplayer._assists++;
         matchday += "Assist by: " + Passplayer._name + ", his " + suffix(Passplayer._assists) + " of the season." + "\n";

      }
      else{
           matchday += minute + "'   " + Dplayer._name + " blocks the shot from " + Aplayer._name + ". " + randomgoaliemove() + "\n";
      }
      }
      
    /*  try {
    Thread.sleep(1000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
*/
      
    }
    return matchday;
  }
    
  public static String randommove(){
    ArrayList<String> trickList = new ArrayList<String>();
    trickList.add("beautiful rainbow");
    trickList.add("wonderous elastico");
    trickList.add("godly rabona");
    trickList.add("epic nutmeg");
    trickList.add("spectacular Cruyff turn");
    trickList.add("double scissor");
    trickList.add("iconic roulette");
    trickList.add("stepover");
    int number = (int) (Math.random() * trickList.size());
    return trickList.get(number);
  }
  
    public static String randomgoaliemove(){
    ArrayList<String> trickList = new ArrayList<String>();
    trickList.add("What a beautiful dive! He must do his own stunts!");
    trickList.add("An amazing finger-tip save!");
    trickList.add("He deflected that one off the bar!");
    trickList.add("He punched that one clear! He kept kept calm and blocked that shot!");
    trickList.add("SCOTT STERLING! He blocked that one with his face! Ouch, that must have hurt!");
    int number = (int) (Math.random() * trickList.size());
    return trickList.get(number);
  }
  
    public static String randommissedshot() {
      ArrayList<String> trickList = new ArrayList<String>();
      trickList.add("The ball whizzes past the goal. Close but no cigar!");
      trickList.add("The ball blazes over the crossbar. Poor effort!");
      trickList.add("The ball flies into the stands. The goalkeeper didn't have to even move for that one!");
      trickList.add("The ball flies wide of the goal. What a missed opportunity!");
      trickList.add("The ball smashes off the crossbar and out of bounds! So close!");
      trickList.add("The ball hits the side netting. He got the angles all wrong on that one!");
      int number = (int) (Math.random() * trickList.size());
    return trickList.get(number);
    }
    
  public static String randomshot(){
    ArrayList<String> trickList = new ArrayList<String>();
    trickList.add("thunderous shot in the top corner!");
    trickList.add("majestical curler in the upper-90!");
    trickList.add("hingorani hammer!");
    trickList.add("epic nutmeg of the unsuspecting keeper!");
    trickList.add("exquisite volley");
    trickList.add("extraordinary header");
    trickList.add("fantastic strike");
    trickList.add("phenomenal finish");
    trickList.add("inside of the Foot Curled Shot");
    trickList.add("long shot");
    trickList.add("chip from distance");
    trickList.add("diving header");
    trickList.add("driven shot");
    trickList.add("scorpion kick");
    trickList.add("bicycle kick");
    int number = (int) (Math.random() * trickList.size());
    return trickList.get(number);
  }
  public static Player pickattack(ArrayList<Player> team) {
    return team.get(8+(int) (Math.random() *3));
  }
   public static Player pickdefense(ArrayList<Player> team) {
    return team.get(1+(int) (Math.random() *4));
  }
    public static Player pickmid(ArrayList<Player> team) {
    return team.get(5+(int) (Math.random() *3));
  }
        public static Player pickdefensemid(ArrayList<Player> team) {
    return team.get(1+(int) (Math.random() *7));
  }
                public static Player pickmidattack(ArrayList<Player> team) {
    return team.get(5+(int) (Math.random() *6));
  }
  
  public static String suffix(int num) {
    int j = num % 10;
    int k = num % 100;
    if (j == 1 && k != 11) {
        return num + "st";
    }
    if (j == 2 && k != 12) {
        return num + "nd";
    }
    if (j == 3 && k != 13) {
        return num + "rd";
    }
    return num + "th";
}
  
}