package Task_3;

class Chicken extends Animal implements Edible{

    @Override
    public String sound() {
        return "KUKUKUK";
    }

    @Override
    public String howToEat() {
        return "Fried is best";
    }
}
