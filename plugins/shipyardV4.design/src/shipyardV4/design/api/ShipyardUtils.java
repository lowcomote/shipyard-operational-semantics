package shipyardV4.design.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import shipyardV4.MetadataName;
import shipyardV4.Selector;
import shipyardV4.SelectorMatch;
import shipyardV4.SelectorMatchPatternProperties0;
import shipyardV4.Sequence;
import shipyardV4.SequenceName;
import shipyardV4.SequenceTasks;
import shipyardV4.SequenceTasksItems;
import shipyardV4.SequenceTriggeredOn;
import shipyardV4.ShipyardApiVersion;
import shipyardV4.ShipyardKind;
import shipyardV4.ShipyardMetadata;
import shipyardV4.ShipyardSpec1;
import shipyardV4.ShipyardSpecStages;
import shipyardV4.ShipyardV4Root;
import shipyardV4.Stage;
import shipyardV4.StageName;
import shipyardV4.StageSequences;
import shipyardV4.StageSequencesItems;
import shipyardV4.Task;
import shipyardV4.TaskName;
import shipyardV4.TaskProperties;
import shipyardV4.TaskPropertiesAdditionalProperties;
import shipyardV4.Trigger;
import shipyardV4.TriggerEvent;
import shipyardV4.TriggerSelector;

public class ShipyardUtils {
	
	//Suppress default constructor for noninstantiability
	private ShipyardUtils() {
		throw new AssertionError();
	}
	
	//Get stages from ShipyardRoot
	public static Collection<Stage> getStages(ShipyardV4Root shipyardRoot) {
		var shipyardSpec1 = shipyardRoot.getShipyardV4Root().getShipyard()
											.stream()
											.filter(ShipyardSpec1.class::isInstance)
											.map(ShipyardSpec1.class::cast)
											.findAny()
											.orElseThrow(() -> new IllegalArgumentException("Expected ShipyardSpec1 type object"));
		
		var	shipyardSpecStages = shipyardSpec1.getSpec().getShipyardSpec()
										.stream()
										.filter(ShipyardSpecStages.class::isInstance)
										.map(ShipyardSpecStages.class::cast)
										.findAny()
										.orElseThrow(() -> new IllegalArgumentException("Expected ShipyardSpecStages type object"));
		
		return shipyardSpecStages.getStages()
									.stream()
									.map(stage -> stage.getItems())
									.collect(Collectors.toCollection(BasicEList::new));		
	}
	
	//Get StageName
	public static String getStageName(Stage stage) {
		var stageName= stage.getStage()
						.stream()
						.filter(StageName.class::isInstance)
						.map(StageName.class::cast)
						.findAny()
						.orElseThrow(() -> new IllegalArgumentException("Expected StageName type object"));
		return stageName.getName();
		
	}
	
	//Get Sequence
	public static Collection<Sequence> getSequencesfromStage(Stage stage) {
		var stageSequence = stage.getStage()
								.stream()
								.filter(StageSequences.class::isInstance)
								.map(StageSequences.class::cast)
								.findAny()
								.orElseThrow(() -> new IllegalArgumentException("Expected StageSequences type object"));
								;	
		
		return stageSequence.getSequences()
					.stream()
					.map(item -> item.getItems())
					.collect(Collectors.toCollection(BasicEList::new));		
	}
	
	//Get StageName
	public static String getSequenceName(Sequence sequence) {
		var sequenceName= sequence.getSequence()
						.stream()
						.filter(SequenceName.class::isInstance)
						.map(SequenceName.class::cast)
						.findAny()
						.orElseThrow(() -> new IllegalArgumentException("Expected SequenceName type object"));
		return sequenceName.getName();
	}
	
	//Get Tasks
	public static Collection<Task> getTasks(Sequence sequence) {
		var sequenceTask = sequence.getSequence()
				.stream()
				.filter(SequenceTasks.class::isInstance)
				.map(SequenceTasks.class::cast)
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException("Expected SequenceTasks type object"));
				;	

