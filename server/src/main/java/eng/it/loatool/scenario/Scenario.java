package eng.it.loatool.scenario;
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
 * TbAceScenarios generated by hbm2java
 */
@Entity
@Table(name = "TB_ACE_SCENARIOS", catalog = "loa_evaluation_tool")
public class Scenario implements java.io.Serializable, PkTbPrimaryKeyOwner {

    @JsonProperty private Integer pkTbId;
    private Double totalCost;
    private Double costPerPiece;
    private Integer totalProcessTime;
    private Integer hoursYear;
    private Double labourCost;
    private Double maintCost;
    private Double annualSpaceCost;
    private Double inputedDepreciation;
    private Double accruedInterestCost;
    private Double energyCost;
    private Double varCostsPerUnit;
    private Double macCost;
    private Date createDate;
    private Date udpateDate;
    private Integer fkTbAceProSeq;
    private Integer scenarioNumber;
    private Double totWeightedPhysicalLoa;
    private Double totWeightedCognitiveLoa;
    private Integer prodUnitsPerYears;
    private Double assCostsPerUnits;
    private Double totalAssCosts;
    private Boolean resRecal;

    public Scenario() {}

    public Scenario(Date createDate, Date udpateDate, Integer fkTbAceProSeq, Integer scenarioNumber) {
        this.createDate = createDate;
        this.udpateDate = udpateDate;
        this.fkTbAceProSeq = fkTbAceProSeq;
        this.scenarioNumber = scenarioNumber;
    }

    public Scenario(Double totalCost, Double costPerPiece, Integer totalProcessTime, Integer hoursYear, Double labourCost, Double maintCost, Double annualSpaceCost, Double inputedDepreciation, Double accruedInterestCost, Double energyCost, Double varCostsPerUnit, Double macCost, Date createDate, Date udpateDate, Integer fkTbAceProSeq, Integer scenarioNumber, Double totWeightedPhysicalLoa, Double totWeightedCognitiveLoa, Integer prodUnitsPerYears, Double assCostsPerUnits, Double totalAssCosts, Boolean resRecal) {
        this.totalCost = totalCost;
        this.costPerPiece = costPerPiece;
        this.totalProcessTime = totalProcessTime;
        this.hoursYear = hoursYear;
        this.labourCost = labourCost;
        this.maintCost = maintCost;
        this.annualSpaceCost = annualSpaceCost;
        this.inputedDepreciation = inputedDepreciation;
        this.accruedInterestCost = accruedInterestCost;
        this.energyCost = energyCost;
        this.varCostsPerUnit = varCostsPerUnit;
        this.macCost = macCost;
        this.createDate = createDate;
        this.udpateDate = udpateDate;
        this.fkTbAceProSeq = fkTbAceProSeq;
        this.scenarioNumber = scenarioNumber;
        this.totWeightedPhysicalLoa = totWeightedPhysicalLoa;
        this.totWeightedCognitiveLoa = totWeightedCognitiveLoa;
        this.prodUnitsPerYears = prodUnitsPerYears;
        this.assCostsPerUnits = assCostsPerUnits;
        this.totalAssCosts = totalAssCosts;
        this.resRecal = resRecal;
    }

