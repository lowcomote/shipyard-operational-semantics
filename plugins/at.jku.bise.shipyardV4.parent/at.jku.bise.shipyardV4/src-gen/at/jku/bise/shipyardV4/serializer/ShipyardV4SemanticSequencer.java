/*
 * generated by Xtext 2.25.0
 */
package at.jku.bise.shipyardV4.serializer;

import at.jku.bise.shipyardV4.services.ShipyardV4GrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import jsonMetaschemaMM.ArrayValue;
import jsonMetaschemaMM.BooleanValue;
import jsonMetaschemaMM.IntegerValue;
import jsonMetaschemaMM.JsonDocument;
import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.KeyValuePair;
import jsonMetaschemaMM.NullValue;
import jsonMetaschemaMM.NumberValue;
import jsonMetaschemaMM.ObjectValue;
import jsonMetaschemaMM.StringValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import shipyardV4.Metadata;
import shipyardV4.MetadataName;
import shipyardV4.Selector;
import shipyardV4.SelectorMatch;
import shipyardV4.SelectorMatchPatternProperties0;
import shipyardV4.Sequence;
import shipyardV4.SequenceName;
import shipyardV4.SequenceTasks;
import shipyardV4.SequenceTasksItems;
import shipyardV4.SequenceTriggeredOn;
import shipyardV4.SequenceTriggeredOnItems;
import shipyardV4.Shipyard;
import shipyardV4.ShipyardApiVersion;
import shipyardV4.ShipyardKind;
import shipyardV4.ShipyardMetadata;
import shipyardV4.ShipyardSpec;
import shipyardV4.ShipyardSpec1;
import shipyardV4.ShipyardSpecStages;
import shipyardV4.ShipyardSpecStagesItems;
import shipyardV4.ShipyardV4Package;
import shipyardV4.ShipyardV4Root;
import shipyardV4.Stage;
import shipyardV4.StageName;
import shipyardV4.StageSequences;
import shipyardV4.StageSequencesItems;
import shipyardV4.Task;
import shipyardV4.TaskName;
import shipyardV4.TaskProperties;
import shipyardV4.TaskPropertiesAdditionalProperties;
import shipyardV4.Trigger;
import shipyardV4.TriggerEvent;
import shipyardV4.TriggerSelector;

