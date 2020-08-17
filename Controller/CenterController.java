package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.CenterView;
import serpent.Snake;


public class CenterController {

	private CenterView centerView;
	
	public CenterController(CenterView centerView) {
		
		this.centerView = centerView;
		
		this.centerView.SnakeListener(new SnackListener());
		
		
	}
	
	class SnackListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			 Snake panel = new Snake();
			 panel.main(null);
			 panel.setVisible(true);
			
		}	
	}
	
	
}
