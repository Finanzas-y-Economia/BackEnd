package bank.lite.customer.domain.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @NotEmpty
    @Column(name="user_name",length=55,nullable=false)
    private String userName;

    @NotNull
    @Min(value = 0, message = "El precio del activo debe ser mayor a 0")
    @Column(name="precioActivo", precision=10, scale=2, nullable=false)
    private BigDecimal precio_activo;

    @NotNull
    @Min(value = 24, message = "El plan de pago debe ser 24 o 36 meses")
    @Max(value = 36, message = "El plan de pago debe ser 24 o 36 meses")
    @Column(name="planPago", nullable=false)
    private Integer plan_pago;

    @NotNull
    @Min(value = 0, message = "La cuota inicial en porcentaje debe ser mayor o igual a 0")
    @Max(value = 100, message = "La cuota inicial en porcentaje debe estar entre 0 y 100")
    @Column(name="pcuotaInicial", precision=5, scale=2, nullable=false)
    private BigDecimal p_cuota_inicial;

    @NotNull
    @Min(value = 0, message = "La tasa de interés en porcentaje debe ser mayor a 0")
    @Max(value = 100, message = "La tasa de interés en porcentaje debe estar entre 0 y 100")
    @Column(name="ptasaInteres", precision=5, scale=2, nullable=false)
    private BigDecimal p_tasa_interes;

    @NotEmpty
    @Column(name="ttasaInteres", length=5, nullable=false)
    private String t_tasa_interes;

    @NotNull
    @Min(value = 0, message = "El coste notarial debe ser mayor a 0")
    @Column(name="coste_notarial", precision=6, scale=2, nullable=false)
    private BigDecimal coste_notarial;

    @NotNull
    @Min(value = 0, message = "El coste registral debe ser mayor a 0")
    @Column(name="costeRegistral", precision=6, scale=2, nullable=false)
    private BigDecimal coste_registral;

    @NotNull
    @Min(value = 0, message = "La tasación debe ser mayor a 0")
    @Column(name="tasacion", precision=6, scale=2, nullable=false)
    private BigDecimal tasacion;

    @NotNull
    @Min(value = 0, message = "La comisión de estudio debe ser mayor a 0")
    @Column(name="comisionEstudio", precision=6, scale=2, nullable=false)
    private BigDecimal comision_estudio;

    @NotNull
    @Min(value = 0, message = "La comisión de activación debe ser mayor a 0")
    @Column(name="comisionActivacion", precision=10, scale=2, nullable=false)
    private BigDecimal comision_activacion;

    @NotNull
    @Min(value = 0, message = "El costo de GPS debe ser mayor a 0")
    @Column(name="gps", precision=6, scale=2, nullable=false)
    private BigDecimal gps;

    @NotNull
    @Min(value = 0, message = "El costo de portes debe ser mayor a 0")
    @Column(name="portes", precision=10, scale=2, nullable=false)
    private BigDecimal portes;

    @NotNull
    @Min(value = 0, message = "Los gastos de administración deben ser mayores a 0")
    @Column(name="gastosAdministracion", precision=10, scale=2, nullable=false)
    private BigDecimal gastos_administracion;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
