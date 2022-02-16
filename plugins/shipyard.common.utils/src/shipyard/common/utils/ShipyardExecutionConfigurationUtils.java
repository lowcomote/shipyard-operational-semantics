package shipyard.common.utils;

import java.util.Optional;

import ShipyardExecConfig.ExecutionConfiguration;
import ShipyardExecConfig.ShipyardExecutionSuite;

public class ShipyardExecutionConfigurationUtils {
	
	
	public static ExecutionConfiguration getExecutionConfiguration(ShipyardExecutionSuite shipyardExecutionSuite, String name) {
		Optional<ExecutionConfiguration> optional = shipyardExecutionSuite.getExecutionConfigurations().stream()
				.filter(executionConfiguration -> executionConfiguration.getName().equals(name))
				.findAny();
		if(optional!=null) {
			return optional.get();
		}
		return null;
//		return shipyardExecutionSuite.getExecutionConfigurations().stream()
//				.filter(executionConfiguration -> executionConfiguration.getName() == name)
//				.findAny().orElseGet(null);
	}

}