		return sequenceTask.getTasks()
					.stream()
					.map(item -> item.getItems())
					.collect(Collectors.toCollection(BasicEList::new));	
	}
	
	//Get StageName
	public static String getTaskName(Task task) {
		var taskName = task.getTask()
						.stream()
						.filter(TaskName.class::isInstance)
						.map(TaskName.class::cast)
						.findAny()
						.orElseThrow(() -> new IllegalArgumentException("Expected TaskName type object"));
		return taskName.getName();
	}
	
	//Get next task
	public static Task getNextTask(Task task) {
		SequenceTasksItems sequenceTaskItems = (SequenceTasksItems) task.eContainer();
		SequenceTasks sequenceTasks = (SequenceTasks) sequenceTaskItems.eContainer();
		int index = sequenceTasks.getTasks().indexOf(sequenceTaskItems);
		if (sequenceTasks.getTasks().size() > index + 1) {
			return sequenceTasks.getTasks().get(index + 1).getItems();
		}		
		return null;
	}
	
	//Shipyard get MetadataName
	public static String getMetadataName(ShipyardV4Root shipyardV4Root) {
		var metadataName = shipyardV4Root.getShipyardV4Root().getShipyard()
							.stream()
							.filter(ShipyardMetadata.class::isInstance)
							.map(ShipyardMetadata.class::cast)
							.findAny()
							.orElseThrow(() -> new IllegalArgumentException("Expected ShipyardMetadata type object"))
							.getMetadata().getMetadata()
							.stream()
							.filter(MetadataName.class::isInstance)
							.map(MetadataName.class::cast)
							.findAny()
							.orElseThrow(() -> new IllegalArgumentException("Expected MetadataName type object"))
							;
		return metadataName.getName();		
	}
	
	//Shipyard get Kind
	public static String getKind(ShipyardV4Root shipyardV4Root) {
		var kind = shipyardV4Root.getShipyardV4Root().getShipyard()
				.stream()
				.filter(ShipyardKind.class::isInstance)
				.map(ShipyardKind.class::cast)
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException("Expected ShipyardKind type object"));	
		return kind.getKind();		
	}
	
	//Shipyard get Version
	public static String getVersion(ShipyardV4Root shipyardV4Root) {
		var apiVersion = shipyardV4Root.getShipyardV4Root().getShipyard()
				.stream()
				.filter(ShipyardApiVersion.class::isInstance)
				.map(ShipyardApiVersion.class::cast)
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException("Expected ShipyardApiVersion type object"));	
		return apiVersion.getApiVersion();	
	}
	
	//Get Additional Properties
	public static Collection<TaskPropertiesAdditionalProperties> getTaskPropertiesAdditionalProperties(Task task) {
		return task.getTask()
					.stream()
					.filter(TaskProperties.class::isInstance)
					.map(TaskProperties.class::cast)
					.findAny()
					.orElseThrow(() -> new IllegalArgumentException("Expected TaskProperties type object"))
					.getProperties()
					.stream()
					.filter(TaskPropertiesAdditionalProperties.class::isInstance)
					.map(TaskPropertiesAdditionalProperties.class::cast)
					.collect(Collectors.toCollection(BasicEList::new))
					;
	}
	
	public static Collection<String> getEvents(Sequence sequence) {		
		var sequenceTriggeredOn =  sequence.getSequence()
										.stream()
										.filter(SequenceTriggeredOn.class::isInstance)
										.map(SequenceTriggeredOn.class::cast)
										.findAny()
										.orElse(null);
		if (sequenceTriggeredOn != null) {			
			return sequenceTriggeredOn.getTriggeredOn()
					 		.stream()
							.map(item -> item.getItems())
							.map(trigger -> trigger.getTrigger())
							.flatMap(Collection::stream)
							.filter(TriggerEvent.class::isInstance)
							.map(TriggerEvent.class::cast)
							.map(event -> event.getEvent())
							.collect(Collectors.toList())
							;	
		}
		return Collections.emptyList();									
	}
	
//	public static Collection<Sequence> getFiringSequences(ShipyardV4Root shipyardV4Root, Sequence sequence) {	
//		var events = getEvents(sequence);
//		var firingSequences = new BasicEList<Sequence>();	
//		for (String event : events) {
//			String[] splitEvent = event.split("\\.");
//			String stageName = splitEvent[0];
//			Stage stage = getStageByName(shipyardV4Root, stageName);			
//			if (stage != null) {
//				var sequenceName = splitEvent[1];
//				var firingSequence = getSequenceByName(stage, sequenceName);
//				firingSequences.add(firingSequence);
//			}
//		}		
//		return firingSequences;	
//	}
	
	public static Stage getStageByName(ShipyardV4Root shipyardV4Root, String stageName) {
		var stages = getStages(shipyardV4Root);
		return stages.stream()
				.filter(stage -> getStageName(stage).equals(stageName))
				.findAny()
				.orElse(null);	
	}
	
	public static Sequence getSequenceByName(Stage stage, String sequenceName) {
		var sequences = getSequencesfromStage(stage);
		return sequences.stream()
				.filter(sequence -> getSequenceName(sequence).equals(sequenceName))
				.findAny()
				.orElse(null)
				;
	}
	
	public static Sequence getSequenceByTrigger(Trigger trigger) {
		   return (Sequence) trigger.eContainer().eContainer().eContainer();
	}
	
	public static Sequence getFiringSequence(ShipyardV4Root shipyardV4Root, Trigger trigger) {
		var triggerEvent = trigger.getTrigger()
						.stream()
						.filter(TriggerEvent.class::isInstance)
						.map(TriggerEvent.class::cast)
						.findAny()
						.orElseThrow(() -> new IllegalArgumentException("Expected TriggerEvent type object"))
						;	
		String[] splitEvent = triggerEvent.getEvent().split("\\.");
		String stageName = splitEvent[0];
		Stage stage = getStageByName(shipyardV4Root, stageName);			
		if (stage != null) {
			var sequenceName = splitEvent[1];
			var firingSequence = getSequenceByName(stage, sequenceName);
			return firingSequence;
		}
		return null;	
	}
	
	public static SelectorMatchPatternProperties0 getSelectorMatchPatternProperties0ByTrigger(Trigger trigger) {
		var triggerSelector =  trigger.getTrigger()
									.stream()
									.filter(TriggerSelector.class::isInstance)
									.map(TriggerSelector.class::cast)
									.findAny()
									.orElse(null);
		if (triggerSelector != null) {
			return triggerSelector.getSelector()
					.getSelector()
					.stream()
					.filter(SelectorMatch.class::isInstance)
					.map(SelectorMatch.class::cast)
					.findAny()
					.orElseThrow(() -> new IllegalArgumentException("Expected SelectorMatch type object"))
					.getMatch()
					.stream()
					.filter(SelectorMatchPatternProperties0.class::isInstance)
					.map(SelectorMatchPatternProperties0.class::cast)
					.findAny()
					.orElseThrow(() -> new IllegalArgumentException("Expected SelectorMatchPatternProperties0 type object"));
		}
		return null;
	}	
	
	public static Sequence getSequenceByPath(ShipyardV4Root shipyardV4Root,String pathSequence) {
		String[] splitPath = pathSequence.split("\\.");
		Stage stage = getStageByName(shipyardV4Root, splitPath[0]);
		if (stage != null) {
			return getSequenceByName(stage, splitPath[1]);
		}
		return null;
	}
}
