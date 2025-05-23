/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Argument;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.ActionLocation;
/*     */ import com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.ActionLocationsExtractor;
/*     */ import com.intellij.ml.llm.matterhorn.ej.idea.run.RunEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.idea.run.TestResult;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ArgumentType;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000l\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\020\000\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\004\030\000 .2\0020\001:\002-.B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024JP\020\025\032\016\022\004\022\0020\027\022\004\022\0020\0300\026*\0020\0312\f\020\032\032\b\022\004\022\0020\0330\t2\"\020\034\032\036\b\001\022\004\022\0020\036\022\n\022\b\022\004\022\0020 0\037\022\006\022\004\030\0010!0\035H@¢\006\002\020\"J\f\020#\032\0020\005*\0020\031H\002J\024\020$\032\0020\005*\0020\0332\006\020%\032\0020\031H\002J\026\020&\032\0020\0052\f\020'\032\b\022\004\022\0020\0050\tH\002J*\020(\032\b\022\004\022\0020)0\t2\f\020*\032\b\022\004\022\0020+0\t2\006\020\022\032\0020\023H@¢\006\002\020,R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\007¨\006/"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPathActionLocations", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$ArgumentActionLocations;", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "extractors", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;", "mustIgnore", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/coroutines/Continuation;", "", "", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notFoundMessage", "locationsNotFoundMessage", "query", "convertToParseArgumentsText", "messages", "runTestActions", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunResult;", "locations", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ArgumentActionLocations", "Companion", "ej-idea"})
/*     */ @SourceDebugExtension({"SMAP\nRunTestAgentAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunTestAgentAction.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,275:1\n295#2,2:276\n774#2:278\n865#2,2:279\n1863#2,2:281\n1557#2:283\n1628#2,3:284\n14#3:287\n*S KotlinDebug\n*F\n+ 1 RunTestAgentAction.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction\n*L\n129#1:276,2\n174#1:278\n174#1:279,2\n178#1:281,2\n186#1:283\n186#1:284,3\n192#1:287\n*E\n"})
/*     */ public final class RunTestAgentAction implements AgentAction {
/*     */   public RunTestAgentAction() {
/*  28 */     Argument[] arrayOfArgument = new Argument[2]; arrayOfArgument[0] = new Argument(
/*  29 */         "path", 
/*  30 */         ArgumentType.STRING, 
/*  31 */         "absolute path to the test file relative to project root or fully qualified class name or directory path with test files. Also accepts a list of such paths/FQNs separated by `;`", false, false, 24, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  37 */     ArgumentType argumentType = ArgumentType.STRING; arrayOfArgument[1] = new Argument("testName", argumentType, 
/*     */         
/*  39 */         "optional test name", true, false, 16, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.arguments = CollectionsKt.listOf((Object[])arrayOfArgument);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     this.docstring = "Runs unit tests in the specified file(s) or directory.\n\nThe command accepts four types of arguments:\n1. Full path to test file(s) relative to project root (e.g. 'full/path/to/MyTest.java')\n2. Fully qualified class name(s) (e.g. 'com.example.MyTest')\n3. Full path to directory with test files (e.g. 'absolute/path/to/example/directory')\n4. Optional name of test (e.g. 'testMyTestName')\n\nYou can run tests from multiple sources at once by separating them with `;`. \nWhenever possible, use this instead of running the command multiple times.\nNote: You can only run all tests from a file at once if name of test is not provided, otherwise run only one test.\n\nIMPORTANT: Always use full paths relative to project root. Short paths like 'MyTest.java' or partial paths like 'example/MyTest.java' will not work.\n\nYou can enhance debugging by adding logging to your tests:\n- Always start debug messages with `[DEBUG_LOG]` prefix\n- Java: `System.out.println(\"[DEBUG_LOG] Your message here\")`\n- Kotlin: `println(\"[DEBUG_LOG] Your message here\")`\n\n#### Examples \n- `run_test full/path/from/repository/root/to/DockerTest.kt`  # Full path to test file\n- `run_test com.example.DockerTest`  # Fully qualified class name\n- `run_test full/path/to/example/directory`  # Directory with test files\n- `run_test absolute/path/to/DockerTest.kt;com.company.ConfigTest`  # Multiple tests\n- `run_test absolute/path/to/MyTestTest.kt testName`  # One test";
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) {
/*     */     return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getCustomSignature() {
/*     */     return AgentAction.DefaultImpls.getCustomSignature(this);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getName() {
/*     */     return "run_test";
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public List<Argument> getArguments() {
/*     */     return this.arguments;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getDocstring() {
/*     */     return this.docstring;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$execute$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$execute$1
/*     */     //   11: astore #20
/*     */     //   13: aload #20
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #20
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$execute$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #20
/*     */     //   50: aload #20
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #19
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #21
/*     */     //   62: aload #20
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1056, 0 -> 104, 1 -> 143, 2 -> 521, 3 -> 804, 4 -> 954, 5 -> 1024
/*     */     //   104: aload #19
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: aload_0
/*     */     //   110: aload_1
/*     */     //   111: aload #20
/*     */     //   113: aload #20
/*     */     //   115: aload_0
/*     */     //   116: putfield L$0 : Ljava/lang/Object;
/*     */     //   119: aload #20
/*     */     //   121: aload_2
/*     */     //   122: putfield L$1 : Ljava/lang/Object;
/*     */     //   125: aload #20
/*     */     //   127: iconst_1
/*     */     //   128: putfield label : I
/*     */     //   131: invokevirtual getInputParams : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   134: dup
/*     */     //   135: aload #21
/*     */     //   137: if_acmpne -> 168
/*     */     //   140: aload #21
/*     */     //   142: areturn
/*     */     //   143: aload #20
/*     */     //   145: getfield L$1 : Ljava/lang/Object;
/*     */     //   148: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   151: astore_2
/*     */     //   152: aload #20
/*     */     //   154: getfield L$0 : Ljava/lang/Object;
/*     */     //   157: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction
/*     */     //   160: astore_0
/*     */     //   161: aload #19
/*     */     //   163: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   166: aload #19
/*     */     //   168: checkcast java/util/Map
/*     */     //   171: astore #4
/*     */     //   173: aload #4
/*     */     //   175: ldc 'path'
/*     */     //   177: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   182: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   185: invokestatic tryGetNonEmptyStringValue : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/String;
/*     */     //   188: dup
/*     */     //   189: ifnonnull -> 196
/*     */     //   192: pop
/*     */     //   193: ldc 'ERROR: Path argument is missing'
/*     */     //   195: areturn
/*     */     //   196: astore #5
/*     */     //   198: aload #5
/*     */     //   200: checkcast java/lang/CharSequence
/*     */     //   203: iconst_1
/*     */     //   204: anewarray java/lang/String
/*     */     //   207: astore #7
/*     */     //   209: aload #7
/*     */     //   211: iconst_0
/*     */     //   212: ldc ';'
/*     */     //   214: aastore
/*     */     //   215: aload #7
/*     */     //   217: iconst_0
/*     */     //   218: iconst_0
/*     */     //   219: bipush #6
/*     */     //   221: aconst_null
/*     */     //   222: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   225: astore #6
/*     */     //   227: aload #4
/*     */     //   229: ldc 'testName'
/*     */     //   231: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   236: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   239: dup
/*     */     //   240: ifnull -> 249
/*     */     //   243: invokevirtual getValue : ()Ljava/lang/String;
/*     */     //   246: goto -> 251
/*     */     //   249: pop
/*     */     //   250: aconst_null
/*     */     //   251: astore #7
/*     */     //   253: new java/lang/StringBuilder
/*     */     //   256: dup
/*     */     //   257: invokespecial <init> : ()V
/*     */     //   260: astore #9
/*     */     //   262: aload #9
/*     */     //   264: astore #10
/*     */     //   266: iconst_0
/*     */     //   267: istore #11
/*     */     //   269: aload #10
/*     */     //   271: ldc 'Run test '
/*     */     //   273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   276: pop
/*     */     //   277: aload #10
/*     */     //   279: aload #5
/*     */     //   281: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   284: pop
/*     */     //   285: aload #7
/*     */     //   287: ifnull -> 303
/*     */     //   290: aload #10
/*     */     //   292: aload #7
/*     */     //   294: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   302: pop
/*     */     //   303: nop
/*     */     //   304: aload #9
/*     */     //   306: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   309: dup
/*     */     //   310: ldc 'toString(...)'
/*     */     //   312: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   315: astore #8
/*     */     //   317: aload #8
/*     */     //   319: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Tests : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*     */     //   322: aload_2
/*     */     //   323: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*     */     //   326: aload_2
/*     */     //   327: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   332: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   335: astore #9
/*     */     //   337: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Companion;
/*     */     //   340: aload_2
/*     */     //   341: invokevirtual getExtractors : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)Ljava/util/List;
/*     */     //   344: astore #10
/*     */     //   346: new java/util/ArrayList
/*     */     //   349: dup
/*     */     //   350: invokespecial <init> : ()V
/*     */     //   353: checkcast java/util/List
/*     */     //   356: astore #11
/*     */     //   358: new java/util/ArrayList
/*     */     //   361: dup
/*     */     //   362: invokespecial <init> : ()V
/*     */     //   365: checkcast java/util/List
/*     */     //   368: astore #12
/*     */     //   370: iconst_0
/*     */     //   371: istore #13
/*     */     //   373: aload #6
/*     */     //   375: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   380: astore #14
/*     */     //   382: aload #14
/*     */     //   384: invokeinterface hasNext : ()Z
/*     */     //   389: ifeq -> 688
/*     */     //   392: aload #14
/*     */     //   394: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   399: checkcast java/lang/String
/*     */     //   402: astore #15
/*     */     //   404: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Companion;
/*     */     //   407: aload #15
/*     */     //   409: aload #7
/*     */     //   411: invokevirtual createQuery : (Ljava/lang/String;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*     */     //   414: astore #16
/*     */     //   416: aload_0
/*     */     //   417: aload #16
/*     */     //   419: aload #10
/*     */     //   421: aload_2
/*     */     //   422: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   427: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   430: invokevirtual getMustIgnore : ()Lkotlin/jvm/functions/Function2;
/*     */     //   433: aload #20
/*     */     //   435: aload #20
/*     */     //   437: aload_0
/*     */     //   438: putfield L$0 : Ljava/lang/Object;
/*     */     //   441: aload #20
/*     */     //   443: aload_2
/*     */     //   444: putfield L$1 : Ljava/lang/Object;
/*     */     //   447: aload #20
/*     */     //   449: aload #7
/*     */     //   451: putfield L$2 : Ljava/lang/Object;
/*     */     //   454: aload #20
/*     */     //   456: aload #8
/*     */     //   458: putfield L$3 : Ljava/lang/Object;
/*     */     //   461: aload #20
/*     */     //   463: aload #9
/*     */     //   465: putfield L$4 : Ljava/lang/Object;
/*     */     //   468: aload #20
/*     */     //   470: aload #10
/*     */     //   472: putfield L$5 : Ljava/lang/Object;
/*     */     //   475: aload #20
/*     */     //   477: aload #11
/*     */     //   479: putfield L$6 : Ljava/lang/Object;
/*     */     //   482: aload #20
/*     */     //   484: aload #12
/*     */     //   486: putfield L$7 : Ljava/lang/Object;
/*     */     //   489: aload #20
/*     */     //   491: aload #14
/*     */     //   493: putfield L$8 : Ljava/lang/Object;
/*     */     //   496: aload #20
/*     */     //   498: iload #13
/*     */     //   500: putfield I$0 : I
/*     */     //   503: aload #20
/*     */     //   505: iconst_2
/*     */     //   506: putfield label : I
/*     */     //   509: invokespecial getPathActionLocations : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   512: dup
/*     */     //   513: aload #21
/*     */     //   515: if_acmpne -> 623
/*     */     //   518: aload #21
/*     */     //   520: areturn
/*     */     //   521: aload #20
/*     */     //   523: getfield I$0 : I
/*     */     //   526: istore #13
/*     */     //   528: aload #20
/*     */     //   530: getfield L$8 : Ljava/lang/Object;
/*     */     //   533: checkcast java/util/Iterator
/*     */     //   536: astore #14
/*     */     //   538: aload #20
/*     */     //   540: getfield L$7 : Ljava/lang/Object;
/*     */     //   543: checkcast java/util/List
/*     */     //   546: astore #12
/*     */     //   548: aload #20
/*     */     //   550: getfield L$6 : Ljava/lang/Object;
/*     */     //   553: checkcast java/util/List
/*     */     //   556: astore #11
/*     */     //   558: aload #20
/*     */     //   560: getfield L$5 : Ljava/lang/Object;
/*     */     //   563: checkcast java/util/List
/*     */     //   566: astore #10
/*     */     //   568: aload #20
/*     */     //   570: getfield L$4 : Ljava/lang/Object;
/*     */     //   573: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   576: astore #9
/*     */     //   578: aload #20
/*     */     //   580: getfield L$3 : Ljava/lang/Object;
/*     */     //   583: checkcast java/lang/String
/*     */     //   586: astore #8
/*     */     //   588: aload #20
/*     */     //   590: getfield L$2 : Ljava/lang/Object;
/*     */     //   593: checkcast java/lang/String
/*     */     //   596: astore #7
/*     */     //   598: aload #20
/*     */     //   600: getfield L$1 : Ljava/lang/Object;
/*     */     //   603: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   606: astore_2
/*     */     //   607: aload #20
/*     */     //   609: getfield L$0 : Ljava/lang/Object;
/*     */     //   612: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction
/*     */     //   615: astore_0
/*     */     //   616: aload #19
/*     */     //   618: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   621: aload #19
/*     */     //   623: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   626: astore #17
/*     */     //   628: aload #17
/*     */     //   630: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   633: ifeq -> 642
/*     */     //   636: iconst_1
/*     */     //   637: istore #13
/*     */     //   639: goto -> 688
/*     */     //   642: aload #17
/*     */     //   644: invokestatic getOrNull : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;)Ljava/lang/Object;
/*     */     //   647: dup
/*     */     //   648: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   651: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$ArgumentActionLocations
/*     */     //   654: astore #18
/*     */     //   656: aload #11
/*     */     //   658: aload #18
/*     */     //   660: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   663: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   668: pop
/*     */     //   669: aload #12
/*     */     //   671: aload #18
/*     */     //   673: invokevirtual getLocations : ()Ljava/util/List;
/*     */     //   676: checkcast java/util/Collection
/*     */     //   679: invokeinterface addAll : (Ljava/util/Collection;)Z
/*     */     //   684: pop
/*     */     //   685: goto -> 382
/*     */     //   688: aload #9
/*     */     //   690: invokevirtual getHumanInLoop : ()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   693: astore #14
/*     */     //   695: aload #14
/*     */     //   697: new com/intellij/ml/llm/matterhorn/HumanInLoopAction$RunTestsAction
/*     */     //   700: dup
/*     */     //   701: aload #8
/*     */     //   703: iload #13
/*     */     //   705: ifeq -> 712
/*     */     //   708: iconst_1
/*     */     //   709: goto -> 713
/*     */     //   712: iconst_0
/*     */     //   713: invokespecial <init> : (Ljava/lang/String;Z)V
/*     */     //   716: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction
/*     */     //   719: aload #20
/*     */     //   721: aload #20
/*     */     //   723: aload_0
/*     */     //   724: putfield L$0 : Ljava/lang/Object;
/*     */     //   727: aload #20
/*     */     //   729: aload_2
/*     */     //   730: putfield L$1 : Ljava/lang/Object;
/*     */     //   733: aload #20
/*     */     //   735: aload #11
/*     */     //   737: putfield L$2 : Ljava/lang/Object;
/*     */     //   740: aload #20
/*     */     //   742: aload #12
/*     */     //   744: putfield L$3 : Ljava/lang/Object;
/*     */     //   747: aload #20
/*     */     //   749: aconst_null
/*     */     //   750: putfield L$4 : Ljava/lang/Object;
/*     */     //   753: aload #20
/*     */     //   755: aconst_null
/*     */     //   756: putfield L$5 : Ljava/lang/Object;
/*     */     //   759: aload #20
/*     */     //   761: aconst_null
/*     */     //   762: putfield L$6 : Ljava/lang/Object;
/*     */     //   765: aload #20
/*     */     //   767: aconst_null
/*     */     //   768: putfield L$7 : Ljava/lang/Object;
/*     */     //   771: aload #20
/*     */     //   773: aconst_null
/*     */     //   774: putfield L$8 : Ljava/lang/Object;
/*     */     //   777: aload #20
/*     */     //   779: iload #13
/*     */     //   781: putfield I$0 : I
/*     */     //   784: aload #20
/*     */     //   786: iconst_3
/*     */     //   787: putfield label : I
/*     */     //   790: invokeinterface shouldAllowAction : (Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   795: dup
/*     */     //   796: aload #21
/*     */     //   798: if_acmpne -> 856
/*     */     //   801: aload #21
/*     */     //   803: areturn
/*     */     //   804: aload #20
/*     */     //   806: getfield I$0 : I
/*     */     //   809: istore #13
/*     */     //   811: aload #20
/*     */     //   813: getfield L$3 : Ljava/lang/Object;
/*     */     //   816: checkcast java/util/List
/*     */     //   819: astore #12
/*     */     //   821: aload #20
/*     */     //   823: getfield L$2 : Ljava/lang/Object;
/*     */     //   826: checkcast java/util/List
/*     */     //   829: astore #11
/*     */     //   831: aload #20
/*     */     //   833: getfield L$1 : Ljava/lang/Object;
/*     */     //   836: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   839: astore_2
/*     */     //   840: aload #20
/*     */     //   842: getfield L$0 : Ljava/lang/Object;
/*     */     //   845: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction
/*     */     //   848: astore_0
/*     */     //   849: aload #19
/*     */     //   851: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   854: aload #19
/*     */     //   856: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopResponse
/*     */     //   859: astore #15
/*     */     //   861: aload #15
/*     */     //   863: instanceof com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Disagree
/*     */     //   866: ifeq -> 884
/*     */     //   869: iload #13
/*     */     //   871: ifeq -> 880
/*     */     //   874: ldc_w 'Human rejected launching the test. Also the file is under .aiignore. Try doing something else.'
/*     */     //   877: goto -> 883
/*     */     //   880: ldc_w 'Human rejected launching the test. Try doing something else.'
/*     */     //   883: areturn
/*     */     //   884: aload_0
/*     */     //   885: aload #11
/*     */     //   887: invokespecial convertToParseArgumentsText : (Ljava/util/List;)Ljava/lang/String;
/*     */     //   890: astore #16
/*     */     //   892: aload #12
/*     */     //   894: invokeinterface isEmpty : ()Z
/*     */     //   899: ifeq -> 905
/*     */     //   902: aload #16
/*     */     //   904: areturn
/*     */     //   905: aload_0
/*     */     //   906: aload #12
/*     */     //   908: aload_2
/*     */     //   909: aload #20
/*     */     //   911: aload #20
/*     */     //   913: aload_2
/*     */     //   914: putfield L$0 : Ljava/lang/Object;
/*     */     //   917: aload #20
/*     */     //   919: aload #16
/*     */     //   921: putfield L$1 : Ljava/lang/Object;
/*     */     //   924: aload #20
/*     */     //   926: aconst_null
/*     */     //   927: putfield L$2 : Ljava/lang/Object;
/*     */     //   930: aload #20
/*     */     //   932: aconst_null
/*     */     //   933: putfield L$3 : Ljava/lang/Object;
/*     */     //   936: aload #20
/*     */     //   938: iconst_4
/*     */     //   939: putfield label : I
/*     */     //   942: invokespecial runTestActions : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   945: dup
/*     */     //   946: aload #21
/*     */     //   948: if_acmpne -> 980
/*     */     //   951: aload #21
/*     */     //   953: areturn
/*     */     //   954: aload #20
/*     */     //   956: getfield L$1 : Ljava/lang/Object;
/*     */     //   959: checkcast java/lang/String
/*     */     //   962: astore #16
/*     */     //   964: aload #20
/*     */     //   966: getfield L$0 : Ljava/lang/Object;
/*     */     //   969: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   972: astore_2
/*     */     //   973: aload #19
/*     */     //   975: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   978: aload #19
/*     */     //   980: checkcast java/util/List
/*     */     //   983: astore #17
/*     */     //   985: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/RunResultPresentation.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunResultPresentation;
/*     */     //   988: aload #17
/*     */     //   990: aload_2
/*     */     //   991: aload #20
/*     */     //   993: aload #20
/*     */     //   995: aload #16
/*     */     //   997: putfield L$0 : Ljava/lang/Object;
/*     */     //   1000: aload #20
/*     */     //   1002: aconst_null
/*     */     //   1003: putfield L$1 : Ljava/lang/Object;
/*     */     //   1006: aload #20
/*     */     //   1008: iconst_5
/*     */     //   1009: putfield label : I
/*     */     //   1012: invokevirtual present : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1015: dup
/*     */     //   1016: aload #21
/*     */     //   1018: if_acmpne -> 1041
/*     */     //   1021: aload #21
/*     */     //   1023: areturn
/*     */     //   1024: aload #20
/*     */     //   1026: getfield L$0 : Ljava/lang/Object;
/*     */     //   1029: checkcast java/lang/String
/*     */     //   1032: astore #16
/*     */     //   1034: aload #19
/*     */     //   1036: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1039: aload #19
/*     */     //   1041: checkcast java/lang/String
/*     */     //   1044: astore #18
/*     */     //   1046: aload #16
/*     */     //   1048: aload #18
/*     */     //   1050: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1055: areturn
/*     */     //   1056: new java/lang/IllegalStateException
/*     */     //   1059: dup
/*     */     //   1060: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1063: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1066: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #70	-> 60
/*     */     //   #72	-> 109
/*     */     //   #70	-> 140
/*     */     //   #73	-> 173
/*     */     //   #74	-> 198
/*     */     //   #75	-> 227
/*     */     //   #77	-> 253
/*     */     //   #78	-> 269
/*     */     //   #79	-> 277
/*     */     //   #80	-> 285
/*     */     //   #81	-> 303
/*     */     //   #77	-> 304
/*     */     //   #77	-> 315
/*     */     //   #83	-> 317
/*     */     //   #85	-> 326
/*     */     //   #87	-> 337
/*     */     //   #88	-> 346
/*     */     //   #88	-> 356
/*     */     //   #89	-> 358
/*     */     //   #89	-> 368
/*     */     //   #90	-> 370
/*     */     //   #91	-> 373
/*     */     //   #92	-> 404
/*     */     //   #93	-> 416
/*     */     //   #70	-> 518
/*     */     //   #94	-> 628
/*     */     //   #95	-> 636
/*     */     //   #96	-> 639
/*     */     //   #98	-> 642
/*     */     //   #99	-> 656
/*     */     //   #100	-> 669
/*     */     //   #103	-> 688
/*     */     //   #104	-> 695
/*     */     //   #70	-> 801
/*     */     //   #105	-> 861
/*     */     //   #106	-> 869
/*     */     //   #107	-> 874
/*     */     //   #109	-> 880
/*     */     //   #106	-> 883
/*     */     //   #113	-> 884
/*     */     //   #114	-> 892
/*     */     //   #115	-> 902
/*     */     //   #118	-> 905
/*     */     //   #70	-> 951
/*     */     //   #119	-> 985
/*     */     //   #70	-> 1021
/*     */     //   #120	-> 1046
/*     */     //   #70	-> 1056
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   161	31	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   196	108	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   304	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   315	41	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   356	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   368	153	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   616	26	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   642	162	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   849	20	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   884	18	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   905	40	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   109	25	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   109	34	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   152	40	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   196	108	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   304	11	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   315	41	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   356	12	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   368	153	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   607	35	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   642	162	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   840	29	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   884	70	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   973	42	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   173	19	4	params	Ljava/util/Map;
/*     */     //   196	43	4	params	Ljava/util/Map;
/*     */     //   198	87	5	query	Ljava/lang/String;
/*     */     //   227	77	6	paths	Ljava/util/List;
/*     */     //   304	11	6	paths	Ljava/util/List;
/*     */     //   315	41	6	paths	Ljava/util/List;
/*     */     //   356	12	6	paths	Ljava/util/List;
/*     */     //   368	14	6	paths	Ljava/util/List;
/*     */     //   253	51	7	testName	Ljava/lang/String;
/*     */     //   304	11	7	testName	Ljava/lang/String;
/*     */     //   315	41	7	testName	Ljava/lang/String;
/*     */     //   356	12	7	testName	Ljava/lang/String;
/*     */     //   368	153	7	testName	Ljava/lang/String;
/*     */     //   598	38	7	testName	Ljava/lang/String;
/*     */     //   642	46	7	testName	Ljava/lang/String;
/*     */     //   317	39	8	name	Ljava/lang/String;
/*     */     //   356	12	8	name	Ljava/lang/String;
/*     */     //   368	153	8	name	Ljava/lang/String;
/*     */     //   588	54	8	name	Ljava/lang/String;
/*     */     //   642	70	8	name	Ljava/lang/String;
/*     */     //   337	19	9	root	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   356	12	9	root	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   368	153	9	root	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   578	64	9	root	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   642	53	9	root	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   266	37	10	$this$execute_u24lambda_u240	Ljava/lang/StringBuilder;
/*     */     //   346	10	10	extractors	Ljava/util/List;
/*     */     //   356	12	10	extractors	Ljava/util/List;
/*     */     //   368	153	10	extractors	Ljava/util/List;
/*     */     //   568	68	10	extractors	Ljava/util/List;
/*     */     //   642	46	10	extractors	Ljava/util/List;
/*     */     //   358	10	11	parseArgumentMessages	Ljava/util/List;
/*     */     //   368	153	11	parseArgumentMessages	Ljava/util/List;
/*     */     //   558	84	11	parseArgumentMessages	Ljava/util/List;
/*     */     //   642	162	11	parseArgumentMessages	Ljava/util/List;
/*     */     //   831	38	11	parseArgumentMessages	Ljava/util/List;
/*     */     //   884	8	11	parseArgumentMessages	Ljava/util/List;
/*     */     //   370	151	12	actionLocations	Ljava/util/List;
/*     */     //   548	94	12	actionLocations	Ljava/util/List;
/*     */     //   642	162	12	actionLocations	Ljava/util/List;
/*     */     //   821	48	12	actionLocations	Ljava/util/List;
/*     */     //   884	18	12	actionLocations	Ljava/util/List;
/*     */     //   905	40	12	actionLocations	Ljava/util/List;
/*     */     //   373	148	13	underAIIgnore	Z
/*     */     //   528	108	13	underAIIgnore	Z
/*     */     //   639	3	13	underAIIgnore	Z
/*     */     //   642	162	13	underAIIgnore	Z
/*     */     //   811	63	13	underAIIgnore	Z
/*     */     //   695	17	14	humanInLoop	Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   404	12	15	path	Ljava/lang/String;
/*     */     //   861	8	15	mayBeVeto	Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;
/*     */     //   416	96	16	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*     */     //   892	62	16	parseArgumentsText	Ljava/lang/String;
/*     */     //   964	60	16	parseArgumentsText	Ljava/lang/String;
/*     */     //   1034	22	16	parseArgumentsText	Ljava/lang/String;
/*     */     //   628	56	17	actionLocationsResult	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   985	30	17	runResults	Ljava/util/List;
/*     */     //   656	28	18	locations	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$ArgumentActionLocations;
/*     */     //   1046	10	18	runTextResult	Ljava/lang/String;
/*     */     //   269	35	11	$i$a$-buildString-RunTestAgentAction$execute$name$1	I
/*     */     //   0	1067	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1006	20	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	999	19	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\035\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\017\020\r\032\b\022\004\022\0020\0040\003HÆ\003J\t\020\016\032\0020\006HÆ\003J#\020\017\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\006HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\013\020\f¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$ArgumentActionLocations;", "", "locations", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "message", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getLocations", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-idea"})
/*     */   public static final class ArgumentActionLocations
/*     */   {
/*     */     @NotNull
/*     */     private final List<ActionLocation> locations;
/*     */     @NotNull
/*     */     private final String message;
/*     */     
/*     */     public ArgumentActionLocations(@NotNull List<ActionLocation> locations, @NotNull String message) {
/* 123 */       this.locations = locations; this.message = message; } @NotNull public final List<ActionLocation> getLocations() { return this.locations; } @NotNull public final String getMessage() { return this.message; }
/*     */     
/*     */     @NotNull
/*     */     public final List<ActionLocation> component1() {
/*     */       return this.locations;
/*     */     }
/*     */     @NotNull
/*     */     public final String component2() {
/*     */       return this.message;
/*     */     }
/*     */     @NotNull
/*     */     public final ArgumentActionLocations copy(@NotNull List<? extends ActionLocation> locations, @NotNull String message) {
/*     */       Intrinsics.checkNotNullParameter(locations, "locations");
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       return new ArgumentActionLocations(locations, message);
/*     */     }
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "ArgumentActionLocations(locations=" + this.locations + ", message=" + this.message + ")";
/*     */     }
/*     */     public int hashCode() {
/*     */       result = this.locations.hashCode();
/*     */       return result * 31 + this.message.hashCode();
/*     */     }
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof ArgumentActionLocations))
/*     */         return false; 
/*     */       ArgumentActionLocations argumentActionLocations = (ArgumentActionLocations)other;
/*     */       return !Intrinsics.areEqual(this.locations, argumentActionLocations.locations) ? false : (!!Intrinsics.areEqual(this.message, argumentActionLocations.message));
/*     */     } }
/*     */   private final Object getPathActionLocations(ActionLocationsExtractor.Query $this$getPathActionLocations, List extractors, Function2 mustIgnore, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$getPathActionLocations$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$getPathActionLocations$1
/*     */     //   13: astore #13
/*     */     //   15: aload #13
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #13
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$getPathActionLocations$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #13
/*     */     //   53: aload #13
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #12
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #14
/*     */     //   65: aload #13
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 532, 0 -> 96, 1 -> 203, 2 -> 363
/*     */     //   96: aload #12
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_2
/*     */     //   102: checkcast java/lang/Iterable
/*     */     //   105: astore #6
/*     */     //   107: iconst_0
/*     */     //   108: istore #7
/*     */     //   110: aload #6
/*     */     //   112: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   117: astore #8
/*     */     //   119: aload #8
/*     */     //   121: invokeinterface hasNext : ()Z
/*     */     //   126: ifeq -> 274
/*     */     //   129: aload #8
/*     */     //   131: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   136: astore #9
/*     */     //   138: aload #9
/*     */     //   140: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor
/*     */     //   143: astore #10
/*     */     //   145: iconst_0
/*     */     //   146: istore #11
/*     */     //   148: aload #10
/*     */     //   150: aload_1
/*     */     //   151: aload #13
/*     */     //   153: aload #13
/*     */     //   155: aload_0
/*     */     //   156: putfield L$0 : Ljava/lang/Object;
/*     */     //   159: aload #13
/*     */     //   161: aload_1
/*     */     //   162: putfield L$1 : Ljava/lang/Object;
/*     */     //   165: aload #13
/*     */     //   167: aload_3
/*     */     //   168: putfield L$2 : Ljava/lang/Object;
/*     */     //   171: aload #13
/*     */     //   173: aload #8
/*     */     //   175: putfield L$3 : Ljava/lang/Object;
/*     */     //   178: aload #13
/*     */     //   180: aload #9
/*     */     //   182: putfield L$4 : Ljava/lang/Object;
/*     */     //   185: aload #13
/*     */     //   187: iconst_1
/*     */     //   188: putfield label : I
/*     */     //   191: invokevirtual matches : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   194: dup
/*     */     //   195: aload #14
/*     */     //   197: if_acmpne -> 260
/*     */     //   200: aload #14
/*     */     //   202: areturn
/*     */     //   203: iconst_0
/*     */     //   204: istore #7
/*     */     //   206: iconst_0
/*     */     //   207: istore #11
/*     */     //   209: aload #13
/*     */     //   211: getfield L$4 : Ljava/lang/Object;
/*     */     //   214: astore #9
/*     */     //   216: aload #13
/*     */     //   218: getfield L$3 : Ljava/lang/Object;
/*     */     //   221: checkcast java/util/Iterator
/*     */     //   224: astore #8
/*     */     //   226: aload #13
/*     */     //   228: getfield L$2 : Ljava/lang/Object;
/*     */     //   231: checkcast kotlin/jvm/functions/Function2
/*     */     //   234: astore_3
/*     */     //   235: aload #13
/*     */     //   237: getfield L$1 : Ljava/lang/Object;
/*     */     //   240: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query
/*     */     //   243: astore_1
/*     */     //   244: aload #13
/*     */     //   246: getfield L$0 : Ljava/lang/Object;
/*     */     //   249: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction
/*     */     //   252: astore_0
/*     */     //   253: aload #12
/*     */     //   255: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   258: aload #12
/*     */     //   260: checkcast java/lang/Boolean
/*     */     //   263: invokevirtual booleanValue : ()Z
/*     */     //   266: ifeq -> 119
/*     */     //   269: aload #9
/*     */     //   271: goto -> 275
/*     */     //   274: aconst_null
/*     */     //   275: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor
/*     */     //   278: astore #5
/*     */     //   280: aload #5
/*     */     //   282: ifnonnull -> 308
/*     */     //   285: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   288: dup
/*     */     //   289: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$ArgumentActionLocations
/*     */     //   292: dup
/*     */     //   293: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   296: aload_0
/*     */     //   297: aload_1
/*     */     //   298: invokespecial notFoundMessage : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;)Ljava/lang/String;
/*     */     //   301: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;)V
/*     */     //   304: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   307: areturn
/*     */     //   308: aload #5
/*     */     //   310: aload_1
/*     */     //   311: aload_3
/*     */     //   312: aload #13
/*     */     //   314: aload #13
/*     */     //   316: aload_0
/*     */     //   317: putfield L$0 : Ljava/lang/Object;
/*     */     //   320: aload #13
/*     */     //   322: aload_1
/*     */     //   323: putfield L$1 : Ljava/lang/Object;
/*     */     //   326: aload #13
/*     */     //   328: aload #5
/*     */     //   330: putfield L$2 : Ljava/lang/Object;
/*     */     //   333: aload #13
/*     */     //   335: aconst_null
/*     */     //   336: putfield L$3 : Ljava/lang/Object;
/*     */     //   339: aload #13
/*     */     //   341: aconst_null
/*     */     //   342: putfield L$4 : Ljava/lang/Object;
/*     */     //   345: aload #13
/*     */     //   347: iconst_2
/*     */     //   348: putfield label : I
/*     */     //   351: invokevirtual extract : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   354: dup
/*     */     //   355: aload #14
/*     */     //   357: if_acmpne -> 398
/*     */     //   360: aload #14
/*     */     //   362: areturn
/*     */     //   363: aload #13
/*     */     //   365: getfield L$2 : Ljava/lang/Object;
/*     */     //   368: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor
/*     */     //   371: astore #5
/*     */     //   373: aload #13
/*     */     //   375: getfield L$1 : Ljava/lang/Object;
/*     */     //   378: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query
/*     */     //   381: astore_1
/*     */     //   382: aload #13
/*     */     //   384: getfield L$0 : Ljava/lang/Object;
/*     */     //   387: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction
/*     */     //   390: astore_0
/*     */     //   391: aload #12
/*     */     //   393: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   396: aload #12
/*     */     //   398: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   401: astore #6
/*     */     //   403: aload #6
/*     */     //   405: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   408: ifeq -> 414
/*     */     //   411: aload #6
/*     */     //   413: areturn
/*     */     //   414: aload #6
/*     */     //   416: invokestatic getOrNull : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;)Ljava/lang/Object;
/*     */     //   419: dup
/*     */     //   420: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   423: checkcast java/util/List
/*     */     //   426: astore #7
/*     */     //   428: aload #7
/*     */     //   430: invokeinterface isEmpty : ()Z
/*     */     //   435: ifeq -> 463
/*     */     //   438: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   441: dup
/*     */     //   442: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$ArgumentActionLocations
/*     */     //   445: dup
/*     */     //   446: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   449: aload_0
/*     */     //   450: aload #5
/*     */     //   452: aload_1
/*     */     //   453: invokespecial locationsNotFoundMessage : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;)Ljava/lang/String;
/*     */     //   456: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;)V
/*     */     //   459: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   462: areturn
/*     */     //   463: aload #7
/*     */     //   465: invokeinterface size : ()I
/*     */     //   470: bipush #20
/*     */     //   472: if_icmple -> 512
/*     */     //   475: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   478: dup
/*     */     //   479: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$ArgumentActionLocations
/*     */     //   482: dup
/*     */     //   483: aload #7
/*     */     //   485: checkcast java/lang/Iterable
/*     */     //   488: bipush #20
/*     */     //   490: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */     //   493: aload #7
/*     */     //   495: invokeinterface size : ()I
/*     */     //   500: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   505: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;)V
/*     */     //   508: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   511: areturn
/*     */     //   512: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   515: dup
/*     */     //   516: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$ArgumentActionLocations
/*     */     //   519: dup
/*     */     //   520: aload #7
/*     */     //   522: ldc_w ''
/*     */     //   525: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;)V
/*     */     //   528: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   531: areturn
/*     */     //   532: new java/lang/IllegalStateException
/*     */     //   535: dup
/*     */     //   536: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   539: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   542: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #125	-> 63
/*     */     //   #129	-> 101
/*     */     //   #276	-> 110
/*     */     //   #129	-> 148
/*     */     //   #125	-> 200
/*     */     //   #129	-> 260
/*     */     //   #276	-> 266
/*     */     //   #277	-> 274
/*     */     //   #129	-> 275
/*     */     //   #130	-> 280
/*     */     //   #131	-> 285
/*     */     //   #134	-> 308
/*     */     //   #125	-> 360
/*     */     //   #136	-> 403
/*     */     //   #137	-> 411
/*     */     //   #139	-> 414
/*     */     //   #140	-> 428
/*     */     //   #141	-> 438
/*     */     //   #142	-> 446
/*     */     //   #143	-> 449
/*     */     //   #141	-> 456
/*     */     //   #145	-> 463
/*     */     //   #146	-> 475
/*     */     //   #147	-> 483
/*     */     //   #149	-> 493
/*     */     //   #146	-> 505
/*     */     //   #153	-> 512
/*     */     //   #154	-> 520
/*     */     //   #155	-> 522
/*     */     //   #153	-> 525
/*     */     //   #125	-> 532
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	102	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   253	13	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   266	8	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   274	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   275	88	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   391	141	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;
/*     */     //   101	102	1	$this$getPathActionLocations	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*     */     //   244	22	1	$this$getPathActionLocations	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*     */     //   266	8	1	$this$getPathActionLocations	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*     */     //   274	1	1	$this$getPathActionLocations	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*     */     //   275	88	1	$this$getPathActionLocations	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*     */     //   382	150	1	$this$getPathActionLocations	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*     */     //   101	6	2	extractors	Ljava/util/List;
/*     */     //   101	102	3	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   235	31	3	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   266	8	3	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   274	1	3	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   275	10	3	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   308	46	3	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   280	83	5	suitableExtractor	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;
/*     */     //   373	159	5	suitableExtractor	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;
/*     */     //   107	12	6	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */     //   403	129	6	locationsResult	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   428	104	7	locations	Ljava/util/List;
/*     */     //   138	65	9	element$iv	Ljava/lang/Object;
/*     */     //   216	58	9	element$iv	Ljava/lang/Object;
/*     */     //   145	49	10	it	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;
/*     */     //   148	55	11	$i$a$-firstOrNull-RunTestAgentAction$getPathActionLocations$suitableExtractor$1	I
/*     */     //   110	93	7	$i$f$firstOrNull	I
/*     */     //   0	543	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	479	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	472	12	$result	Ljava/lang/Object;
/*     */     //   209	57	11	$i$a$-firstOrNull-RunTestAgentAction$getPathActionLocations$suitableExtractor$1	I
/*     */     //   206	69	7	$i$f$firstOrNull	I
/*     */   }
/*     */   
/* 159 */   private final String notFoundMessage(ActionLocationsExtractor.Query $this$notFoundMessage) { ActionLocationsExtractor.Query query = $this$notFoundMessage;
/*     */     
/* 161 */     if (query instanceof ActionLocationsExtractor.Query.SingleTest) {  }
/*     */     else
/*     */     { throw new NoWhenBranchMatchedException(); }
/* 164 */      return (query instanceof ActionLocationsExtractor.Query.RawPath) ? ("ERROR: Path `" + ((ActionLocationsExtractor.Query.RawPath)$this$notFoundMessage).getPath() + "` not found") : "JD-Core does not support Kotlin"; } private final String locationsNotFoundMessage(ActionLocationsExtractor $this$locationsNotFoundMessage, ActionLocationsExtractor.Query query) { ActionLocationsExtractor.Query query1 = query;
/*     */ 
/*     */ 
/*     */     
/* 168 */     if (query1 instanceof ActionLocationsExtractor.Query.SingleTest) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     }  return (query1 instanceof ActionLocationsExtractor.Query.RawPath) ? ("ERROR: No tests found inside " + $this$locationsNotFoundMessage.getSource() + " `" + ((ActionLocationsExtractor.Query.RawPath)query).getPath() + "`") : "JD-Core does not support Kotlin"; } private final String convertToParseArgumentsText(List messages) { StringBuilder stringBuilder1, $this$convertToParseArgumentsText_u24lambda_u244;
/*     */     Iterator iterator;
/* 174 */     Iterable $this$filter$iv = messages; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 278 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 279 */     for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-RunTestAgentAction$convertToParseArgumentsText$errorMessages$1 = 0; if ((StringsKt.trim(it).toString().length() > 0)) destination$iv$iv.add(element$iv$iv);  }
/* 280 */      List errorMessages = (List)destination$iv$iv; if (!errorMessages.isEmpty())
/* 281 */     { $this$convertToParseArgumentsText_u24lambda_u244 = stringBuilder1 = new StringBuilder(); int $i$a$-buildString-RunTestAgentAction$convertToParseArgumentsText$1 = 0; Intrinsics.checkNotNullExpressionValue($this$convertToParseArgumentsText_u24lambda_u244.append("ERROR: Problems with arguments parsing:"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$convertToParseArgumentsText_u24lambda_u244.append("ERROR: Problems with arguments parsing:").append('\n'), "append(...)"); $this$convertToParseArgumentsText_u24lambda_u244.append("ERROR: Problems with arguments parsing:").append('\n'); Iterable $this$forEach$iv = messages; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { return ""; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); String it = (String)element$iv; int $i$a$-forEach-RunTestAgentAction$convertToParseArgumentsText$1$1 = 0; Intrinsics.checkNotNullExpressionValue($this$convertToParseArgumentsText_u24lambda_u244.append("- " + it), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$convertToParseArgumentsText_u24lambda_u244.append("- " + it).append('\n'), "append(...)"); $this$convertToParseArgumentsText_u24lambda_u244.append("- " + it).append('\n'); }  Intrinsics.checkNotNullExpressionValue($this$convertToParseArgumentsText_u24lambda_u244.append('\n'), "append(...)"); $this$convertToParseArgumentsText_u24lambda_u244.append('\n'); Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)"); return stringBuilder1.toString(); }
/*     */   private final Object runTestActions(List locations, ExecutionAgentContext context, Continuation $completion) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$runTestActions$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$runTestActions$1
/*     */     //   11: astore #15
/*     */     //   13: aload #15
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #15
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$runTestActions$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #15
/*     */     //   50: aload #15
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #14
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #16
/*     */     //   62: aload #15
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 299, 0 -> 88, 1 -> 222
/*     */     //   88: aload #14
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: checkcast java/lang/Iterable
/*     */     //   97: astore #4
/*     */     //   99: iconst_0
/*     */     //   100: istore #5
/*     */     //   102: aload #4
/*     */     //   104: astore #6
/*     */     //   106: new java/util/ArrayList
/*     */     //   109: dup
/*     */     //   110: aload #4
/*     */     //   112: bipush #10
/*     */     //   114: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   117: invokespecial <init> : (I)V
/*     */     //   120: checkcast java/util/Collection
/*     */     //   123: astore #7
/*     */     //   125: iconst_0
/*     */     //   126: istore #8
/*     */     //   128: aload #6
/*     */     //   130: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   135: astore #9
/*     */     //   137: aload #9
/*     */     //   139: invokeinterface hasNext : ()Z
/*     */     //   144: ifeq -> 292
/*     */     //   147: aload #9
/*     */     //   149: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   154: astore #10
/*     */     //   156: aload #7
/*     */     //   158: aload #10
/*     */     //   160: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation
/*     */     //   163: astore #11
/*     */     //   165: astore #13
/*     */     //   167: iconst_0
/*     */     //   168: istore #12
/*     */     //   170: aload #11
/*     */     //   172: aload_2
/*     */     //   173: aload #15
/*     */     //   175: aload #15
/*     */     //   177: aload_2
/*     */     //   178: putfield L$0 : Ljava/lang/Object;
/*     */     //   181: aload #15
/*     */     //   183: aload #7
/*     */     //   185: putfield L$1 : Ljava/lang/Object;
/*     */     //   188: aload #15
/*     */     //   190: aload #9
/*     */     //   192: putfield L$2 : Ljava/lang/Object;
/*     */     //   195: aload #15
/*     */     //   197: aload #13
/*     */     //   199: putfield L$3 : Ljava/lang/Object;
/*     */     //   202: aload #15
/*     */     //   204: iconst_1
/*     */     //   205: putfield label : I
/*     */     //   208: invokeinterface runAction : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   213: dup
/*     */     //   214: aload #16
/*     */     //   216: if_acmpne -> 277
/*     */     //   219: aload #16
/*     */     //   221: areturn
/*     */     //   222: iconst_0
/*     */     //   223: istore #5
/*     */     //   225: iconst_0
/*     */     //   226: istore #8
/*     */     //   228: iconst_0
/*     */     //   229: istore #12
/*     */     //   231: aload #15
/*     */     //   233: getfield L$3 : Ljava/lang/Object;
/*     */     //   236: checkcast java/util/Collection
/*     */     //   239: astore #13
/*     */     //   241: aload #15
/*     */     //   243: getfield L$2 : Ljava/lang/Object;
/*     */     //   246: checkcast java/util/Iterator
/*     */     //   249: astore #9
/*     */     //   251: aload #15
/*     */     //   253: getfield L$1 : Ljava/lang/Object;
/*     */     //   256: checkcast java/util/Collection
/*     */     //   259: astore #7
/*     */     //   261: aload #15
/*     */     //   263: getfield L$0 : Ljava/lang/Object;
/*     */     //   266: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   269: astore_2
/*     */     //   270: aload #14
/*     */     //   272: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   275: aload #14
/*     */     //   277: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunResult
/*     */     //   280: aload #13
/*     */     //   282: swap
/*     */     //   283: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   288: pop
/*     */     //   289: goto -> 137
/*     */     //   292: aload #7
/*     */     //   294: checkcast java/util/List
/*     */     //   297: nop
/*     */     //   298: areturn
/*     */     //   299: new java/lang/IllegalStateException
/*     */     //   302: dup
/*     */     //   303: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   306: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   309: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #185	-> 60
/*     */     //   #186	-> 93
/*     */     //   #283	-> 102
/*     */     //   #284	-> 128
/*     */     //   #285	-> 156
/*     */     //   #187	-> 170
/*     */     //   #185	-> 219
/*     */     //   #187	-> 277
/*     */     //   #285	-> 283
/*     */     //   #286	-> 292
/*     */     //   #283	-> 297
/*     */     //   #186	-> 298
/*     */     //   #185	-> 299
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	6	1	locations	Ljava/util/List;
/*     */     //   93	129	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   270	29	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   99	26	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   125	12	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   125	97	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   261	33	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   156	11	10	item$iv$iv	Ljava/lang/Object;
/*     */     //   167	46	11	it	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;
/*     */     //   170	52	12	$i$a$-map-RunTestAgentAction$runTestActions$2	I
/*     */     //   128	94	8	$i$f$mapTo	I
/*     */     //   102	120	5	$i$f$map	I
/*     */     //   0	310	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	249	15	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	242	14	$result	Ljava/lang/Object;
/*     */     //   231	49	12	$i$a$-map-RunTestAgentAction$runTestActions$2	I
/*     */     //   228	66	8	$i$f$mapTo	I
/*     */     //   225	73	5	$i$f$map	I }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J$\020\013\032\0020\f2\006\020\r\032\0020\0072\f\020\016\032\b\022\004\022\0020\0200\017H@¢\006\002\020\021R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007XT¢\006\002\n\000R\016\020\b\032\0020\007XT¢\006\002\n\000R\016\020\t\032\0020\007XT¢\006\002\n\000R\016\020\n\032\0020\007XT¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "DEBUG_LOG_PREFIX", "", "PATH_ARGUMENT", "TEST_NAME", "PATH_SEPARATOR", "handleEvents", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunResult;", "classFQName", "events", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunEvent;", "(Ljava/lang/String;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-idea"}) public static final class Companion {
/*     */     private Companion() {} @Nullable public final Object handleEvents(@NotNull String classFQName, @NotNull Flow events, @NotNull Continuation $completion) { // Byte code:
/*     */       //   0: aload_3
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion$handleEvents$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_3
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion$handleEvents$1
/*     */       //   11: astore #9
/*     */       //   13: aload #9
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #9
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion$handleEvents$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_3
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #9
/*     */       //   50: aload #9
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #8
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #10
/*     */       //   62: aload #9
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 324, 0 -> 88, 1 -> 221
/*     */       //   88: aload #8
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: new java/util/ArrayList
/*     */       //   96: dup
/*     */       //   97: invokespecial <init> : ()V
/*     */       //   100: checkcast java/util/List
/*     */       //   103: astore #4
/*     */       //   105: new java/util/ArrayList
/*     */       //   108: dup
/*     */       //   109: invokespecial <init> : ()V
/*     */       //   112: checkcast java/util/List
/*     */       //   115: astore #5
/*     */       //   117: new java/util/ArrayList
/*     */       //   120: dup
/*     */       //   121: invokespecial <init> : ()V
/*     */       //   124: checkcast java/util/List
/*     */       //   127: astore #6
/*     */       //   129: invokestatic access$getLogger$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   132: invokevirtual isDebugEnabled : ()Z
/*     */       //   135: ifeq -> 156
/*     */       //   138: aload_2
/*     */       //   139: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion$handleEvents$eventsWithMaybeLogging$1
/*     */       //   142: dup
/*     */       //   143: aconst_null
/*     */       //   144: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */       //   147: checkcast kotlin/jvm/functions/Function2
/*     */       //   150: invokestatic onEach : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
/*     */       //   153: goto -> 157
/*     */       //   156: aload_2
/*     */       //   157: astore #7
/*     */       //   159: aload #7
/*     */       //   161: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion$handleEvents$2
/*     */       //   164: dup
/*     */       //   165: aload #4
/*     */       //   167: aload #5
/*     */       //   169: aload_1
/*     */       //   170: aload #6
/*     */       //   172: invokespecial <init> : (Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V
/*     */       //   175: checkcast kotlinx/coroutines/flow/FlowCollector
/*     */       //   178: aload #9
/*     */       //   180: aload #9
/*     */       //   182: aload #4
/*     */       //   184: putfield L$0 : Ljava/lang/Object;
/*     */       //   187: aload #9
/*     */       //   189: aload #5
/*     */       //   191: putfield L$1 : Ljava/lang/Object;
/*     */       //   194: aload #9
/*     */       //   196: aload #6
/*     */       //   198: putfield L$2 : Ljava/lang/Object;
/*     */       //   201: aload #9
/*     */       //   203: iconst_1
/*     */       //   204: putfield label : I
/*     */       //   207: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   212: dup
/*     */       //   213: aload #10
/*     */       //   215: if_acmpne -> 258
/*     */       //   218: aload #10
/*     */       //   220: areturn
/*     */       //   221: aload #9
/*     */       //   223: getfield L$2 : Ljava/lang/Object;
/*     */       //   226: checkcast java/util/List
/*     */       //   229: astore #6
/*     */       //   231: aload #9
/*     */       //   233: getfield L$1 : Ljava/lang/Object;
/*     */       //   236: checkcast java/util/List
/*     */       //   239: astore #5
/*     */       //   241: aload #9
/*     */       //   243: getfield L$0 : Ljava/lang/Object;
/*     */       //   246: checkcast java/util/List
/*     */       //   249: astore #4
/*     */       //   251: aload #8
/*     */       //   253: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   256: aload #8
/*     */       //   258: pop
/*     */       //   259: aload #4
/*     */       //   261: checkcast java/util/Collection
/*     */       //   264: invokeinterface isEmpty : ()Z
/*     */       //   269: ifne -> 276
/*     */       //   272: iconst_1
/*     */       //   273: goto -> 277
/*     */       //   276: iconst_0
/*     */       //   277: ifeq -> 310
/*     */       //   280: aload #5
/*     */       //   282: invokeinterface isEmpty : ()Z
/*     */       //   287: ifeq -> 310
/*     */       //   290: aload #6
/*     */       //   292: invokeinterface isEmpty : ()Z
/*     */       //   297: ifeq -> 310
/*     */       //   300: new com/intellij/ml/llm/matterhorn/ej/idea/actions/BuildFailed
/*     */       //   303: dup
/*     */       //   304: aload #4
/*     */       //   306: invokespecial <init> : (Ljava/util/List;)V
/*     */       //   309: areturn
/*     */       //   310: new com/intellij/ml/llm/matterhorn/ej/idea/actions/TestsResult
/*     */       //   313: dup
/*     */       //   314: aload #5
/*     */       //   316: aload #6
/*     */       //   318: aload #4
/*     */       //   320: invokespecial <init> : (Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
/*     */       //   323: areturn
/*     */       //   324: new java/lang/IllegalStateException
/*     */       //   327: dup
/*     */       //   328: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   330: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   333: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #199	-> 60
/*     */       //   #200	-> 93
/*     */       //   #200	-> 103
/*     */       //   #201	-> 105
/*     */       //   #201	-> 115
/*     */       //   #202	-> 117
/*     */       //   #202	-> 127
/*     */       //   #203	-> 129
/*     */       //   #204	-> 138
/*     */       //   #208	-> 156
/*     */       //   #203	-> 157
/*     */       //   #210	-> 159
/*     */       //   #199	-> 218
/*     */       //   #234	-> 258
/*     */       //   #234	-> 277
/*     */       //   #235	-> 300
/*     */       //   #237	-> 310
/*     */       //   #199	-> 324
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   93	10	1	classFQName	Ljava/lang/String;
/*     */       //   103	12	1	classFQName	Ljava/lang/String;
/*     */       //   115	12	1	classFQName	Ljava/lang/String;
/*     */       //   127	85	1	classFQName	Ljava/lang/String;
/*     */       //   93	10	2	events	Lkotlinx/coroutines/flow/Flow;
/*     */       //   103	12	2	events	Lkotlinx/coroutines/flow/Flow;
/*     */       //   115	12	2	events	Lkotlinx/coroutines/flow/Flow;
/*     */       //   127	29	2	events	Lkotlinx/coroutines/flow/Flow;
/*     */       //   156	1	2	events	Lkotlinx/coroutines/flow/Flow;
/*     */       //   105	10	4	buildMessages	Ljava/util/List;
/*     */       //   115	12	4	buildMessages	Ljava/util/List;
/*     */       //   127	94	4	buildMessages	Ljava/util/List;
/*     */       //   251	26	4	buildMessages	Ljava/util/List;
/*     */       //   277	33	4	buildMessages	Ljava/util/List;
/*     */       //   310	14	4	buildMessages	Ljava/util/List;
/*     */       //   117	10	5	passedTestNames	Ljava/util/List;
/*     */       //   127	94	5	passedTestNames	Ljava/util/List;
/*     */       //   241	36	5	passedTestNames	Ljava/util/List;
/*     */       //   277	23	5	passedTestNames	Ljava/util/List;
/*     */       //   310	14	5	passedTestNames	Ljava/util/List;
/*     */       //   129	92	6	failedTests	Ljava/util/List;
/*     */       //   231	46	6	failedTests	Ljava/util/List;
/*     */       //   277	23	6	failedTests	Ljava/util/List;
/*     */       //   310	14	6	failedTests	Ljava/util/List;
/*     */       //   159	53	7	eventsWithMaybeLogging	Lkotlinx/coroutines/flow/Flow;
/*     */       //   0	334	3	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	274	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	267	8	$result	Ljava/lang/Object; } @DebugMetadata(f = "RunTestAgentAction.kt", l = {210}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"buildMessages", "passedTestNames", "failedTests"}, m = "handleEvents", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.RunTestAgentAction$Companion") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class RunTestAgentAction$Companion$handleEvents$1 extends ContinuationImpl {
/*     */       Object L$0; Object L$1; Object L$2; int label; RunTestAgentAction$Companion$handleEvents$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return RunTestAgentAction.Companion.this.handleEvents(null, null, (Continuation<? super RunResult>)this); } } @DebugMetadata(f = "RunTestAgentAction.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.RunTestAgentAction$Companion$handleEvents$eventsWithMaybeLogging$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunEvent;"}) static final class RunTestAgentAction$Companion$handleEvents$eventsWithMaybeLogging$1 extends SuspendLambda implements Function2<RunEvent, Continuation<? super Unit>, Object> {
/*     */       int label; RunTestAgentAction$Companion$handleEvents$eventsWithMaybeLogging$1(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { RunEvent it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (RunEvent)this.L$0; RunTestAgentAction.logger.debug(it.toString()); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super RunTestAgentAction$Companion$handleEvents$eventsWithMaybeLogging$1> $completion) { RunTestAgentAction$Companion$handleEvents$eventsWithMaybeLogging$1 runTestAgentAction$Companion$handleEvents$eventsWithMaybeLogging$1 = new RunTestAgentAction$Companion$handleEvents$eventsWithMaybeLogging$1($completion); runTestAgentAction$Companion$handleEvents$eventsWithMaybeLogging$1.L$0 = value; return (Continuation<Unit>)runTestAgentAction$Companion$handleEvents$eventsWithMaybeLogging$1; } public final Object invoke(RunEvent p1, Continuation<?> p2) { return ((RunTestAgentAction$Companion$handleEvents$eventsWithMaybeLogging$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class RunTestAgentAction$Companion$handleEvents$2<T> implements FlowCollector {
/*     */       public final Object emit(RunEvent it, Continuation $completion) { // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: astore_3
/*     */         //   2: aload_3
/*     */         //   3: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent
/*     */         //   6: ifeq -> 46
/*     */         //   9: aload_0
/*     */         //   10: getfield $buildMessages : Ljava/util/List;
/*     */         //   13: new com/intellij/ml/llm/matterhorn/ej/idea/actions/BuildMessage
/*     */         //   16: dup
/*     */         //   17: aload_1
/*     */         //   18: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent
/*     */         //   21: invokevirtual getPosition : ()Lcom/intellij/build/FilePosition;
/*     */         //   24: aload_1
/*     */         //   25: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent
/*     */         //   28: invokevirtual getMessage : ()Ljava/lang/String;
/*     */         //   31: invokespecial <init> : (Lcom/intellij/build/FilePosition;Ljava/lang/String;)V
/*     */         //   34: invokeinterface add : (Ljava/lang/Object;)Z
/*     */         //   39: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */         //   42: pop
/*     */         //   43: goto -> 228
/*     */         //   46: aload_3
/*     */         //   47: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/BuildStartEvent
/*     */         //   50: ifne -> 228
/*     */         //   53: aload_3
/*     */         //   54: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/BuildStartedEvent
/*     */         //   57: ifne -> 228
/*     */         //   60: aload_3
/*     */         //   61: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/OutputEvent
/*     */         //   64: ifne -> 228
/*     */         //   67: aload_3
/*     */         //   68: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/RunFinishedEvent
/*     */         //   71: ifne -> 228
/*     */         //   74: aload_3
/*     */         //   75: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/RunStartedEvent
/*     */         //   78: ifne -> 228
/*     */         //   81: aload_3
/*     */         //   82: instanceof com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
/*     */         //   85: ifeq -> 220
/*     */         //   88: aload_1
/*     */         //   89: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
/*     */         //   92: invokevirtual getTestResult : ()Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestResult;
/*     */         //   95: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion$handleEvents$2$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */         //   98: swap
/*     */         //   99: invokevirtual ordinal : ()I
/*     */         //   102: iaload
/*     */         //   103: tableswitch default -> 205, 1 -> 124, 2 -> 154
/*     */         //   124: aload_0
/*     */         //   125: getfield $passedTestNames : Ljava/util/List;
/*     */         //   128: new com/intellij/ml/llm/matterhorn/ej/idea/actions/PassedTest
/*     */         //   131: dup
/*     */         //   132: aload_0
/*     */         //   133: getfield $classFQName : Ljava/lang/String;
/*     */         //   136: aload_1
/*     */         //   137: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
/*     */         //   140: invokevirtual getName : ()Ljava/lang/String;
/*     */         //   143: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*     */         //   146: invokeinterface add : (Ljava/lang/Object;)Z
/*     */         //   151: goto -> 213
/*     */         //   154: aload_0
/*     */         //   155: getfield $failedTests : Ljava/util/List;
/*     */         //   158: new com/intellij/ml/llm/matterhorn/ej/idea/actions/FailedTest
/*     */         //   161: dup
/*     */         //   162: aload_0
/*     */         //   163: getfield $classFQName : Ljava/lang/String;
/*     */         //   166: aload_1
/*     */         //   167: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
/*     */         //   170: invokevirtual getName : ()Ljava/lang/String;
/*     */         //   173: aload_1
/*     */         //   174: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
/*     */         //   177: invokevirtual getText : ()Ljava/lang/String;
/*     */         //   180: aload_1
/*     */         //   181: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
/*     */         //   184: invokevirtual getStackTrace : ()Ljava/lang/String;
/*     */         //   187: aload_1
/*     */         //   188: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent
/*     */         //   191: invokevirtual getErrorMessage : ()Ljava/lang/String;
/*     */         //   194: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */         //   197: invokeinterface add : (Ljava/lang/Object;)Z
/*     */         //   202: goto -> 213
/*     */         //   205: new kotlin/NoWhenBranchMatchedException
/*     */         //   208: dup
/*     */         //   209: invokespecial <init> : ()V
/*     */         //   212: athrow
/*     */         //   213: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */         //   216: pop
/*     */         //   217: goto -> 228
/*     */         //   220: new kotlin/NoWhenBranchMatchedException
/*     */         //   223: dup
/*     */         //   224: invokespecial <init> : ()V
/*     */         //   227: athrow
/*     */         //   228: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */         //   231: areturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #211	-> 0
/*     */         //   #212	-> 2
/*     */         //   #213	-> 46
/*     */         //   #214	-> 53
/*     */         //   #215	-> 60
/*     */         //   #216	-> 67
/*     */         //   #217	-> 74
/*     */         //   #218	-> 81
/*     */         //   #219	-> 88
/*     */         //   #220	-> 124
/*     */         //   #221	-> 154
/*     */         //   #222	-> 158
/*     */         //   #223	-> 162
/*     */         //   #224	-> 166
/*     */         //   #225	-> 173
/*     */         //   #226	-> 180
/*     */         //   #227	-> 187
/*     */         //   #222	-> 194
/*     */         //   #221	-> 197
/*     */         //   #219	-> 205
/*     */         //   #211	-> 220
/*     */         //   #233	-> 228
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	232	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion$handleEvents$2;
/*     */         //   0	232	1	it	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunEvent;
/* 287 */         //   0	232	2	$completion	Lkotlin/coroutines/Continuation; } RunTestAgentAction$Companion$handleEvents$2(List<BuildMessage> $buildMessages, List<PassedTest> $passedTestNames, String $classFQName, List<FailedTest> $failedTests) {} } } static { int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(RunTestAgentAction.class), "getInstance(...)"); } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final List<Argument> arguments; @NotNull private final String docstring; @NotNull private static final Logger logger = Logger.getInstance(RunTestAgentAction.class);
/*     */   @NotNull
/*     */   public static final String DEBUG_LOG_PREFIX = "[DEBUG_LOG]";
/*     */   @NotNull
/*     */   public static final String PATH_ARGUMENT = "path";
/*     */   @NotNull
/*     */   public static final String TEST_NAME = "testName";
/*     */   @NotNull
/*     */   public static final String PATH_SEPARATOR = ";";
/*     */   
/*     */   @DebugMetadata(f = "RunTestAgentAction.kt", l = {72, 93, 104, 118, 119}, i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 4}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$0"}, n = {"this", "context", "this", "context", "testName", "name", "root", "extractors", "parseArgumentMessages", "actionLocations", "underAIIgnore", "this", "context", "parseArgumentMessages", "actionLocations", "underAIIgnore", "context", "parseArgumentsText", "parseArgumentsText"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.RunTestAgentAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RunTestAgentAction$execute$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     Object L$7;
/*     */     Object L$8;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     RunTestAgentAction$execute$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RunTestAgentAction.this.execute(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RunTestAgentAction.kt", l = {129, 134}, i = {0, 0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2"}, n = {"this", "$this$getPathActionLocations", "mustIgnore", "element$iv", "this", "$this$getPathActionLocations", "suitableExtractor"}, m = "getPathActionLocations", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.RunTestAgentAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RunTestAgentAction$getPathActionLocations$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     RunTestAgentAction$getPathActionLocations$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RunTestAgentAction.this.getPathActionLocations(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RunTestAgentAction.kt", l = {187}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"context", "destination$iv$iv"}, m = "runTestActions", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.RunTestAgentAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RunTestAgentAction$runTestActions$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     RunTestAgentAction$runTestActions$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RunTestAgentAction.this.runTestActions(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\RunTestAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */