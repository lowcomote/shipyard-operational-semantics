package shipyardV4.design;

import java.util.Collection;

import shipyardV4.Sequence;
import shipyardV4.ShipyardV4Root;
import shipyardV4.Stage;
import shipyardV4.Task;
import shipyardV4.design.api.ShipyardUtils;

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
}