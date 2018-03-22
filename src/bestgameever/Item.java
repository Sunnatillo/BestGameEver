package bestgameever;


public abstract class Item {
    private String name;
    private String description;
    private float value;
    
    public Item( String name, String desc, float val ){
        this.name = name;
        this.description = desc;
        this.value = val;
    }
    
    public void use(){}

    public String getName() {return name;}

    public String getDescription() { return description;}

    public float getValue() { return value;}
    
    @Override
    public String toString(){
        return "Item:\n" + name + "\n" + description + "\n" + value;
    }
   
}
