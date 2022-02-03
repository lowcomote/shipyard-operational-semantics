package shipyardv4.aspects;

import java.util.Map;
import shipyardV4.Sequence;

@SuppressWarnings("all")
public class SequenceAspectSequenceAspectContext {
  public static final SequenceAspectSequenceAspectContext INSTANCE = new SequenceAspectSequenceAspectContext();
  
  public static SequenceAspectSequenceAspectProperties getSelf(final Sequence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new shipyardv4.aspects.SequenceAspectSequenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sequence, SequenceAspectSequenceAspectProperties> map = new java.util.WeakHashMap<shipyardV4.Sequence, shipyardv4.aspects.SequenceAspectSequenceAspectProperties>();
  
  public Map<Sequence, SequenceAspectSequenceAspectProperties> getMap() {
    return map;
  }
}
