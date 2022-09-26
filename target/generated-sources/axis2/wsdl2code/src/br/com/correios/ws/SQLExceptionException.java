
/**
 * SQLExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package br.com.correios.ws;

public class SQLExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1664223718644L;
    
    private br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument faultMessage;

    
        public SQLExceptionException() {
            super("SQLExceptionException");
        }

        public SQLExceptionException(java.lang.String s) {
           super(s);
        }

        public SQLExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SQLExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument msg){
       faultMessage = msg;
    }
    
    public br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument getFaultMessage(){
       return faultMessage;
    }
}
    