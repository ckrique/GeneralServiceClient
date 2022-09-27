package br.com.worldcupbet.soapworldcupbet.ws.service;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import br.com.worldcupbet.soapworldcupbet.services.AddBetDocument;
import br.com.worldcupbet.soapworldcupbet.services.AddBetDocument.AddBet;
import br.com.worldcupbet.soapworldcupbet.services.DeleteDocument.Delete;
import br.com.worldcupbet.soapworldcupbet.services.DeleteDocument;
import br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument;
import br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument.UpdateBet;

import br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument;
import br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets;
import br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument;
import br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse;

import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameDocument;
import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameDocument.GetByPunterName;
import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument;
import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse;
import br.com.worldcupbet.soapworldcupbet.services.xsd.Bet;
import br.com.worldcupbet.soapworldcupbet.ws.WorldCupBetServiceExceptionException;
import br.com.worldcupbet.soapworldcupbet.ws.WorldCupBetServiceStub;

public class SoapWorldCupBetClient {
	
	public Bet[] testGetBets() {

		WorldCupBetServiceStub stub = null;
		try {
			stub = new WorldCupBetServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}

		GetBetsDocument requestDoc = GetBetsDocument.Factory.newInstance();
		GetBets request = GetBets.Factory.newInstance();

		requestDoc.setGetBets(request);

		GetBetsResponseDocument responseDoc = null;
		try {
			responseDoc = stub.getBets(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		GetBetsResponse response = responseDoc.getGetBetsResponse();

		Bet[] bets = response.getReturnArray();

		return bets;
	}

	
	public void AddBet(Bet bet) {
		
		WorldCupBetServiceStub stub = null;
		try {
			stub = new WorldCupBetServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();		}

		AddBetDocument requestDoc = AddBetDocument.Factory.newInstance();

		AddBet request = AddBet.Factory.newInstance();
		
		request.setBet(bet);

		requestDoc.setAddBet(request);

		try {
			stub.addBet(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteBet(String punterName) {
		
		WorldCupBetServiceStub stub = null;
		try {
			stub = new WorldCupBetServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();		}

		DeleteDocument requestDoc = DeleteDocument.Factory.newInstance();
		
		Delete request = Delete.Factory.newInstance();


		request.setPunterName(punterName);

		requestDoc.setDelete(request);

		try {
			stub.delete(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (WorldCupBetServiceExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public void updateBet(Bet bet) throws WorldCupBetServiceExceptionException {
		
		WorldCupBetServiceStub stub = null;
		try {
			stub = new WorldCupBetServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();		}

		UpdateBetDocument requestDoc = UpdateBetDocument.Factory.newInstance();
		
		UpdateBet request = UpdateBet.Factory.newInstance();
		
		request.setBet(bet);

		requestDoc.setUpdateBet(request);

		try {
			stub.updateBet(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public Bet getBetByPunterName(String name) {
		
		WorldCupBetServiceStub stub = null;
		try {
			stub = new WorldCupBetServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}

		GetByPunterNameDocument requestDoc = GetByPunterNameDocument.Factory.newInstance();
		
		GetByPunterName request = GetByPunterName.Factory.newInstance();
		
		request.setPunterName(name);
		
		requestDoc.setGetByPunterName(request);
		
		GetByPunterNameResponseDocument responseDoc = null;
		try {
			responseDoc = stub.getByPunterName(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		GetByPunterNameResponse response = responseDoc.getGetByPunterNameResponse();
				
		Bet bet = response.getReturn();
		
		return bet;
		
	}
}
