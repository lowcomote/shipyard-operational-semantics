package at.jku.bise.shipyardV4.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.jku.bise.shipyardV4.services.ShipyardV4GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShipyardV4Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'\"apiVersion\"'", "':'", "'\"kind\"'", "'\"metadata\"'", "'\"spec\"'", "'\"name\"'", "'\"stages\"'", "'['", "']'", "'\"sequences\"'", "'\"triggeredOn\"'", "'\"tasks\"'", "'\"event\"'", "'\"selector\"'", "'\"match\"'", "'\"properties\"'", "'value'", "'-'", "'.'", "'E'", "'e'", "'null'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalShipyardV4Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalShipyardV4Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalShipyardV4Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalShipyardV4.g"; }



     	private ShipyardV4GrammarAccess grammarAccess;

        public InternalShipyardV4Parser(TokenStream input, ShipyardV4GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ShipyardV4Root";
       	}

       	@Override
       	protected ShipyardV4GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleShipyardV4Root"
    // InternalShipyardV4.g:65:1: entryRuleShipyardV4Root returns [EObject current=null] : iv_ruleShipyardV4Root= ruleShipyardV4Root EOF ;
    public final EObject entryRuleShipyardV4Root() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipyardV4Root = null;


        try {
            // InternalShipyardV4.g:65:55: (iv_ruleShipyardV4Root= ruleShipyardV4Root EOF )
            // InternalShipyardV4.g:66:2: iv_ruleShipyardV4Root= ruleShipyardV4Root EOF
            {
             newCompositeNode(grammarAccess.getShipyardV4RootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipyardV4Root=ruleShipyardV4Root();

            state._fsp--;

             current =iv_ruleShipyardV4Root; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipyardV4Root"


    // $ANTLR start "ruleShipyardV4Root"
    // InternalShipyardV4.g:72:1: ruleShipyardV4Root returns [EObject current=null] : ( (lv_shipyardV4Root_0_0= ruleShipyard ) ) ;
    public final EObject ruleShipyardV4Root() throws RecognitionException {
        EObject current = null;

        EObject lv_shipyardV4Root_0_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:78:2: ( ( (lv_shipyardV4Root_0_0= ruleShipyard ) ) )
            // InternalShipyardV4.g:79:2: ( (lv_shipyardV4Root_0_0= ruleShipyard ) )
            {
            // InternalShipyardV4.g:79:2: ( (lv_shipyardV4Root_0_0= ruleShipyard ) )
            // InternalShipyardV4.g:80:3: (lv_shipyardV4Root_0_0= ruleShipyard )
            {
            // InternalShipyardV4.g:80:3: (lv_shipyardV4Root_0_0= ruleShipyard )
            // InternalShipyardV4.g:81:4: lv_shipyardV4Root_0_0= ruleShipyard
            {

            				newCompositeNode(grammarAccess.getShipyardV4RootAccess().getShipyardV4RootShipyardParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_shipyardV4Root_0_0=ruleShipyard();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getShipyardV4RootRule());
            				}
            				set(
            					current,
            					"shipyardV4Root",
            					lv_shipyardV4Root_0_0,
            					"at.jku.bise.shipyardV4.ShipyardV4.Shipyard");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipyardV4Root"


    // $ANTLR start "entryRuleShipyardPropertiesAbstract"
    // InternalShipyardV4.g:101:1: entryRuleShipyardPropertiesAbstract returns [EObject current=null] : iv_ruleShipyardPropertiesAbstract= ruleShipyardPropertiesAbstract EOF ;
    public final EObject entryRuleShipyardPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipyardPropertiesAbstract = null;


        try {
            // InternalShipyardV4.g:101:67: (iv_ruleShipyardPropertiesAbstract= ruleShipyardPropertiesAbstract EOF )
            // InternalShipyardV4.g:102:2: iv_ruleShipyardPropertiesAbstract= ruleShipyardPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getShipyardPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipyardPropertiesAbstract=ruleShipyardPropertiesAbstract();

            state._fsp--;

             current =iv_ruleShipyardPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipyardPropertiesAbstract"


    // $ANTLR start "ruleShipyardPropertiesAbstract"
    // InternalShipyardV4.g:108:1: ruleShipyardPropertiesAbstract returns [EObject current=null] : (this_ShipyardApiVersion_0= ruleShipyardApiVersion | this_ShipyardKind_1= ruleShipyardKind | this_ShipyardMetadata_2= ruleShipyardMetadata | this_ShipyardSpec1_3= ruleShipyardSpec1 ) ;
    public final EObject ruleShipyardPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ShipyardApiVersion_0 = null;

        EObject this_ShipyardKind_1 = null;

        EObject this_ShipyardMetadata_2 = null;

        EObject this_ShipyardSpec1_3 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:114:2: ( (this_ShipyardApiVersion_0= ruleShipyardApiVersion | this_ShipyardKind_1= ruleShipyardKind | this_ShipyardMetadata_2= ruleShipyardMetadata | this_ShipyardSpec1_3= ruleShipyardSpec1 ) )
            // InternalShipyardV4.g:115:2: (this_ShipyardApiVersion_0= ruleShipyardApiVersion | this_ShipyardKind_1= ruleShipyardKind | this_ShipyardMetadata_2= ruleShipyardMetadata | this_ShipyardSpec1_3= ruleShipyardSpec1 )
            {
            // InternalShipyardV4.g:115:2: (this_ShipyardApiVersion_0= ruleShipyardApiVersion | this_ShipyardKind_1= ruleShipyardKind | this_ShipyardMetadata_2= ruleShipyardMetadata | this_ShipyardSpec1_3= ruleShipyardSpec1 )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 18:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalShipyardV4.g:116:3: this_ShipyardApiVersion_0= ruleShipyardApiVersion
                    {

                    			newCompositeNode(grammarAccess.getShipyardPropertiesAbstractAccess().getShipyardApiVersionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShipyardApiVersion_0=ruleShipyardApiVersion();

                    state._fsp--;


                    			current = this_ShipyardApiVersion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShipyardV4.g:125:3: this_ShipyardKind_1= ruleShipyardKind
                    {

                    			newCompositeNode(grammarAccess.getShipyardPropertiesAbstractAccess().getShipyardKindParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShipyardKind_1=ruleShipyardKind();

                    state._fsp--;


                    			current = this_ShipyardKind_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalShipyardV4.g:134:3: this_ShipyardMetadata_2= ruleShipyardMetadata
                    {

                    			newCompositeNode(grammarAccess.getShipyardPropertiesAbstractAccess().getShipyardMetadataParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShipyardMetadata_2=ruleShipyardMetadata();

                    state._fsp--;


                    			current = this_ShipyardMetadata_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalShipyardV4.g:143:3: this_ShipyardSpec1_3= ruleShipyardSpec1
                    {

                    			newCompositeNode(grammarAccess.getShipyardPropertiesAbstractAccess().getShipyardSpec1ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShipyardSpec1_3=ruleShipyardSpec1();

                    state._fsp--;


                    			current = this_ShipyardSpec1_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipyardPropertiesAbstract"


    // $ANTLR start "entryRuleMetadataPropertiesAbstract"
    // InternalShipyardV4.g:155:1: entryRuleMetadataPropertiesAbstract returns [EObject current=null] : iv_ruleMetadataPropertiesAbstract= ruleMetadataPropertiesAbstract EOF ;
    public final EObject entryRuleMetadataPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadataPropertiesAbstract = null;


        try {
            // InternalShipyardV4.g:155:67: (iv_ruleMetadataPropertiesAbstract= ruleMetadataPropertiesAbstract EOF )
            // InternalShipyardV4.g:156:2: iv_ruleMetadataPropertiesAbstract= ruleMetadataPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getMetadataPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadataPropertiesAbstract=ruleMetadataPropertiesAbstract();

            state._fsp--;

             current =iv_ruleMetadataPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadataPropertiesAbstract"


    // $ANTLR start "ruleMetadataPropertiesAbstract"
    // InternalShipyardV4.g:162:1: ruleMetadataPropertiesAbstract returns [EObject current=null] : this_MetadataName_0= ruleMetadataName ;
    public final EObject ruleMetadataPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_MetadataName_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:168:2: (this_MetadataName_0= ruleMetadataName )
            // InternalShipyardV4.g:169:2: this_MetadataName_0= ruleMetadataName
            {

            		newCompositeNode(grammarAccess.getMetadataPropertiesAbstractAccess().getMetadataNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_MetadataName_0=ruleMetadataName();

            state._fsp--;


            		current = this_MetadataName_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetadataPropertiesAbstract"


    // $ANTLR start "entryRuleShipyardSpecPropertiesAbstract"
    // InternalShipyardV4.g:180:1: entryRuleShipyardSpecPropertiesAbstract returns [EObject current=null] : iv_ruleShipyardSpecPropertiesAbstract= ruleShipyardSpecPropertiesAbstract EOF ;
    public final EObject entryRuleShipyardSpecPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipyardSpecPropertiesAbstract = null;


        try {
            // InternalShipyardV4.g:180:71: (iv_ruleShipyardSpecPropertiesAbstract= ruleShipyardSpecPropertiesAbstract EOF )
            // InternalShipyardV4.g:181:2: iv_ruleShipyardSpecPropertiesAbstract= ruleShipyardSpecPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getShipyardSpecPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipyardSpecPropertiesAbstract=ruleShipyardSpecPropertiesAbstract();

            state._fsp--;

             current =iv_ruleShipyardSpecPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipyardSpecPropertiesAbstract"


    // $ANTLR start "ruleShipyardSpecPropertiesAbstract"
    // InternalShipyardV4.g:187:1: ruleShipyardSpecPropertiesAbstract returns [EObject current=null] : this_ShipyardSpecStages_0= ruleShipyardSpecStages ;
    public final EObject ruleShipyardSpecPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ShipyardSpecStages_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:193:2: (this_ShipyardSpecStages_0= ruleShipyardSpecStages )
            // InternalShipyardV4.g:194:2: this_ShipyardSpecStages_0= ruleShipyardSpecStages
            {

            		newCompositeNode(grammarAccess.getShipyardSpecPropertiesAbstractAccess().getShipyardSpecStagesParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ShipyardSpecStages_0=ruleShipyardSpecStages();

            state._fsp--;


            		current = this_ShipyardSpecStages_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipyardSpecPropertiesAbstract"


    // $ANTLR start "entryRuleStagePropertiesAbstract"
    // InternalShipyardV4.g:205:1: entryRuleStagePropertiesAbstract returns [EObject current=null] : iv_ruleStagePropertiesAbstract= ruleStagePropertiesAbstract EOF ;
    public final EObject entryRuleStagePropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStagePropertiesAbstract = null;


        try {
            // InternalShipyardV4.g:205:64: (iv_ruleStagePropertiesAbstract= ruleStagePropertiesAbstract EOF )
            // InternalShipyardV4.g:206:2: iv_ruleStagePropertiesAbstract= ruleStagePropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getStagePropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStagePropertiesAbstract=ruleStagePropertiesAbstract();

            state._fsp--;

             current =iv_ruleStagePropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStagePropertiesAbstract"


    // $ANTLR start "ruleStagePropertiesAbstract"
    // InternalShipyardV4.g:212:1: ruleStagePropertiesAbstract returns [EObject current=null] : (this_StageName_0= ruleStageName | this_StageSequences_1= ruleStageSequences ) ;
    public final EObject ruleStagePropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_StageName_0 = null;

        EObject this_StageSequences_1 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:218:2: ( (this_StageName_0= ruleStageName | this_StageSequences_1= ruleStageSequences ) )
            // InternalShipyardV4.g:219:2: (this_StageName_0= ruleStageName | this_StageSequences_1= ruleStageSequences )
            {
            // InternalShipyardV4.g:219:2: (this_StageName_0= ruleStageName | this_StageSequences_1= ruleStageSequences )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalShipyardV4.g:220:3: this_StageName_0= ruleStageName
                    {

                    			newCompositeNode(grammarAccess.getStagePropertiesAbstractAccess().getStageNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StageName_0=ruleStageName();

                    state._fsp--;


                    			current = this_StageName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShipyardV4.g:229:3: this_StageSequences_1= ruleStageSequences
                    {

                    			newCompositeNode(grammarAccess.getStagePropertiesAbstractAccess().getStageSequencesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StageSequences_1=ruleStageSequences();

                    state._fsp--;


                    			current = this_StageSequences_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStagePropertiesAbstract"


    // $ANTLR start "entryRuleSequencePropertiesAbstract"
    // InternalShipyardV4.g:241:1: entryRuleSequencePropertiesAbstract returns [EObject current=null] : iv_ruleSequencePropertiesAbstract= ruleSequencePropertiesAbstract EOF ;
    public final EObject entryRuleSequencePropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencePropertiesAbstract = null;


        try {
            // InternalShipyardV4.g:241:67: (iv_ruleSequencePropertiesAbstract= ruleSequencePropertiesAbstract EOF )
            // InternalShipyardV4.g:242:2: iv_ruleSequencePropertiesAbstract= ruleSequencePropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getSequencePropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequencePropertiesAbstract=ruleSequencePropertiesAbstract();

            state._fsp--;

             current =iv_ruleSequencePropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequencePropertiesAbstract"


    // $ANTLR start "ruleSequencePropertiesAbstract"
    // InternalShipyardV4.g:248:1: ruleSequencePropertiesAbstract returns [EObject current=null] : (this_SequenceName_0= ruleSequenceName | this_SequenceTriggeredOn_1= ruleSequenceTriggeredOn | this_SequenceTasks_2= ruleSequenceTasks ) ;
    public final EObject ruleSequencePropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceName_0 = null;

        EObject this_SequenceTriggeredOn_1 = null;

        EObject this_SequenceTasks_2 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:254:2: ( (this_SequenceName_0= ruleSequenceName | this_SequenceTriggeredOn_1= ruleSequenceTriggeredOn | this_SequenceTasks_2= ruleSequenceTasks ) )
            // InternalShipyardV4.g:255:2: (this_SequenceName_0= ruleSequenceName | this_SequenceTriggeredOn_1= ruleSequenceTriggeredOn | this_SequenceTasks_2= ruleSequenceTasks )
            {
            // InternalShipyardV4.g:255:2: (this_SequenceName_0= ruleSequenceName | this_SequenceTriggeredOn_1= ruleSequenceTriggeredOn | this_SequenceTasks_2= ruleSequenceTasks )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalShipyardV4.g:256:3: this_SequenceName_0= ruleSequenceName
                    {

                    			newCompositeNode(grammarAccess.getSequencePropertiesAbstractAccess().getSequenceNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceName_0=ruleSequenceName();

                    state._fsp--;


                    			current = this_SequenceName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShipyardV4.g:265:3: this_SequenceTriggeredOn_1= ruleSequenceTriggeredOn
                    {

                    			newCompositeNode(grammarAccess.getSequencePropertiesAbstractAccess().getSequenceTriggeredOnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceTriggeredOn_1=ruleSequenceTriggeredOn();

                    state._fsp--;


                    			current = this_SequenceTriggeredOn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalShipyardV4.g:274:3: this_SequenceTasks_2= ruleSequenceTasks
                    {

                    			newCompositeNode(grammarAccess.getSequencePropertiesAbstractAccess().getSequenceTasksParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceTasks_2=ruleSequenceTasks();

                    state._fsp--;


                    			current = this_SequenceTasks_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequencePropertiesAbstract"


    // $ANTLR start "entryRuleTriggerPropertiesAbstract"
    // InternalShipyardV4.g:286:1: entryRuleTriggerPropertiesAbstract returns [EObject current=null] : iv_ruleTriggerPropertiesAbstract= ruleTriggerPropertiesAbstract EOF ;
    public final EObject entryRuleTriggerPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerPropertiesAbstract = null;


        try {
            // InternalShipyardV4.g:286:66: (iv_ruleTriggerPropertiesAbstract= ruleTriggerPropertiesAbstract EOF )
            // InternalShipyardV4.g:287:2: iv_ruleTriggerPropertiesAbstract= ruleTriggerPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getTriggerPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerPropertiesAbstract=ruleTriggerPropertiesAbstract();

            state._fsp--;

             current =iv_ruleTriggerPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerPropertiesAbstract"


    // $ANTLR start "ruleTriggerPropertiesAbstract"
    // InternalShipyardV4.g:293:1: ruleTriggerPropertiesAbstract returns [EObject current=null] : (this_TriggerEvent_0= ruleTriggerEvent | this_TriggerSelector_1= ruleTriggerSelector ) ;
    public final EObject ruleTriggerPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_TriggerEvent_0 = null;

        EObject this_TriggerSelector_1 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:299:2: ( (this_TriggerEvent_0= ruleTriggerEvent | this_TriggerSelector_1= ruleTriggerSelector ) )
            // InternalShipyardV4.g:300:2: (this_TriggerEvent_0= ruleTriggerEvent | this_TriggerSelector_1= ruleTriggerSelector )
            {
            // InternalShipyardV4.g:300:2: (this_TriggerEvent_0= ruleTriggerEvent | this_TriggerSelector_1= ruleTriggerSelector )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalShipyardV4.g:301:3: this_TriggerEvent_0= ruleTriggerEvent
                    {

                    			newCompositeNode(grammarAccess.getTriggerPropertiesAbstractAccess().getTriggerEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TriggerEvent_0=ruleTriggerEvent();

                    state._fsp--;


                    			current = this_TriggerEvent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShipyardV4.g:310:3: this_TriggerSelector_1= ruleTriggerSelector
                    {

                    			newCompositeNode(grammarAccess.getTriggerPropertiesAbstractAccess().getTriggerSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TriggerSelector_1=ruleTriggerSelector();

                    state._fsp--;


                    			current = this_TriggerSelector_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerPropertiesAbstract"


    // $ANTLR start "entryRuleSelectorPropertiesAbstract"
    // InternalShipyardV4.g:322:1: entryRuleSelectorPropertiesAbstract returns [EObject current=null] : iv_ruleSelectorPropertiesAbstract= ruleSelectorPropertiesAbstract EOF ;
    public final EObject entryRuleSelectorPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorPropertiesAbstract = null;


        try {
            // InternalShipyardV4.g:322:67: (iv_ruleSelectorPropertiesAbstract= ruleSelectorPropertiesAbstract EOF )
            // InternalShipyardV4.g:323:2: iv_ruleSelectorPropertiesAbstract= ruleSelectorPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getSelectorPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectorPropertiesAbstract=ruleSelectorPropertiesAbstract();

            state._fsp--;

             current =iv_ruleSelectorPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectorPropertiesAbstract"


    // $ANTLR start "ruleSelectorPropertiesAbstract"
    // InternalShipyardV4.g:329:1: ruleSelectorPropertiesAbstract returns [EObject current=null] : this_SelectorMatch_0= ruleSelectorMatch ;
    public final EObject ruleSelectorPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_SelectorMatch_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:335:2: (this_SelectorMatch_0= ruleSelectorMatch )
            // InternalShipyardV4.g:336:2: this_SelectorMatch_0= ruleSelectorMatch
            {

            		newCompositeNode(grammarAccess.getSelectorPropertiesAbstractAccess().getSelectorMatchParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SelectorMatch_0=ruleSelectorMatch();

            state._fsp--;


            		current = this_SelectorMatch_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectorPropertiesAbstract"


    // $ANTLR start "entryRuleSelectorMatchPropertiesAbstract"
    // InternalShipyardV4.g:347:1: entryRuleSelectorMatchPropertiesAbstract returns [EObject current=null] : iv_ruleSelectorMatchPropertiesAbstract= ruleSelectorMatchPropertiesAbstract EOF ;
    public final EObject entryRuleSelectorMatchPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorMatchPropertiesAbstract = null;


        try {
            // InternalShipyardV4.g:347:72: (iv_ruleSelectorMatchPropertiesAbstract= ruleSelectorMatchPropertiesAbstract EOF )
            // InternalShipyardV4.g:348:2: iv_ruleSelectorMatchPropertiesAbstract= ruleSelectorMatchPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getSelectorMatchPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectorMatchPropertiesAbstract=ruleSelectorMatchPropertiesAbstract();

            state._fsp--;

             current =iv_ruleSelectorMatchPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectorMatchPropertiesAbstract"


    // $ANTLR start "ruleSelectorMatchPropertiesAbstract"
    // InternalShipyardV4.g:354:1: ruleSelectorMatchPropertiesAbstract returns [EObject current=null] : this_SelectorMatchPatternProperties0_0= ruleSelectorMatchPatternProperties0 ;
    public final EObject ruleSelectorMatchPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_SelectorMatchPatternProperties0_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:360:2: (this_SelectorMatchPatternProperties0_0= ruleSelectorMatchPatternProperties0 )
            // InternalShipyardV4.g:361:2: this_SelectorMatchPatternProperties0_0= ruleSelectorMatchPatternProperties0
            {

            		newCompositeNode(grammarAccess.getSelectorMatchPropertiesAbstractAccess().getSelectorMatchPatternProperties0ParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SelectorMatchPatternProperties0_0=ruleSelectorMatchPatternProperties0();

            state._fsp--;


            		current = this_SelectorMatchPatternProperties0_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectorMatchPropertiesAbstract"


    // $ANTLR start "entryRuleTaskPropertiesAbstract"
    // InternalShipyardV4.g:372:1: entryRuleTaskPropertiesAbstract returns [EObject current=null] : iv_ruleTaskPropertiesAbstract= ruleTaskPropertiesAbstract EOF ;
    public final EObject entryRuleTaskPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskPropertiesAbstract = null;


        try {
            // InternalShipyardV4.g:372:63: (iv_ruleTaskPropertiesAbstract= ruleTaskPropertiesAbstract EOF )
            // InternalShipyardV4.g:373:2: iv_ruleTaskPropertiesAbstract= ruleTaskPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getTaskPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskPropertiesAbstract=ruleTaskPropertiesAbstract();

            state._fsp--;

             current =iv_ruleTaskPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskPropertiesAbstract"


    // $ANTLR start "ruleTaskPropertiesAbstract"
    // InternalShipyardV4.g:379:1: ruleTaskPropertiesAbstract returns [EObject current=null] : (this_TaskName_0= ruleTaskName | this_TaskProperties_1= ruleTaskProperties ) ;
    public final EObject ruleTaskPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_TaskName_0 = null;

        EObject this_TaskProperties_1 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:385:2: ( (this_TaskName_0= ruleTaskName | this_TaskProperties_1= ruleTaskProperties ) )
            // InternalShipyardV4.g:386:2: (this_TaskName_0= ruleTaskName | this_TaskProperties_1= ruleTaskProperties )
            {
            // InternalShipyardV4.g:386:2: (this_TaskName_0= ruleTaskName | this_TaskProperties_1= ruleTaskProperties )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalShipyardV4.g:387:3: this_TaskName_0= ruleTaskName
                    {

                    			newCompositeNode(grammarAccess.getTaskPropertiesAbstractAccess().getTaskNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskName_0=ruleTaskName();

                    state._fsp--;


                    			current = this_TaskName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShipyardV4.g:396:3: this_TaskProperties_1= ruleTaskProperties
                    {

                    			newCompositeNode(grammarAccess.getTaskPropertiesAbstractAccess().getTaskPropertiesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskProperties_1=ruleTaskProperties();

                    state._fsp--;


                    			current = this_TaskProperties_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskPropertiesAbstract"


    // $ANTLR start "entryRuleTaskPropertiesPropertiesAbstract"
    // InternalShipyardV4.g:408:1: entryRuleTaskPropertiesPropertiesAbstract returns [EObject current=null] : iv_ruleTaskPropertiesPropertiesAbstract= ruleTaskPropertiesPropertiesAbstract EOF ;
    public final EObject entryRuleTaskPropertiesPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskPropertiesPropertiesAbstract = null;


        try {
            // InternalShipyardV4.g:408:73: (iv_ruleTaskPropertiesPropertiesAbstract= ruleTaskPropertiesPropertiesAbstract EOF )
            // InternalShipyardV4.g:409:2: iv_ruleTaskPropertiesPropertiesAbstract= ruleTaskPropertiesPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getTaskPropertiesPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskPropertiesPropertiesAbstract=ruleTaskPropertiesPropertiesAbstract();

            state._fsp--;

             current =iv_ruleTaskPropertiesPropertiesAbstract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskPropertiesPropertiesAbstract"


    // $ANTLR start "ruleTaskPropertiesPropertiesAbstract"
    // InternalShipyardV4.g:415:1: ruleTaskPropertiesPropertiesAbstract returns [EObject current=null] : this_TaskPropertiesAdditionalProperties_0= ruleTaskPropertiesAdditionalProperties ;
    public final EObject ruleTaskPropertiesPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_TaskPropertiesAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:421:2: (this_TaskPropertiesAdditionalProperties_0= ruleTaskPropertiesAdditionalProperties )
            // InternalShipyardV4.g:422:2: this_TaskPropertiesAdditionalProperties_0= ruleTaskPropertiesAdditionalProperties
            {

            		newCompositeNode(grammarAccess.getTaskPropertiesPropertiesAbstractAccess().getTaskPropertiesAdditionalPropertiesParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TaskPropertiesAdditionalProperties_0=ruleTaskPropertiesAdditionalProperties();

            state._fsp--;


            		current = this_TaskPropertiesAdditionalProperties_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskPropertiesPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalShipyardV4.g:433:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalShipyardV4.g:433:46: (iv_ruleValue= ruleValue EOF )
            // InternalShipyardV4.g:434:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalShipyardV4.g:440:1: ruleValue returns [EObject current=null] : (this_IntegerValue_0= ruleIntegerValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_StringValue_3= ruleStringValue | this_ObjectValue_4= ruleObjectValue | this_NumberValue_5= ruleNumberValue | this_ArrayValue_6= ruleArrayValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerValue_0 = null;

        EObject this_BooleanValue_1 = null;

        EObject this_NullValue_2 = null;

        EObject this_StringValue_3 = null;

        EObject this_ObjectValue_4 = null;

        EObject this_NumberValue_5 = null;

        EObject this_ArrayValue_6 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:446:2: ( (this_IntegerValue_0= ruleIntegerValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_StringValue_3= ruleStringValue | this_ObjectValue_4= ruleObjectValue | this_NumberValue_5= ruleNumberValue | this_ArrayValue_6= ruleArrayValue ) )
            // InternalShipyardV4.g:447:2: (this_IntegerValue_0= ruleIntegerValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_StringValue_3= ruleStringValue | this_ObjectValue_4= ruleObjectValue | this_NumberValue_5= ruleNumberValue | this_ArrayValue_6= ruleArrayValue )
            {
            // InternalShipyardV4.g:447:2: (this_IntegerValue_0= ruleIntegerValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_StringValue_3= ruleStringValue | this_ObjectValue_4= ruleObjectValue | this_NumberValue_5= ruleNumberValue | this_ArrayValue_6= ruleArrayValue )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalShipyardV4.g:448:3: this_IntegerValue_0= ruleIntegerValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerValue_0=ruleIntegerValue();

                    state._fsp--;


                    			current = this_IntegerValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShipyardV4.g:457:3: this_BooleanValue_1= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_1=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalShipyardV4.g:466:3: this_NullValue_2= ruleNullValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNullValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullValue_2=ruleNullValue();

                    state._fsp--;


                    			current = this_NullValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalShipyardV4.g:475:3: this_StringValue_3= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_3=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalShipyardV4.g:484:3: this_ObjectValue_4= ruleObjectValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectValue_4=ruleObjectValue();

                    state._fsp--;


                    			current = this_ObjectValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalShipyardV4.g:493:3: this_NumberValue_5= ruleNumberValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNumberValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberValue_5=ruleNumberValue();

                    state._fsp--;


                    			current = this_NumberValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalShipyardV4.g:502:3: this_ArrayValue_6= ruleArrayValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getArrayValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayValue_6=ruleArrayValue();

                    state._fsp--;


                    			current = this_ArrayValue_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleShipyard"
    // InternalShipyardV4.g:514:1: entryRuleShipyard returns [EObject current=null] : iv_ruleShipyard= ruleShipyard EOF ;
    public final EObject entryRuleShipyard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipyard = null;


        try {
            // InternalShipyardV4.g:514:49: (iv_ruleShipyard= ruleShipyard EOF )
            // InternalShipyardV4.g:515:2: iv_ruleShipyard= ruleShipyard EOF
            {
             newCompositeNode(grammarAccess.getShipyardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipyard=ruleShipyard();

            state._fsp--;

             current =iv_ruleShipyard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipyard"


    // $ANTLR start "ruleShipyard"
    // InternalShipyardV4.g:521:1: ruleShipyard returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_Shipyard_2_0= ruleShipyardPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleShipyard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_Shipyard_2_0 = null;

        EObject lv_Shipyard_4_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:527:2: ( ( () otherlv_1= '{' ( ( (lv_Shipyard_2_0= ruleShipyardPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract ) ) )* )? otherlv_5= '}' ) )
            // InternalShipyardV4.g:528:2: ( () otherlv_1= '{' ( ( (lv_Shipyard_2_0= ruleShipyardPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            {
            // InternalShipyardV4.g:528:2: ( () otherlv_1= '{' ( ( (lv_Shipyard_2_0= ruleShipyardPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            // InternalShipyardV4.g:529:3: () otherlv_1= '{' ( ( (lv_Shipyard_2_0= ruleShipyardPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract ) ) )* )? otherlv_5= '}'
            {
            // InternalShipyardV4.g:529:3: ()
            // InternalShipyardV4.g:530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShipyardAccess().getShipyardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getShipyardAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalShipyardV4.g:540:3: ( ( (lv_Shipyard_2_0= ruleShipyardPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14||(LA8_0>=16 && LA8_0<=18)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalShipyardV4.g:541:4: ( (lv_Shipyard_2_0= ruleShipyardPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract ) ) )*
                    {
                    // InternalShipyardV4.g:541:4: ( (lv_Shipyard_2_0= ruleShipyardPropertiesAbstract ) )
                    // InternalShipyardV4.g:542:5: (lv_Shipyard_2_0= ruleShipyardPropertiesAbstract )
                    {
                    // InternalShipyardV4.g:542:5: (lv_Shipyard_2_0= ruleShipyardPropertiesAbstract )
                    // InternalShipyardV4.g:543:6: lv_Shipyard_2_0= ruleShipyardPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getShipyardAccess().getShipyardShipyardPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_Shipyard_2_0=ruleShipyardPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShipyardRule());
                    						}
                    						add(
                    							current,
                    							"Shipyard",
                    							lv_Shipyard_2_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.ShipyardPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:560:4: (otherlv_3= ',' ( (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==12) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalShipyardV4.g:561:5: otherlv_3= ',' ( (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getShipyardAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalShipyardV4.g:565:5: ( (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract ) )
                    	    // InternalShipyardV4.g:566:6: (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract )
                    	    {
                    	    // InternalShipyardV4.g:566:6: (lv_Shipyard_4_0= ruleShipyardPropertiesAbstract )
                    	    // InternalShipyardV4.g:567:7: lv_Shipyard_4_0= ruleShipyardPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getShipyardAccess().getShipyardShipyardPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_Shipyard_4_0=ruleShipyardPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getShipyardRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Shipyard",
                    	    								lv_Shipyard_4_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.ShipyardPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getShipyardAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipyard"


    // $ANTLR start "entryRuleShipyardApiVersion"
    // InternalShipyardV4.g:594:1: entryRuleShipyardApiVersion returns [EObject current=null] : iv_ruleShipyardApiVersion= ruleShipyardApiVersion EOF ;
    public final EObject entryRuleShipyardApiVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipyardApiVersion = null;


        try {
            // InternalShipyardV4.g:594:59: (iv_ruleShipyardApiVersion= ruleShipyardApiVersion EOF )
            // InternalShipyardV4.g:595:2: iv_ruleShipyardApiVersion= ruleShipyardApiVersion EOF
            {
             newCompositeNode(grammarAccess.getShipyardApiVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipyardApiVersion=ruleShipyardApiVersion();

            state._fsp--;

             current =iv_ruleShipyardApiVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipyardApiVersion"


    // $ANTLR start "ruleShipyardApiVersion"
    // InternalShipyardV4.g:601:1: ruleShipyardApiVersion returns [EObject current=null] : (otherlv_0= '\"apiVersion\"' otherlv_1= ':' ( (lv_apiVersion_2_0= ruleEString ) ) ) ;
    public final EObject ruleShipyardApiVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_apiVersion_2_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:607:2: ( (otherlv_0= '\"apiVersion\"' otherlv_1= ':' ( (lv_apiVersion_2_0= ruleEString ) ) ) )
            // InternalShipyardV4.g:608:2: (otherlv_0= '\"apiVersion\"' otherlv_1= ':' ( (lv_apiVersion_2_0= ruleEString ) ) )
            {
            // InternalShipyardV4.g:608:2: (otherlv_0= '\"apiVersion\"' otherlv_1= ':' ( (lv_apiVersion_2_0= ruleEString ) ) )
            // InternalShipyardV4.g:609:3: otherlv_0= '\"apiVersion\"' otherlv_1= ':' ( (lv_apiVersion_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getShipyardApiVersionAccess().getApiVersionKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getShipyardApiVersionAccess().getColonKeyword_1());
            		
            // InternalShipyardV4.g:617:3: ( (lv_apiVersion_2_0= ruleEString ) )
            // InternalShipyardV4.g:618:4: (lv_apiVersion_2_0= ruleEString )
            {
            // InternalShipyardV4.g:618:4: (lv_apiVersion_2_0= ruleEString )
            // InternalShipyardV4.g:619:5: lv_apiVersion_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getShipyardApiVersionAccess().getApiVersionEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_apiVersion_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipyardApiVersionRule());
            					}
            					set(
            						current,
            						"apiVersion",
            						lv_apiVersion_2_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipyardApiVersion"


    // $ANTLR start "entryRuleShipyardKind"
    // InternalShipyardV4.g:640:1: entryRuleShipyardKind returns [EObject current=null] : iv_ruleShipyardKind= ruleShipyardKind EOF ;
    public final EObject entryRuleShipyardKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipyardKind = null;


        try {
            // InternalShipyardV4.g:640:53: (iv_ruleShipyardKind= ruleShipyardKind EOF )
            // InternalShipyardV4.g:641:2: iv_ruleShipyardKind= ruleShipyardKind EOF
            {
             newCompositeNode(grammarAccess.getShipyardKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipyardKind=ruleShipyardKind();

            state._fsp--;

             current =iv_ruleShipyardKind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipyardKind"


    // $ANTLR start "ruleShipyardKind"
    // InternalShipyardV4.g:647:1: ruleShipyardKind returns [EObject current=null] : (otherlv_0= '\"kind\"' otherlv_1= ':' ( (lv_kind_2_0= ruleEString ) ) ) ;
    public final EObject ruleShipyardKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_kind_2_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:653:2: ( (otherlv_0= '\"kind\"' otherlv_1= ':' ( (lv_kind_2_0= ruleEString ) ) ) )
            // InternalShipyardV4.g:654:2: (otherlv_0= '\"kind\"' otherlv_1= ':' ( (lv_kind_2_0= ruleEString ) ) )
            {
            // InternalShipyardV4.g:654:2: (otherlv_0= '\"kind\"' otherlv_1= ':' ( (lv_kind_2_0= ruleEString ) ) )
            // InternalShipyardV4.g:655:3: otherlv_0= '\"kind\"' otherlv_1= ':' ( (lv_kind_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getShipyardKindAccess().getKindKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getShipyardKindAccess().getColonKeyword_1());
            		
            // InternalShipyardV4.g:663:3: ( (lv_kind_2_0= ruleEString ) )
            // InternalShipyardV4.g:664:4: (lv_kind_2_0= ruleEString )
            {
            // InternalShipyardV4.g:664:4: (lv_kind_2_0= ruleEString )
            // InternalShipyardV4.g:665:5: lv_kind_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getShipyardKindAccess().getKindEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_kind_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipyardKindRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_2_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipyardKind"


    // $ANTLR start "entryRuleShipyardMetadata"
    // InternalShipyardV4.g:686:1: entryRuleShipyardMetadata returns [EObject current=null] : iv_ruleShipyardMetadata= ruleShipyardMetadata EOF ;
    public final EObject entryRuleShipyardMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipyardMetadata = null;


        try {
            // InternalShipyardV4.g:686:57: (iv_ruleShipyardMetadata= ruleShipyardMetadata EOF )
            // InternalShipyardV4.g:687:2: iv_ruleShipyardMetadata= ruleShipyardMetadata EOF
            {
             newCompositeNode(grammarAccess.getShipyardMetadataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipyardMetadata=ruleShipyardMetadata();

            state._fsp--;

             current =iv_ruleShipyardMetadata; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipyardMetadata"


    // $ANTLR start "ruleShipyardMetadata"
    // InternalShipyardV4.g:693:1: ruleShipyardMetadata returns [EObject current=null] : (otherlv_0= '\"metadata\"' otherlv_1= ':' ( (lv_metadata_2_0= ruleMetadata ) ) ) ;
    public final EObject ruleShipyardMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_metadata_2_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:699:2: ( (otherlv_0= '\"metadata\"' otherlv_1= ':' ( (lv_metadata_2_0= ruleMetadata ) ) ) )
            // InternalShipyardV4.g:700:2: (otherlv_0= '\"metadata\"' otherlv_1= ':' ( (lv_metadata_2_0= ruleMetadata ) ) )
            {
            // InternalShipyardV4.g:700:2: (otherlv_0= '\"metadata\"' otherlv_1= ':' ( (lv_metadata_2_0= ruleMetadata ) ) )
            // InternalShipyardV4.g:701:3: otherlv_0= '\"metadata\"' otherlv_1= ':' ( (lv_metadata_2_0= ruleMetadata ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getShipyardMetadataAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getShipyardMetadataAccess().getColonKeyword_1());
            		
            // InternalShipyardV4.g:709:3: ( (lv_metadata_2_0= ruleMetadata ) )
            // InternalShipyardV4.g:710:4: (lv_metadata_2_0= ruleMetadata )
            {
            // InternalShipyardV4.g:710:4: (lv_metadata_2_0= ruleMetadata )
            // InternalShipyardV4.g:711:5: lv_metadata_2_0= ruleMetadata
            {

            					newCompositeNode(grammarAccess.getShipyardMetadataAccess().getMetadataMetadataParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_metadata_2_0=ruleMetadata();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipyardMetadataRule());
            					}
            					set(
            						current,
            						"metadata",
            						lv_metadata_2_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.Metadata");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipyardMetadata"


    // $ANTLR start "entryRuleShipyardSpec1"
    // InternalShipyardV4.g:732:1: entryRuleShipyardSpec1 returns [EObject current=null] : iv_ruleShipyardSpec1= ruleShipyardSpec1 EOF ;
    public final EObject entryRuleShipyardSpec1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipyardSpec1 = null;


        try {
            // InternalShipyardV4.g:732:54: (iv_ruleShipyardSpec1= ruleShipyardSpec1 EOF )
            // InternalShipyardV4.g:733:2: iv_ruleShipyardSpec1= ruleShipyardSpec1 EOF
            {
             newCompositeNode(grammarAccess.getShipyardSpec1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipyardSpec1=ruleShipyardSpec1();

            state._fsp--;

             current =iv_ruleShipyardSpec1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipyardSpec1"


    // $ANTLR start "ruleShipyardSpec1"
    // InternalShipyardV4.g:739:1: ruleShipyardSpec1 returns [EObject current=null] : (otherlv_0= '\"spec\"' otherlv_1= ':' ( (lv_spec_2_0= ruleShipyardSpec ) ) ) ;
    public final EObject ruleShipyardSpec1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_spec_2_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:745:2: ( (otherlv_0= '\"spec\"' otherlv_1= ':' ( (lv_spec_2_0= ruleShipyardSpec ) ) ) )
            // InternalShipyardV4.g:746:2: (otherlv_0= '\"spec\"' otherlv_1= ':' ( (lv_spec_2_0= ruleShipyardSpec ) ) )
            {
            // InternalShipyardV4.g:746:2: (otherlv_0= '\"spec\"' otherlv_1= ':' ( (lv_spec_2_0= ruleShipyardSpec ) ) )
            // InternalShipyardV4.g:747:3: otherlv_0= '\"spec\"' otherlv_1= ':' ( (lv_spec_2_0= ruleShipyardSpec ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getShipyardSpec1Access().getSpecKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getShipyardSpec1Access().getColonKeyword_1());
            		
            // InternalShipyardV4.g:755:3: ( (lv_spec_2_0= ruleShipyardSpec ) )
            // InternalShipyardV4.g:756:4: (lv_spec_2_0= ruleShipyardSpec )
            {
            // InternalShipyardV4.g:756:4: (lv_spec_2_0= ruleShipyardSpec )
            // InternalShipyardV4.g:757:5: lv_spec_2_0= ruleShipyardSpec
            {

            					newCompositeNode(grammarAccess.getShipyardSpec1Access().getSpecShipyardSpecParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_spec_2_0=ruleShipyardSpec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipyardSpec1Rule());
            					}
            					set(
            						current,
            						"spec",
            						lv_spec_2_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.ShipyardSpec");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipyardSpec1"


    // $ANTLR start "entryRuleEString"
    // InternalShipyardV4.g:778:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalShipyardV4.g:778:47: (iv_ruleEString= ruleEString EOF )
            // InternalShipyardV4.g:779:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalShipyardV4.g:785:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalShipyardV4.g:791:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalShipyardV4.g:792:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalShipyardV4.g:792:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalShipyardV4.g:793:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalShipyardV4.g:801:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMetadata"
    // InternalShipyardV4.g:812:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // InternalShipyardV4.g:812:49: (iv_ruleMetadata= ruleMetadata EOF )
            // InternalShipyardV4.g:813:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalShipyardV4.g:819:1: ruleMetadata returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_Metadata_2_0= ruleMetadataPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Metadata_4_0= ruleMetadataPropertiesAbstract ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_Metadata_2_0 = null;

        EObject lv_Metadata_4_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:825:2: ( ( () otherlv_1= '{' ( ( (lv_Metadata_2_0= ruleMetadataPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Metadata_4_0= ruleMetadataPropertiesAbstract ) ) )* )? otherlv_5= '}' ) )
            // InternalShipyardV4.g:826:2: ( () otherlv_1= '{' ( ( (lv_Metadata_2_0= ruleMetadataPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Metadata_4_0= ruleMetadataPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            {
            // InternalShipyardV4.g:826:2: ( () otherlv_1= '{' ( ( (lv_Metadata_2_0= ruleMetadataPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Metadata_4_0= ruleMetadataPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            // InternalShipyardV4.g:827:3: () otherlv_1= '{' ( ( (lv_Metadata_2_0= ruleMetadataPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Metadata_4_0= ruleMetadataPropertiesAbstract ) ) )* )? otherlv_5= '}'
            {
            // InternalShipyardV4.g:827:3: ()
            // InternalShipyardV4.g:828:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMetadataAccess().getMetadataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMetadataAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalShipyardV4.g:838:3: ( ( (lv_Metadata_2_0= ruleMetadataPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Metadata_4_0= ruleMetadataPropertiesAbstract ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalShipyardV4.g:839:4: ( (lv_Metadata_2_0= ruleMetadataPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Metadata_4_0= ruleMetadataPropertiesAbstract ) ) )*
                    {
                    // InternalShipyardV4.g:839:4: ( (lv_Metadata_2_0= ruleMetadataPropertiesAbstract ) )
                    // InternalShipyardV4.g:840:5: (lv_Metadata_2_0= ruleMetadataPropertiesAbstract )
                    {
                    // InternalShipyardV4.g:840:5: (lv_Metadata_2_0= ruleMetadataPropertiesAbstract )
                    // InternalShipyardV4.g:841:6: lv_Metadata_2_0= ruleMetadataPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getMetadataAccess().getMetadataMetadataPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_Metadata_2_0=ruleMetadataPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetadataRule());
                    						}
                    						add(
                    							current,
                    							"Metadata",
                    							lv_Metadata_2_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.MetadataPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:858:4: (otherlv_3= ',' ( (lv_Metadata_4_0= ruleMetadataPropertiesAbstract ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==12) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalShipyardV4.g:859:5: otherlv_3= ',' ( (lv_Metadata_4_0= ruleMetadataPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getMetadataAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalShipyardV4.g:863:5: ( (lv_Metadata_4_0= ruleMetadataPropertiesAbstract ) )
                    	    // InternalShipyardV4.g:864:6: (lv_Metadata_4_0= ruleMetadataPropertiesAbstract )
                    	    {
                    	    // InternalShipyardV4.g:864:6: (lv_Metadata_4_0= ruleMetadataPropertiesAbstract )
                    	    // InternalShipyardV4.g:865:7: lv_Metadata_4_0= ruleMetadataPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getMetadataAccess().getMetadataMetadataPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_Metadata_4_0=ruleMetadataPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMetadataRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Metadata",
                    	    								lv_Metadata_4_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.MetadataPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMetadataAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleMetadataName"
    // InternalShipyardV4.g:892:1: entryRuleMetadataName returns [EObject current=null] : iv_ruleMetadataName= ruleMetadataName EOF ;
    public final EObject entryRuleMetadataName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadataName = null;


        try {
            // InternalShipyardV4.g:892:53: (iv_ruleMetadataName= ruleMetadataName EOF )
            // InternalShipyardV4.g:893:2: iv_ruleMetadataName= ruleMetadataName EOF
            {
             newCompositeNode(grammarAccess.getMetadataNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadataName=ruleMetadataName();

            state._fsp--;

             current =iv_ruleMetadataName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadataName"


    // $ANTLR start "ruleMetadataName"
    // InternalShipyardV4.g:899:1: ruleMetadataName returns [EObject current=null] : ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleMetadataName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:905:2: ( ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalShipyardV4.g:906:2: ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalShipyardV4.g:906:2: ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) )
            // InternalShipyardV4.g:907:3: () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) )
            {
            // InternalShipyardV4.g:907:3: ()
            // InternalShipyardV4.g:908:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMetadataNameAccess().getMetadataNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMetadataNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMetadataNameAccess().getColonKeyword_2());
            		
            // InternalShipyardV4.g:922:3: ( (lv_name_3_0= ruleEString ) )
            // InternalShipyardV4.g:923:4: (lv_name_3_0= ruleEString )
            {
            // InternalShipyardV4.g:923:4: (lv_name_3_0= ruleEString )
            // InternalShipyardV4.g:924:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetadataNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetadataNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetadataName"


    // $ANTLR start "entryRuleShipyardSpec"
    // InternalShipyardV4.g:945:1: entryRuleShipyardSpec returns [EObject current=null] : iv_ruleShipyardSpec= ruleShipyardSpec EOF ;
    public final EObject entryRuleShipyardSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipyardSpec = null;


        try {
            // InternalShipyardV4.g:945:53: (iv_ruleShipyardSpec= ruleShipyardSpec EOF )
            // InternalShipyardV4.g:946:2: iv_ruleShipyardSpec= ruleShipyardSpec EOF
            {
             newCompositeNode(grammarAccess.getShipyardSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipyardSpec=ruleShipyardSpec();

            state._fsp--;

             current =iv_ruleShipyardSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipyardSpec"


    // $ANTLR start "ruleShipyardSpec"
    // InternalShipyardV4.g:952:1: ruleShipyardSpec returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_ShipyardSpec_2_0= ruleShipyardSpecPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleShipyardSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ShipyardSpec_2_0 = null;

        EObject lv_ShipyardSpec_4_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:958:2: ( ( () otherlv_1= '{' ( ( (lv_ShipyardSpec_2_0= ruleShipyardSpecPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract ) ) )* )? otherlv_5= '}' ) )
            // InternalShipyardV4.g:959:2: ( () otherlv_1= '{' ( ( (lv_ShipyardSpec_2_0= ruleShipyardSpecPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            {
            // InternalShipyardV4.g:959:2: ( () otherlv_1= '{' ( ( (lv_ShipyardSpec_2_0= ruleShipyardSpecPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            // InternalShipyardV4.g:960:3: () otherlv_1= '{' ( ( (lv_ShipyardSpec_2_0= ruleShipyardSpecPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract ) ) )* )? otherlv_5= '}'
            {
            // InternalShipyardV4.g:960:3: ()
            // InternalShipyardV4.g:961:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShipyardSpecAccess().getShipyardSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getShipyardSpecAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalShipyardV4.g:971:3: ( ( (lv_ShipyardSpec_2_0= ruleShipyardSpecPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalShipyardV4.g:972:4: ( (lv_ShipyardSpec_2_0= ruleShipyardSpecPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract ) ) )*
                    {
                    // InternalShipyardV4.g:972:4: ( (lv_ShipyardSpec_2_0= ruleShipyardSpecPropertiesAbstract ) )
                    // InternalShipyardV4.g:973:5: (lv_ShipyardSpec_2_0= ruleShipyardSpecPropertiesAbstract )
                    {
                    // InternalShipyardV4.g:973:5: (lv_ShipyardSpec_2_0= ruleShipyardSpecPropertiesAbstract )
                    // InternalShipyardV4.g:974:6: lv_ShipyardSpec_2_0= ruleShipyardSpecPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getShipyardSpecAccess().getShipyardSpecShipyardSpecPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_ShipyardSpec_2_0=ruleShipyardSpecPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShipyardSpecRule());
                    						}
                    						add(
                    							current,
                    							"ShipyardSpec",
                    							lv_ShipyardSpec_2_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.ShipyardSpecPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:991:4: (otherlv_3= ',' ( (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==12) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalShipyardV4.g:992:5: otherlv_3= ',' ( (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getShipyardSpecAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalShipyardV4.g:996:5: ( (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract ) )
                    	    // InternalShipyardV4.g:997:6: (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract )
                    	    {
                    	    // InternalShipyardV4.g:997:6: (lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract )
                    	    // InternalShipyardV4.g:998:7: lv_ShipyardSpec_4_0= ruleShipyardSpecPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getShipyardSpecAccess().getShipyardSpecShipyardSpecPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_ShipyardSpec_4_0=ruleShipyardSpecPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getShipyardSpecRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ShipyardSpec",
                    	    								lv_ShipyardSpec_4_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.ShipyardSpecPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getShipyardSpecAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipyardSpec"


    // $ANTLR start "entryRuleShipyardSpecStages"
    // InternalShipyardV4.g:1025:1: entryRuleShipyardSpecStages returns [EObject current=null] : iv_ruleShipyardSpecStages= ruleShipyardSpecStages EOF ;
    public final EObject entryRuleShipyardSpecStages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipyardSpecStages = null;


        try {
            // InternalShipyardV4.g:1025:59: (iv_ruleShipyardSpecStages= ruleShipyardSpecStages EOF )
            // InternalShipyardV4.g:1026:2: iv_ruleShipyardSpecStages= ruleShipyardSpecStages EOF
            {
             newCompositeNode(grammarAccess.getShipyardSpecStagesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipyardSpecStages=ruleShipyardSpecStages();

            state._fsp--;

             current =iv_ruleShipyardSpecStages; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipyardSpecStages"


    // $ANTLR start "ruleShipyardSpecStages"
    // InternalShipyardV4.g:1032:1: ruleShipyardSpecStages returns [EObject current=null] : ( () otherlv_1= '\"stages\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_stages_4_0= ruleShipyardSpecStagesItems ) ) (otherlv_5= ',' ( (lv_stages_6_0= ruleShipyardSpecStagesItems ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleShipyardSpecStages() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_stages_4_0 = null;

        EObject lv_stages_6_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1038:2: ( ( () otherlv_1= '\"stages\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_stages_4_0= ruleShipyardSpecStagesItems ) ) (otherlv_5= ',' ( (lv_stages_6_0= ruleShipyardSpecStagesItems ) ) )* )? otherlv_7= ']' ) )
            // InternalShipyardV4.g:1039:2: ( () otherlv_1= '\"stages\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_stages_4_0= ruleShipyardSpecStagesItems ) ) (otherlv_5= ',' ( (lv_stages_6_0= ruleShipyardSpecStagesItems ) ) )* )? otherlv_7= ']' )
            {
            // InternalShipyardV4.g:1039:2: ( () otherlv_1= '\"stages\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_stages_4_0= ruleShipyardSpecStagesItems ) ) (otherlv_5= ',' ( (lv_stages_6_0= ruleShipyardSpecStagesItems ) ) )* )? otherlv_7= ']' )
            // InternalShipyardV4.g:1040:3: () otherlv_1= '\"stages\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_stages_4_0= ruleShipyardSpecStagesItems ) ) (otherlv_5= ',' ( (lv_stages_6_0= ruleShipyardSpecStagesItems ) ) )* )? otherlv_7= ']'
            {
            // InternalShipyardV4.g:1040:3: ()
            // InternalShipyardV4.g:1041:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShipyardSpecStagesAccess().getShipyardSpecStagesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getShipyardSpecStagesAccess().getStagesKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getShipyardSpecStagesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getShipyardSpecStagesAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalShipyardV4.g:1059:3: ( ( (lv_stages_4_0= ruleShipyardSpecStagesItems ) ) (otherlv_5= ',' ( (lv_stages_6_0= ruleShipyardSpecStagesItems ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalShipyardV4.g:1060:4: ( (lv_stages_4_0= ruleShipyardSpecStagesItems ) ) (otherlv_5= ',' ( (lv_stages_6_0= ruleShipyardSpecStagesItems ) ) )*
                    {
                    // InternalShipyardV4.g:1060:4: ( (lv_stages_4_0= ruleShipyardSpecStagesItems ) )
                    // InternalShipyardV4.g:1061:5: (lv_stages_4_0= ruleShipyardSpecStagesItems )
                    {
                    // InternalShipyardV4.g:1061:5: (lv_stages_4_0= ruleShipyardSpecStagesItems )
                    // InternalShipyardV4.g:1062:6: lv_stages_4_0= ruleShipyardSpecStagesItems
                    {

                    						newCompositeNode(grammarAccess.getShipyardSpecStagesAccess().getStagesShipyardSpecStagesItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_stages_4_0=ruleShipyardSpecStagesItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShipyardSpecStagesRule());
                    						}
                    						add(
                    							current,
                    							"stages",
                    							lv_stages_4_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.ShipyardSpecStagesItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:1079:4: (otherlv_5= ',' ( (lv_stages_6_0= ruleShipyardSpecStagesItems ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==12) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalShipyardV4.g:1080:5: otherlv_5= ',' ( (lv_stages_6_0= ruleShipyardSpecStagesItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getShipyardSpecStagesAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalShipyardV4.g:1084:5: ( (lv_stages_6_0= ruleShipyardSpecStagesItems ) )
                    	    // InternalShipyardV4.g:1085:6: (lv_stages_6_0= ruleShipyardSpecStagesItems )
                    	    {
                    	    // InternalShipyardV4.g:1085:6: (lv_stages_6_0= ruleShipyardSpecStagesItems )
                    	    // InternalShipyardV4.g:1086:7: lv_stages_6_0= ruleShipyardSpecStagesItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getShipyardSpecStagesAccess().getStagesShipyardSpecStagesItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_stages_6_0=ruleShipyardSpecStagesItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getShipyardSpecStagesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"stages",
                    	    								lv_stages_6_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.ShipyardSpecStagesItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getShipyardSpecStagesAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipyardSpecStages"


    // $ANTLR start "entryRuleShipyardSpecStagesItems"
    // InternalShipyardV4.g:1113:1: entryRuleShipyardSpecStagesItems returns [EObject current=null] : iv_ruleShipyardSpecStagesItems= ruleShipyardSpecStagesItems EOF ;
    public final EObject entryRuleShipyardSpecStagesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipyardSpecStagesItems = null;


        try {
            // InternalShipyardV4.g:1113:64: (iv_ruleShipyardSpecStagesItems= ruleShipyardSpecStagesItems EOF )
            // InternalShipyardV4.g:1114:2: iv_ruleShipyardSpecStagesItems= ruleShipyardSpecStagesItems EOF
            {
             newCompositeNode(grammarAccess.getShipyardSpecStagesItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShipyardSpecStagesItems=ruleShipyardSpecStagesItems();

            state._fsp--;

             current =iv_ruleShipyardSpecStagesItems; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipyardSpecStagesItems"


    // $ANTLR start "ruleShipyardSpecStagesItems"
    // InternalShipyardV4.g:1120:1: ruleShipyardSpecStagesItems returns [EObject current=null] : ( (lv_items_0_0= ruleStage ) ) ;
    public final EObject ruleShipyardSpecStagesItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1126:2: ( ( (lv_items_0_0= ruleStage ) ) )
            // InternalShipyardV4.g:1127:2: ( (lv_items_0_0= ruleStage ) )
            {
            // InternalShipyardV4.g:1127:2: ( (lv_items_0_0= ruleStage ) )
            // InternalShipyardV4.g:1128:3: (lv_items_0_0= ruleStage )
            {
            // InternalShipyardV4.g:1128:3: (lv_items_0_0= ruleStage )
            // InternalShipyardV4.g:1129:4: lv_items_0_0= ruleStage
            {

            				newCompositeNode(grammarAccess.getShipyardSpecStagesItemsAccess().getItemsStageParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleStage();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getShipyardSpecStagesItemsRule());
            				}
            				set(
            					current,
            					"items",
            					lv_items_0_0,
            					"at.jku.bise.shipyardV4.ShipyardV4.Stage");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipyardSpecStagesItems"


    // $ANTLR start "entryRuleStage"
    // InternalShipyardV4.g:1149:1: entryRuleStage returns [EObject current=null] : iv_ruleStage= ruleStage EOF ;
    public final EObject entryRuleStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStage = null;


        try {
            // InternalShipyardV4.g:1149:46: (iv_ruleStage= ruleStage EOF )
            // InternalShipyardV4.g:1150:2: iv_ruleStage= ruleStage EOF
            {
             newCompositeNode(grammarAccess.getStageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStage=ruleStage();

            state._fsp--;

             current =iv_ruleStage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStage"


    // $ANTLR start "ruleStage"
    // InternalShipyardV4.g:1156:1: ruleStage returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_Stage_2_0= ruleStagePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Stage_4_0= ruleStagePropertiesAbstract ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleStage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_Stage_2_0 = null;

        EObject lv_Stage_4_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1162:2: ( ( () otherlv_1= '{' ( ( (lv_Stage_2_0= ruleStagePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Stage_4_0= ruleStagePropertiesAbstract ) ) )* )? otherlv_5= '}' ) )
            // InternalShipyardV4.g:1163:2: ( () otherlv_1= '{' ( ( (lv_Stage_2_0= ruleStagePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Stage_4_0= ruleStagePropertiesAbstract ) ) )* )? otherlv_5= '}' )
            {
            // InternalShipyardV4.g:1163:2: ( () otherlv_1= '{' ( ( (lv_Stage_2_0= ruleStagePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Stage_4_0= ruleStagePropertiesAbstract ) ) )* )? otherlv_5= '}' )
            // InternalShipyardV4.g:1164:3: () otherlv_1= '{' ( ( (lv_Stage_2_0= ruleStagePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Stage_4_0= ruleStagePropertiesAbstract ) ) )* )? otherlv_5= '}'
            {
            // InternalShipyardV4.g:1164:3: ()
            // InternalShipyardV4.g:1165:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStageAccess().getStageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getStageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalShipyardV4.g:1175:3: ( ( (lv_Stage_2_0= ruleStagePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Stage_4_0= ruleStagePropertiesAbstract ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19||LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalShipyardV4.g:1176:4: ( (lv_Stage_2_0= ruleStagePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Stage_4_0= ruleStagePropertiesAbstract ) ) )*
                    {
                    // InternalShipyardV4.g:1176:4: ( (lv_Stage_2_0= ruleStagePropertiesAbstract ) )
                    // InternalShipyardV4.g:1177:5: (lv_Stage_2_0= ruleStagePropertiesAbstract )
                    {
                    // InternalShipyardV4.g:1177:5: (lv_Stage_2_0= ruleStagePropertiesAbstract )
                    // InternalShipyardV4.g:1178:6: lv_Stage_2_0= ruleStagePropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getStageAccess().getStageStagePropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_Stage_2_0=ruleStagePropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStageRule());
                    						}
                    						add(
                    							current,
                    							"Stage",
                    							lv_Stage_2_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.StagePropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:1195:4: (otherlv_3= ',' ( (lv_Stage_4_0= ruleStagePropertiesAbstract ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==12) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalShipyardV4.g:1196:5: otherlv_3= ',' ( (lv_Stage_4_0= ruleStagePropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_17); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStageAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalShipyardV4.g:1200:5: ( (lv_Stage_4_0= ruleStagePropertiesAbstract ) )
                    	    // InternalShipyardV4.g:1201:6: (lv_Stage_4_0= ruleStagePropertiesAbstract )
                    	    {
                    	    // InternalShipyardV4.g:1201:6: (lv_Stage_4_0= ruleStagePropertiesAbstract )
                    	    // InternalShipyardV4.g:1202:7: lv_Stage_4_0= ruleStagePropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getStageAccess().getStageStagePropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_Stage_4_0=ruleStagePropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Stage",
                    	    								lv_Stage_4_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.StagePropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStageAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStage"


    // $ANTLR start "entryRuleStageName"
    // InternalShipyardV4.g:1229:1: entryRuleStageName returns [EObject current=null] : iv_ruleStageName= ruleStageName EOF ;
    public final EObject entryRuleStageName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStageName = null;


        try {
            // InternalShipyardV4.g:1229:50: (iv_ruleStageName= ruleStageName EOF )
            // InternalShipyardV4.g:1230:2: iv_ruleStageName= ruleStageName EOF
            {
             newCompositeNode(grammarAccess.getStageNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStageName=ruleStageName();

            state._fsp--;

             current =iv_ruleStageName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStageName"


    // $ANTLR start "ruleStageName"
    // InternalShipyardV4.g:1236:1: ruleStageName returns [EObject current=null] : ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleStageName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1242:2: ( ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalShipyardV4.g:1243:2: ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalShipyardV4.g:1243:2: ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) )
            // InternalShipyardV4.g:1244:3: () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) )
            {
            // InternalShipyardV4.g:1244:3: ()
            // InternalShipyardV4.g:1245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStageNameAccess().getStageNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getStageNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getStageNameAccess().getColonKeyword_2());
            		
            // InternalShipyardV4.g:1259:3: ( (lv_name_3_0= ruleEString ) )
            // InternalShipyardV4.g:1260:4: (lv_name_3_0= ruleEString )
            {
            // InternalShipyardV4.g:1260:4: (lv_name_3_0= ruleEString )
            // InternalShipyardV4.g:1261:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStageNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStageNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStageName"


    // $ANTLR start "entryRuleStageSequences"
    // InternalShipyardV4.g:1282:1: entryRuleStageSequences returns [EObject current=null] : iv_ruleStageSequences= ruleStageSequences EOF ;
    public final EObject entryRuleStageSequences() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStageSequences = null;


        try {
            // InternalShipyardV4.g:1282:55: (iv_ruleStageSequences= ruleStageSequences EOF )
            // InternalShipyardV4.g:1283:2: iv_ruleStageSequences= ruleStageSequences EOF
            {
             newCompositeNode(grammarAccess.getStageSequencesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStageSequences=ruleStageSequences();

            state._fsp--;

             current =iv_ruleStageSequences; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStageSequences"


    // $ANTLR start "ruleStageSequences"
    // InternalShipyardV4.g:1289:1: ruleStageSequences returns [EObject current=null] : ( () otherlv_1= '\"sequences\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_sequences_4_0= ruleStageSequencesItems ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleStageSequencesItems ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleStageSequences() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_sequences_4_0 = null;

        EObject lv_sequences_6_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1295:2: ( ( () otherlv_1= '\"sequences\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_sequences_4_0= ruleStageSequencesItems ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleStageSequencesItems ) ) )* )? otherlv_7= ']' ) )
            // InternalShipyardV4.g:1296:2: ( () otherlv_1= '\"sequences\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_sequences_4_0= ruleStageSequencesItems ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleStageSequencesItems ) ) )* )? otherlv_7= ']' )
            {
            // InternalShipyardV4.g:1296:2: ( () otherlv_1= '\"sequences\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_sequences_4_0= ruleStageSequencesItems ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleStageSequencesItems ) ) )* )? otherlv_7= ']' )
            // InternalShipyardV4.g:1297:3: () otherlv_1= '\"sequences\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_sequences_4_0= ruleStageSequencesItems ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleStageSequencesItems ) ) )* )? otherlv_7= ']'
            {
            // InternalShipyardV4.g:1297:3: ()
            // InternalShipyardV4.g:1298:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStageSequencesAccess().getStageSequencesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getStageSequencesAccess().getSequencesKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getStageSequencesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getStageSequencesAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalShipyardV4.g:1316:3: ( ( (lv_sequences_4_0= ruleStageSequencesItems ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleStageSequencesItems ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==11) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalShipyardV4.g:1317:4: ( (lv_sequences_4_0= ruleStageSequencesItems ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleStageSequencesItems ) ) )*
                    {
                    // InternalShipyardV4.g:1317:4: ( (lv_sequences_4_0= ruleStageSequencesItems ) )
                    // InternalShipyardV4.g:1318:5: (lv_sequences_4_0= ruleStageSequencesItems )
                    {
                    // InternalShipyardV4.g:1318:5: (lv_sequences_4_0= ruleStageSequencesItems )
                    // InternalShipyardV4.g:1319:6: lv_sequences_4_0= ruleStageSequencesItems
                    {

                    						newCompositeNode(grammarAccess.getStageSequencesAccess().getSequencesStageSequencesItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_sequences_4_0=ruleStageSequencesItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStageSequencesRule());
                    						}
                    						add(
                    							current,
                    							"sequences",
                    							lv_sequences_4_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.StageSequencesItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:1336:4: (otherlv_5= ',' ( (lv_sequences_6_0= ruleStageSequencesItems ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==12) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalShipyardV4.g:1337:5: otherlv_5= ',' ( (lv_sequences_6_0= ruleStageSequencesItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getStageSequencesAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalShipyardV4.g:1341:5: ( (lv_sequences_6_0= ruleStageSequencesItems ) )
                    	    // InternalShipyardV4.g:1342:6: (lv_sequences_6_0= ruleStageSequencesItems )
                    	    {
                    	    // InternalShipyardV4.g:1342:6: (lv_sequences_6_0= ruleStageSequencesItems )
                    	    // InternalShipyardV4.g:1343:7: lv_sequences_6_0= ruleStageSequencesItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getStageSequencesAccess().getSequencesStageSequencesItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_sequences_6_0=ruleStageSequencesItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStageSequencesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sequences",
                    	    								lv_sequences_6_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.StageSequencesItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStageSequencesAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStageSequences"


    // $ANTLR start "entryRuleStageSequencesItems"
    // InternalShipyardV4.g:1370:1: entryRuleStageSequencesItems returns [EObject current=null] : iv_ruleStageSequencesItems= ruleStageSequencesItems EOF ;
    public final EObject entryRuleStageSequencesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStageSequencesItems = null;


        try {
            // InternalShipyardV4.g:1370:60: (iv_ruleStageSequencesItems= ruleStageSequencesItems EOF )
            // InternalShipyardV4.g:1371:2: iv_ruleStageSequencesItems= ruleStageSequencesItems EOF
            {
             newCompositeNode(grammarAccess.getStageSequencesItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStageSequencesItems=ruleStageSequencesItems();

            state._fsp--;

             current =iv_ruleStageSequencesItems; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStageSequencesItems"


    // $ANTLR start "ruleStageSequencesItems"
    // InternalShipyardV4.g:1377:1: ruleStageSequencesItems returns [EObject current=null] : ( (lv_items_0_0= ruleSequence ) ) ;
    public final EObject ruleStageSequencesItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1383:2: ( ( (lv_items_0_0= ruleSequence ) ) )
            // InternalShipyardV4.g:1384:2: ( (lv_items_0_0= ruleSequence ) )
            {
            // InternalShipyardV4.g:1384:2: ( (lv_items_0_0= ruleSequence ) )
            // InternalShipyardV4.g:1385:3: (lv_items_0_0= ruleSequence )
            {
            // InternalShipyardV4.g:1385:3: (lv_items_0_0= ruleSequence )
            // InternalShipyardV4.g:1386:4: lv_items_0_0= ruleSequence
            {

            				newCompositeNode(grammarAccess.getStageSequencesItemsAccess().getItemsSequenceParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleSequence();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStageSequencesItemsRule());
            				}
            				set(
            					current,
            					"items",
            					lv_items_0_0,
            					"at.jku.bise.shipyardV4.ShipyardV4.Sequence");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStageSequencesItems"


    // $ANTLR start "entryRuleSequence"
    // InternalShipyardV4.g:1406:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalShipyardV4.g:1406:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalShipyardV4.g:1407:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalShipyardV4.g:1413:1: ruleSequence returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_Sequence_2_0= ruleSequencePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Sequence_4_0= ruleSequencePropertiesAbstract ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_Sequence_2_0 = null;

        EObject lv_Sequence_4_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1419:2: ( ( () otherlv_1= '{' ( ( (lv_Sequence_2_0= ruleSequencePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Sequence_4_0= ruleSequencePropertiesAbstract ) ) )* )? otherlv_5= '}' ) )
            // InternalShipyardV4.g:1420:2: ( () otherlv_1= '{' ( ( (lv_Sequence_2_0= ruleSequencePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Sequence_4_0= ruleSequencePropertiesAbstract ) ) )* )? otherlv_5= '}' )
            {
            // InternalShipyardV4.g:1420:2: ( () otherlv_1= '{' ( ( (lv_Sequence_2_0= ruleSequencePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Sequence_4_0= ruleSequencePropertiesAbstract ) ) )* )? otherlv_5= '}' )
            // InternalShipyardV4.g:1421:3: () otherlv_1= '{' ( ( (lv_Sequence_2_0= ruleSequencePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Sequence_4_0= ruleSequencePropertiesAbstract ) ) )* )? otherlv_5= '}'
            {
            // InternalShipyardV4.g:1421:3: ()
            // InternalShipyardV4.g:1422:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceAccess().getSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalShipyardV4.g:1432:3: ( ( (lv_Sequence_2_0= ruleSequencePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Sequence_4_0= ruleSequencePropertiesAbstract ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19||(LA21_0>=24 && LA21_0<=25)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalShipyardV4.g:1433:4: ( (lv_Sequence_2_0= ruleSequencePropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Sequence_4_0= ruleSequencePropertiesAbstract ) ) )*
                    {
                    // InternalShipyardV4.g:1433:4: ( (lv_Sequence_2_0= ruleSequencePropertiesAbstract ) )
                    // InternalShipyardV4.g:1434:5: (lv_Sequence_2_0= ruleSequencePropertiesAbstract )
                    {
                    // InternalShipyardV4.g:1434:5: (lv_Sequence_2_0= ruleSequencePropertiesAbstract )
                    // InternalShipyardV4.g:1435:6: lv_Sequence_2_0= ruleSequencePropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getSequenceAccess().getSequenceSequencePropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_Sequence_2_0=ruleSequencePropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceRule());
                    						}
                    						add(
                    							current,
                    							"Sequence",
                    							lv_Sequence_2_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.SequencePropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:1452:4: (otherlv_3= ',' ( (lv_Sequence_4_0= ruleSequencePropertiesAbstract ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==12) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalShipyardV4.g:1453:5: otherlv_3= ',' ( (lv_Sequence_4_0= ruleSequencePropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_19); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalShipyardV4.g:1457:5: ( (lv_Sequence_4_0= ruleSequencePropertiesAbstract ) )
                    	    // InternalShipyardV4.g:1458:6: (lv_Sequence_4_0= ruleSequencePropertiesAbstract )
                    	    {
                    	    // InternalShipyardV4.g:1458:6: (lv_Sequence_4_0= ruleSequencePropertiesAbstract )
                    	    // InternalShipyardV4.g:1459:7: lv_Sequence_4_0= ruleSequencePropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceAccess().getSequenceSequencePropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_Sequence_4_0=ruleSequencePropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Sequence",
                    	    								lv_Sequence_4_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.SequencePropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleSequenceName"
    // InternalShipyardV4.g:1486:1: entryRuleSequenceName returns [EObject current=null] : iv_ruleSequenceName= ruleSequenceName EOF ;
    public final EObject entryRuleSequenceName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceName = null;


        try {
            // InternalShipyardV4.g:1486:53: (iv_ruleSequenceName= ruleSequenceName EOF )
            // InternalShipyardV4.g:1487:2: iv_ruleSequenceName= ruleSequenceName EOF
            {
             newCompositeNode(grammarAccess.getSequenceNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceName=ruleSequenceName();

            state._fsp--;

             current =iv_ruleSequenceName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceName"


    // $ANTLR start "ruleSequenceName"
    // InternalShipyardV4.g:1493:1: ruleSequenceName returns [EObject current=null] : ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleSequenceName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1499:2: ( ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalShipyardV4.g:1500:2: ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalShipyardV4.g:1500:2: ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) )
            // InternalShipyardV4.g:1501:3: () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) )
            {
            // InternalShipyardV4.g:1501:3: ()
            // InternalShipyardV4.g:1502:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceNameAccess().getSequenceNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceNameAccess().getColonKeyword_2());
            		
            // InternalShipyardV4.g:1516:3: ( (lv_name_3_0= ruleEString ) )
            // InternalShipyardV4.g:1517:4: (lv_name_3_0= ruleEString )
            {
            // InternalShipyardV4.g:1517:4: (lv_name_3_0= ruleEString )
            // InternalShipyardV4.g:1518:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSequenceNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceName"


    // $ANTLR start "entryRuleSequenceTriggeredOn"
    // InternalShipyardV4.g:1539:1: entryRuleSequenceTriggeredOn returns [EObject current=null] : iv_ruleSequenceTriggeredOn= ruleSequenceTriggeredOn EOF ;
    public final EObject entryRuleSequenceTriggeredOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceTriggeredOn = null;


        try {
            // InternalShipyardV4.g:1539:60: (iv_ruleSequenceTriggeredOn= ruleSequenceTriggeredOn EOF )
            // InternalShipyardV4.g:1540:2: iv_ruleSequenceTriggeredOn= ruleSequenceTriggeredOn EOF
            {
             newCompositeNode(grammarAccess.getSequenceTriggeredOnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceTriggeredOn=ruleSequenceTriggeredOn();

            state._fsp--;

             current =iv_ruleSequenceTriggeredOn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceTriggeredOn"


    // $ANTLR start "ruleSequenceTriggeredOn"
    // InternalShipyardV4.g:1546:1: ruleSequenceTriggeredOn returns [EObject current=null] : ( () otherlv_1= '\"triggeredOn\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_triggeredOn_4_0= ruleSequenceTriggeredOnItems ) ) (otherlv_5= ',' ( (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleSequenceTriggeredOn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_triggeredOn_4_0 = null;

        EObject lv_triggeredOn_6_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1552:2: ( ( () otherlv_1= '\"triggeredOn\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_triggeredOn_4_0= ruleSequenceTriggeredOnItems ) ) (otherlv_5= ',' ( (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems ) ) )* )? otherlv_7= ']' ) )
            // InternalShipyardV4.g:1553:2: ( () otherlv_1= '\"triggeredOn\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_triggeredOn_4_0= ruleSequenceTriggeredOnItems ) ) (otherlv_5= ',' ( (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems ) ) )* )? otherlv_7= ']' )
            {
            // InternalShipyardV4.g:1553:2: ( () otherlv_1= '\"triggeredOn\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_triggeredOn_4_0= ruleSequenceTriggeredOnItems ) ) (otherlv_5= ',' ( (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems ) ) )* )? otherlv_7= ']' )
            // InternalShipyardV4.g:1554:3: () otherlv_1= '\"triggeredOn\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_triggeredOn_4_0= ruleSequenceTriggeredOnItems ) ) (otherlv_5= ',' ( (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems ) ) )* )? otherlv_7= ']'
            {
            // InternalShipyardV4.g:1554:3: ()
            // InternalShipyardV4.g:1555:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceTriggeredOnAccess().getSequenceTriggeredOnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceTriggeredOnAccess().getTriggeredOnKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceTriggeredOnAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSequenceTriggeredOnAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalShipyardV4.g:1573:3: ( ( (lv_triggeredOn_4_0= ruleSequenceTriggeredOnItems ) ) (otherlv_5= ',' ( (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==11) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalShipyardV4.g:1574:4: ( (lv_triggeredOn_4_0= ruleSequenceTriggeredOnItems ) ) (otherlv_5= ',' ( (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems ) ) )*
                    {
                    // InternalShipyardV4.g:1574:4: ( (lv_triggeredOn_4_0= ruleSequenceTriggeredOnItems ) )
                    // InternalShipyardV4.g:1575:5: (lv_triggeredOn_4_0= ruleSequenceTriggeredOnItems )
                    {
                    // InternalShipyardV4.g:1575:5: (lv_triggeredOn_4_0= ruleSequenceTriggeredOnItems )
                    // InternalShipyardV4.g:1576:6: lv_triggeredOn_4_0= ruleSequenceTriggeredOnItems
                    {

                    						newCompositeNode(grammarAccess.getSequenceTriggeredOnAccess().getTriggeredOnSequenceTriggeredOnItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_triggeredOn_4_0=ruleSequenceTriggeredOnItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceTriggeredOnRule());
                    						}
                    						add(
                    							current,
                    							"triggeredOn",
                    							lv_triggeredOn_4_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.SequenceTriggeredOnItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:1593:4: (otherlv_5= ',' ( (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==12) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalShipyardV4.g:1594:5: otherlv_5= ',' ( (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSequenceTriggeredOnAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalShipyardV4.g:1598:5: ( (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems ) )
                    	    // InternalShipyardV4.g:1599:6: (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems )
                    	    {
                    	    // InternalShipyardV4.g:1599:6: (lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems )
                    	    // InternalShipyardV4.g:1600:7: lv_triggeredOn_6_0= ruleSequenceTriggeredOnItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceTriggeredOnAccess().getTriggeredOnSequenceTriggeredOnItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_triggeredOn_6_0=ruleSequenceTriggeredOnItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceTriggeredOnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"triggeredOn",
                    	    								lv_triggeredOn_6_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.SequenceTriggeredOnItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSequenceTriggeredOnAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceTriggeredOn"


    // $ANTLR start "entryRuleSequenceTasks"
    // InternalShipyardV4.g:1627:1: entryRuleSequenceTasks returns [EObject current=null] : iv_ruleSequenceTasks= ruleSequenceTasks EOF ;
    public final EObject entryRuleSequenceTasks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceTasks = null;


        try {
            // InternalShipyardV4.g:1627:54: (iv_ruleSequenceTasks= ruleSequenceTasks EOF )
            // InternalShipyardV4.g:1628:2: iv_ruleSequenceTasks= ruleSequenceTasks EOF
            {
             newCompositeNode(grammarAccess.getSequenceTasksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceTasks=ruleSequenceTasks();

            state._fsp--;

             current =iv_ruleSequenceTasks; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceTasks"


    // $ANTLR start "ruleSequenceTasks"
    // InternalShipyardV4.g:1634:1: ruleSequenceTasks returns [EObject current=null] : ( () otherlv_1= '\"tasks\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_tasks_4_0= ruleSequenceTasksItems ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleSequenceTasksItems ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleSequenceTasks() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_tasks_4_0 = null;

        EObject lv_tasks_6_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1640:2: ( ( () otherlv_1= '\"tasks\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_tasks_4_0= ruleSequenceTasksItems ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleSequenceTasksItems ) ) )* )? otherlv_7= ']' ) )
            // InternalShipyardV4.g:1641:2: ( () otherlv_1= '\"tasks\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_tasks_4_0= ruleSequenceTasksItems ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleSequenceTasksItems ) ) )* )? otherlv_7= ']' )
            {
            // InternalShipyardV4.g:1641:2: ( () otherlv_1= '\"tasks\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_tasks_4_0= ruleSequenceTasksItems ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleSequenceTasksItems ) ) )* )? otherlv_7= ']' )
            // InternalShipyardV4.g:1642:3: () otherlv_1= '\"tasks\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_tasks_4_0= ruleSequenceTasksItems ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleSequenceTasksItems ) ) )* )? otherlv_7= ']'
            {
            // InternalShipyardV4.g:1642:3: ()
            // InternalShipyardV4.g:1643:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceTasksAccess().getSequenceTasksAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceTasksAccess().getTasksKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSequenceTasksAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSequenceTasksAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalShipyardV4.g:1661:3: ( ( (lv_tasks_4_0= ruleSequenceTasksItems ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleSequenceTasksItems ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==11) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalShipyardV4.g:1662:4: ( (lv_tasks_4_0= ruleSequenceTasksItems ) ) (otherlv_5= ',' ( (lv_tasks_6_0= ruleSequenceTasksItems ) ) )*
                    {
                    // InternalShipyardV4.g:1662:4: ( (lv_tasks_4_0= ruleSequenceTasksItems ) )
                    // InternalShipyardV4.g:1663:5: (lv_tasks_4_0= ruleSequenceTasksItems )
                    {
                    // InternalShipyardV4.g:1663:5: (lv_tasks_4_0= ruleSequenceTasksItems )
                    // InternalShipyardV4.g:1664:6: lv_tasks_4_0= ruleSequenceTasksItems
                    {

                    						newCompositeNode(grammarAccess.getSequenceTasksAccess().getTasksSequenceTasksItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_tasks_4_0=ruleSequenceTasksItems();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceTasksRule());
                    						}
                    						add(
                    							current,
                    							"tasks",
                    							lv_tasks_4_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.SequenceTasksItems");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:1681:4: (otherlv_5= ',' ( (lv_tasks_6_0= ruleSequenceTasksItems ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==12) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalShipyardV4.g:1682:5: otherlv_5= ',' ( (lv_tasks_6_0= ruleSequenceTasksItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSequenceTasksAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalShipyardV4.g:1686:5: ( (lv_tasks_6_0= ruleSequenceTasksItems ) )
                    	    // InternalShipyardV4.g:1687:6: (lv_tasks_6_0= ruleSequenceTasksItems )
                    	    {
                    	    // InternalShipyardV4.g:1687:6: (lv_tasks_6_0= ruleSequenceTasksItems )
                    	    // InternalShipyardV4.g:1688:7: lv_tasks_6_0= ruleSequenceTasksItems
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceTasksAccess().getTasksSequenceTasksItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_tasks_6_0=ruleSequenceTasksItems();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceTasksRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tasks",
                    	    								lv_tasks_6_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.SequenceTasksItems");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSequenceTasksAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceTasks"


    // $ANTLR start "entryRuleSequenceTriggeredOnItems"
    // InternalShipyardV4.g:1715:1: entryRuleSequenceTriggeredOnItems returns [EObject current=null] : iv_ruleSequenceTriggeredOnItems= ruleSequenceTriggeredOnItems EOF ;
    public final EObject entryRuleSequenceTriggeredOnItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceTriggeredOnItems = null;


        try {
            // InternalShipyardV4.g:1715:65: (iv_ruleSequenceTriggeredOnItems= ruleSequenceTriggeredOnItems EOF )
            // InternalShipyardV4.g:1716:2: iv_ruleSequenceTriggeredOnItems= ruleSequenceTriggeredOnItems EOF
            {
             newCompositeNode(grammarAccess.getSequenceTriggeredOnItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceTriggeredOnItems=ruleSequenceTriggeredOnItems();

            state._fsp--;

             current =iv_ruleSequenceTriggeredOnItems; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceTriggeredOnItems"


    // $ANTLR start "ruleSequenceTriggeredOnItems"
    // InternalShipyardV4.g:1722:1: ruleSequenceTriggeredOnItems returns [EObject current=null] : ( (lv_items_0_0= ruleTrigger ) ) ;
    public final EObject ruleSequenceTriggeredOnItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1728:2: ( ( (lv_items_0_0= ruleTrigger ) ) )
            // InternalShipyardV4.g:1729:2: ( (lv_items_0_0= ruleTrigger ) )
            {
            // InternalShipyardV4.g:1729:2: ( (lv_items_0_0= ruleTrigger ) )
            // InternalShipyardV4.g:1730:3: (lv_items_0_0= ruleTrigger )
            {
            // InternalShipyardV4.g:1730:3: (lv_items_0_0= ruleTrigger )
            // InternalShipyardV4.g:1731:4: lv_items_0_0= ruleTrigger
            {

            				newCompositeNode(grammarAccess.getSequenceTriggeredOnItemsAccess().getItemsTriggerParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleTrigger();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSequenceTriggeredOnItemsRule());
            				}
            				set(
            					current,
            					"items",
            					lv_items_0_0,
            					"at.jku.bise.shipyardV4.ShipyardV4.Trigger");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceTriggeredOnItems"


    // $ANTLR start "entryRuleTrigger"
    // InternalShipyardV4.g:1751:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalShipyardV4.g:1751:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalShipyardV4.g:1752:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalShipyardV4.g:1758:1: ruleTrigger returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_Trigger_2_0= ruleTriggerPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Trigger_4_0= ruleTriggerPropertiesAbstract ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_Trigger_2_0 = null;

        EObject lv_Trigger_4_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1764:2: ( ( () otherlv_1= '{' ( ( (lv_Trigger_2_0= ruleTriggerPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Trigger_4_0= ruleTriggerPropertiesAbstract ) ) )* )? otherlv_5= '}' ) )
            // InternalShipyardV4.g:1765:2: ( () otherlv_1= '{' ( ( (lv_Trigger_2_0= ruleTriggerPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Trigger_4_0= ruleTriggerPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            {
            // InternalShipyardV4.g:1765:2: ( () otherlv_1= '{' ( ( (lv_Trigger_2_0= ruleTriggerPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Trigger_4_0= ruleTriggerPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            // InternalShipyardV4.g:1766:3: () otherlv_1= '{' ( ( (lv_Trigger_2_0= ruleTriggerPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Trigger_4_0= ruleTriggerPropertiesAbstract ) ) )* )? otherlv_5= '}'
            {
            // InternalShipyardV4.g:1766:3: ()
            // InternalShipyardV4.g:1767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriggerAccess().getTriggerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalShipyardV4.g:1777:3: ( ( (lv_Trigger_2_0= ruleTriggerPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Trigger_4_0= ruleTriggerPropertiesAbstract ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=26 && LA27_0<=27)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalShipyardV4.g:1778:4: ( (lv_Trigger_2_0= ruleTriggerPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Trigger_4_0= ruleTriggerPropertiesAbstract ) ) )*
                    {
                    // InternalShipyardV4.g:1778:4: ( (lv_Trigger_2_0= ruleTriggerPropertiesAbstract ) )
                    // InternalShipyardV4.g:1779:5: (lv_Trigger_2_0= ruleTriggerPropertiesAbstract )
                    {
                    // InternalShipyardV4.g:1779:5: (lv_Trigger_2_0= ruleTriggerPropertiesAbstract )
                    // InternalShipyardV4.g:1780:6: lv_Trigger_2_0= ruleTriggerPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getTriggerTriggerPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_Trigger_2_0=ruleTriggerPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriggerRule());
                    						}
                    						add(
                    							current,
                    							"Trigger",
                    							lv_Trigger_2_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.TriggerPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:1797:4: (otherlv_3= ',' ( (lv_Trigger_4_0= ruleTriggerPropertiesAbstract ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==12) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalShipyardV4.g:1798:5: otherlv_3= ',' ( (lv_Trigger_4_0= ruleTriggerPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_21); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getTriggerAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalShipyardV4.g:1802:5: ( (lv_Trigger_4_0= ruleTriggerPropertiesAbstract ) )
                    	    // InternalShipyardV4.g:1803:6: (lv_Trigger_4_0= ruleTriggerPropertiesAbstract )
                    	    {
                    	    // InternalShipyardV4.g:1803:6: (lv_Trigger_4_0= ruleTriggerPropertiesAbstract )
                    	    // InternalShipyardV4.g:1804:7: lv_Trigger_4_0= ruleTriggerPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getTriggerAccess().getTriggerTriggerPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_Trigger_4_0=ruleTriggerPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTriggerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Trigger",
                    	    								lv_Trigger_4_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.TriggerPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTriggerAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleTriggerEvent"
    // InternalShipyardV4.g:1831:1: entryRuleTriggerEvent returns [EObject current=null] : iv_ruleTriggerEvent= ruleTriggerEvent EOF ;
    public final EObject entryRuleTriggerEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerEvent = null;


        try {
            // InternalShipyardV4.g:1831:53: (iv_ruleTriggerEvent= ruleTriggerEvent EOF )
            // InternalShipyardV4.g:1832:2: iv_ruleTriggerEvent= ruleTriggerEvent EOF
            {
             newCompositeNode(grammarAccess.getTriggerEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerEvent=ruleTriggerEvent();

            state._fsp--;

             current =iv_ruleTriggerEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerEvent"


    // $ANTLR start "ruleTriggerEvent"
    // InternalShipyardV4.g:1838:1: ruleTriggerEvent returns [EObject current=null] : (otherlv_0= '\"event\"' otherlv_1= ':' ( (lv_event_2_0= ruleEString ) ) ) ;
    public final EObject ruleTriggerEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_event_2_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1844:2: ( (otherlv_0= '\"event\"' otherlv_1= ':' ( (lv_event_2_0= ruleEString ) ) ) )
            // InternalShipyardV4.g:1845:2: (otherlv_0= '\"event\"' otherlv_1= ':' ( (lv_event_2_0= ruleEString ) ) )
            {
            // InternalShipyardV4.g:1845:2: (otherlv_0= '\"event\"' otherlv_1= ':' ( (lv_event_2_0= ruleEString ) ) )
            // InternalShipyardV4.g:1846:3: otherlv_0= '\"event\"' otherlv_1= ':' ( (lv_event_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerEventAccess().getEventKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerEventAccess().getColonKeyword_1());
            		
            // InternalShipyardV4.g:1854:3: ( (lv_event_2_0= ruleEString ) )
            // InternalShipyardV4.g:1855:4: (lv_event_2_0= ruleEString )
            {
            // InternalShipyardV4.g:1855:4: (lv_event_2_0= ruleEString )
            // InternalShipyardV4.g:1856:5: lv_event_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTriggerEventAccess().getEventEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_event_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerEventRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_2_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerEvent"


    // $ANTLR start "entryRuleTriggerSelector"
    // InternalShipyardV4.g:1877:1: entryRuleTriggerSelector returns [EObject current=null] : iv_ruleTriggerSelector= ruleTriggerSelector EOF ;
    public final EObject entryRuleTriggerSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerSelector = null;


        try {
            // InternalShipyardV4.g:1877:56: (iv_ruleTriggerSelector= ruleTriggerSelector EOF )
            // InternalShipyardV4.g:1878:2: iv_ruleTriggerSelector= ruleTriggerSelector EOF
            {
             newCompositeNode(grammarAccess.getTriggerSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerSelector=ruleTriggerSelector();

            state._fsp--;

             current =iv_ruleTriggerSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerSelector"


    // $ANTLR start "ruleTriggerSelector"
    // InternalShipyardV4.g:1884:1: ruleTriggerSelector returns [EObject current=null] : (otherlv_0= '\"selector\"' otherlv_1= ':' ( (lv_selector_2_0= ruleSelector ) ) ) ;
    public final EObject ruleTriggerSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_selector_2_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1890:2: ( (otherlv_0= '\"selector\"' otherlv_1= ':' ( (lv_selector_2_0= ruleSelector ) ) ) )
            // InternalShipyardV4.g:1891:2: (otherlv_0= '\"selector\"' otherlv_1= ':' ( (lv_selector_2_0= ruleSelector ) ) )
            {
            // InternalShipyardV4.g:1891:2: (otherlv_0= '\"selector\"' otherlv_1= ':' ( (lv_selector_2_0= ruleSelector ) ) )
            // InternalShipyardV4.g:1892:3: otherlv_0= '\"selector\"' otherlv_1= ':' ( (lv_selector_2_0= ruleSelector ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerSelectorAccess().getSelectorKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerSelectorAccess().getColonKeyword_1());
            		
            // InternalShipyardV4.g:1900:3: ( (lv_selector_2_0= ruleSelector ) )
            // InternalShipyardV4.g:1901:4: (lv_selector_2_0= ruleSelector )
            {
            // InternalShipyardV4.g:1901:4: (lv_selector_2_0= ruleSelector )
            // InternalShipyardV4.g:1902:5: lv_selector_2_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getTriggerSelectorAccess().getSelectorSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_selector_2_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerSelectorRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_2_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerSelector"


    // $ANTLR start "entryRuleSelector"
    // InternalShipyardV4.g:1923:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalShipyardV4.g:1923:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalShipyardV4.g:1924:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalShipyardV4.g:1930:1: ruleSelector returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_Selector_2_0= ruleSelectorPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Selector_4_0= ruleSelectorPropertiesAbstract ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_Selector_2_0 = null;

        EObject lv_Selector_4_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:1936:2: ( ( () otherlv_1= '{' ( ( (lv_Selector_2_0= ruleSelectorPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Selector_4_0= ruleSelectorPropertiesAbstract ) ) )* )? otherlv_5= '}' ) )
            // InternalShipyardV4.g:1937:2: ( () otherlv_1= '{' ( ( (lv_Selector_2_0= ruleSelectorPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Selector_4_0= ruleSelectorPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            {
            // InternalShipyardV4.g:1937:2: ( () otherlv_1= '{' ( ( (lv_Selector_2_0= ruleSelectorPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Selector_4_0= ruleSelectorPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            // InternalShipyardV4.g:1938:3: () otherlv_1= '{' ( ( (lv_Selector_2_0= ruleSelectorPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Selector_4_0= ruleSelectorPropertiesAbstract ) ) )* )? otherlv_5= '}'
            {
            // InternalShipyardV4.g:1938:3: ()
            // InternalShipyardV4.g:1939:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelectorAccess().getSelectorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalShipyardV4.g:1949:3: ( ( (lv_Selector_2_0= ruleSelectorPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Selector_4_0= ruleSelectorPropertiesAbstract ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalShipyardV4.g:1950:4: ( (lv_Selector_2_0= ruleSelectorPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Selector_4_0= ruleSelectorPropertiesAbstract ) ) )*
                    {
                    // InternalShipyardV4.g:1950:4: ( (lv_Selector_2_0= ruleSelectorPropertiesAbstract ) )
                    // InternalShipyardV4.g:1951:5: (lv_Selector_2_0= ruleSelectorPropertiesAbstract )
                    {
                    // InternalShipyardV4.g:1951:5: (lv_Selector_2_0= ruleSelectorPropertiesAbstract )
                    // InternalShipyardV4.g:1952:6: lv_Selector_2_0= ruleSelectorPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_Selector_2_0=ruleSelectorPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						add(
                    							current,
                    							"Selector",
                    							lv_Selector_2_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.SelectorPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:1969:4: (otherlv_3= ',' ( (lv_Selector_4_0= ruleSelectorPropertiesAbstract ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==12) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalShipyardV4.g:1970:5: otherlv_3= ',' ( (lv_Selector_4_0= ruleSelectorPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_23); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSelectorAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalShipyardV4.g:1974:5: ( (lv_Selector_4_0= ruleSelectorPropertiesAbstract ) )
                    	    // InternalShipyardV4.g:1975:6: (lv_Selector_4_0= ruleSelectorPropertiesAbstract )
                    	    {
                    	    // InternalShipyardV4.g:1975:6: (lv_Selector_4_0= ruleSelectorPropertiesAbstract )
                    	    // InternalShipyardV4.g:1976:7: lv_Selector_4_0= ruleSelectorPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_Selector_4_0=ruleSelectorPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSelectorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Selector",
                    	    								lv_Selector_4_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.SelectorPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSelectorAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSelectorMatch"
    // InternalShipyardV4.g:2003:1: entryRuleSelectorMatch returns [EObject current=null] : iv_ruleSelectorMatch= ruleSelectorMatch EOF ;
    public final EObject entryRuleSelectorMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorMatch = null;


        try {
            // InternalShipyardV4.g:2003:54: (iv_ruleSelectorMatch= ruleSelectorMatch EOF )
            // InternalShipyardV4.g:2004:2: iv_ruleSelectorMatch= ruleSelectorMatch EOF
            {
             newCompositeNode(grammarAccess.getSelectorMatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectorMatch=ruleSelectorMatch();

            state._fsp--;

             current =iv_ruleSelectorMatch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectorMatch"


    // $ANTLR start "ruleSelectorMatch"
    // InternalShipyardV4.g:2010:1: ruleSelectorMatch returns [EObject current=null] : ( () otherlv_1= '\"match\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_match_4_0= ruleSelectorMatchPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_match_6_0= ruleSelectorMatchPropertiesAbstract ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleSelectorMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_match_4_0 = null;

        EObject lv_match_6_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2016:2: ( ( () otherlv_1= '\"match\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_match_4_0= ruleSelectorMatchPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_match_6_0= ruleSelectorMatchPropertiesAbstract ) ) )* )? otherlv_7= '}' ) )
            // InternalShipyardV4.g:2017:2: ( () otherlv_1= '\"match\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_match_4_0= ruleSelectorMatchPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_match_6_0= ruleSelectorMatchPropertiesAbstract ) ) )* )? otherlv_7= '}' )
            {
            // InternalShipyardV4.g:2017:2: ( () otherlv_1= '\"match\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_match_4_0= ruleSelectorMatchPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_match_6_0= ruleSelectorMatchPropertiesAbstract ) ) )* )? otherlv_7= '}' )
            // InternalShipyardV4.g:2018:3: () otherlv_1= '\"match\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_match_4_0= ruleSelectorMatchPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_match_6_0= ruleSelectorMatchPropertiesAbstract ) ) )* )? otherlv_7= '}'
            {
            // InternalShipyardV4.g:2018:3: ()
            // InternalShipyardV4.g:2019:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelectorMatchAccess().getSelectorMatchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectorMatchAccess().getMatchKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectorMatchAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectorMatchAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalShipyardV4.g:2037:3: ( ( (lv_match_4_0= ruleSelectorMatchPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_match_6_0= ruleSelectorMatchPropertiesAbstract ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalShipyardV4.g:2038:4: ( (lv_match_4_0= ruleSelectorMatchPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_match_6_0= ruleSelectorMatchPropertiesAbstract ) ) )*
                    {
                    // InternalShipyardV4.g:2038:4: ( (lv_match_4_0= ruleSelectorMatchPropertiesAbstract ) )
                    // InternalShipyardV4.g:2039:5: (lv_match_4_0= ruleSelectorMatchPropertiesAbstract )
                    {
                    // InternalShipyardV4.g:2039:5: (lv_match_4_0= ruleSelectorMatchPropertiesAbstract )
                    // InternalShipyardV4.g:2040:6: lv_match_4_0= ruleSelectorMatchPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getSelectorMatchAccess().getMatchSelectorMatchPropertiesAbstractParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_match_4_0=ruleSelectorMatchPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorMatchRule());
                    						}
                    						add(
                    							current,
                    							"match",
                    							lv_match_4_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.SelectorMatchPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:2057:4: (otherlv_5= ',' ( (lv_match_6_0= ruleSelectorMatchPropertiesAbstract ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==12) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalShipyardV4.g:2058:5: otherlv_5= ',' ( (lv_match_6_0= ruleSelectorMatchPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSelectorMatchAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalShipyardV4.g:2062:5: ( (lv_match_6_0= ruleSelectorMatchPropertiesAbstract ) )
                    	    // InternalShipyardV4.g:2063:6: (lv_match_6_0= ruleSelectorMatchPropertiesAbstract )
                    	    {
                    	    // InternalShipyardV4.g:2063:6: (lv_match_6_0= ruleSelectorMatchPropertiesAbstract )
                    	    // InternalShipyardV4.g:2064:7: lv_match_6_0= ruleSelectorMatchPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getSelectorMatchAccess().getMatchSelectorMatchPropertiesAbstractParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_match_6_0=ruleSelectorMatchPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSelectorMatchRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"match",
                    	    								lv_match_6_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.SelectorMatchPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSelectorMatchAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectorMatch"


    // $ANTLR start "entryRuleSelectorMatchPatternProperties0"
    // InternalShipyardV4.g:2091:1: entryRuleSelectorMatchPatternProperties0 returns [EObject current=null] : iv_ruleSelectorMatchPatternProperties0= ruleSelectorMatchPatternProperties0 EOF ;
    public final EObject entryRuleSelectorMatchPatternProperties0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorMatchPatternProperties0 = null;


        try {
            // InternalShipyardV4.g:2091:72: (iv_ruleSelectorMatchPatternProperties0= ruleSelectorMatchPatternProperties0 EOF )
            // InternalShipyardV4.g:2092:2: iv_ruleSelectorMatchPatternProperties0= ruleSelectorMatchPatternProperties0 EOF
            {
             newCompositeNode(grammarAccess.getSelectorMatchPatternProperties0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectorMatchPatternProperties0=ruleSelectorMatchPatternProperties0();

            state._fsp--;

             current =iv_ruleSelectorMatchPatternProperties0; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectorMatchPatternProperties0"


    // $ANTLR start "ruleSelectorMatchPatternProperties0"
    // InternalShipyardV4.g:2098:1: ruleSelectorMatchPatternProperties0 returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_patternProperties0_2_0= ruleEString ) ) ) ;
    public final EObject ruleSelectorMatchPatternProperties0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_patternProperties0_2_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2104:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_patternProperties0_2_0= ruleEString ) ) ) )
            // InternalShipyardV4.g:2105:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_patternProperties0_2_0= ruleEString ) ) )
            {
            // InternalShipyardV4.g:2105:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_patternProperties0_2_0= ruleEString ) ) )
            // InternalShipyardV4.g:2106:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_patternProperties0_2_0= ruleEString ) )
            {
            // InternalShipyardV4.g:2106:3: ( (lv_key_0_0= ruleEString ) )
            // InternalShipyardV4.g:2107:4: (lv_key_0_0= ruleEString )
            {
            // InternalShipyardV4.g:2107:4: (lv_key_0_0= ruleEString )
            // InternalShipyardV4.g:2108:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSelectorMatchPatternProperties0Access().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectorMatchPatternProperties0Rule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectorMatchPatternProperties0Access().getColonKeyword_1());
            		
            // InternalShipyardV4.g:2129:3: ( (lv_patternProperties0_2_0= ruleEString ) )
            // InternalShipyardV4.g:2130:4: (lv_patternProperties0_2_0= ruleEString )
            {
            // InternalShipyardV4.g:2130:4: (lv_patternProperties0_2_0= ruleEString )
            // InternalShipyardV4.g:2131:5: lv_patternProperties0_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSelectorMatchPatternProperties0Access().getPatternProperties0EStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_patternProperties0_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectorMatchPatternProperties0Rule());
            					}
            					set(
            						current,
            						"patternProperties0",
            						lv_patternProperties0_2_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectorMatchPatternProperties0"


    // $ANTLR start "entryRuleSequenceTasksItems"
    // InternalShipyardV4.g:2152:1: entryRuleSequenceTasksItems returns [EObject current=null] : iv_ruleSequenceTasksItems= ruleSequenceTasksItems EOF ;
    public final EObject entryRuleSequenceTasksItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceTasksItems = null;


        try {
            // InternalShipyardV4.g:2152:59: (iv_ruleSequenceTasksItems= ruleSequenceTasksItems EOF )
            // InternalShipyardV4.g:2153:2: iv_ruleSequenceTasksItems= ruleSequenceTasksItems EOF
            {
             newCompositeNode(grammarAccess.getSequenceTasksItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceTasksItems=ruleSequenceTasksItems();

            state._fsp--;

             current =iv_ruleSequenceTasksItems; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceTasksItems"


    // $ANTLR start "ruleSequenceTasksItems"
    // InternalShipyardV4.g:2159:1: ruleSequenceTasksItems returns [EObject current=null] : ( (lv_items_0_0= ruleTask ) ) ;
    public final EObject ruleSequenceTasksItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2165:2: ( ( (lv_items_0_0= ruleTask ) ) )
            // InternalShipyardV4.g:2166:2: ( (lv_items_0_0= ruleTask ) )
            {
            // InternalShipyardV4.g:2166:2: ( (lv_items_0_0= ruleTask ) )
            // InternalShipyardV4.g:2167:3: (lv_items_0_0= ruleTask )
            {
            // InternalShipyardV4.g:2167:3: (lv_items_0_0= ruleTask )
            // InternalShipyardV4.g:2168:4: lv_items_0_0= ruleTask
            {

            				newCompositeNode(grammarAccess.getSequenceTasksItemsAccess().getItemsTaskParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleTask();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSequenceTasksItemsRule());
            				}
            				set(
            					current,
            					"items",
            					lv_items_0_0,
            					"at.jku.bise.shipyardV4.ShipyardV4.Task");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceTasksItems"


    // $ANTLR start "entryRuleTask"
    // InternalShipyardV4.g:2188:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalShipyardV4.g:2188:45: (iv_ruleTask= ruleTask EOF )
            // InternalShipyardV4.g:2189:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalShipyardV4.g:2195:1: ruleTask returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_Task_2_0= ruleTaskPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Task_4_0= ruleTaskPropertiesAbstract ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_Task_2_0 = null;

        EObject lv_Task_4_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2201:2: ( ( () otherlv_1= '{' ( ( (lv_Task_2_0= ruleTaskPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Task_4_0= ruleTaskPropertiesAbstract ) ) )* )? otherlv_5= '}' ) )
            // InternalShipyardV4.g:2202:2: ( () otherlv_1= '{' ( ( (lv_Task_2_0= ruleTaskPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Task_4_0= ruleTaskPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            {
            // InternalShipyardV4.g:2202:2: ( () otherlv_1= '{' ( ( (lv_Task_2_0= ruleTaskPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Task_4_0= ruleTaskPropertiesAbstract ) ) )* )? otherlv_5= '}' )
            // InternalShipyardV4.g:2203:3: () otherlv_1= '{' ( ( (lv_Task_2_0= ruleTaskPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Task_4_0= ruleTaskPropertiesAbstract ) ) )* )? otherlv_5= '}'
            {
            // InternalShipyardV4.g:2203:3: ()
            // InternalShipyardV4.g:2204:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskAccess().getTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalShipyardV4.g:2214:3: ( ( (lv_Task_2_0= ruleTaskPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Task_4_0= ruleTaskPropertiesAbstract ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==19||LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalShipyardV4.g:2215:4: ( (lv_Task_2_0= ruleTaskPropertiesAbstract ) ) (otherlv_3= ',' ( (lv_Task_4_0= ruleTaskPropertiesAbstract ) ) )*
                    {
                    // InternalShipyardV4.g:2215:4: ( (lv_Task_2_0= ruleTaskPropertiesAbstract ) )
                    // InternalShipyardV4.g:2216:5: (lv_Task_2_0= ruleTaskPropertiesAbstract )
                    {
                    // InternalShipyardV4.g:2216:5: (lv_Task_2_0= ruleTaskPropertiesAbstract )
                    // InternalShipyardV4.g:2217:6: lv_Task_2_0= ruleTaskPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getTaskTaskPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_Task_2_0=ruleTaskPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						add(
                    							current,
                    							"Task",
                    							lv_Task_2_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.TaskPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:2234:4: (otherlv_3= ',' ( (lv_Task_4_0= ruleTaskPropertiesAbstract ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==12) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalShipyardV4.g:2235:5: otherlv_3= ',' ( (lv_Task_4_0= ruleTaskPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_26); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalShipyardV4.g:2239:5: ( (lv_Task_4_0= ruleTaskPropertiesAbstract ) )
                    	    // InternalShipyardV4.g:2240:6: (lv_Task_4_0= ruleTaskPropertiesAbstract )
                    	    {
                    	    // InternalShipyardV4.g:2240:6: (lv_Task_4_0= ruleTaskPropertiesAbstract )
                    	    // InternalShipyardV4.g:2241:7: lv_Task_4_0= ruleTaskPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskAccess().getTaskTaskPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_Task_4_0=ruleTaskPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Task",
                    	    								lv_Task_4_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.TaskPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleTaskName"
    // InternalShipyardV4.g:2268:1: entryRuleTaskName returns [EObject current=null] : iv_ruleTaskName= ruleTaskName EOF ;
    public final EObject entryRuleTaskName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskName = null;


        try {
            // InternalShipyardV4.g:2268:49: (iv_ruleTaskName= ruleTaskName EOF )
            // InternalShipyardV4.g:2269:2: iv_ruleTaskName= ruleTaskName EOF
            {
             newCompositeNode(grammarAccess.getTaskNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskName=ruleTaskName();

            state._fsp--;

             current =iv_ruleTaskName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskName"


    // $ANTLR start "ruleTaskName"
    // InternalShipyardV4.g:2275:1: ruleTaskName returns [EObject current=null] : ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleTaskName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2281:2: ( ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalShipyardV4.g:2282:2: ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalShipyardV4.g:2282:2: ( () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) )
            // InternalShipyardV4.g:2283:3: () otherlv_1= '\"name\"' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) )
            {
            // InternalShipyardV4.g:2283:3: ()
            // InternalShipyardV4.g:2284:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskNameAccess().getTaskNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskNameAccess().getColonKeyword_2());
            		
            // InternalShipyardV4.g:2298:3: ( (lv_name_3_0= ruleEString ) )
            // InternalShipyardV4.g:2299:4: (lv_name_3_0= ruleEString )
            {
            // InternalShipyardV4.g:2299:4: (lv_name_3_0= ruleEString )
            // InternalShipyardV4.g:2300:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskName"


    // $ANTLR start "entryRuleTaskProperties"
    // InternalShipyardV4.g:2321:1: entryRuleTaskProperties returns [EObject current=null] : iv_ruleTaskProperties= ruleTaskProperties EOF ;
    public final EObject entryRuleTaskProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskProperties = null;


        try {
            // InternalShipyardV4.g:2321:55: (iv_ruleTaskProperties= ruleTaskProperties EOF )
            // InternalShipyardV4.g:2322:2: iv_ruleTaskProperties= ruleTaskProperties EOF
            {
             newCompositeNode(grammarAccess.getTaskPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskProperties=ruleTaskProperties();

            state._fsp--;

             current =iv_ruleTaskProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskProperties"


    // $ANTLR start "ruleTaskProperties"
    // InternalShipyardV4.g:2328:1: ruleTaskProperties returns [EObject current=null] : ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_properties_4_0= ruleTaskPropertiesPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleTaskProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_properties_4_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2334:2: ( ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_properties_4_0= ruleTaskPropertiesPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract ) ) )* )? otherlv_7= '}' ) )
            // InternalShipyardV4.g:2335:2: ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_properties_4_0= ruleTaskPropertiesPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract ) ) )* )? otherlv_7= '}' )
            {
            // InternalShipyardV4.g:2335:2: ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_properties_4_0= ruleTaskPropertiesPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract ) ) )* )? otherlv_7= '}' )
            // InternalShipyardV4.g:2336:3: () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_properties_4_0= ruleTaskPropertiesPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract ) ) )* )? otherlv_7= '}'
            {
            // InternalShipyardV4.g:2336:3: ()
            // InternalShipyardV4.g:2337:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskPropertiesAccess().getTaskPropertiesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskPropertiesAccess().getPropertiesKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskPropertiesAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskPropertiesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalShipyardV4.g:2355:3: ( ( (lv_properties_4_0= ruleTaskPropertiesPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalShipyardV4.g:2356:4: ( (lv_properties_4_0= ruleTaskPropertiesPropertiesAbstract ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract ) ) )*
                    {
                    // InternalShipyardV4.g:2356:4: ( (lv_properties_4_0= ruleTaskPropertiesPropertiesAbstract ) )
                    // InternalShipyardV4.g:2357:5: (lv_properties_4_0= ruleTaskPropertiesPropertiesAbstract )
                    {
                    // InternalShipyardV4.g:2357:5: (lv_properties_4_0= ruleTaskPropertiesPropertiesAbstract )
                    // InternalShipyardV4.g:2358:6: lv_properties_4_0= ruleTaskPropertiesPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getTaskPropertiesAccess().getPropertiesTaskPropertiesPropertiesAbstractParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_properties_4_0=ruleTaskPropertiesPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskPropertiesRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_4_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.TaskPropertiesPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:2375:4: (otherlv_5= ',' ( (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==12) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalShipyardV4.g:2376:5: otherlv_5= ',' ( (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTaskPropertiesAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalShipyardV4.g:2380:5: ( (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract ) )
                    	    // InternalShipyardV4.g:2381:6: (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract )
                    	    {
                    	    // InternalShipyardV4.g:2381:6: (lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract )
                    	    // InternalShipyardV4.g:2382:7: lv_properties_6_0= ruleTaskPropertiesPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskPropertiesAccess().getPropertiesTaskPropertiesPropertiesAbstractParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_properties_6_0=ruleTaskPropertiesPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskPropertiesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_6_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.TaskPropertiesPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskPropertiesAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskProperties"


    // $ANTLR start "entryRuleTaskPropertiesAdditionalProperties"
    // InternalShipyardV4.g:2409:1: entryRuleTaskPropertiesAdditionalProperties returns [EObject current=null] : iv_ruleTaskPropertiesAdditionalProperties= ruleTaskPropertiesAdditionalProperties EOF ;
    public final EObject entryRuleTaskPropertiesAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskPropertiesAdditionalProperties = null;


        try {
            // InternalShipyardV4.g:2409:75: (iv_ruleTaskPropertiesAdditionalProperties= ruleTaskPropertiesAdditionalProperties EOF )
            // InternalShipyardV4.g:2410:2: iv_ruleTaskPropertiesAdditionalProperties= ruleTaskPropertiesAdditionalProperties EOF
            {
             newCompositeNode(grammarAccess.getTaskPropertiesAdditionalPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskPropertiesAdditionalProperties=ruleTaskPropertiesAdditionalProperties();

            state._fsp--;

             current =iv_ruleTaskPropertiesAdditionalProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskPropertiesAdditionalProperties"


    // $ANTLR start "ruleTaskPropertiesAdditionalProperties"
    // InternalShipyardV4.g:2416:1: ruleTaskPropertiesAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleTaskPropertiesAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2422:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalShipyardV4.g:2423:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalShipyardV4.g:2423:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalShipyardV4.g:2424:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalShipyardV4.g:2424:3: ( (lv_key_0_0= ruleEString ) )
            // InternalShipyardV4.g:2425:4: (lv_key_0_0= ruleEString )
            {
            // InternalShipyardV4.g:2425:4: (lv_key_0_0= ruleEString )
            // InternalShipyardV4.g:2426:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskPropertiesAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskPropertiesAdditionalPropertiesRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskPropertiesAdditionalPropertiesAccess().getColonKeyword_1());
            		
            // InternalShipyardV4.g:2447:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalShipyardV4.g:2448:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalShipyardV4.g:2448:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalShipyardV4.g:2449:5: lv_additionalProperties_2_0= ruleJsonDocument
            {

            					newCompositeNode(grammarAccess.getTaskPropertiesAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskPropertiesAdditionalPropertiesRule());
            					}
            					set(
            						current,
            						"additionalProperties",
            						lv_additionalProperties_2_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.JsonDocument");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskPropertiesAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalShipyardV4.g:2470:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalShipyardV4.g:2470:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalShipyardV4.g:2471:2: iv_ruleJsonDocument= ruleJsonDocument EOF
            {
             newCompositeNode(grammarAccess.getJsonDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonDocument=ruleJsonDocument();

            state._fsp--;

             current =iv_ruleJsonDocument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonDocument"


    // $ANTLR start "ruleJsonDocument"
    // InternalShipyardV4.g:2477:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2483:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalShipyardV4.g:2484:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalShipyardV4.g:2484:2: ( (lv_value_0_0= ruleValue ) )
            // InternalShipyardV4.g:2485:3: (lv_value_0_0= ruleValue )
            {
            // InternalShipyardV4.g:2485:3: (lv_value_0_0= ruleValue )
            // InternalShipyardV4.g:2486:4: lv_value_0_0= ruleValue
            {

            				newCompositeNode(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJsonDocumentRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.shipyardV4.ShipyardV4.Value");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonDocument"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalShipyardV4.g:2506:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalShipyardV4.g:2506:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalShipyardV4.g:2507:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalShipyardV4.g:2513:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2519:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalShipyardV4.g:2520:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalShipyardV4.g:2520:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalShipyardV4.g:2521:3: (lv_value_0_0= ruleEInt )
            {
            // InternalShipyardV4.g:2521:3: (lv_value_0_0= ruleEInt )
            // InternalShipyardV4.g:2522:4: lv_value_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.shipyardV4.ShipyardV4.EInt");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalShipyardV4.g:2542:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalShipyardV4.g:2542:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalShipyardV4.g:2543:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalShipyardV4.g:2549:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= 'value' ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalShipyardV4.g:2555:2: ( ( (lv_value_0_0= 'value' ) ) )
            // InternalShipyardV4.g:2556:2: ( (lv_value_0_0= 'value' ) )
            {
            // InternalShipyardV4.g:2556:2: ( (lv_value_0_0= 'value' ) )
            // InternalShipyardV4.g:2557:3: (lv_value_0_0= 'value' )
            {
            // InternalShipyardV4.g:2557:3: (lv_value_0_0= 'value' )
            // InternalShipyardV4.g:2558:4: lv_value_0_0= 'value'
            {
            lv_value_0_0=(Token)match(input,30,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBooleanValueAccess().getValueValueKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanValueRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0 != null, "value");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalShipyardV4.g:2573:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalShipyardV4.g:2573:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalShipyardV4.g:2574:2: iv_ruleNullValue= ruleNullValue EOF
            {
             newCompositeNode(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;

             current =iv_ruleNullValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalShipyardV4.g:2580:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2586:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalShipyardV4.g:2587:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalShipyardV4.g:2587:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalShipyardV4.g:2588:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalShipyardV4.g:2588:3: (lv_value_0_0= ruleNullEnum )
            // InternalShipyardV4.g:2589:4: lv_value_0_0= ruleNullEnum
            {

            				newCompositeNode(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNullEnum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNullValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.shipyardV4.ShipyardV4.NullEnum");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalShipyardV4.g:2609:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalShipyardV4.g:2609:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalShipyardV4.g:2610:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalShipyardV4.g:2616:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2622:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalShipyardV4.g:2623:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalShipyardV4.g:2623:2: ( (lv_value_0_0= ruleEString ) )
            // InternalShipyardV4.g:2624:3: (lv_value_0_0= ruleEString )
            {
            // InternalShipyardV4.g:2624:3: (lv_value_0_0= ruleEString )
            // InternalShipyardV4.g:2625:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.shipyardV4.ShipyardV4.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalShipyardV4.g:2645:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalShipyardV4.g:2645:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalShipyardV4.g:2646:2: iv_ruleObjectValue= ruleObjectValue EOF
            {
             newCompositeNode(grammarAccess.getObjectValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectValue=ruleObjectValue();

            state._fsp--;

             current =iv_ruleObjectValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalShipyardV4.g:2652:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2658:2: ( ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' ) )
            // InternalShipyardV4.g:2659:2: ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' )
            {
            // InternalShipyardV4.g:2659:2: ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' )
            // InternalShipyardV4.g:2660:3: () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}'
            {
            // InternalShipyardV4.g:2660:3: ()
            // InternalShipyardV4.g:2661:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalShipyardV4.g:2671:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalShipyardV4.g:2672:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalShipyardV4.g:2672:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalShipyardV4.g:2673:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalShipyardV4.g:2673:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalShipyardV4.g:2674:6: lv_keyvaluepair_2_0= ruleKeyValuePair
                    {

                    						newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_keyvaluepair_2_0=ruleKeyValuePair();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    						}
                    						add(
                    							current,
                    							"keyvaluepair",
                    							lv_keyvaluepair_2_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.KeyValuePair");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:2691:4: (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==12) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalShipyardV4.g:2692:5: otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_7); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalShipyardV4.g:2696:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalShipyardV4.g:2697:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalShipyardV4.g:2697:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalShipyardV4.g:2698:7: lv_keyvaluepair_4_0= ruleKeyValuePair
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_keyvaluepair_4_0=ruleKeyValuePair();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"keyvaluepair",
                    	    								lv_keyvaluepair_4_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.KeyValuePair");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalShipyardV4.g:2725:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalShipyardV4.g:2725:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalShipyardV4.g:2726:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalShipyardV4.g:2732:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2738:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalShipyardV4.g:2739:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalShipyardV4.g:2739:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalShipyardV4.g:2740:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalShipyardV4.g:2740:3: (lv_value_0_0= ruleEDouble )
            // InternalShipyardV4.g:2741:4: lv_value_0_0= ruleEDouble
            {

            				newCompositeNode(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEDouble();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.shipyardV4.ShipyardV4.EDouble");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleArrayValue"
    // InternalShipyardV4.g:2761:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalShipyardV4.g:2761:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalShipyardV4.g:2762:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
             newCompositeNode(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;

             current =iv_ruleArrayValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalShipyardV4.g:2768:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2774:2: ( ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' ) )
            // InternalShipyardV4.g:2775:2: ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalShipyardV4.g:2775:2: ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' )
            // InternalShipyardV4.g:2776:3: () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']'
            {
            // InternalShipyardV4.g:2776:3: ()
            // InternalShipyardV4.g:2777:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalShipyardV4.g:2787:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_INT)||LA39_0==11||LA39_0==21||(LA39_0>=30 && LA39_0<=32)||LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalShipyardV4.g:2788:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalShipyardV4.g:2788:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalShipyardV4.g:2789:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalShipyardV4.g:2789:5: (lv_value_2_0= ruleValue )
                    // InternalShipyardV4.g:2790:6: lv_value_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"at.jku.bise.shipyardV4.ShipyardV4.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShipyardV4.g:2807:4: (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==12) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalShipyardV4.g:2808:5: otherlv_3= ',' ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_27); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalShipyardV4.g:2812:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalShipyardV4.g:2813:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalShipyardV4.g:2813:6: (lv_value_4_0= ruleValue )
                    	    // InternalShipyardV4.g:2814:7: lv_value_4_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_value_4_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_4_0,
                    	    								"at.jku.bise.shipyardV4.ShipyardV4.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleEInt"
    // InternalShipyardV4.g:2841:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalShipyardV4.g:2841:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalShipyardV4.g:2842:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalShipyardV4.g:2848:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalShipyardV4.g:2854:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalShipyardV4.g:2855:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalShipyardV4.g:2855:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalShipyardV4.g:2856:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalShipyardV4.g:2856:3: (kw= '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalShipyardV4.g:2857:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalShipyardV4.g:2874:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalShipyardV4.g:2874:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalShipyardV4.g:2875:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getKeyValuePairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyValuePair=ruleKeyValuePair();

            state._fsp--;

             current =iv_ruleKeyValuePair; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyValuePair"


    // $ANTLR start "ruleKeyValuePair"
    // InternalShipyardV4.g:2881:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalShipyardV4.g:2887:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalShipyardV4.g:2888:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalShipyardV4.g:2888:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalShipyardV4.g:2889:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalShipyardV4.g:2889:3: ( (lv_key_0_0= ruleEString ) )
            // InternalShipyardV4.g:2890:4: (lv_key_0_0= ruleEString )
            {
            // InternalShipyardV4.g:2890:4: (lv_key_0_0= ruleEString )
            // InternalShipyardV4.g:2891:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
            		
            // InternalShipyardV4.g:2912:3: ( (lv_value_2_0= ruleValue ) )
            // InternalShipyardV4.g:2913:4: (lv_value_2_0= ruleValue )
            {
            // InternalShipyardV4.g:2913:4: (lv_value_2_0= ruleValue )
            // InternalShipyardV4.g:2914:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"at.jku.bise.shipyardV4.ShipyardV4.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "entryRuleEDouble"
    // InternalShipyardV4.g:2935:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalShipyardV4.g:2935:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalShipyardV4.g:2936:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalShipyardV4.g:2942:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalShipyardV4.g:2948:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalShipyardV4.g:2949:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalShipyardV4.g:2949:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalShipyardV4.g:2950:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalShipyardV4.g:2950:3: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalShipyardV4.g:2951:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalShipyardV4.g:2957:3: (this_INT_1= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalShipyardV4.g:2958:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_31); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_32); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalShipyardV4.g:2978:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=33 && LA45_0<=34)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalShipyardV4.g:2979:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalShipyardV4.g:2979:4: (kw= 'E' | kw= 'e' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==33) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==34) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalShipyardV4.g:2980:5: kw= 'E'
                            {
                            kw=(Token)match(input,33,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalShipyardV4.g:2986:5: kw= 'e'
                            {
                            kw=(Token)match(input,34,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalShipyardV4.g:2992:4: (kw= '-' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==31) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalShipyardV4.g:2993:5: kw= '-'
                            {
                            kw=(Token)match(input,31,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleNullEnum"
    // InternalShipyardV4.g:3011:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= 'null' ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalShipyardV4.g:3017:2: ( (enumLiteral_0= 'null' ) )
            // InternalShipyardV4.g:3018:2: (enumLiteral_0= 'null' )
            {
            // InternalShipyardV4.g:3018:2: (enumLiteral_0= 'null' )
            // InternalShipyardV4.g:3019:3: enumLiteral_0= 'null'
            {
            enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

            			current = grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullEnum"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\11\7\uffff";
    static final String dfa_3s = "\1\4\1\6\1\14\7\uffff";
    static final String dfa_4s = "\1\43\2\40\7\uffff";
    static final String dfa_5s = "\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\2\5\1\2\4\uffff\1\6\11\uffff\1\10\10\uffff\1\3\1\1\1\7\2\uffff\1\4",
            "\1\2\31\uffff\1\7",
            "\2\11\10\uffff\1\11\11\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "447:2: (this_IntegerValue_0= ruleIntegerValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_StringValue_3= ruleStringValue | this_ObjectValue_4= ruleObjectValue | this_NumberValue_5= ruleNumberValue | this_ArrayValue_6= ruleArrayValue )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000882000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003082000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020082000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000009C0200870L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000009C0600870L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000040L});

}