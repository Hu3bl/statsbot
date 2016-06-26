package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.ChangeMapMessage;
import MessagesModel.Message;
import MessagesModel.ModelFactory;

public class ChangeMapRegex implements IRegex
{
	private static final String regex = "(Started map|Loading map) \"(?<map>.*)\"";

	public ChangeMapRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input) 
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		ChangeMapMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createChangeMapMessage();
			
			message.setMap(m.group("map"));
		}
		
		return message;
	}
}
