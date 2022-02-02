package shipyardV4.design.api;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import shipyardV4.Sequence;
import shipyardV4.ShipyardSpec1;
import shipyardV4.ShipyardSpecStages;
import shipyardV4.ShipyardV4Root;
import shipyardV4.Stage;
import shipyardV4.StageName;
import shipyardV4.StageSequences;

public class ShipyardUtils {
	
	//Suppress default constructor for noninstantiability
	private ShipyardUtils() {
		throw new AssertionError();
	}
	
	//Get stages from ShipyardRoot
	public static Collection<Stage> getStages(ShipyardV4Root shipyardRoot) {
		var shipyardSpec1 = shipyardRoot.getShipyardV4Root().getShipyard()
											.stream()
											.filter(ShipyardSpec1.class::isInstance)
											.map(ShipyardSpec1.class::cast)
											.findAny()
											.orElseThrow(() -> new IllegalArgumentException("Expected ShipyardSpec1 type object"));
		
		var	shipyardSpecStages = shipyardSpec1.getSpec().getShipyardSpec()
										.stream()
										.filter(ShipyardSpecStages.class::isInstance)
										.map(ShipyardSpecStages.class::cast)
										.findAny()
										.orElseThrow(() -> new IllegalArgumentException("Expected ShipyardSpecStages type object"));
		
		return shipyardSpecStages.getStages()
									.stream()
									.map(stage -> stage.getItems())
									.collect(Collectors.toCollection(BasicEList::new));		
	}
	
	//Get StageName
	public static String getStageName(Stage stage) {
		var stageName= stage.getStage()
						.stream()
						.filter(StageName.class::isInstance)
						.map(StageName.class::cast)
						.findAny()
						.orElseThrow(() -> new IllegalArgumentException("Expected StageName type object"));
		return stageName.getName();
		
	}
	
	//Get Sequence
	public static Collection<Sequence> getSequencesfromStage(Stage stage) {
		var stageSequences = stage.getStage()
								.stream()
								.filter(StageSequences.class::isInstance)
								.map(StageSequences.class::cast)
								.findAny()
								.map(stageSequence -> stageSequence.getSequences())
								.map(null)							
								.collect(Collectors.toCollection(BasicEList::new))
								;	
		
		
		
		
		//return stageName.getName();
		return null;
	}
}
