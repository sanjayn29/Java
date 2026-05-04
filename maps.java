import java.util.*;
class Maps{
    public static void main(String[] args){
        Map <Integer,String> hm = new HashMap<>();
        Map <Integer,String> tm = new TreeMap<>();
        Map <Integer,String> lm = new LinkedHashMap<>();
        Hashtable<Integer,String> ht = new Hashtable<>();

        hm.put(1,"A");
        hm.put(2,"B");
        hm.put(3,"C");
        System.out.println("HashMap: " + hm);

        tm.put(1,"A");
        tm.put(2,"B");
        tm.put(3,"C");
        System.out.println("TreeMap: " + tm);

        lm.put(1,"A");
        lm.put(2,"B");
        lm.put(3,"C");
        System.out.println("LinkedHashMap: " + lm);

        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");  
        System.out.println("HashTable: " + ht);

        for(Map.Entry<Integer,String> e : hm.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }

        for(Map.Entry<Integer,String> e : tm.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        for(Map.Entry<Integer,String> e : lm.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        for(Map.Entry<Integer,String> e : ht.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}