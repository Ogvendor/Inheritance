package Fifo;

import java.util.*;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Blue");
        colors.add("Black");

        Map<String, Integer> map = new HashMap<>();
        //map.put("A",3)
        map.replace("A", 3);
        System.out.println("From queue " + colors);
        System.out.println("From map " +  map);

        Set<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);

        System.out.println("From set --> " + nums);
    }
}
