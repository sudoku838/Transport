package Transport;

class Car {
    String mark;
    String number;
    int power;
    double cost;
    int mileage;
    boolean inspectionPassed;

    // конструктор класса
    public Car(String mark, String number, int power, double cost, int mileage, boolean inspectionPassed) {
        this.mark = mark;
        this.number = number;
        this.power = power;
        this.cost = cost;
        this.mileage = mileage;
        this.inspectionPassed = inspectionPassed;
    }

    // Метод для вывода информации об автомобиле
    void printInfo() {
        System.out.println("Марка: " + mark);
        System.out.println("Номер: " + number);
        System.out.println("Мощность: " + power + " л.с.");
        System.out.println("Стоимость: " + cost + " руб.");
        System.out.println("Пробег: " + mileage + " км");
        System.out.println("Техосмотр: " + (inspectionPassed ? "пройден" : "не пройден"));
    }
}
