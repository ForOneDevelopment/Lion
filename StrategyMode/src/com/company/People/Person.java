package com.company.People;

import com.company.Weapon.WeaponBehavior;

public abstract class Person {
    WeaponBehavior weaponBehavior;

    public Person(){}

    public abstract void display();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public void fight(){
        weaponBehavior.useweapon();
    }

}
