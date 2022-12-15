package com.tongji.michelin.supplement.handmadetool;

import com.tongji.michelin.supplement.handmadetool.HandmadeTool;

/**
 * @author Ngae Zeh-ghau
 * @project chocolateFactory
 * @classname HandmadeToolFactory
 * @description Facotry class of HandmadeTool. This is a part of COW pattern.
 * @date 2020/11/18 10:12
 */
public class HandmadeToolFactory {

    /**
     * tool pool
     */
    private static HandmadeTool handmadeTool = new HandmadeTool();

    public static void reset() {
        handmadeTool = new HandmadeTool();
    }

    /**
     * Get a hand made tool (reference) from tool pool.
     *
     * @return tool ref
     */
    public static HandmadeTool getHandMadeTool() {
        handmadeTool.ref();
        return handmadeTool;
    }

    /**
     * @return the default handmade tool
     */
    public static HandmadeTool getDefaultHandmadeTool() {
        return handmadeTool;
    }

    /**
     * hide defalut ctor
     */
    private HandmadeToolFactory() {
    }
}
