package WORK;

public class Dog extends Animal {

    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override // это АННОТАЦИЯ и она аннатирует(составляет) этот метод
    // и метод которые следует далее должен переопределять метод своего родителя
    // и еще она помогает сохранить название метода, чтобы не было ошибок в названии
    public void sleep() {

    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    public void showNAme() {
        System.out.println(name);
    }
}
