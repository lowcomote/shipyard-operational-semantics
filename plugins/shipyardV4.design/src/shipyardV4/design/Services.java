package shipyardV4.design;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import shipyardV4.ShipyardV4Root;
import shipyardV4.Stage;
import shipyardV4.design.api.ShipyardUtils;

/**
 * The services class used by VSM.
 */
public class Services {
    
   public Collection<Stage> getStages(ShipyardV4Root shipyardRoot) {
	   return ShipyardUtils.getStages(shipyardRoot);
   }
   
   public String getStageName(Stage stage) {
	   return ShipyardUtils.getStageName(stage);
   }
}
