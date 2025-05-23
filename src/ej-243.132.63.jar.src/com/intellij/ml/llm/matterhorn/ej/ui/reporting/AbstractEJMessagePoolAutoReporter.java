/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.reporting;
/*     */ import com.intellij.diagnostic.AbstractMessage;
/*     */ import com.intellij.diagnostic.ITNReporter;
/*     */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
/*     */ import com.intellij.internal.statistic.utils.PluginInfo;
/*     */ import com.intellij.internal.statistic.utils.PluginInfoDetectorKt;
/*     */ import com.intellij.openapi.extensions.PluginId;
/*     */ import com.intellij.platform.util.coroutines.flow.FlowKt;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Triple;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.ArrayIteratorKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.time.DurationKt;
/*     */ import kotlin.time.DurationUnit;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\020\003\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020%\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\003\n\002\020#\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\005\b'\030\0002\0020\001:\00234B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J4\020\017\032\0020\0202$\020\006\032 \022\034\022\032\022\004\022\0020\t\022\004\022\0020\n\022\006\022\004\030\0010\0130\bj\002`\f0\021H@¢\006\002\020\022J6\020\023\032\0020\0242\036\020\025\032\032\022\004\022\0020\t\022\004\022\0020\n\022\006\022\004\030\0010\0130\bj\002`\f2\006\020\026\032\0020\027H¤@¢\006\002\020\030J\034\020\031\032\0020\0202\006\020\032\032\0020\0332\n\020\034\032\0060\035j\002`\036H\004J\f\020\037\032\0020\027*\0020\033H\002J \020\037\032\0020\027*\0020 2\022\020!\032\016\022\004\022\0020\027\022\004\022\0020#0\"H\002Ja\020$\032\0020\0202\006\020\032\032\0020\0332\n\020\034\032\0060\035j\002`\0362\f\020%\032\b\022\004\022\0020 0&2\006\020'\032\0020\0272\006\020(\032\0020\0272\f\020)\032\b\022\004\022\0020\0330*2\022\020!\032\016\022\004\022\0020\027\022\004\022\0020#0\"H\002¢\006\002\020+J\020\020,\032\0020-2\006\020\025\032\0020\tH&J\022\020.\032\0020-2\b\020/\032\004\030\00100H$J\020\0201\032\0020-2\006\0202\032\0020\033H\004R2\020\006\032 \022\034\022\032\022\004\022\0020\t\022\004\022\0020\n\022\006\022\004\030\0010\0130\bj\002`\f0\007X\004¢\006\b\n\000\032\004\b\r\020\016¨\0065"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter;", "", "cs", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "messages", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlin/Triple;", "Lcom/intellij/diagnostic/AbstractMessage;", "Lcom/intellij/diagnostic/ITNReporter;", "Lcom/intellij/ide/plugins/IdeaPluginDescriptor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/EJMessageReport;", "getMessages", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "sendMessages", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submit", "Lcom/intellij/openapi/diagnostic/SubmittedReportInfo;", "message", "stacktrace", "", "(Lkotlin/Triple;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "printSanitizedStackTrace", "throwable", "", "s", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sanitizedToString", "Ljava/lang/StackTraceElement;", "pluginInfoCache", "", "Lcom/intellij/internal/statistic/utils/PluginInfo;", "printEnclosedSanitizedStackTrace", "enclosingTrace", "", "caption", "prefix", "dejaVu", "", "(Ljava/lang/Throwable;Ljava/lang/StringBuilder;[Ljava/lang/StackTraceElement;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;)V", "newEntryConsumed", "", "checkSubmitter", "submitter", "Lcom/intellij/openapi/diagnostic/ErrorReportSubmitter;", "shouldShowErrorInRelease", "t", "MyITNReporter", "MyAppListener", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nAbstractEJMessagePoolAutoReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractEJMessagePoolAutoReporter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,184:1\n1663#2,8:185\n1#3:193\n381#4,7:194\n*S KotlinDebug\n*F\n+ 1 AbstractEJMessagePoolAutoReporter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter\n*L\n50#1:185,8\n102#1:194,7\n*E\n"})
/*     */ public abstract class AbstractEJMessagePoolAutoReporter {
/*     */   @NotNull
/*     */   private final MutableSharedFlow<Triple<AbstractMessage, ITNReporter, IdeaPluginDescriptor>> messages;
/*     */   
/*     */   public AbstractEJMessagePoolAutoReporter(@NotNull CoroutineScope cs) {
/*  39 */     this.messages = SharedFlowKt.MutableSharedFlow$default(0, 100, BufferOverflow.DROP_LATEST, 1, null);
/*     */ 
/*     */     
/*  42 */     BuildersKt.launch$default(cs, (CoroutineContext)new CoroutineName("background error processing"), null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  43 */                 this.label = 1; if (FlowKt.debounceBatch-HG0u8IE((Flow)AbstractEJMessagePoolAutoReporter.this.getMessages(), DurationKt.toDuration(60, DurationUnit.SECONDS)).collect(new FlowCollector() {
/*  44 */                       public final Object emit(List<? extends Triple<? extends AbstractMessage, ? extends ITNReporter, ? extends IdeaPluginDescriptor>> it, Continuation<? super Unit> $completion) { if (AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion);  AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion); return Unit.INSTANCE; } }(Continuation)this) == object) return object;  FlowKt.debounceBatch-HG0u8IE((Flow)AbstractEJMessagePoolAutoReporter.this.getMessages(), DurationKt.toDuration(60, DurationUnit.SECONDS)).collect(new FlowCollector() { public final Object emit(List<? extends Triple<? extends AbstractMessage, ? extends ITNReporter, ? extends IdeaPluginDescriptor>> it, Continuation<? super Unit> $completion) { if (AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion);  AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion); return Unit.INSTANCE; } }
/*     */                     (Continuation)this);
/*  46 */                 return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */             
/*     */             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */           
/*     */           public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */             return (Continuation)new Function2<>(AbstractEJMessagePoolAutoReporter.this, $completion);
/*     */           }
/*     */           public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */           } }
/*     */         2, null);
/*     */   } public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   protected final MutableSharedFlow<Triple<AbstractMessage, ITNReporter, IdeaPluginDescriptor>> getMessages() {
/*     */     return this.messages;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object sendMessages(@NotNull List messages, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$sendMessages$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$sendMessages$1
/*     */     //   11: astore #14
/*     */     //   13: aload #14
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #14
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$sendMessages$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #14
/*     */     //   50: aload #14
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #13
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #15
/*     */     //   62: aload #14
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 439, 0 -> 88, 1 -> 363
/*     */     //   88: aload #13
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: checkcast java/lang/Iterable
/*     */     //   97: astore #4
/*     */     //   99: iconst_0
/*     */     //   100: istore #5
/*     */     //   102: new java/util/HashSet
/*     */     //   105: dup
/*     */     //   106: invokespecial <init> : ()V
/*     */     //   109: astore #6
/*     */     //   111: new java/util/ArrayList
/*     */     //   114: dup
/*     */     //   115: invokespecial <init> : ()V
/*     */     //   118: astore #7
/*     */     //   120: aload #4
/*     */     //   122: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   127: astore #8
/*     */     //   129: aload #8
/*     */     //   131: invokeinterface hasNext : ()Z
/*     */     //   136: ifeq -> 237
/*     */     //   139: aload #8
/*     */     //   141: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   146: astore #9
/*     */     //   148: aload #9
/*     */     //   150: checkcast kotlin/Triple
/*     */     //   153: astore #10
/*     */     //   155: iconst_0
/*     */     //   156: istore #11
/*     */     //   158: new java/util/zip/CRC32
/*     */     //   161: dup
/*     */     //   162: invokespecial <init> : ()V
/*     */     //   165: astore #12
/*     */     //   167: aload #12
/*     */     //   169: aload #10
/*     */     //   171: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   174: checkcast com/intellij/diagnostic/AbstractMessage
/*     */     //   177: invokevirtual getThrowable : ()Ljava/lang/Throwable;
/*     */     //   180: invokestatic getThrowableText : (Ljava/lang/Throwable;)Ljava/lang/String;
/*     */     //   183: dup
/*     */     //   184: ldc 'getThrowableText(...)'
/*     */     //   186: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   189: getstatic kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   192: swap
/*     */     //   193: swap
/*     */     //   194: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
/*     */     //   197: dup
/*     */     //   198: ldc 'getBytes(...)'
/*     */     //   200: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   203: invokevirtual update : ([B)V
/*     */     //   206: aload #12
/*     */     //   208: invokevirtual getValue : ()J
/*     */     //   211: invokestatic boxLong : (J)Ljava/lang/Long;
/*     */     //   214: astore #10
/*     */     //   216: aload #6
/*     */     //   218: aload #10
/*     */     //   220: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   223: ifeq -> 129
/*     */     //   226: aload #7
/*     */     //   228: aload #9
/*     */     //   230: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   233: pop
/*     */     //   234: goto -> 129
/*     */     //   237: aload #7
/*     */     //   239: checkcast java/util/List
/*     */     //   242: astore_3
/*     */     //   243: aload_3
/*     */     //   244: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   249: astore #4
/*     */     //   251: aload #4
/*     */     //   253: invokeinterface hasNext : ()Z
/*     */     //   258: ifeq -> 435
/*     */     //   261: aload #4
/*     */     //   263: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   268: checkcast kotlin/Triple
/*     */     //   271: astore #5
/*     */     //   273: new java/lang/StringBuilder
/*     */     //   276: dup
/*     */     //   277: invokespecial <init> : ()V
/*     */     //   280: astore #8
/*     */     //   282: aload #8
/*     */     //   284: astore #9
/*     */     //   286: iconst_0
/*     */     //   287: istore #10
/*     */     //   289: aload_0
/*     */     //   290: aload #5
/*     */     //   292: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   295: checkcast com/intellij/diagnostic/AbstractMessage
/*     */     //   298: invokevirtual getThrowable : ()Ljava/lang/Throwable;
/*     */     //   301: dup
/*     */     //   302: ldc 'getThrowable(...)'
/*     */     //   304: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   307: aload #9
/*     */     //   309: invokevirtual printSanitizedStackTrace : (Ljava/lang/Throwable;Ljava/lang/StringBuilder;)V
/*     */     //   312: aload #8
/*     */     //   314: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   317: dup
/*     */     //   318: ldc 'toString(...)'
/*     */     //   320: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   323: astore #6
/*     */     //   325: aload_0
/*     */     //   326: aload #5
/*     */     //   328: aload #6
/*     */     //   330: aload #14
/*     */     //   332: aload #14
/*     */     //   334: aload_0
/*     */     //   335: putfield L$0 : Ljava/lang/Object;
/*     */     //   338: aload #14
/*     */     //   340: aload #4
/*     */     //   342: putfield L$1 : Ljava/lang/Object;
/*     */     //   345: aload #14
/*     */     //   347: iconst_1
/*     */     //   348: putfield label : I
/*     */     //   351: invokevirtual submit : (Lkotlin/Triple;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   354: dup
/*     */     //   355: aload #15
/*     */     //   357: if_acmpne -> 389
/*     */     //   360: aload #15
/*     */     //   362: areturn
/*     */     //   363: aload #14
/*     */     //   365: getfield L$1 : Ljava/lang/Object;
/*     */     //   368: checkcast java/util/Iterator
/*     */     //   371: astore #4
/*     */     //   373: aload #14
/*     */     //   375: getfield L$0 : Ljava/lang/Object;
/*     */     //   378: checkcast com/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter
/*     */     //   381: astore_0
/*     */     //   382: aload #13
/*     */     //   384: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   387: aload #13
/*     */     //   389: checkcast com/intellij/openapi/diagnostic/SubmittedReportInfo
/*     */     //   392: astore #7
/*     */     //   394: aload #7
/*     */     //   396: invokevirtual getStatus : ()Lcom/intellij/openapi/diagnostic/SubmittedReportInfo$SubmissionStatus;
/*     */     //   399: getstatic com/intellij/openapi/diagnostic/SubmittedReportInfo$SubmissionStatus.NEW_ISSUE : Lcom/intellij/openapi/diagnostic/SubmittedReportInfo$SubmissionStatus;
/*     */     //   402: if_acmpne -> 424
/*     */     //   405: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   408: aload #7
/*     */     //   410: invokevirtual getURL : ()Ljava/lang/String;
/*     */     //   413: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   418: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   421: goto -> 251
/*     */     //   424: invokestatic access$getLOG$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   427: ldc 'Failed to send an automated exception report'
/*     */     //   429: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   432: goto -> 251
/*     */     //   435: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   438: areturn
/*     */     //   439: new java/lang/IllegalStateException
/*     */     //   442: dup
/*     */     //   443: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   445: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   448: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #49	-> 60
/*     */     //   #50	-> 93
/*     */     //   #185	-> 102
/*     */     //   #186	-> 111
/*     */     //   #187	-> 120
/*     */     //   #188	-> 148
/*     */     //   #51	-> 158
/*     */     //   #52	-> 167
/*     */     //   #52	-> 203
/*     */     //   #53	-> 206
/*     */     //   #188	-> 214
/*     */     //   #189	-> 216
/*     */     //   #190	-> 226
/*     */     //   #192	-> 237
/*     */     //   #50	-> 242
/*     */     //   #55	-> 243
/*     */     //   #56	-> 273
/*     */     //   #193	-> 286
/*     */     //   #56	-> 289
/*     */     //   #56	-> 312
/*     */     //   #56	-> 314
/*     */     //   #57	-> 325
/*     */     //   #49	-> 360
/*     */     //   #58	-> 394
/*     */     //   #59	-> 405
/*     */     //   #61	-> 424
/*     */     //   #64	-> 435
/*     */     //   #49	-> 439
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	118	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter;
/*     */     //   211	31	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter;
/*     */     //   242	121	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter;
/*     */     //   382	57	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter;
/*     */     //   93	6	1	messages	Ljava/util/List;
/*     */     //   243	8	3	groupedMessages	Ljava/util/List;
/*     */     //   99	30	4	$this$distinctBy$iv	Ljava/lang/Iterable;
/*     */     //   273	39	5	message	Lkotlin/Triple;
/*     */     //   312	2	5	message	Lkotlin/Triple;
/*     */     //   314	40	5	message	Lkotlin/Triple;
/*     */     //   111	131	6	set$iv	Ljava/util/HashSet;
/*     */     //   325	29	6	stacktrace	Ljava/lang/String;
/*     */     //   120	122	7	list$iv	Ljava/util/ArrayList;
/*     */     //   394	30	7	result	Lcom/intellij/openapi/diagnostic/SubmittedReportInfo;
/*     */     //   148	86	9	e$iv	Ljava/lang/Object;
/*     */     //   286	26	9	$this$sendMessages_u24lambda_u241	Ljava/lang/StringBuilder;
/*     */     //   155	56	10	it	Lkotlin/Triple;
/*     */     //   216	18	10	key$iv	Ljava/lang/Object;
/*     */     //   167	44	12	digest	Ljava/util/zip/CRC32;
/*     */     //   158	53	11	$i$a$-distinctBy-AbstractEJMessagePoolAutoReporter$sendMessages$groupedMessages$1	I
/*     */     //   102	140	5	$i$f$distinctBy	I
/*     */     //   289	23	10	$i$a$-apply-AbstractEJMessagePoolAutoReporter$sendMessages$stacktrace$1	I
/*     */     //   0	449	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	389	14	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	382	13	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected abstract Object submit(@NotNull Triple<? extends AbstractMessage, ? extends ITNReporter, ? extends IdeaPluginDescriptor> paramTriple, @NotNull String paramString, @NotNull Continuation<? super SubmittedReportInfo> paramContinuation);
/*     */   
/*     */   protected final void printSanitizedStackTrace(@NotNull Throwable throwable, @NotNull StringBuilder s) {
/*  73 */     Intrinsics.checkNotNullParameter(throwable, "throwable"); Intrinsics.checkNotNullParameter(s, "s"); HashMap<Object, Object> pluginInfoCache = new HashMap<>();
/*     */     
/*  75 */     Set<?> dejaVu = Collections.newSetFromMap(new IdentityHashMap<>());
/*  76 */     dejaVu.add(throwable);
/*     */     
/*  78 */     Intrinsics.checkNotNullExpressionValue(s.append(sanitizedToString(throwable)), "append(...)"); Intrinsics.checkNotNullExpressionValue(s.append(sanitizedToString(throwable)).append('\n'), "append(...)"); s.append(sanitizedToString(throwable)).append('\n');
/*  79 */     StackTraceElement[] trace = throwable.getStackTrace(); Iterator<StackTraceElement> iterator;
/*  80 */     for (iterator = ArrayIteratorKt.iterator((Object[])trace); iterator.hasNext(); ) { StackTraceElement traceElement = iterator.next();
/*  81 */       Intrinsics.checkNotNull(traceElement); Intrinsics.checkNotNullExpressionValue(s.append("\tat " + sanitizedToString(traceElement, (Map)pluginInfoCache)), "append(...)"); Intrinsics.checkNotNullExpressionValue(s.append("\tat " + sanitizedToString(traceElement, (Map)pluginInfoCache)).append('\n'), "append(...)"); s.append("\tat " + sanitizedToString(traceElement, (Map)pluginInfoCache)).append('\n'); }
/*     */ 
/*     */ 
/*     */     
/*  85 */     for (iterator = ArrayIteratorKt.iterator((Object[])throwable.getSuppressed()); iterator.hasNext(); ) { Throwable se = (Throwable)iterator.next();
/*  86 */       Intrinsics.checkNotNull(se); Intrinsics.checkNotNull(trace); Intrinsics.checkNotNull(dejaVu); printEnclosedSanitizedStackTrace(se, s, trace, "Suppressed: ", "\t", (Set)dejaVu, (Map)pluginInfoCache); }
/*     */ 
/*     */ 
/*     */     
/*  90 */     Throwable cause = throwable.getCause();
/*  91 */     if (cause != null) {
/*  92 */       Intrinsics.checkNotNull(trace); Intrinsics.checkNotNull(dejaVu); printEnclosedSanitizedStackTrace(cause, s, trace, "Caused by: ", "", (Set)dejaVu, (Map)pluginInfoCache);
/*     */     } 
/*     */   }
/*     */   
/*     */   private final String sanitizedToString(Throwable $this$sanitizedToString) {
/*  97 */     String className = PluginInfoDetectorKt.getPluginInfo($this$sanitizedToString.getClass()).isSafeToReport() ? $this$sanitizedToString.getClass().getName() : "third.party";
/*  98 */     Intrinsics.checkNotNull(className); return ($this$sanitizedToString.getMessage() != null) ? (className + ": The message has stripped due to GDPR") : className;
/*     */   }
/*     */   
/*     */   private final String sanitizedToString(StackTraceElement $this$sanitizedToString, Map<Object, Object> pluginInfoCache) {
/* 102 */     Map<Object, Object> map = pluginInfoCache; Object key$iv = $this$sanitizedToString.getClassName(); int $i$f$getOrPut = 0;
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
/* 194 */     Object value$iv = map.get(key$iv);
/* 195 */     if (value$iv == null) {
/* 196 */       int $i$a$-getOrPut-AbstractEJMessagePoolAutoReporter$sanitizedToString$pluginInfo$1 = 0; Intrinsics.checkNotNullExpressionValue($this$sanitizedToString.getClassName(), "getClassName(...)"); Object answer$iv = PluginInfoDetectorKt.getPluginInfo($this$sanitizedToString.getClassName());
/* 197 */       map.put(key$iv, answer$iv);
/*     */     } 
/*     */     
/* 200 */     PluginInfo pluginInfo = (PluginInfo)value$iv;
/*     */     Intrinsics.checkNotNullExpressionValue($this$sanitizedToString.toString(), "toString(...)");
/*     */     return pluginInfo.isSafeToReport() ? $this$sanitizedToString.toString() : "third.party";
/*     */   }
/*     */   
/*     */   private final void printEnclosedSanitizedStackTrace(Throwable throwable, StringBuilder s, StackTraceElement[] enclosingTrace, String caption, String prefix, Set<Throwable> dejaVu, Map<String, PluginInfo> pluginInfoCache) {
/*     */     if (dejaVu.contains(throwable)) {
/*     */       Intrinsics.checkNotNullExpressionValue(s.append(prefix + prefix + "[CIRCULAR REFERENCE: " + caption + "]"), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(s.append(prefix + prefix + "[CIRCULAR REFERENCE: " + caption + "]").append('\n'), "append(...)");
/*     */       s.append(prefix + prefix + "[CIRCULAR REFERENCE: " + caption + "]").append('\n');
/*     */       return;
/*     */     } 
/*     */     StackTraceElement[] trace = throwable.getStackTrace();
/*     */     int m = trace.length - 1;
/*     */     int n = enclosingTrace.length - 1;
/*     */     while (m >= 0 && n >= 0 && Intrinsics.areEqual(trace[m], enclosingTrace[n])) {
/*     */       m--;
/*     */       n--;
/*     */     } 
/*     */     int framesInCommon = trace.length - 1 - m;
/*     */     Intrinsics.checkNotNullExpressionValue(s.append(prefix + prefix + caption), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(s.append(prefix + prefix + caption).append('\n'), "append(...)");
/*     */     s.append(prefix + prefix + caption).append('\n');
/*     */     int i = 0, j = m;
/*     */     if (i <= j)
/*     */       while (true) {
/*     */         StringBuilder stringBuilder = s;
/*     */         Intrinsics.checkNotNullExpressionValue(trace[i], "get(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(stringBuilder.append(prefix + "\tat " + prefix), "append(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(stringBuilder.append(prefix + "\tat " + prefix).append('\n'), "append(...)");
/*     */         stringBuilder.append(prefix + "\tat " + prefix).append('\n');
/*     */         if (i != j) {
/*     */           i++;
/*     */           continue;
/*     */         } 
/*     */         break;
/*     */       }  
/*     */     if (framesInCommon != 0) {
/*     */       Intrinsics.checkNotNullExpressionValue(s.append(prefix + "\t... " + prefix + " more"), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(s.append(prefix + "\t... " + prefix + " more").append('\n'), "append(...)");
/*     */       s.append(prefix + "\t... " + prefix + " more").append('\n');
/*     */     } 
/*     */     for (Iterator<Throwable> iterator = ArrayIteratorKt.iterator((Object[])throwable.getSuppressed()); iterator.hasNext(); ) {
/*     */       Throwable se = iterator.next();
/*     */       Intrinsics.checkNotNull(se);
/*     */       Intrinsics.checkNotNull(trace);
/*     */       printEnclosedSanitizedStackTrace(se, s, trace, "Suppressed: ", prefix + "\t", dejaVu, pluginInfoCache);
/*     */     } 
/*     */     Throwable cause = throwable.getCause();
/*     */     if (cause != null) {
/*     */       Intrinsics.checkNotNull(trace);
/*     */       printEnclosedSanitizedStackTrace(cause, s, trace, "Caused by: ", prefix, dejaVu, pluginInfoCache);
/*     */     } 
/*     */   }
/*     */   
/*     */   public abstract boolean newEntryConsumed(@NotNull AbstractMessage paramAbstractMessage);
/*     */   
/*     */   protected abstract boolean checkSubmitter(@Nullable ErrorReportSubmitter paramErrorReportSubmitter);
/*     */   
/*     */   protected final boolean shouldShowErrorInRelease(@NotNull Throwable t) {
/*     */     Intrinsics.checkNotNullParameter(t, "t");
/*     */     return t instanceof com.intellij.diagnostic.JBRCrash;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$MyITNReporter;", "Lcom/intellij/diagnostic/ITNReporter;", "<init>", "()V", "showErrorInRelease", "", "event", "Lcom/intellij/openapi/diagnostic/IdeaLoggingEvent;", "ej-ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class MyITNReporter extends ITNReporter {
/*     */     public static final int $stable;
/*     */     
/*     */     public MyITNReporter() {
/*     */       super(null, 1, null);
/*     */     }
/*     */     
/*     */     public boolean showErrorInRelease(@NotNull IdeaLoggingEvent event) {
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       if (BuildConfigKt.getConfig().getEapExceptionProcessing() || StatisticsUploadAssistant.isAllowedByUserConsent()) {
/*     */         PluginId pluginId = PluginUtil.getInstance().findPluginId(event.getThrowable());
/*     */         int $i$a$-let-AbstractEJMessagePoolAutoReporter$MyITNReporter$showErrorInRelease$1 = 0;
/*     */         if ((pluginId != null && Intrinsics.areEqual(pluginId.getIdString(), "org.jetbrains.junie") && PluginInfoDetectorKt.getPluginInfoById(pluginId).isSafeToReport()));
/*     */       } 
/*     */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\016\020\004\032\0020\005H@¢\006\002\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$MyAppListener;", "Lcom/intellij/ide/ApplicationInitializedListener;", "<init>", "()V", "execute", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   @SourceDebugExtension({"SMAP\nAbstractEJMessagePoolAutoReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractEJMessagePoolAutoReporter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$MyAppListener\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,184:1\n40#2,3:185\n*S KotlinDebug\n*F\n+ 1 AbstractEJMessagePoolAutoReporter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$MyAppListener\n*L\n177#1:185,3\n*E\n"})
/*     */   public static final class MyAppListener implements ApplicationInitializedListener {
/*     */     public static final int $stable;
/*     */     
/*     */     @Nullable
/*     */     public Object execute(@NotNull Continuation $completion) {
/*     */       if (!BuildConfigKt.getConfig().getEapExceptionProcessing() && !StatisticsUploadAssistant.isAllowedByUserConsent())
/*     */         return Unit.INSTANCE; 
/*     */       int $i$f$service = 0;
/*     */       Class<EJMessagePoolAutoReporter> serviceClass$iv = EJMessagePoolAutoReporter.class;
/*     */       if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) {
/*     */         ApplicationManager.getApplication().getService(serviceClass$iv);
/*     */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')');
/*     */       } 
/*     */       EJMessagePoolAutoReporter reporter = (EJMessagePoolAutoReporter)ApplicationManager.getApplication().getService(serviceClass$iv);
/*     */       MessagePool.getInstance().addListener(new AbstractEJMessagePoolAutoReporter$MyAppListener$execute$2(reporter));
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\b\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$MyAppListener$execute$2", "Lcom/intellij/diagnostic/MessagePoolListener;", "beforeEntryAdded", "", "message", "Lcom/intellij/diagnostic/AbstractMessage;", "newEntryAdded", "", "ej-ui"})
/*     */     public static final class AbstractEJMessagePoolAutoReporter$MyAppListener$execute$2 implements MessagePoolListener {
/*     */       AbstractEJMessagePoolAutoReporter$MyAppListener$execute$2(EJMessagePoolAutoReporter $reporter) {}
/*     */       
/*     */       public boolean beforeEntryAdded(AbstractMessage message) {
/*     */         Intrinsics.checkNotNullParameter(message, "message");
/*     */         return !this.$reporter.newEntryConsumed(message);
/*     */       }
/*     */       
/*     */       public void newEntryAdded() {}
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractEJMessagePoolAutoReporter.kt", l = {57}, i = {0}, s = {"L$0"}, n = {"this"}, m = "sendMessages", c = "com.intellij.ml.llm.matterhorn.ej.ui.reporting.AbstractEJMessagePoolAutoReporter")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractEJMessagePoolAutoReporter$sendMessages$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AbstractEJMessagePoolAutoReporter$sendMessages$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractEJMessagePoolAutoReporter.this.sendMessages(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\reporting\AbstractEJMessagePoolAutoReporter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */