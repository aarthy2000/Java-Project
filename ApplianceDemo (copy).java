import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class ApplianceDemo extends JFrame {
	private static  Formatter output;
	// Crea// year, loan amount, monthly payment, and total payment
	private JTextField name = new JTextField();
	private JTextField fans = new JTextField();
	private JTextField tubelights = new JTextField();
	private JTextField ACs = new JTextField();
	private JTextField fridges = new JTextField();
	private JTextField units = new JTextField();
	// Create a Compute Payment button
	private JButton ok = new JButton("Calculate Bill");
	private JButton smart = new JButton("Analyse");
	private JButton reset = new JButton("Reset");
	public ApplianceDemo() {
		// Panel p1 to hold labels and text fields
		JPanel p1 = new JPanel(new GridLayout(6, 2));
		p1.add(new JLabel("Enter your Name"));
		p1.add(name);
		p1.add(new JLabel("Enter number of fans"));
		p1.add(fans);
		p1.add(new JLabel("Number of tubelights"));
		p1.add(tubelights);
		p1.add(new JLabel("Enter number of ACs"));
		p1.add(ACs);
		p1.add(new JLabel("Enter number of Fridges"));
		p1.add(fridges);
		p1.add(new JLabel("Enter Units consumed"));
		p1.add(units);
		p1.setBorder(new
				TitledBorder("Enter no of the mentioned appliances"));
		// Panel p2 to hold the button
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(ok);
		p2.add(reset);
		p2.add(smart);
		// Add the panels to the frame
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		// Register listener
		ok.addActionListener(new ButtonListener());
		smart.addActionListener(new ButtonListener());
		reset.addActionListener(new ButtonListener());
	}
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// Get values from text fields
			Object obj=e.getSource();
			if(obj==reset)
			{
				name.setText("");
				fans.setText("");	
				tubelights.setText("");
				ACs.setText("");
				fridges.setText("");				
				units.setText("");				
			}
			else if(obj==ok)
			{	
				String names=name.getText();
				int fanNo=Integer.parseInt( fans.getText() );
				int tubeNo=Integer.parseInt( tubelights.getText() );
				int ACno=Integer.parseInt( ACs.getText() );
				int fridgeNo=Integer.parseInt(fridges.getText() );
				int unitConsumed=Integer.parseInt( units.getText() );
				// Create a loan object
				Appliance appliance= new Appliance(names,fanNo,tubeNo,ACno,fridgeNo,unitConsumed);
				// Display monthly payment and total payment
				appliance.calculate();
				double bill=appliance.getBill();
				String billDisplay="Your Bill is "+ String.valueOf(bill);
				JOptionPane.showMessageDialog(null,billDisplay);
				addRecords(appliance);
			}
			else if(obj==smart)
			{	
				Analysis frame = new Analysis();
				frame.pack();
				frame.setTitle("Electricity Bill Mate");
				frame.setLocationRelativeTo(null); // Center the frame
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);

			}
		}
	}
	public static void openFile()
	{
		try{
			output=new Formatter("New.txt");
		}
		catch(IOException e)
		{
			System.out.println("Error..Opening file ");
			System.exit(-1);
		}
	}
	public static void addRecords(Appliance appliance)
	{
		try
		{
			output.format("%s %d %d %d %d %d ",appliance.getName(),appliance.getFans(),appliance.getTubelights(),appliance.getAC(),appliance.getFridges(),appliance.getUnits());
		}
		catch (FormatterClosedException formatterClosedException)
		{
			System.err.println("Error writing to file. Terminating.");

		}
		catch (NoSuchElementException elementException)
		{
			System.err.println("Invalid input. Please try again.");
		}
	}
	public static void closeFile()
	{
		try
		{
			if(output!=null)
				output.close();	
		}
		catch (FormatterClosedException formatterClosedException)
		{
			System.err.println("Error writing to file. Terminating.");

		}
		catch (NoSuchElementException elementException)
		{
			System.err.println("Invalid input. Please try again.");
		}

	}

	public static void main(String[] args) {
		ApplianceDemo frame = new ApplianceDemo();
		frame.pack();
		frame.setTitle("Electricity Bill Mate");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		openFile();
		closeFile();
	}
}
