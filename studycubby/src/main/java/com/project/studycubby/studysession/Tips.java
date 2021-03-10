package com.project.studycubby.studysession;

import java.util.*;
//import javax.persistence.*;

// @Entity
// @Table
public class Tips{
    // @Id
    // @SequenceGenerator(
    //     name = "tip_sequence",
    //     sequenceName = "tip_sequence",
    //     allocationSize = 1
    // )
    // @GeneratedValue(
    //     strategy = GenerationType.SEQUENCE,
    //     generator = "tip_sequence"
    // )

    private LinkedList<String> tipList;
    private int tipAmount;
    //This is the initializer of the Tips class setting up the Linked List to be used for 
    // for other methods. There can be a separate place where the Linked List can be stored but this is a current example

    public Tips(){
        tipList = new LinkedList<>();
    }

// This method adds a node to the Tip linked List
    public void InsertTip(String tip) {
        tipList.add(tip);
        tipAmount++;
    }

//This method removes a node from the Tip
    public void DeleteTip(int key){
        tipList.remove(key);
        tipAmount--;
    }

//Currently a simplified version of the method. EditTap replaces the old version of String with the version
    public void EditTip(int key, String tip) {
        tipList.set(key, tip);
    }

// This method Generates a random tip from the Linked List Tip
    public void GenerateTip() {
        System.out.println(tipList.get((int)Math.random()*tipAmount));
    }

}