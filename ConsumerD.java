package com.Lambda;

import java.util.function.Consumer;

class Movie{
    String name;

    public Movie(String name) {
        this.name = name;
    }
}

public class ConsumerD {
    public static void main(String[] args) {
        Consumer<Movie>c1=m-> System.out.println(m.name+" ready to realase");
        Consumer<Movie>c2=m->System.out.println(m.name+" released but it is bigger flop!!");
        Consumer<Movie>c3=m->System.out.println(m.name+" Storing information in database");
        Consumer<Movie>cc=c1.andThen(c2).andThen(c3);

        Movie m=new Movie("Spider");
        cc.accept(m);

    }
}
