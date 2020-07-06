# m07-t01
### “Das Experiment”

Create HashMap<Integer, Integer>. 

The first thread adds elements into the map, the other go along the given map and sum the values. Threads should work before catching ConcurrentModificationException.

1.	Fix the problem with ConcurrentHashMap и Collections.synchronizedMap. 
2.	Try to write your custom ThreadSafeMap with synchronization and without. 
3.	Run your samples with different versions of Java (6, 8, and 10, 11) and measure the performance. Provide a simple report to your mentor.
