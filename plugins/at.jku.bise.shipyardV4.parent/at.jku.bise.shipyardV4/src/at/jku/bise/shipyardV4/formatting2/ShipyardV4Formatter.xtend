/*
 * generated by Xtext 2.25.0
 */
package at.jku.bise.shipyardV4.formatting2

import at.jku.bise.shipyardV4.services.ShipyardV4GrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import shipyardV4.Shipyard
import shipyardV4.ShipyardV4Root

class ShipyardV4Formatter extends AbstractFormatter2 {
	
	@Inject extension ShipyardV4GrammarAccess

	def dispatch void format(ShipyardV4Root shipyardV4Root, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		shipyardV4Root.shipyardV4Root.format
	}

	def dispatch void format(Shipyard shipyard, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (shipyardPropertiesAbstract : shipyard.shipyard) {
			shipyardPropertiesAbstract.format
		}
	}
	
	// TODO: implement for ShipyardMetadata, ShipyardSpec1, Metadata, ShipyardSpec, ShipyardSpecStages, ShipyardSpecStagesItems, Stage, StageSequences, StageSequencesItems, Sequence, SequenceTriggeredOn, SequenceTasks, SequenceTriggeredOnItems, Trigger, TriggerSelector, Selector, SelectorMatch, SequenceTasksItems, Task, TaskProperties, TaskPropertiesAdditionalProperties, JsonDocument, ObjectValue, ArrayValue, KeyValuePair
}