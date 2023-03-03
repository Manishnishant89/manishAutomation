package com.manish.JsonValidation;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;

public class RCBTeamTest extends RCBTeamValidation
{
	String file = "C://Users//Admin//eclipse-workspace//JsonValidation//src//main//java//com//manish//JsonValidation//TeamRCB.json";
    
    @org.testng.annotations.Test
    public void validateForeignPlayers() throws FileNotFoundException, IOException, ParseException
    {
    	int count =validateNumberForeignPlayers(file);
    	System.out.println("ForeignPlayers: "+count);
    	//Assert.assertEquals(4, count);
    }
    
    @org.testng.annotations.Test
    public void validateWicketKeepers() throws FileNotFoundException, IOException, ParseException
    {
    	int count =validateNumberWicketKeepers(file);
    	System.out.println("WicketKeepers: "+count);
    	//Assert.assertEquals(1, count);
    }
}
