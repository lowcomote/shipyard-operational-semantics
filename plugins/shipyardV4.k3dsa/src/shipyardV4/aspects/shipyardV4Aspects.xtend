package shipyardV4.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import shipyardV4.ShipyardV4Root
import shipyardV4.Metadata
import shipyardV4.Selector
import shipyardV4.Sequence
import shipyardV4.Shipyard
import shipyardV4.ShipyardSpec
import shipyardV4.Stage
import shipyardV4.Task
import shipyardV4.Trigger
import shipyardV4.MetadataName
import shipyardV4.SelectorMatch
import shipyardV4.SequenceName
import shipyardV4.SequenceTriggeredOn
import shipyardV4.SequenceTasks
import shipyardV4.ShipyardApiVersion
import shipyardV4.ShipyardKind
import shipyardV4.ShipyardMetadata
import shipyardV4.ShipyardSpec1
import shipyardV4.ShipyardSpecStages
import shipyardV4.StageName
import shipyardV4.StageSequences
import shipyardV4.TaskName
import shipyardV4.TaskProperties
import shipyardV4.TriggerEvent
import shipyardV4.TriggerSelector
import shipyardV4.SelectorMatchPatternProperties0
import shipyardV4.TaskPropertiesAdditionalProperties
import shipyardV4.SequenceTriggeredOnItems
import shipyardV4.SequenceTasksItems
import shipyardV4.ShipyardSpecStagesItems
import shipyardV4.StageSequencesItems
import shipyardV4.MetadataPropertiesAbstract
import shipyardV4.SelectorPropertiesAbstract
import shipyardV4.SequencePropertiesAbstract
import shipyardV4.ShipyardPropertiesAbstract
import shipyardV4.ShipyardSpecPropertiesAbstract
import shipyardV4.StagePropertiesAbstract
import shipyardV4.TaskPropertiesAbstract
import shipyardV4.TriggerPropertiesAbstract
import shipyardV4.SelectorMatchPropertiesAbstract
import shipyardV4.TaskPropertiesPropertiesAbstract

import static extension shipyardV4.aspects.ShipyardV4RootAspect.*
//import static extension shipyardv4.aspects.MetadataAspect.*
//import static extension shipyardv4.aspects.SelectorAspect.*
import static extension shipyardV4.aspects.SequenceAspect.*
//import static extension shipyardv4.aspects.ShipyardAspect.*
//import static extension shipyardv4.aspects.ShipyardSpecAspect.*
//import static extension shipyardv4.aspects.StageAspect.*
import static extension shipyardV4.aspects.TaskAspect.*
import static extension shipyardV4.aspects.TriggerAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Step
import shipyardV4.aspects.utils.ShipyardOperationalSemanticsUtils
import java.util.List
import shipyardv4.design.api.ShipyardUtils
import fr.inria.diverse.k3.al.annotationprocessor.Main
import java.util.Map
import java.util.HashMap
import java.util.Set
import java.util.Collection
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.ArrayList
import java.util.HashSet

//import static extension shipyardv4.aspects.MetadataNameAspect.*
//import static extension shipyardv4.aspects.SelectorMatchAspect.*
//import static extension shipyardv4.aspects.SequenceNameAspect.*
//import static extension shipyardv4.aspects.SequenceTriggeredOnAspect.*
//import static extension shipyardv4.aspects.SequenceTasksAspect.*
//import static extension shipyardv4.aspects.ShipyardApiVersionAspect.*
//import static extension shipyardv4.aspects.ShipyardKindAspect.*
//import static extension shipyardv4.aspects.ShipyardMetadataAspect.*
//import static extension shipyardv4.aspects.ShipyardSpec1Aspect.*
//import static extension shipyardv4.aspects.ShipyardSpecStagesAspect.*
//import static extension shipyardv4.aspects.StageNameAspect.*
//import static extension shipyardv4.aspects.StageSequencesAspect.*
//import static extension shipyardv4.aspects.TaskNameAspect.*
//import static extension shipyardv4.aspects.TaskPropertiesAspect.*
//import static extension shipyardv4.aspects.TriggerEventAspect.*
//import static extension shipyardv4.aspects.TriggerSelectorAspect.*
//import static extension shipyardv4.aspects.SelectorMatchPatternProperties0Aspect.*
//import static extension shipyardv4.aspects.TaskPropertiesAdditionalPropertiesAspect.*
//import static extension shipyardv4.aspects.SequenceTriggeredOnItemsAspect.*
//import static extension shipyardv4.aspects.SequenceTasksItemsAspect.*
//import static extension shipyardv4.aspects.ShipyardSpecStagesItemsAspect.*
//import static extension shipyardv4.aspects.StageSequencesItemsAspect.*
//import static extension shipyardv4.aspects.MetadataPropertiesAbstractAspect.*
//import static extension shipyardv4.aspects.SelectorPropertiesAbstractAspect.*
//import static extension shipyardv4.aspects.SequencePropertiesAbstractAspect.*
//import static extension shipyardv4.aspects.ShipyardPropertiesAbstractAspect.*
//import static extension shipyardv4.aspects.ShipyardSpecPropertiesAbstractAspect.*
//import static extension shipyardv4.aspects.StagePropertiesAbstractAspect.*
//import static extension shipyardv4.aspects.TaskPropertiesAbstractAspect.*
//import static extension shipyardv4.aspects.TriggerPropertiesAbstractAspect.*
//import static extension shipyardv4.aspects.SelectorMatchPropertiesAbstractAspect.*
//import static extension shipyardv4.aspects.TaskPropertiesPropertiesAbstractAspect.*

