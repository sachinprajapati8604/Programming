import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class EventHandling extends Applet implements ActionListener
{
	Button b;
	public void init()
	{
		b=new Button("click");
		add(b);
		b.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
			b.setlable("Button is clicked");
		}
	}	
}