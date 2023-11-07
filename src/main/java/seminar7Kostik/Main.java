package seminar7Kostik;

import seminar7Kostik.structural_decorator.Developer;
import seminar7Kostik.structural_decorator.SeniorDeveloper;
import seminar7Kostik.structural_decorator.SinglDeveloper;

public class Main {
    public static void main(String[] args) {
        Developer developer=new SeniorDeveloper(new SinglDeveloper());
        System.out.println(developer.makeJob());
    }
}
