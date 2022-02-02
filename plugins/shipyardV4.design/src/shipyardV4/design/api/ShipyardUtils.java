package shipyardV4.design.api;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import shipyardV4.Sequence;
import shipyardV4.SequenceName;
import shipyardV4.SequenceTasks;
import shipyardV4.SequenceTasksItems;
import shipyardV4.ShipyardSpec1;
import shipyardV4.ShipyardSpecStages;
import shipyardV4.ShipyardV4Root;
import shipyardV4.Stage;
import shipyardV4.StageName;
import shipyardV4.StageSequences;
import shipyardV4.StageSequencesItems;
import shipyardV4.Task;
import shipyardV4.TaskName;

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
}
