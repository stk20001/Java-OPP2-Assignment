package Search;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchTextFile3 implements ActionListener {


	JButton b1; // Search all files.
	
	// counter attributes 
	int countFile1, countFile2, countFile3;


	JTextField t1;
	JLabel l; 
	JFrame f;
	
	  // Constructor
	@SuppressWarnings("deprecation")
	
	public SearchTextFile3() {
		
		    // main class 
		 
		    // create a new frame to store text field and button
		
	        f = new JFrame("Search Files"); 
	  
	        // create a label to display text 
	        
	        l = new JLabel("Enter word to find the strongest match."); 
	       
	        b1 = new JButton("Results.");
	        b1.addActionListener(this);
	        
	        t1 = new JTextField(50);
	        t1.addActionListener(this);
	        
	        // create a panel to add buttons 
	        
	        JPanel p = new JPanel(); 
	  
	        // add buttons and text field to panel 
	        
	        p.add(b1);
	        p.add(l); 
	        p.add(t1);

	        // add panel to frame 
	        
	        f.add(p); 
	  
	        // set the size of frame 
	        
	        f.setSize(500, 200); 
	  
	        f.show();   
	        
} // end constructor 
	
	// Search all files in one go. 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == b1)
		{
			
			String Uinput = t1.getText();
			
			if(Uinput.isEmpty())
			{
				JOptionPane.showMessageDialog(null, "No word entered.");
			}
			
			else
			{
			
			File f1 = new File("TheHungerGames.txt");
			
			String[] words = null;

			FileReader fr = null;
			try {
				fr = new FileReader(f1);
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			BufferedReader br = new BufferedReader(fr);
			
			String s;
			
			String input= Uinput;
			
			countFile1=0;
			
			try {
				while((s=br.readLine())!=null)
					{
						words=s.split(" ");
					
					for (String word : words)
						{
							if (word.equals(input))
						{							
							countFile1++;
						}				
					}
					
					}			
				} 
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			 }
			
			} // End Else.
			
} // End search file 1.
		      
////////////////////////////// End search 1 //////////////////////////////

		if (e.getSource() == b1)
		{
			
			String Uinput = t1.getText();
			
			
			File f1 = new File("Mockingjay.txt");
			
			String[] words = null;

			FileReader fr = null;
			try {
				fr = new FileReader(f1);
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			BufferedReader br = new BufferedReader(fr);
			
			String s;
			
			String input= Uinput;
			
			countFile2 = 0;
			
			try {
				while((s=br.readLine())!=null)
					{
						words=s.split(" ");
					
					for (String word : words)
						{
							if (word.equals(input))
						{							
							countFile2++;
						}				
					}
					
					}			
				} 

			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
} // End search file 1.
		      
////////////////////////////// End search 2 //////////////////////////////

		if (e.getSource() == b1){
			
			String Uinput = t1.getText();
			
			File f1 = new File("CatchingFire.txt");
			
			String[] words = null;

			FileReader fr = null;
			
			try {
				fr = new FileReader(f1);
			} 
			
			catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
				}
			
			BufferedReader br = new BufferedReader(fr);
			
			String s;
			
			String input = Uinput;
			
			countFile3 = 0;
			
			try{
				
				while((s=br.readLine())!=null){
					
						words=s.split(" ");
					
					for (String word : words){
						
							if (word.equals(input))
						{							
							countFile3++;
						}				
					  }
					
					}			
				}
			
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

} // End search file 3.
		      
		
		
////////////////////////////// End search 3  //////////////////////////////
	
		// Output to user on what file contained the word searched for. 
	
		if(countFile1 > countFile2 & countFile1 > countFile3) {
			JOptionPane.showMessageDialog(null, "File 1 contains the searched word the most. With " + countFile1 + " contents. File 2 had " + countFile2 + " results and file3 had " + countFile3);
		}
		
		else if(countFile2 > countFile1 & countFile2 > countFile3) {
			JOptionPane.showMessageDialog(null, "File 2 contains the searched word the most. With " + countFile2 + " contents. File 1 had " + countFile1 + " results and file3 had " + countFile3);
		}
		
		else if(countFile3 > countFile1 & countFile3 > countFile2) {
			JOptionPane.showMessageDialog(null, "File 3 contains the searched word the most. With " + countFile3 + " contents. File 1 had " + countFile1 + " results and file 2 had " + countFile2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}	

}
