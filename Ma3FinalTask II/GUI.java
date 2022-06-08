import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    
    private int width;
    private int height;
    private String[] section = {"BSIT", "BSEMC", "MSIT"};

    private JFrame main_Frame;

    private JRadioButton first_rButton;
    private JRadioButton second_rButton;
    private JRadioButton third_rButton;

    private JLabel first_Label;
    private JLabel second_Label;

    private JTextField first_JTextField;
    private JPasswordField first_JPasswordField;

    private JButton first_JButton;
    private JButton second_JButton;

    private JComboBox<String> first_ComboBox;

    public GUI(int w, int h) { 
        main_Frame = new JFrame();

        first_rButton = new JRadioButton("BSIT");
        second_rButton = new JRadioButton("BSEMC");
        third_rButton = new JRadioButton("MSIT");
        first_rButton.setForeground(Color.WHITE);
        second_rButton.setForeground(Color.WHITE);
        third_rButton.setForeground(Color.WHITE);
        first_rButton.setBackground(Color.DARK_GRAY);
        second_rButton.setBackground(Color.DARK_GRAY);
        third_rButton.setBackground(Color.DARK_GRAY);

        ButtonGroup group = new ButtonGroup();
        group.add(first_rButton);
        group.add(second_rButton);
        group.add(third_rButton);

        first_Label = new JLabel("Hello GUI");
        second_Label = new JLabel("This is a Java Swing Program");
        first_Label.setForeground(Color.WHITE);
        second_Label.setForeground(Color.WHITE);

        first_JTextField = new JTextField(5);
        first_JPasswordField = new JPasswordField(5);

        first_JButton = new JButton("RED TEAM");
        second_JButton = new JButton("BLUE TEAM");

        first_JButton.setBackground(Color.red);
        second_JButton.setBackground(Color.blue);
        first_JButton.setForeground(Color.white);
        second_JButton.setForeground(Color.white);
        Dimension d = new Dimension(100,50);
        first_JButton.setPreferredSize(d);
        second_JButton.setPreferredSize(d);

        first_ComboBox = new JComboBox<>(section);

        width = w;
        height = h; 
    }

    public void main_Frame() {
        Container content = main_Frame.getContentPane(); 
        FlowLayout flow = new FlowLayout();
        main_Frame.getContentPane().setBackground(Color.DARK_GRAY); 
        main_Frame.setSize(width, height);
		main_Frame.setTitle("Hello GUI");
        content.setLayout(flow);

        content.add(first_rButton);
        content.add(second_rButton);
        content.add(third_rButton);

        content.add(first_Label);
        content.add(first_JTextField);
        content.add(first_JPasswordField);
        content.add(second_Label);

        content.add(first_JButton);
        content.add(second_JButton);

        content.add(first_ComboBox);

        main_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_Frame.setVisible(true);
        main_Frame.setLocationRelativeTo(null);
    }

    public void button_Listeners() {
        ActionListener button_Listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Object button_Choice = ae.getSource();

                if(button_Choice == first_rButton) {
                    System.out.println("BSIT");
                } else if(button_Choice == second_rButton) {
                    System.out.println("BSEMC");
                } else if(button_Choice == third_rButton) {
                    System.out.println("MSIT");
                }
            }
        };
        first_rButton.addActionListener(button_Listener);
        second_rButton.addActionListener(button_Listener);
        third_rButton.addActionListener(button_Listener);
    }
}
