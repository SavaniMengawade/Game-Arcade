// Pratiksha Patil
import javax.swing.*;
import java.util.*;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To play the following games: \n 1. Snake Game \n 2. Brick Breaker Game \n Enter the option number.");
        int op = sc.nextInt();
        if (op == 1) {
            System.out.println("...SNAKE GAME...");
            //Creating the window with all its awesome snaky features
            Window f1 = new Window();

            //Setting up the window settings
            f1.setTitle("Snake");
            f1.setSize(700, 700);
            f1.setVisible(true);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
        else if (op == 2) {
            System.out.println("...BRICK BREAKER GAME...");
            JFrame obj=new JFrame();
            Gameplay gamePlay = new Gameplay();

            obj.setBounds(10, 10, 700, 600);
            obj.setTitle("Breakout Ball");
            obj.setResizable(true);
            obj.setVisible(true);
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj.add(gamePlay);
            obj.setVisible(true);
        }
        else {
            System.out.println("Wrong option entered!!");
        }
    }
}
