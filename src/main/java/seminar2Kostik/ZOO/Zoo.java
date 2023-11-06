package seminar2Kostik.ZOO;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Cat cat=new Cat();
        Dog dog=new Dog();
        Radio radio= new Radio();

        List<Speakable> speakables=new ArrayList<>();
        speakables.add(cat);
        speakables.add(dog);
        speakables.add(radio);

        speakAll(speakables);

    }
    public static  void  speakAll(List<Speakable> list){
        for (Speakable speakable:list) {
            if (speakable instanceof Animal){
                Animal animal =(Animal) speakable;
                System.out.println(animal.getName()+" говорит: ");
            }
            speakable.speak();
        }
    }
}
