package kotlinstudy.ch02;

import kotlinstudy.ch02.model.IsMarriedPerson;

public class IsMarriedPersonCreator {
    public static void main(String[] args) {
        IsMarriedPerson sypark = new IsMarriedPerson("sypark", true);
        System.out.println(sypark);
        sypark.setMarried(false);
        System.out.println(sypark);
    }
}
