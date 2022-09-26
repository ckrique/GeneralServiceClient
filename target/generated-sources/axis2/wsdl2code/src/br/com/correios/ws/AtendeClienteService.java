

/**
 * AtendeClienteService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package br.com.correios.ws;

    /*
     *  AtendeClienteService java interface
     */

    public interface AtendeClienteService {
          

        /**
          * Auto generated method signature
          * 
                    * @param buscaServicosAdicionaisAtivos
                
             * @throws br.com.correios.ws.SQLExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosResponseDocument buscaServicosAdicionaisAtivos(

                        br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosAdicionaisAtivosDocument buscaServicosAdicionaisAtivos)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.SQLExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param fechaPlp
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpResponseDocument fechaPlp(

                        br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpDocument fechaPlp)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param calculaTarifaServico
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
             * @throws br.com.correios.ws.ExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoResponseDocument calculaTarifaServico(

                        br.com.correios.bsb.sigep.master.bean.cliente.CalculaTarifaServicoDocument calculaTarifaServico)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException
          ,br.com.correios.ws.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param validaPlp
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpResponseDocument validaPlp(

                        br.com.correios.bsb.sigep.master.bean.cliente.ValidaPlpDocument validaPlp)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param verificaSeTodosObjetosCancelados
                
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosResponseDocument verificaSeTodosObjetosCancelados(

                        br.com.correios.bsb.sigep.master.bean.cliente.VerificaSeTodosObjetosCanceladosDocument verificaSeTodosObjetosCancelados)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param cancelarObjeto
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
             * @throws br.com.correios.ws.ExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoResponseDocument cancelarObjeto(

                        br.com.correios.bsb.sigep.master.bean.cliente.CancelarObjetoDocument cancelarObjeto)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException
          ,br.com.correios.ws.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param pesquisarParametrosPorDescricao
                
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoResponseDocument pesquisarParametrosPorDescricao(

                        br.com.correios.bsb.sigep.master.bean.cliente.PesquisarParametrosPorDescricaoDocument pesquisarParametrosPorDescricao)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param atualizaPagamentoNaEntrega
                
             * @throws br.com.correios.ws.SQLExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaResponseDocument atualizaPagamentoNaEntrega(

                        br.com.correios.bsb.sigep.master.bean.cliente.AtualizaPagamentoNaEntregaDocument atualizaPagamentoNaEntrega)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.SQLExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param obterClienteAtualizacao
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoResponseDocument obterClienteAtualizacao(

                        br.com.correios.bsb.sigep.master.bean.cliente.ObterClienteAtualizacaoDocument obterClienteAtualizacao)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param verificaDisponibilidadeServico
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoResponseDocument verificaDisponibilidadeServico(

                        br.com.correios.bsb.sigep.master.bean.cliente.VerificaDisponibilidadeServicoDocument verificaDisponibilidadeServico)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param fechaPlpVariosServicos
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosResponseDocument fechaPlpVariosServicos(

                        br.com.correios.bsb.sigep.master.bean.cliente.FechaPlpVariosServicosDocument fechaPlpVariosServicos)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param geraDigitoVerificadorEtiquetas
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasResponseDocument geraDigitoVerificadorEtiquetas(

                        br.com.correios.bsb.sigep.master.bean.cliente.GeraDigitoVerificadorEtiquetasDocument geraDigitoVerificadorEtiquetas)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param obterEmbalagemLRS
                
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSResponseDocument obterEmbalagemLRS(

                        br.com.correios.bsb.sigep.master.bean.cliente.ObterEmbalagemLRSDocument obterEmbalagemLRS)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param validaEtiquetaPLP
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPResponseDocument validaEtiquetaPLP(

                        br.com.correios.bsb.sigep.master.bean.cliente.ValidaEtiquetaPLPDocument validaEtiquetaPLP)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param buscaServicosValorDeclarado
                
             * @throws br.com.correios.ws.SQLExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoResponseDocument buscaServicosValorDeclarado(

                        br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosValorDeclaradoDocument buscaServicosValorDeclarado)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.SQLExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param consultaCEP
                
             * @throws br.com.correios.ws.SQLExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument consultaCEP(

                        br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument consultaCEP)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.SQLExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param integrarUsuarioScol
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolResponseDocument integrarUsuarioScol(

                        br.com.correios.bsb.sigep.master.bean.cliente.IntegrarUsuarioScolDocument integrarUsuarioScol)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param pesquisarDimensoesServico
                
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoResponseDocument pesquisarDimensoesServico(

                        br.com.correios.bsb.sigep.master.bean.cliente.PesquisarDimensoesServicoDocument pesquisarDimensoesServico)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param pesquisarEmbalagensPorServico
                
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoResponseDocument pesquisarEmbalagensPorServico(

                        br.com.correios.bsb.sigep.master.bean.cliente.PesquisarEmbalagensPorServicoDocument pesquisarEmbalagensPorServico)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param atualizaRemessaAgrupada
                
             * @throws br.com.correios.ws.SQLExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaResponseDocument atualizaRemessaAgrupada(

                        br.com.correios.bsb.sigep.master.bean.cliente.AtualizaRemessaAgrupadaDocument atualizaRemessaAgrupada)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.SQLExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param solicitaPLP
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPResponseDocument solicitaPLP(

                        br.com.correios.bsb.sigep.master.bean.cliente.SolicitaPLPDocument solicitaPLP)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getStatusCartaoPostagem
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemResponseDocument getStatusCartaoPostagem(

                        br.com.correios.bsb.sigep.master.bean.cliente.GetStatusCartaoPostagemDocument getStatusCartaoPostagem)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param verificaModalTransporte
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteResponseDocument verificaModalTransporte(

                        br.com.correios.bsb.sigep.master.bean.cliente.VerificaModalTransporteDocument verificaModalTransporte)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param buscaDataAtual
                
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualResponseDocument buscaDataAtual(

                        br.com.correios.bsb.sigep.master.bean.cliente.BuscaDataAtualDocument buscaDataAtual)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param buscaTarifaVale
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
             * @throws br.com.correios.ws.ExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeResponseDocument buscaTarifaVale(

                        br.com.correios.bsb.sigep.master.bean.cliente.BuscaTarifaValeDocument buscaTarifaVale)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException
          ,br.com.correios.ws.ExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param validarPostagemSimultanea
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaResponseDocument validarPostagemSimultanea(

                        br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemSimultaneaDocument validarPostagemSimultanea)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param getStatusPLP
                
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPResponseDocument getStatusPLP(

                        br.com.correios.bsb.sigep.master.bean.cliente.GetStatusPLPDocument getStatusPLP)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param pesquisarServicosAdicionais
                
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisResponseDocument pesquisarServicosAdicionais(

                        br.com.correios.bsb.sigep.master.bean.cliente.PesquisarServicosAdicionaisDocument pesquisarServicosAdicionais)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param buscaServicosXServicosAdicionais
                
             * @throws br.com.correios.ws.SQLExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisResponseDocument buscaServicosXServicosAdicionais(

                        br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosXServicosAdicionaisDocument buscaServicosXServicosAdicionais)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.SQLExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param cancelarPedidoScol
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolResponseDocument cancelarPedidoScol(

                        br.com.correios.bsb.sigep.master.bean.cliente.CancelarPedidoScolDocument cancelarPedidoScol)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param bloquearObjeto
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoResponseDocument bloquearObjeto(

                        br.com.correios.bsb.sigep.master.bean.cliente.BloquearObjetoDocument bloquearObjeto)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param buscaContrato
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoResponseDocument buscaContrato(

                        br.com.correios.bsb.sigep.master.bean.cliente.BuscaContratoDocument buscaContrato)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param solicitaEtiquetas
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasResponseDocument solicitaEtiquetas(

                        br.com.correios.bsb.sigep.master.bean.cliente.SolicitaEtiquetasDocument solicitaEtiquetas)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param solicitaXmlPlp
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpResponseDocument solicitaXmlPlp(

                        br.com.correios.bsb.sigep.master.bean.cliente.SolicitaXmlPlpDocument solicitaXmlPlp)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param validarPostagemReversa
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaResponseDocument validarPostagemReversa(

                        br.com.correios.bsb.sigep.master.bean.cliente.ValidarPostagemReversaDocument validarPostagemReversa)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param buscaCliente
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteResponseDocument buscaCliente(

                        br.com.correios.bsb.sigep.master.bean.cliente.BuscaClienteDocument buscaCliente)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param buscaPagamentoEntrega
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.ErroMontagemRelatorioException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaResponseDocument buscaPagamentoEntrega(

                        br.com.correios.bsb.sigep.master.bean.cliente.BuscaPagamentoEntregaDocument buscaPagamentoEntrega)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.ErroMontagemRelatorioException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param solicitarPostagemScol
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolResponseDocument solicitarPostagemScol(

                        br.com.correios.bsb.sigep.master.bean.cliente.SolicitarPostagemScolDocument solicitarPostagemScol)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param buscaServicos
                
             * @throws br.com.correios.ws.AutenticacaoExceptionException : 
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosResponseDocument buscaServicos(

                        br.com.correios.bsb.sigep.master.bean.cliente.BuscaServicosDocument buscaServicos)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.AutenticacaoExceptionException
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param obterMensagemParametrizada
                
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaResponseDocument obterMensagemParametrizada(

                        br.com.correios.bsb.sigep.master.bean.cliente.ObterMensagemParametrizadaDocument obterMensagemParametrizada)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param buscaOpcoes
                
             * @throws br.com.correios.ws.SigepClienteExceptionException : 
         */

         
                     public br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesResponseDocument buscaOpcoes(

                        br.com.correios.bsb.sigep.master.bean.cliente.BuscaOpcoesDocument buscaOpcoes)
                        throws java.rmi.RemoteException
             
          ,br.com.correios.ws.SigepClienteExceptionException;

        

        
       //
       }
    