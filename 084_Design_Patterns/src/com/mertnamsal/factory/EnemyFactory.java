package com.mertnamsal.factory;

public class EnemyFactory {
	
	public IEnemy createEnemy(String enemyType) {
		if(enemyType == null || enemyType.isEmpty()) {
			return null;
		}
		
		switch(enemyType) {
		case IEnemy.ARCHER:
			return new EnemyArcher();
		case IEnemy.CAVALRY:
			return new EnemyCavalry();
		case IEnemy.INFANTRY:
			return new EnemyInfantry();
		default:
			throw new IllegalArgumentException("Unkown enemy type "+enemyType);
			
		}
		
	}
}
