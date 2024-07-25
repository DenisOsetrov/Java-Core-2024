package lessons.lesson_4_collections;

import java.util.*;

public class My_collections_1 {
    public static void main(String[] args) {
        // Використання ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        System.out.println("ArrayList: " + arrayList);

        // Використання HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.add("Cat"); // Дублікати ігноруються
        System.out.println("HashSet: " + hashSet);

        // Використання HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        System.out.println("HashMap: " + hashMap);

        // Використання TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Pineapple");
        treeSet.add("Apple");
        System.out.println("TreeSet: " + treeSet);
    }
}

