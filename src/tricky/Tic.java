package com.mycompany.tictac;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.WindowConstants;
import java.util.Scanner;

public class Tic extends JFrame {

    
    private JPanel panelBotones;
    
    public Tic(int filas, int columnas) {
        initComponents(filas, columnas);
    }
    
    private void initComponents(int filas, int columnas) {

        panelBotones = new JPanel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout(2, 0));
        
        panelBotones.setLayout(new GridLayout(filas, columnas, 2, 2));

        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {
                
                JButton boton = new JButton();
                boton.setText(i + " " + j);
                panelBotones.add(boton);
            }
        }
        
        getContentPane().add(panelBotones, BorderLayout.SOUTH);
        setTitle("TicTac");
        pack();
        setVisible(true);
    }

    
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese las Filas: \n");
        int filas = input.nextInt();
        
        System.out.print("Ingrese las Filas: \n");
        int columnas = input.nextInt();
        Tic v = new Tic(filas, columnas);
    }
}