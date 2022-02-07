package shipyardV4.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.Exceptions;
import shipyardV4.Sequence;
import shipyardV4.ShipyardV4Root;
import shipyardV4.Trigger;
import shipyardV4.aspects.utils.ShipyardOperationalSemanticsUtils;
import shipyardv4.design.api.ShipyardUtils;

@Aspect(className = ShipyardV4Root.class)
@SuppressWarnings("all")
public class ShipyardV4RootAspect {
  @Step
  @InitializeModel
  public static void initializeModel(final ShipyardV4Root _self, final List<String> args) {
    final shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initializeModel(List<String>)
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			shipyardV4.aspects.ShipyardV4RootAspect._privk3_initializeModel(_self_, (shipyardV4.ShipyardV4Root)_self,args);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {args}, command, "ShipyardV4Root", "initializeModel");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  @Main
  public static void main(final ShipyardV4Root _self) {
    final shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			shipyardV4.aspects.ShipyardV4RootAspect._privk3_main(_self_, (shipyardV4.ShipyardV4Root)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "ShipyardV4Root", "main");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static String inputSequence(final ShipyardV4Root _self) {
    final shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String inputSequence()
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	result = shipyardV4.aspects.ShipyardV4RootAspect._privk3_inputSequence(_self_, (shipyardV4.ShipyardV4Root)_self);
    };
    return (java.lang.String)result;
  }
  
  public static void inputSequence(final ShipyardV4Root _self, final String inputSequence) {
    final shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void inputSequence(String)
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	shipyardV4.aspects.ShipyardV4RootAspect._privk3_inputSequence(_self_, (shipyardV4.ShipyardV4Root)_self,inputSequence);
    };
  }
  
  public static Map<String, Collection<Trigger>> eventStringTriggerMap(final ShipyardV4Root _self) {
    final shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Map<String, Collection<Trigger>> eventStringTriggerMap()
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	result = shipyardV4.aspects.ShipyardV4RootAspect._privk3_eventStringTriggerMap(_self_, (shipyardV4.ShipyardV4Root)_self);
    };
    return (java.util.Map<java.lang.String, java.util.Collection<shipyardV4.Trigger>>)result;
  }
  
  public static void eventStringTriggerMap(final ShipyardV4Root _self, final Map<String, Collection<Trigger>> eventStringTriggerMap) {
    final shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void eventStringTriggerMap(Map<String, Collection<Trigger>>)
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	shipyardV4.aspects.ShipyardV4RootAspect._privk3_eventStringTriggerMap(_self_, (shipyardV4.ShipyardV4Root)_self,eventStringTriggerMap);
    };
  }
  
  protected static void _privk3_initializeModel(final ShipyardV4RootAspectShipyardV4RootAspectProperties _self_, final ShipyardV4Root _self, final List<String> args) {
    ShipyardV4RootAspect.inputSequence(_self, args.get(0));
    boolean _isEmpty = ShipyardV4RootAspect.inputSequence(_self).isEmpty();
    if (_isEmpty) {
      ShipyardV4RootAspect.inputSequence(_self, ShipyardOperationalSemanticsUtils.DEFAULT_INPUT_SEQUENCE);
    }
    ShipyardV4RootAspect.eventStringTriggerMap(_self, ShipyardUtils.createEventStringTriggerMap(_self));
  }
  
  protected static void _privk3_main(final ShipyardV4RootAspectShipyardV4RootAspectProperties _self_, final ShipyardV4Root _self) {
    try {
      Sequence currentSequence = ShipyardUtils.getSequenceByPath(_self, ShipyardV4RootAspect.inputSequence(_self));
      if ((currentSequence == null)) {
        throw new ShipyardRuntimeException("Not Input Sequence found");
      }
      SequenceAspect.step(currentSequence);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static String _privk3_inputSequence(final ShipyardV4RootAspectShipyardV4RootAspectProperties _self_, final ShipyardV4Root _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getInputSequence") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.inputSequence;
  }
  
  protected static void _privk3_inputSequence(final ShipyardV4RootAspectShipyardV4RootAspectProperties _self_, final ShipyardV4Root _self, final String inputSequence) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setInputSequence")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, inputSequence);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.inputSequence = inputSequence;
    }
  }
  
  protected static Map<String, Collection<Trigger>> _privk3_eventStringTriggerMap(final ShipyardV4RootAspectShipyardV4RootAspectProperties _self_, final ShipyardV4Root _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getEventStringTriggerMap") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Map) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.eventStringTriggerMap;
  }
  
  protected static void _privk3_eventStringTriggerMap(final ShipyardV4RootAspectShipyardV4RootAspectProperties _self_, final ShipyardV4Root _self, final Map<String, Collection<Trigger>> eventStringTriggerMap) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setEventStringTriggerMap")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, eventStringTriggerMap);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.eventStringTriggerMap = eventStringTriggerMap;
    }
  }
}
