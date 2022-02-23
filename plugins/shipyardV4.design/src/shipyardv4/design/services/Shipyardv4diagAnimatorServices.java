package shipyardv4.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices.StringCouple;

import shipyard.common.utils.ShipyardUtils;
import shipyardV4.Sequence;
import shipyardV4.ShipyardV4Root;
import shipyardV4.Task;
import shipyardV4.aspects.SequenceAspectSequenceAspectContext;
import shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext;
import shipyardV4.aspects.TaskAspectTaskAspectContext;
import shipyardV4.aspects.utils.ShipyardOperationalSemanticsUtils;

public class Shipyardv4diagAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {  
		final List<StringCouple> res = new ArrayList<StringCouple>();
		res.add(new StringCouple("ShipyardV4Diag", "Animation"));
		return res;
	}

	public boolean isCurrentTask(EObject o){    
		if(o instanceof Task){
			if (ShipyardV4RootAspectShipyardV4RootAspectContext.getSelf((ShipyardV4Root) EcoreUtil.getRootContainer(o))
				.currentTask.equals(o))
				return true; 
		} 
		return false;
	}
	
	public boolean isSequenceFailed(EObject sequence){  
		if(sequence instanceof Sequence){
			return ShipyardOperationalSemanticsUtils.RESULT_FAILED.equals(SequenceAspectSequenceAspectContext.getSelf( (Sequence) sequence).result);
		} 
		return false;
	}
	
	public boolean isSequencePassed(EObject sequence){  
		if(sequence instanceof Sequence){
			return ShipyardOperationalSemanticsUtils.RESULT_PASS.equals(SequenceAspectSequenceAspectContext.getSelf( (Sequence) sequence).result);
		} 
		return false;
	}
	
	public boolean isSequenceWarning(EObject sequence){  
		if(sequence instanceof Sequence){
			return ShipyardOperationalSemanticsUtils.RESULT_WARNING.equals(SequenceAspectSequenceAspectContext.getSelf( (Sequence) sequence).result);
		} 
		return false;
	}
	
	public boolean isTaskFailed(EObject task){  
		if(task instanceof Task){
			return ShipyardOperationalSemanticsUtils.RESULT_FAILED.equals(TaskAspectTaskAspectContext.getSelf( (Task) task).result);
		} 
		return false;
	}
	
	public boolean isTaskPassed(EObject task){  
		if(task instanceof Task){
			return ShipyardOperationalSemanticsUtils.RESULT_PASS.equals(TaskAspectTaskAspectContext.getSelf( (Task) task).result);
		} 
		return false;
	}
	
	public boolean isTaskWarning(EObject task){  
		if(task instanceof Task){
			return ShipyardOperationalSemanticsUtils.RESULT_WARNING.equals(TaskAspectTaskAspectContext.getSelf( (Task) task).result);
		} 
		return false;
	}

}
