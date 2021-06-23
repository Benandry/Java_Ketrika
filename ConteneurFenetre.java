import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConteneurFenetre extends JPanel implements ActionListener,MouseListener,KeyListener{
	
	private JLabel etiquette;
	private  JButton bouton;
	private JTextField champText;
	private JLabel imageLbl;
	private ImageIcon iconPhoto;
	
	public ConteneurFenetre() {
		super();
		this.propConteneur();
	}
	
	private void propConteneur() {
		this.setLayout(null);
		this.propEtiquette();
		this.propBouton();
		this.propChamp(); 
		this.afficheImage();
		this.addMouseListener(this);
		this.addKeyListener(this);
		this.setFocusable(true);
		this.requestFocusInWindow();
	} 
	
	private void propEtiquette() {
		etiquette = new JLabel();
		this.etiquette.setBounds(20, 30, 250, 20);
		this.etiquette.setText("Le titre de la fenetra ");
		this.add(etiquette);
	}
	
	private void propBouton() {
		bouton = new JButton();
		this.bouton.setBounds(20, 60, 90, 20);
		this.bouton.setText(" Appuyer ");
		this.add(bouton);
		this.bouton.addActionListener(this);
	}
	private void propChamp() {
		champText = new JTextField();
		this.champText.setBounds(130, 60, 90, 20);
		this.add(champText);
		this.champText.addActionListener(this);
	}
	
	private void afficheImage() {
		imageLbl = new JLabel();
		iconPhoto = new ImageIcon("Image/Image32.png");
		this.imageLbl.setBounds(250, 50, 64, 64);
		this.imageLbl.setIcon(iconPhoto);
		this.add(imageLbl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.bouton) {
			this.etiquette.setText("Bravo vous etes appuyer la boutton");
		}else {
			this.etiquette.setText(this.champText.getText());
		}
		this.requestFocusInWindow();
	}
	

	public void mouseReleased(MouseEvent e) {
		this.imageLbl.setBounds(e.getX(), e.getY(), this.imageLbl.getWidth(), this.imageLbl.getHeight());
		this.etiquette.setText("Le position de la souris est : "+e.getX()+ " , "+e.getY());
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.imageLbl.setBounds(this.imageLbl.getX(), this.imageLbl.getY() - 10, this.imageLbl.getWidth(), this.imageLbl.getHeight());
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.imageLbl.setBounds(this.imageLbl.getX(), this.imageLbl.getY() + 10, this.imageLbl.getWidth(), this.imageLbl.getHeight());
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.imageLbl.setBounds(this.imageLbl.getX() - 10, this.imageLbl.getY(), this.imageLbl.getWidth(), this.imageLbl.getHeight());
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.imageLbl.setBounds(this.imageLbl.getX() + 10 , this.imageLbl.getY(), this.imageLbl.getWidth(), this.imageLbl.getHeight());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
