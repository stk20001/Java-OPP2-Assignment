package Search;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GraphicInterface extends JFrame {
	
	public static Container c;
	
	// Constructors
	
	GraphicInterface(String title){
		
		// Set frame and panel.
		
		super(title);
		setBounds(100,100,700,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = this.getContentPane();
		c.setLayout(null);
		
		// Set buttons.
		
		JButton Textfile1 = new JButton("Read,Add,Delete");
		JButton Textfile2 = new JButton("Search Files");
		JButton	Textfile3 = new JButton("Strongest Match");

		// Button location.
		
		Textfile1.setBounds(50,100,150,50);
		Textfile2.setBounds(250,100,150,50);
		Textfile3.setBounds(450,100,150,50);

		// Add to panel.
		
		c.add(Textfile1);
		c.add(Textfile2);
		c.add(Textfile3);

		// Read, add, delete.
		
		Textfile1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if(e.getSource()==Textfile1) {
            		 
            	SearchTextFile1 thefile = new SearchTextFile1();
        		
            	}
            }
     
		});// End ActionPerfomed()
		
		// Search Files.
		
		Textfile2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if(e.getSource()==Textfile2) {
            		 
            	SearchTextFile2 thefile = new SearchTextFile2();
        		
            	}// end if
            }
     
		});// End ActionPerfomed()
		
		// Strongest Match.

		Textfile3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if(e.getSource()==Textfile3) {
            		 
            	SearchTextFile3 thefile = new SearchTextFile3();
        		
            	}// end if
            }
     
		});// End ActionPerfomed()
		
	}// End Constructor

}// End GraphicInterface Class
