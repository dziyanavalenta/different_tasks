package com.diana.lymbda.task1_MonitoringSystem_by_classes;

public class ErrorMonitoringModule implements MonitoringSystem {
    @Override
    public void startMonitoring(){
        System.out.println("Мониторинг отслеживания ошибок стартовал!");
    }
}
