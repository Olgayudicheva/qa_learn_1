public class Animal {
    String name;
    int age;
    int weight;
    String color;

    public Animal() {
    }

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //void-метод ничего не возвращает
    void say(){
        System.out.println("Я говорю");
    }
    void go(){
        System.out.println("Я иду");
    }
    void drink(){
        System.out.println("Я пью");
    }
    void eat(){
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String year="лет";
        if (age == 1) {
            year="год";
        }else if (age==2||age==3||age==4){
            year="года";
        }else if (age>=5){
            year="лет";
        }

        return "Привет! Меня зовут "+name+", мне "+age+" "+year+", я вешу "+weight+" кг, мой цвет "+color;
    }
}
