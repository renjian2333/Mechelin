package com.tongji.michelin.machine.processmachine.qualitytestmachine.qualitytestsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @classname QualityInspectionPanelGroup
 * @description This is quality inspection panel group
 */
public class QualityInspectionPanelGroup extends QualityTestSystem {
    private List<QualityTestSystem> succulents = new ArrayList<QualityTestSystem>();

    /**
     * Represent quality inspection panel group
     */
    public QualityInspectionPanelGroup(String species){
        super(species);
    }

    /**
     * Add quality test system
     */
    @Override
    public void add(QualityTestSystem qualityTestSystem){
        succulents.add(qualityTestSystem);
    }

//    @Override
//    public void add(QualityTestSystem qualityTestSystem) {
//
//    }

    /**
     * Show the structure of the system
     */
    @Override
    public void show(int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.print("-");
        }
        System.out.println("Group"+this.getSpecies() );
        for (QualityTestSystem suc : succulents) {
            suc.show(depth + 2);
        }
    }
}
