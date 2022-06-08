import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    
    private int width;
    private int height;

    private JFrame main_Frame;

    private JLabel label_Input;
    private JButton button;
    private JLabel label_Average;

    private double grade_1;
    private double grade_2;
    private double grade_3;
    private double grade_4;
    private double grade_5;
    private double average; 

    private JTextField input_Grade1;
    private JTextField input_Grade2; 
    private JTextField input_Grade3;
    private JTextField input_Grade4;
    private JTextField input_Grade5;

    private String text_Grade1;
    private String text_Grade2;
    private String text_Grade3;
    private String text_Grade4;
    private String text_Grade5;

    public GUI(int w, int h) {
        main_Frame = new JFrame();
        label_Input = new JLabel("Input Grades");
        label_Average = new JLabel("[Average]");
        input_Grade1 = new JTextField("Math", 15);
        input_Grade2 = new JTextField("Science", 15);
        input_Grade3 = new JTextField("English", 15);
        input_Grade4 = new JTextField("Filipino", 15);
        input_Grade5 = new JTextField("P.E.", 15);
        button = new JButton("Average Grades");

        width = w;
        height = h;
    }

    public void main_Frame() {
        Container content = main_Frame.getContentPane();
        FlowLayout flow = new FlowLayout();
        main_Frame.setSize(width, height);
		main_Frame.setTitle("Get Average");
        content.setLayout(flow);

        content.add(label_Input);
        content.add(input_Grade1);
        content.add(input_Grade2);
        content.add(input_Grade3);
        content.add(input_Grade4);
        content.add(input_Grade5);
        content.add(button);
        content.add(label_Average);

        main_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_Frame.setVisible(true);
        main_Frame.setLocationRelativeTo(null);

    }

    public void button_Listeners() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Object button_Choice = ae.getSource();

                text_Grade1 = input_Grade1.getText();
                grade_1 = Double.parseDouble(text_Grade1);
                text_Grade2 = input_Grade2.getText();
                grade_2 = Double.parseDouble(text_Grade2);
                text_Grade3 = input_Grade3.getText();
                grade_3 = Double.parseDouble(text_Grade3);
                text_Grade4 = input_Grade4.getText();
                grade_4 = Double.parseDouble(text_Grade4);
                text_Grade5 = input_Grade5.getText();
                grade_5 = Double.parseDouble(text_Grade5);

                average = (grade_1 + grade_2 + grade_3 + grade_4 + grade_5) / 5;

                if (button_Choice == button) {   
                    if (grade_1 < 1 || grade_1 > 5) {
                        label_Average.setText("Invalid input");
                    } else if (grade_1 < 1 || grade_1 > 5) {
                        label_Average.setText("Invalid input");
                    }   else if (grade_2 < 1 || grade_2 > 5) {
                        label_Average.setText("Invalid input");
                    }   else if (grade_3 < 1 || grade_3 > 5) {
                        label_Average.setText("Invalid input");
                    }   else if (grade_4 < 1 || grade_4 > 5) {
                        label_Average.setText("Invalid input");
                    } else if (grade_5 < 1 || grade_5 > 5) {
                        label_Average.setText("Invalid input");
                    } else {
                        label_Average.setText("Average Grade: " + (Double.toString(average)));
                    }
                } 
            }
         };
         button.addActionListener(buttonListener);
    }

}
