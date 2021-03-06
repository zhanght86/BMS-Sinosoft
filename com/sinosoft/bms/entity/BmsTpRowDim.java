package com.sinosoft.bms.entity;
// Generated 2009-5-19 11:36:47 by Hibernate Tools 3.1.0.beta4

import java.util.HashSet;
import java.util.Set;


/**
 * BmsTpRowDim generated by hbm2java
 */

public class BmsTpRowDim  implements java.io.Serializable {


    // Fields    

     private int tpRowDimId;
     private BmsItem bmsItem;
     private BmsTemplet bmsTemplet;
     private Set bmsSheetItems = new HashSet(0);


    // Constructors

    /** default constructor */
    public BmsTpRowDim() {
    }

	/** minimal constructor */
    public BmsTpRowDim(int tpRowDimId) {
        this.tpRowDimId = tpRowDimId;
    }
    
    /** full constructor */
    public BmsTpRowDim(int tpRowDimId, BmsItem bmsItem, BmsTemplet bmsTemplet, Set bmsSheetItems) {
        this.tpRowDimId = tpRowDimId;
        this.bmsItem = bmsItem;
        this.bmsTemplet = bmsTemplet;
        this.bmsSheetItems = bmsSheetItems;
    }
    

   
    // Property accessors

    public int getTpRowDimId() {
        return this.tpRowDimId;
    }
    
    public void setTpRowDimId(int tpRowDimId) {
        this.tpRowDimId = tpRowDimId;
    }

    public BmsItem getBmsItem() {
        return this.bmsItem;
    }
    
    public void setBmsItem(BmsItem bmsItem) {
        this.bmsItem = bmsItem;
    }

    public BmsTemplet getBmsTemplet() {
        return this.bmsTemplet;
    }
    
    public void setBmsTemplet(BmsTemplet bmsTemplet) {
        this.bmsTemplet = bmsTemplet;
    }

    public Set getBmsSheetItems() {
        return this.bmsSheetItems;
    }
    
    public void setBmsSheetItems(Set bmsSheetItems) {
        this.bmsSheetItems = bmsSheetItems;
    }
   








}