@SuppressWarnings("all")
public class ShipyardV4SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ShipyardV4GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JsonMetaschemaMMPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JsonMetaschemaMMPackage.ARRAY_VALUE:
				sequence_ArrayValue(context, (ArrayValue) semanticObject); 
				return; 
			case JsonMetaschemaMMPackage.BOOLEAN_VALUE:
				sequence_BooleanValue(context, (BooleanValue) semanticObject); 
				return; 
			case JsonMetaschemaMMPackage.INTEGER_VALUE:
				sequence_IntegerValue(context, (IntegerValue) semanticObject); 
				return; 
			case JsonMetaschemaMMPackage.JSON_DOCUMENT:
				sequence_JsonDocument(context, (JsonDocument) semanticObject); 
				return; 
			case JsonMetaschemaMMPackage.KEY_VALUE_PAIR:
				sequence_KeyValuePair(context, (KeyValuePair) semanticObject); 
				return; 
			case JsonMetaschemaMMPackage.NULL_VALUE:
				sequence_NullValue(context, (NullValue) semanticObject); 
				return; 
			case JsonMetaschemaMMPackage.NUMBER_VALUE:
				sequence_NumberValue(context, (NumberValue) semanticObject); 
				return; 
			case JsonMetaschemaMMPackage.OBJECT_VALUE:
				sequence_ObjectValue(context, (ObjectValue) semanticObject); 
				return; 
			case JsonMetaschemaMMPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			}
		else if (epackage == ShipyardV4Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ShipyardV4Package.METADATA:
				sequence_Metadata(context, (Metadata) semanticObject); 
				return; 
			case ShipyardV4Package.METADATA_NAME:
				sequence_MetadataName(context, (MetadataName) semanticObject); 
				return; 
			case ShipyardV4Package.SELECTOR:
				sequence_Selector(context, (Selector) semanticObject); 
				return; 
			case ShipyardV4Package.SELECTOR_MATCH:
				sequence_SelectorMatch(context, (SelectorMatch) semanticObject); 
				return; 
			case ShipyardV4Package.SELECTOR_MATCH_PATTERN_PROPERTIES0:
				sequence_SelectorMatchPatternProperties0(context, (SelectorMatchPatternProperties0) semanticObject); 
				return; 
			case ShipyardV4Package.SEQUENCE:
				sequence_Sequence(context, (Sequence) semanticObject); 
				return; 
			case ShipyardV4Package.SEQUENCE_NAME:
				sequence_SequenceName(context, (SequenceName) semanticObject); 
				return; 
			case ShipyardV4Package.SEQUENCE_TASKS:
				sequence_SequenceTasks(context, (SequenceTasks) semanticObject); 
				return; 
			case ShipyardV4Package.SEQUENCE_TASKS_ITEMS:
				sequence_SequenceTasksItems(context, (SequenceTasksItems) semanticObject); 
				return; 
			case ShipyardV4Package.SEQUENCE_TRIGGERED_ON:
				sequence_SequenceTriggeredOn(context, (SequenceTriggeredOn) semanticObject); 
				return; 
			case ShipyardV4Package.SEQUENCE_TRIGGERED_ON_ITEMS:
				sequence_SequenceTriggeredOnItems(context, (SequenceTriggeredOnItems) semanticObject); 
				return; 
			case ShipyardV4Package.SHIPYARD:
				sequence_Shipyard(context, (Shipyard) semanticObject); 
				return; 
			case ShipyardV4Package.SHIPYARD_API_VERSION:
				sequence_ShipyardApiVersion(context, (ShipyardApiVersion) semanticObject); 
				return; 
			case ShipyardV4Package.SHIPYARD_KIND:
				sequence_ShipyardKind(context, (ShipyardKind) semanticObject); 
				return; 
			case ShipyardV4Package.SHIPYARD_METADATA:
				sequence_ShipyardMetadata(context, (ShipyardMetadata) semanticObject); 
				return; 
			case ShipyardV4Package.SHIPYARD_SPEC:
				sequence_ShipyardSpec(context, (ShipyardSpec) semanticObject); 
				return; 
			case ShipyardV4Package.SHIPYARD_SPEC1:
				sequence_ShipyardSpec1(context, (ShipyardSpec1) semanticObject); 
				return; 
			case ShipyardV4Package.SHIPYARD_SPEC_STAGES:
				sequence_ShipyardSpecStages(context, (ShipyardSpecStages) semanticObject); 
				return; 
			case ShipyardV4Package.SHIPYARD_SPEC_STAGES_ITEMS:
				sequence_ShipyardSpecStagesItems(context, (ShipyardSpecStagesItems) semanticObject); 
				return; 
			case ShipyardV4Package.SHIPYARD_V4_ROOT:
				sequence_ShipyardV4Root(context, (ShipyardV4Root) semanticObject); 
				return; 
			case ShipyardV4Package.STAGE:
				sequence_Stage(context, (Stage) semanticObject); 
				return; 
			case ShipyardV4Package.STAGE_NAME:
				sequence_StageName(context, (StageName) semanticObject); 
				return; 
			case ShipyardV4Package.STAGE_SEQUENCES:
				sequence_StageSequences(context, (StageSequences) semanticObject); 
				return; 
			case ShipyardV4Package.STAGE_SEQUENCES_ITEMS:
				sequence_StageSequencesItems(context, (StageSequencesItems) semanticObject); 
				return; 
			case ShipyardV4Package.TASK:
				sequence_Task(context, (Task) semanticObject); 
				return; 
			case ShipyardV4Package.TASK_NAME:
				sequence_TaskName(context, (TaskName) semanticObject); 
				return; 
			case ShipyardV4Package.TASK_PROPERTIES:
				sequence_TaskProperties(context, (TaskProperties) semanticObject); 
				return; 
			case ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES:
				sequence_TaskPropertiesAdditionalProperties(context, (TaskPropertiesAdditionalProperties) semanticObject); 
				return; 
			case ShipyardV4Package.TRIGGER:
				sequence_Trigger(context, (Trigger) semanticObject); 
				return; 
			case ShipyardV4Package.TRIGGER_EVENT:
				sequence_TriggerEvent(context, (TriggerEvent) semanticObject); 
				return; 
			case ShipyardV4Package.TRIGGER_SELECTOR:
				sequence_TriggerSelector(context, (TriggerSelector) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Value returns ArrayValue
	 *     ArrayValue returns ArrayValue
	 *
	 * Constraint:
	 *     (value+=Value value+=Value*)?
	 */
	protected void sequence_ArrayValue(ISerializationContext context, ArrayValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns BooleanValue
	 *     BooleanValue returns BooleanValue
	 *
	 * Constraint:
	 *     value?='value'
	 */
	protected void sequence_BooleanValue(ISerializationContext context, BooleanValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMetaschemaMMPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMetaschemaMMPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueValueKeyword_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns IntegerValue
	 *     IntegerValue returns IntegerValue
	 *
	 * Constraint:
	 *     value=EInt
	 */
	protected void sequence_IntegerValue(ISerializationContext context, IntegerValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMetaschemaMMPackage.Literals.INTEGER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMetaschemaMMPackage.Literals.INTEGER_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JsonDocument returns JsonDocument
	 *
	 * Constraint:
	 *     value=Value
	 */
	protected void sequence_JsonDocument(ISerializationContext context, JsonDocument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMetaschemaMMPackage.Literals.JSON_DOCUMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMetaschemaMMPackage.Literals.JSON_DOCUMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     KeyValuePair returns KeyValuePair
	 *
	 * Constraint:
	 *     (key=EString value=Value)
	 */
	protected void sequence_KeyValuePair(ISerializationContext context, KeyValuePair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMetaschemaMMPackage.Literals.KEY_VALUE_PAIR__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMetaschemaMMPackage.Literals.KEY_VALUE_PAIR__KEY));
			if (transientValues.isValueTransient(semanticObject, JsonMetaschemaMMPackage.Literals.KEY_VALUE_PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMetaschemaMMPackage.Literals.KEY_VALUE_PAIR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MetadataPropertiesAbstract returns MetadataName
	 *     MetadataName returns MetadataName
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_MetadataName(ISerializationContext context, MetadataName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.METADATA_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.METADATA_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMetadataNameAccess().getNameEStringParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Metadata returns Metadata
	 *
	 * Constraint:
	 *     (Metadata+=MetadataPropertiesAbstract Metadata+=MetadataPropertiesAbstract*)?
	 */
	protected void sequence_Metadata(ISerializationContext context, Metadata semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns NullValue
	 *     NullValue returns NullValue
	 *
	 * Constraint:
	 *     value=NullEnum
	 */
	protected void sequence_NullValue(ISerializationContext context, NullValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMetaschemaMMPackage.Literals.NULL_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMetaschemaMMPackage.Literals.NULL_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns NumberValue
	 *     NumberValue returns NumberValue
	 *
	 * Constraint:
	 *     value=EDouble
	 */
	protected void sequence_NumberValue(ISerializationContext context, NumberValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMetaschemaMMPackage.Literals.NUMBER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMetaschemaMMPackage.Literals.NUMBER_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns ObjectValue
	 *     ObjectValue returns ObjectValue
	 *
	 * Constraint:
	 *     (keyvaluepair+=KeyValuePair keyvaluepair+=KeyValuePair*)?
	 */
	protected void sequence_ObjectValue(ISerializationContext context, ObjectValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SelectorMatchPropertiesAbstract returns SelectorMatchPatternProperties0
	 *     SelectorMatchPatternProperties0 returns SelectorMatchPatternProperties0
	 *
	 * Constraint:
	 *     (key=EString patternProperties0=EString)
	 */
	protected void sequence_SelectorMatchPatternProperties0(ISerializationContext context, SelectorMatchPatternProperties0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.SELECTOR_MATCH_PATTERN_PROPERTIES0__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.SELECTOR_MATCH_PATTERN_PROPERTIES0__KEY));
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.SELECTOR_MATCH_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.SELECTOR_MATCH_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelectorMatchPatternProperties0Access().getKeyEStringParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getSelectorMatchPatternProperties0Access().getPatternProperties0EStringParserRuleCall_2_0(), semanticObject.getPatternProperties0());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SelectorPropertiesAbstract returns SelectorMatch
	 *     SelectorMatch returns SelectorMatch
	 *
	 * Constraint:
	 *     (match+=SelectorMatchPropertiesAbstract match+=SelectorMatchPropertiesAbstract*)?
	 */
	protected void sequence_SelectorMatch(ISerializationContext context, SelectorMatch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Selector returns Selector
	 *
	 * Constraint:
	 *     (Selector+=SelectorPropertiesAbstract Selector+=SelectorPropertiesAbstract*)?
	 */
	protected void sequence_Selector(ISerializationContext context, Selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SequencePropertiesAbstract returns SequenceName
	 *     SequenceName returns SequenceName
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_SequenceName(ISerializationContext context, SequenceName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.SEQUENCE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.SEQUENCE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSequenceNameAccess().getNameEStringParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SequenceTasksItems returns SequenceTasksItems
	 *
	 * Constraint:
	 *     items=Task
	 */
	protected void sequence_SequenceTasksItems(ISerializationContext context, SequenceTasksItems semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.SEQUENCE_TASKS_ITEMS__ITEMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.SEQUENCE_TASKS_ITEMS__ITEMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSequenceTasksItemsAccess().getItemsTaskParserRuleCall_0(), semanticObject.getItems());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SequencePropertiesAbstract returns SequenceTasks
	 *     SequenceTasks returns SequenceTasks
	 *
	 * Constraint:
	 *     (tasks+=SequenceTasksItems tasks+=SequenceTasksItems*)?
	 */
	protected void sequence_SequenceTasks(ISerializationContext context, SequenceTasks semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SequenceTriggeredOnItems returns SequenceTriggeredOnItems
	 *
	 * Constraint:
	 *     items=Trigger
	 */
	protected void sequence_SequenceTriggeredOnItems(ISerializationContext context, SequenceTriggeredOnItems semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.SEQUENCE_TRIGGERED_ON_ITEMS__ITEMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.SEQUENCE_TRIGGERED_ON_ITEMS__ITEMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSequenceTriggeredOnItemsAccess().getItemsTriggerParserRuleCall_0(), semanticObject.getItems());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SequencePropertiesAbstract returns SequenceTriggeredOn
	 *     SequenceTriggeredOn returns SequenceTriggeredOn
	 *
	 * Constraint:
	 *     (triggeredOn+=SequenceTriggeredOnItems triggeredOn+=SequenceTriggeredOnItems*)?
	 */
	protected void sequence_SequenceTriggeredOn(ISerializationContext context, SequenceTriggeredOn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sequence returns Sequence
	 *
	 * Constraint:
	 *     (Sequence+=SequencePropertiesAbstract Sequence+=SequencePropertiesAbstract*)?
	 */
	protected void sequence_Sequence(ISerializationContext context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ShipyardPropertiesAbstract returns ShipyardApiVersion
	 *     ShipyardApiVersion returns ShipyardApiVersion
	 *
	 * Constraint:
	 *     apiVersion=EString
	 */
	protected void sequence_ShipyardApiVersion(ISerializationContext context, ShipyardApiVersion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.SHIPYARD_API_VERSION__API_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.SHIPYARD_API_VERSION__API_VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShipyardApiVersionAccess().getApiVersionEStringParserRuleCall_2_0(), semanticObject.getApiVersion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ShipyardPropertiesAbstract returns ShipyardKind
	 *     ShipyardKind returns ShipyardKind
	 *
	 * Constraint:
	 *     kind=EString
	 */
	protected void sequence_ShipyardKind(ISerializationContext context, ShipyardKind semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.SHIPYARD_KIND__KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.SHIPYARD_KIND__KIND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShipyardKindAccess().getKindEStringParserRuleCall_2_0(), semanticObject.getKind());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ShipyardPropertiesAbstract returns ShipyardMetadata
	 *     ShipyardMetadata returns ShipyardMetadata
	 *
	 * Constraint:
	 *     metadata=Metadata
	 */
	protected void sequence_ShipyardMetadata(ISerializationContext context, ShipyardMetadata semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.SHIPYARD_METADATA__METADATA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.SHIPYARD_METADATA__METADATA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShipyardMetadataAccess().getMetadataMetadataParserRuleCall_2_0(), semanticObject.getMetadata());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ShipyardPropertiesAbstract returns ShipyardSpec1
	 *     ShipyardSpec1 returns ShipyardSpec1
	 *
	 * Constraint:
	 *     spec=ShipyardSpec
	 */
	protected void sequence_ShipyardSpec1(ISerializationContext context, ShipyardSpec1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.SHIPYARD_SPEC1__SPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.SHIPYARD_SPEC1__SPEC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShipyardSpec1Access().getSpecShipyardSpecParserRuleCall_2_0(), semanticObject.getSpec());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ShipyardSpecStagesItems returns ShipyardSpecStagesItems
	 *
	 * Constraint:
	 *     items=Stage
	 */
	protected void sequence_ShipyardSpecStagesItems(ISerializationContext context, ShipyardSpecStagesItems semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.SHIPYARD_SPEC_STAGES_ITEMS__ITEMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.SHIPYARD_SPEC_STAGES_ITEMS__ITEMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShipyardSpecStagesItemsAccess().getItemsStageParserRuleCall_0(), semanticObject.getItems());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ShipyardSpecPropertiesAbstract returns ShipyardSpecStages
	 *     ShipyardSpecStages returns ShipyardSpecStages
	 *
	 * Constraint:
	 *     (stages+=ShipyardSpecStagesItems stages+=ShipyardSpecStagesItems*)?
	 */
	protected void sequence_ShipyardSpecStages(ISerializationContext context, ShipyardSpecStages semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ShipyardSpec returns ShipyardSpec
	 *
	 * Constraint:
	 *     (ShipyardSpec+=ShipyardSpecPropertiesAbstract ShipyardSpec+=ShipyardSpecPropertiesAbstract*)?
	 */
	protected void sequence_ShipyardSpec(ISerializationContext context, ShipyardSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ShipyardV4Root returns ShipyardV4Root
	 *
	 * Constraint:
	 *     shipyardV4Root=Shipyard
	 */
	protected void sequence_ShipyardV4Root(ISerializationContext context, ShipyardV4Root semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShipyardV4RootAccess().getShipyardV4RootShipyardParserRuleCall_0(), semanticObject.getShipyardV4Root());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Shipyard returns Shipyard
	 *
	 * Constraint:
	 *     (Shipyard+=ShipyardPropertiesAbstract Shipyard+=ShipyardPropertiesAbstract*)?
	 */
	protected void sequence_Shipyard(ISerializationContext context, Shipyard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StagePropertiesAbstract returns StageName
	 *     StageName returns StageName
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_StageName(ISerializationContext context, StageName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.STAGE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.STAGE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStageNameAccess().getNameEStringParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StageSequencesItems returns StageSequencesItems
	 *
	 * Constraint:
	 *     items=Sequence
	 */
	protected void sequence_StageSequencesItems(ISerializationContext context, StageSequencesItems semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.STAGE_SEQUENCES_ITEMS__ITEMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.STAGE_SEQUENCES_ITEMS__ITEMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStageSequencesItemsAccess().getItemsSequenceParserRuleCall_0(), semanticObject.getItems());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StagePropertiesAbstract returns StageSequences
	 *     StageSequences returns StageSequences
	 *
	 * Constraint:
	 *     (sequences+=StageSequencesItems sequences+=StageSequencesItems*)?
	 */
	protected void sequence_StageSequences(ISerializationContext context, StageSequences semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Stage returns Stage
	 *
	 * Constraint:
	 *     (Stage+=StagePropertiesAbstract Stage+=StagePropertiesAbstract*)?
	 */
	protected void sequence_Stage(ISerializationContext context, Stage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JsonMetaschemaMMPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonMetaschemaMMPackage.Literals.STRING_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TaskPropertiesAbstract returns TaskName
	 *     TaskName returns TaskName
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_TaskName(ISerializationContext context, TaskName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.TASK_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.TASK_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTaskNameAccess().getNameEStringParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TaskPropertiesPropertiesAbstract returns TaskPropertiesAdditionalProperties
	 *     TaskPropertiesAdditionalProperties returns TaskPropertiesAdditionalProperties
	 *
	 * Constraint:
	 *     (key=EString additionalProperties=JsonDocument)
	 */
	protected void sequence_TaskPropertiesAdditionalProperties(ISerializationContext context, TaskPropertiesAdditionalProperties semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__KEY));
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.TASK_PROPERTIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTaskPropertiesAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getTaskPropertiesAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0(), semanticObject.getAdditionalProperties());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TaskPropertiesAbstract returns TaskProperties
	 *     TaskProperties returns TaskProperties
	 *
	 * Constraint:
	 *     (properties+=TaskPropertiesPropertiesAbstract properties+=TaskPropertiesPropertiesAbstract*)?
	 */
	protected void sequence_TaskProperties(ISerializationContext context, TaskProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Task returns Task
	 *
	 * Constraint:
	 *     (Task+=TaskPropertiesAbstract Task+=TaskPropertiesAbstract*)?
	 */
	protected void sequence_Task(ISerializationContext context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TriggerPropertiesAbstract returns TriggerEvent
	 *     TriggerEvent returns TriggerEvent
	 *
	 * Constraint:
	 *     event=EString
	 */
	protected void sequence_TriggerEvent(ISerializationContext context, TriggerEvent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.TRIGGER_EVENT__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.TRIGGER_EVENT__EVENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTriggerEventAccess().getEventEStringParserRuleCall_2_0(), semanticObject.getEvent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TriggerPropertiesAbstract returns TriggerSelector
	 *     TriggerSelector returns TriggerSelector
	 *
	 * Constraint:
	 *     selector=Selector
	 */
	protected void sequence_TriggerSelector(ISerializationContext context, TriggerSelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ShipyardV4Package.Literals.TRIGGER_SELECTOR__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ShipyardV4Package.Literals.TRIGGER_SELECTOR__SELECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTriggerSelectorAccess().getSelectorSelectorParserRuleCall_2_0(), semanticObject.getSelector());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Trigger
	 *
	 * Constraint:
	 *     (Trigger+=TriggerPropertiesAbstract Trigger+=TriggerPropertiesAbstract*)?
	 */
	protected void sequence_Trigger(ISerializationContext context, Trigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
