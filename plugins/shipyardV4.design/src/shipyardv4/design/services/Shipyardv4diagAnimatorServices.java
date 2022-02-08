package shipyardv4.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices.StringCouple;

import shipyardV4.Sequence;
import shipyardV4.Task;

public class Shipyardv4diagAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {  
		final List<StringCouple> res = new ArrayList<StringCouple>();
		res.add(new StringCouple("ShipyardV4Diag", "Animation"));
		return res;
	}

	public boolean isCurrentTask(EObject o){    
		if(o instanceof Task){
			//TODO if is executing
			//(SequenceAs)EcoreUtil.getRootContainer(o);
			return true; 
		} else {
			return false;
		}		
	}

}