@Aspect(className=ShipyardV4Root)
class ShipyardV4RootAspect {
	
	public String inputSequence;
	public Map<String,Collection<Trigger>> eventStringTriggerMap;
	public Set<String> finishedEvents;
	public Task currentTask = null;
	
	
	
	@Step 												
	@InitializeModel									
	def void initializeModel(List<String> args){
		var arg0 = args.get(0);
		if(arg0.isEmpty || ShipyardOperationalSemanticsUtils.isFinishedEvent(arg0)){
			_self.inputSequence = ShipyardOperationalSemanticsUtils.DEFAULT_INPUT_SEQUENCE;
		}else{
			_self.inputSequence = arg0;	
		}
		
		_self.finishedEvents=new HashSet<String>();
		
		for (arg : args) {
			if(ShipyardOperationalSemanticsUtils.isFinishedEvent(arg)){
				_self.finishedEvents.add(arg);
			}
		}
		
		
		
		//_self.inputSequence = args.get(0);	
		/**
		 * Default Input Sequence
		 */
//		if(_self.inputSequence.isEmpty) {
//			_self.inputSequence = ShipyardOperationalSemanticsUtils.DEFAULT_INPUT_SEQUENCE;
//		}		
		_self.eventStringTriggerMap = ShipyardUtils.createEventStringTriggerMap(_self);
	}
	
	@Step	
	@Main												
	def void main() {
		var currentSequence = ShipyardUtils.getSequenceByPath(_self, _self.inputSequence);
		if (currentSequence === null) {
			throw new ShipyardRuntimeException("Not Input Sequence found");
		}
		currentSequence.step();
	}	
	
	
}

@Aspect(className=Sequence)
class SequenceAspect {
	@Step												
	def void step() {
		println("Step Sequence: " + _self.toString);
		/**
		 * Execute all tasks in the sequence
		 */
		for(Task task: ShipyardUtils.getTasks(_self)){
			task.fireTask;
		}
		
		var String sequenceFinishedEvent =ShipyardUtils.getFinishedSequenceEvent(_self);
		
	    var shipyardV4RootObject = EcoreUtil.getRootContainer(_self);
	    if (shipyardV4RootObject instanceof ShipyardV4Root) {
	    	var  triggers = shipyardV4RootObject.eventStringTriggerMap.get(sequenceFinishedEvent);
	    	if(triggers !== null){
			    for (Trigger trigger : triggers){
			    	trigger.fireTrigger();
			    }
		    
		    }
		}

		
	}
}

@Aspect(className=Task)
class TaskAspect {
	@Step												
	def void fireTask() {
		println("Fire: " + _self.toString);
		var shipyardV4RootObject = EcoreUtil.getRootContainer(_self);
	    if (shipyardV4RootObject instanceof ShipyardV4Root) {
	    	shipyardV4RootObject.currentTask=_self;
		}
	}
}

