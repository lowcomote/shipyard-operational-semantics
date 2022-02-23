package shipyardV4.execution.configuration.design;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import ShipyardExecConfig.ExecutionConfiguration;
import ShipyardExecConfig.SequenceFinishedResult;
import ShipyardExecConfig.ShipyardExecutionSuite;
import ShipyardExecConfig.TaskFinishedResult;
import shipyard.common.utils.ShipyardUtils;
import shipyardV4.Sequence;
import shipyardV4.Task;

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
    
    public String getTaskPathName(Task task) {
    	return ShipyardUtils.getTaskPathName(task);
    }
    
    public SequenceFinishedResult isNotFailedSequencesEmpty(SequenceFinishedResult sequenceFinishedResult) {
    	if (null == sequenceFinishedResult.getFailedSequence() || sequenceFinishedResult.getFailedSequence().isEmpty()) {
    		return null;
    	}else{
    		return sequenceFinishedResult;
    	}
    }
    
    public SequenceFinishedResult isNotWarningSequencesEmpty(SequenceFinishedResult sequenceFinishedResult) {
    	if (null == sequenceFinishedResult.getWarningSequences() || sequenceFinishedResult.getWarningSequences().isEmpty()) {
    		return null;
    	}else{
    		return sequenceFinishedResult;
    	}
    }
    
    public TaskFinishedResult isNotFailedTasksEmpty(TaskFinishedResult taskFinishedResult) {
    	if (null == taskFinishedResult.getFailedTasks() || taskFinishedResult.getFailedTasks().isEmpty()) {
    		return null;
    	}else{
    		return taskFinishedResult;
    	}
    }
    
    public TaskFinishedResult isNotWarningTasksEmpty(TaskFinishedResult taskFinishedResult) {
    	if (null == taskFinishedResult.getWarningTasks() || taskFinishedResult.getWarningTasks().isEmpty()) {
    		return null;
    	}else{
    		return taskFinishedResult;
    	}
    }
    

}
