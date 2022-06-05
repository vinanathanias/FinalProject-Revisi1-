package GUI;

import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;



public class Menu extends JFrame implements ActionListener {
	
	JLabel kodeLabel, namaLabel, hargaLabel, stokLabel, subdelLabel;
//	JFrame insertFrame;
	JTextField kodeField, namaField, hargaField, stokField;
	JButton insertButton, viewButton, updateButton, deleteButton, subinsertButton, subupdateButton, subdeleteButton, subviewButton;
	
	//======================================================
	
	JComboBox<String> namaComboBox;
	Vector<String> vnama = new Vector<>();

	public Menu() {
		setFrame();
		
		insertButton = new JButton("Insert");
		insertButton.setBounds(200, 100, 100, 30);
		insertButton.addActionListener(this);
		
		viewButton = new JButton("View");
		viewButton.setBounds(200, 150, 100, 30);
		viewButton.addActionListener(this);
		
		updateButton = new JButton("Update");
		updateButton.setBounds(200, 200, 100, 30);
		updateButton.addActionListener(this);
		
		deleteButton = new JButton("Delete");
		deleteButton.setBounds(200, 250, 100, 30);
		deleteButton.addActionListener(this);
		
		
		this.add(insertButton);
		this.add(viewButton);
		this.add(updateButton);
		this.add(deleteButton);
		this.getContentPane().setBackground(Color.decode("#f5f3b5"));
		

		
	
	}
	
	public void setFrame() {
		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(null); 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Register");
	}

	@Override

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==insertButton) {
			JFrame insertFrame = new JFrame();
			insertFrame.setSize(500,500);
			insertFrame.setVisible(true);
			insertFrame.setLayout(null); 
			insertFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			insertFrame.setLocationRelativeTo(null);
			insertFrame.setTitle("Insert Menu");
			
			//==================================================
			
			kodeLabel = new JLabel("Kode Menu : PD - ");
			kodeLabel.setBounds(100,100,150,30);
			
			kodeField = new JTextField();
			kodeField.setBounds(200, 100, 150, 30);
			insertFrame.add(kodeLabel);
			insertFrame.add(kodeField);
			
			//================================
			
			namaLabel = new JLabel("Nama Menu :");
			namaLabel.setBounds(100, 150, 150, 30);
		
			namaField = new JTextField();
			namaField.setBounds(200, 150, 150, 30);
			insertFrame.add(namaLabel);
			insertFrame.add(namaField);
			
			//==========================================
			
			hargaLabel = new JLabel("Harga Menu : Rp ");
			hargaLabel.setBounds(100,200,150,30);
			
			hargaField = new JTextField();
			hargaField.setBounds(200, 200, 150, 30);
			insertFrame.add(hargaLabel);
			insertFrame.add(hargaField);
			
			//=======================================
			
			stokLabel = new JLabel("Jumlah Stok : ");
			stokLabel.setBounds(100,250,150,30);
			
			stokField = new JTextField();
			stokField.setBounds(200, 250, 150, 30);
			insertFrame.add(stokLabel);
			insertFrame.add(stokField);
			
			//===============================
			subinsertButton = new JButton("Submit");
			subinsertButton.setBounds(200, 350, 100, 30);
			insertFrame.add(subinsertButton);
			
			//=====================================
		
			 String nama = namaField.getText();
	         String kode = kodeField.getText();
	         String harga = hargaField.getText();
	         String stok = stokField.getText();

	            if (nama.isEmpty() || kode.isEmpty() || harga.isEmpty() || stok.isEmpty()) {
	                JOptionPane.showMessageDialog(this, "Please complete the data!");
	            } else {
	                if (kode.length() != 3) {
	                    JOptionPane.showMessageDialog(this, "Please enter 3 numbers");
	                } else {
	                    JOptionPane.showMessageDialog(this, "Item succesfully added!");
	                }
	            }
			
		}
		if(e.getSource()==viewButton) {
			
			JFrame viewFrame = new JFrame();
			
			viewFrame.setSize(500,500);
			viewFrame.setVisible(true);
			viewFrame.setLayout(null);
			viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			viewFrame.setLocationRelativeTo(null);
			viewFrame.setTitle("View Menu");
			
			//============================================
			
			subviewButton = new JButton("Done");
			subviewButton.setBounds(200, 300, 100, 30);
			viewFrame.add(subviewButton);
		}
		if(e.getSource()==updateButton) {
			
			JFrame updateFrame = new JFrame();
			updateFrame.setSize(500,500);
			updateFrame.setVisible(true);
			updateFrame.setLayout(null); 
			updateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			updateFrame.setLocationRelativeTo(null);
			updateFrame.setTitle("Update Menu");
			
			//=========================================
			namaLabel = new JLabel("Nama Menu :");
			namaLabel.setBounds(100, 100, 150, 30);
		
			namaField = new JTextField();
			namaField.setBounds(200, 100, 150, 30);
			updateFrame.add(namaLabel);
			updateFrame.add(namaField);
			//==========================================
			
			hargaLabel = new JLabel("Harga Menu : Rp ");
			hargaLabel.setBounds(100,150,150,30);
			
			hargaField = new JTextField();
			hargaField.setBounds(200, 150, 150, 30);
			updateFrame.add(hargaLabel);
			updateFrame.add(hargaField);
			
			//=======================================
			
			stokLabel = new JLabel("Jumlah Stok : ");
			stokLabel.setBounds(100,200,150,30);
			
			stokField = new JTextField();
			stokField.setBounds(200, 200, 150, 30);
			updateFrame.add(stokLabel);
			updateFrame.add(stokField);
			
			//===========================================
			
			subupdateButton = new JButton("Submit");
			subupdateButton.setBounds(200, 300, 100, 30);
			updateFrame.add(subupdateButton);
			
			//================================================
		
			JOptionPane.showMessageDialog(subupdateButton,"Item succesfully updated!");
      
			
		}
		

		if(e.getSource()==deleteButton) {
			JFrame deleteFrame = new JFrame();
			deleteFrame.setSize(500,500);
			deleteFrame.setVisible(true);
			deleteFrame.setLayout(null); 
			deleteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			deleteFrame.setLocationRelativeTo(null);
			deleteFrame.setTitle("Delete Menu");
			
			//============================================
			
			kodeLabel = new JLabel("Kode Menu : PD - ");
			kodeLabel.setBounds(100,100,150,30);
			
			kodeField = new JTextField();
			kodeField.setBounds(200, 100, 150, 30);
			deleteFrame.add(kodeLabel);
			deleteFrame.add(kodeField);
			
			subdeleteButton = new JButton("Submit");
			subdeleteButton.setBounds(200, 200, 100, 30);
			deleteFrame.add(subdeleteButton);
//			deleteFrame.dispose();
			
			//============================================
			JOptionPane.showMessageDialog(this,"Item has been deleted!");
				
		}
		
		
		
	}


}
