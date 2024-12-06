package Transport;

import java.util.*;

//майн самолёты и автомобили
public class Transport {
    public static void main(String[] args) {
        // Создаем коллекцию (список) автомобилей
        List<Car> gibddCars = new ArrayList<>();

        // Добавляем несколько автомобилей в коллекцию
        gibddCars.add(new Car("Toyota Camry", "A123BC", 150, 1500000, 100000, true));
        gibddCars.add(new Car("BMW X5", "B456CD", 250, 3000000, 50000, false));
        gibddCars.add(new Car("Lada Granta", "C789EF", 80, 600000, 150000, true));

        // Выводим информацию о каждом автомобиле из коллекции
        for (Car car : gibddCars) {
            car.printInfo();
        }
            // Создаем коллекцию (список) самолетов
            List<Airplane> privateAirplanes = new ArrayList<>();

// Добавляем несколько самолетов в коллекцию
            privateAirplanes.add(new Airplane("Boeing 737", "D123GH", 20000, 100000000, 12000));
            privateAirplanes.add(new Airplane("Airbus A320", "E456IJ", 18000, 90000000, 11000));

            // Выводим информацию о каждом самолете из коллекции
            for (Airplane plane : privateAirplanes) {
                plane.printInfo();
            }
        }
    }




