import java.io.File;
import java.io.*;
import java.util.Scanner;

public class TransferMarket{

   //-------------------------------------------------
   //GOLD---------------------------------------------
   //-------------------------------------------------
   public static String getGoldAttack(){
      Scanner input = new Scanner(System.in);
      String line = "";
      File file = new File("GoldAttackers.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
      File file = new File("GoldMidfield.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
      File file = new File("GoldDefense.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
      File file = new File("GoldGoalie.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
      File file = new File("SilverAttackers.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
      File file = new File("SilverMidfield.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
      File file = new File("SilverDefense.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
      File file = new File("SilverGoalie.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
      File file = new File("BronzeAttackers.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
      File file = new File("BronzeMidfield.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
      File file = new File("BronzeDefense.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
      File file = new File("GoldGoalie.txt");
      try {
         input = new Scanner(file);
         int r = (int) (Math.random() * 34);
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
   public static void main(String[] args){
         System.out.println(getGoldAttack());
   }

}
