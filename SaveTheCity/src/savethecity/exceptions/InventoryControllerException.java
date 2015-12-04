/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.exceptions;

/**
 *
 * @author willnelson
 */
public class InventoryControllerException extends Exception {
    
    public InventoryControllerException() {
    }

    public InventoryControllerException(String message) {
        super(message);
    }

    public InventoryControllerException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryControllerException(Throwable cause) {
        super(cause);
    }

    public InventoryControllerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    
    }
}
