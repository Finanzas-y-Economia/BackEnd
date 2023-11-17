package bank.lite.customer.domain.model.dto;


import java.math.BigDecimal;
import java.util.Date;


public class UserDTO {
    private Integer id;
    private String userName;
    private String typeCurrency;
    private Date fechaDesembolso;
    private Integer diaPago;
    private BigDecimal valorVehiculo;
    private Integer tipoPlazo;
    private BigDecimal cuotaInicial;
    private BigDecimal tea;
    private Integer periodoGracia;

    public UserDTO(Integer id, String userName, String typeCurrency, Date fechaDesembolso, Integer diaPago, BigDecimal valorVehiculo, Integer tipoPlazo, BigDecimal cuotaInicial, BigDecimal tea, Integer periodoGracia) {
        this.id = id;
        this.userName = userName;
        this.typeCurrency = typeCurrency;
        this.fechaDesembolso = fechaDesembolso;
        this.diaPago = diaPago;
        this.valorVehiculo = valorVehiculo;
        this.tipoPlazo = tipoPlazo;
        this.cuotaInicial = cuotaInicial;
        this.tea = tea;
        this.periodoGracia = periodoGracia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTypeCurrency() {
        return typeCurrency;
    }

    public void setTypeCurrency(String typeCurrency) {
        this.typeCurrency = typeCurrency;
    }

    public Date getFechaDesembolso() {
        return fechaDesembolso;
    }

    public void setFechaDesembolso(Date fechaDesembolso) {
        this.fechaDesembolso = fechaDesembolso;
    }

    public Integer getDiaPago() {
        return diaPago;
    }

    public void setDiaPago(Integer diaPago) {
        this.diaPago = diaPago;
    }

    public BigDecimal getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(BigDecimal valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public Integer getTipoPlazo() {
        return tipoPlazo;
    }

    public void setTipoPlazo(Integer tipoPlazo) {
        this.tipoPlazo = tipoPlazo;
    }

    public BigDecimal getCuotaInicial() {
        return cuotaInicial;
    }

    public void setCuotaInicial(BigDecimal cuotaInicial) {
        this.cuotaInicial = cuotaInicial;
    }

    public BigDecimal getTea() {
        return tea;
    }

    public void setTea(BigDecimal tea) {
        this.tea = tea;
    }

    public Integer getPeriodoGracia() {
        return periodoGracia;
    }

    public void setPeriodoGracia(Integer periodoGracia) {
        this.periodoGracia = periodoGracia;
    }
}