@Aspect(className=Trigger)
class TriggerAspect {
	@Step												
	def void fireTrigger() {
		println("Fire: " + _self.toString);
		var  selectorMatchPatternProperties0 = ShipyardUtils.getSelectorMatchPatternProperties0ByTrigger(_self);
		if(selectorMatchPatternProperties0!==null){
			var event = ShipyardUtils.getEventStringByTrigger(_self);
			var resultEvent= event+"."+selectorMatchPatternProperties0.patternProperties0.toString;
			var shipyardV4RootObject = EcoreUtil.getRootContainer(_self);
	    	if (shipyardV4RootObject instanceof ShipyardV4Root) {
	    		if(shipyardV4RootObject.finishedEvents.contains(resultEvent)){
	    			ShipyardUtils.getSequenceByTrigger(_self).step();
	    		}
	    	}
			
		}else{
			ShipyardUtils.getSequenceByTrigger(_self).step()
		}
		
		/**
		 * TODO check selector
		 */
		//ShipyardUtils.getSequenceByTrigger(_self).step()
	}
}

class ShipyardRuntimeException extends Exception {
	new(String message) {
		super(message);
	}				
}

//@Aspect(className=Stage)
//class StageAspect {
//
//}
//
//@Aspect(className=Metadata)
//class MetadataAspect {
//
//}
//
//@Aspect(className=Selector)
//class SelectorAspect {
//
//}
//
//@Aspect(className=Shipyard)
//class ShipyardAspect {
//
//}
//
//@Aspect(className=ShipyardSpec)
//class ShipyardSpecAspect {
//
//}
//
//@Aspect(className=MetadataName)
//class MetadataNameAspect extends MetadataPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=SelectorMatch)
//class SelectorMatchAspect extends SelectorPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=SequenceName)
//class SequenceNameAspect extends SequencePropertiesAbstractAspect {
//
//}
//
//@Aspect(className=SequenceTriggeredOn)
//class SequenceTriggeredOnAspect extends SequencePropertiesAbstractAspect {
//
//}
//
//@Aspect(className=SequenceTasks)
//class SequenceTasksAspect extends SequencePropertiesAbstractAspect {
//
//}
//
//@Aspect(className=ShipyardApiVersion)
//class ShipyardApiVersionAspect extends ShipyardPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=ShipyardKind)
//class ShipyardKindAspect extends ShipyardPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=ShipyardMetadata)
//class ShipyardMetadataAspect extends ShipyardPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=ShipyardSpec1)
//class ShipyardSpec1Aspect extends ShipyardPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=ShipyardSpecStages)
//class ShipyardSpecStagesAspect extends ShipyardSpecPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=StageName)
//class StageNameAspect extends StagePropertiesAbstractAspect {
//
//}
//
//@Aspect(className=StageSequences)
//class StageSequencesAspect extends StagePropertiesAbstractAspect {
//
//}
//
//@Aspect(className=TaskName)
//class TaskNameAspect extends TaskPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=TaskProperties)
//class TaskPropertiesAspect extends TaskPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=TriggerEvent)
//class TriggerEventAspect extends TriggerPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=TriggerSelector)
//class TriggerSelectorAspect extends TriggerPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=SelectorMatchPatternProperties0)
//class SelectorMatchPatternProperties0Aspect extends SelectorMatchPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=TaskPropertiesAdditionalProperties)
//class TaskPropertiesAdditionalPropertiesAspect extends TaskPropertiesPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=SequenceTriggeredOnItems)
//class SequenceTriggeredOnItemsAspect {
//
//}
//
//@Aspect(className=SequenceTasksItems)
//class SequenceTasksItemsAspect {
//
//}
//
//@Aspect(className=ShipyardSpecStagesItems)
//class ShipyardSpecStagesItemsAspect {
//
//}
//
//@Aspect(className=StageSequencesItems)
//class StageSequencesItemsAspect {
//
//}
//
//@Aspect(className=MetadataPropertiesAbstract)
//abstract class MetadataPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=SelectorPropertiesAbstract)
//abstract class SelectorPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=SequencePropertiesAbstract)
//abstract class SequencePropertiesAbstractAspect {
//
//}
//
//@Aspect(className=ShipyardPropertiesAbstract)
//abstract class ShipyardPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=ShipyardSpecPropertiesAbstract)
//abstract class ShipyardSpecPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=StagePropertiesAbstract)
//abstract class StagePropertiesAbstractAspect {
//
//}
//
//@Aspect(className=TaskPropertiesAbstract)
//abstract class TaskPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=TriggerPropertiesAbstract)
//abstract class TriggerPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=SelectorMatchPropertiesAbstract)
//abstract class SelectorMatchPropertiesAbstractAspect {
//
//}
//
//@Aspect(className=TaskPropertiesPropertiesAbstract)
//abstract class TaskPropertiesPropertiesAbstractAspect {
//
//}



