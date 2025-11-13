// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N=Integer.parseInt(args[0]);
		int seed;
		String mode=args[1];
		int countIterations=1;
		for (int i=1; i<=N; i++)
		{
			seed=i;
			if (seed==1) 
			{
				if (mode.equals("v"))
				{
					countIterations++;
					System.err.print(seed + " ");
				}
				seed=3*seed+1;
			}
			while (seed!=1)
			{
				if (mode.equals("v"))
				{
		    		System.out.print(seed + " ");
				}
				if (seed%2==0) {
			    	seed=seed/2;
				} 
				else
				{
			    	seed=3*seed+1;
				}
				countIterations++;
			}
			if (mode.equals("v"))
			{
				System.err.print("1 " + "(" + countIterations + ")");
				System.err.println();
				countIterations=1;
			}	
		}
		if (mode.equals("v") || mode.equals("c"))
		{
			System.err.println();		
			System.err.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}	
}
}