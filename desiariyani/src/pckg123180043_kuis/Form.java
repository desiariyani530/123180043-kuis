
package pckg123180043_kuis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 
public class Form extends JFrame{
    JLabel lnim,lnama,lmatkul1,lmatkul2,lnilai1,lnilai2;
    JTextField txnim,txnama,txmatkul1,txmatkul2,txnilai1,txnilai2;
    JButton convert;
    Statement statement;
    
    public void mhsnilai (){
        
        setTitle("From Pengisian Mahasiswa");
        
        lnim = new JLabel("NIM");
        lnama = new JLabel("Nama");        
        lmatkul1 = new JLabel("Matkul 1");
        lmatkul2 = new JLabel("Matkul 2");
        lnilai1 = new JLabel("Nilai 1");
        lnilai2 = new JLabel("Nilai 2");
        
        txnim = new JTextField("");
        txnama = new JTextField("");
        txmatkul1 = new JTextField("");
        txmatkul2 = new JTextField("");
        txnilai1 = new JTextField("");
        txnilai2 = new JTextField("");
        
        convert = new JButton("Convert");
        
        
        setLayout(null);
        add(lnim);
        add(lnama);
        add(lmatkul1);
        add(lmatkul2);
        add(lnilai1);
        add(lnilai2);
        add(txnim);
        add(txnama);
        add(txmatkul1);
        add(txmatkul2);
        add(txnilai1);
        add(txnilai2);
        add(convert);
        
        lnim.setBounds(75, 50, 30, 20);
        lnama.setBounds(75, 75, 50, 20);
        lmatkul1.setBounds(75, 100, 50, 20);
        lnilai1.setBounds(75, 125, 50, 20);
        lmatkul2.setBounds(75, 150, 50, 20);
        lnilai2.setBounds(75, 175, 50, 20);
        txnim.setBounds(150, 50, 150, 20);
        txnama.setBounds(150, 75, 150, 20);
        txmatkul1.setBounds(150, 100, 150, 20);
        txnilai1.setBounds(150, 125, 150, 20);
        txmatkul2.setBounds(150, 150, 150, 20);
        txnilai2.setBounds(150, 175, 150, 20);
        convert.setBounds(150, 230, 100, 20);
        
        setSize(400,500); 
       
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                int a1 =  Integer.parseInt(txnim.getText());
                String a2 = txnama.getText();
                String a3 = txmatkul1.getText();
                int a4 =  Integer.parseInt(txnilai1.getText());
                String a5 = txmatkul2.getText();
                int a6 =  Integer.parseInt(txnilai2.getText());
               
                Database con = new Database();
                    try {
                        statement = con.getDatabase().createStatement();
                        //perintah insert
                        statement.executeUpdate("INSERT INTO datanilai VALUES ('" 
                                + a1 + "','" + a2 + "','" + a3 + "','" + a4 + "','" + a5 + "','" + a6 + "','" +"')");
                        JOptionPane.showMessageDialog(rootPane, "Data Tersimpan");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    int nilai=0;
                Hitung rata=new Hitung();
               nilai= a4+a6;
                System.out.println("NIM = "+a1);
                System.out.println("Nama = "+a2);
                System.out.println("Matkul 1 = "+a3);
                System.out.println("Matkul 2 = "+a5);
                System.out.println("Rata2 = "+rata.rata(nilai));
                System.out.println("Nilai Huruf = "+rata.nilaihuruf(nilai));
                    
                } catch (NumberFormatException ex) {
                 JOptionPane.showMessageDialog(rootPane,"TIPE DATA SALAH");
                } catch (Error ext){
                 JOptionPane.showMessageDialog(rootPane,"SALAH");
                 
                }
          
            }
            
        });
    }
}
