import javax.swing.*;

public class Frame
{
    public static void main (String[] args)
    {
        JButton jbtOK = new JButton ("OK");                                             // Creates a button with test OK
        JButton jbtCancel = new JButton ("Cancel");                                 // Creats a cancel button
        JLabel jlblName = new JLabel (" ");                 //  Creates a label with the respective text
        JTextField jtfName = new JTextField (10);     // Creates a text field with the respective text
        JCheckBox jchkBold = new JCheckBox ("Bold");                        // Creates a check boc wth the text bold
        JCheckBox jchkItalic = new JCheckBox ("Italic");
        JRadioButton jrbYellow = new JRadioButton ("Yellow");               // Creates a radio button with text Yellow
        JRadioButton jrbRed = new JRadioButton  ("Red");                        // Creates a radio Button with text Red
        JComboBox<String> jcboColor = new JComboBox<String> (new String[] {"Freshman", "Sophomore", "Junior", "Senior"});
        JPanel panel = new JPanel ();                                                           // Creates a panel to group components
        panel.add (jbtOK);                                                                          // Add the OK button to the panel
        panel.add (jbtCancel);                                                                      // Add the Cancel button to the panel
        panel.add (jlblName);                                                                       // Add the lable to the panel
        panel.add (jtfName);
	JPanel jpanel=new JPanel();
        jpanel.add (jchkBold);
        jpanel.add (jchkItalic);
        jpanel.add (jrbRed);
        jpanel.add (jrbYellow);
        jpanel.add (jcboColor);

        JFrame frame = new JFrame ();
        frame.add (panel);
	panel.add(jpanel);
        frame.setTitle ("Show GUI Components");
        frame.setSize (450,100);
        frame.setLocation (200, 100);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
	System.out.println(jtfName.getText());
     }
}
