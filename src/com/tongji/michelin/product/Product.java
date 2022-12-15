package com.tongji.michelin.product;

import com.tongji.michelin.machine.processmachine.ProcessMachine;
import com.tongji.michelin.machine.processmachine.productmachine.BasicProductMachine;
import com.tongji.michelin.machine.processmachine.wrappermachine.WrapperMachine;
import com.tongji.michelin.product.memento.ProductMemento;
import com.tongji.michelin.product.state.PackagedState;
import com.tongji.michelin.product.state.ProducingState;
import com.tongji.michelin.product.state.ProductState;
import com.tongji.michelin.rawmaterial.packagematerial.PackageMaterial;
import com.tongji.michelin.rawmaterial.RawMaterial;

import java.util.ArrayList;

/**
 * @Author qxh
 * @Description the basic class of all food
 **/

public abstract class Product {
    protected String productName;

    protected String producedDate; // yyyy-mm-dd

    protected int shelfLife; // how many month

    protected int weight; // weight of single item, in gram

    public ProcessMachine produceMachine, wrapperMachine;

    protected ProductState state;

    protected PackageMaterial pack;

    public ArrayList<RawMaterial> ingredientList;

    /**
     * @param name
     * @param shelfLife how many month
     */
    public Product(String name, int shelfLife, int weight) {
        this.productName = name;
        this.shelfLife = shelfLife;
        this.producedDate = null;
        this.state = new ProducingState();
        this.weight = weight;
        this.ingredientList = new ArrayList<RawMaterial>();
        this.produceMachine = new BasicProductMachine("PR", "220");
        this.wrapperMachine = new WrapperMachine("PA", "118", 40, 1, 500);
    }

// methods

    /**
     * @param name the certain product's name
     */
    protected void setName(String name) {
        this.productName = name;
    }

    /**
     * set the name of the product
     *
     * @return product's name
     */
    public String getName() {
        return this.productName;
    }

    /**
     * @return the state of the product
     */
    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    /**
     * this product is in the next state.
     */
    public void gotoNextState() {
        state.gotoNextState(this);
    }

    /**
     * @param date template yyyy-mm-dd
     */
    public void setProducedDate(String date) {
        if (this.producedDate == null) {
            this.producedDate = date;
        } else {
            System.out.println("Warning! The producedDate mustn't be modified after the product being produced!");
        }
    }

    /**
     * @return the producedDate of the product
     */
    public String getProducedDate() {
        return this.producedDate;
    }

    /**
     * set the shelf life of th product
     *
     * @param shelfLife how many month
     */
    protected void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    /**
     * @return the shelf life of the product
     */
    public int getShelfLife() {
        return this.shelfLife;
    }


    /**
     * set the weight of this product's single item
     *
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the weight of this product's single item, in gram
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * set the weight of this product's single item
     *
     * @param pack pack
     */
    public void setPack(PackageMaterial pack) {
        this.pack = pack;
    }

    /**
     * set wrapper machine of the product
     * @param wrapperMachine
     */
    public void setWrapperMachine(ProcessMachine wrapperMachine) {
        this.wrapperMachine = wrapperMachine;
    }

    /**
     * set produce machine of the product
     * @param produceMachine
     */
    public void setProduceMachine(ProcessMachine produceMachine) {
        this.produceMachine = produceMachine;
    }

    /**
     * produce the product
     */
    public void producing() {
        this.produceMachine.process(this, 1);
    }

    /**
     * package the product
     */
    public void packaging() {
        this.wrapperMachine.process(this, 1);
    }

    /**
     * store the product
     */
    public void storing() {
        if (!(this.state instanceof PackagedState)) {
            System.out.println("The product has not been packaged!");
            return;
        }
        System.out.println("Transporting " + getName() + " to the warehouse.");
        this.gotoNextState();
    }

    /**
     * initialize the ingredient list of the product
     */
    protected abstract void initIngredientList();

    /**
     * for design pattern --- Memento
     *
     * @return a new product memento
     */
    public ProductMemento createMemento() {
        return new ProductMemento(this.weight);
    }

    /**
     * restore param from memento
     *
     * @param memento memento that store history messages of the product
     */
    public void restoreMemento(ProductMemento memento) {
        this.weight = memento.getWeight();
    }
}
