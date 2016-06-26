package statsbot.messages.regex;

import java.util.regex.*;

import MessagesModel.Message;
import MessagesModel.ModelFactory;
import MessagesModel.RoundEndMessage;

public class RoundEndRegex implements IRegex
{
	private static final String regex = "World triggered \"Round_End\"";

	public RoundEndRegex()
	{
		RegexParser.getInstance().registerRegex(this);
	}

	@Override
	public Message tryCreatingMessage(String input)
	{
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		RoundEndMessage message = null;
		
		if(m.find())
		{
			message = ModelFactory.eINSTANCE.createRoundEndMessage();
		}
		
		return message;
	}
}
