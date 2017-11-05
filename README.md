Solving 8 Puzzle problem using A*

Problem Formulation:

It is a simple sliding tile puzzle on a 3*3 grid where one tile is missing and we can move the other tiles into the gap until you get the puzzle into the goal position. The rules of the game are that we need to move the blank tile either left, right, top, center (depending upon its position) to achieve the final state. The blank tile needs to be moved till we reach the solved state.
States: It can be represented as a 3*3 Array, and the empty tile can be denoted with zero. Actions: Move the zero left, right, top or center depending on the position.                                     Goal Test: If the present matrix is same as the goal matrix.                                                         Heuristic: Manhattan distance between the position at current matrix and the Goal matrix
Data Structures used:
Open List: The open list of A* algorithm is implemented using a priority queue (pq) which uses f- value for comparing. A priority queue is used because we need to pick state with least f-value to proceed downwards. This queue stores the node that are generated but not expanded yet.
Closed List : The closed list of A* algorithm is implemented using a simple ArrayList (explored)  of Java. This list contains all the nodes which were explored on the way to solution.

Program Structure:

The program consists of three Classes:
1.	AStar: The main class which has the A* algorithm logic and the main method
2.	Node: The Node Class is used to represent the Nodes of the search space
3.	CompareNode: This class is used as comparator class for the priority queue.  

Node Class:

The Node class is used to store the Nodes of search tree. It has the following components:
1.	state: This is a 3*3 Matrix to represent the configuration of the Node
2.	h : The estimate cost of getting from this node to the goal Node
3.	g : The actual cost of reaching this node from the root node.   
4.	f : The true evaluation of node.
5.	successors : it is array list of Node type , storing the children of the node.
6.	ancestor: An element of type Node, describing the parent of the node.
The class has the setters and getters method for each of the above components and an empty constructor. 

CompareNode Class:

The CompareNode class is used as a comparator for the priority queue being used to store the open list of the search tree. The class uses f value to compare two nodes and this is used while inserting or popping elements from the queue. 

AStar Class:

The AStar class is the main class which accepts the input from user, contains the A* algorithm logic and prints the desired output to the console.
This class has the following methods:
1.	Main() : This performs the A* algorithm and accepts the input from user and prints the output. 
2.	priorityQueueContains(PriorityQueue<Node> pq, Node child): This method accepts the priority queue and node as the argument. It returns true, if the node is already present in the priority queue. It 	
3.	exploredContains(ArrayList<Node> explore, Node child) : This method accepts the explored array list and node as the argument. It returns true, if the node is already present in the explored list.
4.	genChild(int[][] goalMatrix, Node node): This Method generates the allowed children of a node and compute all the possible components of the child. It returns a list of children generated.
5.	manhattanDist(int[][] curr, int[][] goal): This accepts two matrix and finds out the sum of Manhattan distance of elements of the matrices.
6.	printMatrix(Node n): This is a helper method to print the states and F-value of the node while printing the solution path for the final output. 


