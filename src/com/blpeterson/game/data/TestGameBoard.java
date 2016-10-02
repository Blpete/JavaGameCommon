package com.blpeterson.game.data;

import com.google.gson.Gson;

public class TestGameBoard {

	public static void main(String[] args) {
		GameBoard gb = TestDataFactory.createGameBoard();


		Gson gson = new Gson();
		System.out.println("Gameboard Test");
		System.out.println(gson.toJson(gb));
	}

}
