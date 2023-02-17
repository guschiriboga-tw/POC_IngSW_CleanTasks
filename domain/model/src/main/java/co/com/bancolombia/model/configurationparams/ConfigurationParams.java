package co.com.bancolombia.model.configurationparams;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ConfigurationParams {
    private Integer intentosFallidosCaptcha;
    private Integer intentosFallidosRegistro;
}
