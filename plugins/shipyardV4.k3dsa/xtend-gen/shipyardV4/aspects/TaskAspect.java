package shipyardV4.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import shipyardV4.Task;

/* @Aspect(className = Task.class) */@SuppressWarnings("all")
public class TaskAspect {
  @Step
  public void fireTask() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined"
      + "\ntoString cannot be resolved");
  }
}
