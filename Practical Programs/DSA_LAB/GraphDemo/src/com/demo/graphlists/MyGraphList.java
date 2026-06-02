package com.demo.graphlists;

import com.demo.stacks.MyQueueLinkList;
import com.demo.stacks.MyStackGeneric;

public class MyGraphList {
	MyLinkedList[] graph;
	
	
	public MyGraphList(int v) {
		this.graph = new MyLinkedList[v];
		//initialize all linked list to null
		for(int i=0;i<this.graph.length;i++) {
			graph[i]=new MyLinkedList();
		}
	}
	
	public void addEdge(int source,int dest) {
		graph[source].addNode(dest);
	}
	
	public void printGraph() {
		for(int i=0;i<graph.length;i++) {
			System.out.print(i+"===>");
		    graph[i].displayList();
		}
	}
	
	public void dfsTraversal(int start) {
		System.out.println("DFS traversal : ");
		//create visited array of size=number of vertices, and initialize it to false
		boolean[] visited=new boolean[graph.length];
		for(int i=0;i<visited.length;i++) {
			visited[i]=false;
		}
		//create a stack for traversal
		MyStackGeneric<Integer> stk=new MyStackGeneric<>();
		stk.push(start);
		String dfs="";
		while(!stk.isEmpty()) {
			int v=stk.pop();
			if(!visited[v]) {//is visited false
				dfs+=v+", ";
				visited[v]=true;
				//get all adjescent vertices of v 
				int[] arr=graph[v].getAdjescentVertices(graph.length);
				//add all adjescent vertices , which are not visited, and push them in the stack
				for(int i=0;i<arr.length && arr[i]!=-1;i++) {
					 if(arr[i]!=-1 && !visited[arr[i]]) {
						 stk.push(arr[i]);
					 }
				}
				stk.displayData();
				System.out.println("=======================");
				
				
			}
		}
		System.out.println("Dfs : "+dfs);
	}
	
	public void bfsTraversal(int start) {
		System.out.println("BFS traversal : ");
		//create visited array of size=number of vertices, and initialize it to false
		boolean[] visited=new boolean[graph.length];
		for(int i=0;i<visited.length;i++) {
			visited[i]=false;
		}
		//create a Queue for traversal
		MyQueueLinkList que=new MyQueueLinkList();
		que.enqueue(start);
		String bfs="";
		while(!que.isEmpty()) {
			int v=que.dequeue();
			if(!visited[v]) {//is visited false
				bfs+=v+", ";
				visited[v]=true;
				//get all adjescent vertices of v 
				int[] arr=graph[v].getAdjescentVertices(graph.length);
				//add all adjescent vertices , which are not visited, and push them in the stack
				for(int i=0;i<arr.length && arr[i]!=-1;i++) {
					 if(arr[i]!=-1 && !visited[arr[i]]) {
						 que.enqueue(arr[i]);
					 }
				}
				//que.displayData();
				//System.out.println("=======================");
				
				
			}
		}
		System.out.println("Bfs : "+bfs);
	}
	

}
