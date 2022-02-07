package shipyardV4.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import shipyardV4.Trigger;
import shipyardv4.design.api.ShipyardUtils;

@Aspect(className = Trigger.class)
@SuppressWarnings("all")
public class TriggerAspect {
  @Step
  public static void fireTrigger(final Trigger _self) {
    final shipyardV4.aspects.TriggerAspectTriggerAspectProperties _self_ = shipyardV4.aspects.TriggerAspectTriggerAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void fireTrigger()
    if (_self instanceof shipyardV4.Trigger){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			shipyardV4.aspects.TriggerAspect._privk3_fireTrigger(_self_, (shipyardV4.Trigger)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Trigger", "fireTrigger");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_fireTrigger(final TriggerAspectTriggerAspectProperties _self_, final Trigger _self) {
    String _string = _self.toString();
    String _plus = ("Fire: " + _string);
    InputOutput.<String>println(_plus);
    SequenceAspect.step(ShipyardUtils.getSequenceByTrigger(_self));
  }
}
