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
  
    public static String gamerun(String team1name, Team team1, String team2name, Team team2,Player freekicktaker1, Player freekicktaker2,
                                Player cornerkicktaker1, Player cornerkicktaker2, Player penaltytaker1, Player penaltytaker2) {
      //4-3-3 lineup
      ArrayList<Player> yellowcarded = new ArrayList<Player>();
      ArrayList<Player> redcarded = new ArrayList<Player>();
      int minute = (int) (1 + (Math.random() * 5));
      int score1 = 0;
      int score2 = 0;
      int pos = 0;
      String matchday = "";
      while (minute <= 90) {
         if ((minute > 45 ) && (minute < 50)) {
          	matchday += "The referee blows the whistle for half-time. The players head back to the dressing rooms for a little tea break. \n";
          	matchday += "HALFTIME SCORE: " + score1 + " to " + score2 + ". \n";
          	int difference = score1 - score2;
          	if (difference >= 5) {
          		matchday += team1name + " are cruising to victory! \n";
          	}
          	if (difference <= -5) {
          		matchday += team2name + " are cruising to victory! \n";
          	}
          	if ((difference > 0) && (difference < 2)) {
          		matchday += team1name + " have a slight advantage over " + team2name + " as we start up again. \n";
          	}
          	if ((difference < 0) && (difference > -2)) {
          		matchday += team2name + " have a slight advantage over " + team1name + " as we start up again. \n";
          	}
          	if ((difference > 2) && (difference < 5)) {
          		matchday += team1name + " looks like the have it in the bag but we still have 45 minutes left to play. Anything can happen! \n";
          	}
          	if ((difference < -2) && (difference > -5)) {
          		matchday += team2name + " looks like the have it in the bag but we still have 45 minutes left to play. Anything can happen! \n";
         	}
        }
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
                String tname = "";
                if (pos == 0) {tname = team1name;}
                if (pos == 1) {tname = team2name;}
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
                
                matchday += minute + "'    " + withball._name + " wins a corner kick for " + cornerteam + "." + "\n";
                
                if (pos == 0) {matchday += minute + "'    " + cornerkicktaker1._name + " delivers the corner." + "\n";
                beforeball = cornerkicktaker1;}
                else {cornerteam = team2name;
                  matchday += minute + "'    " + cornerkicktaker2._name + " delivers the corner." + "\n";
                beforeball = cornerkicktaker2;}
                if (pos == 0) {
                 withball = team1.get((int) ((team1.indexOf(beforeball) + 1 + (Math.random() *10)) % 11)); 
                }
                else {withball = team2.get((int) ((team1.indexOf(beforeball) + 1 + (Math.random() *10)) % 11));}
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
                    team2.get(team2.indexOf(fouler))._suspended = true;
                  }
                  else{
                    redcarded.add(team1.get(team1.indexOf(fouler)));
                    team1.get(team1.indexOf(fouler))._suspended = true;
                  }
                }
                withball = freekickman;
                matchday += minute + "'    Free kick for " + team3 + ". " + freekickman._name+ " stands over the ball." + "\n";
                matchday += minute + "'    The referee blows a shrill blast on his whistle and " + freekickman._name + " sends the ball soaring towards the goal. " +  "\n";
                matchday += minute + "'    The ball dips and curves mid-air and the goalkeeper struggles to keep track of it under the blinding stadium lights." +  "\n";
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
                  matchday += minute + "'    Saved by " + Goalie._name + "! " + randomgoaliemove() + "\n";
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
                    matchday += minute + "'   " + withball._name + " slips past " + defender._name + " with a " + randommove() + ". \n";
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
                    matchday += minute + "'   " + withball._name + " sees " + attacker._name + " starting a good run behind the defense and tries a through ball to him. " + "\n";
                    beforeball = receivermid;
                    withball = attacker;
                    if (((int) (Math.random() * withball._overall)) < 40) {matchday += minute + "'     Off-target pass by " + beforeball._name + " and the pass squirts away from " + withball._name + ". \n";}
                    else {matchday += minute + "'    Great pass by " + beforeball._name + " and " + withball._name + " is through on goal! " + "\n";
                     if (((int) (Math.random() * withball._attack)) >= ((int) (Math.random() * Goalie._defense))) {
                matchday += minute + "'    " + withball._name + " takes a shot and..." + "\n";
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
         if (pos == 0) { 
           team1.get(team1.indexOf(beforeball))._assists++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(beforeball))._assists++; }
           matchday += "Assist by: " + beforeball._name + ", his " + suffix(beforeball._assists) + " assist of the season." + "\n";
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
                    matchday += minute + "'   " + defender2._name + " is the last defender left! \n";
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
                  matchday += minute + "'    Saved by " + Goalie._name + "! " + randomgoaliemove() + "\n";
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
            else {
              if (withball._pos.equals("M")) {
              //pass to attack .2 DONE
              //play a 1-2 .1 DONE
              //get fouled, free-kick .1 DONE
              //turnover, counter-attack .1 DONE
              //take a shot .1 DONE
              //win a corner-kick .1 DONE
              //solo run .1 DONE
              //cross into the box .2 DONE
              
              
              if (situation < .2){
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
                
                
                if (((int) (Math.random() * withball._overall)) < 40) {matchday += minute + "'     Off-target pass by " + withball._name + " and the pass goes out of bounds. \n";} 
                else{
                 matchday += minute + "'    " + withball._name + " has the ball in the middle of the field. He has great vision and hits " +  receiver._name + " with a leading pass. \n";
                 beforeball = withball;
                 withball = receiver;
                 matchday += minute + "'    " + withball._name + " latches onto the ball and faces " +  defender._name + ". \n";
                 if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defender._defense))) {
                    matchday += minute + "'   " + withball._name + " slips past " + defender._name + " with a " + randommove() + ". \n";
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
              }
              
              
          
            
            if ((situation < .2) && (situation < .3)){
                //1-2
                Player receiver = new Player();
                if (pos == 0) {
                  receiver = pickmid(team1);}
                else {receiver = pickmid(team2);}
                 while (receiver._name == withball._name) {
                  if (pos == 0) {
                  receiver = pickattack(team1);}
                else {receiver = pickattack(team2);}
                }
                
                Player defender = new Player();
                if (pos == 0) {
                  defender = pickdefense(team2);}
                else {defender = pickdefense(team1);}
                
                Player Goalie = new Player();
                if (pos == 0) {
                  Goalie = team2.get(0);}
                else {Goalie = team1.get(0);}
                
            matchday += minute + "'    " + withball._name + " faces off with " + defender._name + ". \n";
            if (((int) (Math.random() * withball._overall)) <= ((int) (Math.random() * defender._defense))) 
            {matchday += minute + "'    " + withball._name + " tries a one-two with " + receiver._name + " but " + defender._name + " reads it perfectly and intercepts the ball! \n";} 
            else {
              matchday += minute + "'    One-two from " + withball._name + " to " + receiver._name + ". \n";
              matchday += minute + "'    " + withball._name + " receives the ball back and dribbles towards the goal. \n";
              minute++;
              matchday += minute + "'    Still " + withball._name + " with the ball.... \n";
              if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defender._defense))) {
                    matchday += minute + "'   " + withball._name + " slips past " + defender._name + " with a " + randommove() + ". \n";
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
          if (pos == 0) {   
             team1.get(team1.indexOf(receiver))._assists++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(receiver))._assists++; }
         matchday += "Assist by: " + receiver._name + ", his " + suffix(receiver._assists) + " of the season." + "\n";
              }
              }
                else {
                  matchday += minute + "'    " + Goalie._name + " blocks the shot. " + randomgoaliemove() + "\n";
                }
                 
                
              
            }
            }
            if ((situation > .3) && (situation < .4)) {
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
                  team2.get(team2.indexOf(fouler))._suspended = true;
                  }
                  else{
                    redcarded.add(team1.get(team1.indexOf(fouler)));
                    team1.get(team1.indexOf(fouler))._suspended = true;
                  }
                }
                withball = freekickman;
                matchday += minute + "'    Free kick for " + team3 + ". " + freekickman._name+ " stands over the ball." + "\n";
                matchday += minute + "'    The referee blows a shrill blast on his whistle and " + freekickman._name + " sends the ball soaring towards the goal. " +  "\n";
                matchday += minute + "'    The ball dips and curves mid-air and the goalkeeper struggles to keep track of it under the blinding stadium lights." +  "\n";
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
                  matchday += minute + "'    Saved by " + Goalie._name + "! " + randomgoaliemove() + "\n";
                } 
                
              }
            
            if ((situation < .5) && (situation >.4)) {
            //turn over, counter attack
              String tname = "";
              if (pos == 0) {tname = team1name;}
              if (pos == 1) {tname = team2name;}
              matchday += minute + "'   " + withball._name + " trips over the ball in the middle of the field and falls flat on his face!" + "\n";
              double turnoversituation = Math.random();
              if (turnoversituation > .7) {
                matchday += minute + "'   " + team1.get(1 + team1.indexOf(withball))._name + " regains possession! That was a close call for " + tname + "!" + "\n";
              }
              else {
                Player Goalie = new Player();
              if (pos == 0) {
                beforeball = withball;
                withball = pickmid(team2);
                Goalie = team1.get(0);
              }
              else {
                beforeball = withball;
                withball = pickmid(team1);
                Goalie = team2.get(0);
              }
              pos = (pos +1) % 2;
              matchday += minute + "'   " + withball._name + " steals the ball and starts a lightning-fast counterattack!" + "\n";
              matchday += minute + "'   " + withball._name + " tricks a defender and leaves him for dead." + "\n";
              minute++;
              matchday += minute + "'   " + withball._name + " is still going! He goes for goal himself!" + "\n";
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
           matchday += minute + "'   " + withball._name + " wastes that opportunity as " + Goalie._name + " saves the attempt easily. Easy pickings for the keeper!" + "\n";
         }
      }
              }
            
            if ((situation > .5) && (situation < .6)) {
             Player Goalie = new Player();
                if (pos == 0) {
                Goalie = team2.get(0);
                }
                if (pos == 1) {
                Goalie = team1.get(0); 
                }
                
                matchday += minute + "'    " + withball._name + " spins away from his defender and finds himself with some space at the edge of the box." + "\n";
                matchday += minute + "'    " + withball._name + " takes a shot.... " + "\n";
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
              
              if ((situation > .6) && (situation < .7)) {
                //Win a corner kick
                String cornerteam = "";
                if (pos == 0) {cornerteam = team1name;}
                else {cornerteam = team2name;}
                
                matchday += minute + "'    " + withball._name + " wins a corner kick for " + cornerteam + "." + "\n";
                
                if (pos == 0) {matchday += minute + "'    " + cornerkicktaker1._name + " delivers the corner." + "\n";
                beforeball = cornerkicktaker1;}
                else {cornerteam = team2name;
                  matchday += minute + "'    " + cornerkicktaker2._name + " delivers the corner." + "\n";
                beforeball = cornerkicktaker2;}
                if (pos == 0) {
                 withball = team1.get((int) ((team1.indexOf(beforeball) + 1 + (Math.random() *10)) % 11)); 
                }
                else {withball = team2.get((int) ((team1.indexOf(beforeball) + 1 + (Math.random() *10)) % 11));}
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
                
                matchday += minute + "'   " + withball._name + " intercepts the ball in the midfield. Everyone looks guarded so he decides to go for it himself."  + "\n";
                if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defendermid._defense))) {
                    matchday += minute + "'   " + withball._name + " slips past " + defendermid._name + " with a " + randommove() + ". \n";
                    matchday += minute + "'   " + withball._name + " is still running but " + defender._name + " moves up to close him off. \n";
                    if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defender._defense))) {
                      matchday += minute + "'   " + withball._name + " makes a fool of " + defender._name + " with a " + randommove() + "! No one can stop him! \n";
                    minute++;
                    matchday += minute + "'   " + defender2._name + " is the last defender left! \n";
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
            
            if (situation > .8 ){
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
                  matchday += minute + "'    Saved by " + Goalie._name + "! " + randomgoaliemove() + "\n";
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
            
                  }
              else {
            
            //ATTACK
            if (withball._pos.equals("A")) {
              //pass to another attacker .1 DONE
              //play a 1-2 .1 DONE
              //get fouled, free-kick .1 DONE
              //get fouled, penalty .05 DONE
              //take a shot .25 DONE
              //win a corner-kick .1 DONE
              //solo run (dribble defenders) .2 DONE
              //cross into the box .1 DONE
              
              if (situation < .05) {
                Player Goalie = new Player();
                if (pos == 0) {
                Goalie = team2.get(0);
                }
                if (pos == 1) {
                Goalie = team1.get(0); 
                }
                
                String team3 = "";
                Player penaltyman = new Player();
                if (pos == 0) { 
                  team3 = team1name; 
                  penaltyman = penaltytaker1;}
                if (pos == 1) 
                {team3 = team2name;
                  penaltyman = penaltytaker2;}
                
                Player fouler = new Player();
                if (pos == 0) {
                  fouler = pickdefensemid(team2);
                }
                if (pos == 1) {
                  fouler = pickdefensemid(team1);
                }
                
                matchday += minute + "'    " + withball._name + " faces off with " + fouler._name + "." + "\n";
                matchday += minute + "'    " + withball._name + " spins around " + fouler._name + " and tries to break away, but is fouled." + "\n";
                matchday += minute + "'    The referee points to the spot! It's a penalty for " + team3 + "! \n";
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
                  team2.get(team2.indexOf(fouler))._suspended = true;
                  }
                  else{
                    redcarded.add(team1.get(team1.indexOf(fouler)));
                    team1.get(team1.indexOf(fouler))._suspended = true;
                  }
                }
                withball = penaltyman;
                minute++;
                matchday += minute + "'    Penalty for " + team3 + " and " + penaltyman._name+ " stands over the ball." + "\n";
                matchday += minute + "'    The referee blows a shrill blast on his whistle and " + penaltyman._name + " begins his run-up." +  "\n";
               if (((int) (Math.random() * withball._attack)) >= ((int) (Math.random() * Goalie._defense))) {
                matchday += minute + "'    The goalie goes the wrong way! GGGOOOOOAAAALLLL!!!" + "\n";
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
                  matchday += minute + "'    Saved by " + Goalie._name + "! This man is legendary!" + "\n";
                } 
                
              
              }
              
              if ((situation > .05) && (situation < .15)) {
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
                matchday += minute + "'    " + withball._name + " has the ball thirty yards from goal. He looks for an open man to pass to..." + "\n";
                matchday += minute + "'    " + withball._name + " is fouled by " + fouler._name + "! \n";
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
                  team2.get(team2.indexOf(fouler))._suspended = true;
                  }
                  else{
                    redcarded.add(team1.get(team1.indexOf(fouler)));
                    team1.get(team1.indexOf(fouler))._suspended = true;
                  }
                }
                withball = freekickman;
                matchday += minute + "'    Free kick for " + team3 + ". " + freekickman._name+ " stands over the ball." + "\n";
                matchday += minute + "'    The referee blows a shrill blast on his whistle and " + freekickman._name + " sends the ball soaring towards the goal. " +  "\n";
                matchday += minute + "'    The ball dips and curves mid-air and the goalkeeper struggles to keep track of it under the blinding stadium lights." +  "\n";
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
                  matchday += minute + "'    Saved by " + Goalie._name + "! " + randomgoaliemove() + "\n";
                } 
                
              }
              if ((situation > .15) && (situation < .25)) {
                //Win a corner kick
                String cornerteam = "";
                if (pos == 0) {cornerteam = team1name;}
                else {cornerteam = team2name;}
                
                matchday += minute + "'    " + withball._name + " wins a corner kick for " + cornerteam + "." + "\n";
                
                if (pos == 0) {matchday += minute + "'    " + cornerkicktaker1._name + " delivers the corner." + "\n";
                beforeball = cornerkicktaker1;}
                else {cornerteam = team2name;
                  matchday += minute + "'    " + cornerkicktaker2._name + " delivers the corner." + "\n";
                beforeball = cornerkicktaker2;}
                if (pos == 0) {
                 withball = team1.get((int) ((team1.indexOf(beforeball) + 1 + (Math.random() *10)) % 11)); 
                }
                else {withball = team2.get((int) ((team1.indexOf(beforeball) + 1 + (Math.random() *10)) % 11));}
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
              if ((situation > .25 ) && (situation < .35)){
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
                  matchday += minute + "'    Saved by " + Goalie._name + "! " + randomgoaliemove() + "\n";
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
               if ((situation > .35 ) && (situation < .55)){
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
                
                matchday += minute + "'   " + withball._name + " has the ball near half-field. He feels confident and tries a maradona-esque run to goal."  + "\n";
                if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defendermid._defense))) {
                    matchday += minute + "'   " + withball._name + " slips past " + defendermid._name + " with a " + randommove() + ". \n";
                    matchday += minute + "'   " + withball._name + " is still running but " + defender._name + " moves up to close him off. \n";
                    if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defender._defense))) {
                      matchday += minute + "'   " + withball._name + " makes a fool of " + defender._name + " with a " + randommove() + "! No one can stop him! \n";
                    minute++;
                    matchday += minute + "'   " + defender2._name + " is the last defender left! \n";
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
               
               if ((situation > .55) && (situation < .8)) {
             Player Goalie = new Player();
                if (pos == 0) {
                Goalie = team2.get(0);
                }
                if (pos == 1) {
                Goalie = team1.get(0); 
                }
                
                matchday += minute + "'    " + withball._name + " has the ball in a good position." + "\n";
                matchday += minute + "'    " + withball._name + " shoots... " + "\n";
                double ontarget = Math.random();
                if (ontarget < .75) {
                if (((int) (Math.random() * withball._attack)) >= ((int) (Math.random() * Goalie._defense))) {
                matchday += minute + "'    He scores! " + "\n";
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
              
               if ((situation < .8) && (situation < .9)){
                //1-2
                Player receiver = new Player();
                if (pos == 0) {
                  receiver = pickattack(team1);}
                else {receiver = pickattack(team2);}
                
                while (receiver._name == withball._name) {
                  if (pos == 0) {
                  receiver = pickattack(team1);}
                else {receiver = pickattack(team2);}
                }
                
                Player defender = new Player();
                if (pos == 0) {
                  defender = pickdefense(team2);}
                else {defender = pickdefense(team1);}
                
                Player Goalie = new Player();
                if (pos == 0) {
                  Goalie = team2.get(0);}
                else {Goalie = team1.get(0);}
                
            matchday += minute + "'    " + withball._name + " faces off with " + defender._name + ". \n";
            if (((int) (Math.random() * withball._overall)) <= ((int) (Math.random() * defender._defense))) 
            {matchday += minute + "'    " + withball._name + " tries a one-two with " + receiver._name + " but " + defender._name + " reads it perfectly and intercepts the ball! \n";} 
            else {
              matchday += minute + "'    One-two from " + withball._name + " to " + receiver._name + ". \n";
              matchday += minute + "'    " + withball._name + " receives the ball back and dribbles towards the goal. \n";
              minute++;
              matchday += minute + "'    Still " + withball._name + " with the ball.... \n";
              if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defender._defense))) {
                    matchday += minute + "'   " + withball._name + " slips past " + defender._name + " with a " + randommove() + ". \n";
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
          if (pos == 0) {   
             team1.get(team1.indexOf(receiver))._assists++; }
           if (pos == 1) {   
             team2.get(team2.indexOf(receiver))._assists++; }
         matchday += "Assist by: " + receiver._name + ", his " + suffix(receiver._assists) + " of the season." + "\n";
                  }}
                else {
                  matchday += minute + "'    " + Goalie._name + " blocks the shot. " + randomgoaliemove() + "\n";
                }
                 
                 
              
            }
            }
               if (situation > .9){
                //pass to another attacker
                Player receiver = new Player();
                if (pos == 0) {
                  receiver = pickattack(team1);}
                else {receiver = pickattack(team2);}
                 while (receiver._name != withball._name) {
                  if (pos == 0) {
                  receiver = pickattack(team1);}
                else {receiver = pickattack(team2);}
                }
                
                
                Player defender = new Player();
                if (pos == 0) {
                  defender = pickdefense(team2);}
                else {defender = pickdefense(team1);}
                Player Goalie = new Player();
                
                if (pos == 0) {
                  Goalie = team2.get(0);}
                else {Goalie = team1.get(0);}
                
                
                if (((int) (Math.random() * withball._overall)) < 40) {matchday += minute + "'     Off-target pass by " + withball._name + " and the pass goes out of bounds. \n";} 
                else{
                 matchday += minute + "'    " + withball._name + " has the ball in at the top of the box. He has great vision and hits " +  receiver._name + " with a leading pass. \n";
                 beforeball = withball;
                 withball = receiver;
                 matchday += minute + "'    " + withball._name + " latches onto the ball and faces " +  defender._name + ". \n";
                 if (((int) (Math.random() * withball._attack)) > ((int) (Math.random() * defender._defense))) {
                    matchday += minute + "'   " + withball._name + " slips past " + defender._name + " with a " + randommove() + ". \n";
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
              }
               
            }
              }}
            
            
            
    
     minute += (int) (2+ (Math.random() * 4));
    }
      matchday += " End Game folks! Final Score: " + score1 + " to " + score2 + "\n";
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
     trickList.add("a slow-roller! What a mistake by the goalkeeper in letting the ball roll through his fingers");
    int number = (int) (Math.random() * trickList.size());
    return trickList.get(number);
  }
  public static Player pickattack(ArrayList<Player> team) {
    return team._roster.get(8+(int) (Math.random() *3));
  }
   public static Player pickdefense(ArrayList<Player> team) {
    return team._roster.get(1+(int) (Math.random() *4));
  }
    public static Player pickmid(ArrayList<Player> team) {
    return team._roster.get(5+(int) (Math.random() *3));
  }
        public static Player pickdefensemid(ArrayList<Player> team) {
    return team._roster.get(1+(int) (Math.random() *7));
  }
                public static Player pickmidattack(ArrayList<Player> team) {
    return team._roster.get(5+(int) (Math.random() *6));
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
