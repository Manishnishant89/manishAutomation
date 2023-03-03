package com.manish.JsonValidation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RCBTeamValidation {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		String file = "C://Users//Admin//eclipse-workspace//JsonValidation//src//main//java//com//manish//JsonValidation//TeamRCB.json";
		int count=0;
		int countWicketKeeper=0;
		System.out.println(file);
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(file));
		JSONObject jsonObject = (JSONObject)obj;
		JSONArray array = (JSONArray) jsonObject.get("player");
		System.out.println(array);
		for (Object object : array) {
			JSONObject object2=(JSONObject)object;
			//System.out.println(object2.get("country"));
			if(!object2.get("country").equals("India")) {
				count++;
			}
			if(object2.get("role").equals("Wicket-keeper")) {
				countWicketKeeper++;
			}
		}
		if (count == 4) {
			System.out.println("Validataion done: The RCB Team has 4 foreign players");
			
		}else {
			System.out.println("Validataion done: The RCB Team doesn't have 4 foreign players");
		}
		
		if(countWicketKeeper == 1) {
			System.out.println("Validataion done: The RCB Team has atleast one WicketKeeper");
		}else {
			System.out.println("Validataion done: The RCB Team doesn't have atleast one WicketKeeper");
		}
		
		
	}
	
	public int validateNumberWicketKeepers(String file) throws FileNotFoundException, IOException, ParseException {
		int countWicketKeeper=0;
		System.out.println(file);
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(file));
		JSONObject jsonObject = (JSONObject)obj;
		JSONArray array = (JSONArray) jsonObject.get("player");
		System.out.println(array);
		for (Object object : array) {
			JSONObject object2=(JSONObject)object;
			//System.out.println(object2.get("country"));
			if(object2.get("role").equals("Wicket-keeper")) {
				countWicketKeeper++;
			}
		}
		return countWicketKeeper;
		
	}
	
	
	public int validateNumberForeignPlayers(String file) throws FileNotFoundException, IOException, ParseException {
		int count=0;
		System.out.println(file);
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(file));
		JSONObject jsonObject = (JSONObject)obj;
		JSONArray array = (JSONArray) jsonObject.get("player");
		System.out.println(array);
		for (Object object : array) {
			JSONObject object2=(JSONObject)object;
			//System.out.println(object2.get("country"));
			if(!object2.get("country").equals("India")) {
				count++;
			}
		}
		return count;
		
	}

}
