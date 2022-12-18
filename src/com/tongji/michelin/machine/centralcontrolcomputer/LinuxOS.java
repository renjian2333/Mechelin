package com.tongji.michelin.machine.centralcontrolcomputer;

/**
 * @classname LinuxOS
 * @description OS of Linux system
 */
public class LinuxOS implements OperatingSystem {

    @Override
    public String startupInfo() {
        return "This is Linux OS booting...";
    }

}
