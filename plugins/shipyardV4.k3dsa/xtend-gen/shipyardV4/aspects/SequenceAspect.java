package shipyardV4.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Collection;
import java.util.Map;
import shipyardV4.Sequence;
import shipyardV4.Trigger;

/* @Aspect(className = Sequence.class) */@SuppressWarnings("all")
public class SequenceAspect {
  @Step
  public void step(final Map<String, Collection<Trigger>> eventStringTriggerMap) {
    throw new Error("Unresolved compilation problems:"
      + "\nmissing \')\' at \'EcoreUtil\'"
      + "\nmismatched input \')\' expecting \'}\'"
      + "\nThe method or field fireTask is undefined for the type Task"
      + "\nUse \'as\' keyword for type casting."
      + "\nThis expression is not allowed in this context, since it doesn\'t cause any side effects.");
  }
  
  private /* eventStringTriggerMap */Object println;
  
  private Object _self;
}
