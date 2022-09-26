
/**
 * WorldCupBetServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package br.com.worldcupbet.soapworldcupbet.ws;

public class WorldCupBetServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1664214772001L;
    
    private br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument faultMessage;

    
        public WorldCupBetServiceExceptionException() {
            super("WorldCupBetServiceExceptionException");
        }

        public WorldCupBetServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public WorldCupBetServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public WorldCupBetServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument msg){
       faultMessage = msg;
    }
    
    public br.com.worldcupbet.soapworldcupbet.services.WorldCupBetServiceExceptionDocument getFaultMessage(){
       return faultMessage;
    }
}
    