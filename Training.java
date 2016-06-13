public class Training{

   public static double upgrade;

   public static String UpgradeAttack(Player p){
      if (p._age < 20) upgrade = 1.5;
      else if (p._age >= 20 && p._age < 30)
         upgrade = 0.25 + ((int) (Math.random() * 3)) * 0.5;
      else upgrade = ((int) (Math.random() * 5)) * 0.1;
      p._attack = upgrade;
      return "Your player's attack increased by " + upgrade + "!";
   }

   public static String UpgradeMidfield(Player p){
      if (p._age < 20) upgrade = 1.5;
      else if (p._age >= 20 && p._age < 30)
         upgrade = 0.25 + ((int) (Math.random() * 3)) * 0.5;
      else upgrade = ((int) (Math.random() * 5)) * 0.2;
      p.setOverall(upgrade);
      return "Your player's overall increased by " + upgrade + "!";
   }

   public static String UpgradeDefense(Player p){
      if (p._age < 20) upgrade = 1.5;
      else if (p._age >= 20 && p._age < 30)
         upgrade = 0.25 + ((int) (Math.random() * 3)) * 0.5;
      else upgrade = ((int) (Math.random() * 5)) * 0.2;
      p.setDefense(upgrade);
      return "Your player's defense increased by " + upgrade + "!";
   }

   public static String UpgradeGoalie(Player p){
      if (p._age < 20) upgrade = 1.5;
      else if (p._age >= 20 && p._age < 30)
         upgrade = 0.25 + ((int) (Math.random() * 3)) * 0.5;
      else upgrade = ((int) (Math.random() * 5)) * 0.2;
      p.setDefense(upgrade);
      return "Your player's defense increased by " + upgrade + "!";
   }

}
