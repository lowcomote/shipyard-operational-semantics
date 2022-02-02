/*
 * generated by Xtext 2.25.0
 */
package at.jku.bise.shipyardV4.ide.contentassist.antlr;

import at.jku.bise.shipyardV4.ide.contentassist.antlr.internal.InternalShipyardV4Parser;
import at.jku.bise.shipyardV4.services.ShipyardV4GrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ShipyardV4Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ShipyardV4GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ShipyardV4GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getShipyardPropertiesAbstractAccess().getAlternatives(), "rule__ShipyardPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getStagePropertiesAbstractAccess().getAlternatives(), "rule__StagePropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getSequencePropertiesAbstractAccess().getAlternatives(), "rule__SequencePropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getTriggerPropertiesAbstractAccess().getAlternatives(), "rule__TriggerPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getTaskPropertiesAbstractAccess().getAlternatives(), "rule__TaskPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getShipyardAccess().getGroup(), "rule__Shipyard__Group__0");
			builder.put(grammarAccess.getShipyardAccess().getGroup_2(), "rule__Shipyard__Group_2__0");
			builder.put(grammarAccess.getShipyardAccess().getGroup_2_1(), "rule__Shipyard__Group_2_1__0");
			builder.put(grammarAccess.getShipyardApiVersionAccess().getGroup(), "rule__ShipyardApiVersion__Group__0");
			builder.put(grammarAccess.getShipyardKindAccess().getGroup(), "rule__ShipyardKind__Group__0");
			builder.put(grammarAccess.getShipyardMetadataAccess().getGroup(), "rule__ShipyardMetadata__Group__0");
			builder.put(grammarAccess.getShipyardSpec1Access().getGroup(), "rule__ShipyardSpec1__Group__0");
			builder.put(grammarAccess.getMetadataAccess().getGroup(), "rule__Metadata__Group__0");
			builder.put(grammarAccess.getMetadataAccess().getGroup_2(), "rule__Metadata__Group_2__0");
			builder.put(grammarAccess.getMetadataAccess().getGroup_2_1(), "rule__Metadata__Group_2_1__0");
			builder.put(grammarAccess.getMetadataNameAccess().getGroup(), "rule__MetadataName__Group__0");
			builder.put(grammarAccess.getShipyardSpecAccess().getGroup(), "rule__ShipyardSpec__Group__0");
			builder.put(grammarAccess.getShipyardSpecAccess().getGroup_2(), "rule__ShipyardSpec__Group_2__0");
			builder.put(grammarAccess.getShipyardSpecAccess().getGroup_2_1(), "rule__ShipyardSpec__Group_2_1__0");
			builder.put(grammarAccess.getShipyardSpecStagesAccess().getGroup(), "rule__ShipyardSpecStages__Group__0");
			builder.put(grammarAccess.getShipyardSpecStagesAccess().getGroup_4(), "rule__ShipyardSpecStages__Group_4__0");
			builder.put(grammarAccess.getShipyardSpecStagesAccess().getGroup_4_1(), "rule__ShipyardSpecStages__Group_4_1__0");
			builder.put(grammarAccess.getStageAccess().getGroup(), "rule__Stage__Group__0");
			builder.put(grammarAccess.getStageAccess().getGroup_2(), "rule__Stage__Group_2__0");
			builder.put(grammarAccess.getStageAccess().getGroup_2_1(), "rule__Stage__Group_2_1__0");
			builder.put(grammarAccess.getStageNameAccess().getGroup(), "rule__StageName__Group__0");
			builder.put(grammarAccess.getStageSequencesAccess().getGroup(), "rule__StageSequences__Group__0");
			builder.put(grammarAccess.getStageSequencesAccess().getGroup_4(), "rule__StageSequences__Group_4__0");
			builder.put(grammarAccess.getStageSequencesAccess().getGroup_4_1(), "rule__StageSequences__Group_4_1__0");
			builder.put(grammarAccess.getSequenceAccess().getGroup(), "rule__Sequence__Group__0");
			builder.put(grammarAccess.getSequenceAccess().getGroup_2(), "rule__Sequence__Group_2__0");
			builder.put(grammarAccess.getSequenceAccess().getGroup_2_1(), "rule__Sequence__Group_2_1__0");
			builder.put(grammarAccess.getSequenceNameAccess().getGroup(), "rule__SequenceName__Group__0");
			builder.put(grammarAccess.getSequenceTriggeredOnAccess().getGroup(), "rule__SequenceTriggeredOn__Group__0");
			builder.put(grammarAccess.getSequenceTriggeredOnAccess().getGroup_4(), "rule__SequenceTriggeredOn__Group_4__0");
			builder.put(grammarAccess.getSequenceTriggeredOnAccess().getGroup_4_1(), "rule__SequenceTriggeredOn__Group_4_1__0");
			builder.put(grammarAccess.getSequenceTasksAccess().getGroup(), "rule__SequenceTasks__Group__0");
			builder.put(grammarAccess.getSequenceTasksAccess().getGroup_4(), "rule__SequenceTasks__Group_4__0");
			builder.put(grammarAccess.getSequenceTasksAccess().getGroup_4_1(), "rule__SequenceTasks__Group_4_1__0");
			builder.put(grammarAccess.getTriggerAccess().getGroup(), "rule__Trigger__Group__0");
			builder.put(grammarAccess.getTriggerAccess().getGroup_2(), "rule__Trigger__Group_2__0");
			builder.put(grammarAccess.getTriggerAccess().getGroup_2_1(), "rule__Trigger__Group_2_1__0");
			builder.put(grammarAccess.getTriggerEventAccess().getGroup(), "rule__TriggerEvent__Group__0");
			builder.put(grammarAccess.getTriggerSelectorAccess().getGroup(), "rule__TriggerSelector__Group__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup(), "rule__Selector__Group__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup_2(), "rule__Selector__Group_2__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup_2_1(), "rule__Selector__Group_2_1__0");
			builder.put(grammarAccess.getSelectorMatchAccess().getGroup(), "rule__SelectorMatch__Group__0");
			builder.put(grammarAccess.getSelectorMatchAccess().getGroup_4(), "rule__SelectorMatch__Group_4__0");
			builder.put(grammarAccess.getSelectorMatchAccess().getGroup_4_1(), "rule__SelectorMatch__Group_4_1__0");
			builder.put(grammarAccess.getSelectorMatchPatternProperties0Access().getGroup(), "rule__SelectorMatchPatternProperties0__Group__0");
			builder.put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
			builder.put(grammarAccess.getTaskAccess().getGroup_2(), "rule__Task__Group_2__0");
			builder.put(grammarAccess.getTaskAccess().getGroup_2_1(), "rule__Task__Group_2_1__0");
			builder.put(grammarAccess.getTaskNameAccess().getGroup(), "rule__TaskName__Group__0");
			builder.put(grammarAccess.getTaskPropertiesAccess().getGroup(), "rule__TaskProperties__Group__0");
			builder.put(grammarAccess.getTaskPropertiesAccess().getGroup_4(), "rule__TaskProperties__Group_4__0");
			builder.put(grammarAccess.getTaskPropertiesAccess().getGroup_4_1(), "rule__TaskProperties__Group_4_1__0");
			builder.put(grammarAccess.getTaskPropertiesAdditionalPropertiesAccess().getGroup(), "rule__TaskPropertiesAdditionalProperties__Group__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup(), "rule__ObjectValue__Group__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2(), "rule__ObjectValue__Group_2__0");
			builder.put(grammarAccess.getObjectValueAccess().getGroup_2_1(), "rule__ObjectValue__Group_2_1__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2(), "rule__ArrayValue__Group_2__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup_2_1(), "rule__ArrayValue__Group_2_1__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getKeyValuePairAccess().getGroup(), "rule__KeyValuePair__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getShipyardV4RootAccess().getShipyardV4RootAssignment(), "rule__ShipyardV4Root__ShipyardV4RootAssignment");
			builder.put(grammarAccess.getShipyardAccess().getShipyardAssignment_2_0(), "rule__Shipyard__ShipyardAssignment_2_0");
			builder.put(grammarAccess.getShipyardAccess().getShipyardAssignment_2_1_1(), "rule__Shipyard__ShipyardAssignment_2_1_1");
			builder.put(grammarAccess.getShipyardApiVersionAccess().getApiVersionAssignment_2(), "rule__ShipyardApiVersion__ApiVersionAssignment_2");
			builder.put(grammarAccess.getShipyardKindAccess().getKindAssignment_2(), "rule__ShipyardKind__KindAssignment_2");
			builder.put(grammarAccess.getShipyardMetadataAccess().getMetadataAssignment_2(), "rule__ShipyardMetadata__MetadataAssignment_2");
			builder.put(grammarAccess.getShipyardSpec1Access().getSpecAssignment_2(), "rule__ShipyardSpec1__SpecAssignment_2");
			builder.put(grammarAccess.getMetadataAccess().getMetadataAssignment_2_0(), "rule__Metadata__MetadataAssignment_2_0");
			builder.put(grammarAccess.getMetadataAccess().getMetadataAssignment_2_1_1(), "rule__Metadata__MetadataAssignment_2_1_1");
			builder.put(grammarAccess.getMetadataNameAccess().getNameAssignment_3(), "rule__MetadataName__NameAssignment_3");
			builder.put(grammarAccess.getShipyardSpecAccess().getShipyardSpecAssignment_2_0(), "rule__ShipyardSpec__ShipyardSpecAssignment_2_0");
			builder.put(grammarAccess.getShipyardSpecAccess().getShipyardSpecAssignment_2_1_1(), "rule__ShipyardSpec__ShipyardSpecAssignment_2_1_1");
			builder.put(grammarAccess.getShipyardSpecStagesAccess().getStagesAssignment_4_0(), "rule__ShipyardSpecStages__StagesAssignment_4_0");
			builder.put(grammarAccess.getShipyardSpecStagesAccess().getStagesAssignment_4_1_1(), "rule__ShipyardSpecStages__StagesAssignment_4_1_1");
			builder.put(grammarAccess.getShipyardSpecStagesItemsAccess().getItemsAssignment(), "rule__ShipyardSpecStagesItems__ItemsAssignment");
			builder.put(grammarAccess.getStageAccess().getStageAssignment_2_0(), "rule__Stage__StageAssignment_2_0");
			builder.put(grammarAccess.getStageAccess().getStageAssignment_2_1_1(), "rule__Stage__StageAssignment_2_1_1");
			builder.put(grammarAccess.getStageNameAccess().getNameAssignment_3(), "rule__StageName__NameAssignment_3");
			builder.put(grammarAccess.getStageSequencesAccess().getSequencesAssignment_4_0(), "rule__StageSequences__SequencesAssignment_4_0");
			builder.put(grammarAccess.getStageSequencesAccess().getSequencesAssignment_4_1_1(), "rule__StageSequences__SequencesAssignment_4_1_1");
			builder.put(grammarAccess.getStageSequencesItemsAccess().getItemsAssignment(), "rule__StageSequencesItems__ItemsAssignment");
			builder.put(grammarAccess.getSequenceAccess().getSequenceAssignment_2_0(), "rule__Sequence__SequenceAssignment_2_0");
			builder.put(grammarAccess.getSequenceAccess().getSequenceAssignment_2_1_1(), "rule__Sequence__SequenceAssignment_2_1_1");
			builder.put(grammarAccess.getSequenceNameAccess().getNameAssignment_3(), "rule__SequenceName__NameAssignment_3");
			builder.put(grammarAccess.getSequenceTriggeredOnAccess().getTriggeredOnAssignment_4_0(), "rule__SequenceTriggeredOn__TriggeredOnAssignment_4_0");
			builder.put(grammarAccess.getSequenceTriggeredOnAccess().getTriggeredOnAssignment_4_1_1(), "rule__SequenceTriggeredOn__TriggeredOnAssignment_4_1_1");
			builder.put(grammarAccess.getSequenceTasksAccess().getTasksAssignment_4_0(), "rule__SequenceTasks__TasksAssignment_4_0");
			builder.put(grammarAccess.getSequenceTasksAccess().getTasksAssignment_4_1_1(), "rule__SequenceTasks__TasksAssignment_4_1_1");
			builder.put(grammarAccess.getSequenceTriggeredOnItemsAccess().getItemsAssignment(), "rule__SequenceTriggeredOnItems__ItemsAssignment");
			builder.put(grammarAccess.getTriggerAccess().getTriggerAssignment_2_0(), "rule__Trigger__TriggerAssignment_2_0");
			builder.put(grammarAccess.getTriggerAccess().getTriggerAssignment_2_1_1(), "rule__Trigger__TriggerAssignment_2_1_1");
			builder.put(grammarAccess.getTriggerEventAccess().getEventAssignment_2(), "rule__TriggerEvent__EventAssignment_2");
			builder.put(grammarAccess.getTriggerSelectorAccess().getSelectorAssignment_2(), "rule__TriggerSelector__SelectorAssignment_2");
			builder.put(grammarAccess.getSelectorAccess().getSelectorAssignment_2_0(), "rule__Selector__SelectorAssignment_2_0");
			builder.put(grammarAccess.getSelectorAccess().getSelectorAssignment_2_1_1(), "rule__Selector__SelectorAssignment_2_1_1");
			builder.put(grammarAccess.getSelectorMatchAccess().getMatchAssignment_4_0(), "rule__SelectorMatch__MatchAssignment_4_0");
			builder.put(grammarAccess.getSelectorMatchAccess().getMatchAssignment_4_1_1(), "rule__SelectorMatch__MatchAssignment_4_1_1");
			builder.put(grammarAccess.getSelectorMatchPatternProperties0Access().getKeyAssignment_0(), "rule__SelectorMatchPatternProperties0__KeyAssignment_0");
			builder.put(grammarAccess.getSelectorMatchPatternProperties0Access().getPatternProperties0Assignment_2(), "rule__SelectorMatchPatternProperties0__PatternProperties0Assignment_2");
			builder.put(grammarAccess.getSequenceTasksItemsAccess().getItemsAssignment(), "rule__SequenceTasksItems__ItemsAssignment");
			builder.put(grammarAccess.getTaskAccess().getTaskAssignment_2_0(), "rule__Task__TaskAssignment_2_0");
			builder.put(grammarAccess.getTaskAccess().getTaskAssignment_2_1_1(), "rule__Task__TaskAssignment_2_1_1");
			builder.put(grammarAccess.getTaskNameAccess().getNameAssignment_3(), "rule__TaskName__NameAssignment_3");
			builder.put(grammarAccess.getTaskPropertiesAccess().getPropertiesAssignment_4_0(), "rule__TaskProperties__PropertiesAssignment_4_0");
			builder.put(grammarAccess.getTaskPropertiesAccess().getPropertiesAssignment_4_1_1(), "rule__TaskProperties__PropertiesAssignment_4_1_1");
			builder.put(grammarAccess.getTaskPropertiesAdditionalPropertiesAccess().getKeyAssignment_0(), "rule__TaskPropertiesAdditionalProperties__KeyAssignment_0");
			builder.put(grammarAccess.getTaskPropertiesAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2(), "rule__TaskPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2");
			builder.put(grammarAccess.getJsonDocumentAccess().getValueAssignment(), "rule__JsonDocument__ValueAssignment");
			builder.put(grammarAccess.getIntegerValueAccess().getValueAssignment(), "rule__IntegerValue__ValueAssignment");
			builder.put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
			builder.put(grammarAccess.getNullValueAccess().getValueAssignment(), "rule__NullValue__ValueAssignment");
			builder.put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
			builder.put(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0(), "rule__ObjectValue__KeyvaluepairAssignment_2_0");
			builder.put(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1(), "rule__ObjectValue__KeyvaluepairAssignment_2_1_1");
			builder.put(grammarAccess.getNumberValueAccess().getValueAssignment(), "rule__NumberValue__ValueAssignment");
			builder.put(grammarAccess.getArrayValueAccess().getValueAssignment_2_0(), "rule__ArrayValue__ValueAssignment_2_0");
			builder.put(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1(), "rule__ArrayValue__ValueAssignment_2_1_1");
			builder.put(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0(), "rule__KeyValuePair__KeyAssignment_0");
			builder.put(grammarAccess.getKeyValuePairAccess().getValueAssignment_2(), "rule__KeyValuePair__ValueAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ShipyardV4GrammarAccess grammarAccess;

	@Override
	protected InternalShipyardV4Parser createParser() {
		InternalShipyardV4Parser result = new InternalShipyardV4Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ShipyardV4GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ShipyardV4GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}