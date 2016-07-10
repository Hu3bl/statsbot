package statsbot.messages.regex;

import java.util.ArrayList;

public class RegexParser
{
	private static final RegexParser INSTANCE = new RegexParser();
	private ArrayList<IRegex> regexObjects = new ArrayList<IRegex>();

	
	private RegexParser()
	{
		
	}

	public static RegexParser getInstance()
	{
		return INSTANCE;
	}
	
	public ArrayList<IRegex> getRegexObjectList()
	{
		return regexObjects;
	}
	
	public void registerRegex(IRegex regex)
	{
		if(!regexObjects.contains(regex))
		{
			regexObjects.add(regex);
		}	
	}
	
	public void unregisterRegex(IRegex regex)
	{
		if(regexObjects.contains(regex))
		{
			regexObjects.remove(regex);
		}
	}
}
