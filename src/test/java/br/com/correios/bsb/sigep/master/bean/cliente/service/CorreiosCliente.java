package br.com.correios.bsb.sigep.master.bean.cliente.service;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import br.com.correios.bsb.sigep.master.bean.cliente.*;
import br.com.correios.ws.*;

public class CorreiosCliente {
	public EnderecoERP getEnderecoByCep() {
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
			
			return endereco;

		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SigepClienteExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}