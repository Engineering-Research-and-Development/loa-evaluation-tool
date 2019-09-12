package eng.it.loatool.subprocess_level;
// Generated Sep 24, 2018 11:43:01 AM by Hibernate Tools 5.2.11.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eng.it.loatool.process_loa_info.ProcessLOAInformation;
import eng.it.loatool.subscenario.SubScenario;

/**
 * TbAceSubProLev generated by hbm2java
 */
@Entity @Table(name = "TB_ACE_SUB_PRO_LEV", catalog = "loa_evaluation_tool"
) public class SubProcessLevel implements java.io.Serializable {

    private Integer pkTbId;
    private Integer fkTbAceProSeq;
    private String name;
    private Integer proLevel;
    private String varProSeqId;
    private ProcessLOAInformation loaInfo;
    private ProcessLOAInformation loaInfoCognitive;
    @JsonIgnore private Set<SubScenario> subscenarios;
    private Date createDate;
    private Date udpateDate;

    public SubProcessLevel() {}

    public SubProcessLevel(Integer fkTbAceProSeq, String name, Integer proLevel, String varProSeqId, Date createDate, Date udpateDate) {
        this.fkTbAceProSeq = fkTbAceProSeq;
        this.name = name;
        this.proLevel = proLevel;
        this.varProSeqId = varProSeqId;
        this.createDate = createDate;
        this.udpateDate = udpateDate;
    }

    @Id @GeneratedValue(strategy = IDENTITY)

    @Column(name = "PK_TB_ID", unique = true, nullable = false) public Integer getPkTbId() {
        return this.pkTbId;
    }

    public void setPkTbId(Integer pkTbId) {
        this.pkTbId = pkTbId;
    }

    @Column(name = "FK_TB_ACE_PRO_SEQ", nullable = false)
    public Integer getFkTbAceProSeq() {
        return this.fkTbAceProSeq;
    }

    public void setFkTbAceProSeq(Integer fkTbAceProSeq) {
        this.fkTbAceProSeq = fkTbAceProSeq;
    }

    @Column(name = "NAME", nullable = false, length = 45) public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "PRO_LEVEL", nullable = false) public Integer getProLevel() {
        return this.proLevel;
    }

    public void setProLevel(Integer proLevel) {
        this.proLevel = proLevel;
    }

    @Column(name = "VAR_PRO_SEQ_ID", nullable = false, length = 45) public String getVarProSeqId() {
        return this.varProSeqId;
    }

    public void setVarProSeqId(String varProSeqId) {
        this.varProSeqId = varProSeqId;
    }

    @Transient
    public ProcessLOAInformation getLoaInfo() {
        return loaInfo;
    }

    public void setLoaInfo(ProcessLOAInformation loaInfo) {
        this.loaInfo = loaInfo;
    }

    @Transient
    public ProcessLOAInformation getLoaInfoCognitive() {
        return loaInfoCognitive;
    }

    public void setLoaInfoCognitive(ProcessLOAInformation loaInfoCognitive) {
        this.loaInfoCognitive = loaInfoCognitive;
    }

    @OneToMany(mappedBy="subprocessLevel", cascade=CascadeType.REMOVE)
    public Set<SubScenario> getSubscenarios() {
        return subscenarios;
    }

    public void setSubscenarios(Set<SubScenario> subscenarios) {
        this.subscenarios = subscenarios;
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
    @Column(name = "UDPATE_DATE", nullable = false, length = 19)
    public Date getUpdateDate() {
        return this.udpateDate;
    }

    public void setUpdateDate(Date udpateDate) {
        this.udpateDate = udpateDate;
    }

}
