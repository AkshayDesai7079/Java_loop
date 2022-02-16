package org.excetions;

import java.util.HashMap;
import java.util.Map;

final class A{
    private final int Id;
    private final String Name;
    private final Map<String,Integer >metadata;

    public A(int id, String name, Map<String, Integer> metadata) {
        Id = id;
        Name = name;

        Map<String,Integer> temp=new HashMap<>();

        for (Map.Entry<String,Integer>entry:metadata.entrySet()){
            temp.put(entry.getKey(),entry.getValue());
        }

        this.metadata = temp;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public Map<String, Integer> getMetadata() {
        Map<String,Integer>temp=new HashMap<>();

        for (Map.Entry<String,Integer>entry:this.metadata.entrySet()){
            temp.put(entry.getKey(),entry.getValue());
        }
        return temp;
    }
}
public class EmpC {

    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("omkar",1);
        map.put("dhruv",2);
        map.put("ggg",6);

        A a=new A(1,"akshay",map);//once you create the object after that you cannot initialize the values
        System.out.println(a.getId());
        System.out.println(a.getName());
        System.out.println(a.getMetadata());


        map.put("kkk",3);
        map.put("hb",7);
        System.out.println(a.getMetadata());
    }

}
