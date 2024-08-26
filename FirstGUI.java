import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JComboBox;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;


class FirstGUI extends Frame implements WindowListener{
	
	
	Button b1, b2;
	Panel P;
	Label l;
	JComboBox<String> cB;
	FirstGUI(){
		
		l = new Label();
		setLayout(new FlowLayout());
		P = new Panel();

		b1 = new Button("ok");
		b2 = new Button("Cancel");
		
		add(new TextField("Bye world"));
	 
		add(new Label("ram ram"));
	
		add(b1);
		add(b2);

		add(new TextArea("What!", 5, 40));
		P.add(new Label("Choose any"));

		String[] options = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5"};
        	cB = new JComboBox<>(options);

		add(cB);
		add(P);	
		
		
		setSize(500, 500);
		setVisible(true);
	}

    public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){System.exit(0);}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	

	public static void main(String[] args){

		new FirstGUI();
	}
}