public class q2
{
    static void checkTypingAccuracy(String original, String typed)
    {
        int matched = 0;
        int firstMismatch = -1;

        for(int i = 0; i < original.length(); i++)
        {
            if(original.charAt(i) == typed.charAt(i))
            {
                matched++;
            }
            else
            {
                if(firstMismatch == -1)
                {
                    firstMismatch = i;
                }
            }
        }

        double accuracy = (matched * 100.0) / original.length();

        System.out.println("Matched Characters: " + matched);
        System.out.println("Total Characters: " + original.length());
        System.out.println("Accuracy: " + accuracy + "%");

        if(firstMismatch == -1)
        {
            System.out.println("No Mismatches");
        }
        else
        {
            System.out.println("First Mismatch Position: " + (firstMismatch + 1));
            System.out.println("Original Character: " + original.charAt(firstMismatch));
            System.out.println("Typed Character: " + typed.charAt(firstMismatch));
        }
    }

    public static void main(String[] args)
    {
        String original = "hello world";
        String typed = "hello worlt";

        System.out.println("Typing Accuracy Result");
        checkTypingAccuracy(original, typed);
    }
}