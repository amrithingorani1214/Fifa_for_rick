import java.io.File;
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TransferMarket{

   public static int _goldPrice = 15000;
   public static int _silverPrice = 10000;
   public static int _bronzePrice;

   //-------------------------------------------------
   //GOLD---------------------------------------------
   //-------------------------------------------------
   public static String getGoldAttack(){
      //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="GoldAttackers.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 81);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
         return line;
   }

   public static String getGoldMidfield(){
      //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="GoldMidfielders.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 122);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
         return line;
   }

   public static String getGoldDefense(){
  //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="GoldDefenders.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 71);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
         return line;
   }

   public static String getGoldGoalie(){
     //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="GoldGoalkeepers.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 10);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
         return line;
   }

   //-------------------------------------------------
   //SILVER-------------------------------------------
   //-------------------------------------------------

   public static String getSilverAttack(){
      //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="SilverAttackers.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 360);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
         return line;
   }

   public static String getSilverMidfield(){
   //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="SilverMidfielders.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 569);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
         return line;
   }

   public static String getSilverDefense(){
      //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="SilverDefenders.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 450);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
         return line;
   }

   public static String getSilverGoalie(){
      //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="SilverGoalkeepers.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 100);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
         return line;
   }

   //-------------------------------------------------
   //BRONZE-------------------------------------------
   //-------------------------------------------------

   public static String getBronzeAttack(){
      //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="BronzeAttackers.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 416);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
         return line;
   }

   public static String getBronzeMidfield(){
  //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="BronzeMidfielders.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 555);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
         return line;
   }

   public static String getBronzeDefense(){
    //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="BronzeDefenders.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 488);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
         return line;
   }

   public static String getBronzeGoalie(){
      //Scanner input = new Scanner(System.in);
      String line = "";
ArrayList<String> lines = new ArrayList<String>();      
//File file = new File("res/GoldGoalkeepers.txt");
   
       String fileName="BronzeGoalkeepers.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          //String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            lines.add(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

      
      //try {
         //input = new Scanner(file);
         int r = (int) (Math.random() * 183);
         line = lines.get(r);
        // while(r > 0){
            //line = input.nextLine();
          //  r--;
        // }
   
   //      catch (FileNotFoundException ex) {
     //       System.out.println("Error: File not found");
       //  }
      //   input.close();
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
   player._attack = Double.parseDouble(parse.substring(0,index));
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

   player._overall = Integer.parseInt(parse.substring(0,parse.length()-1));

   return player;
}

public static void main(String[] args){
      //      String hi = args[0];
      //      System.out.println(GoldAttacker());
      //      System.out.println(GoldMidfielder());
      //      System.out.println(SilverMidfielder());
}

}