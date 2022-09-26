
/**
 * AutenticacaoExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package br.com.correios.ws;

public class AutenticacaoExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1664223718644L;
    
    private br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument faultMessage;

    
        public AutenticacaoExceptionException() {
            super("AutenticacaoExceptionException");
        }

        public AutenticacaoExceptionException(java.lang.String s) {
           super(s);
        }

        public AutenticacaoExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AutenticacaoExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument msg){
       faultMessage = msg;
    }
    
    public br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument getFaultMessage(){
       return faultMessage;
    }
}
    