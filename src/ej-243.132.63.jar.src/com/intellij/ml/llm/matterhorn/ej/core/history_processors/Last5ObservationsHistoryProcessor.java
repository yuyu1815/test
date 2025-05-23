/*    */ package com.intellij.ml.llm.matterhorn.ej.core.history_processors;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentObservation;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin._Assertions;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\000 \0162\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\016B\007¢\006\004\b\004\020\005J$\020\b\032\b\022\004\022\0020\0030\t2\006\020\n\032\0020\0022\006\020\013\032\0020\fH@¢\006\002\020\rR\016\020\006\032\0020\007XD¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsHistoryProcessor;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsResponse;", "<init>", "()V", "MAX_FULL_USER_MSGS", "", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*    */ public final class Last5ObservationsHistoryProcessor implements ArtifactRequestExecutor<AgentState, Last5ObservationsResponse> {
/* 23 */   private final int MAX_FULL_USER_MSGS = 5;
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object produceArtifact(@NotNull AgentState input, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/* 28 */     boolean bool = Intrinsics.areEqual(context.getRequest().getArtifact().getType(), AgentArtifactTypes.INSTANCE.getLast5ObservationsArtifactType()); if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/* 29 */      if (input.getObservations().isEmpty()) {
/* 30 */       return new ArtifactResponse(new Last5ObservationsResponse(
/* 31 */             CollectionsKt.emptyList(), 
/* 32 */             CollectionsKt.emptyList()), null, 2, null);
/*    */     }
/*    */     
/* 35 */     Pair<List<AgentObservation>, List<AgentObservation>> pair = Companion.shortenUserMessages(input.getObservations(), this.MAX_FULL_USER_MSGS); List<AgentObservation> processedMessages = (List)pair.component1(), collapsedMessages = (List)pair.component2();
/*    */ 
/*    */     
/* 38 */     return new ArtifactResponse(new Last5ObservationsResponse(
/* 39 */           processedMessages, 
/* 40 */           collapsedMessages), null, 2, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\b\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J4\020\004\032\032\022\n\022\b\022\004\022\0020\0070\006\022\n\022\b\022\004\022\0020\0070\0060\0052\f\020\b\032\b\022\004\022\0020\0070\0062\006\020\t\032\0020\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsHistoryProcessor$Companion;", "", "<init>", "()V", "shortenUserMessages", "Lkotlin/Pair;", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "inputMessages", "numFullUserMsgs", "", "ej-core"})
/*    */   @SourceDebugExtension({"SMAP\nLast5ObservationsHistoryProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Last5ObservationsHistoryProcessor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsHistoryProcessor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,76:1\n1734#2,3:77\n1782#2,4:80\n1104#3,3:84\n*S KotlinDebug\n*F\n+ 1 Last5ObservationsHistoryProcessor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsHistoryProcessor$Companion\n*L\n49#1:77,3\n54#1:80,4\n66#1:84,3\n*E\n"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final Pair<List<AgentObservation>, List<AgentObservation>> shortenUserMessages(@NotNull List inputMessages, int numFullUserMsgs) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'inputMessages'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: aload_1
/*    */       //   7: checkcast java/lang/Iterable
/*    */       //   10: astore_3
/*    */       //   11: iconst_0
/*    */       //   12: istore #4
/*    */       //   14: aload_3
/*    */       //   15: instanceof java/util/Collection
/*    */       //   18: ifeq -> 37
/*    */       //   21: aload_3
/*    */       //   22: checkcast java/util/Collection
/*    */       //   25: invokeinterface isEmpty : ()Z
/*    */       //   30: ifeq -> 37
/*    */       //   33: iconst_1
/*    */       //   34: goto -> 109
/*    */       //   37: aload_3
/*    */       //   38: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   43: astore #5
/*    */       //   45: aload #5
/*    */       //   47: invokeinterface hasNext : ()Z
/*    */       //   52: ifeq -> 108
/*    */       //   55: aload #5
/*    */       //   57: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   62: astore #6
/*    */       //   64: aload #6
/*    */       //   66: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*    */       //   69: astore #7
/*    */       //   71: iconst_0
/*    */       //   72: istore #8
/*    */       //   74: aload #7
/*    */       //   76: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */       //   79: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses
/*    */       //   82: ifne -> 100
/*    */       //   85: aload #7
/*    */       //   87: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */       //   90: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
/*    */       //   93: ifne -> 100
/*    */       //   96: iconst_1
/*    */       //   97: goto -> 101
/*    */       //   100: iconst_0
/*    */       //   101: ifne -> 45
/*    */       //   104: iconst_0
/*    */       //   105: goto -> 109
/*    */       //   108: iconst_1
/*    */       //   109: istore_3
/*    */       //   110: getstatic kotlin/_Assertions.ENABLED : Z
/*    */       //   113: ifeq -> 134
/*    */       //   116: iload_3
/*    */       //   117: ifne -> 134
/*    */       //   120: ldc 'Assertion failed'
/*    */       //   122: astore #4
/*    */       //   124: new java/lang/AssertionError
/*    */       //   127: dup
/*    */       //   128: aload #4
/*    */       //   130: invokespecial <init> : (Ljava/lang/Object;)V
/*    */       //   133: athrow
/*    */       //   134: aload_1
/*    */       //   135: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*    */       //   138: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*    */       //   141: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */       //   144: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */       //   149: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */       //   152: if_acmpne -> 159
/*    */       //   155: iconst_1
/*    */       //   156: goto -> 160
/*    */       //   159: iconst_0
/*    */       //   160: istore_3
/*    */       //   161: getstatic kotlin/_Assertions.ENABLED : Z
/*    */       //   164: ifeq -> 185
/*    */       //   167: iload_3
/*    */       //   168: ifne -> 185
/*    */       //   171: ldc 'Assertion failed'
/*    */       //   173: astore #4
/*    */       //   175: new java/lang/AssertionError
/*    */       //   178: dup
/*    */       //   179: aload #4
/*    */       //   181: invokespecial <init> : (Ljava/lang/Object;)V
/*    */       //   184: athrow
/*    */       //   185: new java/util/ArrayList
/*    */       //   188: dup
/*    */       //   189: invokespecial <init> : ()V
/*    */       //   192: checkcast java/util/List
/*    */       //   195: astore_3
/*    */       //   196: new java/util/ArrayList
/*    */       //   199: dup
/*    */       //   200: invokespecial <init> : ()V
/*    */       //   203: checkcast java/util/List
/*    */       //   206: astore #4
/*    */       //   208: aload_1
/*    */       //   209: checkcast java/lang/Iterable
/*    */       //   212: astore #6
/*    */       //   214: iconst_0
/*    */       //   215: istore #7
/*    */       //   217: aload #6
/*    */       //   219: instanceof java/util/Collection
/*    */       //   222: ifeq -> 242
/*    */       //   225: aload #6
/*    */       //   227: checkcast java/util/Collection
/*    */       //   230: invokeinterface isEmpty : ()Z
/*    */       //   235: ifeq -> 242
/*    */       //   238: iconst_0
/*    */       //   239: goto -> 323
/*    */       //   242: iconst_0
/*    */       //   243: istore #8
/*    */       //   245: aload #6
/*    */       //   247: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   252: astore #9
/*    */       //   254: aload #9
/*    */       //   256: invokeinterface hasNext : ()Z
/*    */       //   261: ifeq -> 321
/*    */       //   264: aload #9
/*    */       //   266: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   271: astore #10
/*    */       //   273: aload #10
/*    */       //   275: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*    */       //   278: astore #11
/*    */       //   280: iconst_0
/*    */       //   281: istore #12
/*    */       //   283: aload #11
/*    */       //   285: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */       //   288: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */       //   293: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */       //   296: if_acmpne -> 303
/*    */       //   299: iconst_1
/*    */       //   300: goto -> 304
/*    */       //   303: iconst_0
/*    */       //   304: ifeq -> 254
/*    */       //   307: iinc #8, 1
/*    */       //   310: iload #8
/*    */       //   312: ifge -> 254
/*    */       //   315: invokestatic throwCountOverflow : ()V
/*    */       //   318: goto -> 254
/*    */       //   321: iload #8
/*    */       //   323: istore #5
/*    */       //   325: iconst_0
/*    */       //   326: istore #6
/*    */       //   328: aload_1
/*    */       //   329: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   334: astore #7
/*    */       //   336: aload #7
/*    */       //   338: invokeinterface hasNext : ()Z
/*    */       //   343: ifeq -> 570
/*    */       //   346: aload #7
/*    */       //   348: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   353: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*    */       //   356: astore #8
/*    */       //   358: aload #8
/*    */       //   360: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */       //   363: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */       //   368: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */       //   371: if_acmpeq -> 389
/*    */       //   374: aload_3
/*    */       //   375: checkcast java/util/Collection
/*    */       //   378: aload #8
/*    */       //   380: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   385: pop
/*    */       //   386: goto -> 336
/*    */       //   389: iinc #6, 1
/*    */       //   392: iload #5
/*    */       //   394: iload_2
/*    */       //   395: isub
/*    */       //   396: iload #6
/*    */       //   398: if_icmpge -> 416
/*    */       //   401: aload_3
/*    */       //   402: checkcast java/util/Collection
/*    */       //   405: aload #8
/*    */       //   407: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   412: pop
/*    */       //   413: goto -> 336
/*    */       //   416: aload #8
/*    */       //   418: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */       //   421: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */       //   424: ifeq -> 511
/*    */       //   427: aload #8
/*    */       //   429: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */       //   432: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */       //   435: invokevirtual getContent : ()Ljava/lang/String;
/*    */       //   438: checkcast java/lang/CharSequence
/*    */       //   441: astore #10
/*    */       //   443: iconst_0
/*    */       //   444: istore #11
/*    */       //   446: iconst_0
/*    */       //   447: istore #12
/*    */       //   449: iconst_0
/*    */       //   450: istore #13
/*    */       //   452: iload #13
/*    */       //   454: aload #10
/*    */       //   456: invokeinterface length : ()I
/*    */       //   461: if_icmpge -> 506
/*    */       //   464: aload #10
/*    */       //   466: iload #13
/*    */       //   468: invokeinterface charAt : (I)C
/*    */       //   473: istore #14
/*    */       //   475: iload #14
/*    */       //   477: istore #15
/*    */       //   479: iconst_0
/*    */       //   480: istore #16
/*    */       //   482: iload #15
/*    */       //   484: bipush #10
/*    */       //   486: if_icmpne -> 493
/*    */       //   489: iconst_1
/*    */       //   490: goto -> 494
/*    */       //   493: iconst_0
/*    */       //   494: ifeq -> 500
/*    */       //   497: iinc #12, 1
/*    */       //   500: iinc #13, 1
/*    */       //   503: goto -> 452
/*    */       //   506: iload #12
/*    */       //   508: goto -> 519
/*    */       //   511: new java/lang/InternalError
/*    */       //   514: dup
/*    */       //   515: invokespecial <init> : ()V
/*    */       //   518: athrow
/*    */       //   519: istore #9
/*    */       //   521: aload_3
/*    */       //   522: checkcast java/util/Collection
/*    */       //   525: new com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*    */       //   528: dup
/*    */       //   529: iload #9
/*    */       //   531: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*    */       //   536: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */       //   539: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */       //   542: aconst_null
/*    */       //   543: iconst_2
/*    */       //   544: aconst_null
/*    */       //   545: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */       //   548: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   553: pop
/*    */       //   554: aload #4
/*    */       //   556: checkcast java/util/Collection
/*    */       //   559: aload #8
/*    */       //   561: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   566: pop
/*    */       //   567: goto -> 336
/*    */       //   570: new kotlin/Pair
/*    */       //   573: dup
/*    */       //   574: aload_3
/*    */       //   575: aload #4
/*    */       //   577: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */       //   580: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #49	-> 6
/*    */       //   #77	-> 14
/*    */       //   #78	-> 37
/*    */       //   #49	-> 74
/*    */       //   #78	-> 101
/*    */       //   #79	-> 108
/*    */       //   #49	-> 110
/*    */       //   #50	-> 134
/*    */       //   #52	-> 185
/*    */       //   #52	-> 195
/*    */       //   #53	-> 196
/*    */       //   #53	-> 206
/*    */       //   #54	-> 208
/*    */       //   #80	-> 217
/*    */       //   #81	-> 242
/*    */       //   #82	-> 245
/*    */       //   #54	-> 283
/*    */       //   #82	-> 304
/*    */       //   #83	-> 321
/*    */       //   #54	-> 323
/*    */       //   #55	-> 325
/*    */       //   #56	-> 328
/*    */       //   #57	-> 358
/*    */       //   #58	-> 374
/*    */       //   #59	-> 386
/*    */       //   #61	-> 389
/*    */       //   #62	-> 392
/*    */       //   #63	-> 401
/*    */       //   #65	-> 416
/*    */       //   #66	-> 427
/*    */       //   #84	-> 446
/*    */       //   #85	-> 449
/*    */       //   #66	-> 482
/*    */       //   #85	-> 494
/*    */       //   #86	-> 506
/*    */       //   #67	-> 511
/*    */       //   #65	-> 519
/*    */       //   #69	-> 521
/*    */       //   #70	-> 554
/*    */       //   #73	-> 570
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   74	27	8	$i$a$-all-Last5ObservationsHistoryProcessor$Companion$shortenUserMessages$1	I
/*    */       //   71	30	7	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*    */       //   64	44	6	element$iv	Ljava/lang/Object;
/*    */       //   14	95	4	$i$f$all	I
/*    */       //   11	98	3	$this$all$iv	Ljava/lang/Iterable;
/*    */       //   283	21	12	$i$a$-count-Last5ObservationsHistoryProcessor$Companion$shortenUserMessages$userMessagesCnt$1	I
/*    */       //   280	24	11	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*    */       //   273	48	10	element$iv	Ljava/lang/Object;
/*    */       //   217	106	7	$i$f$count	I
/*    */       //   245	78	8	count$iv	I
/*    */       //   214	109	6	$this$count$iv	Ljava/lang/Iterable;
/*    */       //   482	12	16	$i$a$-count-Last5ObservationsHistoryProcessor$Companion$shortenUserMessages$count$1	I
/*    */       //   479	15	15	it	C
/*    */       //   475	25	14	element$iv	C
/*    */       //   446	62	11	$i$f$count	I
/*    */       //   449	59	12	count$iv	I
/*    */       //   443	65	10	$this$count$iv	Ljava/lang/CharSequence;
/*    */       //   521	46	9	count	I
/*    */       //   358	209	8	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*    */       //   196	385	3	messages	Ljava/util/List;
/*    */       //   208	373	4	collapsedUserMessages	Ljava/util/List;
/*    */       //   325	256	5	userMessagesCnt	I
/*    */       //   328	253	6	userMsgIdx	I
/*    */       //   0	581	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsHistoryProcessor$Companion;
/*    */       //   0	581	1	inputMessages	Ljava/util/List;
/*    */       //   0	581	2	numFullUserMsgs	I
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\Last5ObservationsHistoryProcessor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */