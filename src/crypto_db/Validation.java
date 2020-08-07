/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto_db;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Harshada
 */
public class Validation {
     public void char_validation(java.awt.event.KeyEvent evt,JTextArea t)
    {
        char ch=evt.getKeyChar();
        if(!Character.isDigit(ch) || (evt.getKeyCode()==evt.VK_DELETE) || (evt.getKeyCode()==evt.VK_BACK_SPACE))
        {
            
        }
        else
        {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Please enter only characters");
        }
    }
     public void char_validation(java.awt.event.KeyEvent evt,JTextField t)
    {
        char ch=evt.getKeyChar();
        if(!Character.isDigit(ch) || (evt.getKeyCode()==evt.VK_DELETE) || (evt.getKeyCode()==evt.VK_BACK_SPACE))
        {
            
        }
        else
        {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Please enter only characters");
        }
    }
    public void num_validaion(java.awt.event.KeyEvent evt,JTextField t)
    {
        char ch=evt.getKeyChar();
        if(Character.getNumericValue(ch)==0 || Character.getNumericValue(ch)==1) 
        {
            
        }
        else if((evt.getKeyCode()==evt.VK_DELETE) || (evt.getKeyCode()==evt.VK_BACK_SPACE) ||(evt.getKeyCode()==evt.VK_ENTER))
        {
            
        }
        else
        {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Please enter only binary numbers");
        }
    }
    public void num_val(java.awt.event.KeyEvent evt,JTextField t)
    {
        char ch=evt.getKeyChar();
        if(Character.isDigit(ch)) 
        {
            
        }
        else if((evt.getKeyCode()==evt.VK_DELETE) || (evt.getKeyCode()==evt.VK_BACK_SPACE) ||(evt.getKeyCode()==evt.VK_ENTER))
        {
            
        }
        else
        {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Please enter only numbers");
        }
    }
 
     
}
