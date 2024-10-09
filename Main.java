import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    private int count = 0;

    public Main() {
        JFrame frame = new JFrame("Click the Button"); 

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,6)); //Creates a grid layout for the buttons

        //Stores the images of different shapes in an array
        String[] images = {"img1.png", "img2.png","img3.png","img4.png","img5.png","img6.png","img7.png","img8.png","img9.png",
            "img10.png","img11.png","img12.png","img13.png","img14.png","img15.png","img16.png","img17.png","img18.png"};

        ArrayList<String> imagePath = new ArrayList<>();
        for (int i=0; i<images.length; i++) {
            imagePath.add(images[i]);
        }
        Collections.shuffle(imagePath); // Shuffles the images everytime the program runs
        for(int i = 0; i < 36; i ++){
            JButton button = new JButton(new ImageIcon(imagePath.get(i % 18))); // New buttons are created and an image is displayed on the button
            if(i == 18) {
                Collections.shuffle(imagePath);
            }
            button.addActionListener(e ->{ // Every time a button is pressed the count increases and also the button disappears
                count++;
                button.setVisible(false);; 
                
            });
            panel.add(button);
        }

        //As this game is a time based task, a timer is created. 

        Timer gameTime = new Timer();
        TimerTask task = new TimerTask() { //The task is to delay in display the final score of the player
            public void run() {
               //This frame displays that the gae ends and displays the score of the player
                JFrame frame = new JFrame("Click the Button");
    
                JPanel panel = new JPanel(); 
                panel.setLayout(new BorderLayout(0,0));
    
                JLabel label = new JLabel();
                label.setText("<html>GAME ENDS!!<br>Score of Player is " + count + "</br></html>");
                label.setForeground(Color.RED); //Setting the color of the text Displayed.
                label.setFont(new Font("Times New Roman", Font.ITALIC,25)); //Setting the font, style and size of the text
                label.setHorizontalAlignment(label.CENTER); //Assigning the alignment of the text 
                panel.add(label, BorderLayout.CENTER);
    
                //Adding the contents of the final score card to the frame and making it visible so that the users could view it.     
                frame.setContentPane(panel); 
                frame.getContentPane().setBackground(Color.CYAN);; //Setting the background of the Frame
                frame.setSize(800,800 ); 
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                frame.setVisible(true);
    
    
            }
        };

        gameTime.schedule(task, 10 * 1000); //Delays the task by 10 seconds so that they player has 10 seconds to play the game.
       
        //Adding the contents of the main panel which displays the shapes buttons to the frame and making it visible so that users could view it.
        frame.getContentPane().add(panel); 
        frame.setSize(800,800 ); 
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);
    } 

}
