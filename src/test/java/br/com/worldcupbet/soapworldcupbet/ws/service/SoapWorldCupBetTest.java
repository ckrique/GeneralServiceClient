package br.com.worldcupbet.soapworldcupbet.ws.service;


import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.junit.Assert;
import org.junit.Test;

import br.com.worldcupbet.soapworldcupbet.services.AddBetDocument;
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

	/*
	@Test
	public void testAddHighScore() {
		
		HighScoreServiceStub stub = null;
		try {
			stub = new HighScoreServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertNotNull(stub);

		AddHighScoreDocument requestDoc = AddHighScoreDocument.Factory.newInstance();

		AddHighScore request = AddHighScore.Factory.newInstance();

		HighScore newHighScore = HighScore.Factory.newInstance();
		newHighScore.setNickname("Pedro");
		newHighScore.setScore(1000);

		request.setScore(newHighScore);

		requestDoc.setAddHighScore(request);

		try {
			stub.addHighScore(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertTrue(true);
	}

	@Test
	public void testGetHighScoresForNickname() {
		
		HighScoreServiceStub stub = null;
		try {
			stub = new HighScoreServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertNotNull(stub);

		GetHighScoresForNickNameDocument requestDoc = GetHighScoresForNickNameDocument.Factory.newInstance();
		
		GetHighScoresForNickName request = GetHighScoresForNickName.Factory.newInstance();
		
		request.setNickName("person3");
		
		requestDoc.setGetHighScoresForNickName(request);
		
		GetHighScoresForNickNameResponseDocument responseDoc = null;
		try {
			responseDoc = stub.getHighScoresForNickName(requestDoc);
		} catch (RemoteException e) {
			e.printStackTrace();
			Assert.fail();
		}
		
		Assert.assertNotNull(responseDoc);
		
		GetHighScoresForNickNameResponse response = responseDoc.getGetHighScoresForNickNameResponse();
		
		Assert.assertNotNull(response);
		
		HighScore[] result = response.getReturnArray();
		
		Assert.assertNotNull(result);
		Assert.assertTrue(result.length > 0);
		
		for (HighScore hs : result) {
			System.out.println(hs.getNickname() + " scores " + hs.getScore());
		}
	}
	
	@Test
	public void getHighScoresSize() {
		HighScoreServiceStub stub = null;
		try {
			stub = new HighScoreServiceStub();
		} catch (AxisFault e) {
			e.printStackTrace();
			Assert.fail();
		}

		Assert.assertNotNull(stub);
		
		GetHighScoreSizeDocument requestDoc = GetHighScoreSizeDocument.Factory.newInstance();
		
		GetHighScoreSize request = GetHighScoreSize.Factory.newInstance();
		
		requestDoc.setGetHighScoreSize(request);				
		
		GetHighScoreSizeResponseDocument responseDoc = null;
		try {
			responseDoc = stub.getHighScoreSize(requestDoc);
		} catch (RemoteException e) {			
			e.printStackTrace();
			Assert.fail();
		}
		
		Assert.assertNotNull(responseDoc);
		
		GetHighScoreSizeResponse response = responseDoc.getGetHighScoreSizeResponse();
		
		Assert.assertNotNull(response);
		
		Assert.assertTrue(response.getReturn() > 0);
		
		System.out.println("There is "+response.getReturn()+" highscores on the list.");
	}
	*/
}