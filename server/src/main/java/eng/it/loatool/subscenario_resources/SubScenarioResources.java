package eng.it.loatool.subscenario_resources;
// Generated Sep 21, 2018 4:03:34 PM by Hibernate Tools 5.2.11.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbAceSubScenRes generated by hbm2java
 */
@Entity @Table(name = "TB_ACE_SUB_SCEN_RES", catalog = "loa_evaluation_tool"
) public class SubScenarioResources implements java.io.Serializable {

    private Integer pkTbId;
    private int fkTbAceSubScenarios;
    private int scenarioNumber;
    private int processTime;
    private Double assemblyCostPerPiece;
    private Double assemblyCosts;
    private Integer usPhysicalLoa;
    private Integer usCognitiveLoa;
    private Date createDate;
    private Date updateDate;

    public SubScenarioResources() {}

    public SubScenarioResources(int fkTbAceSubScenarios, int scenarioNumber, int processTime, Date createDate, Date updateDate) {
        this.fkTbAceSubScenarios = fkTbAceSubScenarios;
        this.scenarioNumber = scenarioNumber;
        this.processTime = processTime;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public SubScenarioResources(int fkTbAceSubScenarios, int scenarioNumber, int processTime, Double assemblyCostPerPiece, Double assemblyCosts, Integer usPhysicalLoa, Integer usCognitiveLoa, Date createDate, Date updateDate) {
        this.fkTbAceSubScenarios = fkTbAceSubScenarios;
        this.scenarioNumber = scenarioNumber;
        this.processTime = processTime;
        this.assemblyCostPerPiece = assemblyCostPerPiece;
        this.assemblyCosts = assemblyCosts;
        this.usPhysicalLoa = usPhysicalLoa;
        this.usCognitiveLoa = usCognitiveLoa;
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

    @Column(name = "FK_TB_ACE_SUB_SCENARIOS", nullable = false) public int getFkTbAceSubScenarios() {
        return this.fkTbAceSubScenarios;
    }

    public void setFkTbAceSubScenarios(int fkTbAceSubScenarios) {
        this.fkTbAceSubScenarios = fkTbAceSubScenarios;
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
