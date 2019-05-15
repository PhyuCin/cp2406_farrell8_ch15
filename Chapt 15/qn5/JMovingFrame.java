import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class JMovingFrame extends JFrame implements ActionListener
{
    private Container con = getContentPane();
    private final int MAX = 25;
    private JPanel[] panel = new JPanel[MAX];
    private JButton button = new JButton("Move");
    private JLabel[] movingLabel = new JLabel[MAX];
    private int x = 0, y;
    private Random rand;
    private int grid;

    public JMovingFrame()
    {
        rand = new Random();
        grid = rand.nextInt((25 - 1) + 1) + 1;

        con.setLayout(new GridLayout(5,5));
        setTitle("Moving Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.add(button);
        button.addActionListener(this);




        for(y = 0; y < MAX; ++y)
        {
            movingLabel[y] =  new JLabel("        ");
            panel[y] = new JPanel();
            con.add(panel[y]);
            panel[y].add(movingLabel[y]);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        movingLabel[grid].setText("        ");

        grid = rand.nextInt((24 - 1) + 1) + 1;
        if(x == MAX)
            x = 0;
        movingLabel[grid].setText("I'm here");
    }

    public static void main(String[] args)
    {
        JMovingFrame mFrame = new JMovingFrame();
        mFrame.setSize(400, 400);
        mFrame.setVisible(true);
    }
}