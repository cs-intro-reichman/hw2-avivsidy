// Computes an approximation of PI.
public class CalcPi
{
	public static void main(String [] args)
	{ 
	    int sign=-1;
		double piApproximation=1.0;
		int numOfTerms=Integer.parseInt(args[0]);
		for (int i=0; i<numOfTerms-1; i++)
		{
			piApproximation += sign/(2.0*i+3.0);
			sign = -sign;
		}
		piApproximation = piApproximation * 4.0;
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated:     " + piApproximation);
}
}