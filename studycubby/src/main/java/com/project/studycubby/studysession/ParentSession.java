package com.project.studycubby.studysession;

import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * ParentSession initializes the startSession, startBreak and endSession functions in order to 
 * send users to a study session for a specified period of time.
*/

public class ParentSession implements StudySession
{

    protected int sessionLength;
    protected int breakAmount;
    protected int blockLength;
    protected int breakLength;
    protected boolean isStudying = true;
    protected boolean sessionGoing = true;
    JFrame frame;


    /*
    * A method that will start the study session by calling a StudySessionTimer object.
    *
    * the timer will count down from blockLength time (minutes) with breakAmount number of breaks (startBreak). After 
    * each break, another blockLength timer will count down. When there are no more breaks, call one more startSession 
    * and then endSession.
    *
    * Developed by: Jayme E.
    */

    public void startSession() 
    {
        isStudying = true;
        userNotification();
        System.out.println("Time to work!");
        System.out.println("You have " + blockLength/60 + " minutes");
        //new StudySessionTimer(blockLength, this, frame, isStudying); //actual timer declaration to be used
        new StudySessionTimer(15, this, frame, isStudying); //For use in displaying the functionality of the prototype (presentation)

    }

    //A method that starts a break by calling a StudySessionTimer object
    //Developed by Jayme E.
    public void startBreak() 
    {
        isStudying = false;
        userNotification();
        System.out.println("Time for a break...");
        System.out.println("You have " + breakLength/60 + " minutes");

        breakAmount--;
        //new StudySessionTimer(breakLength, this, frame); //actual timer declaration to be used
        new StudySessionTimer(5, this, frame); //For use in displaying the functionality of the prototype (presentation)
    }

    //A method to signal the end of the study session
    //Developed by Jayme E.
    public void endSession() 
    {
        sessionGoing = false;
        userNotification();
        System.out.println("You're all done!");
        System.out.println("This session has ended.");
    }

    //A method that creates desktop notifications in order to notify the user of when a study/break blocks begins
    //Developed by: LaSean S.
    public void userNotification() 
    {

        System.setProperty("java.awt.headless", "false");
        String message;
        String header;

        if(isStudying && sessionGoing) 
        {
            message = "Your study time has begun! You will have " + blockLength/60 + " minutes.";
            header = "Are you ready?";
        }

        else if(!sessionGoing) 
        {
            message = "This session has ended. You may close the Study Session window.";
            header = "Good work! You're all done.";
        }

        else 
        {
            message = "It's time for a break! You will have " + breakLength/60 + " minutes.";
            header = "Take a deep breath...";
        }

        //Code for notification display based off of code developed by Harsh Raval (javacodegeeks.com).
        frame = new JFrame();
        Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(scrSize.width/2 - 100, scrSize.height/2 - 100);
        frame.setSize(300,125);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0f;
        constraints.weighty = 1.0f;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.fill = GridBagConstraints.BOTH;
        JLabel headingLabel = new JLabel(header);
        headingLabel.setOpaque(false);
        frame.add(headingLabel, constraints);
        constraints.gridx++;
        constraints.weightx = 0f;
        constraints.weighty = 0f;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTH;
        JButton closeButton = new JButton();
        closeButton.setMargin(new Insets(1, 4, 1, 4));
        closeButton.setFocusable(false);
        frame.add(closeButton, constraints);
        constraints.gridx = 0;
        constraints.gridy++;
        constraints.weightx = 1.0f;
        constraints.weighty = 1.0f;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.fill = GridBagConstraints.BOTH;
        JLabel messageLabel = new JLabel("<HtMl>"+message);
        frame.add(messageLabel, constraints);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }

    //toString method used to display session info for the user
    //Developed by: LaSean S.
    @Override
    public String toString() 
    {
        if(breakAmount == 0) 
        {
            return "You are in a " + sessionLength + " minute session.";
        }

        else if (breakAmount == 1) 
        {
            return "You are in a " + sessionLength + " minute session with " + breakAmount + " break.";
        }

        else 
        {
            return "You are in a " + sessionLength + " minute session with " + breakAmount + " breaks.";
        }
    }

}