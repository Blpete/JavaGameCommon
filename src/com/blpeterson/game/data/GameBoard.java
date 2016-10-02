package com.blpeterson.game.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GameBoard {

	private String id=UUID.randomUUID().toString();
	private String name="";
	private List<GameItem> gameItems= new ArrayList<GameItem>();
	
	public GameBoard() {
		super();
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gameItems
	 */
	public List<GameItem> getGameItems() {
		return gameItems;
	}

	/**
	 * @param gameItems the gameItems to set
	 */
	public void setGameItems(List<GameItem> gameItems) {
		this.gameItems = gameItems;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("Gameboard:\n");
		buf.append( "   name:"+getName()+"\n");
		buf.append("      id:"+getId()+"\n");
		for (GameItem item: getGameItems()) {
			buf.append("     GameItem:"+item+"\n");
		}
		return buf.toString();
	}
	
}
