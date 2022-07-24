# Решение тестового задания от Халык банка
*На Spring Boot разработать web service, который по GET запросу вернет дату и время в
формате json.*

## Имеются 3 Java файла:
* HalykDemoApplication.java
* Date.java
* DateController.java
</br>
<img src="https://github.com/realisher/Halyk-test/blob/main/imgs/screen2.PNG" >
</br>



## Algorithm

**What is Dijkstra’s shortest path algorithm?**

* Dijkstra algorithm is a greedy algorithm.
* It finds a shortest path tree for a weighted undirected graph.
* This means it finds a shortest paths between nodes in a graph, which may represent, for example, road networks
* For a given source node in the graph, the algorithm finds the shortest path between source node and every other node.
* This algorithm also used for finding the shortest paths from a single node to a single destination node by stopping the algorithm once the shortest path to the destination node has been determined.
* Dijkstra’s algorithm is very similar to Prim’s algorithm. In Prim’s algorithm we create minimum spanning tree (MST) and in Dijkstra algorithm we create shortest path tree (SPT) from the given source..

## Shortest path Applications

### Games 
What about uses of the shortest path algorithms, the very first thing that came to our mind was the project we worked on in the java2 course. 
</br>
<img src="https://github.com/Daxak07/Algomen/blob/main/visuals/3edited.gif" width="500">

### Map services 
Shortest path algorithms are applied to automatically find directions between physical locations, such as driving directions on web mapping websites like MapQuest or Google Maps.
</br>
<img src="https://github.com/Daxak07/Algomen/blob/main/visuals/1fasted.gif" width="500">

*Analysis and results from gif:*
</br>
<img src="https://github.com/Daxak07/Algomen/blob/main/visuals/analysis.png" width="350">
<img src="https://github.com/Daxak07/Algomen/blob/main/visuals/result.png" width="350">

### Nondeterministic machine
If one represents a nondeterministic abstract machine as a graph where vertices describe states and edges describe possible transitions, shortest path algorithms can be used to find an optimal sequence of choices to reach a certain goal state, or to establish lower bounds on the time needed to reach a given state.
</br>
<img src="https://github.com/Daxak07/Algomen/blob/main/visuals/nondeterministic.png" width="500">
</br>

*Real-life example:*
</br>
<img src="https://github.com/Daxak07/Algomen/blob/main/visuals/2fasted.gif" width="500">
