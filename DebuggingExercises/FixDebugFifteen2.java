// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;

public class FixDebugFifteen2 extends JFrame
{
   JButton west = new JButton("Left    ");
   JButton south = new JButton("Down  ");
   JButton east = new JButton("Right ");
   JButton center = new JButton("Center  ");
   JButton north = new JButton("Up");
   Container con = null;

   public FixDebugFifteen2()
   {
      con = this.getContentPane();
      con.setLayout(new BorderLayout());

       con.add(west, BorderLayout.WEST);
       con.add(south, BorderLayout.SOUTH);
       con.add(east, BorderLayout.EAST);
       con.add(center, BorderLayout.CENTER);
       con.add(north, BorderLayout.NORTH);
   }
   public static void main(String[] args)
   {
      FixDebugFifteen2 f = new FixDebugFifteen2();
      f.setSize(300, 300);
      f.setVisible(true);
   }
}