package com.project.studycubby.studysession;

import java.util.*;
import java.io.*;

public class Tips
{
    public List<String> healthTips;
    public String[] tipsArray;

    //Constructor takes the tips from the Tips.txt file and adds them to an array so they can be accessed later
    //Developed by: Jayme E.
    public Tips() throws IOException
    {
        String Tips;
        Scanner in = new Scanner(new File("Tips.txt"));
        healthTips = new ArrayList<String>();
       
        while(in.hasNextLine())
        {
            Tips = in.nextLine();
            healthTips.add(Tips);
        }
        
        in.close();
        
        tipsArray = healthTips.toArray(new String[0]);
        
    }

    //A method used to print out all of the tips in the tipsArray
    //Developed by: Jayme E.
    public void printTips() {

        for(String x : tipsArray)
        {
            System.out.println(x);
        }
    }

    public String toString() {
        return tipsArray[(int)(Math.random() * 16)];
    }

}