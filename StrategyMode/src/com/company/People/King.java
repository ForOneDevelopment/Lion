package com.company.People;

import com.company.Weapon.SwordBehavior;

public class King extends Person {
    public King(){
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm king!");
    }
}
