package shipyardv4.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import shipyardV4.ShipyardV4Root
import shipyardV4.Sequence
import shipyardV4.Task
import shipyardV4.Trigger
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List
import fr.inria.diverse.k3.al.annotationprocessor.Main
import shipyardv4.aspects.utils.ShipyardOperationalSemanticsUtils
import shipyardV4.design.api.ShipyardUtils

@Aspect(className=ShipyardV4Root)
class ShipyardV4RootAspect {
	
	private String inputSequence;
	private Sequence currentSequence;
	
	@Step 												
	@InitializeModel									
	def void initializeModel(List<String> args){
		_self.inputSequence = args.get(0);	
		//Default Input Sequence
		if(_self.inputSequence.isEmpty) {
			_self.inputSequence = ShipyardOperationalSemanticsUtils.DEFAULT_INPUT_SEQUENCE;
		}		
	}
	
	@Step	
	@Main												
	def void main() {
		_self.currentSequence = ShipyardUtils.getSequenceByPath(_self, _self.inputSequence);
		if (_self.currentSequence === null) {
			throw new ShipyardRuntimeException("No Input Sequence");
		}
		_self.currentSequence.step();
	}
}

//@Aspect(className=Metadata)
//class MetadataAspect {
//
//}
//
//@Aspect(className=Selector)
//class SelectorAspect {
//
//}

@Aspect(className=Sequence)
class SequenceAspect {
	
	@Step												
	def void step() {
		println("adsa")
	}
}

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
//@Aspect(className=Stage)
//class StageAspect {
//
//}

@Aspect(className=Task)
class TaskAspect {

}

@Aspect(className=Trigger)
class TriggerAspect {

}

class ShipyardRuntimeException extends Exception {
	new(String message) {
		super(message)
	}				
}

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



