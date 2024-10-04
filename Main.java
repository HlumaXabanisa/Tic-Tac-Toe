import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JPanel {
	private Image back;
	public Main(){
		back=new ImageIcon("image2.jpg").getImage();
	}


	@Override 
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(back!=null){
			g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
			
		}
	} 

	public static void main(String[] args) {

		GamePanel game= new GamePanel();
		Main pic =new Main();



		JFrame f=new JFrame("Tic Tac Toe"); 


		JButton startButton=new JButton("Start");  
		JButton exitButton =new JButton("Quit");


		startButton.setBounds(350,400,100,30);  
		exitButton.setBounds(350,600,100,30);

		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		//startButton.setBorder( null );
		startButton.setFont(new Font("Piccolo", Font.BOLD, 40));
		startButton.setForeground(Color.CYAN);

		exitButton.setOpaque(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false);
		//exitButton.setBorder( null );
		exitButton.setFont(new Font("Piccolo", Font.BOLD, 40));
		exitButton.setForeground(Color.YELLOW);

		



		f.add(startButton);  
		f.add(exitButton);
		f.setSize(400*2,400*2);  
		f.setLayout(null);  
		f.setVisible(true);   
		f.add(pic);
		
	}

}
