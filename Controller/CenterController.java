package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.CenterModel;
import View.CenterView;
import serpent.Snake;


public class CenterController {

	private CenterView centerView;
	private CenterModel centerModel;
	
	public CenterController(CenterView centerView, CenterModel centerModel) {
		
		this.centerView = centerView;
		this.centerModel  = centerModel;
		this.centerView.SnakeListener(new SnackListener());
		
		
	}
	
	public void Score(int score) {
		/*String pseudo = centerView.getPseudo();
		
		this.centerModel.CenterModel(score,pseudo);*/
		System.out.println(score);
		
	}
	
	public String getPseudo() {
		
		String pseudo = centerView.getPseudo();
		return pseudo;
		
	}
	
	class SnackListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			 
			System.out.println(centerView.getPseudo());
			 Snake panel = new Snake();
			 panel.main(null);
			 panel.setVisible(true);
			
		}	
	}

	public CenterView getCenterView() {
		return centerView;
	}

	public CenterModel getCenterModel() {
		return centerModel;
	}
	
	
}
