package shipyardV4.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import shipyardV4.ShipyardV4Root
import java.util.Collection
import java.util.Map
import shipyardV4.Trigger
import shipyardV4.Task
import ShipyardExecConfig.ExecutionConfiguration
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import ShipyardExecConfig.ShipyardExecutionSuite
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.Resource
import java.util.List
import shipyard.common.utils.ShipyardUtils
import shipyardV4.aspects.utils.ShipyardOperationalSemanticsUtils
import shipyard.common.utils.ShipyardExecutionConfigurationUtils
import shipyardV4.Sequence
import fr.inria.diverse.k3.al.annotationprocessor.Main


import static extension shipyardV4.aspects.SequenceAspect.*


@Aspect(className=ShipyardV4Root)
class ShipyardV4RootAspect {
	
	public String inputSequence;
	public Map<String,Collection<Trigger>> eventStringTriggerMap;
	//public Set<String> finishedEvents;
	public Task currentTask = null;

	public ExecutionConfiguration executionConfiguration;
	//public Collection<Task> executedTasks = new ArrayList<Task>()
	
	@Step 												
	@InitializeModel									
	def void initializeModel(List<String> args){
		var ShipyardExecutionSuite shipyardExecutionSuite = null;
		var	URI shipyardexecconfigURI= _self.eResource.URI.trimFileExtension.appendFileExtension("shipyardexecconfig");
		
		var ResourceSet reset= _self.eResource.resourceSet;
		var uriExists = reset.URIConverter.exists(shipyardexecconfigURI,null);
		if(uriExists){
			var Resource resource = reset.getResource(shipyardexecconfigURI, true);
			shipyardExecutionSuite = resource.contents.get(0) as ShipyardExecutionSuite;
			if (! _self.equals(shipyardExecutionSuite.shipyardV4Root)){
				throw new ShipyardRuntimeException("Shipyard Root is expected to be equal to the shipyardV4Root of the Shipyard Execution Suite ")
			}
		}else{
			println("shipyardexecconfig does not exist " );
		}
		
		
		_self.eventStringTriggerMap = ShipyardUtils.createEventStringTriggerMap(_self);
		
		/**
		 * Execution Configuration set up
		 */
		_self.executionConfiguration=null
		_self.inputSequence = ShipyardOperationalSemanticsUtils.DEFAULT_INPUT_SEQUENCE;
		if(shipyardExecutionSuite!==null && !args.get(0).isEmpty){
			_self.executionConfiguration = ShipyardExecutionConfigurationUtils.getExecutionConfiguration(shipyardExecutionSuite, args.get(0));
			if(_self.executionConfiguration!==null){
				var Sequence initialSequence =  _self.executionConfiguration.initialSequence;
				if(initialSequence !== null){
					_self.inputSequence=ShipyardUtils.getSequencePathName(initialSequence);
				}
			}else{
				throw new ShipyardRuntimeException("ExecutionConfiguration "+ args.get(0) +"does not exist" );
			}
		}
		
	}
	
	@Step	
	@Main												
	def void main() {
		var currentSequence = ShipyardUtils.getSequenceByPath(_self, _self.inputSequence);
		if (currentSequence === null) {
			throw new ShipyardRuntimeException("Not Input Sequence found");
		}
		currentSequence.step();
		
		/**
		 * Validation this is very wrong!!!!
		 */
		 /*
		if(_self.executionConfiguration!==null && _self.executionConfiguration.expectedExecution!==null){
			var validation = true;
			if(_self.executionConfiguration.expectedExecution.expectedTasks.size !== _self.executedTasks.size){
				validation=false;
				println("Expected number of tasks not the same as the executed number of tasks: " + _self.toString);
				println("Expected number of tasks:  " + _self.executionConfiguration.expectedExecution.expectedTasks.size);
				println("Executed number of tasks:  " + _self.executedTasks.size);
			}else{
				var numberOfTasks = _self.executedTasks.size;
				for (var int i=0; i<numberOfTasks; i++){
					if(!_self.executionConfiguration.expectedExecution.expectedTasks.get(i).equals(_self.executedTasks.get(i))){
						validation=false;
						println("Task " + i + " not correct");
						println("Expected Task " + i + ": "+ _self.executionConfiguration.expectedExecution.expectedTasks.get(i).toString);
						println("Executed Task " + i + ": "+_self.executedTasks.get(i).toString);
					}
				}
			}
		}
		* */
	}	
	
}