
package arenagamelatest;

/**
 *
 * @author aysuhan
 */
public abstract class Skills 
{
    public CharacterClass effectReference;
    public BuffOrDebuffState skillState;
    public int turnCount;
    public String skillName;
    public Double skillPower;
    public Skills CloneSkill(CharacterClass effectReference,Skills skillToClone){
        return null;
//        
    }
    
    public abstract void Effect();
    public void Tick(){
    }

    private static class BuffOrDebuffState {

        public BuffOrDebuffState() {
        }
    }
}
class HealtEveryTurn extends Skills{

    @Override
    public void Effect() {
        
    }
}
class DamageEveryTurn extends Skills{

    @Override
    public void Effect() {
        
    }
}
class ArmorPenalty extends Skills{
    boolean firstApply;
    @Override
    public void Effect() {
       
    }
}
class ArmorBonus extends Skills{
    boolean firstApply;
    @Override
    public void Effect() {    
    }   
}