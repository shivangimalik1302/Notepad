import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;

public class notepad extends JFrame implements ActionListener
{
	JTextArea txtarea=new JTextArea();
	JScrollPane scroll=new JScrollPane(txtarea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JFrame f=new JFrame();
	JMenuBar mb=new JMenuBar();

	JMenu file=new JMenu("File");
	JMenu edit=new JMenu("Edit");
	JMenu format=new JMenu("Format");
	JMenu help=new JMenu("Help");

	JMenuItem m1=new JMenuItem("New   Ctrl + N");
	JMenuItem m2=new JMenuItem("Open    Ctrl + O");
	JMenuItem m3=new JMenuItem("Save    Ctrl + S");
	JMenuItem m4=new JMenuItem("Exit");


	JMenuItem e2=new JMenuItem("Copy    Ctrl + C");
	JMenuItem e3=new JMenuItem("Paste    Ctrl + V");
	JMenuItem e4=new JMenuItem("Cut    Ctrl + X");
	JMenuItem e5=new JMenuItem("Delete    Del");
	JMenuItem e6=new JMenuItem("Select All    Ctrl + A");


	JMenuItem f1=new JMenuItem("Zoom In");
	JMenuItem f2=new JMenuItem("Zoom Out");

	JMenuItem h1=new JMenuItem("View");
	JMenuItem h2=new JMenuItem("Give Feedback");

	notepad()
	{
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);

		e2.addActionListener(this);
		e3.addActionListener(this);
		e4.addActionListener(this);
		e5.addActionListener(this);
		e6.addActionListener(this);

		f1.addActionListener(this);
		f2.addActionListener(this);

		h1.addActionListener(this);
		h2.addActionListener(this);

		scroll.setSize(995,995);
		f.setJMenuBar(mb);
		f.setTitle("notepad");
		Font fn=new Font("Arial",Font.PLAIN,50);
		f.setSize(1000,1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.add(scroll);
		txtarea.setFont(fn);
		txtarea.setLineWrap(true);
		txtarea.setWrapStyleWord(true);
		mb.add(file);
		mb.add(edit);
		mb.add(format);

		mb.add(help);

		file.add(m1);
		file.add(m2);
		file.add(m3);
		file.add(m4);


		edit.add(e2);
		edit.add(e3);
		edit.add(e4);
		edit.add(e5);
		edit.add(e6);

		format.add(f1);
		format.add(f2);

		help.add(h1);
		help.add(h2);


	}

	

	public void actionPerformed(ActionEvent e) 
    {
		if(e.getSource().equals(m1))
		{
			//			JOptionPane.showMessageDialog(null,"My new is working");
			f.setTitle("New Document.txt");
			txtarea.setText("");
		}
        
		if(e.getSource().equals(m2)) {
			JFileChooser open = new JFileChooser(); 
			int option = open.showOpenDialog(this);
		}
        
		else if (e.getSource().equals(m3)) 
        {
			JFileChooser save = new JFileChooser();
			int option = save.showSaveDialog(this);
		}

		if (e.getSource().equals(m4))
			f.dispose();  


		if(e.getSource()==e4)  
			txtarea.cut(); 
            
		if(e.getSource()==e3)  
			txtarea.paste();
            
		if(e.getSource()==e2)  
			txtarea.copy();
            
		if(e.getSource()==e6)  
			txtarea.selectAll(); 
            
		if(e.getSource()==e5)
			txtarea.removeAll();

		if(e.getSource() ==f1) 
		{
			Font fn=new Font("Arial",Font.PLAIN,100);
			txtarea.setFont(fn);
		}
		
		if(e.getSource() ==f2) 
		{
			Font fn=new Font("Arial",Font.PLAIN,25);
			txtarea.setFont(fn);
		}
		
		if(e.getSource()==h1)
		{
			try 
			{
				Desktop.getDesktop().browse(new URI("https://www.google.com/search?sxsrf=ACYBGNT1PeX4X2xyDAbsktWLK7Y_f7VAeg%3A1579956956635&source=hp&ei=3DosXtHbI8X49QPXjZ3IDA&q=get+help+with+notepad+in+windows+10&oq=get+help+with+notepad+in+windows+10&gs_l=psy-ab.3..0.351.351..740...1.0..0.182.182.0j1......0....2j1..gws-wiz.Wn8Z4-OBtyA&ved=0ahUKEwjRuaGp5p7nAhVFfH0KHddGB8kQ4dUDCAY&uact=5"));
			} 
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}

		if(e.getSource()==h2)
		{
			try {
				Desktop.getDesktop().browse(new URI("https://notepad.pw/login/Feedback"));
			} catch (Exception e1) {

			} 

		}
	}
    public static void main(String s[])
	{
		notepad d1=new notepad();
	}
}
