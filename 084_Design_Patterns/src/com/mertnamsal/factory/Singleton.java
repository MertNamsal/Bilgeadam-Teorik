package com.mertnamsal.factory;

public class Singleton {

	private static EnemyFactory enemyFactory;
	
	public static EnemyFactory getEnemyFactory() {
		if(enemyFactory == null) {
			enemyFactory = new EnemyFactory();
		}
		return enemyFactory;
	}
}
