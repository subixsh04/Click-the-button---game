
//Name: Subiksha Vaidhyanathan
//CS1181 Project 2

//The goal of this game is to click more buttons within the time limit to score more points.

import javax.swing.*;
import java.awt.*;

public class Intro {

    //This frame shows the instructions for the player on how to play the game
    public Intro() {
    JFrame frame = new JFrame("Click the Button");

    JPanel Panel = new JPanel(); // A panel is created so that the contents to be displayed on the frame could be created and added to the frame.
    Panel.setLayout(new BoxLayout(Panel, BoxLayout.Y_AXIS)); 

    JLabel instr = new JLabel("\n");
    Panel.add(instr);
    JLabel instruc = new JLabel("Instructions");
    instruc.setForeground(Color.black);
    instruc.setFont(new Font("Arial", Font.BOLD,17));
    Panel.add(instruc);
    JLabel instruc1 = new JLabel("A frame of buttons with images of shapes would appear.");
    instruc1.setForeground(Color.BLUE);
    instruc1.setFont(new Font("Arial", Font.ITALIC,15));
    Panel.add(instruc1);
    JLabel instruc2 = new JLabel("As you click the images the images dissappear.");
    instruc2.setForeground(Color.BLUE);
    instruc2.setFont(new Font("Arial", Font.ITALIC,15));
    Panel.add(instruc2);
    JLabel instruc3 = new JLabel("You recieve a point for clicking every image.");
    instruc3.setForeground(Color.BLUE);
    instruc3.setFont(new Font("Arial", Font.ITALIC,15));
    Panel.add(instruc3);
    JLabel instruc4 = new JLabel("The game ends automatically in 10 seconds.");
    instruc4.setForeground(Color.BLUE);
    instruc4.setFont(new Font("Arial", Font.ITALIC,15));
    Panel.add(instruc4);
    JLabel instruc5 = new JLabel("The faster you click more number of images, the more points you gain.");
    instruc5.setForeground(Color.BLUE);
    instruc5.setFont(new Font("Arial", Font.ITALIC,15));
    Panel.add(instruc5);
    JLabel instruc6 = new JLabel("\n");
    Panel.add(instruc6);
    JLabel instruc7 = new JLabel("Click Start to begin the Game!!");
    instruc7.setForeground(Color.RED);
    instruc7.setFont(new Font("Arial", Font.BOLD,17));
    Panel.add(instruc7);

    JButton start = new JButton("Start"); //A button is created so that as the player clicks the buttn, it directs to the game.
    start.setBackground(Color.YELLOW);
    start.setFont(new Font("Arial", 3, 15));
    start.setPreferredSize(new Dimension(90, 40));
    start.setMaximumSize(start.getPreferredSize());;
    start.addActionListener(e -> {
        Main game = new Main(); //Calls main method so that the frame with the image button appears to begin the game

    });
    Panel.add(start);
    
    //Adding the contents to the frame and making it visible so that the users could view it.
    frame.setContentPane(Panel);
    frame.setSize(550,400 ); 
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Intro();
    }
}
