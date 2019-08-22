package com.company;

import com.company.People.King;
import com.company.People.Person;
import com.company.Weapon.AxeBehavior;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person king = new King();
        king.display();
        king.fight();
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();
    }
}
