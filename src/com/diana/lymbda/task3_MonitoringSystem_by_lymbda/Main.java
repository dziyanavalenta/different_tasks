package com.diana.lymbda.task3_MonitoringSystem_by_lymbda;

/*
лямбда-выражения являются в некотором роде сокращенной формой внутренних анонимных классов.
Упростить задачу 1 и 2 с помощью лямбды
 */
public class Main {

    public static void main(String[] args) {

        MonitoringSystem generalModule = s -> System.out.println(s);
        generalModule.startMonitoring("Мониторинг общих показателей стартовал!");

        MonitoringSystem errorModule = s -> System.out.println(s);
        errorModule.startMonitoring("Мониторинг отслеживания ошибок стартовал!");

        MonitoringSystem securityModule = s -> System.out.println(s);
        securityModule.startMonitoring("Мониторинг отслеживания ошибок стартовал!");

    }
}
