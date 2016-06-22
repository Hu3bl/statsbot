package statsbot.test;

import static org.junit.Assert.*;

import org.junit.Test;

import MessagesModel.AttackedMessage;
import MessagesModel.KillMessage;
import statsbot.messages.regex.AttackedRegex;
import statsbot.messages.regex.KillRegex;

public class MessageTest {

	@Test
	public void CheckAttackedRegex_AttackedMessageAsInput_ExpectedCorrectConstructionOfObject() 
	{
		String input = "\"Hu3bl<2><STEAM_1:1:10481859><TERRORIST>\" [88 2512 -127] attacked \"Nate<10><BOT><CT>\" [382 2102 -126] with \"ak47\" (damage \"109\") (damage_armor \"15\") (health \"0\") (armor \"84\") (hitgroup \"head\")";
		
		AttackedMessage message = AttackedRegex.getMessageObject(input);
		
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
				
		KillMessage message = KillRegex.getMessageObject(input);
		
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
				
		KillMessage message = KillRegex.getMessageObject(input);
		
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

}
