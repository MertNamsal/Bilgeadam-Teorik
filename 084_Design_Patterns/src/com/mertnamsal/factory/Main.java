package com.mertnamsal.factory;

public class Main {

	public static void main(String[] args) {
		
		EnemyFactory enemyFactory = Singleton.getEnemyFactory();
		enemyFactory.createEnemy(IEnemy.ARCHER).attack();
		enemyFactory.createEnemy(IEnemy.CAVALRY).attack();
		enemyFactory.createEnemy(IEnemy.INFANTRY).attack();
		
	}
}
