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
public class NameFormatUnderThreeException extends IllegalArgumentException {

    private String msg = "Name cannot less than 3 characters";

    public String getMessage() {
        return msg;
    }
    
    public NameFormatUnderThreeException() {
    }

    /**
     * Constructs an instance of <code>NameFormatUnderThreeException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public NameFormatUnderThreeException(String msg) {
    }
}
