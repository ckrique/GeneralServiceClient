package br.com.correios.bsb.sigep.master.bean.cliente.service;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.junit.Assert;
import org.junit.Test;

import br.com.correios.bsb.sigep.master.bean.cliente.*;
import br.com.correios.ws.*;

public class CorreiosTest {

	@Test
	public void testConsultaCep() {
		String cep = "21221220";
		AtendeClienteServiceStub stub;
		try {
			stub = new AtendeClienteServiceStub();

			ConsultaCEPDocument consultaCEP30 = ConsultaCEPDocument.Factory.newInstance();
			ConsultaCEP consultaCep = ConsultaCEP.Factory.newInstance();
			consultaCep.setCep(cep);

			consultaCEP30.setConsultaCEP(consultaCep);

			ConsultaCEPResponseDocument consultaCEPResponseDocument = stub.consultaCEP(consultaCEP30);
			ConsultaCEPResponse response = consultaCEPResponseDocument.getConsultaCEPResponse();
			EnderecoERP endereco = response.getReturn();
			
			Assert.assertTrue(endereco.getCep().equals("21221220"));
			Assert.assertNotNull(endereco.getBairro());

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

}