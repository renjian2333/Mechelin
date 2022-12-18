package com.tongji.michelin.person.visitor;

import com.tongji.michelin.person.Person;
import com.tongji.michelin.person.visitor.limit.Context;
import com.tongji.michelin.scene.Scene;
import com.tongji.michelin.scene.publicarea.PublicArea;


/**
 * @classname Visitor
 * @description visitors of the chocolate factory, who can visit the exhibition hall and the exploration hall
 */
public class Visitor extends Person {

    public String identity = "Visitor";

    public int visitCode;

    private Context visitLimit;

    public Visitor(String name, int age, Sex sex) {
        super(name, age, sex);
        String[] persons = {this.identity};
        String[] publicAreas = {"publicArea", "experienceRoom", "exhibitionRoom"};
        this.visitLimit = new Context(persons, publicAreas);
    }

    public Visitor(String name, int age, Sex sex, int visitCode) {
        super(name, age, sex);
        String[] persons = {this.identity};
        String[] publicAreas = {"publicArea", "experienceRoom", "exhibitionRoom"};
        this.visitLimit = new Context(persons, publicAreas);
        this.visitCode = visitCode;
    }


    /**
     * visit a public area
     * However, a visitor can only be allowed to visit some place when it is not full.
     *
     * @param dest destination
     */
    public boolean visit(PublicArea dest) {
        if (!dest.isFull()) {
            System.out.println("Visitor " + this.name + "visits" + dest.toString());
            this.moveTo(dest);
            return true;
        } else {
            System.out.println("Sorry, the" + dest.toString() + "is already full.");
            return false;
        }
    }

    public boolean canEnter(String dest) {
        String move = this.identity + " enter " + dest;
        if (this.visitLimit.canEnter(move)) {
            System.out.println(this.name + " can enter" + dest);
            return true;
        } else {
            System.out.println("Sorry! " + this.name + " cannot enter " + dest);
            return false;
        }
    }

    /**
     * Visitor can only visit the public areas.
     *
     * @param dest destination
     */
    @Override
    public void moveTo(Scene dest) {

        if (this.canEnter(dest.toString())) {
            this.location = dest;
            System.out.println(this.identity + " " + this.name + " moves to " + dest.toString());
        } else {
            System.out.println("Sorry, " + this.identity + " " + this.name + "can 't go to" + dest.toString());
        }
    }

    public int getVisitCode() {
        return visitCode;
    }

    /**
     * set the initial asset of the visitor;
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 1000;
    }

    @Override
    public String toString() {
        return "class Visitor extends Person";
    }
}
