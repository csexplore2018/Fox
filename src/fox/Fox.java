/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fox;

/**
 *
 * @author gc_science5
 */
public class Fox {

    private String name = "Fox";
    public String food = "Mice";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a = new Animal();
        System.out.println(a.name);
        a.talk();
        
        Vixen v = new Vixen();
        System.out.println(v.name);
        v.talk();
        
        Arctic b = new Arctic();
        System.out.println(b.name);
        b.talk();
        
        Fennec f = new Fennec();
        System.out.println(f.name);
        f.talk();
    }
    
}

class Animal{
    public String name = "Animal";
    public String food = "Food";
    
    public void talk(){
        System.out.println("Hoi");
    }
}

class Vixen extends Animal{
    public String name = "Vixen";
    public String food = "Mice";
    
    public void talk(){
        System.out.println("Ring-ding-ding-ding-dingeringeding!");
    }
}


class Reynard extends Animal{
public String name="Foxy the Pirate Fox" ;

}


class Arctic extends Animal{
public String name="Snow fox" ;

}

class Fennec extends Animal{
public String name="Fennekin" ;
    public void talk(){
        System.out.println("Fennekin!");
    }
}

//this is a foxy comment
//hi