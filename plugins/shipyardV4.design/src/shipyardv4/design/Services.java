package shipyardv4.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DSemanticDiagram;

import shipyard.common.utils.ShipyardUtils;
import shipyardV4.SelectorMatchPatternProperties0;
import shipyardV4.Sequence;
import shipyardV4.ShipyardV4Root;
import shipyardV4.Stage;
import shipyardV4.Task;
import shipyardV4.TaskPropertiesAdditionalProperties;
import shipyardV4.Trigger;

/**
 * The services class used by VSM.
 */
public class Services {
	
   public static String STAGE_TITLE = "Stage: ";
   public static String SEQUENCE_TITLE = "Seq: ";
   
    
   public Collection<Stage> getStages(ShipyardV4Root shipyardRoot) {
	   return ShipyardUtils.getStages(shipyardRoot);
   }
   
   public String getStageName(Stage stage) {
	   return STAGE_TITLE + ShipyardUtils.getStageName(stage);
   }
   
   public Collection<Sequence> getSequencesfromStage(Stage stage) {
	   return ShipyardUtils.getSequencesfromStage(stage);
   }
   
   public String getSequenceName(Sequence sequence) {
	   return SEQUENCE_TITLE + ShipyardUtils.getSequenceName(sequence);
   }
   
   public Collection<Task> getTasks(Sequence sequence) {
	   return ShipyardUtils.getTasks(sequence);
   }
   
   public String getTaskName(Task task) {
	   return ShipyardUtils.getTaskName(task);
   }
   
   //Get next task
   public Task getNextTask(Task task) {
	   return ShipyardUtils.getNextTask(task);
   }
   
   public String getMetadataName(ShipyardV4Root shipyardV4Root) {
	   return ShipyardUtils.getMetadataName(shipyardV4Root);
   }
   
   public String getKind(ShipyardV4Root shipyardV4Root) {	   
	   return ShipyardUtils.getKind(shipyardV4Root);
   }
   
   public String getVersion(ShipyardV4Root shipyardV4Root) {
	   return ShipyardUtils.getVersion(shipyardV4Root);
   }
   
   public Collection<TaskPropertiesAdditionalProperties> getTaskPropertiesAdditionalProperties(Task task) {
	   return ShipyardUtils.getTaskPropertiesAdditionalProperties(task);
   }
   
   public Sequence getFiringSequence(Trigger trigger, DSemanticDiagram diagram) {	   
	   return ShipyardUtils.getFiringSequence((ShipyardV4Root) diagram.getTarget(), 
			   trigger);
   }
   
   public Sequence getSequenceByTrigger(Trigger trigger) {
	   return ShipyardUtils.getSequenceByTrigger(trigger);
   }
   
   public String getKeySelectorMatchPatternProperties0ByTrigger(Trigger trigger) {
	   var selector = ShipyardUtils.getSelectorMatchPatternProperties0ByTrigger(trigger);
	   if (selector != null)
		   return selector.getKey();
	   return null;
   }
   
   public String getValueSelectorMatchPatternProperties0ByTrigger(Trigger trigger) {
	   var selector = ShipyardUtils.getSelectorMatchPatternProperties0ByTrigger(trigger);
	   if (selector != null)
		   return selector.getPatternProperties0();
	   return null;
   }
   
   public String getTriggerLabel(Trigger trigger) {
	   var selector = ShipyardUtils.getSelectorMatchPatternProperties0ByTrigger(trigger);
	   if (selector != null)
		   return selector.getKey()+"="+selector.getPatternProperties0();
	   return null;
   }
   
   

  
}
