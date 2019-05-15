import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JavaJuniorCollege extends JFrame implements ActionListener
{
    private JMenuBar mainBar = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenu campusMenu = new JMenu("Campuses");
    private JMenu majorsMenu = new JMenu("Majors");
    private JMenu activitiesMenu = new JMenu("Activities");

    private JMenuItem exit = new JMenuItem("Exit");

    private JMenuItem sg = new JMenuItem("Singapore");
    private JMenuItem aus = new JMenuItem("Australia");
    private JMenuItem sk = new JMenuItem("South Korea");

    private JMenuItem busi = new JMenuItem("Business");
    private JMenuItem it = new JMenuItem("Information Technology");
    private JMenuItem psy = new JMenuItem("Psychology");

    private JMenuItem dance = new JMenuItem("Dance Club");
    private JMenuItem music = new JMenuItem("Music Club");
    private JMenuItem basketball = new JMenuItem("Basketball Team");

    private JLabel titleLabel = new JLabel();
    private JLabel infoLabel = new JLabel();

    public JavaJuniorCollege()
    {
        setTitle("Facts about Java Junior Collage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());



        setJMenuBar(mainBar);
        mainBar.add(file);
        mainBar.add(campusMenu);
        mainBar.add(majorsMenu);
        mainBar.add(activitiesMenu);

        file.add(exit);

        campusMenu.add(sg);
        campusMenu.add(aus);
        campusMenu.add(sk);

        majorsMenu.add(busi);
        majorsMenu.add(it);
        majorsMenu.add(psy);

        activitiesMenu.add(dance);
        activitiesMenu.add(music);
        activitiesMenu.add(basketball);

        exit.addActionListener(this);

        sg.addActionListener(this);
        aus.addActionListener(this);
        sk.addActionListener(this);

        busi.addActionListener(this);
        it.addActionListener(this);
        psy.addActionListener(this);

        dance.addActionListener(this);
        music.addActionListener(this);
        basketball.addActionListener(this);

        add(titleLabel);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(infoLabel);
        infoLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        titleLabel.setText("Welcome to Java Junior Collage!");
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        String text = "  ";
        if(source == exit)
            System.exit(0);

        else if(source == sg) {
            text = "Singapore: Campus on a sunny island.";
        }
        else if(source == aus) {
            text = "Australia: Large and spacious campus.";
        }
        else if(source == sk) {
            text = "South Korea: Campus in the middle of a busy city.";
        }


        else if(source == busi) {
            text = "Bachelor of Business";
        }
        else if(source == it){
            text = "Bachelor of Information and Technology";
        }
        else if(source == psy) {
            text = "Bachelor of Psychology";
        }


        else if(source == dance) {
            text = "Dance Club: Move with the music!";
        }

        else if(source == music){
            text = "Music Club:Learn to play an instrument!";
        }

        else if(source == basketball){
            text = "Basketball Team: Time to exercise!";
        }
        
        infoLabel.setText(text);
        repaint();
    }

    public static void main(String[] args)
    {
        JavaJuniorCollege frame = new JavaJuniorCollege();
        final int WIDTH = 400;
        final int HEIGHT = 130;
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}
