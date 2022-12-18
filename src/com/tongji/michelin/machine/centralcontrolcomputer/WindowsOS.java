package com.tongji.michelin.machine.centralcontrolcomputer;

/**
 * @classname WindowsOS
 * @description OS of Windows system
 */
public class WindowsOS implements OperatingSystem {

    @Override
    public String startupInfo() {
        return "This is Windows OS booting...";
    }

}
