
package praktijk_toets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author larsj
 * @author JaspervdV
 */
public class Praktijk_toets {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] computers = {"Hp110", "Dell-insporion", "Lenovo Y510P", "Asus-K77V", "MSI-Gt60-NC"};
        List replacements = new ArrayList();
        
        for (String computerName : computers) {
            String prefix = "[" + computerName + "] ";

            System.out.println(prefix + " gebruiksuren:");
            int hours = Integer.parseInt(s.nextLine());

            System.out.println(prefix + " aantal jaar gebruikt:");
            int years = Integer.parseInt(s.nextLine());
                        
            boolean needsReplacement = hours > 7000 || years > 5;          
            replacements.add(needsReplacement);
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

