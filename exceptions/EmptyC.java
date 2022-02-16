package org.excetions;

import java.util.HashMap;
import java.util.Map;

final class Empty{
    private final int id;
    private final String Name;
    private final Map<String,String> metadata;

    public Empty(int id, String name, Map<String, String> metadata) {
        this.id = id;
        this.Name = name;

        Map<String,String>temp=new HashMap<>();

        for (Map.Entry<String,String> entry:metadata.entrySet()){
            temp.put(entry.getKey(),entry.getValue());
        }
        this.metadata = metadata;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public Map<String, String> getMetadata() {
        Map<String,String> tempMap=new HashMap<>();

       for (Map.Entry<String,String>entry:this.metadata.entrySet()){
           tempMap.put(entry.getKey(),entry.getValue());
       }
        return tempMap;
    }
}


public class EmptyC {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();

        map.put("1","akshay");
        map.put("2","ajay");

        Empty empty=new Empty(101,"aksh",map);
        System.out.println(empty.getId());
        System.out.println(empty.getName());
        System.out.println(empty.getMetadata());

        map.put("3","amit");
        System.out.println(empty.getMetadata());

        empty.getMetadata().put("4","sam");

        System.out.println(empty.getMetadata());
    }
}
