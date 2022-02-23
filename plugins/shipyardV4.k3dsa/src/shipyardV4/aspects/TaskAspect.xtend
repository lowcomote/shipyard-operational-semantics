package shipyardV4.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import shipyardV4.Task
import fr.inria.diverse.k3.al.annotationprocessor.Step
import shipyardV4.ShipyardV4Root
import shipyardV4.aspects.utils.ShipyardOperationalSemanticsUtils
import org.eclipse.emf.ecore.util.EcoreUtil

import static extension shipyardV4.aspects.ShipyardV4RootAspect.*

@Aspect(className=Task)
class TaskAspect {
	public String result;
	@Step												
	def void fireTask() {
		println("Fire: " + _self.toString);
		
		var ShipyardV4Root shipyardV4Root = EcoreUtil.getRootContainer(_self) as ShipyardV4Root;
//		shipyardV4Root.executedTasks.add(_self)
		if(shipyardV4Root.executionConfiguration!==null && shipyardV4Root.executionConfiguration.taskFinishedResult !==null){
			if(shipyardV4Root.executionConfiguration.taskFinishedResult.failedTasks.contains(_self)){
				_self.result=ShipyardOperationalSemanticsUtils.RESULT_FAILED;
			}else if(shipyardV4Root.executionConfiguration.taskFinishedResult.warningTasks.contains(_self)){
				_self.result=ShipyardOperationalSemanticsUtils.RESULT_WARNING;
			}else {
				_self.result=ShipyardOperationalSemanticsUtils.RESULT_PASS;
			}
		}else{
			_self.result=ShipyardOperationalSemanticsUtils.RESULT_PASS;
		}
		 
		
	}
}