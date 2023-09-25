package wizard_management.carpets;


import wizard_management.behaviors.IFlyable;

public class MagicCarpet extends Carpet implements IFlyable {

    public MagicCarpet(String colour){
        super(colour);
    }

    public String fly(){
        return "Hovering up, straightening out, flying off!";
    }

}
