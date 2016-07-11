package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.AttackedMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class AttackedRegex implements IRegex
{
	private static final String regex = "\"(?<attackerName>.*)[<](?<attackerUserId>\\d+)[>][<](?<attackerSteamId>.*)[>][<](?<attackerTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" "
			+ "\\[(?<attackerPosX>[\\-]?[0-9]+) (?<attackerPosY>[\\-]?[0-9]+) (?<attackerPosZ>[\\-]?[0-9]+)\\] attacked "
			+ "\"(?<victimName>.*)[<](?<victimUserId>\\d+)[>][<](?<victimSteamId>.*)[>][<](?<victimTeam>CT|TERRORIST|Unassigned|Spectator)[>]\" "
			+ "\\[(?<victimPosX>[\\-]?[0-9]+) (?<victimPosY>[\\-]?[0-9]+) (?<victimPosZ>[\\-]?[0-9]+)\\] with \"(?<attackerWeapon>[a-zA-Z0-9_]+)\" "
			+ "\\(damage \"(?<attackerDamage>[0-9]+)\"\\) \\(damage_armor \"(?<attackerDamageArmor>[0-9]+)\"\\) \\(health \"(?<victimHealth>[0-9]+)\"\\) "
			+ "\\(armor \"(?<victimArmor>[0-9]+)\"\\) \\(hitgroup \"(?<attackerHitGroup>.*)\"\\)";
	
	public AttackedRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input) 
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		AttackedMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createAttackedMessage();
			
			message.setAttackerName(m.group("attackerName"));
			message.setAttackerUserID(m.group("attackerUserId"));
			message.setAttackerSteamID(m.group("attackerSteamId"));
			message.setAttackerTeam(m.group("attackerTeam"));
			message.setAttackerPosX(Integer.parseInt(m.group("attackerPosX")));
			message.setAttackerPosY(Integer.parseInt(m.group("attackerPosY")));
			message.setAttackerPosZ(Integer.parseInt(m.group("attackerPosZ")));
			message.setVictimName(m.group("victimName"));
			message.setVictimUserID(m.group("victimUserId"));
			message.setVictimSteamID(m.group("victimSteamId"));
			message.setVictimTeam(m.group("victimTeam"));
			message.setVictimPosX(Integer.parseInt(m.group("victimPosX")));
			message.setVictimPosY(Integer.parseInt(m.group("victimPosY")));
			message.setVictimPosZ(Integer.parseInt(m.group("victimPosZ")));
			message.setAttackerWeapon(m.group("attackerWeapon"));
			message.setAttackerDamage(Integer.parseInt(m.group("attackerDamage")));
			message.setAttackerDamageArmor(Integer.parseInt(m.group("attackerDamageArmor")));
			message.setVictimHealth(Integer.parseInt(m.group("victimHealth")));
			message.setVictimArmor(Integer.parseInt(m.group("victimArmor")));
			message.setAttackerHitGroup(m.group("attackerHitGroup"));
		}
		
		return message;
	}
}
