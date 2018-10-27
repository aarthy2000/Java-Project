import javax.swing.*;
import java.util.*;

public class Tryform
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Input ");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(700,300);
		JPanel type=new JPanel();
		type.add(new JRadioButton("Domestic"));
		JPanel appliances=new JPanel();
		JLabel fans=new JLabel("Enter number of Fans ");
		
		appliances.add(fans);
		System.out.println(fans.getText());
		appliances.add(new JTextField("Enter number of Fans "));
			
		frame.add(new JLabel("Enter number of tubelights "));
		frame.add(new JTextField("Enter number of tubelights "));
		//String[] appliances={"Fan","TubeLights","AC","Fridge","Washing Machine"};
		//JComboBox<String> cb=new JComboBox<String>(appliances);
		//cb.setBounds(50,50,90,20);
		//frame.add(cb);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
