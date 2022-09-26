
/**
 * SigepClienteExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package br.com.correios.ws;

public class SigepClienteExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1664223718659L;
    
    private br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument faultMessage;

    
        public SigepClienteExceptionException() {
            super("SigepClienteExceptionException");
        }

        public SigepClienteExceptionException(java.lang.String s) {
           super(s);
        }

        public SigepClienteExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SigepClienteExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument msg){
       faultMessage = msg;
    }
    
    public br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument getFaultMessage(){
       return faultMessage;
    }
}
    