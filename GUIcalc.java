import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class GUIcalc extends Frame implements WindowListener , ActionListener{
	
	Label plus, eq;
    TextField op1, op2, result;
    Button b1, b2;
	
	GUIcalc(){

        setLayout(new FlowLayout());

        op1 = new TextField(10);
        op2 = new TextField(10);
        result =  new TextField(10);
        plus = new Label("+");
        eq = new Label("=");

        b1 = new Button("OK");
        b1.addActionListener(this);

        b2 = new Button("Cancel");
        b2.addActionListener(this);

        add(op1);
        add(plus);
        add(op2);
        add(eq);
        add(result);
        add(b1);
        add(b2);
        

		addWindowListener(this);
		setSize(500, 500);
		setVisible(true);
	}

   
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    public void windowClosed(WindowEvent e) { 
        
    }
    public void windowIconified(WindowEvent e) {
    }
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {
        
       
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == b1){

            String val1 = op1.getText();
            int int_val1 = Integer.parseInt(val1);

            String val2 = op2.getText();
            int int_val2 = Integer.parseInt(val2);

            int res = int_val1 + int_val2;
            String out = String.valueOf(res);
            result.setText(out);

        }else
            System.exit(0);

    }
    public static void main(String[] args){
    
        new GUIcalc();
    
    }



}