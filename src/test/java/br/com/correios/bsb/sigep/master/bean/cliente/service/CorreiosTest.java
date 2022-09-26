package br.com.correios.bsb.sigep.master.bean.cliente.service;


import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.junit.Assert;
import org.junit.Test;


import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameDocument;
import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameDocument.GetByPunterName;
import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument;
import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse;
import br.com.worldcupbet.soapworldcupbet.services.xsd.Bet;
import br.com.worldcupbet.soapworldcupbet.ws.WorldCupBetServiceStub;
import br.com.correios.bsb.sigep.master.bean.cliente.impl.ConsultaCEPImpl;
import br.com.correios.bsb.sigep.master.bean.cliente.impl.ConsultaCEPDocumentImpl;
import br.com.correios.bsb.sigep.master.bean.cliente.impl.ConsultaCEPResponseDocumentImpl;
import br.com.correios.bsb.sigep.master.bean.cliente.impl.ConsultaCEPResponseImpl;


import br.com.correios.bsb.sigep.master.bean.cliente.*;
import br.com.correios.ws.*;







public class CorreiosTest {

	
	@Test
	public void testConsultaCep() {
			
		AtendeClienteServiceStub stub;
		try {
			stub = new AtendeClienteServiceStub();
			
			br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument consultaCEP30 = br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPDocument.Factory.newInstance();
			br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP consultaCep = br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP.Factory.newInstance();
			consultaCep.setCep("21221220");
			
			
			consultaCEP30.setConsultaCEP(consultaCep);
			
			br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponseDocument consultaCEPResponseDocument = stub.consultaCEP(consultaCEP30);
			
			br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse response = consultaCEPResponseDocument.getConsultaCEPResponse();
			
			EnderecoERP endereco = response.getReturn();
			
			System.out.println(endereco.getCep());
			System.out.println(endereco.getBairro());
			
			stub = stub;
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SigepClienteExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}
	
	
	
	@Test
	public void testGetHighScoresForNickname() {
		
		WorldCupBetServiceStub stub = null;
		try {
			stub = new WorldCupBetServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertNotNull(stub);

		GetByPunterNameDocument requestDoc = GetByPunterNameDocument.Factory.newInstance();
		
		GetByPunterName request = GetByPunterName.Factory.newInstance();
		
		request.setPunterName("Dickson");
		
		requestDoc.setGetByPunterName(request);
		
		GetByPunterNameResponseDocument responseDoc = null;
		try {
			responseDoc = stub.getByPunterName(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
			Assert.fail();
		}
		
		Assert.assertNotNull(responseDoc);
		
		GetByPunterNameResponse response = responseDoc.getGetByPunterNameResponse();
		
		Assert.assertNotNull(response);
		
		Bet result = response.getReturn();
		
		Assert.assertNotNull(result);
		
		Assert.assertTrue(result.getPunterName().equals("Dickson"));
	}
	

}