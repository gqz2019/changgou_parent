package com.gqz.goods.pojo;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "undo_log")
@Entity
public class UndoLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "branch_id", nullable = false)
    private Long branchId;

    @Column(name = "xid", nullable = false, length = 100)
    private String xid;

    @Column(name = "rollback_info", nullable = false)
    private byte[] rollbackInfo;

    @Column(name = "log_status", nullable = false)
    private Integer logStatus;

    @Column(name = "log_created")
    private Instant logCreated;

    @Column(name = "log_modified")
    private Instant logModified;

    @Column(name = "ext", length = 100)
    private String ext;

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Instant getLogModified() {
        return logModified;
    }

    public void setLogModified(Instant logModified) {
        this.logModified = logModified;
    }

    public Instant getLogCreated() {
        return logCreated;
    }

    public void setLogCreated(Instant logCreated) {
        this.logCreated = logCreated;
    }

    public Integer getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(Integer logStatus) {
        this.logStatus = logStatus;
    }

    public byte[] getRollbackInfo() {
        return rollbackInfo;
    }

    public void setRollbackInfo(byte[] rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
    }

    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}