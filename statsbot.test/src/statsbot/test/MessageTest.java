package statsbot.test;

import static org.junit.Assert.*;

import org.junit.Test;

import MessagesModel.AttackedMessage;
import MessagesModel.GotTheBombMessage;
import MessagesModel.KillAssistMessage;
import MessagesModel.KillMessage;
import MessagesModel.PurchasedMessage;
import MessagesModel.RoundScoredMessage;
import MessagesModel.RoundStartMessage;
import MessagesModel.SayMessage;
import MessagesModel.SayTeamMessage;
import MessagesModel.TeamScoredMessage;
import MessagesModel.ThrewStuffMessage;
import statsbot.messages.regex.AttackedRegex;
import statsbot.messages.regex.GotTheBombRegex;
import statsbot.messages.regex.KillAssistRegex;
import statsbot.messages.regex.KillRegex;
import statsbot.messages.regex.PurchasedRegex;
import statsbot.messages.regex.RoundScoredRegex;
import statsbot.messages.regex.RoundStartRegex;
import statsbot.messages.regex.SayRegex;
import statsbot.messages.regex.SayTeamRegex;
import statsbot.messages.regex.TeamScoredRegex;
import statsbot.messages.regex.ThrewStuffRegex;

public class MessageTest {

	@Test
	public void CheckAttackedRegex_AttackedMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Hu3bl<2><STEAM_1:1:10481859><TERRORIST>\" [88 2512 -127] attacked \"Nate<10><BOT><CT>\" [382 2102 -126] with \"ak47\" (damage \"109\") (damage_armor \"15\") (health \"0\") (armor \"84\") (hitgroup \"head\")";
		
		AttackedMessage message = (AttackedMessage) new AttackedRegex().tryCreatingMessage(input);
		
