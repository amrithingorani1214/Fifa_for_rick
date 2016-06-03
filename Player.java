public class Player{

   public String _name;
   public String _pos;
   public int _age;
   public int _goals;
   public int _assists;
   public boolean _suspended;
   public boolean _injury;
   public int _attack;
   public int _defense;
   public int _overall;

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
}
