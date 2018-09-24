package eng.it.loatool.subscenario;
// Generated Sep 24, 2018 11:43:01 AM by Hibernate Tools 5.2.11.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import eng.it.loatool.PkTbPrimaryKeyOwner;

/**
 * TbAceSubScenarios generated by hbm2java
 */
@Entity @Table(name = "TB_ACE_SUB_SCENARIOS", catalog = "loa_evaluation_tool")
public class SubScenario implements java.io.Serializable, PkTbPrimaryKeyOwner {

    private Integer pkTbId;
    private int fkTbAceProSeq;
    private int fkTbAceSubProLev;
    private int fkTbAceRes;
    private int scenarioNumber;
    private int processTime;
    private Double assemblyCostPerPiece;
    private Double assemblyCosts;
    private Integer usPhysicalLoa;
    private Integer usCognitiveLoa;
    private Integer hoursPerYears;
    private Double NProdPieces;
    private Double labourCost;
    private Double energyCost;
    private Double maintCost;
    private Double annualSpaceCost;
    private Double inputedDepreciation;
    private Double rateOfPart;
    private Double accruedIntCosts;
    private Double varCostTotal;
    private Double fixedCostTotal;
    private Double assemCostPerPieces;
    private Double assemCostTotal;
    private Date createDate;
    private Date updateDate;

    public SubScenario() {}

