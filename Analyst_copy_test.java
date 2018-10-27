import java.util.*;
import javax.swing.*;
public class Analyst_copy_test{
	public static void main(String[] args)
	{
		Analysis frame = new Analysis();
		frame.pack();
		frame.setTitle("Electricity Bill Mate");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
