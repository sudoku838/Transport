package Transport;

class Airplane {
    String mark;
    String number;
    int power;  // => это всё конструктор класса
    double cost;
    int maxHeight;

    public Airplane(String mark, String number, int power, double cost, int maxHeight) {
        this.mark = mark;
        this.number = number;
        this.power = power;
        this.cost = cost;
        this.maxHeight = maxHeight;
    }

    void printInfo() {
        System.out.println("Марка: " + mark);
        System.out.println("Номер: " + number);
        System.out.println("Мощность: " + power); // => это метод вывода информации самолёта
        System.out.println("Стоимость: " + cost);
        System.out.println("Максимальная высота: " + maxHeight + " метров");
    }
}