package br.com.worldcupbet.soapworldcupbet.ws.service;


import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.junit.Assert;
import org.junit.Test;

import br.com.worldcupbet.soapworldcupbet.services.AddBetDocument;
import br.com.worldcupbet.soapworldcupbet.services.AddBetDocument.AddBet;
import br.com.worldcupbet.soapworldcupbet.services.DeleteDocument;
import br.com.worldcupbet.soapworldcupbet.services.UpdateBetDocument;

import br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument;
import br.com.worldcupbet.soapworldcupbet.services.GetBetsDocument.GetBets;
import br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument;
import br.com.worldcupbet.soapworldcupbet.services.GetBetsResponseDocument.GetBetsResponse;

import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameDocument;
import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameDocument.GetByPunterName;
import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument;
import br.com.worldcupbet.soapworldcupbet.services.GetByPunterNameResponseDocument.GetByPunterNameResponse;
import br.com.worldcupbet.soapworldcupbet.services.xsd.Bet;
import br.com.worldcupbet.soapworldcupbet.ws.WorldCupBetServiceStub;







public class SoapWorldCupBetTest {

	@Test
	public void testGetBets() {

		WorldCupBetServiceStub stub = null;
		try {
			stub = new WorldCupBetServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertNotNull(stub);

		GetBetsDocument requestDoc = GetBetsDocument.Factory.newInstance();
		GetBets request = GetBets.Factory.newInstance();

		requestDoc.setGetBets(request);

		GetBetsResponseDocument responseDoc = null;
		try {
			responseDoc = stub.getBets(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertNotNull(responseDoc);

		GetBetsResponse response = responseDoc.getGetBetsResponse();

		Assert.assertNotNull(response);

		Bet[] result = response.getReturnArray();

		Assert.assertNotNull(result);
		Assert.assertTrue(result.length > 0);

		for (Bet b : result) {
			System.out.println(b.getPunterName() + " bets " + b.getBetValue() + " buks in " + b.getTeamOnWhichBet());
		}
	}

	
	@Test
	public void testAddBet() {
		
		WorldCupBetServiceStub stub = null;
		try {
			stub = new WorldCupBetServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertNotNull(stub);

		AddBetDocument requestDoc = AddBetDocument.Factory.newInstance();

		AddBet request = AddBet.Factory.newInstance();

		Bet newBet = Bet.Factory.newInstance();
		newBet.setPunterName("Camila");
		newBet.setBetValue(1030);
		newBet.setTeamOnWhichBet("Irâ");

		request.setBet(newBet);

		requestDoc.setAddBet(request);

		try {
			stub.addBet(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
			Assert.fail();
		}
		
		Assert.assertTrue(true);
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