import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMovieFrame extends JFrame implements ActionListener
{
    JButton north = new JButton("The Spy Gone North  ");
    JButton south = new JButton("South Wind  ");
    JButton east = new JButton("The East ");
    JButton west = new JButton("Wild Wild West  ");
    JButton center = new JButton("Journey to the Center of the Earth");

    Container con = null;

    public JMovieFrame()
    {
        setTitle("JMovieFrame");
        con = this.getContentPane();
        con.setLayout(new BorderLayout());

        con.add(north, BorderLayout.NORTH);
        con.add(south, BorderLayout.SOUTH);
        con.add(east, BorderLayout.EAST);
        con.add(west, BorderLayout.WEST);
        con.add(center, BorderLayout.CENTER);

        east.addActionListener(this);
        center.addActionListener(this);
        west.addActionListener(this);
        north.addActionListener(this);
        south.addActionListener(this);
    }
    public static void main(String[] args)
    {
        JMovieFrame f = new JMovieFrame();
        f.setSize(500, 300);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == north)
        {
            north.setText("2018, Jung-min Hwang");
        }
        else
        if(source == south)
        {
            south.setText("2018, Milos Bikovic");
        }
        else
        if(source == east)
        {
            east.setText("2013, Brit Marling");
        }
        else
        if(source == west)
        {
            west.setText("1999, Will Smith");
        }
        else
        {
            center.setText("2008, Josh Hutcherson");
        }
    }
}