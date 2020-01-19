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
public class Druid extends CharacterClass
{
     @Override
     public DoubleProperty getHealth(){
         return new SimpleDoubleProperty(80);
     }
     @Override
     public DoubleProperty getArmor(){
         return new SimpleDoubleProperty(5);
     }
     @Override
      public DoubleProperty getAttackPower(){
         return new SimpleDoubleProperty(20);
     }
}
