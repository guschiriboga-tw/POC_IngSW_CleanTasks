package co.com.bancolombia.api;

import co.com.bancolombia.model.configurationparams.ConfigurationParams;
import co.com.bancolombia.usecase.configurationparams.ConfigurationParamsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
    private final ConfigurationParamsUseCase configurationParamsUseCase;
    public Mono<ServerResponse> listenGETUseCase(ServerRequest serverRequest) {
        ConfigurationParams configurationParams;
        configurationParams = configurationParamsUseCase.getConfigurationParams();
        return ServerResponse.ok().bodyValue(configurationParams);
    }
}
