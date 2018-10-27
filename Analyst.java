import java.awt.event.*;
import java.awt.*;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Analyst extends JFrame {
	public Analyst(){
		JFrame frame =new JFrame();
		frame.pack();
		frame.setTitle("Electricity Bill Mate");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		// Crea// year, loan amount, monthly payment, and total payment		
		String []options={"12 am to 6 am","6 am to 12noon ","12 noon to 6 pm","6 pm to 12 am","12 hours in a day","24 hours in  a day"};
		JPanel fan=new JPanel(new FlowLayout(FlowLayout.RIGHT));

		JComboBox f=new JComboBox(options);	
		fan.add(new JLabel("How long ,on an approximate , a fan of your home runs ?"));
		fan.add(f);
		JPanel tl=new JPanel(new FlowLayout(FlowLayout.RIGHT));

		JComboBox t=new JComboBox(options);	
		tl.add(new JLabel("How long ,on an approximate , a tubelight of your home is operated ?"));
		tl.add(f);
		JPanel fri=new JPanel(new FlowLayout(FlowLayout.RIGHT));

		JComboBox fr=new JComboBox(options);	
		fri.add(new JLabel("How long ,on an approximate , a fridge of your home is operated ?"));
		fri.add(f);
		JPanel ac=new JPanel(new FlowLayout(FlowLayout.RIGHT));

		JComboBox a=new JComboBox(options);	
		ac.add(new JLabel("How long ,on an approximate , an Air Conditioner of your home is operated ?"));
		ac.add(a);
		JLabel label=new JLabel("Analyse and suggest changes ");

		// Create a Compute Payment button
		JButton ok = new JButton("Fit into budget");
		JButton reset = new JButton("Reset");

		// Panel p1 to hold labels and text fields
		//JPanel p1 = new JPanel(new );
		//p1.setBorder(new
				//TitledBorder("Analyser"));
		// Panel p2 to hold the button
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(ok);
		p2.add(reset);
		// Add the panels to the frame
		add(fan,BorderLayout.EAST);
		add(fr,BorderLayout.EAST);
		add(t,BorderLayout.CENTER);
		add(a,BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		// Register listener
		ok.addActionListener(new ButtonListener());
		reset.addActionListener(new ButtonListener());
		}
		private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
		// Get values from text fields

		Object obj=e.getSource();
		if(obj==reset)
		{
		//f,t,fr,a
		f.setSelectedIndex(-1);
		t.setSelectedIndex(-1);
		fr.setSelectedIndex(-1);
		a.setSelectedIndex(-1);


		}
		else if(obj==ok)
		{	
			int fan=f.getSelectedIndex();
			int t=t.getSelectedIndex();
			//int fr=fr.getSelectedIndex();
			int ac=a.getSelectedIndex();
			if((t==2)||(t==3))
			{
				JLabel info=new JLabel("Tubelights are being operated during day .This could be avoided .A tubelight,on an average consumes 20 watts per hour");

				float avg_cost=(((20.0*6.0)/1000.0)*30);
				String tube_save="You could save "+toString(avg_cost)+"with tubelights by avoiding it on day";
			}
			if((t==5)||(fan==5)||(ac==5)||(fr==5))
			{
				String total_save="Avoid running your appliances all day long";
			}
			if(fan==ac)
			{
				String total_save="Avoid running AC and fans simulataneously , as and when possible";
			}
			String frid="Defrost your fridge often to save energy and increase performance";						String save=total_save+frid;
			JOptionPane.showMessageDialog(null,save);

		}
		}
		}
}

