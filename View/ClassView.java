package View;

import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;

import Model.BddModel;
import net.proteanit.sql.DbUtils;





public class ClassView extends JFrame {
	ResultSet result;
	PreparedStatement ps;
	ResultSet rs;
	private JFrame frame;
	private JTable table;
	private JLabel lblTitre = new JLabel("Game Center");
	private JSeparator separator = new JSeparator();
	
	public ClassView() {
		setResizable(false);
		classement(result);
	}

	public void classement(ResultSet result) {
		

		this.setForeground(new Color(255, 102, 0));
		this.setTitle("Game Center Classement");
		this.getContentPane().setBackground(Color.WHITE);
		this.setBounds(100, 100, 665, 503);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		separator.setForeground(new Color(255, 102, 0));
		separator.setBounds(10, 80, 628, 15);
		this.getContentPane().add(separator);
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(73, 91, 299, 97);	
		
		try {
			String sql = "SELECT * FROM classement ORDER BY Score DESC; ";
			ps = BddModel.getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(result));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.getContentPane().add(table);	
		
		lblTitre.setBackground(new Color(255, 102, 0));
		lblTitre.setForeground(new Color(255, 102, 0));
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblTitre.setBounds(214, 11, 226, 33);
		this.getContentPane().add(lblTitre);
	}


}
