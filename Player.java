public class Player{

  public String _name;
   public String _pos;
   public int _age;
   public int _goals;
   public int _assists;
   public boolean _suspended;
   public boolean _injury;
   public double _attack;
   public double _defense;
   public double _overall;

   public Player(){
      _name = "";
      _pos = "";
      _age = 0;
      _goals = 0;
      _assists = 0;
      _suspended = false;
      _injury = false;
      _attack = 0;
      _defense = 0;
      _overall = 0;
   }
   
   public Player(String name,String pos,int age,double attack, double defense, double overall){
      _name = name;
      _pos = pos;
      _age = age;
      _goals = 0;
      _assists = 0;
      _suspended = false;
      _injury = false;
      _attack = attack;
      _defense = defense;
      _overall = overall;
   }

   /*public Player (String name, String pos, int age int goals, int assists, boolean suspended, boolean injury, int attack, int defense, int overall){
      _name = name;
      _pos = pos;
      _age = age;
      _goals = goals;
      _assists = assists;
      _suspended = suspended;
      _injury = injury;
      _attack = attack;
      _defense = defense;
      _overall = overall;
   }
   */

   public String toString(){
      return "Name : " + _name + "  Position : " + _pos + " Attack : " + _attack + " Defense : " + _defense + " Overall : " + _overall;
   }


   public void setAttack(double attack){
      _attack += attack;
   }

   public void setDefense(double defense){
      _defense += defense;
   }

   public void setOverall(double overall){
      _overall += overall;
   }

  
}