package shipyardv4.aspects;

import java.util.Map;
import shipyardV4.ShipyardV4Root;

@SuppressWarnings("all")
public class ShipyardV4RootAspectShipyardV4RootAspectContext {
  public static final ShipyardV4RootAspectShipyardV4RootAspectContext INSTANCE = new ShipyardV4RootAspectShipyardV4RootAspectContext();
  
  public static ShipyardV4RootAspectShipyardV4RootAspectProperties getSelf(final ShipyardV4Root _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ShipyardV4Root, ShipyardV4RootAspectShipyardV4RootAspectProperties> map = new java.util.WeakHashMap<shipyardV4.ShipyardV4Root, shipyardv4.aspects.ShipyardV4RootAspectShipyardV4RootAspectProperties>();
  
  public Map<ShipyardV4Root, ShipyardV4RootAspectShipyardV4RootAspectProperties> getMap() {
    return map;
  }
}
