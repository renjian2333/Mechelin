package com.tongji.michelin.person.staff.worker.utilityworker;

import com.tongji.michelin.scene.GarbageStation;
import com.tongji.michelin.scene.decorator.Residence;
import com.tongji.michelin.scene.publicarea.PublicArea;
import com.tongji.michelin.scene.staffarea.DiningRoom;
import com.tongji.michelin.scene.staffarea.Office;
import com.tongji.michelin.scene.staffarea.manufacturingarea.ManufacturingArea;

public interface UtilityWorker {

    /**
     * Visitor Pattern: worker maintenance scenes
     *
     * @param s concrete scene
     */
    void visit(PublicArea s);

    void visit(GarbageStation s);

    void visit(ManufacturingArea s);

    void visit(DiningRoom s);

    void visit(Office s);

    void visit(Residence s);
}
