package LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Link{
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    public Link(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}



public class BookList {
    public static void main(String[] args) {
        // Creating list of books
        LinkedList<Link> list=new LinkedList<Link>();
        // creating book

        Link l1=new Link(101,"java","xyz","abc",3);
        Link l2 =new Link(102,"os","Forouzan","McGrawHill",6);
        Link l3=new Link(103,"ds","galvin","wiley",5);
        Link l4=new Link(104,"ds","sam","samy",6);

        //add the books to list
        list.add(l1);
        list.add(l2);
        list.add(l3);


        list.remove(l2);
        //System.out.println(list);

        System.out.println(list.get(1));


        list.set(1,l2);

        list.add(l3);
        list.add(l4);
        list.addAll(list);

    // traversing list
        for (Link link:list){
            System.out.println(link.id+" "+link.name+" "+link.author+" "+link.publisher+" "+link.quantity);
        }
    }



}