    public SubScenario(int fkTbAceProSeq, int fkTbAceSubProLev, int fkTbAceRes, int scenarioNumber, int processTime, Date createDate, Date updateDate) {
        this.fkTbAceProSeq = fkTbAceProSeq;
        this.fkTbAceSubProLev = fkTbAceSubProLev;
        this.fkTbAceRes = fkTbAceRes;
        this.scenarioNumber = scenarioNumber;
        this.processTime = processTime;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public SubScenario(int fkTbAceProSeq, int fkTbAceSubProLev, int fkTbAceRes, int scenarioNumber, int processTime, Double assemblyCostPerPiece, Double assemblyCosts, Integer usPhysicalLoa, Integer usCognitiveLoa, Integer hoursPerYears, Double NProdPieces, Double labourCost, Double energyCost, Double maintCost, Double annualSpaceCost, Double inputedDepreciation, Double rateOfPart, Double accruedIntCosts, Double varCostTotal, Double fixedCostTotal, Double assemCostPerPieces, Double assemCostTotal, Date createDate, Date updateDate) {
        this.fkTbAceProSeq = fkTbAceProSeq;
        this.fkTbAceSubProLev = fkTbAceSubProLev;
        this.fkTbAceRes = fkTbAceRes;
        this.scenarioNumber = scenarioNumber;
        this.processTime = processTime;
        this.assemblyCostPerPiece = assemblyCostPerPiece;
        this.assemblyCosts = assemblyCosts;
        this.usPhysicalLoa = usPhysicalLoa;
        this.usCognitiveLoa = usCognitiveLoa;
        this.hoursPerYears = hoursPerYears;
        this.NProdPieces = NProdPieces;
        this.labourCost = labourCost;
        this.energyCost = energyCost;
        this.maintCost = maintCost;
        this.annualSpaceCost = annualSpaceCost;
        this.inputedDepreciation = inputedDepreciation;
        this.rateOfPart = rateOfPart;
        this.accruedIntCosts = accruedIntCosts;
        this.varCostTotal = varCostTotal;
        this.fixedCostTotal = fixedCostTotal;
        this.assemCostPerPieces = assemCostPerPieces;
        this.assemCostTotal = assemCostTotal;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    @Id @GeneratedValue(strategy = IDENTITY)

    @Column(name = "PK_TB_ID", unique = true, nullable = false) public Integer getPkTbId() {
        return this.pkTbId;
    }

    public void setPkTbId(Integer pkTbId) {
        this.pkTbId = pkTbId;
    }

    @Column(name = "FK_TB_ACE_PRO_SEQ", nullable = false) public int getFkTbAceProSeq() {
        return this.fkTbAceProSeq;
    }

    public void setFkTbAceProSeq(int fkTbAceProSeq) {
        this.fkTbAceProSeq = fkTbAceProSeq;
    }

    @Column(name = "FK_TB_ACE_SUB_PRO_LEV", nullable = false) public int getFkTbAceSubProLev() {
        return this.fkTbAceSubProLev;
    }

    public void setFkTbAceSubProLev(int fkTbAceSubProLev) {
        this.fkTbAceSubProLev = fkTbAceSubProLev;
    }

    @Column(name = "FK_TB_ACE_RES", nullable = false) public int getFkTbAceRes() {
        return this.fkTbAceRes;
    }

    public void setFkTbAceRes(int fkTbAceRes) {
        this.fkTbAceRes = fkTbAceRes;
    }

    @Column(name = "SCENARIO_NUMBER", nullable = false) public int getScenarioNumber() {
        return this.scenarioNumber;
    }

    public void setScenarioNumber(int scenarioNumber) {
        this.scenarioNumber = scenarioNumber;
    }

    @Column(name = "PROCESS_TIME", nullable = false) public int getProcessTime() {
        return this.processTime;
    }

    public void setProcessTime(int processTime) {
        this.processTime = processTime;
    }

    @Column(name = "ASSEMBLY_COST_PER_PIECE", precision = 22, scale = 0) public Double getAssemblyCostPerPiece() {
        return this.assemblyCostPerPiece;
    }

    public void setAssemblyCostPerPiece(Double assemblyCostPerPiece) {
        this.assemblyCostPerPiece = assemblyCostPerPiece;
    }

    @Column(name = "ASSEMBLY_COSTS", precision = 22, scale = 0) public Double getAssemblyCosts() {
        return this.assemblyCosts;
    }

    public void setAssemblyCosts(Double assemblyCosts) {
        this.assemblyCosts = assemblyCosts;
    }

    @Column(name = "US_PHYSICAL_LOA") public Integer getUsPhysicalLoa() {
        return this.usPhysicalLoa;
    }

    public void setUsPhysicalLoa(Integer usPhysicalLoa) {
        this.usPhysicalLoa = usPhysicalLoa;
    }

    @Column(name = "US_COGNITIVE_LOA") public Integer getUsCognitiveLoa() {
        return this.usCognitiveLoa;
    }

    public void setUsCognitiveLoa(Integer usCognitiveLoa) {
        this.usCognitiveLoa = usCognitiveLoa;
    }

    @Column(name = "HOURS_PER_YEARS") public Integer getHoursPerYears() {
        return this.hoursPerYears;
    }

    public void setHoursPerYears(Integer hoursPerYears) {
        this.hoursPerYears = hoursPerYears;
    }

    @Column(name = "N_PROD_PIECES", precision = 22, scale = 0) public Double getNProdPieces() {
        return this.NProdPieces;
    }

    public void setNProdPieces(Double NProdPieces) {
        this.NProdPieces = NProdPieces;
    }

    @Column(name = "LABOUR_COST", precision = 22, scale = 0) public Double getLabourCost() {
        return this.labourCost;
    }

    public void setLabourCost(Double labourCost) {
        this.labourCost = labourCost;
    }

    @Column(name = "ENERGY_COST", precision = 22, scale = 0) public Double getEnergyCost() {
        return this.energyCost;
    }

    public void setEnergyCost(Double energyCost) {
        this.energyCost = energyCost;
    }

    @Column(name = "MAINT_COST", precision = 22, scale = 0) public Double getMaintCost() {
        return this.maintCost;
    }

    public void setMaintCost(Double maintCost) {
        this.maintCost = maintCost;
    }

    @Column(name = "ANNUAL_SPACE_COST", precision = 22, scale = 0) public Double getAnnualSpaceCost() {
        return this.annualSpaceCost;
    }

    public void setAnnualSpaceCost(Double annualSpaceCost) {
        this.annualSpaceCost = annualSpaceCost;
    }

    @Column(name = "INPUTED_DEPRECIATION", precision = 22, scale = 0) public Double getInputedDepreciation() {
        return this.inputedDepreciation;
    }

    public void setInputedDepreciation(Double inputedDepreciation) {
        this.inputedDepreciation = inputedDepreciation;
    }

    @Column(name = "RATE_OF_PART", precision = 22, scale = 0) public Double getRateOfPart() {
        return this.rateOfPart;
    }

    public void setRateOfPart(Double rateOfPart) {
        this.rateOfPart = rateOfPart;
    }

    @Column(name = "ACCRUED_INT_COSTS", precision = 22, scale = 0) public Double getAccruedIntCosts() {
        return this.accruedIntCosts;
    }

    public void setAccruedIntCosts(Double accruedIntCosts) {
        this.accruedIntCosts = accruedIntCosts;
    }

    @Column(name = "VAR_COST_TOTAL", precision = 22, scale = 0) public Double getVarCostTotal() {
        return this.varCostTotal;
    }

    public void setVarCostTotal(Double varCostTotal) {
        this.varCostTotal = varCostTotal;
    }

    @Column(name = "FIXED_COST_TOTAL", precision = 22, scale = 0) public Double getFixedCostTotal() {
        return this.fixedCostTotal;
    }

    public void setFixedCostTotal(Double fixedCostTotal) {
        this.fixedCostTotal = fixedCostTotal;
    }

    @Column(name = "ASSEM_COST_PER_PIECES", precision = 22, scale = 0) public Double getAssemCostPerPieces() {
        return this.assemCostPerPieces;
    }

    public void setAssemCostPerPieces(Double assemCostPerPieces) {
        this.assemCostPerPieces = assemCostPerPieces;
    }

    @Column(name = "ASSEM_COST_TOTAL", precision = 22, scale = 0) public Double getAssemCostTotal() {
        return this.assemCostTotal;
    }

    public void setAssemCostTotal(Double assemCostTotal) {
        this.assemCostTotal = assemCostTotal;
    }

    @Temporal(TemporalType.TIMESTAMP) @Column(name = "CREATE_DATE", nullable = false, length = 19) public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Temporal(TemporalType.TIMESTAMP) @Column(name = "UPDATE_DATE", nullable = false, length = 19) public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
