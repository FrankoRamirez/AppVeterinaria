package com.mycompany.appvet.util;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Mensaje {
    
    private Mensaje() {
	}

	public static void info(Component padre, String mensaje) {
            JOptionPane.showMessageDialog(padre, mensaje, "LIBRERIA - INFORMACIÓN",
		JOptionPane.INFORMATION_MESSAGE);
	}

	public static void error(Component padre, String mensaje) {
            JOptionPane.showMessageDialog(padre, mensaje, "LIBRERIA - ERROR",
		JOptionPane.ERROR_MESSAGE);
	}
        
}
