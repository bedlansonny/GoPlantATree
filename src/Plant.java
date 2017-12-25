import java.io.*;
import java.util.*;
public class Plant
{
    public static void main(String args[]) throws IOException
    {
        Scanner in = new Scanner(new File("input.txt"));
        int testCaseAmt = in.nextInt();
            in.nextLine();
            in.nextLine();
        //System.out.println(in.nextLine());
        for(int testCaseNum = 0; testCaseNum < testCaseAmt; testCaseNum++)
        {
            int treeTotal = 0;
            HashMap<String, Integer> species = new HashMap<>();
            ArrayList<String> speciesNames = new ArrayList<>();
            while(in.hasNext())
            {
                String input = in.nextLine();
                if(input.isEmpty())
                    break;
                if(!species.containsKey(input))
                {
                    speciesNames.add(input);
                    species.put(input, 1);
                }
                else
                {
                    species.replace(input, species.get(input)+1);
                }
                treeTotal++;
            }
            Collections.sort(speciesNames);
            for(String speciesName : speciesNames)
                System.out.printf("%s %.4f%n", speciesName, 100*((double)species.get(speciesName)/treeTotal));
            System.out.println();
        }
    }
}
