import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JColorFrame extends JFrame implements ActionListener
    {
        JButton center = new JButton("Change color");
        JPanel north = new JPanel();
        JPanel south = new JPanel();
        JPanel east = new JPanel();
        JPanel west = new JPanel();

        JPanel[] areas = new JPanel[]{north, south, east, west};
        Color[] colors = new Color[]{Color.RED, Color.BLUE, Color.YELLOW, Color.PINK, Color.ORANGE, Color.CYAN};

        Container con = null;

   public JColorFrame ()
        {
            con = this.getContentPane();
            con.setLayout(new BorderLayout());


            con.add(center, BorderLayout.CENTER);
            center.addActionListener(this);

            con.add(west, BorderLayout.WEST);
            con.add(south, BorderLayout.SOUTH);
            con.add(east, BorderLayout.EAST);
            con.add(north, BorderLayout.NORTH);

            west.setPreferredSize(new Dimension(100, 100));
            south.setPreferredSize(new Dimension(100, 100));
            east.setPreferredSize(new Dimension(100, 100));
            north.setPreferredSize(new Dimension(100, 100));
        }
        public static void main(String[] args)
        {
            JColorFrame f = new JColorFrame();
            f.setSize(400, 400);
            f.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Random rand = new Random();
            int panel = rand.nextInt(4);
            int color = rand.nextInt(6);
            areas[panel].setBackground(colors[color]);
        }
    }
