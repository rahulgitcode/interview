package com.datastructure.graph;

public class Graph {
	/*
	public void dfs() // depth-first search
	{ // begin at vertex 0
		vertexList[0].wasVisited = true; // mark it
		displayVertex(0); // display it
		theStack.push(0); // push it
		while( !theStack.isEmpty() ) // until stack empty,
		{
			// get an unvisited vertex adjacent to stack top
			int v = getAdjUnvisitedVertex( theStack.peek());
			
			if(v == -1) // if no such vertex,
				theStack.pop();
			else // if it exists,
			{
				vertexList[v].wasVisited = true; // mark it
				displayVertex(v); // display it
				theStack.push(v); // push it
			}
		} // end while
		
		// stack is empty, so we�re done
		for(int j=0; j<nVerts; j++) // reset flags
			vertexList[j].wasVisited = false;
		
	}// end dfs
	
	
	
	public void bfs() // breadth-first search
	{ // begin at vertex 0
		vertexList[0].wasVisited = true; // mark it
		displayVertex(0); // display it
		theQueue.insert(0); // insert at tail
		int v2;
		while( !theQueue.isEmpty() ) // until queue empty,
		{
			int v1 = theQueue.remove(); // remove vertex at head
			// until it has no unvisited neighbors
			while( (v2=getAdjUnvisitedVertex(v1)) != -1 )
			{ // get one,
				vertexList[v2].wasVisited = true; // mark it
				displayVertex(v2); // display it
				theQueue.insert(v2); // insert it
			} // end while(unvisited neighbors)
		} // end while(queue not empty)
		// queue is empty, so we�re done
		for(int j=0; j<nVerts; j++) // reset flags
			vertexList[j].wasVisited = false;
	} // end bfs()
	*/
}
