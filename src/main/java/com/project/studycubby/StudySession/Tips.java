package com.project.studycubby.studysession;

import java.util.*;

public class Tips{
    //This is the initializer of the Tips class setting up the Linked List to be used for 
    // for other methods. There can be a separate place where the Linked List can be stored but this is a current example

    public Tips(){
        LinkedList<String> Tip
            = new LinkedList<>(); 

    }
// This method adds a node to the Tip linked List
    public void InsertTip(String tip) {
        Tip.add(String);
    }
//This method removes a node from the Tip
    public void DeleteTip(int key){
        Tip.remove(key);
    }
//Currently a simplified version of the method. EditTap replaces the old version of String with the version
    public void EditTip(int key,String tip) {

        Tip.set(key,String);
    }
// This method Generates a random tip from the Linked List Tip
    public void GenerateTip() {
        System.out.println(Tip(Math.random()));
    }

}