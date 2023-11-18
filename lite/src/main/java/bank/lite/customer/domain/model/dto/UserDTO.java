package bank.lite.customer.domain.model.dto;


import java.math.BigDecimal;
import java.util.Date;


public class UserDTO {

    private Integer id;
    private String userName;
    private BigDecimal precio_activo;
    private Integer plan_pago;
    private BigDecimal p_cuota_inicial;
    private BigDecimal p_tasa_interes;
    private String t_tasa_interes;
    private BigDecimal coste_notarial;
    private BigDecimal coste_registral;
    private BigDecimal tasacion;
    private BigDecimal comision_estudio;
    private BigDecimal comision_activacion;
    private BigDecimal gps;
    private BigDecimal portes;
    private BigDecimal gastos_administracion;

    public UserDTO(Integer id, String userName, BigDecimal precio_activo, Integer plan_pago, BigDecimal p_cuota_inicial,
                   BigDecimal p_tasa_interes, String t_tasa_interes, BigDecimal coste_notarial, BigDecimal coste_registral,
                   BigDecimal tasacion, BigDecimal comision_estudio, BigDecimal comision_activacion, BigDecimal gps,
                   BigDecimal portes, BigDecimal gastos_administracion) {
        this.id = id;
        this.userName = userName;
        this.precio_activo = precio_activo;
        this.plan_pago = plan_pago;
        this.p_cuota_inicial = p_cuota_inicial;
        this.p_tasa_interes = p_tasa_interes;
        this.t_tasa_interes = t_tasa_interes;
        this.coste_notarial = coste_notarial;
        this.coste_registral = coste_registral;
        this.tasacion = tasacion;
        this.comision_estudio = comision_estudio;
        this.comision_activacion = comision_activacion;
        this.gps = gps;
        this.portes = portes;
        this.gastos_administracion = gastos_administracion;
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

    public BigDecimal getPrecio_activo() {
        return precio_activo;
    }

    public void setPrecio_activo(BigDecimal precio_activo) {
        this.precio_activo = precio_activo;
    }

    public Integer getPlan_pago() {
        return plan_pago;
    }

    public void setPlan_pago(Integer plan_pago) {
        this.plan_pago = plan_pago;
    }

    public BigDecimal getP_cuota_inicial() {
        return p_cuota_inicial;
    }

    public void setP_cuota_inicial(BigDecimal p_cuota_inicial) {
        this.p_cuota_inicial = p_cuota_inicial;
    }

    public BigDecimal getP_tasa_interes() {
        return p_tasa_interes;
    }

    public void setP_tasa_interes(BigDecimal p_tasa_interes) {
        this.p_tasa_interes = p_tasa_interes;
    }

    public String getT_tasa_interes() {
        return t_tasa_interes;
    }

    public void setT_tasa_interes(String t_tasa_interes) {
        this.t_tasa_interes = t_tasa_interes;
    }

    public BigDecimal getCoste_notarial() {
        return coste_notarial;
    }

    public void setCoste_notarial(BigDecimal coste_notarial) {
        this.coste_notarial = coste_notarial;
    }

    public BigDecimal getCoste_registral() {
        return coste_registral;
    }

    public void setCoste_registral(BigDecimal coste_registral) {
        this.coste_registral = coste_registral;
    }

    public BigDecimal getTasacion() {
        return tasacion;
    }

    public void setTasacion(BigDecimal tasacion) {
        this.tasacion = tasacion;
    }

    public BigDecimal getComision_estudio() {
        return comision_estudio;
    }

    public void setComision_estudio(BigDecimal comision_estudio) {
        this.comision_estudio = comision_estudio;
    }

    public BigDecimal getComision_activacion() {
        return comision_activacion;
    }

    public void setComision_activacion(BigDecimal comision_activacion) {
        this.comision_activacion = comision_activacion;
    }

    public BigDecimal getGps() {
        return gps;
    }

    public void setGps(BigDecimal gps) {
        this.gps = gps;
    }

    public BigDecimal getPortes() {
        return portes;
    }

    public void setPortes(BigDecimal portes) {
        this.portes = portes;
    }

    public BigDecimal getGastos_administracion() {
        return gastos_administracion;
    }

    public void setGastos_administracion(BigDecimal gastos_administracion) {
        this.gastos_administracion = gastos_administracion;
    }
}
