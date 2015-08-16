import java.util.*;
class PQ {
  static class PQsort
          implements Comparator<Integer> {  // inverse sort
    public int compare(Integer one, Integer two) {
      return two - one;                     // unboxing
    }
  }
  public static void main(String[] args) {
    int[] ia = {1,5,3,7,6,9,8 };            // unordered data
    PriorityQueue<Integer> pq1 =
      new PriorityQueue<Integer>();         // use natural order
    for(int x : ia)                         // load queue
      pq1.offer(x);
    for(int x : ia)                         // review queue
      System.out.print(pq1.poll() + " ");
    System.out.println("");
    PQsort pqs = new PQsort();              // get a Comparator
    PriorityQueue<Integer> pq2 =
      new PriorityQueue<Integer>(10,pqs);   // use Comparator
    for(int x : ia)                         // load queue
      pq2.offer(x);
    System.out.println("size " + pq2.size());
    System.out.println("peek " + pq2.peek());
    System.out.println("size " + pq2.size());
    System.out.println("poll " + pq2.poll());
    System.out.println("size " + pq2.size());
    for(int x : ia)                         // review queue
      System.out.print(pq2.poll() + " ");
  }
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ java PQ
Picked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
1 3 5 6 7 8 9 
size 7
peek 9
size 7
poll 9
size 6
8 7 6 5 3 1 null 

*/
