package eng.it.loatool.scenario_subscenarios;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_ACE_SCEN_SUB_SCEN", catalog = "loa_evaluation_tool")
public class ScenarioSubScenarios implements java.io.Serializable {

    private Integer pkTbId;
    private int fkTbAceScenarios;
    private int fkTbAceSubScenRes;
    private Double optionCost;
    private Double totalCost;
    private Double costPerPiece;
    private Integer physicalLoa;
    private Integer cognitiveLoa;
    private Integer totalProcessTime;
    private Integer hoursYear;
    private Double labourCost;
    private Double maintCost;
    private Double annualSpaceCost;
    private Double inputedDepreciation;
    private Double accruedInterestCost;
    private Double energyCost;
    private Double macHourlyRate;
    private Double macCost;
    private Date createDate;
    private Date udpateDate;

    public ScenarioSubScenarios() {
    }

    public ScenarioSubScenarios(int fkTbAceScenarios, int fkTbAceSubScenRes, Date createDate, Date udpateDate) {
        this.fkTbAceScenarios = fkTbAceScenarios;
        this.fkTbAceSubScenRes = fkTbAceSubScenRes;
        this.createDate = createDate;
        this.udpateDate = udpateDate;
    }

    public ScenarioSubScenarios(
        int fkTbAceScenarios, int fkTbAceSubScenRes, Double optionCost, Double totalCost,
        Double costPerPiece, Integer physicalLoa, Integer cognitiveLoa, Integer totalProcessTime, Integer hoursYear,
        Double labourCost, Double maintCost, Double annualSpaceCost, Double inputedDepreciation,
        Double accruedInterestCost, Double energyCost, Double macHourlyRate, Double macCost, Date createDate,
        Date udpateDate
    ) {
        this.fkTbAceScenarios = fkTbAceScenarios;
        this.fkTbAceSubScenRes = fkTbAceSubScenRes;
        this.optionCost = optionCost;
        this.totalCost = totalCost;
        this.costPerPiece = costPerPiece;
        this.physicalLoa = physicalLoa;
        this.cognitiveLoa = cognitiveLoa;
        this.totalProcessTime = totalProcessTime;
        this.hoursYear = hoursYear;
        this.labourCost = labourCost;
        this.maintCost = maintCost;
        this.annualSpaceCost = annualSpaceCost;
        this.inputedDepreciation = inputedDepreciation;
        this.accruedInterestCost = accruedInterestCost;
        this.energyCost = energyCost;
        this.macHourlyRate = macHourlyRate;
        this.macCost = macCost;
        this.createDate = createDate;
        this.udpateDate = udpateDate;
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

    @Column(name = "FK_TB_ACE_SCENARIOS", nullable = false)
    public int getFkTbAceScenarios() {
        return this.fkTbAceScenarios;
    }

    public void setFkTbAceScenarios(int fkTbAceScenarios) {
        this.fkTbAceScenarios = fkTbAceScenarios;
    }

    @Column(name = "FK_TB_ACE_SUB_SCEN_RES", nullable = false)
    public int getFkTbAceSubScenRes() {
        return this.fkTbAceSubScenRes;
    }

    public void setFkTbAceSubScenRes(int fkTbAceSubScenRes) {
        this.fkTbAceSubScenRes = fkTbAceSubScenRes;
    }

    @Column(name = "OPTION_COST", precision = 22, scale = 0)
    public Double getOptionCost() {
        return this.optionCost;
    }

    public void setOptionCost(Double optionCost) {
        this.optionCost = optionCost;
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

    @Column(name = "PHYSICAL_LOA")
    public Integer getPhysicalLoa() {
        return this.physicalLoa;
    }

    public void setPhysicalLoa(Integer physicalLoa) {
        this.physicalLoa = physicalLoa;
    }

    @Column(name = "COGNITIVE_LOA")
    public Integer getCognitiveLoa() {
        return this.cognitiveLoa;
    }

    public void setCognitiveLoa(Integer cognitiveLoa) {
        this.cognitiveLoa = cognitiveLoa;
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

    @Column(name = "MAC_HOURLY_RATE", precision = 22, scale = 0)
    public Double getMacHourlyRate() {
        return this.macHourlyRate;
    }

    public void setMacHourlyRate(Double macHourlyRate) {
        this.macHourlyRate = macHourlyRate;
    }

    @Column(name = "MAC_COST", precision = 22, scale = 0)
    public Double getMacCost() {
        return this.macCost;
    }

    public void setMacCost(Double macCost) {
        this.macCost = macCost;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UDPATE_DATE", nullable = false, length = 19)
    public Date getUdpateDate() {
        return this.udpateDate;
    }

    public void setUdpateDate(Date udpateDate) {
        this.udpateDate = udpateDate;
    }

}