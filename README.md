# m03-t02

### Visual VM + GC Plugin

Take the code and run
```
public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        while(true) {
             list.add(new Object());
        }
    }
}
```


Connect to the running JVM with VisualVM with installed GC plugin. Observe GC curve and memory regions.
1.	Apply changes to the following app code to make GC curve have peaks that are more frequent.
2.	Tune GC settings via JVM flags (change GC, maybe) to make GC curve have peaks that are more frequent.
3.	Tune Heap regions via JVM flags to make GC curve have peaks that are more frequent.

Make screenshots for each subtask and prove your power of JVM – master!
