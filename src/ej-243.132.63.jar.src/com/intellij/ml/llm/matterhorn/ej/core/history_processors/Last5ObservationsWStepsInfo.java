/*   */ package com.intellij.ml.llm.matterhorn.ej.core.history_processors;
/*   */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
/*   */ import kotlin.coroutines.Continuation;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007¢\006\004\b\004\020\005J$\020\b\032\b\022\004\022\0020\0030\t2\006\020\n\032\0020\0022\006\020\013\032\0020\fH@¢\006\002\020\rR\016\020\006\032\0020\007XD¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsWStepsInfo;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsResponse;", "<init>", "()V", "MAX_FULL_USER_MSGS", "", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*   */ public final class Last5ObservationsWStepsInfo implements ArtifactRequestExecutor<AgentState, Last5ObservationsResponse> {
/* 8 */   private final int MAX_FULL_USER_MSGS = 5;
/*   */   
/*   */   @Nullable
/*   */   public Object produceArtifact(@NotNull AgentState input, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*   */     // Byte code:
/*   */     //   0: aload_3
/*   */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsWStepsInfo$produceArtifact$1
/*   */     //   4: ifeq -> 39
/*   */     //   7: aload_3
/*   */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsWStepsInfo$produceArtifact$1
/*   */     //   11: astore #8
/*   */     //   13: aload #8
/*   */     //   15: getfield label : I
/*   */     //   18: ldc -2147483648
/*   */     //   20: iand
/*   */     //   21: ifeq -> 39
/*   */     //   24: aload #8
/*   */     //   26: dup
/*   */     //   27: getfield label : I
/*   */     //   30: ldc -2147483648
/*   */     //   32: isub
/*   */     //   33: putfield label : I
/*   */     //   36: goto -> 50
/*   */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsWStepsInfo$produceArtifact$1
/*   */     //   42: dup
/*   */     //   43: aload_0
/*   */     //   44: aload_3
/*   */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsWStepsInfo;Lkotlin/coroutines/Continuation;)V
/*   */     //   48: astore #8
/*   */     //   50: aload #8
/*   */     //   52: getfield result : Ljava/lang/Object;
/*   */     //   55: astore #7
/*   */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*   */     //   60: astore #15
/*   */     //   62: aload #8
/*   */     //   64: getfield label : I
/*   */     //   67: tableswitch default -> 363, 0 -> 88, 1 -> 299
/*   */     //   88: aload #7
/*   */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   93: aload_2
/*   */     //   94: invokevirtual getRequest : ()Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*   */     //   97: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*   */     //   100: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*   */     //   103: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentArtifactTypes.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentArtifactTypes;
/*   */     //   106: invokevirtual getLast5ObservationsWStepsInfoArtifactType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*   */     //   109: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*   */     //   112: istore #4
/*   */     //   114: getstatic kotlin/_Assertions.ENABLED : Z
/*   */     //   117: ifeq -> 139
/*   */     //   120: iload #4
/*   */     //   122: ifne -> 139
/*   */     //   125: ldc 'Assertion failed'
/*   */     //   127: astore #5
/*   */     //   129: new java/lang/AssertionError
/*   */     //   132: dup
/*   */     //   133: aload #5
/*   */     //   135: invokespecial <init> : (Ljava/lang/Object;)V
/*   */     //   138: athrow
/*   */     //   139: aload_2
/*   */     //   140: invokevirtual getParent : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*   */     //   143: dup
/*   */     //   144: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*   */     //   147: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*   */     //   150: invokevirtual getName : ()Ljava/lang/String;
/*   */     //   153: checkcast java/lang/CharSequence
/*   */     //   156: ldc 'step'
/*   */     //   158: checkcast java/lang/CharSequence
/*   */     //   161: iconst_0
/*   */     //   162: iconst_2
/*   */     //   163: aconst_null
/*   */     //   164: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*   */     //   167: istore #4
/*   */     //   169: getstatic kotlin/_Assertions.ENABLED : Z
/*   */     //   172: ifeq -> 194
/*   */     //   175: iload #4
/*   */     //   177: ifne -> 194
/*   */     //   180: ldc 'Assertion failed'
/*   */     //   182: astore #5
/*   */     //   184: new java/lang/AssertionError
/*   */     //   187: dup
/*   */     //   188: aload #5
/*   */     //   190: invokespecial <init> : (Ljava/lang/Object;)V
/*   */     //   193: athrow
/*   */     //   194: aload_1
/*   */     //   195: invokevirtual getObservations : ()Ljava/util/List;
/*   */     //   198: invokeinterface isEmpty : ()Z
/*   */     //   203: ifeq -> 230
/*   */     //   206: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*   */     //   209: dup
/*   */     //   210: new com/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsResponse
/*   */     //   213: dup
/*   */     //   214: invokestatic emptyList : ()Ljava/util/List;
/*   */     //   217: invokestatic emptyList : ()Ljava/util/List;
/*   */     //   220: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
/*   */     //   223: aconst_null
/*   */     //   224: iconst_2
/*   */     //   225: aconst_null
/*   */     //   226: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*   */     //   229: areturn
/*   */     //   230: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsHistoryProcessor$Companion;
/*   */     //   233: aload_1
/*   */     //   234: invokevirtual getObservations : ()Ljava/util/List;
/*   */     //   237: aload_0
/*   */     //   238: getfield MAX_FULL_USER_MSGS : I
/*   */     //   241: invokevirtual shortenUserMessages : (Ljava/util/List;I)Lkotlin/Pair;
/*   */     //   244: astore #4
/*   */     //   246: aload #4
/*   */     //   248: invokevirtual component1 : ()Ljava/lang/Object;
/*   */     //   251: checkcast java/util/List
/*   */     //   254: astore #5
/*   */     //   256: aload #4
/*   */     //   258: invokevirtual component2 : ()Ljava/lang/Object;
/*   */     //   261: checkcast java/util/List
/*   */     //   264: astore #6
/*   */     //   266: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/AddStepsInfo$Companion;
/*   */     //   269: aload #5
/*   */     //   271: aload_2
/*   */     //   272: aload #8
/*   */     //   274: aload #8
/*   */     //   276: aload #6
/*   */     //   278: putfield L$0 : Ljava/lang/Object;
/*   */     //   281: aload #8
/*   */     //   283: iconst_1
/*   */     //   284: putfield label : I
/*   */     //   287: invokevirtual addStepsInfo : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*   */     //   290: dup
/*   */     //   291: aload #15
/*   */     //   293: if_acmpne -> 316
/*   */     //   296: aload #15
/*   */     //   298: areturn
/*   */     //   299: aload #8
/*   */     //   301: getfield L$0 : Ljava/lang/Object;
/*   */     //   304: checkcast java/util/List
/*   */     //   307: astore #6
/*   */     //   309: aload #7
/*   */     //   311: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   314: aload #7
/*   */     //   316: checkcast java/util/List
/*   */     //   319: aload #6
/*   */     //   321: astore #9
/*   */     //   323: astore #10
/*   */     //   325: new com/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsResponse
/*   */     //   328: dup
/*   */     //   329: aload #10
/*   */     //   331: aload #9
/*   */     //   333: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
/*   */     //   336: aconst_null
/*   */     //   337: iconst_2
/*   */     //   338: aconst_null
/*   */     //   339: astore #11
/*   */     //   341: istore #12
/*   */     //   343: astore #13
/*   */     //   345: astore #14
/*   */     //   347: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*   */     //   350: dup
/*   */     //   351: aload #14
/*   */     //   353: aload #13
/*   */     //   355: iload #12
/*   */     //   357: aload #11
/*   */     //   359: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*   */     //   362: areturn
/*   */     //   363: new java/lang/IllegalStateException
/*   */     //   366: dup
/*   */     //   367: ldc 'call to 'resume' before 'invoke' with coroutine'
/*   */     //   369: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   372: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #11	-> 60
/*   */     //   #12	-> 93
/*   */     //   #14	-> 139
/*   */     //   #15	-> 194
/*   */     //   #16	-> 206
/*   */     //   #17	-> 210
/*   */     //   #18	-> 214
/*   */     //   #19	-> 217
/*   */     //   #17	-> 220
/*   */     //   #16	-> 223
/*   */     //   #23	-> 230
/*   */     //   #24	-> 233
/*   */     //   #25	-> 237
/*   */     //   #23	-> 241
/*   */     //   #27	-> 266
/*   */     //   #28	-> 266
/*   */     //   #29	-> 266
/*   */     //   #11	-> 296
/*   */     //   #30	-> 319
/*   */     //   #28	-> 321
/*   */     //   #27	-> 336
/*   */     //   #11	-> 363
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   93	46	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsWStepsInfo;
/*   */     //   139	55	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsWStepsInfo;
/*   */     //   194	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsWStepsInfo;
/*   */     //   230	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsWStepsInfo;
/*   */     //   93	46	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*   */     //   139	55	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*   */     //   194	12	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*   */     //   230	7	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*   */     //   93	46	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*   */     //   139	55	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*   */     //   194	12	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*   */     //   230	60	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*   */     //   256	34	5	processedMessages	Ljava/util/List;
/*   */     //   266	33	6	collapsedMessages	Ljava/util/List;
/*   */     //   309	54	6	collapsedMessages	Ljava/util/List;
/*   */     //   0	373	3	$completion	Lkotlin/coroutines/Continuation;
/*   */     //   50	313	8	$continuation	Lkotlin/coroutines/Continuation;
/*   */     //   57	306	7	$result	Ljava/lang/Object;
/*   */   }
/*   */   
/*   */   @DebugMetadata(f = "Last5ObservationsWStepsInfo.kt", l = {29}, i = {0}, s = {"L$0"}, n = {"collapsedMessages"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.Last5ObservationsWStepsInfo")
/*   */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*   */   static final class Last5ObservationsWStepsInfo$produceArtifact$1 extends ContinuationImpl {
/*   */     Object L$0;
/*   */     int label;
/*   */     
/*   */     Last5ObservationsWStepsInfo$produceArtifact$1(Continuation $completion) {
/*   */       super($completion);
/*   */     }
/*   */     
/*   */     @Nullable
/*   */     public final Object invokeSuspend(@NotNull Object $result) {
/*   */       this.result = $result;
/*   */       this.label |= Integer.MIN_VALUE;
/*   */       return Last5ObservationsWStepsInfo.this.produceArtifact((AgentState)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<Last5ObservationsResponse>>)this);
/*   */     }
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\Last5ObservationsWStepsInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */