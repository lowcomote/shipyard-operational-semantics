/*
 * generated by Xtext 2.25.0
 */
package at.jku.bise.shipyardV4.validation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.xtext.validation.EValidatorRegistrar;

import shipyardV4.ShipyardV4Package;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class ShipyardV4Validator extends AbstractShipyardV4Validator {
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					ShipyardV4Package.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	
	public void register(EValidatorRegistrar registrar) {
		super.register(registrar);
		ShipyardV4Package ePackage = ShipyardV4Package.eINSTANCE;
		URI basicOclURI = URI.createPlatformPluginURI("/shipyardV4/shipyardV4Opt.ocl", true);
		registrar.register(ePackage, new CompleteOCLEObjectValidator(ePackage, basicOclURI));
		}
	
}
