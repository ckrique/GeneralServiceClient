

/**
 * WorldCupBetService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package br.com.worldcupbet.soapworldcupbet.ws;

    /*
     *  WorldCupBetService java interface
     */

    public interface WorldCupBetService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getByPunterName
                
         */

         
                     public br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument getByPunterName(

                        br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameDocument getByPunterName)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param delete
                
             * @throws br.com.worldcupbet.soapworldcupbet.ws.WorldCupBetServiceExceptionException : 
         */

         
                     public void delete(

                        br.com.worldcupbet.soapworldcupbet.services.DeleteDocument delete)
                        throws java.rmi.RemoteException
             
          ,br.com.worldcupbet.soapworldcupbet.ws.WorldCupBetServiceExceptionException;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  updateBet(
         br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument updateBet

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getBets
                
         */

         
                     public br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument getBets(

                        br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument getBets)
                        throws java.rmi.RemoteException
             ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addBet(
         br.com.worldcupbet.soapworldcupbet.services.AddBetDocument addBet

        ) throws java.rmi.RemoteException
        
        ;

        

        
       //
       }
    