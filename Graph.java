// Java program to count number of trees in a forest by Amir Sohail Mallick

import java.io.*;
import java.util.*;


class Graph
{
	private int V; // No. of vertices

	private LinkedList<Integer> adj[];

	// Constructor
	Graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	
	void addEdge(int v, int w)
	{
		adj[v].add(w);
	}


	void DFSUtil(int v,boolean visited[])
	{
		visited[v] = true;
		
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext())
		{
			int n = i.next();
			if (!visited[n])
			{
				DFSUtil(n,visited);
			}
		}
	}


	int countTrees()
	{
		
		boolean visited[] = new boolean[V];
		int res = 0;
		
		
		for (int i = 0; i < V; ++i)
		{
			if (visited[i] == false)
			{
				DFSUtil(i, visited);
				res ++;
			}
		}
		return res;
	}

	
	public static void main(String args[])
	{
		Graph g = new Graph(5);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(3, 4);

		System.out.println(g.countTrees());
	}
}
