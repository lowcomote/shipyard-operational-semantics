package shipyardv4.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.List;
import shipyardV4.Sequence;
import shipyardV4.ShipyardV4Root;
import shipyardv4.aspects.utils.ShipyardOperationalSemanticsUtils;

@Aspect(className = ShipyardV4Root.class)
@SuppressWarnings("all")
public class ShipyardV4RootAspect {
  @Step
  @InitializeModel
  public static void initializeModel(final ShipyardV4Root _self, final List<String> args) {
    final shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initializeModel(List<String>)
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			shipyardv4.aspects.ShipyardV4RootAspect._privk3_initializeModel(_self_, (shipyardV4.ShipyardV4Root)_self,args);
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
    final shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			shipyardv4.aspects.ShipyardV4RootAspect._privk3_main(_self_, (shipyardV4.ShipyardV4Root)_self);
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
  
  private static String inputSequence(final ShipyardV4Root _self) {
    final shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String inputSequence()
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	result = shipyardv4.aspects.ShipyardV4RootAspect._privk3_inputSequence(_self_, (shipyardV4.ShipyardV4Root)_self);
    };
    return (java.lang.String)result;
  }
  
  private static void inputSequence(final ShipyardV4Root _self, final String inputSequence) {
    final shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void inputSequence(String)
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	shipyardv4.aspects.ShipyardV4RootAspect._privk3_inputSequence(_self_, (shipyardV4.ShipyardV4Root)_self,inputSequence);
    };
  }
  
  private static Sequence currentSequence(final ShipyardV4Root _self) {
    final shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Sequence currentSequence()
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	result = shipyardv4.aspects.ShipyardV4RootAspect._privk3_currentSequence(_self_, (shipyardV4.ShipyardV4Root)_self);
    };
    return (shipyardV4.Sequence)result;
  }
  
  private static void currentSequence(final ShipyardV4Root _self, final Sequence currentSequence) {
    final shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties _self_ = shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentSequence(Sequence)
    if (_self instanceof shipyardV4.ShipyardV4Root){
    	shipyardv4.aspects.ShipyardV4RootAspect._privk3_currentSequence(_self_, (shipyardV4.ShipyardV4Root)_self,currentSequence);
    };
  }
  
  protected static void _privk3_initializeModel(final ShipyardV4RootAspectShipyardV4RootAspectProperties _self_, final ShipyardV4Root _self, final List<String> args) {
    ShipyardV4RootAspect.inputSequence(_self, args.get(0));
    boolean _isEmpty = ShipyardV4RootAspect.inputSequence(_self).isEmpty();
    if (_isEmpty) {
      ShipyardV4RootAspect.inputSequence(_self, ShipyardOperationalSemanticsUtils.DEFAULT_INPUT_SEQUENCE);
    }
  }
  
  protected static void _privk3_main(final ShipyardV4RootAspectShipyardV4RootAspectProperties _self_, final ShipyardV4Root _self) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method step() is undefined for the type Sequence");
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
  
  protected static Sequence _privk3_currentSequence(final ShipyardV4RootAspectShipyardV4RootAspectProperties _self_, final ShipyardV4Root _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentSequence") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (shipyardV4.Sequence) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentSequence;
  }
  
  protected static void _privk3_currentSequence(final ShipyardV4RootAspectShipyardV4RootAspectProperties _self_, final ShipyardV4Root _self, final Sequence currentSequence) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentSequence")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentSequence);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentSequence = currentSequence;
    }
  }
}
