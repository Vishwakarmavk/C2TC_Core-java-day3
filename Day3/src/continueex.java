
public class continueex 
{
    public static void main (String[] args)
    {
    	for(int i=1;i<=2;i++)
    	{
    		for(int j=1;j<=5;j++)
    		{
    			if(j==4) {
    				continue;
    			}
    			System.out.println(j);
    		}
    	}
    }
}
