package shipyardV4.execution.configuration.design;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import ShipyardExecConfig.ExecutionConfiguration;
import ShipyardExecConfig.SequenceFinishedResult;
import ShipyardExecConfig.ShipyardExecutionSuite;
import shipyard.common.utils.ShipyardUtils;
import shipyardV4.Sequence;
import shipyardV4.execution.configuration.design.utils.ShipyardExecutionConfigurationUtils;

/**
 * The services class used by VSM.
 */
public class Services {
    
	
	private final static String INITIAL_SEQUENCE = "Init Seq: ";
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
//    public String getInitialSequenceName(ExecutionConfiguration executionConfiguration) {
//    	if(executionConfiguration.getInitialSequence()!=null) {
//    		return ShipyardUtils.getSequencePathName(executionConfiguration.getInitialSequence());
//    	}
//    	return null;
//    }
    
    public String getInitialSequencePathName(Sequence sequence) {
    	return INITIAL_SEQUENCE+ShipyardUtils.getSequencePathName(sequence);
    }
    
    public String getSequencePathName(Sequence sequence) {
    	return ShipyardUtils.getSequencePathName(sequence);
    }
    
    public SequenceFinishedResult isNotFailedSequencesEmpty(SequenceFinishedResult sequenceFinishedResult) {
    	if (null == sequenceFinishedResult.getFailedSequence() || sequenceFinishedResult.getFailedSequence().isEmpty()) {
    		return null;
    	}else{
    		return sequenceFinishedResult;
    	}
    }
    
//    public Collection<Sequence> getFailedSequences(SequenceFinishedResult sequenceFinishedResult)
//    public Collection<Sequence> getInitialSequences(ShipyardExecutionSuite shipyardExecutionSuite){
//		return ShipyardExecutionConfigurationUtils.getInitialSequences(shipyardExecutionSuite);
//	}
}
