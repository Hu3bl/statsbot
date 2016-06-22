package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.AttackedMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class AttackedRegex 
{
	private static Message message;
	private static final String regex = "\"(?<attackerName>.*)[<](?<attackerUserId>\\d+)[>][<](?<attackerSteamId>.*)[>][<](?<attackerTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" "
			+ "\\[(?<attackerPosX>[\\-]?[0-9]+) (?<attackerPosY>[\\-]?[0-9]+) (?<attackerPosZ>[\\-]?[0-9]+)\\] attacked "
			+ "\"(?<victimName>.*)[<](?<victimUserId>\\d+)[>][<](?<victimSteamId>.*)[>][<](?<victimTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" "
			+ "\\[(?<victimPosX>[\\-]?[0-9]+) (?<victimPosY>[\\-]?[0-9]+) (?<victimPosZ>[\\-]?[0-9]+)\\] with \"(?<attackerWeapon>[a-zA-Z0-9_]+)\" "
			+ "\\(damage \"(?<attackerDamage>[0-9]+)\"\\) \\(damage_armor \"(?<attackerDamageArmor>[0-9]+)\"\\) \\(health \"(?<victimHealth>[0-9]+)\"\\) "
			+ "\\(armor \"(?<victimArmor>[0-9]+)\"\\) \\(hitgroup \"(?<attackerHitGroup>.*)\"\\)";
	
	public AttackedRegex()
	{
		
	}
	
	public static AttackedMessage getMessageObject(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		AttackedMessage attackedMessage = null;
		
		if(m.matches())
		{
			attackedMessage = ModelFactory.eINSTANCE.createAttackedMessage();
			
			attackedMessage.setAttackerName(m.group("attackerName"));
			attackedMessage.setAttackerUserID(m.group("attackerUserId"));
			attackedMessage.setAttackerSteamID(m.group("attackerSteamId"));
			attackedMessage.setAttackerTeam(m.group("attackerTeam"));
			attackedMessage.setAttackerPosX(Integer.parseInt(m.group("attackerPosX")));
			attackedMessage.setAttackerPosY(Integer.parseInt(m.group("attackerPosY")));
			attackedMessage.setAttackerPosZ(Integer.parseInt(m.group("attackerPosZ")));
			attackedMessage.setVictimName(m.group("victimName"));
			attackedMessage.setVictimUserID(m.group("victimUserId"));
			attackedMessage.setVictimSteamID(m.group("victimSteamId"));
			attackedMessage.setVictimTeam(m.group("victimTeam"));
			attackedMessage.setVictimPosX(Integer.parseInt(m.group("victimPosX")));
			attackedMessage.setVictimPosY(Integer.parseInt(m.group("victimPosY")));
			attackedMessage.setVictimPosZ(Integer.parseInt(m.group("victimPosZ")));
			attackedMessage.setAttackerWeapon(m.group("attackerWeapon"));
			attackedMessage.setAttackerDamage(Integer.parseInt(m.group("attackerDamage")));
			attackedMessage.setAttackerDamageArmor(Integer.parseInt(m.group("attackerDamageArmor")));
			attackedMessage.setVictimHealth(Integer.parseInt(m.group("victimHealth")));
			attackedMessage.setVictimArmor(Integer.parseInt(m.group("victimArmor")));
			attackedMessage.setAttackerHitGroup(m.group("attackerHitGroup"));
		}
		
		return attackedMessage;
	}
}
