package statsbot.core.udp.parser;

import MessagesModel.Message;
import statsbot.messages.regex.IRegex;
import statsbot.messages.regex.RegexParser;

public class UDPParser 
{
	public UDPParser()
	{
		
	}
	
	public boolean parseData(String data)
	{
		for (IRegex tempRegex : RegexParser.getInstance().getRegexObjectList())
		{
			Message message = tempRegex.tryCreatingMessage(data);
			if (null != message)
			{
				return true;
			}
		}
		return false;
	}
}
