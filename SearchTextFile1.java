package Search;

import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SearchTextFile1 implements ActionListener{
	
	  
	JButton b1;	// Search file.
	JButton b2; // Add word.
	JButton b3; // Remove word.
	  
	JTextField t1;
	JLabel l; 
	JFrame f;
	  
	  // Constructor
	@SuppressWarnings("deprecation")
	
	public SearchTextFile1() {
		
		    // main class 
		 
		    // create a new frame to store text field and button 
	        f = new JFrame("Text file one"); 
	  
	        // create a label to display text 
	        l = new JLabel("Enter word to search for, add or delete from the file."); 
	  
	        // create a new buttons 
	        b1 = new JButton("Search"); 
	        b1.addActionListener(this);
	        
	        b2 = new JButton("Write to file");
	        b2.addActionListener(this);
	        
	        b3 = new JButton("Delete word");
	        b3.addActionListener(this);
	        
	        t1 = new JTextField(50);
	        t1.addActionListener(this);
	        
	        // create a panel to add buttons 
	        JPanel p = new JPanel(); 
	  
	        // add buttons and text field to panel 
	        p.add(b1);
	        p.add(b2);
	        p.add(b3);
	        p.add(l); 
	        p.add(t1);

	        // add panel to frame 
	        f.add(p); 
	  
	        // set the size of frame 
	        f.setSize(500, 200); 
	  
	        f.show(); 
	
	} // End Constructor
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		// Search word in file.
		
		if (e.getSource() == b1)
		{
			
			String Uinput = t1.getText();	// Takes user input in text field.
			
			if(Uinput.isEmpty()){
				JOptionPane.showMessageDialog(null, "No word entered.");	// Error if no word is entered.
			}
			
			else{	// Start search.
			
			JOptionPane.showMessageDialog(null, "You searched for " + "- " + Uinput + " -" + " in file 1:");
			
			File f1 = new File("Textfile1.txt");
			
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
			
			String input = Uinput;
			
			int count = 0;	// Word counter for found words.
			
			try{
				
				while((s=br.readLine())!=null){
					
						words=s.split(" ");
					
					for (String word : words){
						
							if (word.equals(input)){	
								
							count++;
							}				
						}
					
					}			
				} 
			
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
	
			// Output results to user.
			
			if(count == 1){
				JOptionPane.showMessageDialog(null, "The word " + "- " + Uinput + " -" + " in file 1, the word was found: " + count +  " one time.");
				}
			
			if(count > 1){
					JOptionPane.showMessageDialog(null, "The word " + "- " + Uinput + " -" + " is in file 1, the word was found: " + count +  " times.");
				}
			
			if(count == 0){				
					JOptionPane.showMessageDialog(null, "The word " + "- " + Uinput + " -" + " is not present in the file.");
				}
			
			try {
		    	 fr.close();
		     	}
		     
			catch (IOException e1){
		    	 	// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "An error occurred."); // Error for try catch.
		    	 	e1.printStackTrace();
		    	 	}
			
			} // End else.
			
		} // End search file 1.
		      
////////////////////////////// End search //////////////////////////////
		
		// Add word to file.
	
		if	(e.getSource() == b2) {
		
		String Uinput = t1.getText();  // word to be added.
		
		if(Uinput.isEmpty()){
			JOptionPane.showMessageDialog(null, "No word entered.");	// Error if no word found.
		}
		
		else{
				// Write to file.
			  try{  
				
				  BufferedWriter buffWriter = null;
	
				  buffWriter = new BufferedWriter(new FileWriter(new File("Textfile1.txt"),true));
				  buffWriter.newLine();
				  buffWriter.write(Uinput);
			    
				  JOptionPane.showMessageDialog(null, "Word added to file.");
			 
				  buffWriter.close();
			    } 
		   
			  catch (IOException e2){
				// TODO Auto-generated catch block
			   JOptionPane.showMessageDialog(null, "An error occurred.");  // Error for try catch.
			   e2.printStackTrace();
			   }

			}	// End else.
		
		}   // End write to file.
				
	
////////////////////////////// End add word to file //////////////////////////////
	
	
	// help taken from here https://stackoverflow.com/questions/42035929/remove-a-specific-line-from-text-file?rq=1
	
	// Delete word from file.
	
		if	(e.getSource() == b3) {
		
		String Uinput = t1.getText();
		
		if(Uinput.isEmpty()){
			JOptionPane.showMessageDialog(null, "No word entered.");	// Error if no word entered.
			}
		
		else{

			String inFileName = "Textfile1.txt";	// Read text file.
			String outFileName = "Tempfile.txt";	// New file to write to.
			String Remove = Uinput;
		
		try{
			
		    File inFile = new File(inFileName);
		    File outFile = new File(outFileName);
		    
		    try (BufferedReader reader = new BufferedReader(new FileReader(inFile));
		         BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))){

		        String line = null;
		       
		        while ((line = reader.readLine()) != null){
		            
		        	if (!line.equals(Remove)){
		                writer.write(line);
		                writer.newLine();
		            	}
		        	}
		        
		        JOptionPane.showMessageDialog(null, "Word deleted.");
		   
		    	} 
		 
		    // Delete the original file
		    
		    if (inFile.delete()) {
		    	
		    // Rename the output file to the input file
		    	
		    if (!outFile.renameTo(inFile)){
		    	throw new IOException("Could not rename " + outFileName + " to " + inFileName);
		        	}
		    	} 
		    
		    else{
		        throw new IOException("Could not delete original input file " + inFileName);
		       }
			
			} 
		
			catch (IOException ex) {
		    // Handle any exceptions
		    ex.printStackTrace();
		    }
		
		  } // End Else.
		
		} // End If.
	
	} // End Method.
	
////////////////////////////// End delete word from file //////////////////////////////
	
} // END class SearchFile1.

		
		
		
		
		
	
	



