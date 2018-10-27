import java.awt.event.*;
import java.awt.*;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Analysis extends JFrame {

	//private	JFrame frame =new JFrame();
	/*frame.pack();
	  frame.setTitle("Electricity Bill Mate");
	  frame.setLocationRelativeTo(null); // Center the frame
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setVisible(true);*/

	// Crea// year, loan amount, monthly payment, and total payment		
	private String []options={"Select Time ","12 am to 6 am","6 am to 12noon ","12 noon to 6 pm","6 pm to 12 am","12 hours in a day","24 hours in  a day"};
	private JPanel data=new JPanel(new GridLayout(8,1));

	private JComboBox f=new JComboBox(options);	
	//private JPanel tl=new JPanel(new GridLayout(2,2));

	private JComboBox t=new JComboBox(options);	
	//private JPanel fri=new JPanel(new GridLayout(2,2));

	private JComboBox fr=new JComboBox(options);	
	//private JPanel ac=new JPanel(new GridLayout(2,2));

	private JComboBox a=new JComboBox(options);	
	private JLabel label=new JLabel("Analyse and suggest changes ");

	// Create a Compute Payment button
	private JButton ok = new JButton("Fit into budget");
	private JButton reset = new JButton("Reset");

	// Panel p1 to hold labels and text fields
	//JPanel p1 = new JPanel(new );
	//p1.setBorder(new
	//TitledBorder("Analyser"));
	// Panel p2 to hold the button
	private JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	// Register listener
	public Analysis()
	{
		data.add(new JLabel("How long ,on an approximate , a fan of your home runs ?"));
		data.add(f);
		data.add(new JLabel("How long ,on an approximate , a tubelight of your home is operated ?"));
		data.add(t);
		data.add(new JLabel("How long ,on an approximate , a fridge of your home is operated ?"));
		data.add(fr);
		data.add(new JLabel("How long ,on an approximate , an Air Conditioner of your home is operated ?"));
		data.add(a);
		p2.add(ok);
		p2.add(reset);
		// Add the panels to the frame
		add(data,BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		add(label,BorderLayout.NORTH);
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
				f.setSelectedIndex(0);
				t.setSelectedIndex(0);
				fr.setSelectedIndex(0);
				a.setSelectedIndex(0);


			}
			else if(obj==ok)
			{	String total_save=new String("");
				int fan=f.getSelectedIndex();
				int tube=t.getSelectedIndex();
				//int fr=fr.getSelectedIndex();
				int ac=a.getSelectedIndex();
				if((tube==3)||(tube==4))
				{
					JLabel info=new JLabel("Tubelights are being operated during day .This could be avoided .A tubelight,on an average consumes 20 watts per hour");

					float avg_cost=(float)(((20.0*6.0)/1000.0)*30.0);
					total_save+="You could save Rupees"+String.valueOf(avg_cost)+" per month with tubelights by avoiding it on day";
				}
				if((tube==6)||(fan==6)||(ac==6))
				{
					total_save=total_save+"\nAvoid running your appliances all day long";
				}
				if(fan==ac)
				{
					total_save=total_save+"\nAvoid running AC and fans simulataneously , as and when possible";
				}
				String frid="\nDefrost your fridge often to save energy and increase performance";						String save=total_save+frid;
				JOptionPane.showMessageDialog(null,save);

			}
		}
	}
}

