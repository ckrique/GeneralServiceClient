
/**
 * AtendeClienteServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package br.com.correios.ws;

        

        /*
        *  AtendeClienteServiceStub java implementation
        */

        
        public class AtendeClienteServiceStub extends org.apache.axis2.client.Stub
        implements AtendeClienteService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("AtendeClienteService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[41];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosAdicionaisAtivos"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlp"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "calculaTarifaServico"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaPlp"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaSeTodosObjetosCancelados"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarObjeto"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarParametrosPorDescricao"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaPagamentoNaEntrega"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterClienteAtualizacao"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaDisponibilidadeServico"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlpVariosServicos"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "geraDigitoVerificadorEtiquetas"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterEmbalagemLRS"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaEtiquetaPLP"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosValorDeclarado"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "consultaCEP"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "integrarUsuarioScol"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarDimensoesServico"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarEmbalagensPorServico"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaRemessaAgrupada"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaPLP"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[20]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusCartaoPostagem"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[21]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaModalTransporte"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[22]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaDataAtual"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[23]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaTarifaVale"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[24]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemSimultanea"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[25]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusPLP"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[26]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarServicosAdicionais"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[27]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosXServicosAdicionais"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[28]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarPedidoScol"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[29]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "bloquearObjeto"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[30]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaContrato"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[31]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaEtiquetas"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[32]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaXmlPlp"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[33]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemReversa"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[34]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaCliente"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[35]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaPagamentoEntrega"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[36]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitarPostagemScol"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[37]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicos"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[38]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterMensagemParametrizada"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[39]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaOpcoes"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[40]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "buscaServicosAdicionaisAtivos"),"br.com.correios.ws.SQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "buscaServicosAdicionaisAtivos"),"br.com.correios.ws.SQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "buscaServicosAdicionaisAtivos"),"br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicosAdicionaisAtivos"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicosAdicionaisAtivos"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicosAdicionaisAtivos"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "fechaPlp"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "fechaPlp"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "fechaPlp"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "fechaPlp"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "fechaPlp"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "fechaPlp"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "calculaTarifaServico"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "calculaTarifaServico"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "calculaTarifaServico"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "calculaTarifaServico"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "calculaTarifaServico"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "calculaTarifaServico"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","Exception"), "calculaTarifaServico"),"br.com.correios.ws.ExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","Exception"), "calculaTarifaServico"),"br.com.correios.ws.ExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","Exception"), "calculaTarifaServico"),"br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validaPlp"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validaPlp"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validaPlp"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validaPlp"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validaPlp"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validaPlp"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "VerificaSeTodosObjetosCancelados"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "VerificaSeTodosObjetosCancelados"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "VerificaSeTodosObjetosCancelados"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "cancelarObjeto"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "cancelarObjeto"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "cancelarObjeto"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "cancelarObjeto"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "cancelarObjeto"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "cancelarObjeto"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","Exception"), "cancelarObjeto"),"br.com.correios.ws.ExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","Exception"), "cancelarObjeto"),"br.com.correios.ws.ExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","Exception"), "cancelarObjeto"),"br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "atualizaPagamentoNaEntrega"),"br.com.correios.ws.SQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "atualizaPagamentoNaEntrega"),"br.com.correios.ws.SQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "atualizaPagamentoNaEntrega"),"br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "atualizaPagamentoNaEntrega"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "atualizaPagamentoNaEntrega"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "atualizaPagamentoNaEntrega"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "obterClienteAtualizacao"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "obterClienteAtualizacao"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "obterClienteAtualizacao"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "obterClienteAtualizacao"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "obterClienteAtualizacao"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "obterClienteAtualizacao"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "verificaDisponibilidadeServico"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "verificaDisponibilidadeServico"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "verificaDisponibilidadeServico"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "verificaDisponibilidadeServico"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "verificaDisponibilidadeServico"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "verificaDisponibilidadeServico"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "fechaPlpVariosServicos"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "fechaPlpVariosServicos"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "fechaPlpVariosServicos"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "fechaPlpVariosServicos"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "fechaPlpVariosServicos"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "fechaPlpVariosServicos"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "geraDigitoVerificadorEtiquetas"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "geraDigitoVerificadorEtiquetas"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "geraDigitoVerificadorEtiquetas"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "geraDigitoVerificadorEtiquetas"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "geraDigitoVerificadorEtiquetas"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "geraDigitoVerificadorEtiquetas"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "obterEmbalagemLRS"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "obterEmbalagemLRS"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "obterEmbalagemLRS"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validaEtiquetaPLP"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validaEtiquetaPLP"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validaEtiquetaPLP"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validaEtiquetaPLP"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validaEtiquetaPLP"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validaEtiquetaPLP"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "buscaServicosValorDeclarado"),"br.com.correios.ws.SQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "buscaServicosValorDeclarado"),"br.com.correios.ws.SQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "buscaServicosValorDeclarado"),"br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicosValorDeclarado"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicosValorDeclarado"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicosValorDeclarado"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "consultaCEP"),"br.com.correios.ws.SQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "consultaCEP"),"br.com.correios.ws.SQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "consultaCEP"),"br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "consultaCEP"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "consultaCEP"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "consultaCEP"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "integrarUsuarioScol"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "integrarUsuarioScol"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "integrarUsuarioScol"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "integrarUsuarioScol"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "integrarUsuarioScol"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "integrarUsuarioScol"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "atualizaRemessaAgrupada"),"br.com.correios.ws.SQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "atualizaRemessaAgrupada"),"br.com.correios.ws.SQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "atualizaRemessaAgrupada"),"br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "atualizaRemessaAgrupada"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "atualizaRemessaAgrupada"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "atualizaRemessaAgrupada"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitaPLP"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitaPLP"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitaPLP"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitaPLP"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitaPLP"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitaPLP"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "getStatusCartaoPostagem"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "getStatusCartaoPostagem"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "getStatusCartaoPostagem"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "getStatusCartaoPostagem"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "getStatusCartaoPostagem"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "getStatusCartaoPostagem"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "verificaModalTransporte"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "verificaModalTransporte"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "verificaModalTransporte"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "verificaModalTransporte"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "verificaModalTransporte"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "verificaModalTransporte"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaTarifaVale"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaTarifaVale"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaTarifaVale"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaTarifaVale"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaTarifaVale"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaTarifaVale"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","Exception"), "buscaTarifaVale"),"br.com.correios.ws.ExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","Exception"), "buscaTarifaVale"),"br.com.correios.ws.ExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","Exception"), "buscaTarifaVale"),"br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validarPostagemSimultanea"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validarPostagemSimultanea"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validarPostagemSimultanea"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validarPostagemSimultanea"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validarPostagemSimultanea"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validarPostagemSimultanea"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "getStatusPLP"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "getStatusPLP"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "getStatusPLP"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "buscaServicosXServicosAdicionais"),"br.com.correios.ws.SQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "buscaServicosXServicosAdicionais"),"br.com.correios.ws.SQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SQLException"), "buscaServicosXServicosAdicionais"),"br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicosXServicosAdicionais"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicosXServicosAdicionais"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicosXServicosAdicionais"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "cancelarPedidoScol"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "cancelarPedidoScol"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "cancelarPedidoScol"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "cancelarPedidoScol"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "cancelarPedidoScol"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "cancelarPedidoScol"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "bloquearObjeto"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "bloquearObjeto"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "bloquearObjeto"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "bloquearObjeto"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "bloquearObjeto"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "bloquearObjeto"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaContrato"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaContrato"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaContrato"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaContrato"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaContrato"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaContrato"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitaEtiquetas"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitaEtiquetas"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitaEtiquetas"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitaEtiquetas"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitaEtiquetas"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitaEtiquetas"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitaXmlPlp"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitaXmlPlp"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitaXmlPlp"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitaXmlPlp"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitaXmlPlp"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitaXmlPlp"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validarPostagemReversa"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validarPostagemReversa"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "validarPostagemReversa"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validarPostagemReversa"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validarPostagemReversa"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "validarPostagemReversa"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaCliente"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaCliente"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaCliente"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaCliente"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaCliente"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaCliente"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaPagamentoEntrega"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaPagamentoEntrega"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaPagamentoEntrega"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","ErroMontagemRelatorio"), "buscaPagamentoEntrega"),"br.com.correios.ws.ErroMontagemRelatorioException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","ErroMontagemRelatorio"), "buscaPagamentoEntrega"),"br.com.correios.ws.ErroMontagemRelatorioException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","ErroMontagemRelatorio"), "buscaPagamentoEntrega"),"br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorioDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaPagamentoEntrega"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaPagamentoEntrega"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaPagamentoEntrega"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitarPostagemScol"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitarPostagemScol"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "solicitarPostagemScol"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitarPostagemScol"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitarPostagemScol"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "solicitarPostagemScol"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaServicos"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaServicos"),"br.com.correios.ws.AutenticacaoExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AutenticacaoException"), "buscaServicos"),"br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicos"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicos"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaServicos"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaOpcoes"),"br.com.correios.ws.SigepClienteExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaOpcoes"),"br.com.correios.ws.SigepClienteExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","SigepClienteException"), "buscaOpcoes"),"br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public AtendeClienteServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public AtendeClienteServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public AtendeClienteServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente" );
                
    }

    /**
     * Default Constructor
     */
    public AtendeClienteServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public AtendeClienteServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#buscaServicosAdicionaisAtivos
                     * @param buscaServicosAdicionaisAtivos0
                    
                     * @throws br.com.correios.ws.SQLExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponseDocument buscaServicosAdicionaisAtivos(

                            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosDocument buscaServicosAdicionaisAtivos0)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.SQLExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/buscaServicosAdicionaisAtivos");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buscaServicosAdicionaisAtivos0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaServicosAdicionaisAtivos")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaServicosAdicionaisAtivos"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicosAdicionaisAtivos"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicosAdicionaisAtivos"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicosAdicionaisAtivos"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.SQLExceptionException){
                          throw (br.com.correios.ws.SQLExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#fechaPlp
                     * @param fechaPlp2
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponseDocument fechaPlp(

                            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpDocument fechaPlp2)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/fechaPlp");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    fechaPlp2,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "fechaPlp")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "fechaPlp"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fechaPlp"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fechaPlp"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fechaPlp"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#calculaTarifaServico
                     * @param calculaTarifaServico4
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     * @throws br.com.correios.ws.ExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponseDocument calculaTarifaServico(

                            br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoDocument calculaTarifaServico4)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException
                        ,br.com.correios.ws.ExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/calculaTarifaServico");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    calculaTarifaServico4,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "calculaTarifaServico")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "calculaTarifaServico"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"calculaTarifaServico"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"calculaTarifaServico"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"calculaTarifaServico"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.ExceptionException){
                          throw (br.com.correios.ws.ExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#validaPlp
                     * @param validaPlp6
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponseDocument validaPlp(

                            br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpDocument validaPlp6)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/validaPlp");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    validaPlp6,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "validaPlp")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "validaPlp"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validaPlp"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validaPlp"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validaPlp"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#verificaSeTodosObjetosCancelados
                     * @param verificaSeTodosObjetosCancelados8
                    
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponseDocument verificaSeTodosObjetosCancelados(

                            br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosDocument verificaSeTodosObjetosCancelados8)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/VerificaSeTodosObjetosCancelados");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    verificaSeTodosObjetosCancelados8,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "verificaSeTodosObjetosCancelados")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "verificaSeTodosObjetosCancelados"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"VerificaSeTodosObjetosCancelados"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"VerificaSeTodosObjetosCancelados"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"VerificaSeTodosObjetosCancelados"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#cancelarObjeto
                     * @param cancelarObjeto10
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     * @throws br.com.correios.ws.ExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponseDocument cancelarObjeto(

                            br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoDocument cancelarObjeto10)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException
                        ,br.com.correios.ws.ExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/cancelarObjeto");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cancelarObjeto10,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "cancelarObjeto")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "cancelarObjeto"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"cancelarObjeto"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"cancelarObjeto"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"cancelarObjeto"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.ExceptionException){
                          throw (br.com.correios.ws.ExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#pesquisarParametrosPorDescricao
                     * @param pesquisarParametrosPorDescricao12
                    
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponseDocument pesquisarParametrosPorDescricao(

                            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoDocument pesquisarParametrosPorDescricao12)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/pesquisarParametrosPorDescricao");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    pesquisarParametrosPorDescricao12,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "pesquisarParametrosPorDescricao")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "pesquisarParametrosPorDescricao"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarParametrosPorDescricao"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarParametrosPorDescricao"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarParametrosPorDescricao"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#atualizaPagamentoNaEntrega
                     * @param atualizaPagamentoNaEntrega14
                    
                     * @throws br.com.correios.ws.SQLExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponseDocument atualizaPagamentoNaEntrega(

                            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaDocument atualizaPagamentoNaEntrega14)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.SQLExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/atualizaPagamentoNaEntrega");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    atualizaPagamentoNaEntrega14,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "atualizaPagamentoNaEntrega")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "atualizaPagamentoNaEntrega"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"atualizaPagamentoNaEntrega"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"atualizaPagamentoNaEntrega"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"atualizaPagamentoNaEntrega"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.SQLExceptionException){
                          throw (br.com.correios.ws.SQLExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#obterClienteAtualizacao
                     * @param obterClienteAtualizacao16
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponseDocument obterClienteAtualizacao(

                            br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoDocument obterClienteAtualizacao16)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/obterClienteAtualizacao");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obterClienteAtualizacao16,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "obterClienteAtualizacao")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "obterClienteAtualizacao"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obterClienteAtualizacao"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obterClienteAtualizacao"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obterClienteAtualizacao"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#verificaDisponibilidadeServico
                     * @param verificaDisponibilidadeServico18
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponseDocument verificaDisponibilidadeServico(

                            br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoDocument verificaDisponibilidadeServico18)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/verificaDisponibilidadeServico");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    verificaDisponibilidadeServico18,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "verificaDisponibilidadeServico")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "verificaDisponibilidadeServico"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"verificaDisponibilidadeServico"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"verificaDisponibilidadeServico"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"verificaDisponibilidadeServico"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#fechaPlpVariosServicos
                     * @param fechaPlpVariosServicos20
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponseDocument fechaPlpVariosServicos(

                            br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosDocument fechaPlpVariosServicos20)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/fechaPlpVariosServicos");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    fechaPlpVariosServicos20,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "fechaPlpVariosServicos")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "fechaPlpVariosServicos"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fechaPlpVariosServicos"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fechaPlpVariosServicos"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"fechaPlpVariosServicos"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#geraDigitoVerificadorEtiquetas
                     * @param geraDigitoVerificadorEtiquetas22
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponseDocument geraDigitoVerificadorEtiquetas(

                            br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasDocument geraDigitoVerificadorEtiquetas22)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/geraDigitoVerificadorEtiquetas");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    geraDigitoVerificadorEtiquetas22,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "geraDigitoVerificadorEtiquetas")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "geraDigitoVerificadorEtiquetas"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"geraDigitoVerificadorEtiquetas"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"geraDigitoVerificadorEtiquetas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"geraDigitoVerificadorEtiquetas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#obterEmbalagemLRS
                     * @param obterEmbalagemLRS24
                    
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponseDocument obterEmbalagemLRS(

                            br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSDocument obterEmbalagemLRS24)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/obterEmbalagemLRS");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obterEmbalagemLRS24,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "obterEmbalagemLRS")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "obterEmbalagemLRS"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obterEmbalagemLRS"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obterEmbalagemLRS"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obterEmbalagemLRS"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#validaEtiquetaPLP
                     * @param validaEtiquetaPLP26
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponseDocument validaEtiquetaPLP(

                            br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPDocument validaEtiquetaPLP26)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/validaEtiquetaPLP");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    validaEtiquetaPLP26,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "validaEtiquetaPLP")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "validaEtiquetaPLP"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validaEtiquetaPLP"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validaEtiquetaPLP"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validaEtiquetaPLP"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#buscaServicosValorDeclarado
                     * @param buscaServicosValorDeclarado28
                    
                     * @throws br.com.correios.ws.SQLExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponseDocument buscaServicosValorDeclarado(

                            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoDocument buscaServicosValorDeclarado28)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.SQLExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/buscaServicosValorDeclarado");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buscaServicosValorDeclarado28,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaServicosValorDeclarado")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaServicosValorDeclarado"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicosValorDeclarado"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicosValorDeclarado"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicosValorDeclarado"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.SQLExceptionException){
                          throw (br.com.correios.ws.SQLExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#consultaCEP
                     * @param consultaCEP30
                    
                     * @throws br.com.correios.ws.SQLExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument consultaCEP(

                            br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument consultaCEP30)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.SQLExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/consultaCEP");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    consultaCEP30,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "consultaCEP")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "consultaCEP"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"consultaCEP"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"consultaCEP"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"consultaCEP"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.SQLExceptionException){
                          throw (br.com.correios.ws.SQLExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#integrarUsuarioScol
                     * @param integrarUsuarioScol32
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponseDocument integrarUsuarioScol(

                            br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolDocument integrarUsuarioScol32)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/integrarUsuarioScol");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    integrarUsuarioScol32,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "integrarUsuarioScol")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "integrarUsuarioScol"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"integrarUsuarioScol"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"integrarUsuarioScol"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"integrarUsuarioScol"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#pesquisarDimensoesServico
                     * @param pesquisarDimensoesServico34
                    
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponseDocument pesquisarDimensoesServico(

                            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoDocument pesquisarDimensoesServico34)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/pesquisarDimensoesServico");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    pesquisarDimensoesServico34,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "pesquisarDimensoesServico")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "pesquisarDimensoesServico"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarDimensoesServico"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarDimensoesServico"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarDimensoesServico"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#pesquisarEmbalagensPorServico
                     * @param pesquisarEmbalagensPorServico36
                    
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponseDocument pesquisarEmbalagensPorServico(

                            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoDocument pesquisarEmbalagensPorServico36)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/pesquisarEmbalagensPorServico");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    pesquisarEmbalagensPorServico36,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "pesquisarEmbalagensPorServico")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "pesquisarEmbalagensPorServico"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarEmbalagensPorServico"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarEmbalagensPorServico"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarEmbalagensPorServico"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#atualizaRemessaAgrupada
                     * @param atualizaRemessaAgrupada38
                    
                     * @throws br.com.correios.ws.SQLExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponseDocument atualizaRemessaAgrupada(

                            br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaDocument atualizaRemessaAgrupada38)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.SQLExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/atualizaRemessaAgrupada");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    atualizaRemessaAgrupada38,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "atualizaRemessaAgrupada")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "atualizaRemessaAgrupada"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"atualizaRemessaAgrupada"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"atualizaRemessaAgrupada"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"atualizaRemessaAgrupada"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.SQLExceptionException){
                          throw (br.com.correios.ws.SQLExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#solicitaPLP
                     * @param solicitaPLP40
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponseDocument solicitaPLP(

                            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPDocument solicitaPLP40)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/solicitaPLP");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    solicitaPLP40,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "solicitaPLP")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "solicitaPLP"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitaPLP"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitaPLP"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitaPLP"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#getStatusCartaoPostagem
                     * @param getStatusCartaoPostagem42
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponseDocument getStatusCartaoPostagem(

                            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemDocument getStatusCartaoPostagem42)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/getStatusCartaoPostagem");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getStatusCartaoPostagem42,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "getStatusCartaoPostagem")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "getStatusCartaoPostagem"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getStatusCartaoPostagem"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getStatusCartaoPostagem"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getStatusCartaoPostagem"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#verificaModalTransporte
                     * @param verificaModalTransporte44
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponseDocument verificaModalTransporte(

                            br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteDocument verificaModalTransporte44)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/verificaModalTransporte");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    verificaModalTransporte44,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "verificaModalTransporte")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "verificaModalTransporte"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"verificaModalTransporte"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"verificaModalTransporte"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"verificaModalTransporte"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#buscaDataAtual
                     * @param buscaDataAtual46
                    
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponseDocument buscaDataAtual(

                            br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualDocument buscaDataAtual46)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/buscaDataAtual");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buscaDataAtual46,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaDataAtual")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaDataAtual"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaDataAtual"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaDataAtual"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaDataAtual"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#buscaTarifaVale
                     * @param buscaTarifaVale48
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     * @throws br.com.correios.ws.ExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponseDocument buscaTarifaVale(

                            br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeDocument buscaTarifaVale48)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException
                        ,br.com.correios.ws.ExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/buscaTarifaVale");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buscaTarifaVale48,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaTarifaVale")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaTarifaVale"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaTarifaVale"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaTarifaVale"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaTarifaVale"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.ExceptionException){
                          throw (br.com.correios.ws.ExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#validarPostagemSimultanea
                     * @param validarPostagemSimultanea50
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponseDocument validarPostagemSimultanea(

                            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaDocument validarPostagemSimultanea50)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/validarPostagemSimultanea");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    validarPostagemSimultanea50,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "validarPostagemSimultanea")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "validarPostagemSimultanea"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validarPostagemSimultanea"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validarPostagemSimultanea"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validarPostagemSimultanea"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#getStatusPLP
                     * @param getStatusPLP52
                    
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponseDocument getStatusPLP(

                            br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPDocument getStatusPLP52)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/getStatusPLP");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getStatusPLP52,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "getStatusPLP")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "getStatusPLP"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getStatusPLP"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getStatusPLP"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getStatusPLP"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#pesquisarServicosAdicionais
                     * @param pesquisarServicosAdicionais54
                    
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponseDocument pesquisarServicosAdicionais(

                            br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisDocument pesquisarServicosAdicionais54)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/pesquisarServicosAdicionais");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    pesquisarServicosAdicionais54,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "pesquisarServicosAdicionais")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "pesquisarServicosAdicionais"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarServicosAdicionais"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarServicosAdicionais"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"pesquisarServicosAdicionais"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#buscaServicosXServicosAdicionais
                     * @param buscaServicosXServicosAdicionais56
                    
                     * @throws br.com.correios.ws.SQLExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponseDocument buscaServicosXServicosAdicionais(

                            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisDocument buscaServicosXServicosAdicionais56)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.SQLExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/buscaServicosXServicosAdicionais");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buscaServicosXServicosAdicionais56,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaServicosXServicosAdicionais")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaServicosXServicosAdicionais"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicosXServicosAdicionais"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicosXServicosAdicionais"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicosXServicosAdicionais"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.SQLExceptionException){
                          throw (br.com.correios.ws.SQLExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#cancelarPedidoScol
                     * @param cancelarPedidoScol58
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponseDocument cancelarPedidoScol(

                            br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolDocument cancelarPedidoScol58)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/cancelarPedidoScol");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cancelarPedidoScol58,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "cancelarPedidoScol")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "cancelarPedidoScol"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"cancelarPedidoScol"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"cancelarPedidoScol"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"cancelarPedidoScol"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#bloquearObjeto
                     * @param bloquearObjeto60
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponseDocument bloquearObjeto(

                            br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoDocument bloquearObjeto60)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/bloquearObjeto");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    bloquearObjeto60,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "bloquearObjeto")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "bloquearObjeto"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"bloquearObjeto"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"bloquearObjeto"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"bloquearObjeto"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#buscaContrato
                     * @param buscaContrato62
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponseDocument buscaContrato(

                            br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoDocument buscaContrato62)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/buscaContrato");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buscaContrato62,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaContrato")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaContrato"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaContrato"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaContrato"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaContrato"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#solicitaEtiquetas
                     * @param solicitaEtiquetas64
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponseDocument solicitaEtiquetas(

                            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasDocument solicitaEtiquetas64)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/solicitaEtiquetas");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    solicitaEtiquetas64,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "solicitaEtiquetas")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "solicitaEtiquetas"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitaEtiquetas"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitaEtiquetas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitaEtiquetas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#solicitaXmlPlp
                     * @param solicitaXmlPlp66
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponseDocument solicitaXmlPlp(

                            br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpDocument solicitaXmlPlp66)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/solicitaXmlPlp");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    solicitaXmlPlp66,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "solicitaXmlPlp")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "solicitaXmlPlp"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitaXmlPlp"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitaXmlPlp"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitaXmlPlp"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#validarPostagemReversa
                     * @param validarPostagemReversa68
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponseDocument validarPostagemReversa(

                            br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaDocument validarPostagemReversa68)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[34].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/validarPostagemReversa");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    validarPostagemReversa68,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "validarPostagemReversa")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "validarPostagemReversa"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validarPostagemReversa"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validarPostagemReversa"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"validarPostagemReversa"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#buscaCliente
                     * @param buscaCliente70
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponseDocument buscaCliente(

                            br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteDocument buscaCliente70)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[35].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/buscaCliente");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buscaCliente70,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaCliente")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaCliente"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaCliente"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaCliente"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaCliente"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#buscaPagamentoEntrega
                     * @param buscaPagamentoEntrega72
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.ErroMontagemRelatorioException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponseDocument buscaPagamentoEntrega(

                            br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaDocument buscaPagamentoEntrega72)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.ErroMontagemRelatorioException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[36].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/buscaPagamentoEntrega");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buscaPagamentoEntrega72,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaPagamentoEntrega")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaPagamentoEntrega"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaPagamentoEntrega"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaPagamentoEntrega"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaPagamentoEntrega"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.ErroMontagemRelatorioException){
                          throw (br.com.correios.ws.ErroMontagemRelatorioException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#solicitarPostagemScol
                     * @param solicitarPostagemScol74
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponseDocument solicitarPostagemScol(

                            br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolDocument solicitarPostagemScol74)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[37].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/solicitarPostagemScol");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    solicitarPostagemScol74,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "solicitarPostagemScol")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "solicitarPostagemScol"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitarPostagemScol"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitarPostagemScol"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"solicitarPostagemScol"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#buscaServicos
                     * @param buscaServicos76
                    
                     * @throws br.com.correios.ws.AutenticacaoExceptionException : 
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponseDocument buscaServicos(

                            br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosDocument buscaServicos76)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.AutenticacaoExceptionException
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[38].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/buscaServicos");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buscaServicos76,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaServicos")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaServicos"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicos"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicos"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaServicos"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.AutenticacaoExceptionException){
                          throw (br.com.correios.ws.AutenticacaoExceptionException)ex;
                        }
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#obterMensagemParametrizada
                     * @param obterMensagemParametrizada78
                    
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponseDocument obterMensagemParametrizada(

                            br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaDocument obterMensagemParametrizada78)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[39].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/obterMensagemParametrizada");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obterMensagemParametrizada78,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "obterMensagemParametrizada")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "obterMensagemParametrizada"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obterMensagemParametrizada"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obterMensagemParametrizada"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obterMensagemParametrizada"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.correios.ws.AtendeClienteService#buscaOpcoes
                     * @param buscaOpcoes80
                    
                     * @throws br.com.correios.ws.SigepClienteExceptionException : 
                     */

                    

                            public  br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponseDocument buscaOpcoes(

                            br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesDocument buscaOpcoes80)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.correios.ws.SigepClienteExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[40].getName());
              _operationClient.getOptions().setAction("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/buscaOpcoes");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buscaOpcoes80,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaOpcoes")), new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
                                                    "buscaOpcoes"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaOpcoes"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaOpcoes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"buscaOpcoes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.correios.ws.SigepClienteExceptionException){
                          throw (br.com.correios.ws.SigepClienteExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorioDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorioDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }

        public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{
        try{
        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SQLExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorioDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorioDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorioDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteExceptionDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        
        }catch(java.lang.Exception e){
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
        }

        
        
   }
   