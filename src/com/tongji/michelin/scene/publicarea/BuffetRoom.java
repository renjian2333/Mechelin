package com.tongji.michelin.scene.publicarea;

import com.tongji.michelin.scene.SceneNameConst;
import com.tongji.michelin.supplement.handmadetool.HandmadeTool;
import com.tongji.michelin.supplement.handmadetool.HandmadeToolFactory;
import com.tongji.michelin.person.staff.worker.utilityworker.UtilityWorker;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname ExperienceRoom
 * @description Designed for visitors to experience making chocolate.
 * @date 2020/11/24 11:25
 */
public class BuffetRoom extends PublicArea {

    private HandmadeTool tool = HandmadeToolFactory.getHandMadeTool();

    /**
     * number of this exp-room
     *
     * @modified by Ray
     **/
    private int expRoomNumber;

    /**
     * constructor of ExperienceRoom
     */
    public BuffetRoom(String location, double cost, double area, int maxNumber) {
        super(location, cost, area, maxNumber);
    }

    public BuffetRoom() {
        super();
    }

    /**
     * @return the tool
     */
    public HandmadeTool getTool() {
        return tool;
    }

    /**
     * Get description of tool in this room.
     *
     * @return description
     */
    public String getToolDescription() {
        return tool.getDescription();
    }

    /**
     * Set description of tool in this room. This is a part of COW pattern.
     *
     * @return description
     */
    public void setToolDescription(String description) {
        if (tool.getRefCount() > 1 || tool == HandmadeToolFactory.getDefaultHandmadeTool()) {
            tool.deref();
            tool = new HandmadeTool(tool);
        }
        tool.setDescription(description);
    }

    public int getExpRoomNumber() {
        return expRoomNumber;
    }

    public void setExpRoomNumber(int number) {
        expRoomNumber = number;
    }

    @Override
    public String toString() {
        return SceneNameConst.EXPERIENCE_ROOM;
    }

    /**
     * Visitor Pattern: accept a utility worker to maintenance the scene
     *
     * @param worker the utility worker
     */
    @Override
    public void accept(UtilityWorker worker) {
        worker.visit(this);
    }
}
