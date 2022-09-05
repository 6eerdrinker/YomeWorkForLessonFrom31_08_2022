public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Домашка от 31.08.2022");
        System.out.println();
        System.out.println("Задание 1");
        {int clientOS = 1;
            if (clientOS == 0) {
                System.out.println("Установите версию для iOS по ссылке");}
            else {System.out.println("Установите версию для Android по ссылке");}}

        System.out.println();
        System.out.println("Задание 2");
        {int clientOS = 0;
        int clientDeviceYear = 2019;
        if (clientOS == 0){System.out.println("Установите");
            if (clientDeviceYear < 2015) {System.out.println("облегченную версию приложения для iOS по ссылке");}
            else {System.out.println("версию приложения для iOS по ссылке");}}
        if (clientOS == 1) {System.out.println("Установите");
            if (clientDeviceYear < 2015){System.out.println("облегченную версию приложения для Android по ссылке");}
            else {System.out.println("версию приложения для Android по ссылке");}}}

        System.out.println();
        System.out.println("Задание 2, другой вариант решения");
        {int clientOS = 1;
            int clientDeviceYear = 2012;
            if (clientOS == 0 && clientDeviceYear > 2015){
                System.out.println("Установите версию приложения для iOS по ссылке");} else if (clientOS == 0 && clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
            if (clientOS == 1 && clientDeviceYear > 2015){
                System.out.println("Установите версию приложения для Android по ссылке");} else if (clientOS == 1 && clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            }}

        System.out.println();
        System.out.println("Задание 3");
        { int year = 2100;
            int yearMultiple4 = year % 4; // кратность 4
            int yearMultiple400 = year % 400;  //кратность 400
            int yearMultiple100 = year % 100; //кратность 100
            {if (yearMultiple100 != 0 && yearMultiple4 == 0){
                System.out.println("Год " + year + " является високосным");
                if (yearMultiple100 == 0 && yearMultiple4 == 0) {
                    System.out.println("Год " + year + " является високосным");}
            }
            else if (yearMultiple100 == 0 && yearMultiple400 == 0){
                System.out.println("Год " + year + " является високосным");} }
            if (yearMultiple100 == 0 && yearMultiple4 != 0) {System.out.println("Год " + year + " не является високосным");}
            if (yearMultiple100 == 0 && yearMultiple400 !=0){
                System.out.println("Год " + year + " не является високосным");} //относится к годам не кратным 400
            }

        System.out.println();
        System.out.println("Задание 4");
        int deliveryDistance = 18;
        if (deliveryDistance <= 20){
            System.out.println("Доставка на " + deliveryDistance + " км, займет 1 день.");
        }
        else if (deliveryDistance <= 60){
            System.out.println("Доставка на " + deliveryDistance + " км, займет 2 дня.");}
        else if (deliveryDistance <= 100){
            System.out.println("Доставка на " + deliveryDistance + " км, займет 3 дня.");}

        System.out.println();
        System.out.println("Задание 5");
        int monthNumber = 6;
        switch (monthNumber){case 1:
            case 2:
            case 12:
                System.out.println("Месяц принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону осень.");}


    }
}
