/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arenagamelatest;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author aysuhan
 */
public class Warrior extends CharacterClass
{
    @Override
     public DoubleProperty getHealth(){
         return new SimpleDoubleProperty(100);
     }
    @Override
     public DoubleProperty getArmor(){
         return new SimpleDoubleProperty(15);
     }
    @Override
     public DoubleProperty getAttackPower(){
         return new SimpleDoubleProperty(30);
         
     }
   
}
