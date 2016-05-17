import java.util.ArrayList;
import java.util.List;

public class Players {
  
  public static void main (String [] args) {
  ArrayList<ArrayList<String>> gold = new ArrayList<ArrayList<String>>(5);

for(List s: gold) {
    int len = s.size();
    // add new array lists as required, could be any length, assuming << 100
  //  while(gold.size() <= len) gold.add(new ArrayList<String>());
    // add the string to the right list.
    gold.get(len).add("hi");
}
System.out.println(gold);
  }
  
  
  
}