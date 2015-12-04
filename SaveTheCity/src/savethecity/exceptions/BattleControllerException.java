/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity.exceptions;

/**
 *
 * @author alicia
 */
public class BattleControllerException extends Exception{
    

    public BattleControllerException() {
    }

    public BattleControllerException(String message) {
        super(message);
    }

    public BattleControllerException(String message, Throwable cause) {
        super(message, cause);
    }

    public BattleControllerException(Throwable cause) {
        super(cause);
    }

    public BattleControllerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    
    }
}   
}
