package com.company;

public class HW3 {

    public static void main(String[] args) {

        class Tester {
            String fio;
            String project;
            String position;
            boolean laptop;

            public String getFio() {
                return fio;
            }
        }

        class Laptop {
            String model = "HP Pavilion 15-cc500";
            double diagonal = 15.6;
            String CPU = "Процессор Intel® Core™ i7-7500U";
        }

        Laptop hp = new Laptop();

        Tester aida = new Tester();
        aida.fio = "Алиева Аида Мамедовна";
        aida.project = "ЕРИБ";
        aida.position = "Старший инженер-тестировщик";
        aida.laptop = false;

        Tester svetlana = new Tester();
        svetlana.fio = "Ефимова Светлана Юрьевна";
        svetlana.project = "ЕФС";
        svetlana.position = "Инженер-тестировщик";
        svetlana.laptop = false;

        Tester alsu = new Tester();
        alsu.fio = "Зиганшина Алсу Ришатовна";
        alsu.project = "НКП";
        alsu.position = "Руководитель проекта";
        alsu.laptop = true;

        System.out.println("Меня зовут " + aida.getFio() + ".");
        if (aida.laptop == true) {
            System.out.println("У меня есть ноутбук, модель " + hp.model + ".");
        }
        else {System.out.println("У меня нет рабочего ноутбука.");
        }

        System.out.println("Меня зовут " + svetlana.getFio()+ ".");
        if (svetlana.laptop == true) {
            System.out.println("У меня есть ноутбук, модель " + hp.model + ".");
        }
        else {System.out.println("У меня нет рабочего ноутбука.");
        }
        System.out.println("Меня зовут " + alsu.getFio() + ".");
        if (alsu.laptop == true) {
            System.out.println("У меня есть ноутбук, модель " + hp.model + ".");
        }
        else {System.out.println("У меня нет рабочего ноутбука.");
        }
    }
}