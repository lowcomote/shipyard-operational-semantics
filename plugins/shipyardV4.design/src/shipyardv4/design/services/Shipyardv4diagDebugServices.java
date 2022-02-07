﻿package shipyardv4.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

import shipyardV4.Sequence;

public class Shipyardv4diagDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		// Add in res the list of layers that should be activated and refreshed while debugging the model
		//	in case of a single odesign with all layers in a single viewpoint:
        //		- the first String is the id of the Diagram Description
        //		- the second String is the id of the Layer
		//  
		//	in case of a diagram extension:
		//		- the first String is the Representation Name of the Diagram Extension (do not confuse with the Name !!)
		//		- the second String is the id of the Layer
		final List<StringCouple> res = new ArrayList<StringCouple>();
	
		res.add(new StringCouple("ShipyardV4Diag", "Debug"));
		
		res.add(new StringCouple("ShipyardV4Diag", "Animation"));

		return res;
	}
	
	public boolean isCurrentState(EObject o){     
		if(o instanceof Sequence){
			//TODO we do not know the sequence that is currently executing
			//(SequenceAs)EcoreUtil.getRootContainer(o);
			//return ; 
		} else {
			return false;
		}
		return false;
	}
	
	@Override
	public String getModelIdentifier(){
		// Important Note:
		// by default the wizard  generates a ModelIdentifier linked with the sequential engine.
		// ie. return org.eclipse.gemoc.execution.sequential.javaengine.ui.Activator.DEBUG_MODEL_ID;
		// however, if the Debug service is to be used by another engine, you must use the targeted engine's
		// debug model id and update the manifest dependencies accordingly.
		// for example, org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.Activator.DEBUG_MODEL_ID for the concurrent engine.
		return org.eclipse.gemoc.execution.sequential.javaengine.ui.Activator.DEBUG_MODEL_ID;
	}	

}