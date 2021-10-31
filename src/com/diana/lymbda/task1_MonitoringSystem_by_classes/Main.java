package com.diana.lymbda.task1_MonitoringSystem_by_classes;

/*
Представь, что у нас есть основная программа, которая постоянно работает и что-то делает.
Мы хотим создать для этой программы систему мониторинга из нескольких модулей.
Один модуль будет отслеживать общие показатели работы и вести лог, второй — фиксировать и регистрировать ошибки в журнале ошибок,
третий — отслеживать подозрительную активность: например, попытки несанкционированного доступа и прочие связанные с безопасностью вещи.

Поскольку все три модуля должны, по сути, просто стартовать в начале программы и работать в фоновом режиме, будет хорошей идеей создать для них общий интерфейс:

1.Создай интерфейс MonitoringSystem с методом startMonitoring
2.Его будут имплементировать 3 конкретных класса:
GeneralIndicatorsMonitoringModule - "Мониторинг общих показателей стартовал!"
ErrorMonitoringModule - "Мониторинг отслеживания ошибок стартовал!"
SecurityModule - "Мониторинг безопасности стартовал!"
3.В классе Main создать 3 объекта и вызвать у них 1 метод
4.Вывод в консоль:
Мониторинг общих показателей стартовал!
Мониторинг отслеживания ошибок стартовал!
Мониторинг безопасности стартовал!

 */
public class Main {
    public static void main(String[] args) {

        GeneralIndicatorsMonitoringModule generalModule = new GeneralIndicatorsMonitoringModule();
        ErrorMonitoringModule errorModule = new ErrorMonitoringModule();
        SecurityModule securityModule = new SecurityModule();

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
