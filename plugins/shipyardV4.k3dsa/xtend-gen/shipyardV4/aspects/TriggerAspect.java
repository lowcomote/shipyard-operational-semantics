package shipyardV4.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import shipyardV4.Trigger;

/* @Aspect(className = Trigger.class) */@SuppressWarnings("all")
public class TriggerAspect {
  @Step
  public void fireTrigger() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined"
      + "\ntoString cannot be resolved");
  }
}