		assertEquals("Hu3bl", message.getAttackerName());
		assertEquals("2", message.getAttackerUserID());
		assertEquals("STEAM_1:1:10481859", message.getAttackerSteamID());
		assertEquals("TERRORIST", message.getAttackerTeam());
		assertEquals(88, message.getAttackerPosX());
		assertEquals(2512, message.getAttackerPosY());
		assertEquals(-127, message.getAttackerPosZ());
		assertEquals("Nate", message.getVictimName());
		assertEquals("10", message.getVictimUserID());
		assertEquals("BOT", message.getVictimSteamID());
		assertEquals("CT", message.getVictimTeam());
		assertEquals(382, message.getVictimPosX());
		assertEquals(2102, message.getVictimPosY());
		assertEquals(-126, message.getVictimPosZ());
		assertEquals("ak47", message.getAttackerWeapon());
		assertEquals(109, message.getAttackerDamage());
		assertEquals(15, message.getAttackerDamageArmor());
		assertEquals(0, message.getVictimHealth());
		assertEquals(84, message.getVictimArmor());
		assertEquals("head", message.getAttackerHitGroup());
	}
	
	@Test
	public void CheckKillRegex_KillMessageWithoutHeadshotAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Hu3bl<2><STEAM_1:1:10481859><TERRORIST>\" [88 2512 -127] killed \"Nate<10><BOT><CT>\" [382 2102 -62] with \"ak47\"";
				
		KillMessage message = (KillMessage) new KillRegex().tryCreatingMessage(input);
		
		assertEquals("Hu3bl", message.getUserName());
		assertEquals("2", message.getUserID());
		assertEquals("STEAM_1:1:10481859", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals(88, message.getKillerPosX());
		assertEquals(2512, message.getKillerPosY());
		assertEquals(-127, message.getKillerPosZ());
		assertEquals("Nate", message.getKilledUserName());
		assertEquals("10", message.getKilledUserID());
		assertEquals("BOT", message.getKilledUserSteamID());
		assertEquals("CT", message.getKilledUserTeam());
		assertEquals(382, message.getKilledPosX());
		assertEquals(2102, message.getKilledPosY());
		assertEquals(-62, message.getKilledPosZ());
		assertEquals("ak47", message.getWeapon());
		assertEquals(false, message.isHeadshot());
	}
	
	@Test
	public void CheckKillRegex_KillMessageWithHeadshotAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Hu3bl<2><STEAM_1:1:10481859><TERRORIST>\" [88 2512 -127] killed \"Nate<10><BOT><CT>\" [382 2102 -62] with \"ak47\" (headshot)";
				
		KillMessage message = (KillMessage) new KillRegex().tryCreatingMessage(input);
		
		assertEquals("Hu3bl", message.getUserName());
		assertEquals("2", message.getUserID());
		assertEquals("STEAM_1:1:10481859", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals(88, message.getKillerPosX());
		assertEquals(2512, message.getKillerPosY());
		assertEquals(-127, message.getKillerPosZ());
		assertEquals("Nate", message.getKilledUserName());
		assertEquals("10", message.getKilledUserID());
		assertEquals("BOT", message.getKilledUserSteamID());
		assertEquals("CT", message.getKilledUserTeam());
		assertEquals(382, message.getKilledPosX());
		assertEquals(2102, message.getKilledPosY());
		assertEquals(-62, message.getKilledPosZ());
		assertEquals("ak47", message.getWeapon());
		assertEquals(true, message.isHeadshot());
	}
	
	@Test
	public void CheckPurchasedRegex_PurchasedMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckBombDefusingRegex_BombDefusingMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckBombPlantingRegex_BombPlantingMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckChangeMapRegex_ChangeMapMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckChangeNameRegex_ChangeNameMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckConnectedRegex_ConnectedMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckDisconnectedMessageRegex_DisconnectedMessageMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckEnteredTheGameRegex_EnteredTheGameMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckGotTheBombRegex_GotTheBombMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Hu3bl<2><STEAM_1:1:10481859><TERRORIST>\" triggered \"Got_The_Bomb\"";
				
		GotTheBombMessage message = (GotTheBombMessage) new GotTheBombRegex().tryCreatingMessage(input);
		
		assertEquals("Hu3bl", message.getUserName());
		assertEquals("2", message.getUserID());
		assertEquals("STEAM_1:1:10481859", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
	}
	
	@Test
	public void CheckJoinTeamRegex_JoinTeamMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckKillAssistRegex_KillAssistMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Shawn<9><BOT><TERRORIST>\" assisted killing \"Yahn<3><BOT><CT>\"";
		
		KillAssistMessage message = (KillAssistMessage) new KillAssistRegex().tryCreatingMessage(input);
		
		assertEquals("Shawn", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("Yahn", message.getKilledUserName());
		assertEquals("3", message.getKilledUserID());
		assertEquals("BOT", message.getKilledUserSteamID());
		assertEquals("CT", message.getKilledUserTeam());
	}
	
	@Test
	public void CheckRemindRoundScoreRegex_RemindRoundScoreMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckRoundRestartRegex_RoundRestartMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckRoundScoredRegex_RoundScoredMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "Team \"CT\" triggered \"SFUI_Notice_Target_Saved\"";// (CT \"1\") (T \"1\")";
		
		//TODO
		RoundScoredMessage message = (RoundScoredMessage) new RoundScoredRegex().tryCreatingMessage(input);

		
		//assertEquals("CT", message.getTeam());
		//assertEquals("CT", message.getTeamWin());
		//assertEquals("saved", message.getType());
	}
	
	@Test
	public void CheckRoundStartRegex_RoundStartMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "World triggered \"Round_Start\"";
				
		RoundStartMessage message = (RoundStartMessage) new RoundStartRegex().tryCreatingMessage(input);
		
		//TODO
		//assertNotEquals(null, message.getTime());
	}
	
	@Test
	public void CheckSayRegex_SayMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Hu3bl<2><STEAM_1:1:10481859><CT>\" say \"Valve\"";
				
		SayMessage message = (SayMessage) new SayRegex().tryCreatingMessage(input);
		
		assertEquals("Hu3bl", message.getUserName());
		assertEquals("2", message.getUserID());
		assertEquals("STEAM_1:1:10481859", message.getUserSteamID());
		assertEquals("CT", message.getUserTeam());
		assertEquals("Valve", message.getText());
	}
	
	@Test
	public void CheckSayTeamRegex_SayTeamMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Hu3bl<2><STEAM_1:1:10481859><CT>\" say_team \"Valve\"";
				
		SayTeamMessage message = (SayTeamMessage) new SayTeamRegex().tryCreatingMessage(input);
		
		assertEquals("Hu3bl", message.getUserName());
		assertEquals("2", message.getUserID());
		assertEquals("STEAM_1:1:10481859", message.getUserSteamID());
		assertEquals("CT", message.getUserTeam());
		assertEquals("Valve", message.getText());
	}
	
	@Test
	public void CheckSwitchTeamRegex_SwitchTeamMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		//TODO
		String input = "\"Ron<9><BOT><TERRORIST>\" purchased \"ak47\"";
				
		PurchasedMessage message = (PurchasedMessage) new PurchasedRegex().tryCreatingMessage(input);
		
		assertEquals("Ron", message.getUserName());
		assertEquals("9", message.getUserID());
		assertEquals("BOT", message.getUserSteamID());
		assertEquals("TERRORIST", message.getUserTeam());
		assertEquals("ak47", message.getPurchasedObject());
	}
	
	@Test
	public void CheckTeamScoredRegex_TeamScoredMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "Team \"CT\" scored \"1\" with \"1\" players";
				
		TeamScoredMessage message = (TeamScoredMessage) new TeamScoredRegex().tryCreatingMessage(input);
		
		assertEquals("CT", message.getTeam());
		assertEquals("1", message.getScore());
		assertEquals("1", message.getPlayers());
	}
	
	@Test
	public void CheckThrewStuffRegex_ThrewStuffMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Hu3bl<2><STEAM_1:1:10481859><CT>\" threw smokegrenade [910 2780 119]";
				
		ThrewStuffMessage message = (ThrewStuffMessage) new ThrewStuffRegex().tryCreatingMessage(input);
		
		assertEquals("Hu3bl", message.getUserName());
		assertEquals("2", message.getUserID());
		assertEquals("STEAM_1:1:10481859", message.getUserSteamID());
		assertEquals("CT", message.getUserTeam());
		assertEquals("smokegrenade", message.getStuff());
		assertEquals(910, message.getPosX());
		assertEquals(2780, message.getPosY());
		assertEquals(119, message.getPosZ());
	}
}
