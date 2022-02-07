package shipyardV4.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import shipyardV4.Task;

@Aspect(className = Task.class)
@SuppressWarnings("all")
public class TaskAspect {
  @Step
  public static void fireTask(final Task _self) {
    final shipyardV4.aspects.TaskAspectTaskAspectProperties _self_ = shipyardV4.aspects.TaskAspectTaskAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void fireTask()
    if (_self instanceof shipyardV4.Task){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			shipyardV4.aspects.TaskAspect._privk3_fireTask(_self_, (shipyardV4.Task)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Task", "fireTask");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_fireTask(final TaskAspectTaskAspectProperties _self_, final Task _self) {
    String _string = _self.toString();
    String _plus = ("Fire: " + _string);
    InputOutput.<String>println(_plus);
  }
}
