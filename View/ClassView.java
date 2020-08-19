package View;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.BddModel;



/**
 * Cette classe permet l'affichage du classement des meilleurs scores
 * @author Hymed
 *
 */

public class ClassView extends JFrame {
	ResultSet result;
	PreparedStatement ps;
	ResultSet rs;
	private JFrame frame;
	private JLabel lblTitre = new JLabel("Game Center");
	private JSeparator separator = new JSeparator();
	DefaultTableModel model = new DefaultTableModel();
	JTable jtbl = new JTable(model);
	
	/*
	 * Ce constructeur appel la méthode classement pour l'initialiser
	 */
	public ClassView() {
		
		classement(result);
	}

	/**
	 * Cette méthode met en place l'interface graphique
	 * @param result2 
	 */
	public void classement(ResultSet result2 ) {
				

		this.setForeground(new Color(255, 102, 0));
		this.setTitle("Game Center Classement");
		this.getContentPane().setBackground(Color.WHITE);
		this.setBounds(100, 100, 766, 561);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.getContentPane().setLayout(null);
		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
     
		separator.setForeground(new Color(255, 102, 0));
		separator.setBounds(10, 80, 639, 15);
		this.getContentPane().add(separator);
			
	        model.addColumn("Pseudo");
	        model.addColumn("Score");
		
		try {
			
			PreparedStatement pstm = BddModel.getConnection().prepareStatement("SELECT Pseudo, Score FROM classement ORDER BY Score DESC LIMIT 5");
            ResultSet Rs = pstm.executeQuery();
            while(Rs.next()){
                model.addRow(new Object[]{ Rs.getString(1),Rs.getInt(2)});
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jtbl.setEnabled(false);
		jtbl.setForeground(new Color(255, 102, 0));
		jtbl.setBackground(new Color(255, 255, 255));
		JScrollPane pg = new JScrollPane(jtbl);
        getContentPane().add(pg);
        this.pack();
		
		lblTitre.setBackground(new Color(255, 102, 0));
		lblTitre.setForeground(new Color(255, 102, 0));
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblTitre.setBounds(214, 11, 226, 33);
		this.getContentPane().add(lblTitre);
		
		
	}
}
