import java.io.File;
import java.io.*;
import java.util.Scanner;

public class TransferMarket{

   public static int _goldPrice = 15000;
   public static int _silverPrice = 10000;
   public static int _bronzePrice;

   //-------------------------------------------------
   //GOLD---------------------------------------------
   //-------------------------------------------------
   public static String getGoldAttack(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/GoldAttackers.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 34);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   public static String getGoldMidfield(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/GoldMidfielders.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 123);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   public static String getGoldDefense(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/GoldDefenders.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 34);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   public static String getGoldGoalie(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/GoldGoalkeepers.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 34);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   //-------------------------------------------------
   //SILVER-------------------------------------------
   //-------------------------------------------------

   public static String getSilverAttack(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/SilverAttackers.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 34);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   public static String getSilverMidfield(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/SilverMidfielders.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 46);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   public static String getSilverDefense(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/SilverDefenders.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 34);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   public static String getSilverGoalie(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/SilverGoalkeepers.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 34);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   //-------------------------------------------------
   //BRONZE-------------------------------------------
   //-------------------------------------------------

   public static String getBronzeAttack(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/BronzeAttackers.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 34);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   public static String getBronzeMidfield(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/BronzeMidfielders.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 34);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   public static String getBronzeDefense(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/BronzeDefenders.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 34);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   public static String getBronzeGoalie(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("res/GoldGoalkeepers.txt");
      try {
         input = new Scanner(file);
         int r = 1 + (int) (Math.random() * 34);
         while(r > 0){
            line = input.nextLine();
            r--;
         }}
         catch (FileNotFoundException ex) {
            System.out.println("Error: File not found");
         }
         input.close();
         return line;
   }

   public static Player GoldAttacker(){

   Player player = new Player();

   String parse = getGoldAttack();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

public static Player GoldDefender(){

   Player player = new Player();

   String parse = getGoldDefense();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

public static Player GoldMidfielder(){

   Player player = new Player();

   String parse = getGoldMidfield();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

public static Player GoldGoalie(){

   Player player = new Player();

   String parse = getGoldGoalie();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

   public static Player SilverAttacker(){

   Player player = new Player();

   String parse = getSilverAttack();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

public static Player SilverDefender(){

   Player player = new Player();

   String parse = getSilverDefense();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

public static Player SilverMidfielder(){

   Player player = new Player();

   String parse = getSilverMidfield();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

public static Player SilverGoalie(){

   Player player = new Player();

   String parse = getSilverGoalie();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

   public static Player BronzeAttacker(){

   Player player = new Player();

   String parse = getBronzeAttack();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

public static Player BronzeDefender(){

   Player player = new Player();

   String parse = getBronzeDefense();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

public static Player BronzeMidfielder(){

   Player player = new Player();

   String parse = getBronzeMidfield();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

public static Player BronzeGoalie(){

   Player player = new Player();

   String parse = getBronzeGoalie();

   int index = parse.indexOf(" ");
   player._name = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._pos = parse.substring(0,index);
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._age = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._attack = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   index = parse.indexOf(" ");
   player._defense = Integer.parseInt(parse.substring(0,index));
   parse = parse.substring(index + 1);

   player._overall = Integer.parseInt(parse);

   return player;
}

public static void main(String[] args){
  String hi = args[0];
      System.out.println(GoldAttacker());
      System.out.println(GoldMidfielder());
      //      System.out.println(SilverMidfielder());
}

}