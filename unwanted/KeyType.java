import java.awt.*;  
import java.awt.event.*;  
public class KeyType extends Frame implements KeyListener{  
    Label l;  
    TextArea area;  
    KeyType(){  
       // setLayout(FlowLayout.LEFT,10,20); 
        l=new Label();  
        l.setBounds(20,50,200,20);  
        area=new TextArea();  
        area.setBounds(20,80,300, 300);  
        area.addKeyListener(this);  
          
        add(l);
	add(area);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) {}  
    public void keyReleased(KeyEvent e) {  
        String text=area.getText();  
        String words[]=text.split("\\s");  
        l.setText("Words: "+words.length+" Characters:"+text.length());  
    }  
    public void keyTyped(KeyEvent e) {}  
  
    public static void main(String[] args) {  
        KeyType key=new KeyType();  
    }  
}  
