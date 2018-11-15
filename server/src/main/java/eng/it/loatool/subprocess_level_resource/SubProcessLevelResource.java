package eng.it.loatool.subprocess_level_resource;
// Generated Sep 24, 2018 11:43:01 AM by Hibernate Tools 5.2.11.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import eng.it.loatool.PkTbPrimaryKeyOwner;
import eng.it.loatool.resource.Resource;
import eng.it.loatool.subprocess_level.SubProcessLevel;

/**
 * TbAceSubProLevRes generated by hbm2java
 */
@Entity @Table(name = "TB_ACE_SUB_PRO_LEV_RES", catalog = "loa_evaluation_tool")
public class SubProcessLevelResource implements java.io.Serializable, PkTbPrimaryKeyOwner {

    @JsonProperty private Integer pkTbId;

    private Resource resource;
    @JsonProperty(access = Access.WRITE_ONLY) private int fkTbAceRes;

    private SubProcessLevel subprocessLevel;
    @JsonProperty(access = Access.WRITE_ONLY) private int fkTbAceSubProLev;

    private Date createDate;
    private Date updateDate;

    public SubProcessLevelResource() {}

    public SubProcessLevelResource(int fkTbAceRes, int fkTbAceSubProLev, Date createDate) {
        this.fkTbAceRes = fkTbAceRes;
        this.fkTbAceSubProLev = fkTbAceSubProLev;
        this.createDate = createDate;
    }

    public SubProcessLevelResource(int fkTbAceRes, int fkTbAceSubProLev, Date createDate, Date updateDate) {
        this.fkTbAceRes = fkTbAceRes;
        this.fkTbAceSubProLev = fkTbAceSubProLev;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    @Override
    @Id @GeneratedValue(strategy = IDENTITY)

    @Column(name = "PK_TB_ID", unique = true, nullable = false) public Integer getPkTbId() {
        return this.pkTbId;
    }

    @Override
    public void setPkTbId(Integer pkTbId) {
        this.pkTbId = pkTbId;
    }

    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name="FK_TB_ACE_RES", referencedColumnName="PK_TB_ID")
    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Transient
    public int getFkTbAceRes() {
        return this.fkTbAceRes;
    }

    public void setFkTbAceRes(int fkTbAceRes) {
        this.fkTbAceRes = fkTbAceRes;
    }

    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name="FK_TB_ACE_SUB_PRO_LEV", referencedColumnName="PK_TB_ID")
    public SubProcessLevel getSubprocessLevel() {
        return subprocessLevel;
    }

    public void setSubprocessLevel(SubProcessLevel subprocessLevel) {
        this.subprocessLevel = subprocessLevel;
    }

    @Transient
    public int getFkTbAceSubProLev() {
        return this.fkTbAceSubProLev;
    }

    public void setFkTbAceSubProLev(int fkTbAceSubProLev) {
        this.fkTbAceSubProLev = fkTbAceSubProLev;
    }

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", nullable = false, length = 19, insertable = true, updatable = false)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DATE", nullable = false, length = 19)
    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "SubProcessLevelResource [pkTbId=" + pkTbId + ", resource=" + resource + ", fkTbAceRes=" + fkTbAceRes + ", subprocessLevel=" + subprocessLevel + ", fkTbAceSubProLev=" + fkTbAceSubProLev + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
    }

}
