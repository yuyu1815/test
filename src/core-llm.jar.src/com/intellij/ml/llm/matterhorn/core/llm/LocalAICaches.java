/*     */ package com.intellij.ml.llm.matterhorn.core.llm;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.CacheType;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornCaches;
/*     */ import com.intellij.ml.llm.matterhorn.configuration.BuildConfigKt;
/*     */ import com.intellij.ml.llm.matterhorn.configuration.EnvExtensionsKt;
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J<\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\034\020\f\032\030\b\001\022\n\022\b\022\004\022\0020\0070\016\022\006\022\004\030\0010\0170\rH@¢\006\002\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches;", "Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;", "cachesService", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;)V", "lookupOrBuild", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "builder", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nAICaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,219:1\n205#2:220\n205#2:221\n*S KotlinDebug\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches\n*L\n69#1:220\n70#1:221\n*E\n"})
/*     */ public final class LocalAICaches
/*     */   implements AICache
/*     */ {
/*     */   @NotNull
/*     */   private final MatterhornCaches cachesService;
/*     */   
/*     */   @Nullable
/*     */   public Object lookupOrBuild(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull Function1 builder, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/core/llm/LocalAICaches$lookupOrBuild$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/core/llm/LocalAICaches$lookupOrBuild$1
/*     */     //   13: astore #11
/*     */     //   15: aload #11
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #11
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/core/llm/LocalAICaches$lookupOrBuild$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #11
/*     */     //   53: aload #11
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #10
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #12
/*     */     //   65: aload #11
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 446, 0 -> 100, 1 -> 246, 2 -> 339, 3 -> 425
/*     */     //   100: aload #10
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   108: checkcast kotlinx/serialization/json/Json
/*     */     //   111: astore #6
/*     */     //   113: iconst_0
/*     */     //   114: istore #7
/*     */     //   116: aload #6
/*     */     //   118: aload #6
/*     */     //   120: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*     */     //   123: pop
/*     */     //   124: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChat.Companion : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat$Companion;
/*     */     //   127: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   130: checkcast kotlinx/serialization/SerializationStrategy
/*     */     //   133: aload_1
/*     */     //   134: invokevirtual encodeToString : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   137: astore #5
/*     */     //   139: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   142: checkcast kotlinx/serialization/json/Json
/*     */     //   145: astore #7
/*     */     //   147: iconst_0
/*     */     //   148: istore #8
/*     */     //   150: aload #7
/*     */     //   152: aload #7
/*     */     //   154: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*     */     //   157: pop
/*     */     //   158: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*     */     //   161: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   164: checkcast kotlinx/serialization/SerializationStrategy
/*     */     //   167: aload_2
/*     */     //   168: invokevirtual encodeToString : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   171: astore #6
/*     */     //   173: aload #5
/*     */     //   175: aload #6
/*     */     //   177: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   182: invokestatic hash256 : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   185: astore #7
/*     */     //   187: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   190: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   193: new com/intellij/ml/llm/matterhorn/core/llm/LocalAICaches$lookupOrBuild$answer$1
/*     */     //   196: dup
/*     */     //   197: aload_0
/*     */     //   198: aload #7
/*     */     //   200: aconst_null
/*     */     //   201: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
/*     */     //   204: checkcast kotlin/jvm/functions/Function2
/*     */     //   207: aload #11
/*     */     //   209: aload #11
/*     */     //   211: aload_0
/*     */     //   212: putfield L$0 : Ljava/lang/Object;
/*     */     //   215: aload #11
/*     */     //   217: aload_3
/*     */     //   218: putfield L$1 : Ljava/lang/Object;
/*     */     //   221: aload #11
/*     */     //   223: aload #7
/*     */     //   225: putfield L$2 : Ljava/lang/Object;
/*     */     //   228: aload #11
/*     */     //   230: iconst_1
/*     */     //   231: putfield label : I
/*     */     //   234: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   237: dup
/*     */     //   238: aload #12
/*     */     //   240: if_acmpne -> 281
/*     */     //   243: aload #12
/*     */     //   245: areturn
/*     */     //   246: aload #11
/*     */     //   248: getfield L$2 : Ljava/lang/Object;
/*     */     //   251: checkcast java/lang/String
/*     */     //   254: astore #7
/*     */     //   256: aload #11
/*     */     //   258: getfield L$1 : Ljava/lang/Object;
/*     */     //   261: checkcast kotlin/jvm/functions/Function1
/*     */     //   264: astore_3
/*     */     //   265: aload #11
/*     */     //   267: getfield L$0 : Ljava/lang/Object;
/*     */     //   270: checkcast com/intellij/ml/llm/matterhorn/core/llm/LocalAICaches
/*     */     //   273: astore_0
/*     */     //   274: aload #10
/*     */     //   276: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   279: aload #10
/*     */     //   281: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   284: astore #8
/*     */     //   286: aload #8
/*     */     //   288: ifnull -> 297
/*     */     //   291: aload #8
/*     */     //   293: invokevirtual asCached : ()Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   296: areturn
/*     */     //   297: aload_3
/*     */     //   298: aload #11
/*     */     //   300: aload #11
/*     */     //   302: aload_0
/*     */     //   303: putfield L$0 : Ljava/lang/Object;
/*     */     //   306: aload #11
/*     */     //   308: aload #7
/*     */     //   310: putfield L$1 : Ljava/lang/Object;
/*     */     //   313: aload #11
/*     */     //   315: aconst_null
/*     */     //   316: putfield L$2 : Ljava/lang/Object;
/*     */     //   319: aload #11
/*     */     //   321: iconst_2
/*     */     //   322: putfield label : I
/*     */     //   325: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   330: dup
/*     */     //   331: aload #12
/*     */     //   333: if_acmpne -> 365
/*     */     //   336: aload #12
/*     */     //   338: areturn
/*     */     //   339: aload #11
/*     */     //   341: getfield L$1 : Ljava/lang/Object;
/*     */     //   344: checkcast java/lang/String
/*     */     //   347: astore #7
/*     */     //   349: aload #11
/*     */     //   351: getfield L$0 : Ljava/lang/Object;
/*     */     //   354: checkcast com/intellij/ml/llm/matterhorn/core/llm/LocalAICaches
/*     */     //   357: astore_0
/*     */     //   358: aload #10
/*     */     //   360: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   363: aload #10
/*     */     //   365: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   368: astore #9
/*     */     //   370: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   373: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   376: new com/intellij/ml/llm/matterhorn/core/llm/LocalAICaches$lookupOrBuild$2
/*     */     //   379: dup
/*     */     //   380: aload #9
/*     */     //   382: aload_0
/*     */     //   383: aload #7
/*     */     //   385: aconst_null
/*     */     //   386: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;Lcom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
/*     */     //   389: checkcast kotlin/jvm/functions/Function2
/*     */     //   392: aload #11
/*     */     //   394: aload #11
/*     */     //   396: aload #9
/*     */     //   398: putfield L$0 : Ljava/lang/Object;
/*     */     //   401: aload #11
/*     */     //   403: aconst_null
/*     */     //   404: putfield L$1 : Ljava/lang/Object;
/*     */     //   407: aload #11
/*     */     //   409: iconst_3
/*     */     //   410: putfield label : I
/*     */     //   413: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   416: dup
/*     */     //   417: aload #12
/*     */     //   419: if_acmpne -> 442
/*     */     //   422: aload #12
/*     */     //   424: areturn
/*     */     //   425: aload #11
/*     */     //   427: getfield L$0 : Ljava/lang/Object;
/*     */     //   430: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   433: astore #9
/*     */     //   435: aload #10
/*     */     //   437: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   440: aload #10
/*     */     //   442: pop
/*     */     //   443: aload #9
/*     */     //   445: areturn
/*     */     //   446: new java/lang/IllegalStateException
/*     */     //   449: dup
/*     */     //   450: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   452: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   455: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #68	-> 63
/*     */     //   #69	-> 105
/*     */     //   #220	-> 116
/*     */     //   #69	-> 137
/*     */     //   #70	-> 139
/*     */     //   #221	-> 150
/*     */     //   #70	-> 171
/*     */     //   #72	-> 173
/*     */     //   #74	-> 187
/*     */     //   #68	-> 243
/*     */     //   #78	-> 286
/*     */     //   #79	-> 291
/*     */     //   #82	-> 297
/*     */     //   #68	-> 336
/*     */     //   #84	-> 370
/*     */     //   #68	-> 422
/*     */     //   #89	-> 442
/*     */     //   #68	-> 446
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	141	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches;
/*     */     //   274	65	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches;
/*     */     //   358	58	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches;
/*     */     //   105	32	1	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   105	32	2	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   137	34	2	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   105	141	3	builder	Lkotlin/jvm/functions/Function1;
/*     */     //   265	26	3	builder	Lkotlin/jvm/functions/Function1;
/*     */     //   297	33	3	builder	Lkotlin/jvm/functions/Function1;
/*     */     //   139	32	5	chatEncoded	Ljava/lang/String;
/*     */     //   171	16	5	chatEncoded	Ljava/lang/String;
/*     */     //   113	24	6	this_$iv	Lkotlinx/serialization/json/Json;
/*     */     //   173	14	6	paramsEncoded	Ljava/lang/String;
/*     */     //   147	24	7	this_$iv	Lkotlinx/serialization/json/Json;
/*     */     //   187	59	7	hash	Ljava/lang/String;
/*     */     //   256	83	7	hash	Ljava/lang/String;
/*     */     //   349	67	7	hash	Ljava/lang/String;
/*     */     //   286	11	8	answer	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   370	55	9	response	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   435	11	9	response	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   116	21	7	$i$f$encodeToString	I
/*     */     //   150	21	8	$i$f$encodeToString	I
/*     */     //   0	456	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	393	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	386	10	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public LocalAICaches(@NotNull MatterhornCaches cachesService) {
/*  62 */     this.cachesService = cachesService;
/*     */ 
/*     */     
/*  65 */     EnvExtensionsKt.assertHasLocalCache(BuildConfigKt.getConfig());
/*     */   }
/*     */   @DebugMetadata(f = "AICaches.kt", l = {74, 82, 84}, i = {0, 0, 0, 1, 1, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"}, n = {"this", "builder", "hash", "this", "hash", "response"}, m = "lookupOrBuild", c = "com.intellij.ml.llm.matterhorn.core.llm.LocalAICaches") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class LocalAICaches$lookupOrBuild$1 extends ContinuationImpl {
/*     */     Object L$0; Object L$1; Object L$2; int label; LocalAICaches$lookupOrBuild$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE;
/*     */       return LocalAICaches.this.lookupOrBuild(null, null, null, (Continuation<? super AIAnswer>)this); }
/*     */   } @DebugMetadata(f = "AICaches.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.LocalAICaches$lookupOrBuild$answer$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nAICaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches$lookupOrBuild$answer$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,219:1\n222#2:220\n*S KotlinDebug\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches$lookupOrBuild$answer$1\n*L\n76#1:220\n*E\n"}) static final class LocalAICaches$lookupOrBuild$answer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AIAnswer>, Object> {
/*     */     int label; LocalAICaches$lookupOrBuild$answer$1(String $hash, Continuation $completion) { super(2, $completion); } public final Continuation<Unit> create(Object value, Continuation<? super LocalAICaches$lookupOrBuild$answer$1> $completion) { return (Continuation<Unit>)new LocalAICaches$lookupOrBuild$answer$1(this.$hash, $completion); } public final Object invokeSuspend(Object $result) { String cached;
/*     */       Json this_$iv;
/*     */       int $i$f$decodeFromString;
/*  74 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  75 */           if (LocalAICaches.this.cachesService.load(CacheType.Cache, this.$hash) == null) { LocalAICaches.this.cachesService.load(CacheType.Cache, this.$hash); return null; }
/*  76 */            this_$iv = (Json)Json.Default; $i$f$decodeFromString = 0;
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
/* 220 */           this_$iv.getSerializersModule(); return this_$iv.decodeFromString((DeserializationStrategy)AIAnswer.Companion.serializer(), cached); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((LocalAICaches$lookupOrBuild$answer$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @DebugMetadata(f = "AICaches.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.LocalAICaches$lookupOrBuild$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nAICaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches$lookupOrBuild$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,219:1\n205#2:220\n*S KotlinDebug\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LocalAICaches$lookupOrBuild$2\n*L\n85#1:220\n*E\n"}) static final class LocalAICaches$lookupOrBuild$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { public final Object invokeSuspend(Object $result) { String content; Json json; Object value$iv; int $i$f$encodeToString; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); json = (Json)Json.Default; value$iv = this.$response; $i$f$encodeToString = 0; json.getSerializersModule(); content = json.encodeToString((SerializationStrategy)AIAnswer.Companion.serializer(), value$iv);
/*     */           LocalAICaches.this.cachesService.save(CacheType.Cache, this.$hash, content);
/*     */           return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */     
/*     */     int label;
/*     */     
/*     */     LocalAICaches$lookupOrBuild$2(LocalAICaches $receiver, String $hash, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super LocalAICaches$lookupOrBuild$2> $completion) {
/*     */       return (Continuation<Unit>)new LocalAICaches$lookupOrBuild$2(LocalAICaches.this, this.$hash, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((LocalAICaches$lookupOrBuild$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\LocalAICaches.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */