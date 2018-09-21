package eng.it.loatool.process_segment;
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
 * TbAceProSeq generated by hbm2java
 */
@Entity @Table(name = "TB_ACE_PRO_SEQ", catalog = "loa_evaluation_tool"
) public class ProcessSegment implements java.io.Serializable {

    private Integer pkTbId;
    private String name;
    private int NLowerLevelSubPro;
    private String varProSeqId;
    private Date createDate;
    private Date updateDate;

    public ProcessSegment() {}

    public ProcessSegment(String name, int NLowerLevelSubPro, String varProSeqId, Date createDate, Date updateDate) {
        this.name = name;
        this.NLowerLevelSubPro = NLowerLevelSubPro;
        this.varProSeqId = varProSeqId;
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

    @Column(name = "NAME", nullable = false, length = 500) public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "N_LOWER_LEVEL_SUB_PRO", nullable = false) public int getNLowerLevelSubPro() {
        return this.NLowerLevelSubPro;
    }

    public void setNLowerLevelSubPro(int NLowerLevelSubPro) {
        this.NLowerLevelSubPro = NLowerLevelSubPro;
    }

    @Column(name = "VAR_PRO_SEQ_ID", nullable = false, length = 45) public String getVarProSeqId() {
        return this.varProSeqId;
    }

    public void setVarProSeqId(String varProSeqId) {
        this.varProSeqId = varProSeqId;
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
