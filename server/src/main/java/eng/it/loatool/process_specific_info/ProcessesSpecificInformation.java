package eng.it.loatool.process_specific_info;

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

@Entity
@Table(name = "TB_ACE_PRO_SPEC", catalog = "loa_evaluation_tool")
public class ProcessesSpecificInformation implements java.io.Serializable, PkTbPrimaryKeyOwner {

    private Integer pkTbId;
    private int fkTbAceSubProLev;
    private float NShiptsDay;
    private float hoursShift;
    private float workingDaysYear;
    private Date createDate;
    private Date updateDate;

    public ProcessesSpecificInformation() {
    }

    public ProcessesSpecificInformation(
        int fkTbAceSubProLev, float NShiptsDay, float hoursShift, float workingDaysYear,
        Date createDate, Date updateDate
    ) {
        this.fkTbAceSubProLev = fkTbAceSubProLev;
        this.NShiptsDay = NShiptsDay;
        this.hoursShift = hoursShift;
        this.workingDaysYear = workingDaysYear;
        this.createDate = createDate;
        this.updateDate = updateDate;
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

    @Column(name = "N_SHIPTS_DAY", nullable = false, precision = 12, scale = 0)
    public float getNShiptsDay() {
        return this.NShiptsDay;
    }

    public void setNShiptsDay(float NShiptsDay) {
        this.NShiptsDay = NShiptsDay;
    }

    @Column(name = "HOURS_SHIFT", nullable = false, precision = 12, scale = 0)
    public float getHoursShift() {
        return this.hoursShift;
    }

    public void setHoursShift(float hoursShift) {
        this.hoursShift = hoursShift;
    }

    @Column(name = "WORKING_DAYS_YEAR", nullable = false, precision = 12, scale = 0)
    public float getWorkingDaysYear() {
        return this.workingDaysYear;
    }

    public void setWorkingDaysYear(float workingDaysYear) {
        this.workingDaysYear = workingDaysYear;
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
    @Column(name = "UPDATE_DATE", nullable = false, length = 19)
    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
