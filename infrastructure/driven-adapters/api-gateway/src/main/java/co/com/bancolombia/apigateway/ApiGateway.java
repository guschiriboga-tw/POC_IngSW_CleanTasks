package co.com.bancolombia.apigateway;

import co.com.bancolombia.model.configurationparams.ConfigurationParams;
import co.com.bancolombia.model.configurationparams.gateways.ConfigurationParamsRepository;
import org.springframework.stereotype.Service;

@Service
public class ApiGateway implements ConfigurationParamsRepository {
    @Override
    public ConfigurationParams getConfigurationParams() {
        return ConfigurationParams.builder().intentosFallidosCaptcha(3).intentosFallidosRegistro(2).build();
    }
}
