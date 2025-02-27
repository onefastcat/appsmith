package com.appsmith.server.solutions;

import com.appsmith.server.helpers.PluginExecutorHelper;
import com.appsmith.server.services.AuthenticationValidator;
import com.appsmith.server.services.DatasourceContextService;
import com.appsmith.server.services.DatasourceService;
import com.appsmith.server.services.DatasourceStorageService;
import com.appsmith.server.services.PluginService;
import com.appsmith.server.solutions.ce.DatasourceTriggerSolutionCEImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DatasourceTriggerSolutionImpl extends DatasourceTriggerSolutionCEImpl
        implements DatasourceTriggerSolution {

    public DatasourceTriggerSolutionImpl(
            DatasourceService datasourceService,
            DatasourceStorageService datasourceStorageService,
            PluginExecutorHelper pluginExecutorHelper,
            PluginService pluginService,
            DatasourceStructureSolution datasourceStructureSolution,
            AuthenticationValidator authenticationValidator,
            DatasourceContextService datasourceContextService,
            DatasourcePermission datasourcePermission) {
        super(
                datasourceService,
                datasourceStorageService,
                pluginExecutorHelper,
                pluginService,
                datasourceStructureSolution,
                authenticationValidator,
                datasourceContextService,
                datasourcePermission);
    }
}
