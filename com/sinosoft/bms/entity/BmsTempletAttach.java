package com.sinosoft.bms.entity;
// Generated 2009-5-19 11:36:47 by Hibernate Tools 3.1.0.beta4



/**
 * BmsTempletAttach generated by hbm2java
 */

public class BmsTempletAttach  implements java.io.Serializable {


    // Fields    

     private int attachId;
     private BmsTemplet bmsTemplet;
     private String attachDispName;
     private String attachServerName;
     private String uploadTime;


    // Constructors

    /** default constructor */
    public BmsTempletAttach() {
    }

	/** minimal constructor */
    public BmsTempletAttach(int attachId) {
        this.attachId = attachId;
    }
    
    /** full constructor */
    public BmsTempletAttach(int attachId, BmsTemplet bmsTemplet, String attachDispName, String attachServerName, String uploadTime) {
        this.attachId = attachId;
        this.bmsTemplet = bmsTemplet;
        this.attachDispName = attachDispName;
        this.attachServerName = attachServerName;
        this.uploadTime = uploadTime;
    }
    

   
    // Property accessors

    public int getAttachId() {
        return this.attachId;
    }
    
    public void setAttachId(int attachId) {
        this.attachId = attachId;
    }

    public BmsTemplet getBmsTemplet() {
        return this.bmsTemplet;
    }
    
    public void setBmsTemplet(BmsTemplet bmsTemplet) {
        this.bmsTemplet = bmsTemplet;
    }

    public String getAttachDispName() {
        return this.attachDispName;
    }
    
    public void setAttachDispName(String attachDispName) {
        this.attachDispName = attachDispName;
    }

    public String getAttachServerName() {
        return this.attachServerName;
    }
    
    public void setAttachServerName(String attachServerName) {
        this.attachServerName = attachServerName;
    }

    public String getUploadTime() {
        return this.uploadTime;
    }
    
    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }
   








}