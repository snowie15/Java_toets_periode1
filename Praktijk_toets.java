package praktijk_toets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LarsJ
 * @author JaspervdV
 */
public class Praktijk_toets  {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] computers = {"Hp110", "Dell-insporion", "Lenovo Y510P", "Asus-K77V", "MSI-Gt60-NC"};
        String[] speceficaties = {"I7-4700mq, 8gb RAM, 500GB HDD, ", "I7-4700hq, 8gb RAM, 1TB HDD", "I3-6400m, 4gb RAM, 500GB HDD", "I5-6500m, 6gb RAM, 500GB HDD", "I3-2300m, 2gb RAM, 320GB HDD"};
        List replacements = new ArrayList();
        int count = 0;
        int hours = 0;
        int years = 0;
       
        
        
        for (String computerName : computers) {;
            
            String prefix = "[" + computerName + "]";
            try{
            hours = Integer.parseInt(JOptionPane.showInputDialog(computerName + ": Gebruiksuren"));
            System.out.println(prefix + " Gebruiksuren: " + hours);
            }catch (NumberFormatException ex ) {
            System.err.println("verkeerd teken ingevoerd");  
             
            }
            
            try {
            years = Integer.parseInt(JOptionPane.showInputDialog(computerName + ": Aantal jaar gebruikt"));
            System.out.println(prefix + " Aantal jaar gebruikt: " + years);
            } catch (NumberFormatException ex ) {
            System.err.println("verkeerd teken ingevoerd");
            }   
            
            boolean needsReplacement = hours > 7000 || years > 5;          
            replacements.add(needsReplacement);
            
            System.out.println("Speceficaties: " + speceficaties[count]);
            count ++;
            }
        printReplacements(computers, replacements);
       
    }
    
    public static void printReplacements(String[] computers, List replacements)
    {
        for (int i = 0; i < computers.length; i++) {
           String computerName = computers[i];

           if ((boolean)replacements.get(i)) {
               System.out.println(computerName + ": vervangen");
           } else {
               System.out.println(computerName + ": behouden");
           }
             
        }
    }
}
