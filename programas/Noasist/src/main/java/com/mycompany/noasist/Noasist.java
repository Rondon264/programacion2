/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.noasist;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Noasist extends JFrame implements ActionListener{
    JLabel L1;
     JLabel L2;
    JTextField T1;
     JTextField T2;
    JButton B1;
    public static void main(String[] args) {
        Noasist perro=new Noasist();
    }
public Noasist(){
    setBounds(100, 100, 200, 500);
    setLayout(new FlowLayout());
   L1= new JLabel("cuantso perros va a pasear?");
   add(L1);
   T1=new JTextField(10);
   add(T1);
   L2= new JLabel("cuantas horas los va a pasear?");
   add(L2);
   T2=new JTextField(10);
   add(T2);
   B1=new JButton("calcular");
   add(B1);
   B1.addActionListener(this);
   
   
    setVisible(true);
}
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
     int x =Integer.parseInt(T1.getText());
     int y =Integer.parseInt(T2.getText());
     int[] tamano = new int [x]; 
        for (int i = 0; i < x; i++) {
             String sizeInput = JOptionPane.showInputDialog(this, "tamaño de los perros que va a pasear " + (i + 1) + "\n1) Grande\n2) Mediano\n3) Pequeño");
            tamano[i] = Integer.parseInt(sizeInput);
        }
        int valor=calculos(tamano,y);
        JOptionPane.showMessageDialog(null, "el valor a pagar es:"+valor);
    }                                        

    public static int calculos(int[] perro,int y) {
        int costo=0;
        for (int i = 0; i < perro.length; i++) {
            if (perro[i] == 1) {
                costo += (10000 * y);
            } else if (perro[i] == 2) {
                costo += (5000 * y);
            } else if (perro[i] == 3) {
                costo += (3000 * y);
            }
        }
        if (perro.length > 1) {
            double descuento = costo * 0.10;
            costo -= descuento;
        }
        return costo;
    }
}
