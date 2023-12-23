import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class gui {
    public static void main(String args[]) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                try {
                    File myObj2 = new File("filename.txt");
                    if (myObj2.createNewFile()) {
                        System.out.println("File created: " + myObj2.getName());
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Creating the Frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);




        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JPanel panel2 = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Service/Name");
        JLabel label2 = new JLabel("Password/Content");
        String helpme = String.valueOf(label.getAccessibleContext());
        JTextField tf = new JTextField(20); // accepts upto 10 characters
        JTextField tf2 = new JTextField(20); // accepts upto 10 characters
        JToggleButton send = new JToggleButton("Send");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel2.add(label2);
        panel2.add(tf2);
        panel.add(send);
        if (send.getModel().isPressed()) {
            System.out.print(helpme);

        }

        // Text Area at the Center
        JTextArea ta = new JTextArea();
        ta.append("Yes");
        ta.setEditable(false);


        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.PAGE_END, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);

        send.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {

                String text = tf.getText();
                System.out.print(text);
            }
        });

    }
}