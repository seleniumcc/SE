package pack3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileCh {


	 static JButton button ;
	    static JLabel label;
	    
	    public void Work(){
	  //  super("Set Picture Into A JLabel Using JFileChooser In Java");
	    	JFrame frame = new JFrame();
	    	frame.setBounds(200, 100, 600, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			frame.setTitle("Bulk User Upload V1.0 ");
	    button = new JButton("Browse");
	    button.setBounds(300,300,100,40);
	    label = new JLabel();
	    label.setBounds(10,10,670,250);
	    frame.add(button);
	    frame.add(label);
	    
	    button.addActionListener(new ActionListener()
		{
		
			public void actionPerformed(ActionEvent e)
			{
	        
	          JFileChooser file = new JFileChooser();
	          file.setCurrentDirectory(new File(System.getProperty("user.home")));
	          //filter the files
	          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
	          file.addChoosableFileFilter(filter);
	          int result = file.showSaveDialog(null);
	           //if the user click on save in Jfilechooser
	          if(result == JFileChooser.APPROVE_OPTION){
	              File selectedFile = file.getSelectedFile();
	              String path = selectedFile.getAbsolutePath();
	             // label.setIcon(ResizeImage(path));
	              System.out.println(path);
	          }
	           //if the user click on save in Jfilechooser


	          else if(result == JFileChooser.CANCEL_OPTION){
	              System.out.println("No File Select");
	          }
	        }
	    });
	    
	    frame.setLayout(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLocationRelativeTo(null);
	    frame.setSize(700,400);
	    frame.setVisible(true);
	    }
	     
	     // Methode to resize imageIcon with the same size of a Jlabel
	    
	    
	    public static void main(String[] args){

	    	FileCh d = new FileCh();
	    	d.Work();

	    }
}
