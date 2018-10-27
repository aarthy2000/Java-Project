import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
public class ShowGridLayout extends JFrame {
	public ShowGridLayout() {
		setLayout(new GridLayout(5, 1, 2, 2));
		add(new JLabel("Enter number of Fans"));
		String fans = JOptionPane.showInputDialog(
				"Enter no of fans present");
		System.out.println("fans present");
		System.out.println(Integer.parseInt(fans));
		add(new JLabel("Enter number of Tubelights"));
		add(new JLabel("Enter number of ACs"));
		add(new JLabel("Enter number of Fridges"));
		add(new JLabel("Enter number of Units consumed"));
		add(new JRadioButton("Domestic"));
		add(new JRadioButton("Commercial"));

	}
}
