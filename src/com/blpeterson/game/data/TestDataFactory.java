package com.blpeterson.game.data;

public class TestDataFactory {

	public static GameBoard createGameBoard()
	{
		GameBoard gb = new GameBoard();
		gb.setName("Barry's GameBoard");
		
		gb.getGameItems().add(createGameItem());
		return gb;
	}
	
	
	public static GameItem createGameItem() {
		GameItem item = new GameItem();
//		item.setId("GP1");
//		item.
		
		return item;
	}
}
