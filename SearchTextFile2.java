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
import javax.swing.JToggleButton;




public class SearchTextFile2 implements ActionListener {


	JToggleButton b1;	// Search file 1.
	JToggleButton b2;   // Search file 2.
	JToggleButton b3;   // Search file 3.
	JButton b4; // Search all files.
	
	// counter attributes 
	
	int countFile1, countFile2, countFile3;

	JTextField t1;
	JLabel l; 
	JFrame f;
	
	// Constructor
	
	@SuppressWarnings("deprecation")
	
	public SearchTextFile2() {
		
		    // main class 
		 
		    // create a new frame to store text field and button
		
	        f = new JFrame("Search Files"); 
	  
	        // create a label to display text
	        
	        l = new JLabel("Enter word to search for, select file to search and then press results."); 
	  
	        // create a new buttons
	        
			b1 = new JToggleButton("Search file 1."); 
	        b1.addActionListener(this);
	        
	        b2 = new JToggleButton("Search file 2.");
	        b2.addActionListener(this);
	        
	        b3 = new JToggleButton("Search file 3.");
	        b3.addActionListener(this);
	        
	        b4 = new JButton("Results.");
	        b4.addActionListener(this);
	        
	        t1 = new JTextField(50);
	        t1.addActionListener(this);
	        
	        // create a panel to add buttons 
	        
	        JPanel p = new JPanel(); 
	  
	        // add buttons and text field to panel 
	        
	        p.add(b1);
	        p.add(b2);
	        p.add(b3);
	        p.add(b4);
	        p.add(l); 
	        p.add(t1);

	        // add panel to frame
	        
	        f.add(p); 
	  
	        // set the size of frame
	        
	        f.setSize(500, 200); 
	  
	        f.show(); 
	          
	} // end constructor 
	

	// Search file 1.
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			
			if (e.getSource() == b1)
			{
				
				String Uinput = t1.getText(); // User input into text field. 
				
				if(Uinput.isEmpty()){
					
						JOptionPane.showMessageDialog(null, "No word entered."); // Error if no word is entered.
						b1.setSelected(false);
					}
				
				// Search file.
				
				else{
					
					File f1 = new File("TheHungerGames.txt");
				
					String[] words = null;

					FileReader fr = null;
				
				try{
					
					fr = new FileReader(f1);
					} 
				
				catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
					}
				
					BufferedReader br = new BufferedReader(fr);
				
					String s;
				
					String input= Uinput;
				
					countFile1 = 0; // Count for words found.
				
				try{
					
				while((s=br.readLine())!=null){
					
					words=s.split(" ");
						
				for(String word : words){
								
					if (word.equals(input)){
						
								countFile1++;
							}				
						}
						
					  }			
					} 
				
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					}
				
				} // End Else/
				
			} // End search file 1.
			
			      
////////////////////////////// End search 1 //////////////////////////////

			// Search file two.
			
			if(e.getSource() == b2){
				
				String Uinput = t1.getText(); // User input.
				
				if(Uinput.isEmpty()){
					
					JOptionPane.showMessageDialog(null, "No word entered."); // Error message.
					b2.setSelected(false);
					}
				
				// Search file.
				
				else{
				
				File f1 = new File("Mockingjay.txt");
				
				String[] words = null;

				FileReader fr = null;
				
				try{
					fr = new FileReader(f1);}
				
				catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				BufferedReader br = new BufferedReader(fr);
				
				String s;
				
				String input= Uinput;
				
				countFile2 = 0; // Count for words found.
				
				try{
					while((s=br.readLine())!=null){
						
							words=s.split(" ");
						
					for(String word : words){
							if (word.equals(input)){
								
								countFile2++;
							}				
						  }
						
						}			
					} 
				
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					}

				  }
				
				
			} // End search file 1.
			      
	////////////////////////////// End search 2 //////////////////////////////

			// Search file 3.
			
			if (e.getSource() == b3){
				
				String Uinput = t1.getText(); // User input.
				 
				if(Uinput.isEmpty()){
					JOptionPane.showMessageDialog(null, "No word entered."); // Error no word entered.
					b3.setSelected(false);
					}
				
				// Search file.
				
				else{
				
					File f1 = new File("CatchingFire.txt");
				
					String[] words = null;

					FileReader fr = null;
				
					try{
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

				} // End Else.
				
			} // End search file 3.
			      
	////////////////////////////// End search 3  //////////////////////////////

		
			// Search results.
			
			String Uinput = t1.getText();
			
			if (e.getSource() == b4){	
				
			if(Uinput.isEmpty()){
				JOptionPane.showMessageDialog(null, "No word entered.");
			}
			
			// Depending on toggles selected will change the buttonstate for the swtich method.
			
			int buttonstate = 0;
			
			if(b1.isSelected() && !b2.isSelected() && !b3.isSelected()) {
				buttonstate = 1;
				}
			
			else if(!b1.isSelected() && b2.isSelected() && !b3.isSelected()) {
				buttonstate = 2;
				}
			
			else if(!b1.isSelected() && !b2.isSelected() && b3.isSelected()) {
				buttonstate = 3;
				}
			
			else if(b1.isSelected() && b2.isSelected() && !b3.isSelected()) {
				buttonstate = 4;
				}
			
			else if(b1.isSelected() && !b2.isSelected() && b3.isSelected()) {
				buttonstate = 5;
				}
			
			else if(b1.isSelected() && b2.isSelected() && b3.isSelected()) {
				buttonstate = 6;
				}
			
			else if(!b1.isSelected() && b2.isSelected() && b3.isSelected()) {
				buttonstate = 7;
				}
			
			// Switch for output to user on word count.
			
			switch (buttonstate) {
			
			case 1:
				
				JOptionPane.showMessageDialog(null, "Searched file 1 it contains the word: " + Uinput + ", this many times: " + countFile1);
			
				break;
				
				
			case 2:
				
				JOptionPane.showMessageDialog(null, "Searched file 2 it contains the word: " + Uinput + ", this many times: " + countFile2);
				
				break;
			
			case 3:
				
				JOptionPane.showMessageDialog(null, "Searched file 3 it contains the word: " + Uinput + ", this many times: " + countFile3);
				
				break;
				
			case 4:
				
				int File1_2 = countFile1 + countFile2;  // to add word counts together.
				
				JOptionPane.showMessageDialog(null, "Searched file 1 and 2 they contain the word: " + Uinput + ", this many times: " + File1_2);
				
				break;
				
			case 5:
			
				int File1_3 = countFile1 + countFile3;	// to add word counts together.
				
				JOptionPane.showMessageDialog(null, "Searched file 1 and 3 they contain the word: " + Uinput + ", this many times: " + File1_3);
				
				break;
				
			case 6:
				
				int File1_2_3 = countFile1 + countFile2 + countFile3;	// to add word counts together.
				
				JOptionPane.showMessageDialog(null, "Searched file all files they contain the word: " + Uinput + ", this many times: " + File1_2_3);
				
				break;
				
			case 7:
				
				int File2_3 = countFile2 + countFile3;	// to add word counts together.
				
				JOptionPane.showMessageDialog(null, "Searched file 2 and 3 it contains the word: " + Uinput + ", this many times: " + File2_3);
				
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Select file first.");
				
				break;
			
			} // End switch.
			
		} // End If. 
						
	} // End method.
	
}  // End SeachTextFile 2 class.

