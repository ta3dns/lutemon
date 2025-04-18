package com.example.lutemon.lutemon.species;

import com.example.lutemon.lutemon.Attack;
import com.example.lutemon.lutemon.Lutemon;
import com.example.lutemon.lutemon.types.FireType;

public class Ignivulp extends Lutemon implements FireType {
    public Ignivulp(int id, String name, int level, int xp, int hp, int maxHp, String description) {
        super(id, name, level, xp, hp, maxHp, description);
    }

    @Override
    public void fireWall() {
        Attack fireWallAttack = new Attack("Fire Wall", 50, 0.7, 0.2, 1.5);
        attacks.add(fireWallAttack);
    }

    @Override
    public void flameThrower() {
        Attack flameThrowerAttack = new Attack("Flame Thrower", 20, 0.8, 0.1, 1.3);
        attacks.add(flameThrowerAttack);
    }

    @Override
    public void inferno() {
        Attack infernoAttack = new Attack("Inferno", 60, 0.7, 0.3, 1.6);
        attacks.add(infernoAttack);
    }

    @Override
    public void fireBlast() {
        Attack fireBlastAttack = new Attack("Fire Blast", 40, 0.8, 0.2, 1.1);
        attacks.add(fireBlastAttack);
    }
}
