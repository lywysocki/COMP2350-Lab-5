/**
 * @author Laura Wysocki and Bryan DeFaria
 * @version 1.0.0 Initial Implementation
 */
public class DFS
{
static int   count = 0;
static int[] node  = { 0, 0, 0, 0, 0, 0, 0 }; // Seven nodes by default

public static void dfs( int v )
	{
		int[][] adj_matrix = {
						//A  B  C  D  E  F  G
						{ 0, 0, 1, 0, 0, 0, 0 }, // A
						{ 0, 0, 1, 0, 0, 1, 0 }, // B
						{ 1, 1, 0, 1, 1, 1, 0 }, // C
						{ 0, 0, 1, 0, 0, 0, 1 }, // D
						{ 0, 0, 1, 0, 0, 0, 0 }, // E
						{ 0, 1, 1, 0, 0, 0, 0 }, // F
						{ 0, 0, 0, 1, 0, 0, 0 }  // G
		};
		
		count++;
		node[ v ] = count;
		
		for( int i = 0; i < node.length; i++ )
			{
				// Checks if there is a link between the current node and the node being checked
				if( adj_matrix[ v ][ i ] == 1 )
					{
						// If there is a link, and the node being checked is 0, it is input into this function
						if( node[ i ] == 0 )
							{
								dfs( i );
							}
						
					}
			}
	}

public static void main( String[] args )
	{
		// Puts the node into the dfs algorithm if labeled as 0, otherwise skipped
		for( int i = 0; i < node.length; i++ )
			{
				if( node[ i ] == 0 )
					{
						dfs( i );
					}
			}
		
		// Handles output
		char[] node_names = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
		
		System.out.println( "(Node Name, Node Order)" );
		for( int i = 0; i < node.length; i++ )
			{
				System.out.printf( "(%s, %d)", node_names[ i ], node[ i ] );
				if( i < node.length - 1 )
					{
						System.out.print( ", " );
					}
			}
	}
}
