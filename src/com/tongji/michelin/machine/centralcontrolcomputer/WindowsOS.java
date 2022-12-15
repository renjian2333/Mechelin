package com.tongji.michelin.machine.centralcontrolcomputer;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname WindowsOS
 * @description OS of Windows system
 * @date 2020/11/20 22:14
 */
public class WindowsOS implements OperatingSystem {

    @Override
    public String startupInfo() {
        return "This is Windows OS booting...";
    }

}
