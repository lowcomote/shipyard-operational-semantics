package shipyardV4.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.InputOutput;
import shipyardV4.Sequence;
import shipyardV4.ShipyardV4Root;
import shipyardV4.Task;
import shipyardV4.Trigger;
import shipyardv4.design.api.ShipyardUtils;

@Aspect(className = Sequence.class)
@SuppressWarnings("all")
public class SequenceAspect {
  @Step
  public static void step(final Sequence _self, final Map<String, Collection<Trigger>> eventStringTriggerMap) {
    final shipyardV4.aspects.SequenceAspectSequenceAspectProperties _self_ = shipyardV4.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void step(Map<String, Collection<Trigger>>)
    if (_self instanceof shipyardV4.Sequence){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			shipyardV4.aspects.SequenceAspect._privk3_step(_self_, (shipyardV4.Sequence)_self,eventStringTriggerMap);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {eventStringTriggerMap}, command, "Sequence", "step");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_step(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self, final Map<String, Collection<Trigger>> eventStringTriggerMap) {
    Collection<Task> _tasks = ShipyardUtils.getTasks(_self);
    for (final Task task : _tasks) {
      TaskAspect.fireTask(task);
    }
    EObject shipyardV4RootObject = EcoreUtil.getRootContainer(_self);
    if ((shipyardV4RootObject instanceof ShipyardV4Root)) {
      ShipyardV4RootAspect.eventStringTriggerMap(((ShipyardV4Root)shipyardV4RootObject));
    }
    String _string = _self.toString();
    String _plus = ("Step Sequence: " + _string);
    InputOutput.<String>println(_plus);
  }
}
