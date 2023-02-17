package co.com.bancolombia.usecase.configurationparams;

import co.com.bancolombia.model.configurationparams.ConfigurationParams;
import co.com.bancolombia.model.configurationparams.gateways.ConfigurationParamsRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class ConfigurationParamsUseCase {
    // COMMENT: si va RequiredArgsConstructor va con
    // final private ConfigurationParamsRepository
    // si tiene @all
    final private ConfigurationParamsRepository configurationParamsRepository;

    public ConfigurationParams getConfigurationParams() {
        // TODO: Error handling, logic fliters
        return configurationParamsRepository.getConfigurationParams();
    }
}
