package com.example.lutemon.lutemon.species;

import com.example.lutemon.lutemon.Attack;
import com.example.lutemon.lutemon.Lutemon;
import com.example.lutemon.lutemon.types.IceType;
import com.example.lutemon.lutemon.types.WaterType;

public class Tux extends Lutemon implements WaterType, IceType {
    public Tux(int id, String name, int level, int xp, int hp, int maxHp, String description) {
        super(id, name, level, xp, hp, maxHp, description);
    }

    @Override
    public void echo(Lutemon target) {
        // TUX can copy the last attack of its opponent.
        Attack lastAttack = target.getLastAttack();

        if (lastAttack != null) {
            Attack echoAttack = new Attack(
                                          lastAttack.getName(),
                                          lastAttack.getBaseDamage(),
                                          lastAttack.getAccuracy(),
                                          lastAttack.getCriticalChance(),
                                          lastAttack.getLevelMultiplier()
                                          );
            System.out.println(echoAttack.getName() + " Copied to TUX");
            target.performAttack(target, echoAttack); // Echo attack is used a bit different because its attributes are always changing.
            attacks.add(echoAttack);
        }
    }

    @Override
    public void frostByte() {
        Attack frostByteAttack = new Attack("Frost Byte", 40, 0.8, 0.3, 1.5);
        attacks.add(frostByteAttack);
    }

    @Override
    public void aquaJet() {
        Attack aquaJetAttack = new Attack("Aqua Jet", 20, 0.9, 0.1, 1.2);
        attacks.add(aquaJetAttack);
    }

    @Override
    public void hydroPump() {
        Attack hydroPumpAttack = new Attack("Hydro Pump", 30, 0.7, 0.2, 1.25);
        attacks.add(hydroPumpAttack);

    }

}
