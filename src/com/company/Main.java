package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<String> nameList;

    public static void main(String[] args) {

        Main mainClass = new Main();
        mainClass.testingLists();

    }

    private void testingLists() {

        nameList = new ArrayList<String>();

        nameList.add("Crystal");
        nameList.add("Chris");
        nameList.add("Bin");
        nameList.add("Luke");
        nameList.add("Ethan");

        //For Each loop to see all items in arrayList.
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
