/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author Pip
 */
public class NameFormatNullException extends IllegalArgumentException {

    private String msg = "Name cannot be null";

    public String getMessage() {
        return msg;
    }
    
    public NameFormatNullException() {
    }

    /**
     * Constructs an instance of <code>NameFormatNullException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NameFormatNullException(String msg) {
        
    }
}
