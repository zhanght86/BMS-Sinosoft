package com.sinosoft.bms.entity;
// Generated 2009-5-19 11:36:47 by Hibernate Tools 3.1.0.beta4



/**
 * BmsGsrowDim generated by hbm2java
 */

public class BmsGsrowDim  implements java.io.Serializable {


    // Fields    

     private BmsGsrowDimId id;
     private BmsItem bmsItem;
     private BmsSheet bmsSheet;


    // Constructors

    /** default constructor */
    public BmsGsrowDim() {
    }

	/** minimal constructor */
    public BmsGsrowDim(BmsGsrowDimId id) {
        this.id = id;
    }
    
    /** full constructor */
    public BmsGsrowDim(BmsGsrowDimId id, BmsItem bmsItem, BmsSheet bmsSheet) {
        this.id = id;
        this.bmsItem = bmsItem;
        this.bmsSheet = bmsSheet;
    }
    

   
    // Property accessors

    public BmsGsrowDimId getId() {
        return this.id;
    }
    
    public void setId(BmsGsrowDimId id) {
        this.id = id;
    }

    public BmsItem getBmsItem() {
        return this.bmsItem;
    }
    
    public void setBmsItem(BmsItem bmsItem) {
        this.bmsItem = bmsItem;
    }

    public BmsSheet getBmsSheet() {
        return this.bmsSheet;
    }
    
    public void setBmsSheet(BmsSheet bmsSheet) {
        this.bmsSheet = bmsSheet;
    }
   








}