package shipyardv4.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices.StringCouple;

import shipyardV4.Sequence;
import shipyardV4.ShipyardV4Root;
import shipyardV4.Task;
import shipyardV4.aspects.ShipyardV4RootAspectShipyardV4RootAspectContext;

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

}
