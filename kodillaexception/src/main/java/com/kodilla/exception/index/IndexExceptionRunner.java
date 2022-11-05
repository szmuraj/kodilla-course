package com.kodilla.exception.index;

import java.util.List;

public class IndexExceptionRunner {

    public static void main(String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> collection = videoCollector.getCollection();

        int x = 2;
        if (collection.size() > x) {
            String movie = collection.get(0);
            System.out.println(movie);

            String anotherMovie = collection.get(x);
            System.out.println(anotherMovie);
        } else {
            System.out.println(collection.get(collection.size()-1));
        }
    }
}