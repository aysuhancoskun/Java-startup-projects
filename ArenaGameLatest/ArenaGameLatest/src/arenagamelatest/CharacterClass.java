/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arenagamelatest;

import java.util.ArrayList;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;

/**
 *
 * @author aysuhan
 */
public class CharacterClass 
{
    private String name;
    private Integer characterNumber;
    public DoubleProperty health;
    public DoubleProperty armor,attackPower;
    public int debufTurnCount;
    public BooleanProperty isAlive;
    Skills specialAttack;
    
    ArrayList <Skills> buffOrDebuffList = new ArrayList <Skills>();
//  buffOrDebuffList.add();
    
    public void TakeDamage(Double attackDamage)
    {
    }
    public void Die()
    {
    }
    public void RunEachBuffOrDebuff()
    {
        
    }
    public void AddBuffOrDebuff(Skills skills)
    {
        
    }
    public void DefaultAttack()
    {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DoubleProperty getHealth() {
        return health;
    }

    public void setHealth(DoubleProperty health) {
        this.health = health;
    }

    public DoubleProperty getArmor() {
        return armor;
    }

    public void setArmor(DoubleProperty armor) {
        this.armor = armor;
    }

    public DoubleProperty getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(DoubleProperty attackPower) {
        this.attackPower = attackPower;
    }

    public int getDebufTurnCount() {
        return debufTurnCount;
    }

    public void setDebufTurnCount(int debufTurnCount) {
        this.debufTurnCount = debufTurnCount;
    }

    public BooleanProperty getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(BooleanProperty isAlive) {
        this.isAlive = isAlive;
    }

    public Integer getCharacterNumber() {
        return characterNumber;
    }

    public void setCharacterNumber(Integer characterNumber) {
        this.characterNumber = characterNumber;
    }
    
    
}
