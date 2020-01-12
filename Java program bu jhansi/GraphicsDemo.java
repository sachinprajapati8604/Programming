import java.awt.event.*;
import java.awt.*;
public class GraphicsDemo extends frame
{
	// Anonymous inner class to handle window close events.
	addWindowListener (new WindowAdapter(){
		public void windowClosing(WindowEvent we){
		
			System exit(0);
			 
	});
}
public void paint (Graphics G)
{
	g.drawLines(20,40,100,90);
	g.drawLines(20,90,100,40);
	g.drawLines(40,45,250,80);
	
}
public static void main(String bu[])
{
	GraphicsDemo appwin =new GraphicsDemo();
	appwin.setSize(new Dimension(370,700));
	appwin.setTitle("GraphicsDemo");
	appwin.setVisible(true);
}
	
}