package eng.it.loatool.scenario_resource;
// Generated Nov 14, 2018 1:28:54 PM by Hibernate Tools 5.2.11.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import eng.it.loatool.PkTbPrimaryKeyOwner;

/**
 * TbAceScenarioRes generated by hbm2java
 */
@Entity
@Table(name = "TB_ACE_SCENARIO_RES", catalog = "loa_evaluation_tool")
public class ScenarioResource implements java.io.Serializable, PkTbPrimaryKeyOwner {

    @JsonProperty private Integer pkTbId;
    private int fkTbAceSubProLev;
    private int fkTbAceRes;
    private Date createDate;
    private Date updateDate;
    private int fkTbAceScenarios;
    private double optionalCost;
    private double weightedPhysicalLoa;
    private double weightedCognitiveLoa;

    public ScenarioResource() {}

    public ScenarioResource(int fkTbAceSubProLev, int fkTbAceRes, Date createDate, Date updateDate, int fkTbAceScenarios, double optionalCost, double weightedPhysicalLoa, double weightedCognitiveLoa) {
        this.fkTbAceSubProLev = fkTbAceSubProLev;
        this.fkTbAceRes = fkTbAceRes;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.fkTbAceScenarios = fkTbAceScenarios;
        this.optionalCost = optionalCost;
        this.weightedPhysicalLoa = weightedPhysicalLoa;
        this.weightedCognitiveLoa = weightedCognitiveLoa;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "PK_TB_ID", unique = true, nullable = false)
    public Integer getPkTbId() {
        return this.pkTbId;
    }

    public void setPkTbId(Integer pkTbId) {
        this.pkTbId = pkTbId;
    }

    @Column(name = "FK_TB_ACE_SUB_PRO_LEV", nullable = false)
    public int getFkTbAceSubProLev() {
        return this.fkTbAceSubProLev;
    }

    public void setFkTbAceSubProLev(int fkTbAceSubProLev) {
        this.fkTbAceSubProLev = fkTbAceSubProLev;
    }

    @Column(name = "FK_TB_ACE_RES", nullable = false)
    public int getFkTbAceRes() {
        return this.fkTbAceRes;
    }

    public void setFkTbAceRes(int fkTbAceRes) {
        this.fkTbAceRes = fkTbAceRes;
    }

    @Column(name = "FK_TB_ACE_SCENARIOS", nullable = false)
    public int getFkTbAceScenarios() {
        return this.fkTbAceScenarios;
    }

    public void setFkTbAceScenarios(int fkTbAceScenarios) {
        this.fkTbAceScenarios = fkTbAceScenarios;
    }

    @Column(name = "OPTIONAL_COST", nullable = false, precision = 22, scale = 0)
    public double getOptionalCost() {
        return this.optionalCost;
    }

    public void setOptionalCost(double optionalCost) {
        this.optionalCost = optionalCost;
    }

    @Column(name = "WEIGHTED_PHYSICAL_LOA", nullable = false, precision = 22, scale = 0)
    public double getWeightedPhysicalLoa() {
        return this.weightedPhysicalLoa;
    }

    public void setWeightedPhysicalLoa(double weightedPhysicalLoa) {
        this.weightedPhysicalLoa = weightedPhysicalLoa;
    }

    @Column(name = "WEIGHTED_COGNITIVE_LOA", nullable = false, precision = 22, scale = 0)
    public double getWeightedCognitiveLoa() {
        return this.weightedCognitiveLoa;
    }

    public void setWeightedCognitiveLoa(double weightedCognitiveLoa) {
        this.weightedCognitiveLoa = weightedCognitiveLoa;
    }


    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", updatable = false, nullable = false, length = 19)
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

}