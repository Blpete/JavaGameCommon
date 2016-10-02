package com.blpeterson.game.data;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class GameSerializer {

	public static Gson gson = new Gson();
	
	
	public static Object toObject(String input, Class<?> toClass){
		Object object = null;
		try {
			object = gson.fromJson(input, toClass);
		} catch (JsonSyntaxException e) {
	
			e.printStackTrace();
		}
		return object;
		
	}
	
	public static String toString(Object object) {
		String json = gson.toJson(object);
		return json;
	}
}
