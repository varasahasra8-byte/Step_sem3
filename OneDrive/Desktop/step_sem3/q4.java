 public class q4
{
    static void analyzeInventory(int[] sectionA, int[] sectionB)
    {
        int totalA = 0;
        int totalB = 0;

        int highest = sectionA[0];
        String section = "Section A";
        int position = 0;

        for(int i = 0; i < sectionA.length; i++)
        {
            totalA = totalA + sectionA[i];
            totalB = totalB + sectionB[i];

            if(sectionA[i] > highest)
            {
                highest = sectionA[i];
                section = "Section A";
                position = i;
            }

            if(sectionB[i] > highest)
            {
                highest = sectionB[i];
                section = "Section B";
                position = i;
            }
        }

        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);

        if(totalA == totalB)
        {
            System.out.println("Status: Balanced");
        }
        else
        {
            System.out.println("Status: Not Balanced");
        }

        System.out.println("Highest Quantity: " + highest);
        System.out.println("Section: " + section);
        System.out.println("Item Position: " + (position + 1));
    }

    public static void main(String[] args)
    {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        System.out.println("Inventory Analysis");
        analyzeInventory(sectionA, sectionB);
    }
}
    

