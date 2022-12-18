package com.tongji.michelin.scene.publicarea;

import com.tongji.michelin.scene.SceneNameConst;
import com.tongji.michelin.supplement.handmadetool.HandmadeTool;
import com.tongji.michelin.supplement.handmadetool.HandmadeToolFactory;
import com.tongji.michelin.person.staff.worker.utilityworker.UtilityWorker;

/**
 * @classname BuffetRoom
 */
public class BuffetRoom extends PublicArea {

    private HandmadeTool tool = HandmadeToolFactory.getHandMadeTool();

    private int buffetRoomNumber;

    /**
     * constructor of BuffetRoom
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

    public int getBuffetRoomNumber() {
        return buffetRoomNumber;
    }

    public void setBuffetRoomNumber(int number) {
        buffetRoomNumber = number;
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
