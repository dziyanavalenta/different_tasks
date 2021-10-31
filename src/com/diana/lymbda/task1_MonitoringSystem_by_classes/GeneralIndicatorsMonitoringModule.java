package com.diana.lymbda.task1_MonitoringSystem_by_classes;

public class GeneralIndicatorsMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общих показателей стартовал!");
    }
}
