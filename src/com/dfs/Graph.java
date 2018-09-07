/**
 * 
 */
package com.dfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class Graph {
	
	private int v;//Number of vertices
	
	private List<Integer> [] adjacents;
	
	public Graph(int vertices) {
		this.v = vertices;
		adjacents = new LinkedList[vertices];
		
		for(int index = 0; index<v;index++) {
			adjacents[index] = new LinkedList<>();
		}
	}
	
	
	public void addEdge(int v, int value) {
		adjacents[v].add(value);
	}
	
	
	private void dsfUtil(int startPointVertex, boolean visited[]) {
		
		visited[startPointVertex] = true;
		
		System.out.print(startPointVertex +" ");
		
		Iterator<Integer> iterator = adjacents[startPointVertex].iterator();
		
		while (iterator.hasNext()) {
			Integer n = (Integer) iterator.next();
			 
			if(!visited[n]) {
				dsfUtil(n, visited);
			}
		}
	}
	
	private void dfs(int startFromVertex) {
		boolean visited[] = new boolean[v];
		
		dsfUtil(startFromVertex, visited);
	}
	
	public static void main(String[] args) {
		 Graph g = new Graph(4);
		 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println("Following is Depth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        g.dfs(2);
	}

}
