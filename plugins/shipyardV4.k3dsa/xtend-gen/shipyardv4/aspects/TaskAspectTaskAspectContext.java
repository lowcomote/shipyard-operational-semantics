package shipyardV4.aspects;

import java.util.Map;
import shipyardV4.Task;

@SuppressWarnings("all")
public class TaskAspectTaskAspectContext {
  public static final TaskAspectTaskAspectContext INSTANCE = new TaskAspectTaskAspectContext();
  
  public static TaskAspectTaskAspectProperties getSelf(final Task _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new shipyardV4.aspects.TaskAspectTaskAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Task, TaskAspectTaskAspectProperties> map = new java.util.WeakHashMap<shipyardV4.Task, shipyardV4.aspects.TaskAspectTaskAspectProperties>();
  
  public Map<Task, TaskAspectTaskAspectProperties> getMap() {
    return map;
  }
}
