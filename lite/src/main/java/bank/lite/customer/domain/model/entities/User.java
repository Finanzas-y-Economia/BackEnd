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
    @NotEmpty
    @Column(name="type_currency",length=55,nullable=false)
    private String typeCurrency;

    @Column(name="fecha_desembolso",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaDesembolso;

    @NotNull
    @Min(value = 1, message = "El día de pago debe estar entre 1 y 30")
    @Max(value = 30, message = "El día de pago debe estar entre 1 y 30")
    @Column(name="dia_pago", nullable=false)
    private Integer diaPago;

    @NotNull
    @Min(value = 0, message = "El valor del vehículo debe ser mayor a 0")
    @Column(name="valor_vehiculo", precision=10, scale=2, nullable=false)
    private BigDecimal valorVehiculo;

    @NotNull
    @Min(value = 24, message = "El plazo debe ser 24 o 36 meses")
    @Max(value = 36, message = "El plazo debe ser 24 o 36 meses")
    @Column(name="tipo_plazo", nullable=false)
    private Integer tipoPlazo;

    @NotNull
    @Min(value = 0, message = "La cuota inicial debe ser mayor a 0")
    @Column(name="cuota_inicial", precision=10, scale=2, nullable=false)
    private BigDecimal cuotaInicial;

    @NotNull
    @Min(value = 1, message = "La tarifa debe ser al menos 1")
    @Max(value = 100, message = "La TEA debe estar entre 0 y 100")
    @Column(name="tasa_interes", precision=5, scale=2, nullable=false)
    private BigDecimal tea;

    @NotNull
    @Min(value = 0, message = "El periodo de gracia debe ser mayor o igual a 0")
    @Column(name="periodo_gracia", nullable=false)
    private Integer periodoGracia;

    public User() {
        this.fechaDesembolso = new Date();
    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