    @Override
    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "PK_TB_ID", unique = true, nullable = false)
    public Integer getPkTbId() {
        return this.pkTbId;
    }

    @Override
    public void setPkTbId(Integer pkTbId) {
        this.pkTbId = pkTbId;
    }

    @Column(name = "TOTAL_COST", precision = 22, scale = 0)
    public Double getTotalCost() {
        return this.totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    @Column(name = "COST_PER_PIECE", precision = 22, scale = 0)
    public Double getCostPerPiece() {
        return this.costPerPiece;
    }

    public void setCostPerPiece(Double costPerPiece) {
        this.costPerPiece = costPerPiece;
    }

    @Column(name = "TOTAL_PROCESS_TIME")
    public Integer getTotalProcessTime() {
        return this.totalProcessTime;
    }

    public void setTotalProcessTime(Integer totalProcessTime) {
        this.totalProcessTime = totalProcessTime;
    }

    @Column(name = "HOURS_YEAR")
    public Integer getHoursYear() {
        return this.hoursYear;
    }

    public void setHoursYear(Integer hoursYear) {
        this.hoursYear = hoursYear;
    }

    @Column(name = "LABOUR_COST", precision = 22, scale = 0)
    public Double getLabourCost() {
        return this.labourCost;
    }

    public void setLabourCost(Double labourCost) {
        this.labourCost = labourCost;
    }

    @Column(name = "MAINT_COST", precision = 22, scale = 0)
    public Double getMaintCost() {
        return this.maintCost;
    }

    public void setMaintCost(Double maintCost) {
        this.maintCost = maintCost;
    }

    @Column(name = "ANNUAL_SPACE_COST", precision = 22, scale = 0)
    public Double getAnnualSpaceCost() {
        return this.annualSpaceCost;
    }

    public void setAnnualSpaceCost(Double annualSpaceCost) {
        this.annualSpaceCost = annualSpaceCost;
    }

    @Column(name = "INPUTED_DEPRECIATION", precision = 22, scale = 0)
    public Double getInputedDepreciation() {
        return this.inputedDepreciation;
    }

    public void setInputedDepreciation(Double inputedDepreciation) {
        this.inputedDepreciation = inputedDepreciation;
    }

    @Column(name = "ACCRUED_INTEREST_COST", precision = 22, scale = 0)
    public Double getAccruedInterestCost() {
        return this.accruedInterestCost;
    }

    public void setAccruedInterestCost(Double accruedInterestCost) {
        this.accruedInterestCost = accruedInterestCost;
    }

    @Column(name = "ENERGY_COST", precision = 22, scale = 0)
    public Double getEnergyCost() {
        return this.energyCost;
    }

    public void setEnergyCost(Double energyCost) {
        this.energyCost = energyCost;
    }

    @Column(name = "VAR_COSTS_PER_UNIT", precision = 22, scale = 0)
    public Double getVarCostsPerUnit() {
        return this.varCostsPerUnit;
    }

    public void setVarCostsPerUnit(Double varCostsPerUnit) {
        this.varCostsPerUnit = varCostsPerUnit;
    }

    @Column(name = "MAC_COST", precision = 22, scale = 0)
    public Double getMacCost() {
        return this.macCost;
    }

    public void setMacCost(Double macCost) {
        this.macCost = macCost;
    }

    @Column(name = "FK_TB_ACE_PRO_SEQ", nullable = false)
    public Integer getFkTbAceProSeq() {
        return this.fkTbAceProSeq;
    }

    public void setFkTbAceProSeq(Integer fkTbAceProSeq) {
        this.fkTbAceProSeq = fkTbAceProSeq;
    }

    @Column(name = "SCENARIO_NUMBER", nullable = false)
    public Integer getScenarioNumber() {
        return this.scenarioNumber;
    }

    public void setScenarioNumber(Integer scenarioNumber) {
        this.scenarioNumber = scenarioNumber;
    }

    @Column(name = "TOT_WEIGHTED_PHYSICAL_LOA", precision = 22, scale = 0)
    public Double getTotWeightedPhysicalLoa() {
        return this.totWeightedPhysicalLoa;
    }

    public void setTotWeightedPhysicalLoa(Double totWeightedPhysicalLoa) {
        this.totWeightedPhysicalLoa = totWeightedPhysicalLoa;
    }

    @Column(name = "TOT_WEIGHTED_COGNITIVE_LOA", precision = 22, scale = 0)
    public Double getTotWeightedCognitiveLoa() {
        return this.totWeightedCognitiveLoa;
    }

    public void setTotWeightedCognitiveLoa(Double totWeightedCognitiveLoa) {
        this.totWeightedCognitiveLoa = totWeightedCognitiveLoa;
    }

    @Column(name = "PROD_UNITS_PER_YEARS")
    public Integer getProdUnitsPerYears() {
        return this.prodUnitsPerYears;
    }

    public void setProdUnitsPerYears(Integer prodUnitsPerYears) {
        this.prodUnitsPerYears = prodUnitsPerYears;
    }

    @Column(name = "ASS_COSTS_PER_UNITS", precision = 22, scale = 0)
    public Double getAssCostsPerUnits() {
        return this.assCostsPerUnits;
    }

    public void setAssCostsPerUnits(Double assCostsPerUnits) {
        this.assCostsPerUnits = assCostsPerUnits;
    }

    @Column(name = "TOTAL_ASS_COSTS", precision = 22, scale = 0)
    public Double getTotalAssCosts() {
        return this.totalAssCosts;
    }

    public void setTotalAssCosts(Double totalAssCosts) {
        this.totalAssCosts = totalAssCosts;
    }

    @Column(name = "RES_RECAL")
    public Boolean getResRecal() {
        return this.resRecal;
    }

    public void setResRecal(Boolean resRecal) {
        this.resRecal = resRecal;
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
    @Column(name = "UDPATE_DATE", nullable = false, length = 19)
    public Date getUpdateDate() {
        return this.udpateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.udpateDate = updateDate;
    }

}
