import javax.swing.JFrame;

public class Fenetre extends JFrame{
      
	ConteneurFenetre pan;
	public Fenetre() {
		super();
		propFenetre();
	}
	private void propFenetre() {
		this.setSize(420,380);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		pan = new ConteneurFenetre();
		this.setContentPane(pan);
	}
}
