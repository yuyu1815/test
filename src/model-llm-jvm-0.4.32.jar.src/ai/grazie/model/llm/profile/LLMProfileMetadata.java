/*    */ package ai.grazie.model.llm.profile;
/*    */ import ai.grazie.model.llm.bdg.LLMChatBudgeting;
/*    */ import ai.grazie.model.llm.bdg.LLMCompletionBudgeting;
/*    */ import ai.grazie.model.llm.bdg.pricing.LLMPerTokenPricing;
/*    */ import ai.grazie.model.llm.tokens.LLMTokenCounter;
/*    */ import ai.grazie.utils.mpp.FromResourceProvider;
/*    */ import ai.grazie.utils.mpp.RootDataLoader;
/*    */ import ai.grazie.utils.mpp.money.Credit;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.sync.Mutex;
/*    */ import kotlinx.coroutines.sync.MutexKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\t\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\0002\0020\001B-\b\026\022\016\020\002\032\n\022\006\b\001\022\0020\0040\003\022\006\020\005\032\0020\006\022\f\020\007\032\b\022\004\022\0020\t0\b¢\006\002\020\nBI\022\016\020\002\032\n\022\006\b\001\022\0020\0040\003\022\006\020\005\032\0020\006\022\b\020\013\032\004\030\0010\006\022\f\020\007\032\b\022\004\022\0020\t0\b\022\b\b\002\020\f\032\0020\r\022\b\b\002\020\016\032\0020\r¢\006\002\020\017J\034\020\034\032\b\022\004\022\0020\t0\0352\006\020\036\032\0020\037H@¢\006\002\020 J\034\020!\032\b\022\004\022\0020\t0\"2\006\020\036\032\0020\037H@¢\006\002\020 J\026\020#\032\0020\0042\006\020\036\032\0020\037H@¢\006\002\020 J\034\020$\032\b\022\004\022\0020\t0\"2\006\020\036\032\0020\037H@¢\006\002\020 R\026\020\002\032\n\022\006\b\001\022\0020\0040\003X\004¢\006\002\n\000R\021\020\016\032\0020\r¢\006\b\n\000\032\004\b\016\020\020R\025\020\013\032\004\030\0010\006¢\006\n\n\002\020\023\032\004\b\021\020\022R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\024\020\025R\016\020\026\032\0020\027X\004¢\006\002\n\000R\020\020\030\032\004\030\0010\004X\016¢\006\002\n\000R\027\020\007\032\b\022\004\022\0020\t0\b¢\006\b\n\000\032\004\b\031\020\032R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\033\020\020¨\006%"}, d2 = {"Lai/grazie/model/llm/profile/LLMProfileMetadata;", "", "counterProvider", "Lai/grazie/utils/mpp/FromResourceProvider;", "Lai/grazie/model/llm/tokens/LLMTokenCounter;", "maxTokens", "", "pricing", "Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "Lai/grazie/utils/mpp/money/Credit;", "(Lai/grazie/utils/mpp/FromResourceProvider;ILai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;)V", "maxOutputTokens", "useTokensMetadataBilling", "", "isReasoningModel", "(Lai/grazie/utils/mpp/FromResourceProvider;ILjava/lang/Integer;Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;ZZ)V", "()Z", "getMaxOutputTokens", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxTokens", "()I", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "myCounter", "getPricing", "()Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "getUseTokensMetadataBilling", "chatBudgeting", "Lai/grazie/model/llm/bdg/LLMChatBudgeting;", "loader", "Lai/grazie/utils/mpp/RootDataLoader;", "(Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completionBudgeting", "Lai/grazie/model/llm/bdg/LLMCompletionBudgeting;", "counter", "embeddingBudgeting", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMProfileMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMProfileMetadata.kt\nai/grazie/model/llm/profile/LLMProfileMetadata\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n116#2,7:71\n124#2,2:79\n1#3:78\n*S KotlinDebug\n*F\n+ 1 LLMProfileMetadata.kt\nai/grazie/model/llm/profile/LLMProfileMetadata\n*L\n45#1:71,7\n45#1:79,2\n*E\n"})
/*    */ public final class LLMProfileMetadata {
/*    */   public LLMProfileMetadata(@NotNull FromResourceProvider<? extends LLMTokenCounter> counterProvider, int maxTokens, @Nullable Integer maxOutputTokens, @NotNull LLMPerTokenPricing<Credit> pricing, boolean useTokensMetadataBilling, boolean isReasoningModel) {
/* 24 */     this.counterProvider = counterProvider;
/* 25 */     this.maxTokens = maxTokens;
/* 26 */     this.maxOutputTokens = maxOutputTokens;
/* 27 */     this.pricing = pricing;
/* 28 */     this.useTokensMetadataBilling = useTokensMetadataBilling;
/* 29 */     this.isReasoningModel = isReasoningModel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     this.mutex = MutexKt.Mutex(false);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final FromResourceProvider<? extends LLMTokenCounter> counterProvider;
/*    */   private final int maxTokens;
/*    */   @Nullable
/*    */   private final Integer maxOutputTokens;
/*    */   @NotNull
/*    */   private final LLMPerTokenPricing<Credit> pricing;
/*    */   private final boolean useTokensMetadataBilling;
/*    */   private final boolean isReasoningModel;
/*    */   @NotNull
/*    */   private final Mutex mutex;
/*    */   @Nullable
/*    */   private LLMTokenCounter myCounter;
/*    */   
/*    */   public final int getMaxTokens() {
/*    */     return this.maxTokens;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer getMaxOutputTokens() {
/*    */     return this.maxOutputTokens;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMPerTokenPricing<Credit> getPricing() {
/*    */     return this.pricing;
/*    */   }
/*    */   
/*    */   public final boolean getUseTokensMetadataBilling() {
/*    */     return this.useTokensMetadataBilling;
/*    */   }
/*    */   
/*    */   public final boolean isReasoningModel() {
/*    */     return this.isReasoningModel;
/*    */   }
/*    */   
/*    */   public LLMProfileMetadata(@NotNull FromResourceProvider counterProvider, int maxTokens, @NotNull LLMPerTokenPricing pricing) {
/*    */     this(counterProvider, maxTokens, null, pricing, false, false, 48, null);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object counter(@NotNull RootDataLoader loader, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/profile/LLMProfileMetadata$counter$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/profile/LLMProfileMetadata$counter$1
/*    */     //   11: astore #13
/*    */     //   13: aload #13
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #13
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/profile/LLMProfileMetadata$counter$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/profile/LLMProfileMetadata;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #13
/*    */     //   50: aload #13
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #12
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #14
/*    */     //   62: aload #13
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 340, 0 -> 92, 1 -> 152, 2 -> 251
/*    */     //   92: aload #12
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*    */     //   101: astore_3
/*    */     //   102: aconst_null
/*    */     //   103: astore #4
/*    */     //   105: iconst_0
/*    */     //   106: istore #5
/*    */     //   108: nop
/*    */     //   109: aload_3
/*    */     //   110: aload #4
/*    */     //   112: aload #13
/*    */     //   114: aload #13
/*    */     //   116: aload_0
/*    */     //   117: putfield L$0 : Ljava/lang/Object;
/*    */     //   120: aload #13
/*    */     //   122: aload_1
/*    */     //   123: putfield L$1 : Ljava/lang/Object;
/*    */     //   126: aload #13
/*    */     //   128: aload_3
/*    */     //   129: putfield L$2 : Ljava/lang/Object;
/*    */     //   132: aload #13
/*    */     //   134: iconst_1
/*    */     //   135: putfield label : I
/*    */     //   138: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   143: dup
/*    */     //   144: aload #14
/*    */     //   146: if_acmpne -> 192
/*    */     //   149: aload #14
/*    */     //   151: areturn
/*    */     //   152: iconst_0
/*    */     //   153: istore #5
/*    */     //   155: aconst_null
/*    */     //   156: astore #4
/*    */     //   158: aload #13
/*    */     //   160: getfield L$2 : Ljava/lang/Object;
/*    */     //   163: checkcast kotlinx/coroutines/sync/Mutex
/*    */     //   166: astore_3
/*    */     //   167: aload #13
/*    */     //   169: getfield L$1 : Ljava/lang/Object;
/*    */     //   172: checkcast ai/grazie/utils/mpp/RootDataLoader
/*    */     //   175: astore_1
/*    */     //   176: aload #13
/*    */     //   178: getfield L$0 : Ljava/lang/Object;
/*    */     //   181: checkcast ai/grazie/model/llm/profile/LLMProfileMetadata
/*    */     //   184: astore_0
/*    */     //   185: aload #12
/*    */     //   187: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   190: aload #12
/*    */     //   192: pop
/*    */     //   193: nop
/*    */     //   194: iconst_0
/*    */     //   195: istore #6
/*    */     //   197: aload_0
/*    */     //   198: getfield myCounter : Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   201: dup
/*    */     //   202: ifnonnull -> 309
/*    */     //   205: pop
/*    */     //   206: aload_0
/*    */     //   207: getfield counterProvider : Lai/grazie/utils/mpp/FromResourceProvider;
/*    */     //   210: aload_1
/*    */     //   211: aload #13
/*    */     //   213: aload #13
/*    */     //   215: aload_0
/*    */     //   216: putfield L$0 : Ljava/lang/Object;
/*    */     //   219: aload #13
/*    */     //   221: aload_3
/*    */     //   222: putfield L$1 : Ljava/lang/Object;
/*    */     //   225: aload #13
/*    */     //   227: aconst_null
/*    */     //   228: putfield L$2 : Ljava/lang/Object;
/*    */     //   231: aload #13
/*    */     //   233: iconst_2
/*    */     //   234: putfield label : I
/*    */     //   237: invokeinterface load : (Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   242: dup
/*    */     //   243: aload #14
/*    */     //   245: if_acmpne -> 286
/*    */     //   248: aload #14
/*    */     //   250: areturn
/*    */     //   251: iconst_0
/*    */     //   252: istore #5
/*    */     //   254: iconst_0
/*    */     //   255: istore #6
/*    */     //   257: aconst_null
/*    */     //   258: astore #4
/*    */     //   260: aload #13
/*    */     //   262: getfield L$1 : Ljava/lang/Object;
/*    */     //   265: checkcast kotlinx/coroutines/sync/Mutex
/*    */     //   268: astore_3
/*    */     //   269: aload #13
/*    */     //   271: getfield L$0 : Ljava/lang/Object;
/*    */     //   274: checkcast ai/grazie/model/llm/profile/LLMProfileMetadata
/*    */     //   277: astore_0
/*    */     //   278: nop
/*    */     //   279: aload #12
/*    */     //   281: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   284: aload #12
/*    */     //   286: astore #7
/*    */     //   288: aload #7
/*    */     //   290: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   293: astore #8
/*    */     //   295: iconst_0
/*    */     //   296: istore #9
/*    */     //   298: aload_0
/*    */     //   299: aload #8
/*    */     //   301: putfield myCounter : Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   304: aload #7
/*    */     //   306: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   309: nop
/*    */     //   310: astore #10
/*    */     //   312: aload_3
/*    */     //   313: aload #4
/*    */     //   315: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   320: goto -> 336
/*    */     //   323: astore #11
/*    */     //   325: aload_3
/*    */     //   326: aload #4
/*    */     //   328: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   333: aload #11
/*    */     //   335: athrow
/*    */     //   336: aload #10
/*    */     //   338: nop
/*    */     //   339: areturn
/*    */     //   340: new java/lang/IllegalStateException
/*    */     //   343: dup
/*    */     //   344: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   346: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   349: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #45	-> 60
/*    */     //   #45	-> 97
/*    */     //   #71	-> 102
/*    */     //   #72	-> 108
/*    */     //   #75	-> 109
/*    */     //   #45	-> 149
/*    */     //   #76	-> 192
/*    */     //   #77	-> 194
/*    */     //   #46	-> 197
/*    */     //   #45	-> 248
/*    */     //   #78	-> 295
/*    */     //   #46	-> 298
/*    */     //   #46	-> 304
/*    */     //   #46	-> 309
/*    */     //   #77	-> 310
/*    */     //   #79	-> 312
/*    */     //   #80	-> 320
/*    */     //   #79	-> 323
/*    */     //   #76	-> 338
/*    */     //   #47	-> 339
/*    */     //   #45	-> 340
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	55	0	this	Lai/grazie/model/llm/profile/LLMProfileMetadata;
/*    */     //   185	66	0	this	Lai/grazie/model/llm/profile/LLMProfileMetadata;
/*    */     //   278	26	0	this	Lai/grazie/model/llm/profile/LLMProfileMetadata;
/*    */     //   97	55	1	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   176	29	1	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   205	37	1	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   102	50	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   167	84	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   269	41	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   310	10	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   323	16	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   105	47	4	owner$iv	Ljava/lang/Object;
/*    */     //   167	84	4	owner$iv	Ljava/lang/Object;
/*    */     //   269	41	4	owner$iv	Ljava/lang/Object;
/*    */     //   310	10	4	owner$iv	Ljava/lang/Object;
/*    */     //   323	16	4	owner$iv	Ljava/lang/Object;
/*    */     //   295	9	8	it	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   298	6	9	$i$a$-also-LLMProfileMetadata$counter$2$1	I
/*    */     //   197	54	6	$i$a$-withLock$default-LLMProfileMetadata$counter$2	I
/*    */     //   108	44	5	$i$f$withLock	I
/*    */     //   0	350	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	290	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	283	12	$result	Ljava/lang/Object;
/*    */     //   155	96	5	$i$f$withLock	I
/*    */     //   257	53	6	$i$a$-withLock$default-LLMProfileMetadata$counter$2	I
/*    */     //   254	85	5	$i$f$withLock	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   193	242	323	finally
/*    */     //   278	312	323	finally
/*    */     //   323	325	323	finally
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object chatBudgeting(@NotNull RootDataLoader loader, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/profile/LLMProfileMetadata$chatBudgeting$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/profile/LLMProfileMetadata$chatBudgeting$1
/*    */     //   11: astore #5
/*    */     //   13: aload #5
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #5
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/profile/LLMProfileMetadata$chatBudgeting$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/profile/LLMProfileMetadata;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #5
/*    */     //   50: aload #5
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #4
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #5
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 163, 0 -> 88, 1 -> 126
/*    */     //   88: aload #4
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: getfield pricing : Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;
/*    */     //   97: astore_3
/*    */     //   98: aload_0
/*    */     //   99: aload_1
/*    */     //   100: aload #5
/*    */     //   102: aload #5
/*    */     //   104: aload_3
/*    */     //   105: putfield L$0 : Ljava/lang/Object;
/*    */     //   108: aload #5
/*    */     //   110: iconst_1
/*    */     //   111: putfield label : I
/*    */     //   114: invokevirtual counter : (Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   117: dup
/*    */     //   118: aload #8
/*    */     //   120: if_acmpne -> 142
/*    */     //   123: aload #8
/*    */     //   125: areturn
/*    */     //   126: aload #5
/*    */     //   128: getfield L$0 : Ljava/lang/Object;
/*    */     //   131: checkcast ai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing
/*    */     //   134: astore_3
/*    */     //   135: aload #4
/*    */     //   137: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   140: aload #4
/*    */     //   142: aload_3
/*    */     //   143: swap
/*    */     //   144: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   147: astore #6
/*    */     //   149: astore #7
/*    */     //   151: new ai/grazie/model/llm/bdg/LLMChatBudgeting
/*    */     //   154: dup
/*    */     //   155: aload #7
/*    */     //   157: aload #6
/*    */     //   159: invokespecial <init> : (Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;Lai/grazie/model/llm/tokens/LLMTokenCounter;)V
/*    */     //   162: areturn
/*    */     //   163: new java/lang/IllegalStateException
/*    */     //   166: dup
/*    */     //   167: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   169: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   172: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #49	-> 60
/*    */     //   #50	-> 93
/*    */     //   #51	-> 93
/*    */     //   #52	-> 98
/*    */     //   #49	-> 123
/*    */     //   #50	-> 147
/*    */     //   #49	-> 163
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	24	0	this	Lai/grazie/model/llm/profile/LLMProfileMetadata;
/*    */     //   93	24	1	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   0	173	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	113	5	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	106	4	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object completionBudgeting(@NotNull RootDataLoader loader, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/profile/LLMProfileMetadata$completionBudgeting$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/profile/LLMProfileMetadata$completionBudgeting$1
/*    */     //   11: astore #5
/*    */     //   13: aload #5
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #5
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/profile/LLMProfileMetadata$completionBudgeting$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/profile/LLMProfileMetadata;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #5
/*    */     //   50: aload #5
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #4
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #5
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 163, 0 -> 88, 1 -> 126
/*    */     //   88: aload #4
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: getfield pricing : Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;
/*    */     //   97: astore_3
/*    */     //   98: aload_0
/*    */     //   99: aload_1
/*    */     //   100: aload #5
/*    */     //   102: aload #5
/*    */     //   104: aload_3
/*    */     //   105: putfield L$0 : Ljava/lang/Object;
/*    */     //   108: aload #5
/*    */     //   110: iconst_1
/*    */     //   111: putfield label : I
/*    */     //   114: invokevirtual counter : (Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   117: dup
/*    */     //   118: aload #8
/*    */     //   120: if_acmpne -> 142
/*    */     //   123: aload #8
/*    */     //   125: areturn
/*    */     //   126: aload #5
/*    */     //   128: getfield L$0 : Ljava/lang/Object;
/*    */     //   131: checkcast ai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing
/*    */     //   134: astore_3
/*    */     //   135: aload #4
/*    */     //   137: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   140: aload #4
/*    */     //   142: aload_3
/*    */     //   143: swap
/*    */     //   144: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   147: astore #6
/*    */     //   149: astore #7
/*    */     //   151: new ai/grazie/model/llm/bdg/LLMCompletionBudgeting
/*    */     //   154: dup
/*    */     //   155: aload #7
/*    */     //   157: aload #6
/*    */     //   159: invokespecial <init> : (Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;Lai/grazie/model/llm/tokens/LLMTokenCounter;)V
/*    */     //   162: areturn
/*    */     //   163: new java/lang/IllegalStateException
/*    */     //   166: dup
/*    */     //   167: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   169: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   172: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #56	-> 60
/*    */     //   #57	-> 93
/*    */     //   #58	-> 93
/*    */     //   #59	-> 98
/*    */     //   #56	-> 123
/*    */     //   #57	-> 147
/*    */     //   #56	-> 163
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	24	0	this	Lai/grazie/model/llm/profile/LLMProfileMetadata;
/*    */     //   93	24	1	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   0	173	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	113	5	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	106	4	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object embeddingBudgeting(@NotNull RootDataLoader loader, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/profile/LLMProfileMetadata$embeddingBudgeting$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/profile/LLMProfileMetadata$embeddingBudgeting$1
/*    */     //   11: astore #5
/*    */     //   13: aload #5
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #5
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/profile/LLMProfileMetadata$embeddingBudgeting$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/profile/LLMProfileMetadata;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #5
/*    */     //   50: aload #5
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #4
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #5
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 163, 0 -> 88, 1 -> 126
/*    */     //   88: aload #4
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: getfield pricing : Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;
/*    */     //   97: astore_3
/*    */     //   98: aload_0
/*    */     //   99: aload_1
/*    */     //   100: aload #5
/*    */     //   102: aload #5
/*    */     //   104: aload_3
/*    */     //   105: putfield L$0 : Ljava/lang/Object;
/*    */     //   108: aload #5
/*    */     //   110: iconst_1
/*    */     //   111: putfield label : I
/*    */     //   114: invokevirtual counter : (Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   117: dup
/*    */     //   118: aload #8
/*    */     //   120: if_acmpne -> 142
/*    */     //   123: aload #8
/*    */     //   125: areturn
/*    */     //   126: aload #5
/*    */     //   128: getfield L$0 : Ljava/lang/Object;
/*    */     //   131: checkcast ai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing
/*    */     //   134: astore_3
/*    */     //   135: aload #4
/*    */     //   137: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   140: aload #4
/*    */     //   142: aload_3
/*    */     //   143: swap
/*    */     //   144: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   147: astore #6
/*    */     //   149: astore #7
/*    */     //   151: new ai/grazie/model/llm/bdg/LLMCompletionBudgeting
/*    */     //   154: dup
/*    */     //   155: aload #7
/*    */     //   157: aload #6
/*    */     //   159: invokespecial <init> : (Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;Lai/grazie/model/llm/tokens/LLMTokenCounter;)V
/*    */     //   162: areturn
/*    */     //   163: new java/lang/IllegalStateException
/*    */     //   166: dup
/*    */     //   167: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   169: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   172: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #63	-> 60
/*    */     //   #64	-> 93
/*    */     //   #65	-> 93
/*    */     //   #66	-> 98
/*    */     //   #63	-> 123
/*    */     //   #64	-> 147
/*    */     //   #63	-> 163
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	24	0	this	Lai/grazie/model/llm/profile/LLMProfileMetadata;
/*    */     //   93	24	1	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   0	173	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	113	5	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	106	4	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMProfileMetadata.kt", l = {52}, i = {}, s = {}, n = {}, m = "chatBudgeting", c = "ai.grazie.model.llm.profile.LLMProfileMetadata")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMProfileMetadata$chatBudgeting$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     LLMProfileMetadata$chatBudgeting$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMProfileMetadata.this.chatBudgeting(null, (Continuation<? super LLMChatBudgeting<Credit>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMProfileMetadata.kt", l = {59}, i = {}, s = {}, n = {}, m = "completionBudgeting", c = "ai.grazie.model.llm.profile.LLMProfileMetadata")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMProfileMetadata$completionBudgeting$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     LLMProfileMetadata$completionBudgeting$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMProfileMetadata.this.completionBudgeting(null, (Continuation<? super LLMCompletionBudgeting<Credit>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMProfileMetadata.kt", l = {75, 46}, i = {0, 0, 0, 1, 1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"this", "loader", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m = "counter", c = "ai.grazie.model.llm.profile.LLMProfileMetadata")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMProfileMetadata$counter$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     LLMProfileMetadata$counter$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMProfileMetadata.this.counter(null, (Continuation<? super LLMTokenCounter>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMProfileMetadata.kt", l = {66}, i = {}, s = {}, n = {}, m = "embeddingBudgeting", c = "ai.grazie.model.llm.profile.LLMProfileMetadata")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMProfileMetadata$embeddingBudgeting$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     LLMProfileMetadata$embeddingBudgeting$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMProfileMetadata.this.embeddingBudgeting(null, (Continuation<? super LLMCompletionBudgeting<Credit>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\LLMProfileMetadata.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */