package crypto_db;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harshada
 */
public class EncryDecry {

public char retEncrypt(char ch,int key)
{

    if(ch >= 'a' && ch <= 'z')
    {
	            ch = (char)(ch + key);
	            
	            if(ch > 'z'){
	                ch = (char)(ch - 'z' + 'a' - 1);
	            }
	            return ch;
    }
    else if(ch >= 'A' && ch <= 'Z')
    {
	            ch = (char)(ch + key);
	            
	            if(ch > 'Z'){
	                ch = (char)(ch - 'Z' + 'A' - 1);
	            }
	            return ch;
    }
    else 
    {
	        	return ch;
    }
	              
}

public char retDecrypt(char ch,int key)
{
 
    if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch - key);
	            
	            if(ch < 'a'){
	                ch = (char)(ch + 'z' - 'a' + 1);
	            }
	            
	            return ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch - key);
	            
	            if(ch < 'A'){
	                ch = (char)(ch + 'Z' - 'A' + 1);
	            }
	            
	            return ch;
	        }
	        else {
	        	return ch;
	        }

}



}
