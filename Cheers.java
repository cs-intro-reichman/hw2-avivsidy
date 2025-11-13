//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String nameToCheer=args[0];
            nameToCheer = nameToCheer.toUpperCase();
            String numToCheer = args[1];
            String anLetters = "AEFHILMNORSX";
            for (int i=0; i<nameToCheer.length(); i++)
            {
                char letter = nameToCheer.charAt(i);
                if (anLetters.indexOf((letter)) != -1)
                {
                    System.out.println("Give me an " + letter + ": " + letter + "!");          
                }
                else
                {
                    System.out.println("Give me a  " + letter + ": " + letter + "!");
                }
            }
            System.err.println("What does that spell?");
            for (int i=0; i<Integer.parseInt(numToCheer); i++)
            {
                System.out.println(nameToCheer + "!!!");
            }
        }
}
