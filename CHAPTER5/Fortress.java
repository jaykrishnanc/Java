 1. import java.util.*;
 2. class Fortress {
 3.   private String name;
 4.   private ArrayList<Integer> list;
 5.   Fortress() { list = new ArrayList<Integer>(); }
 6.
 7.   String getName() { return name; }
 8.   void addToList(int x) { list.add(x); }
 9.   ArrayList getList() { return list; }
10. }
