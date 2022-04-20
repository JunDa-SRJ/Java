package itheima02;

public class AnimalOperator {

 /*public void useAnimal(Cat c){//Cat c = new Cat();
     c.eat();
 }

    public void useAnimal(Dog d){
        d.eat();
    }*/

    public void useAnimal(Animal a){
//        Animal a = new Cat();
//        Animal a = new Dog();
        a.eat();
        //a.lookdoor();   多态的弊端，不能访问子类所特有的功能
    }

}
