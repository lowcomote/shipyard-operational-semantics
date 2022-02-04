package shipyardV4.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Collection;
import org.eclipse.xtext.xbase.lib.InputOutput;
import shipyardV4.Sequence;
import shipyardV4.Task;
import shipyardv4.design.api.ShipyardUtils;

@Aspect(className = Sequence.class)
@SuppressWarnings("all")
public class SequenceAspect {
  @Step
  public static void step(final Sequence _self) {
    final shipyardV4.aspects.SequenceAspectSequenceAspectProperties _self_ = shipyardV4.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void step()
    if (_self instanceof shipyardV4.Sequence){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			shipyardV4.aspects.SequenceAspect._privk3_step(_self_, (shipyardV4.Sequence)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Sequence", "step");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_step(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    Collection<Task> _tasks = ShipyardUtils.getTasks(_self);
    for (final Task task : _tasks) {
      TaskAspect.fireTask(task);
    }
    String _string = _self.toString();
    String _plus = ("Step Sequence: " + _string);
    InputOutput.<String>println(_plus);
  }
}
