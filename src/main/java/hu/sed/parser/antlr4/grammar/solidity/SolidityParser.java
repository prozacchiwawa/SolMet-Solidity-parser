// Generated from Solidity.g4 by ANTLR 4.7.2
package hu.sed.parser.antlr4.grammar.solidity;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, Int=98, Uint=99, Byte=100, Fixed=101, Ufixed=102, 
		BooleanLiteral=103, DecimalNumber=104, HexNumber=105, NumberUnit=106, 
		HexLiteralFragment=107, ReservedKeyword=108, AnonymousKeyword=109, BreakKeyword=110, 
		ConstantKeyword=111, ImmutableKeyword=112, ContinueKeyword=113, LeaveKeyword=114, 
		ExternalKeyword=115, IndexedKeyword=116, InternalKeyword=117, PayableKeyword=118, 
		PrivateKeyword=119, PublicKeyword=120, VirtualKeyword=121, PureKeyword=122, 
		TypeKeyword=123, ViewKeyword=124, ConstructorKeyword=125, FallbackKeyword=126, 
		ReceiveKeyword=127, Identifier=128, StringLiteralFragment=129, VersionLiteral=130, 
		WS=131, COMMENT=132, LINE_COMMENT=133;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_pragmaName = 2, RULE_pragmaValue = 3, 
		RULE_version = 4, RULE_versionOperator = 5, RULE_versionConstraint = 6, 
		RULE_importDeclaration = 7, RULE_importDirective = 8, RULE_importPath = 9, 
		RULE_contractDefinition = 10, RULE_inheritanceSpecifier = 11, RULE_contractPart = 12, 
		RULE_stateVariableDeclaration = 13, RULE_fileLevelConstant = 14, RULE_customErrorDefinition = 15, 
		RULE_typeDefinition = 16, RULE_usingForDeclaration = 17, RULE_structDefinition = 18, 
		RULE_modifierDefinition = 19, RULE_modifierInvocation = 20, RULE_functionDefinition = 21, 
		RULE_functionDescriptor = 22, RULE_returnParameters = 23, RULE_modifierList = 24, 
		RULE_eventDefinition = 25, RULE_enumValue = 26, RULE_enumDefinition = 27, 
		RULE_parameterList = 28, RULE_parameter = 29, RULE_eventParameterList = 30, 
		RULE_eventParameter = 31, RULE_functionTypeParameterList = 32, RULE_functionTypeParameter = 33, 
		RULE_variableDeclaration = 34, RULE_typeName = 35, RULE_userDefinedTypeName = 36, 
		RULE_mappingKey = 37, RULE_mapping = 38, RULE_functionTypeName = 39, RULE_storageLocation = 40, 
		RULE_stateMutability = 41, RULE_block = 42, RULE_statement = 43, RULE_expressionStatement = 44, 
		RULE_ifStatement = 45, RULE_tryStatement = 46, RULE_catchClause = 47, 
		RULE_whileStatement = 48, RULE_simpleStatement = 49, RULE_uncheckedStatement = 50, 
		RULE_forStatement = 51, RULE_inlineAssemblyStatement = 52, RULE_doWhileStatement = 53, 
		RULE_continueStatement = 54, RULE_breakStatement = 55, RULE_returnStatement = 56, 
		RULE_throwStatement = 57, RULE_emitStatement = 58, RULE_revertStatement = 59, 
		RULE_variableDeclarationStatement = 60, RULE_variableDeclarationList = 61, 
		RULE_identifierList = 62, RULE_elementaryTypeName = 63, RULE_expression = 64, 
		RULE_primaryExpression = 65, RULE_expressionList = 66, RULE_nameValueList = 67, 
		RULE_nameValue = 68, RULE_functionCallArguments = 69, RULE_functionCall = 70, 
		RULE_assemblyBlock = 71, RULE_assemblyItem = 72, RULE_assemblyExpression = 73, 
		RULE_assemblyMember = 74, RULE_assemblyCall = 75, RULE_assemblyLocalDefinition = 76, 
		RULE_assemblyAssignment = 77, RULE_assemblyIdentifierOrList = 78, RULE_assemblyIdentifierList = 79, 
		RULE_assemblyStackAssignment = 80, RULE_labelDefinition = 81, RULE_assemblySwitch = 82, 
		RULE_assemblyCase = 83, RULE_assemblyFunctionDefinition = 84, RULE_assemblyFunctionReturns = 85, 
		RULE_assemblyFor = 86, RULE_assemblyIf = 87, RULE_assemblyLiteral = 88, 
		RULE_subAssembly = 89, RULE_tupleExpression = 90, RULE_typeNameExpression = 91, 
		RULE_numberLiteral = 92, RULE_identifier = 93, RULE_hexLiteral = 94, RULE_overrideSpecifier = 95, 
		RULE_stringLiteral = 96;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "pragmaName", "pragmaValue", "version", 
			"versionOperator", "versionConstraint", "importDeclaration", "importDirective", 
			"importPath", "contractDefinition", "inheritanceSpecifier", "contractPart", 
			"stateVariableDeclaration", "fileLevelConstant", "customErrorDefinition", 
			"typeDefinition", "usingForDeclaration", "structDefinition", "modifierDefinition", 
			"modifierInvocation", "functionDefinition", "functionDescriptor", "returnParameters", 
			"modifierList", "eventDefinition", "enumValue", "enumDefinition", "parameterList", 
			"parameter", "eventParameterList", "eventParameter", "functionTypeParameterList", 
			"functionTypeParameter", "variableDeclaration", "typeName", "userDefinedTypeName", 
			"mappingKey", "mapping", "functionTypeName", "storageLocation", "stateMutability", 
			"block", "statement", "expressionStatement", "ifStatement", "tryStatement", 
			"catchClause", "whileStatement", "simpleStatement", "uncheckedStatement", 
			"forStatement", "inlineAssemblyStatement", "doWhileStatement", "continueStatement", 
			"breakStatement", "returnStatement", "throwStatement", "emitStatement", 
			"revertStatement", "variableDeclarationStatement", "variableDeclarationList", 
			"identifierList", "elementaryTypeName", "expression", "primaryExpression", 
			"expressionList", "nameValueList", "nameValue", "functionCallArguments", 
			"functionCall", "assemblyBlock", "assemblyItem", "assemblyExpression", 
			"assemblyMember", "assemblyCall", "assemblyLocalDefinition", "assemblyAssignment", 
			"assemblyIdentifierOrList", "assemblyIdentifierList", "assemblyStackAssignment", 
			"labelDefinition", "assemblySwitch", "assemblyCase", "assemblyFunctionDefinition", 
			"assemblyFunctionReturns", "assemblyFor", "assemblyIf", "assemblyLiteral", 
			"subAssembly", "tupleExpression", "typeNameExpression", "numberLiteral", 
			"identifier", "hexLiteral", "overrideSpecifier", "stringLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "';'", "'||'", "'^'", "'~'", "'>='", "'>'", "'<'", 
			"'<='", "'='", "'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", 
			"'abstract'", "'contract'", "'interface'", "'library'", "'is'", "'('", 
			"')'", "'error'", "'using'", "'for'", "'struct'", "'modifier'", "'function'", 
			"'returns'", "'event'", "'enum'", "'['", "']'", "'address'", "'.'", "'mapping'", 
			"'=>'", "'memory'", "'storage'", "'calldata'", "'if'", "'else'", "'try'", 
			"'catch'", "'while'", "'unchecked'", "'assembly'", "'do'", "'return'", 
			"'throw'", "'emit'", "'revert'", "'var'", "'bool'", "'string'", "'byte'", 
			"'++'", "'--'", "'new'", "':'", "'+'", "'-'", "'after'", "'delete'", 
			"'!'", "'**'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'=='", "'!='", 
			"'&&'", "'?'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'let'", "':='", "'=:'", "'switch'", "'case'", 
			"'default'", "'->'", "'callback'", "'override'", null, null, null, null, 
			null, null, null, null, null, null, null, "'anonymous'", "'break'", "'constant'", 
			"'immutable'", "'continue'", "'leave'", "'external'", "'indexed'", "'internal'", 
			"'payable'", "'private'", "'public'", "'virtual'", "'pure'", "'type'", 
			"'view'", "'constructor'", "'fallback'", "'receive'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Int", "Uint", "Byte", "Fixed", "Ufixed", "BooleanLiteral", 
			"DecimalNumber", "HexNumber", "NumberUnit", "HexLiteralFragment", "ReservedKeyword", 
			"AnonymousKeyword", "BreakKeyword", "ConstantKeyword", "ImmutableKeyword", 
			"ContinueKeyword", "LeaveKeyword", "ExternalKeyword", "IndexedKeyword", 
			"InternalKeyword", "PayableKeyword", "PrivateKeyword", "PublicKeyword", 
			"VirtualKeyword", "PureKeyword", "TypeKeyword", "ViewKeyword", "ConstructorKeyword", 
			"FallbackKeyword", "ReceiveKeyword", "Identifier", "StringLiteralFragment", 
			"VersionLiteral", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<FileLevelConstantContext> fileLevelConstant() {
			return getRuleContexts(FileLevelConstantContext.class);
		}
		public FileLevelConstantContext fileLevelConstant(int i) {
			return getRuleContext(FileLevelConstantContext.class,i);
		}
		public List<CustomErrorDefinitionContext> customErrorDefinition() {
			return getRuleContexts(CustomErrorDefinitionContext.class);
		}
		public CustomErrorDefinitionContext customErrorDefinition(int i) {
			return getRuleContext(CustomErrorDefinitionContext.class,i);
		}
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSourceUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__11) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__27) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__41) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (FallbackKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(194);
					pragmaDirective();
					}
					break;
				case 2:
					{
					setState(195);
					importDirective();
					}
					break;
				case 3:
					{
					setState(196);
					contractDefinition();
					}
					break;
				case 4:
					{
					setState(197);
					enumDefinition();
					}
					break;
				case 5:
					{
					setState(198);
					structDefinition();
					}
					break;
				case 6:
					{
					setState(199);
					functionDefinition();
					}
					break;
				case 7:
					{
					setState(200);
					fileLevelConstant();
					}
					break;
				case 8:
					{
					setState(201);
					customErrorDefinition();
					}
					break;
				case 9:
					{
					setState(202);
					typeDefinition();
					}
					break;
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaValueContext pragmaValue() {
			return getRuleContext(PragmaValueContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__0);
			setState(211);
			pragmaName();
			setState(212);
			pragmaValue();
			setState(213);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaValueContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PragmaValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPragmaValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaValueContext pragmaValue() throws RecognitionException {
		PragmaValueContext _localctx = new PragmaValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pragmaValue);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionContext extends ParserRuleContext {
		public List<VersionConstraintContext> versionConstraint() {
			return getRuleContexts(VersionConstraintContext.class);
		}
		public VersionConstraintContext versionConstraint(int i) {
			return getRuleContext(VersionConstraintContext.class,i);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			versionConstraint();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==DecimalNumber || _la==VersionLiteral) {
				{
				{
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(222);
					match(T__2);
					}
				}

				setState(225);
				versionConstraint();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionOperatorContext extends ParserRuleContext {
		public VersionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVersionConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_versionConstraint);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					setState(233);
					versionOperator();
					}
				}

				setState(236);
				match(VersionLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					setState(237);
					versionOperator();
					}
				}

				setState(240);
				match(DecimalNumber);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			identifier();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(244);
				match(T__10);
				setState(245);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDirectiveContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDirective);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__11);
				setState(249);
				importPath();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(250);
					match(T__10);
					setState(251);
					identifier();
					}
				}

				setState(254);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(T__11);
				setState(259);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(257);
					match(T__12);
					}
					break;
				case T__13:
				case T__24:
				case T__41:
				case T__53:
				case T__95:
				case LeaveKeyword:
				case PayableKeyword:
				case ConstructorKeyword:
				case ReceiveKeyword:
				case Identifier:
					{
					setState(258);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(261);
					match(T__10);
					setState(262);
					identifier();
					}
				}

				setState(265);
				match(T__13);
				setState(266);
				importPath();
				setState(267);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(T__11);
				setState(270);
				match(T__14);
				setState(271);
				importDeclaration();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(272);
					match(T__15);
					setState(273);
					importDeclaration();
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(279);
				match(T__16);
				setState(280);
				match(T__13);
				setState(281);
				importPath();
				setState(282);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathContext extends ParserRuleContext {
		public TerminalNode StringLiteralFragment() { return getToken(SolidityParser.StringLiteralFragment, 0); }
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitImportPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(StringLiteralFragment);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(288);
				match(T__17);
				}
			}

			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
			identifier();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(293);
				match(T__21);
				setState(294);
				inheritanceSpecifier();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(295);
					match(T__15);
					setState(296);
					inheritanceSpecifier();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(304);
			match(T__14);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__41) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (FallbackKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				{
				setState(305);
				contractPart();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInheritanceSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInheritanceSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			userDefinedTypeName();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(314);
				match(T__22);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
					{
					setState(315);
					expressionList();
					}
				}

				setState(318);
				match(T__23);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractPartContext extends ParserRuleContext {
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public CustomErrorDefinitionContext customErrorDefinition() {
			return getRuleContext(CustomErrorDefinitionContext.class,0);
		}
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContractPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_contractPart);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				modifierDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				functionDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				eventDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				enumDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(328);
				customErrorDefinition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(329);
				typeDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<TerminalNode> ImmutableKeyword() { return getTokens(SolidityParser.ImmutableKeyword); }
		public TerminalNode ImmutableKeyword(int i) {
			return getToken(SolidityParser.ImmutableKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStateVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			typeName(0);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (T__96 - 97)) | (1L << (ConstantKeyword - 97)) | (1L << (ImmutableKeyword - 97)) | (1L << (InternalKeyword - 97)) | (1L << (PrivateKeyword - 97)) | (1L << (PublicKeyword - 97)))) != 0)) {
				{
				setState(339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PublicKeyword:
					{
					setState(333);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(334);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(335);
					match(PrivateKeyword);
					}
					break;
				case ConstantKeyword:
					{
					setState(336);
					match(ConstantKeyword);
					}
					break;
				case ImmutableKeyword:
					{
					setState(337);
					match(ImmutableKeyword);
					}
					break;
				case T__96:
					{
					setState(338);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			identifier();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(345);
				match(T__9);
				setState(346);
				expression(0);
				}
			}

			setState(349);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileLevelConstantContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FileLevelConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileLevelConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFileLevelConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFileLevelConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFileLevelConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileLevelConstantContext fileLevelConstant() throws RecognitionException {
		FileLevelConstantContext _localctx = new FileLevelConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fileLevelConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			typeName(0);
			setState(352);
			match(ConstantKeyword);
			setState(353);
			identifier();
			setState(354);
			match(T__9);
			setState(355);
			expression(0);
			setState(356);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomErrorDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CustomErrorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customErrorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCustomErrorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCustomErrorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitCustomErrorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomErrorDefinitionContext customErrorDefinition() throws RecognitionException {
		CustomErrorDefinitionContext _localctx = new CustomErrorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_customErrorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__24);
			setState(359);
			identifier();
			setState(360);
			parameterList();
			setState(361);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(TypeKeyword);
			setState(364);
			identifier();
			setState(365);
			match(T__21);
			setState(366);
			elementaryTypeName();
			setState(367);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingForDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUsingForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__25);
			setState(370);
			identifier();
			setState(371);
			match(T__26);
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(372);
				match(T__12);
				}
				break;
			case T__13:
			case T__24:
			case T__29:
			case T__35:
			case T__37:
			case T__41:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__95:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case LeaveKeyword:
			case PayableKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
				{
				setState(373);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(376);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__27);
			setState(379);
			identifier();
			setState(380);
			match(T__14);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__29) | (1L << T__35) | (1L << T__37) | (1L << T__41) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(381);
				variableDeclaration();
				setState(382);
				match(T__1);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__29) | (1L << T__35) | (1L << T__37) | (1L << T__41) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
					{
					{
					setState(383);
					variableDeclaration();
					setState(384);
					match(T__1);
					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(393);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<TerminalNode> VirtualKeyword() { return getTokens(SolidityParser.VirtualKeyword); }
		public TerminalNode VirtualKeyword(int i) {
			return getToken(SolidityParser.VirtualKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__28);
			setState(396);
			identifier();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(397);
				parameterList();
				}
			}

			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__96 || _la==VirtualKeyword) {
				{
				setState(402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VirtualKeyword:
					{
					setState(400);
					match(VirtualKeyword);
					}
					break;
				case T__96:
					{
					setState(401);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(407);
				match(T__1);
				}
				break;
			case T__14:
				{
				setState(408);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			identifier();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(412);
				match(T__22);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
					{
					setState(413);
					expressionList();
					}
				}

				setState(416);
				match(T__23);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDescriptorContext functionDescriptor() {
			return getRuleContext(FunctionDescriptorContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			functionDescriptor();
			setState(420);
			parameterList();
			setState(421);
			modifierList();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(422);
				returnParameters();
				}
			}

			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(425);
				match(T__1);
				}
				break;
			case T__14:
				{
				setState(426);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDescriptorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ConstructorKeyword() { return getToken(SolidityParser.ConstructorKeyword, 0); }
		public TerminalNode FallbackKeyword() { return getToken(SolidityParser.FallbackKeyword, 0); }
		public TerminalNode ReceiveKeyword() { return getToken(SolidityParser.ReceiveKeyword, 0); }
		public FunctionDescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDescriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDescriptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionDescriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDescriptorContext functionDescriptor() throws RecognitionException {
		FunctionDescriptorContext _localctx = new FunctionDescriptorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionDescriptor);
		int _la;
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(T__29);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
					{
					setState(430);
					identifier();
					}
				}

				}
				break;
			case ConstructorKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(ConstructorKeyword);
				}
				break;
			case FallbackKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(FallbackKeyword);
				}
				break;
			case ReceiveKeyword:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(ReceiveKeyword);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReturnParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__30);
			setState(439);
			parameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierListContext extends ParserRuleContext {
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> VirtualKeyword() { return getTokens(SolidityParser.VirtualKeyword); }
		public TerminalNode VirtualKeyword(int i) {
			return getToken(SolidityParser.VirtualKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (T__96 - 96)) | (1L << (ConstantKeyword - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (ExternalKeyword - 96)) | (1L << (InternalKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (PrivateKeyword - 96)) | (1L << (PublicKeyword - 96)) | (1L << (VirtualKeyword - 96)) | (1L << (PureKeyword - 96)) | (1L << (ViewKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(441);
					match(ExternalKeyword);
					}
					break;
				case 2:
					{
					setState(442);
					match(PublicKeyword);
					}
					break;
				case 3:
					{
					setState(443);
					match(InternalKeyword);
					}
					break;
				case 4:
					{
					setState(444);
					match(PrivateKeyword);
					}
					break;
				case 5:
					{
					setState(445);
					match(VirtualKeyword);
					}
					break;
				case 6:
					{
					setState(446);
					stateMutability();
					}
					break;
				case 7:
					{
					setState(447);
					modifierInvocation();
					}
					break;
				case 8:
					{
					setState(448);
					overrideSpecifier();
					}
					break;
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__31);
			setState(455);
			identifier();
			setState(456);
			eventParameterList();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(457);
				match(AnonymousKeyword);
				}
			}

			setState(460);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEnumDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(T__32);
			setState(465);
			identifier();
			setState(466);
			match(T__14);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(467);
				enumValue();
				}
			}

			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(470);
				match(T__15);
				setState(471);
				enumValue();
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(T__22);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__29) | (1L << T__35) | (1L << T__37) | (1L << T__41) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(480);
				parameter();
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(481);
					match(T__15);
					setState(482);
					parameter();
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(490);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			typeName(0);
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(493);
				storageLocation();
				}
				break;
			}
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(496);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__22);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__29) | (1L << T__35) | (1L << T__37) | (1L << T__41) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(500);
				eventParameter();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(501);
					match(T__15);
					setState(502);
					eventParameter();
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(510);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEventParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			typeName(0);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(513);
				match(IndexedKeyword);
				}
			}

			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(516);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeParameterListContext extends ParserRuleContext {
		public List<FunctionTypeParameterContext> functionTypeParameter() {
			return getRuleContexts(FunctionTypeParameterContext.class);
		}
		public FunctionTypeParameterContext functionTypeParameter(int i) {
			return getRuleContext(FunctionTypeParameterContext.class,i);
		}
		public FunctionTypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(T__22);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__29) | (1L << T__35) | (1L << T__37) | (1L << T__41) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(520);
				functionTypeParameter();
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(521);
					match(T__15);
					setState(522);
					functionTypeParameter();
					}
					}
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(530);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public FunctionTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			typeName(0);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(533);
				storageLocation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			typeName(0);
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(537);
				storageLocation();
				}
				break;
			}
			setState(540);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(543);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(544);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(545);
				mapping();
				}
				break;
			case 4:
				{
				setState(546);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(547);
				match(T__35);
				setState(548);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(551);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(552);
					match(T__33);
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
						{
						setState(553);
						expression(0);
						}
					}

					setState(556);
					match(T__34);
					}
					} 
				}
				setState(561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUserDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUserDefinedTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUserDefinedTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			identifier();
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					match(T__36);
					setState(564);
					identifier();
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingKeyContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMappingKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMappingKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMappingKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingKeyContext mappingKey() throws RecognitionException {
		MappingKeyContext _localctx = new MappingKeyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mappingKey);
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				elementaryTypeName();
				}
				break;
			case T__13:
			case T__24:
			case T__41:
			case T__53:
			case T__95:
			case LeaveKeyword:
			case PayableKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				userDefinedTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingContext extends ParserRuleContext {
		public MappingKeyContext mappingKey() {
			return getRuleContext(MappingKeyContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitMapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(T__37);
			setState(575);
			match(T__22);
			setState(576);
			mappingKey();
			setState(577);
			match(T__38);
			setState(578);
			typeName(0);
			setState(579);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T__29);
			setState(582);
			functionTypeParameterList();
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(586);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(583);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(584);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(585);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(591);
				match(T__30);
				setState(592);
				functionTypeParameterList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStorageLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStorageLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStorageLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateMutability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStateMutability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (ConstantKeyword - 111)) | (1L << (PayableKeyword - 111)) | (1L << (PureKeyword - 111)) | (1L << (ViewKeyword - 111)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(T__14);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__26 - 5)) | (1L << (T__29 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__37 - 5)) | (1L << (T__41 - 5)) | (1L << (T__42 - 5)) | (1L << (T__44 - 5)) | (1L << (T__46 - 5)) | (1L << (T__47 - 5)) | (1L << (T__48 - 5)) | (1L << (T__49 - 5)) | (1L << (T__50 - 5)) | (1L << (T__51 - 5)) | (1L << (T__52 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (BreakKeyword - 96)) | (1L << (ContinueKeyword - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
				{
				{
				setState(600);
				statement();
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public UncheckedStatementContext uncheckedStatement() {
			return getRuleContext(UncheckedStatementContext.class,0);
		}
		public RevertStatementContext revertStatement() {
			return getRuleContext(RevertStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_statement);
		try {
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				tryStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(611);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(612);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(613);
				inlineAssemblyStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(614);
				doWhileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(615);
				continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(616);
				breakStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(617);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(618);
				throwStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(619);
				emitStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(620);
				simpleStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(621);
				uncheckedStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(622);
				revertStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			expression(0);
			setState(626);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(T__42);
			setState(629);
			match(T__22);
			setState(630);
			expression(0);
			setState(631);
			match(T__23);
			setState(632);
			statement();
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(633);
				match(T__43);
				setState(634);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(T__44);
			setState(638);
			expression(0);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(639);
				returnParameters();
				}
			}

			setState(642);
			block();
			setState(644); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(643);
				catchClause();
				}
				}
				setState(646); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__45 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(T__45);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__22) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
					{
					setState(649);
					identifier();
					}
				}

				setState(652);
				parameterList();
				}
			}

			setState(655);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(T__46);
			setState(658);
			match(T__22);
			setState(659);
			expression(0);
			setState(660);
			match(T__23);
			setState(661);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(663);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(664);
				expressionStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UncheckedStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncheckedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUncheckedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUncheckedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitUncheckedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UncheckedStatementContext uncheckedStatement() throws RecognitionException {
		UncheckedStatementContext _localctx = new UncheckedStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_uncheckedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(T__47);
			setState(668);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(T__26);
			setState(671);
			match(T__22);
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__13:
			case T__22:
			case T__24:
			case T__29:
			case T__33:
			case T__35:
			case T__37:
			case T__41:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__95:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case TypeKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(672);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(673);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__13:
			case T__22:
			case T__24:
			case T__33:
			case T__35:
			case T__41:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__95:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case TypeKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(676);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(677);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
				{
				setState(680);
				expression(0);
				}
			}

			setState(683);
			match(T__23);
			setState(684);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteralFragment() { return getToken(SolidityParser.StringLiteralFragment, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInlineAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInlineAssemblyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitInlineAssemblyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(T__48);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteralFragment) {
				{
				setState(687);
				match(StringLiteralFragment);
				}
			}

			setState(690);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(T__49);
			setState(693);
			statement();
			setState(694);
			match(T__46);
			setState(695);
			match(T__22);
			setState(696);
			expression(0);
			setState(697);
			match(T__23);
			setState(698);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(ContinueKeyword);
			setState(701);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(BreakKeyword);
			setState(704);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(T__50);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
				{
				setState(707);
				expression(0);
				}
			}

			setState(710);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(T__51);
			setState(713);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitEmitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(T__52);
			setState(716);
			functionCall();
			setState(717);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevertStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public RevertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterRevertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitRevertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitRevertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevertStatementContext revertStatement() throws RecognitionException {
		RevertStatementContext _localctx = new RevertStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_revertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(T__53);
			setState(720);
			functionCall();
			setState(721);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(723);
				match(T__54);
				setState(724);
				identifierList();
				}
				break;
			case 2:
				{
				setState(725);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(726);
				match(T__22);
				setState(727);
				variableDeclarationList();
				setState(728);
				match(T__23);
				}
				break;
			}
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(732);
				match(T__9);
				setState(733);
				expression(0);
				}
			}

			setState(736);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__29) | (1L << T__35) | (1L << T__37) | (1L << T__41) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(738);
				variableDeclaration();
				}
			}

			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(741);
				match(T__15);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__29) | (1L << T__35) | (1L << T__37) | (1L << T__41) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
					{
					setState(742);
					variableDeclaration();
					}
				}

				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(T__22);
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
						{
						setState(751);
						identifier();
						}
					}

					setState(754);
					match(T__15);
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(760);
				identifier();
				}
			}

			setState(763);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElementaryTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitElementaryTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Int - 98)) | (1L << (Uint - 98)) | (1L << (Byte - 98)) | (1L << (Fixed - 98)) | (1L << (Ufixed - 98)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(768);
				match(T__60);
				setState(769);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(770);
				match(T__22);
				setState(771);
				expression(0);
				setState(772);
				match(T__23);
				}
				break;
			case 3:
				{
				setState(774);
				_la = _input.LA(1);
				if ( !(_la==T__58 || _la==T__59) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(775);
				expression(19);
				}
				break;
			case 4:
				{
				setState(776);
				_la = _input.LA(1);
				if ( !(_la==T__62 || _la==T__63) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(777);
				expression(18);
				}
				break;
			case 5:
				{
				setState(778);
				_la = _input.LA(1);
				if ( !(_la==T__64 || _la==T__65) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(779);
				expression(17);
				}
				break;
			case 6:
				{
				setState(780);
				match(T__66);
				setState(781);
				expression(16);
				}
				break;
			case 7:
				{
				setState(782);
				match(T__4);
				setState(783);
				expression(15);
				}
				break;
			case 8:
				{
				setState(784);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(859);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(787);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(788);
						match(T__67);
						setState(789);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(790);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(791);
						_la = _input.LA(1);
						if ( !(((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__68 - 13)) | (1L << (T__69 - 13)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(792);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(793);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(794);
						_la = _input.LA(1);
						if ( !(_la==T__62 || _la==T__63) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(795);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(796);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(797);
						_la = _input.LA(1);
						if ( !(_la==T__70 || _la==T__71) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(798);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(799);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(800);
						match(T__72);
						setState(801);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(802);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(803);
						match(T__3);
						setState(804);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(805);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(806);
						match(T__73);
						setState(807);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(808);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(809);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(810);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(811);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(812);
						_la = _input.LA(1);
						if ( !(_la==T__74 || _la==T__75) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(813);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(814);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(815);
						match(T__76);
						setState(816);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(817);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(818);
						match(T__2);
						setState(819);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(820);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(821);
						match(T__77);
						setState(822);
						expression(0);
						setState(823);
						match(T__61);
						setState(824);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(826);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(827);
						_la = _input.LA(1);
						if ( !(_la==T__9 || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (T__78 - 79)) | (1L << (T__79 - 79)) | (1L << (T__80 - 79)) | (1L << (T__81 - 79)) | (1L << (T__82 - 79)) | (1L << (T__83 - 79)) | (1L << (T__84 - 79)) | (1L << (T__85 - 79)) | (1L << (T__86 - 79)) | (1L << (T__87 - 79)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(828);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(829);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(830);
						_la = _input.LA(1);
						if ( !(_la==T__58 || _la==T__59) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(831);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(832);
						match(T__33);
						setState(833);
						expression(0);
						setState(834);
						match(T__34);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(836);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(837);
						match(T__33);
						setState(839);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
							{
							setState(838);
							expression(0);
							}
						}

						setState(841);
						match(T__61);
						setState(843);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
							{
							setState(842);
							expression(0);
							}
						}

						setState(845);
						match(T__34);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(846);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(847);
						match(T__36);
						setState(848);
						identifier();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(849);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(850);
						match(T__14);
						setState(851);
						nameValueList();
						setState(852);
						match(T__16);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(854);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(855);
						match(T__22);
						setState(856);
						functionCallArguments();
						setState(857);
						match(T__23);
						}
						break;
					}
					} 
				}
				setState(863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TypeNameExpressionContext typeNameExpression() {
			return getRuleContext(TypeNameExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_primaryExpression);
		try {
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(866);
				hexLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(867);
				stringLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(868);
				identifier();
				setState(871);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(869);
					match(T__33);
					setState(870);
					match(T__34);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(873);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(874);
				match(PayableKeyword);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(875);
				tupleExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(876);
				typeNameExpression();
				setState(879);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(877);
					match(T__33);
					setState(878);
					match(T__34);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			expression(0);
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(884);
				match(T__15);
				setState(885);
				expression(0);
				}
				}
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNameValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			nameValue();
			setState(896);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(892);
					match(T__15);
					setState(893);
					nameValue();
					}
					} 
				}
				setState(898);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(899);
				match(T__15);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			identifier();
			setState(903);
			match(T__61);
			setState(904);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_functionCallArguments);
		int _la;
		try {
			setState(914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				match(T__14);
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
					{
					setState(907);
					nameValueList();
					}
				}

				setState(910);
				match(T__16);
				}
				break;
			case T__4:
			case T__13:
			case T__22:
			case T__23:
			case T__24:
			case T__33:
			case T__35:
			case T__41:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__95:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case TypeKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
					{
					setState(911);
					expressionList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			expression(0);
			setState(917);
			match(T__22);
			setState(918);
			functionCallArguments();
			setState(919);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(T__14);
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__22) | (1L << T__24) | (1L << T__26) | (1L << T__29) | (1L << T__35) | (1L << T__41) | (1L << T__42) | (1L << T__48) | (1L << T__50) | (1L << T__53) | (1L << T__57))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (T__88 - 89)) | (1L << (T__90 - 89)) | (1L << (T__91 - 89)) | (1L << (T__95 - 89)) | (1L << (DecimalNumber - 89)) | (1L << (HexNumber - 89)) | (1L << (HexLiteralFragment - 89)) | (1L << (BreakKeyword - 89)) | (1L << (ContinueKeyword - 89)) | (1L << (LeaveKeyword - 89)) | (1L << (PayableKeyword - 89)) | (1L << (ConstructorKeyword - 89)) | (1L << (ReceiveKeyword - 89)) | (1L << (Identifier - 89)) | (1L << (StringLiteralFragment - 89)))) != 0)) {
				{
				{
				setState(922);
				assemblyItem();
				}
				}
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(928);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public TerminalNode LeaveKeyword() { return getToken(SolidityParser.LeaveKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assemblyItem);
		try {
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(932);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(933);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(934);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(935);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(936);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(937);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(938);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(939);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(940);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(941);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(942);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(943);
				match(LeaveKeyword);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(944);
				subAssembly();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(945);
				numberLiteral();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(946);
				stringLiteral();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(947);
				hexLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyMemberContext assemblyMember() {
			return getRuleContext(AssemblyMemberContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assemblyExpression);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				assemblyCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				assemblyLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				assemblyMember();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyMemberContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyMemberContext assemblyMember() throws RecognitionException {
		AssemblyMemberContext _localctx = new AssemblyMemberContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assemblyMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			identifier();
			setState(956);
			match(T__36);
			setState(957);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				{
				setState(959);
				match(T__50);
				}
				break;
			case T__35:
				{
				setState(960);
				match(T__35);
				}
				break;
			case T__57:
				{
				setState(961);
				match(T__57);
				}
				break;
			case T__13:
			case T__24:
			case T__41:
			case T__53:
			case T__95:
			case LeaveKeyword:
			case PayableKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
				{
				setState(962);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(965);
				match(T__22);
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__35) | (1L << T__41) | (1L << T__50) | (1L << T__53) | (1L << T__57))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
					{
					setState(966);
					assemblyExpression();
					}
				}

				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(969);
					match(T__15);
					setState(970);
					assemblyExpression();
					}
					}
					setState(975);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(976);
				match(T__23);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLocalDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLocalDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyLocalDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(T__88);
			setState(980);
			assemblyIdentifierOrList();
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__89) {
				{
				setState(981);
				match(T__89);
				setState(982);
				assemblyExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			assemblyIdentifierOrList();
			setState(986);
			match(T__89);
			setState(987);
			assemblyExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIdentifierOrListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyMemberContext assemblyMember() {
			return getRuleContext(AssemblyMemberContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyIdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierOrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierOrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIdentifierOrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyIdentifierOrList);
		try {
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				assemblyMember();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(991);
				match(T__22);
				setState(992);
				assemblyIdentifierList();
				setState(993);
				match(T__23);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			identifier();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(998);
				match(T__15);
				setState(999);
				identifier();
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyStackAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyStackAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyStackAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(T__90);
			setState(1006);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			identifier();
			setState(1009);
			match(T__61);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblySwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblySwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblySwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(T__91);
			setState(1012);
			assemblyExpression();
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__92 || _la==T__93) {
				{
				{
				setState(1013);
				assemblyCase();
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_assemblyCase);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__92:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				match(T__92);
				setState(1020);
				assemblyLiteral();
				setState(1021);
				assemblyBlock();
				}
				break;
			case T__93:
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				match(T__93);
				setState(1024);
				assemblyBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(T__29);
			setState(1028);
			identifier();
			setState(1029);
			match(T__22);
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(1030);
				assemblyIdentifierList();
				}
			}

			setState(1033);
			match(T__23);
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__94) {
				{
				setState(1034);
				assemblyFunctionReturns();
				}
			}

			setState(1037);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionReturns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFunctionReturns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1039);
			match(T__94);
			setState(1040);
			assemblyIdentifierList();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyForContext extends ParserRuleContext {
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(T__26);
			setState(1045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(1043);
				assemblyBlock();
				}
				break;
			case T__13:
			case T__24:
			case T__35:
			case T__41:
			case T__50:
			case T__53:
			case T__57:
			case T__95:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(1044);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1047);
			assemblyExpression();
			setState(1050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(1048);
				assemblyBlock();
				}
				break;
			case T__13:
			case T__24:
			case T__35:
			case T__41:
			case T__50:
			case T__53:
			case T__57:
			case T__95:
			case DecimalNumber:
			case HexNumber:
			case HexLiteralFragment:
			case LeaveKeyword:
			case PayableKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
			case StringLiteralFragment:
				{
				setState(1049);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1052);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(T__42);
			setState(1055);
			assemblyExpression();
			setState(1056);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyLiteralContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitAssemblyLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_assemblyLiteral);
		try {
			setState(1062);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteralFragment:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				stringLiteral();
				}
				break;
			case DecimalNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(1059);
				match(DecimalNumber);
				}
				break;
			case HexNumber:
				enterOuterAlt(_localctx, 3);
				{
				setState(1060);
				match(HexNumber);
				}
				break;
			case HexLiteralFragment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1061);
				hexLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubAssemblyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public SubAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAssembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSubAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSubAssembly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitSubAssembly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(T__48);
			setState(1065);
			identifier();
			setState(1066);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_tupleExpression);
		int _la;
		try {
			setState(1094);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				match(T__22);
				{
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
					{
					setState(1069);
					expression(0);
					}
				}

				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1072);
					match(T__15);
					setState(1074);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
						{
						setState(1073);
						expression(0);
						}
					}

					}
					}
					setState(1080);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1081);
				match(T__23);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				match(T__33);
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__22 - 5)) | (1L << (T__24 - 5)) | (1L << (T__33 - 5)) | (1L << (T__35 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (DecimalNumber - 96)) | (1L << (HexNumber - 96)) | (1L << (HexLiteralFragment - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (TypeKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)) | (1L << (StringLiteralFragment - 96)))) != 0)) {
					{
					setState(1083);
					expression(0);
					setState(1088);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(1084);
						match(T__15);
						setState(1085);
						expression(0);
						}
						}
						setState(1090);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1093);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameExpressionContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public TypeNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitTypeNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameExpressionContext typeNameExpression() throws RecognitionException {
		TypeNameExpressionContext _localctx = new TypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_typeNameExpression);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				elementaryTypeName();
				}
				break;
			case T__13:
			case T__24:
			case T__41:
			case T__53:
			case T__95:
			case LeaveKeyword:
			case PayableKeyword:
			case ConstructorKeyword:
			case ReceiveKeyword:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097);
				userDefinedTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1101);
				match(NumberUnit);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ReceiveKeyword() { return getToken(SolidityParser.ReceiveKeyword, 0); }
		public TerminalNode ConstructorKeyword() { return getToken(SolidityParser.ConstructorKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TerminalNode LeaveKeyword() { return getToken(SolidityParser.LeaveKeyword, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__41) | (1L << T__53))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (LeaveKeyword - 96)) | (1L << (PayableKeyword - 96)) | (1L << (ConstructorKeyword - 96)) | (1L << (ReceiveKeyword - 96)) | (1L << (Identifier - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexLiteralContext extends ParserRuleContext {
		public List<TerminalNode> HexLiteralFragment() { return getTokens(SolidityParser.HexLiteralFragment); }
		public TerminalNode HexLiteralFragment(int i) {
			return getToken(SolidityParser.HexLiteralFragment, i);
		}
		public HexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterHexLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitHexLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitHexLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexLiteralContext hexLiteral() throws RecognitionException {
		HexLiteralContext _localctx = new HexLiteralContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_hexLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1107); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1106);
					match(HexLiteralFragment);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1109); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverrideSpecifierContext extends ParserRuleContext {
		public List<UserDefinedTypeNameContext> userDefinedTypeName() {
			return getRuleContexts(UserDefinedTypeNameContext.class);
		}
		public UserDefinedTypeNameContext userDefinedTypeName(int i) {
			return getRuleContext(UserDefinedTypeNameContext.class,i);
		}
		public OverrideSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOverrideSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOverrideSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitOverrideSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverrideSpecifierContext overrideSpecifier() throws RecognitionException {
		OverrideSpecifierContext _localctx = new OverrideSpecifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(T__96);
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(1112);
				match(T__22);
				setState(1113);
				userDefinedTypeName();
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1114);
					match(T__15);
					setState(1115);
					userDefinedTypeName();
					}
					}
					setState(1120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1121);
				match(T__23);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteralFragment() { return getTokens(SolidityParser.StringLiteralFragment); }
		public TerminalNode StringLiteralFragment(int i) {
			return getToken(SolidityParser.StringLiteralFragment, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolidityVisitor ) return ((SolidityVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_stringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1126); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1125);
					match(StringLiteralFragment);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1128); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 64:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 27);
		case 15:
			return precpred(_ctx, 25);
		case 16:
			return precpred(_ctx, 24);
		case 17:
			return precpred(_ctx, 23);
		case 18:
			return precpred(_ctx, 22);
		case 19:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0087\u046d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00ce\n\2\f\2"+
		"\16\2\u00d1\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00de"+
		"\n\5\3\6\3\6\5\6\u00e2\n\6\3\6\7\6\u00e5\n\6\f\6\16\6\u00e8\13\6\3\7\3"+
		"\7\3\b\5\b\u00ed\n\b\3\b\3\b\5\b\u00f1\n\b\3\b\5\b\u00f4\n\b\3\t\3\t\3"+
		"\t\5\t\u00f9\n\t\3\n\3\n\3\n\3\n\5\n\u00ff\n\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0106\n\n\3\n\3\n\5\n\u010a\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\n\u0115\n\n\f\n\16\n\u0118\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u011f\n\n\3\13"+
		"\3\13\3\f\5\f\u0124\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u012c\n\f\f\f\16\f"+
		"\u012f\13\f\5\f\u0131\n\f\3\f\3\f\7\f\u0135\n\f\f\f\16\f\u0138\13\f\3"+
		"\f\3\f\3\r\3\r\3\r\5\r\u013f\n\r\3\r\5\r\u0142\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u014d\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u0156\n\17\f\17\16\17\u0159\13\17\3\17\3\17\3\17\5\17\u015e"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0179"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0185\n\24"+
		"\f\24\16\24\u0188\13\24\5\24\u018a\n\24\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u0191\n\25\3\25\3\25\7\25\u0195\n\25\f\25\16\25\u0198\13\25\3\25\3\25"+
		"\5\25\u019c\n\25\3\26\3\26\3\26\5\26\u01a1\n\26\3\26\5\26\u01a4\n\26\3"+
		"\27\3\27\3\27\3\27\5\27\u01aa\n\27\3\27\3\27\5\27\u01ae\n\27\3\30\3\30"+
		"\5\30\u01b2\n\30\3\30\3\30\3\30\5\30\u01b7\n\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01c4\n\32\f\32\16\32\u01c7\13"+
		"\32\3\33\3\33\3\33\3\33\5\33\u01cd\n\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\5\35\u01d7\n\35\3\35\3\35\7\35\u01db\n\35\f\35\16\35\u01de"+
		"\13\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u01e6\n\36\f\36\16\36\u01e9"+
		"\13\36\5\36\u01eb\n\36\3\36\3\36\3\37\3\37\5\37\u01f1\n\37\3\37\5\37\u01f4"+
		"\n\37\3 \3 \3 \3 \7 \u01fa\n \f \16 \u01fd\13 \5 \u01ff\n \3 \3 \3!\3"+
		"!\5!\u0205\n!\3!\5!\u0208\n!\3\"\3\"\3\"\3\"\7\"\u020e\n\"\f\"\16\"\u0211"+
		"\13\"\5\"\u0213\n\"\3\"\3\"\3#\3#\5#\u0219\n#\3$\3$\5$\u021d\n$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\5%\u0228\n%\3%\3%\3%\5%\u022d\n%\3%\7%\u0230\n%"+
		"\f%\16%\u0233\13%\3&\3&\3&\7&\u0238\n&\f&\16&\u023b\13&\3\'\3\'\5\'\u023f"+
		"\n\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\7)\u024d\n)\f)\16)\u0250\13)"+
		"\3)\3)\5)\u0254\n)\3*\3*\3+\3+\3,\3,\7,\u025c\n,\f,\16,\u025f\13,\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0272\n-\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3/\3/\5/\u027e\n/\3\60\3\60\3\60\5\60\u0283\n\60\3\60\3"+
		"\60\6\60\u0287\n\60\r\60\16\60\u0288\3\61\3\61\5\61\u028d\n\61\3\61\5"+
		"\61\u0290\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\5\63"+
		"\u029c\n\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u02a5\n\65\3\65\3"+
		"\65\5\65\u02a9\n\65\3\65\5\65\u02ac\n\65\3\65\3\65\3\65\3\66\3\66\5\66"+
		"\u02b3\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\3"+
		"8\39\39\39\3:\3:\5:\u02c7\n:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3"+
		">\3>\3>\3>\3>\3>\3>\5>\u02dd\n>\3>\3>\5>\u02e1\n>\3>\3>\3?\5?\u02e6\n"+
		"?\3?\3?\5?\u02ea\n?\7?\u02ec\n?\f?\16?\u02ef\13?\3@\3@\5@\u02f3\n@\3@"+
		"\7@\u02f6\n@\f@\16@\u02f9\13@\3@\5@\u02fc\n@\3@\3@\3A\3A\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0314\nB\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\5B\u034a\nB\3B\3B\5B\u034e\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\7B\u035e\nB\fB\16B\u0361\13B\3C\3C\3C\3C\3C\3C\3C\5C\u036a\nC\3C"+
		"\3C\3C\3C\3C\3C\5C\u0372\nC\5C\u0374\nC\3D\3D\3D\7D\u0379\nD\fD\16D\u037c"+
		"\13D\3E\3E\3E\7E\u0381\nE\fE\16E\u0384\13E\3E\5E\u0387\nE\3F\3F\3F\3F"+
		"\3G\3G\5G\u038f\nG\3G\3G\5G\u0393\nG\5G\u0395\nG\3H\3H\3H\3H\3H\3I\3I"+
		"\7I\u039e\nI\fI\16I\u03a1\13I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\5J\u03b7\nJ\3K\3K\3K\5K\u03bc\nK\3L\3L\3L\3L\3M\3"+
		"M\3M\3M\5M\u03c6\nM\3M\3M\5M\u03ca\nM\3M\3M\7M\u03ce\nM\fM\16M\u03d1\13"+
		"M\3M\5M\u03d4\nM\3N\3N\3N\3N\5N\u03da\nN\3O\3O\3O\3O\3P\3P\3P\3P\3P\3"+
		"P\5P\u03e6\nP\3Q\3Q\3Q\7Q\u03eb\nQ\fQ\16Q\u03ee\13Q\3R\3R\3R\3S\3S\3S"+
		"\3T\3T\3T\7T\u03f9\nT\fT\16T\u03fc\13T\3U\3U\3U\3U\3U\3U\5U\u0404\nU\3"+
		"V\3V\3V\3V\5V\u040a\nV\3V\3V\5V\u040e\nV\3V\3V\3W\3W\3W\3X\3X\3X\5X\u0418"+
		"\nX\3X\3X\3X\5X\u041d\nX\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u0429\nZ\3["+
		"\3[\3[\3[\3\\\3\\\5\\\u0431\n\\\3\\\3\\\5\\\u0435\n\\\7\\\u0437\n\\\f"+
		"\\\16\\\u043a\13\\\3\\\3\\\3\\\3\\\3\\\7\\\u0441\n\\\f\\\16\\\u0444\13"+
		"\\\5\\\u0446\n\\\3\\\5\\\u0449\n\\\3]\3]\5]\u044d\n]\3^\3^\5^\u0451\n"+
		"^\3_\3_\3`\6`\u0456\n`\r`\16`\u0457\3a\3a\3a\3a\3a\7a\u045f\na\fa\16a"+
		"\u0462\13a\3a\3a\5a\u0466\na\3b\6b\u0469\nb\rb\16b\u046a\3b\2\4H\u0082"+
		"c\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\2\21\3\2\6\f\3\2\25\27\3\2*,\6\2qqxx||~~\5\2&&9<dh"+
		"\3\2=>\3\2AB\3\2CD\4\2\17\17GH\3\2IJ\3\2\b\13\3\2MN\4\2\f\fQZ\3\2jk\13"+
		"\2\20\20\33\33,,88bbttxx\177\177\u0081\u0082\2\u04ea\2\u00cf\3\2\2\2\4"+
		"\u00d4\3\2\2\2\6\u00d9\3\2\2\2\b\u00dd\3\2\2\2\n\u00df\3\2\2\2\f\u00e9"+
		"\3\2\2\2\16\u00f3\3\2\2\2\20\u00f5\3\2\2\2\22\u011e\3\2\2\2\24\u0120\3"+
		"\2\2\2\26\u0123\3\2\2\2\30\u013b\3\2\2\2\32\u014c\3\2\2\2\34\u014e\3\2"+
		"\2\2\36\u0161\3\2\2\2 \u0168\3\2\2\2\"\u016d\3\2\2\2$\u0173\3\2\2\2&\u017c"+
		"\3\2\2\2(\u018d\3\2\2\2*\u019d\3\2\2\2,\u01a5\3\2\2\2.\u01b6\3\2\2\2\60"+
		"\u01b8\3\2\2\2\62\u01c5\3\2\2\2\64\u01c8\3\2\2\2\66\u01d0\3\2\2\28\u01d2"+
		"\3\2\2\2:\u01e1\3\2\2\2<\u01ee\3\2\2\2>\u01f5\3\2\2\2@\u0202\3\2\2\2B"+
		"\u0209\3\2\2\2D\u0216\3\2\2\2F\u021a\3\2\2\2H\u0227\3\2\2\2J\u0234\3\2"+
		"\2\2L\u023e\3\2\2\2N\u0240\3\2\2\2P\u0247\3\2\2\2R\u0255\3\2\2\2T\u0257"+
		"\3\2\2\2V\u0259\3\2\2\2X\u0271\3\2\2\2Z\u0273\3\2\2\2\\\u0276\3\2\2\2"+
		"^\u027f\3\2\2\2`\u028a\3\2\2\2b\u0293\3\2\2\2d\u029b\3\2\2\2f\u029d\3"+
		"\2\2\2h\u02a0\3\2\2\2j\u02b0\3\2\2\2l\u02b6\3\2\2\2n\u02be\3\2\2\2p\u02c1"+
		"\3\2\2\2r\u02c4\3\2\2\2t\u02ca\3\2\2\2v\u02cd\3\2\2\2x\u02d1\3\2\2\2z"+
		"\u02dc\3\2\2\2|\u02e5\3\2\2\2~\u02f0\3\2\2\2\u0080\u02ff\3\2\2\2\u0082"+
		"\u0313\3\2\2\2\u0084\u0373\3\2\2\2\u0086\u0375\3\2\2\2\u0088\u037d\3\2"+
		"\2\2\u008a\u0388\3\2\2\2\u008c\u0394\3\2\2\2\u008e\u0396\3\2\2\2\u0090"+
		"\u039b\3\2\2\2\u0092\u03b6\3\2\2\2\u0094\u03bb\3\2\2\2\u0096\u03bd\3\2"+
		"\2\2\u0098\u03c5\3\2\2\2\u009a\u03d5\3\2\2\2\u009c\u03db\3\2\2\2\u009e"+
		"\u03e5\3\2\2\2\u00a0\u03e7\3\2\2\2\u00a2\u03ef\3\2\2\2\u00a4\u03f2\3\2"+
		"\2\2\u00a6\u03f5\3\2\2\2\u00a8\u0403\3\2\2\2\u00aa\u0405\3\2\2\2\u00ac"+
		"\u0411\3\2\2\2\u00ae\u0414\3\2\2\2\u00b0\u0420\3\2\2\2\u00b2\u0428\3\2"+
		"\2\2\u00b4\u042a\3\2\2\2\u00b6\u0448\3\2\2\2\u00b8\u044c\3\2\2\2\u00ba"+
		"\u044e\3\2\2\2\u00bc\u0452\3\2\2\2\u00be\u0455\3\2\2\2\u00c0\u0459\3\2"+
		"\2\2\u00c2\u0468\3\2\2\2\u00c4\u00ce\5\4\3\2\u00c5\u00ce\5\22\n\2\u00c6"+
		"\u00ce\5\26\f\2\u00c7\u00ce\58\35\2\u00c8\u00ce\5&\24\2\u00c9\u00ce\5"+
		",\27\2\u00ca\u00ce\5\36\20\2\u00cb\u00ce\5 \21\2\u00cc\u00ce\5\"\22\2"+
		"\u00cd\u00c4\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00c7"+
		"\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\7\2\2\3\u00d3\3\3\2\2\2\u00d4\u00d5\7\3\2\2\u00d5\u00d6\5\6\4\2"+
		"\u00d6\u00d7\5\b\5\2\u00d7\u00d8\7\4\2\2\u00d8\5\3\2\2\2\u00d9\u00da\5"+
		"\u00bc_\2\u00da\7\3\2\2\2\u00db\u00de\5\n\6\2\u00dc\u00de\5\u0082B\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\t\3\2\2\2\u00df\u00e6\5\16\b"+
		"\2\u00e0\u00e2\7\5\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e5\5\16\b\2\u00e4\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\13\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ea\t\2\2\2\u00ea\r\3\2\2\2\u00eb\u00ed\5\f\7\2\u00ec"+
		"\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f4\7\u0084"+
		"\2\2\u00ef\u00f1\5\f\7\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\7j\2\2\u00f3\u00ec\3\2\2\2\u00f3\u00f0\3\2"+
		"\2\2\u00f4\17\3\2\2\2\u00f5\u00f8\5\u00bc_\2\u00f6\u00f7\7\r\2\2\u00f7"+
		"\u00f9\5\u00bc_\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\21\3\2"+
		"\2\2\u00fa\u00fb\7\16\2\2\u00fb\u00fe\5\24\13\2\u00fc\u00fd\7\r\2\2\u00fd"+
		"\u00ff\5\u00bc_\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\7\4\2\2\u0101\u011f\3\2\2\2\u0102\u0105\7\16\2\2"+
		"\u0103\u0106\7\17\2\2\u0104\u0106\5\u00bc_\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0108\7\r\2\2\u0108\u010a\5\u00bc"+
		"_\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\7\20\2\2\u010c\u010d\5\24\13\2\u010d\u010e\7\4\2\2\u010e\u011f"+
		"\3\2\2\2\u010f\u0110\7\16\2\2\u0110\u0111\7\21\2\2\u0111\u0116\5\20\t"+
		"\2\u0112\u0113\7\22\2\2\u0113\u0115\5\20\t\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\23\2\2\u011a\u011b\7\20\2\2\u011b"+
		"\u011c\5\24\13\2\u011c\u011d\7\4\2\2\u011d\u011f\3\2\2\2\u011e\u00fa\3"+
		"\2\2\2\u011e\u0102\3\2\2\2\u011e\u010f\3\2\2\2\u011f\23\3\2\2\2\u0120"+
		"\u0121\7\u0083\2\2\u0121\25\3\2\2\2\u0122\u0124\7\24\2\2\u0123\u0122\3"+
		"\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\t\3\2\2\u0126"+
		"\u0130\5\u00bc_\2\u0127\u0128\7\30\2\2\u0128\u012d\5\30\r\2\u0129\u012a"+
		"\7\22\2\2\u012a\u012c\5\30\r\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0127\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0136\7\21\2\2\u0133\u0135\5\32\16\2\u0134\u0133\3\2\2\2\u0135\u0138"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\7\23\2\2\u013a\27\3\2\2\2\u013b\u0141\5J&\2"+
		"\u013c\u013e\7\31\2\2\u013d\u013f\5\u0086D\2\u013e\u013d\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\7\32\2\2\u0141\u013c\3"+
		"\2\2\2\u0141\u0142\3\2\2\2\u0142\31\3\2\2\2\u0143\u014d\5\34\17\2\u0144"+
		"\u014d\5$\23\2\u0145\u014d\5&\24\2\u0146\u014d\5(\25\2\u0147\u014d\5,"+
		"\27\2\u0148\u014d\5\64\33\2\u0149\u014d\58\35\2\u014a\u014d\5 \21\2\u014b"+
		"\u014d\5\"\22\2\u014c\u0143\3\2\2\2\u014c\u0144\3\2\2\2\u014c\u0145\3"+
		"\2\2\2\u014c\u0146\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014c"+
		"\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\33\3\2\2"+
		"\2\u014e\u0157\5H%\2\u014f\u0156\7z\2\2\u0150\u0156\7w\2\2\u0151\u0156"+
		"\7y\2\2\u0152\u0156\7q\2\2\u0153\u0156\7r\2\2\u0154\u0156\5\u00c0a\2\u0155"+
		"\u014f\3\2\2\2\u0155\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015d\5\u00bc_\2\u015b\u015c\7\f\2\2\u015c\u015e\5\u0082B\2"+
		"\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160"+
		"\7\4\2\2\u0160\35\3\2\2\2\u0161\u0162\5H%\2\u0162\u0163\7q\2\2\u0163\u0164"+
		"\5\u00bc_\2\u0164\u0165\7\f\2\2\u0165\u0166\5\u0082B\2\u0166\u0167\7\4"+
		"\2\2\u0167\37\3\2\2\2\u0168\u0169\7\33\2\2\u0169\u016a\5\u00bc_\2\u016a"+
		"\u016b\5:\36\2\u016b\u016c\7\4\2\2\u016c!\3\2\2\2\u016d\u016e\7}\2\2\u016e"+
		"\u016f\5\u00bc_\2\u016f\u0170\7\30\2\2\u0170\u0171\5\u0080A\2\u0171\u0172"+
		"\7\4\2\2\u0172#\3\2\2\2\u0173\u0174\7\34\2\2\u0174\u0175\5\u00bc_\2\u0175"+
		"\u0178\7\35\2\2\u0176\u0179\7\17\2\2\u0177\u0179\5H%\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\7\4\2\2\u017b"+
		"%\3\2\2\2\u017c\u017d\7\36\2\2\u017d\u017e\5\u00bc_\2\u017e\u0189\7\21"+
		"\2\2\u017f\u0180\5F$\2\u0180\u0186\7\4\2\2\u0181\u0182\5F$\2\u0182\u0183"+
		"\7\4\2\2\u0183\u0185\3\2\2\2\u0184\u0181\3\2\2\2\u0185\u0188\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0189\u017f\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\7\23\2\2\u018c\'\3\2\2\2\u018d\u018e\7\37\2\2\u018e\u0190\5\u00bc"+
		"_\2\u018f\u0191\5:\36\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0196\3\2\2\2\u0192\u0195\7{\2\2\u0193\u0195\5\u00c0a\2\u0194\u0192\3"+
		"\2\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u019b\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019c\7\4"+
		"\2\2\u019a\u019c\5V,\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c)"+
		"\3\2\2\2\u019d\u01a3\5\u00bc_\2\u019e\u01a0\7\31\2\2\u019f\u01a1\5\u0086"+
		"D\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\7\32\2\2\u01a3\u019e\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4+\3\2\2\2"+
		"\u01a5\u01a6\5.\30\2\u01a6\u01a7\5:\36\2\u01a7\u01a9\5\62\32\2\u01a8\u01aa"+
		"\5\60\31\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\3\2\2\2"+
		"\u01ab\u01ae\7\4\2\2\u01ac\u01ae\5V,\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac"+
		"\3\2\2\2\u01ae-\3\2\2\2\u01af\u01b1\7 \2\2\u01b0\u01b2\5\u00bc_\2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b7\3\2\2\2\u01b3\u01b7\7\177"+
		"\2\2\u01b4\u01b7\7\u0080\2\2\u01b5\u01b7\7\u0081\2\2\u01b6\u01af\3\2\2"+
		"\2\u01b6\u01b3\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7/"+
		"\3\2\2\2\u01b8\u01b9\7!\2\2\u01b9\u01ba\5:\36\2\u01ba\61\3\2\2\2\u01bb"+
		"\u01c4\7u\2\2\u01bc\u01c4\7z\2\2\u01bd\u01c4\7w\2\2\u01be\u01c4\7y\2\2"+
		"\u01bf\u01c4\7{\2\2\u01c0\u01c4\5T+\2\u01c1\u01c4\5*\26\2\u01c2\u01c4"+
		"\5\u00c0a\2\u01c3\u01bb\3\2\2\2\u01c3\u01bc\3\2\2\2\u01c3\u01bd\3\2\2"+
		"\2\u01c3\u01be\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\63\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7\"\2"+
		"\2\u01c9\u01ca\5\u00bc_\2\u01ca\u01cc\5> \2\u01cb\u01cd\7o\2\2\u01cc\u01cb"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\7\4\2\2\u01cf"+
		"\65\3\2\2\2\u01d0\u01d1\5\u00bc_\2\u01d1\67\3\2\2\2\u01d2\u01d3\7#\2\2"+
		"\u01d3\u01d4\5\u00bc_\2\u01d4\u01d6\7\21\2\2\u01d5\u01d7\5\66\34\2\u01d6"+
		"\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01dc\3\2\2\2\u01d8\u01d9\7\22"+
		"\2\2\u01d9\u01db\5\66\34\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2"+
		"\2\2\u01df\u01e0\7\23\2\2\u01e09\3\2\2\2\u01e1\u01ea\7\31\2\2\u01e2\u01e7"+
		"\5<\37\2\u01e3\u01e4\7\22\2\2\u01e4\u01e6\5<\37\2\u01e5\u01e3\3\2\2\2"+
		"\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\7\32\2\2\u01ed;\3\2\2\2\u01ee\u01f0\5H%\2\u01ef"+
		"\u01f1\5R*\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2\2"+
		"\2\u01f2\u01f4\5\u00bc_\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"=\3\2\2\2\u01f5\u01fe\7\31\2\2\u01f6\u01fb\5@!\2\u01f7\u01f8\7\22\2\2"+
		"\u01f8\u01fa\5@!\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe"+
		"\u01f6\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\7\32"+
		"\2\2\u0201?\3\2\2\2\u0202\u0204\5H%\2\u0203\u0205\7v\2\2\u0204\u0203\3"+
		"\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0208\5\u00bc_\2"+
		"\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208A\3\2\2\2\u0209\u0212\7"+
		"\31\2\2\u020a\u020f\5D#\2\u020b\u020c\7\22\2\2\u020c\u020e\5D#\2\u020d"+
		"\u020b\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u020a\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\7\32\2\2\u0215C\3\2\2\2"+
		"\u0216\u0218\5H%\2\u0217\u0219\5R*\2\u0218\u0217\3\2\2\2\u0218\u0219\3"+
		"\2\2\2\u0219E\3\2\2\2\u021a\u021c\5H%\2\u021b\u021d\5R*\2\u021c\u021b"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\5\u00bc_"+
		"\2\u021fG\3\2\2\2\u0220\u0221\b%\1\2\u0221\u0228\5\u0080A\2\u0222\u0228"+
		"\5J&\2\u0223\u0228\5N(\2\u0224\u0228\5P)\2\u0225\u0226\7&\2\2\u0226\u0228"+
		"\7x\2\2\u0227\u0220\3\2\2\2\u0227\u0222\3\2\2\2\u0227\u0223\3\2\2\2\u0227"+
		"\u0224\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0231\3\2\2\2\u0229\u022a\f\5"+
		"\2\2\u022a\u022c\7$\2\2\u022b\u022d\5\u0082B\2\u022c\u022b\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\7%\2\2\u022f\u0229\3\2"+
		"\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"I\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0239\5\u00bc_\2\u0235\u0236\7\'\2"+
		"\2\u0236\u0238\5\u00bc_\2\u0237\u0235\3\2\2\2\u0238\u023b\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023aK\3\2\2\2\u023b\u0239\3\2\2\2"+
		"\u023c\u023f\5\u0080A\2\u023d\u023f\5J&\2\u023e\u023c\3\2\2\2\u023e\u023d"+
		"\3\2\2\2\u023fM\3\2\2\2\u0240\u0241\7(\2\2\u0241\u0242\7\31\2\2\u0242"+
		"\u0243\5L\'\2\u0243\u0244\7)\2\2\u0244\u0245\5H%\2\u0245\u0246\7\32\2"+
		"\2\u0246O\3\2\2\2\u0247\u0248\7 \2\2\u0248\u024e\5B\"\2\u0249\u024d\7"+
		"w\2\2\u024a\u024d\7u\2\2\u024b\u024d\5T+\2\u024c\u0249\3\2\2\2\u024c\u024a"+
		"\3\2\2\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0253\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252\7!"+
		"\2\2\u0252\u0254\5B\"\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"Q\3\2\2\2\u0255\u0256\t\4\2\2\u0256S\3\2\2\2\u0257\u0258\t\5\2\2\u0258"+
		"U\3\2\2\2\u0259\u025d\7\21\2\2\u025a\u025c\5X-\2\u025b\u025a\3\2\2\2\u025c"+
		"\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2"+
		"\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7\23\2\2\u0261W\3\2\2\2\u0262\u0272"+
		"\5\\/\2\u0263\u0272\5^\60\2\u0264\u0272\5b\62\2\u0265\u0272\5h\65\2\u0266"+
		"\u0272\5V,\2\u0267\u0272\5j\66\2\u0268\u0272\5l\67\2\u0269\u0272\5n8\2"+
		"\u026a\u0272\5p9\2\u026b\u0272\5r:\2\u026c\u0272\5t;\2\u026d\u0272\5v"+
		"<\2\u026e\u0272\5d\63\2\u026f\u0272\5f\64\2\u0270\u0272\5x=\2\u0271\u0262"+
		"\3\2\2\2\u0271\u0263\3\2\2\2\u0271\u0264\3\2\2\2\u0271\u0265\3\2\2\2\u0271"+
		"\u0266\3\2\2\2\u0271\u0267\3\2\2\2\u0271\u0268\3\2\2\2\u0271\u0269\3\2"+
		"\2\2\u0271\u026a\3\2\2\2\u0271\u026b\3\2\2\2\u0271\u026c\3\2\2\2\u0271"+
		"\u026d\3\2\2\2\u0271\u026e\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0270\3\2"+
		"\2\2\u0272Y\3\2\2\2\u0273\u0274\5\u0082B\2\u0274\u0275\7\4\2\2\u0275["+
		"\3\2\2\2\u0276\u0277\7-\2\2\u0277\u0278\7\31\2\2\u0278\u0279\5\u0082B"+
		"\2\u0279\u027a\7\32\2\2\u027a\u027d\5X-\2\u027b\u027c\7.\2\2\u027c\u027e"+
		"\5X-\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e]\3\2\2\2\u027f\u0280"+
		"\7/\2\2\u0280\u0282\5\u0082B\2\u0281\u0283\5\60\31\2\u0282\u0281\3\2\2"+
		"\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\5V,\2\u0285\u0287"+
		"\5`\61\2\u0286\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0286\3\2\2\2\u0288"+
		"\u0289\3\2\2\2\u0289_\3\2\2\2\u028a\u028f\7\60\2\2\u028b\u028d\5\u00bc"+
		"_\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u0290\5:\36\2\u028f\u028c\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0292\5V,\2\u0292a\3\2\2\2\u0293\u0294\7\61\2\2\u0294\u0295"+
		"\7\31\2\2\u0295\u0296\5\u0082B\2\u0296\u0297\7\32\2\2\u0297\u0298\5X-"+
		"\2\u0298c\3\2\2\2\u0299\u029c\5z>\2\u029a\u029c\5Z.\2\u029b\u0299\3\2"+
		"\2\2\u029b\u029a\3\2\2\2\u029ce\3\2\2\2\u029d\u029e\7\62\2\2\u029e\u029f"+
		"\5V,\2\u029fg\3\2\2\2\u02a0\u02a1\7\35\2\2\u02a1\u02a4\7\31\2\2\u02a2"+
		"\u02a5\5d\63\2\u02a3\u02a5\7\4\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3\3\2"+
		"\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a9\5Z.\2\u02a7\u02a9\7\4\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02ac\5\u0082B"+
		"\2\u02ab\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae"+
		"\7\32\2\2\u02ae\u02af\5X-\2\u02afi\3\2\2\2\u02b0\u02b2\7\63\2\2\u02b1"+
		"\u02b3\7\u0083\2\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4\u02b5\5\u0090I\2\u02b5k\3\2\2\2\u02b6\u02b7\7\64\2\2\u02b7"+
		"\u02b8\5X-\2\u02b8\u02b9\7\61\2\2\u02b9\u02ba\7\31\2\2\u02ba\u02bb\5\u0082"+
		"B\2\u02bb\u02bc\7\32\2\2\u02bc\u02bd\7\4\2\2\u02bdm\3\2\2\2\u02be\u02bf"+
		"\7s\2\2\u02bf\u02c0\7\4\2\2\u02c0o\3\2\2\2\u02c1\u02c2\7p\2\2\u02c2\u02c3"+
		"\7\4\2\2\u02c3q\3\2\2\2\u02c4\u02c6\7\65\2\2\u02c5\u02c7\5\u0082B\2\u02c6"+
		"\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\7\4"+
		"\2\2\u02c9s\3\2\2\2\u02ca\u02cb\7\66\2\2\u02cb\u02cc\7\4\2\2\u02ccu\3"+
		"\2\2\2\u02cd\u02ce\7\67\2\2\u02ce\u02cf\5\u008eH\2\u02cf\u02d0\7\4\2\2"+
		"\u02d0w\3\2\2\2\u02d1\u02d2\78\2\2\u02d2\u02d3\5\u008eH\2\u02d3\u02d4"+
		"\7\4\2\2\u02d4y\3\2\2\2\u02d5\u02d6\79\2\2\u02d6\u02dd\5~@\2\u02d7\u02dd"+
		"\5F$\2\u02d8\u02d9\7\31\2\2\u02d9\u02da\5|?\2\u02da\u02db\7\32\2\2\u02db"+
		"\u02dd\3\2\2\2\u02dc\u02d5\3\2\2\2\u02dc\u02d7\3\2\2\2\u02dc\u02d8\3\2"+
		"\2\2\u02dd\u02e0\3\2\2\2\u02de\u02df\7\f\2\2\u02df\u02e1\5\u0082B\2\u02e0"+
		"\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\7\4"+
		"\2\2\u02e3{\3\2\2\2\u02e4\u02e6\5F$\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6"+
		"\3\2\2\2\u02e6\u02ed\3\2\2\2\u02e7\u02e9\7\22\2\2\u02e8\u02ea\5F$\2\u02e9"+
		"\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e7\3\2"+
		"\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"}\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f7\7\31\2\2\u02f1\u02f3\5\u00bc"+
		"_\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f6\7\22\2\2\u02f5\u02f2\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3"+
		"\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa"+
		"\u02fc\5\u00bc_\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd"+
		"\3\2\2\2\u02fd\u02fe\7\32\2\2\u02fe\177\3\2\2\2\u02ff\u0300\t\6\2\2\u0300"+
		"\u0081\3\2\2\2\u0301\u0302\bB\1\2\u0302\u0303\7?\2\2\u0303\u0314\5H%\2"+
		"\u0304\u0305\7\31\2\2\u0305\u0306\5\u0082B\2\u0306\u0307\7\32\2\2\u0307"+
		"\u0314\3\2\2\2\u0308\u0309\t\7\2\2\u0309\u0314\5\u0082B\25\u030a\u030b"+
		"\t\b\2\2\u030b\u0314\5\u0082B\24\u030c\u030d\t\t\2\2\u030d\u0314\5\u0082"+
		"B\23\u030e\u030f\7E\2\2\u030f\u0314\5\u0082B\22\u0310\u0311\7\7\2\2\u0311"+
		"\u0314\5\u0082B\21\u0312\u0314\5\u0084C\2\u0313\u0301\3\2\2\2\u0313\u0304"+
		"\3\2\2\2\u0313\u0308\3\2\2\2\u0313\u030a\3\2\2\2\u0313\u030c\3\2\2\2\u0313"+
		"\u030e\3\2\2\2\u0313\u0310\3\2\2\2\u0313\u0312\3\2\2\2\u0314\u035f\3\2"+
		"\2\2\u0315\u0316\f\20\2\2\u0316\u0317\7F\2\2\u0317\u035e\5\u0082B\21\u0318"+
		"\u0319\f\17\2\2\u0319\u031a\t\n\2\2\u031a\u035e\5\u0082B\20\u031b\u031c"+
		"\f\16\2\2\u031c\u031d\t\b\2\2\u031d\u035e\5\u0082B\17\u031e\u031f\f\r"+
		"\2\2\u031f\u0320\t\13\2\2\u0320\u035e\5\u0082B\16\u0321\u0322\f\f\2\2"+
		"\u0322\u0323\7K\2\2\u0323\u035e\5\u0082B\r\u0324\u0325\f\13\2\2\u0325"+
		"\u0326\7\6\2\2\u0326\u035e\5\u0082B\f\u0327\u0328\f\n\2\2\u0328\u0329"+
		"\7L\2\2\u0329\u035e\5\u0082B\13\u032a\u032b\f\t\2\2\u032b\u032c\t\f\2"+
		"\2\u032c\u035e\5\u0082B\n\u032d\u032e\f\b\2\2\u032e\u032f\t\r\2\2\u032f"+
		"\u035e\5\u0082B\t\u0330\u0331\f\7\2\2\u0331\u0332\7O\2\2\u0332\u035e\5"+
		"\u0082B\b\u0333\u0334\f\6\2\2\u0334\u0335\7\5\2\2\u0335\u035e\5\u0082"+
		"B\7\u0336\u0337\f\5\2\2\u0337\u0338\7P\2\2\u0338\u0339\5\u0082B\2\u0339"+
		"\u033a\7@\2\2\u033a\u033b\5\u0082B\6\u033b\u035e\3\2\2\2\u033c\u033d\f"+
		"\4\2\2\u033d\u033e\t\16\2\2\u033e\u035e\5\u0082B\5\u033f\u0340\f\35\2"+
		"\2\u0340\u035e\t\7\2\2\u0341\u0342\f\33\2\2\u0342\u0343\7$\2\2\u0343\u0344"+
		"\5\u0082B\2\u0344\u0345\7%\2\2\u0345\u035e\3\2\2\2\u0346\u0347\f\32\2"+
		"\2\u0347\u0349\7$\2\2\u0348\u034a\5\u0082B\2\u0349\u0348\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d\7@\2\2\u034c\u034e\5\u0082"+
		"B\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u035e\7%\2\2\u0350\u0351\f\31\2\2\u0351\u0352\7\'\2\2\u0352\u035e\5\u00bc"+
		"_\2\u0353\u0354\f\30\2\2\u0354\u0355\7\21\2\2\u0355\u0356\5\u0088E\2\u0356"+
		"\u0357\7\23\2\2\u0357\u035e\3\2\2\2\u0358\u0359\f\27\2\2\u0359\u035a\7"+
		"\31\2\2\u035a\u035b\5\u008cG\2\u035b\u035c\7\32\2\2\u035c\u035e\3\2\2"+
		"\2\u035d\u0315\3\2\2\2\u035d\u0318\3\2\2\2\u035d\u031b\3\2\2\2\u035d\u031e"+
		"\3\2\2\2\u035d\u0321\3\2\2\2\u035d\u0324\3\2\2\2\u035d\u0327\3\2\2\2\u035d"+
		"\u032a\3\2\2\2\u035d\u032d\3\2\2\2\u035d\u0330\3\2\2\2\u035d\u0333\3\2"+
		"\2\2\u035d\u0336\3\2\2\2\u035d\u033c\3\2\2\2\u035d\u033f\3\2\2\2\u035d"+
		"\u0341\3\2\2\2\u035d\u0346\3\2\2\2\u035d\u0350\3\2\2\2\u035d\u0353\3\2"+
		"\2\2\u035d\u0358\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360\u0083\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u0374\7i"+
		"\2\2\u0363\u0374\5\u00ba^\2\u0364\u0374\5\u00be`\2\u0365\u0374\5\u00c2"+
		"b\2\u0366\u0369\5\u00bc_\2\u0367\u0368\7$\2\2\u0368\u036a\7%\2\2\u0369"+
		"\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u0374\3\2\2\2\u036b\u0374\7}"+
		"\2\2\u036c\u0374\7x\2\2\u036d\u0374\5\u00b6\\\2\u036e\u0371\5\u00b8]\2"+
		"\u036f\u0370\7$\2\2\u0370\u0372\7%\2\2\u0371\u036f\3\2\2\2\u0371\u0372"+
		"\3\2\2\2\u0372\u0374\3\2\2\2\u0373\u0362\3\2\2\2\u0373\u0363\3\2\2\2\u0373"+
		"\u0364\3\2\2\2\u0373\u0365\3\2\2\2\u0373\u0366\3\2\2\2\u0373\u036b\3\2"+
		"\2\2\u0373\u036c\3\2\2\2\u0373\u036d\3\2\2\2\u0373\u036e\3\2\2\2\u0374"+
		"\u0085\3\2\2\2\u0375\u037a\5\u0082B\2\u0376\u0377\7\22\2\2\u0377\u0379"+
		"\5\u0082B\2\u0378\u0376\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2\2"+
		"\2\u037a\u037b\3\2\2\2\u037b\u0087\3\2\2\2\u037c\u037a\3\2\2\2\u037d\u0382"+
		"\5\u008aF\2\u037e\u037f\7\22\2\2\u037f\u0381\5\u008aF\2\u0380\u037e\3"+
		"\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0385\u0387\7\22\2\2\u0386\u0385\3"+
		"\2\2\2\u0386\u0387\3\2\2\2\u0387\u0089\3\2\2\2\u0388\u0389\5\u00bc_\2"+
		"\u0389\u038a\7@\2\2\u038a\u038b\5\u0082B\2\u038b\u008b\3\2\2\2\u038c\u038e"+
		"\7\21\2\2\u038d\u038f\5\u0088E\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2"+
		"\2\u038f\u0390\3\2\2\2\u0390\u0395\7\23\2\2\u0391\u0393\5\u0086D\2\u0392"+
		"\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394\u038c\3\2"+
		"\2\2\u0394\u0392\3\2\2\2\u0395\u008d\3\2\2\2\u0396\u0397\5\u0082B\2\u0397"+
		"\u0398\7\31\2\2\u0398\u0399\5\u008cG\2\u0399\u039a\7\32\2\2\u039a\u008f"+
		"\3\2\2\2\u039b\u039f\7\21\2\2\u039c\u039e\5\u0092J\2\u039d\u039c\3\2\2"+
		"\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2"+
		"\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a3\7\23\2\2\u03a3\u0091\3\2\2\2"+
		"\u03a4\u03b7\5\u00bc_\2\u03a5\u03b7\5\u0090I\2\u03a6\u03b7\5\u0094K\2"+
		"\u03a7\u03b7\5\u009aN\2\u03a8\u03b7\5\u009cO\2\u03a9\u03b7\5\u00a2R\2"+
		"\u03aa\u03b7\5\u00a4S\2\u03ab\u03b7\5\u00a6T\2\u03ac\u03b7\5\u00aaV\2"+
		"\u03ad\u03b7\5\u00aeX\2\u03ae\u03b7\5\u00b0Y\2\u03af\u03b7\7p\2\2\u03b0"+
		"\u03b7\7s\2\2\u03b1\u03b7\7t\2\2\u03b2\u03b7\5\u00b4[\2\u03b3\u03b7\5"+
		"\u00ba^\2\u03b4\u03b7\5\u00c2b\2\u03b5\u03b7\5\u00be`\2\u03b6\u03a4\3"+
		"\2\2\2\u03b6\u03a5\3\2\2\2\u03b6\u03a6\3\2\2\2\u03b6\u03a7\3\2\2\2\u03b6"+
		"\u03a8\3\2\2\2\u03b6\u03a9\3\2\2\2\u03b6\u03aa\3\2\2\2\u03b6\u03ab\3\2"+
		"\2\2\u03b6\u03ac\3\2\2\2\u03b6\u03ad\3\2\2\2\u03b6\u03ae\3\2\2\2\u03b6"+
		"\u03af\3\2\2\2\u03b6\u03b0\3\2\2\2\u03b6\u03b1\3\2\2\2\u03b6\u03b2\3\2"+
		"\2\2\u03b6\u03b3\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b5\3\2\2\2\u03b7"+
		"\u0093\3\2\2\2\u03b8\u03bc\5\u0098M\2\u03b9\u03bc\5\u00b2Z\2\u03ba\u03bc"+
		"\5\u0096L\2\u03bb\u03b8\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03ba\3\2\2"+
		"\2\u03bc\u0095\3\2\2\2\u03bd\u03be\5\u00bc_\2\u03be\u03bf\7\'\2\2\u03bf"+
		"\u03c0\5\u00bc_\2\u03c0\u0097\3\2\2\2\u03c1\u03c6\7\65\2\2\u03c2\u03c6"+
		"\7&\2\2\u03c3\u03c6\7<\2\2\u03c4\u03c6\5\u00bc_\2\u03c5\u03c1\3\2\2\2"+
		"\u03c5\u03c2\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c4\3\2\2\2\u03c6\u03d3"+
		"\3\2\2\2\u03c7\u03c9\7\31\2\2\u03c8\u03ca\5\u0094K\2\u03c9\u03c8\3\2\2"+
		"\2\u03c9\u03ca\3\2\2\2\u03ca\u03cf\3\2\2\2\u03cb\u03cc\7\22\2\2\u03cc"+
		"\u03ce\5\u0094K\2\u03cd\u03cb\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd"+
		"\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2"+
		"\u03d4\7\32\2\2\u03d3\u03c7\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u0099\3"+
		"\2\2\2\u03d5\u03d6\7[\2\2\u03d6\u03d9\5\u009eP\2\u03d7\u03d8\7\\\2\2\u03d8"+
		"\u03da\5\u0094K\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u009b"+
		"\3\2\2\2\u03db\u03dc\5\u009eP\2\u03dc\u03dd\7\\\2\2\u03dd\u03de\5\u0094"+
		"K\2\u03de\u009d\3\2\2\2\u03df\u03e6\5\u00bc_\2\u03e0\u03e6\5\u0096L\2"+
		"\u03e1\u03e2\7\31\2\2\u03e2\u03e3\5\u00a0Q\2\u03e3\u03e4\7\32\2\2\u03e4"+
		"\u03e6\3\2\2\2\u03e5\u03df\3\2\2\2\u03e5\u03e0\3\2\2\2\u03e5\u03e1\3\2"+
		"\2\2\u03e6\u009f\3\2\2\2\u03e7\u03ec\5\u00bc_\2\u03e8\u03e9\7\22\2\2\u03e9"+
		"\u03eb\5\u00bc_\2\u03ea\u03e8\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u00a1\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef"+
		"\u03f0\7]\2\2\u03f0\u03f1\5\u00bc_\2\u03f1\u00a3\3\2\2\2\u03f2\u03f3\5"+
		"\u00bc_\2\u03f3\u03f4\7@\2\2\u03f4\u00a5\3\2\2\2\u03f5\u03f6\7^\2\2\u03f6"+
		"\u03fa\5\u0094K\2\u03f7\u03f9\5\u00a8U\2\u03f8\u03f7\3\2\2\2\u03f9\u03fc"+
		"\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u00a7\3\2\2\2\u03fc"+
		"\u03fa\3\2\2\2\u03fd\u03fe\7_\2\2\u03fe\u03ff\5\u00b2Z\2\u03ff\u0400\5"+
		"\u0090I\2\u0400\u0404\3\2\2\2\u0401\u0402\7`\2\2\u0402\u0404\5\u0090I"+
		"\2\u0403\u03fd\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u00a9\3\2\2\2\u0405\u0406"+
		"\7 \2\2\u0406\u0407\5\u00bc_\2\u0407\u0409\7\31\2\2\u0408\u040a\5\u00a0"+
		"Q\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b"+
		"\u040d\7\32\2\2\u040c\u040e\5\u00acW\2\u040d\u040c\3\2\2\2\u040d\u040e"+
		"\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\5\u0090I\2\u0410\u00ab\3\2\2"+
		"\2\u0411\u0412\7a\2\2\u0412\u0413\5\u00a0Q\2\u0413\u00ad\3\2\2\2\u0414"+
		"\u0417\7\35\2\2\u0415\u0418\5\u0090I\2\u0416\u0418\5\u0094K\2\u0417\u0415"+
		"\3\2\2\2\u0417\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041c\5\u0094K"+
		"\2\u041a\u041d\5\u0090I\2\u041b\u041d\5\u0094K\2\u041c\u041a\3\2\2\2\u041c"+
		"\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\5\u0090I\2\u041f\u00af"+
		"\3\2\2\2\u0420\u0421\7-\2\2\u0421\u0422\5\u0094K\2\u0422\u0423\5\u0090"+
		"I\2\u0423\u00b1\3\2\2\2\u0424\u0429\5\u00c2b\2\u0425\u0429\7j\2\2\u0426"+
		"\u0429\7k\2\2\u0427\u0429\5\u00be`\2\u0428\u0424\3\2\2\2\u0428\u0425\3"+
		"\2\2\2\u0428\u0426\3\2\2\2\u0428\u0427\3\2\2\2\u0429\u00b3\3\2\2\2\u042a"+
		"\u042b\7\63\2\2\u042b\u042c\5\u00bc_\2\u042c\u042d\5\u0090I\2\u042d\u00b5"+
		"\3\2\2\2\u042e\u0430\7\31\2\2\u042f\u0431\5\u0082B\2\u0430\u042f\3\2\2"+
		"\2\u0430\u0431\3\2\2\2\u0431\u0438\3\2\2\2\u0432\u0434\7\22\2\2\u0433"+
		"\u0435\5\u0082B\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0437"+
		"\3\2\2\2\u0436\u0432\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u043b\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u0449\7\32"+
		"\2\2\u043c\u0445\7$\2\2\u043d\u0442\5\u0082B\2\u043e\u043f\7\22\2\2\u043f"+
		"\u0441\5\u0082B\2\u0440\u043e\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440"+
		"\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0445"+
		"\u043d\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0449\7%"+
		"\2\2\u0448\u042e\3\2\2\2\u0448\u043c\3\2\2\2\u0449\u00b7\3\2\2\2\u044a"+
		"\u044d\5\u0080A\2\u044b\u044d\5J&\2\u044c\u044a\3\2\2\2\u044c\u044b\3"+
		"\2\2\2\u044d\u00b9\3\2\2\2\u044e\u0450\t\17\2\2\u044f\u0451\7l\2\2\u0450"+
		"\u044f\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u00bb\3\2\2\2\u0452\u0453\t\20"+
		"\2\2\u0453\u00bd\3\2\2\2\u0454\u0456\7m\2\2\u0455\u0454\3\2\2\2\u0456"+
		"\u0457\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u00bf\3\2"+
		"\2\2\u0459\u0465\7c\2\2\u045a\u045b\7\31\2\2\u045b\u0460\5J&\2\u045c\u045d"+
		"\7\22\2\2\u045d\u045f\5J&\2\u045e\u045c\3\2\2\2\u045f\u0462\3\2\2\2\u0460"+
		"\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0463\3\2\2\2\u0462\u0460\3\2"+
		"\2\2\u0463\u0464\7\32\2\2\u0464\u0466\3\2\2\2\u0465\u045a\3\2\2\2\u0465"+
		"\u0466\3\2\2\2\u0466\u00c1\3\2\2\2\u0467\u0469\7\u0083\2\2\u0468\u0467"+
		"\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b"+
		"\u00c3\3\2\2\2\u0080\u00cd\u00cf\u00dd\u00e1\u00e6\u00ec\u00f0\u00f3\u00f8"+
		"\u00fe\u0105\u0109\u0116\u011e\u0123\u012d\u0130\u0136\u013e\u0141\u014c"+
		"\u0155\u0157\u015d\u0178\u0186\u0189\u0190\u0194\u0196\u019b\u01a0\u01a3"+
		"\u01a9\u01ad\u01b1\u01b6\u01c3\u01c5\u01cc\u01d6\u01dc\u01e7\u01ea\u01f0"+
		"\u01f3\u01fb\u01fe\u0204\u0207\u020f\u0212\u0218\u021c\u0227\u022c\u0231"+
		"\u0239\u023e\u024c\u024e\u0253\u025d\u0271\u027d\u0282\u0288\u028c\u028f"+
		"\u029b\u02a4\u02a8\u02ab\u02b2\u02c6\u02dc\u02e0\u02e5\u02e9\u02ed\u02f2"+
		"\u02f7\u02fb\u0313\u0349\u034d\u035d\u035f\u0369\u0371\u0373\u037a\u0382"+
		"\u0386\u038e\u0392\u0394\u039f\u03b6\u03bb\u03c5\u03c9\u03cf\u03d3\u03d9"+
		"\u03e5\u03ec\u03fa\u0403\u0409\u040d\u0417\u041c\u0428\u0430\u0434\u0438"+
		"\u0442\u0445\u0448\u044c\u0450\u0457\u0460\u0465\u046a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}