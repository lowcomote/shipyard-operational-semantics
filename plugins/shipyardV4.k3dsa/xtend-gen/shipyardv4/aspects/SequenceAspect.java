package shipyardv4.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import shipyardV4.Sequence;

@Aspect(className = Sequence.class)
@SuppressWarnings("all")
public class SequenceAspect {
  @Step
  public static void step(final Sequence _self) {
    final shipyardv4.aspects.SequenceAspectSequenceAspectProperties _self_ = shipyardv4.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void step()
    if (_self instanceof shipyardV4.Sequence){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			shipyardv4.aspects.SequenceAspect._privk3_step(_self_, (shipyardV4.Sequence)_self);
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
    InputOutput.<String>println("adsa");
  }
}
