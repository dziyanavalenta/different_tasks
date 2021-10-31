package com.diana.lymbda.task2_MonitoringSystem_by_anonymous_classes;
/*
В task1 для такой небольшой работы мы написали целую систему: 3 класса и один интерфейс! И все это — ради 6 строк кода.
Да, не очень здорово, что мы понаписали таких вот «одноразовых» классов. Но как мы можем это исправить?
Здесь нам и приходят на помощь анонимные внутренние классы!
Перепиши task1 с помощью анонимных классов.

В документации Oracle приведена хорошая рекомендация: «Применяйте анонимные классы, если вам нужен локальный класс для одноразового использования».
 */

  /*
         внутри Java-машины происходит следующее:
            Создается безымянный Java-класс, реализующий интерфейс MonitoringSystem.
            Компилятор, увидев такой класс, требует от тебя реализовать все методы интерфейса MonitoringSystem (мы это и сделали 3 раза).
            Создается один объект этого класса. В конце стоит точка с запятой! Она стоит там не просто так.
            Мы одновременно объявляем класс (посредством фигурных скобок) и создаем его объект с помощью ();
   */

public class Main {
    public static void main(String[] args) {
        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал!");
            }
        };

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал!");
            }
        };
        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
