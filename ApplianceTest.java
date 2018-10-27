import java.util.*;
import javax.swing.*;

public class ApplianceTest
{
	public static void main(String[] args)
	{
		ShowGridLayout frame = new ShowGridLayout();
		frame.setTitle("GridLayout");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
