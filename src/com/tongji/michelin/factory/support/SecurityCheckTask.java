package com.tongji.michelin.factory.support;

import com.tongji.michelin.scene.publicarea.ExhibitionRoom;
import com.tongji.michelin.scene.publicarea.BuffetRoom;
import com.tongji.michelin.machine.Machine;

import java.util.List;

/**
 * @classname SecurityCheckTask
 * @description: SecurityCheckTaskList used for Facade
 */

public class SecurityCheckTask {
    private List<ExhibitionRoom> ExhRooms;
    private List<BuffetRoom> ExpRooms;
    private List<Machine> machines;
    private boolean RoomChecked;
    private boolean MachineChecked;


    public SecurityCheckTask(List<ExhibitionRoom> exhRoomList, List<BuffetRoom> expRoomList, List<Machine> machineList) {
        ExhRooms = exhRoomList;
        ExpRooms = expRoomList;
        machines = machineList;
        RoomChecked = false;
        MachineChecked = false;
    }

    public void checkRoomSecurity() {
        System.out.println("现在开始对公共场地进行巡逻检查。");
        System.out.println("首先进行展览厅的例行巡逻检查……");
        for (ExhibitionRoom item : ExhRooms) {
            System.out.println("开始巡逻第" + item.getExhRoomNumber() + "号展览厅。");
            item.visitExhibitionRoom();
            System.out.println("第" + item.getExhRoomNumber() + "号展览厅巡逻完毕。\n");
        }
        System.out.println("其次进行实践区的例行巡逻检查……");
        for (BuffetRoom item : ExpRooms) {
            System.out.println("开始巡逻第" + item.getBuffetRoomNumber() + "号实践区。");
            System.out.println("第" + item.getBuffetRoomNumber() + "号实践区巡逻完毕。\n");
        }
        RoomChecked = true;
    }

    public void checkMachineSecurity() {
        System.out.println("现在开始对机器设备进行安全检查。");
        for (Machine item : machines) {
            System.out.println("现在开始对" + item.getMachineID() + "号机器设备进行检查。");
            item.fix();
            System.out.println("已完成对机器设备" + item.getMachineID() + "号的安全检查。");
        }
        System.out.println("所有机器设备检查完毕。");
        MachineChecked = true;
    }

    public void report() {
        String roomSt = RoomChecked ? "已完成" : "未完成";
        String machineSt = MachineChecked ? "已完成" : "未完成";
        System.out.println("正在向总管汇报安全检查情况……");
        System.out.println("公共场地安全检查情况为:" + roomSt + "。");
        System.out.println("机器设备安全检查情况为:" + machineSt + "。");
        MachineChecked=false;
        RoomChecked=false;
    }

    @Override
    public String toString() {
        return "class SecurityCheckTask";
    }
}
