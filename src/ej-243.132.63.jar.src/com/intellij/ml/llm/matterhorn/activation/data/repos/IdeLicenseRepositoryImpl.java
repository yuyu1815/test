/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.IdeLicenseAiFlag;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.ui.LicensingFacade;
/*     */ import com.intellij.util.ApplicationKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowKt;
/*     */ import kotlinx.coroutines.flow.SharedFlow;
/*     */ import kotlinx.coroutines.flow.SharingStarted;
/*     */ import kotlinx.coroutines.flow.StateFlow;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\026\020\016\032\0020\0172\006\020\020\032\0020\013H@¢\006\002\020\021R\026\020\006\032\n\022\006\022\004\030\0010\b0\007X\004¢\006\002\n\000R\032\020\t\032\b\022\004\022\0020\0130\nX\004¢\006\b\n\000\032\004\b\f\020\r¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeLicenseRepository;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "licensingFacadeStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/intellij/ui/LicensingFacade;", "aiFlagFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;", "getAiFlagFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "refreshAiFlagAndAwait", "", "desiredAiFlag", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data.repos"})
/*     */ @SourceDebugExtension({"SMAP\nJunieIdeLicenseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieIdeLicenseRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,125:1\n49#2:126\n51#2:130\n17#2:131\n19#2:135\n49#2:136\n51#2:140\n46#3:127\n51#3:129\n46#3:132\n51#3:134\n46#3:137\n51#3:139\n105#4:128\n105#4:133\n105#4:138\n*S KotlinDebug\n*F\n+ 1 JunieIdeLicenseRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl\n*L\n65#1:126\n65#1:130\n85#1:131\n85#1:135\n86#1:136\n86#1:140\n65#1:127\n65#1:129\n85#1:132\n85#1:134\n86#1:137\n86#1:139\n65#1:128\n85#1:133\n86#1:138\n*E\n"})
/*     */ final class IdeLicenseRepositoryImpl
/*     */   implements JunieIdeLicenseRepository
/*     */ {
/*     */   @NotNull
/*     */   private final StateFlow<LicensingFacade> licensingFacadeStateFlow;
/*     */   @NotNull
/*     */   private final SharedFlow<IdeLicenseAiFlag> aiFlagFlow;
/*     */   
/*     */   public IdeLicenseRepositoryImpl(@NotNull CoroutineScope cs) {
/*  62 */     this.licensingFacadeStateFlow = JunieIdeLicenseRepositoryKt.access$licensingFacadeStateIn((ComponentManager)ApplicationKt.getApplication(), cs);
/*     */     
/*  64 */     Flow flow1 = (Flow)this.licensingFacadeStateFlow;
/*  65 */     int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 126 */     Flow $this$unsafeTransform$iv$iv = flow1; int $i$f$unsafeTransform = 0;
/* 127 */     int $i$f$unsafeFlow = 0;
/* 128 */     this.aiFlagFlow = (SharedFlow<IdeLicenseAiFlag>)FlowKt.stateIn(new IdeLicenseRepositoryImpl$special$$inlined$map$1($this$unsafeTransform$iv$iv), cs, SharingStarted.Companion.getEagerly(), IdeLicenseAiFlag.LicenseAiUnknown);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public SharedFlow<IdeLicenseAiFlag> getAiFlagFlow() {
/*     */     return this.aiFlagFlow;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object refreshAiFlagAndAwait(@NotNull IdeLicenseAiFlag desiredAiFlag, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$1
/*     */     //   11: astore #11
/*     */     //   13: aload #11
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #11
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #11
/*     */     //   50: aload #11
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #10
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #12
/*     */     //   62: aload #11
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 344, 0 -> 92, 1 -> 153, 2 -> 332
/*     */     //   92: aload #10
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: getfield licensingFacadeStateFlow : Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   101: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   106: checkcast com/intellij/ui/LicensingFacade
/*     */     //   109: astore_3
/*     */     //   110: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   115: aload #11
/*     */     //   117: aload #11
/*     */     //   119: aload_0
/*     */     //   120: putfield L$0 : Ljava/lang/Object;
/*     */     //   123: aload #11
/*     */     //   125: aload_1
/*     */     //   126: putfield L$1 : Ljava/lang/Object;
/*     */     //   129: aload #11
/*     */     //   131: aload_3
/*     */     //   132: putfield L$2 : Ljava/lang/Object;
/*     */     //   135: aload #11
/*     */     //   137: iconst_1
/*     */     //   138: putfield label : I
/*     */     //   141: invokestatic blockingContext : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   144: dup
/*     */     //   145: aload #12
/*     */     //   147: if_acmpne -> 187
/*     */     //   150: aload #12
/*     */     //   152: areturn
/*     */     //   153: aload #11
/*     */     //   155: getfield L$2 : Ljava/lang/Object;
/*     */     //   158: checkcast com/intellij/ui/LicensingFacade
/*     */     //   161: astore_3
/*     */     //   162: aload #11
/*     */     //   164: getfield L$1 : Ljava/lang/Object;
/*     */     //   167: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag
/*     */     //   170: astore_1
/*     */     //   171: aload #11
/*     */     //   173: getfield L$0 : Ljava/lang/Object;
/*     */     //   176: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl
/*     */     //   179: astore_0
/*     */     //   180: aload #10
/*     */     //   182: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   185: aload #10
/*     */     //   187: checkcast java/lang/Boolean
/*     */     //   190: invokevirtual booleanValue : ()Z
/*     */     //   193: istore #4
/*     */     //   195: iload #4
/*     */     //   197: ifne -> 204
/*     */     //   200: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   203: areturn
/*     */     //   204: aload_3
/*     */     //   205: invokestatic access$toAiFlag : (Lcom/intellij/ui/LicensingFacade;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;
/*     */     //   208: aload_1
/*     */     //   209: if_acmpne -> 216
/*     */     //   212: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   215: areturn
/*     */     //   216: aload_0
/*     */     //   217: getfield licensingFacadeStateFlow : Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   220: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   223: astore #5
/*     */     //   225: iconst_0
/*     */     //   226: istore #6
/*     */     //   228: aload #5
/*     */     //   230: astore #7
/*     */     //   232: iconst_0
/*     */     //   233: istore #8
/*     */     //   235: iconst_0
/*     */     //   236: istore #9
/*     */     //   238: new com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$$inlined$filter$1
/*     */     //   241: dup
/*     */     //   242: aload #7
/*     */     //   244: aload_3
/*     */     //   245: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lcom/intellij/ui/LicensingFacade;)V
/*     */     //   248: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   251: nop
/*     */     //   252: nop
/*     */     //   253: astore #5
/*     */     //   255: iconst_0
/*     */     //   256: istore #6
/*     */     //   258: aload #5
/*     */     //   260: astore #7
/*     */     //   262: iconst_0
/*     */     //   263: istore #8
/*     */     //   265: iconst_0
/*     */     //   266: istore #9
/*     */     //   268: new com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$$inlined$map$1
/*     */     //   271: dup
/*     */     //   272: aload #7
/*     */     //   274: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */     //   277: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   280: nop
/*     */     //   281: nop
/*     */     //   282: new com/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4
/*     */     //   285: dup
/*     */     //   286: aload_1
/*     */     //   287: aconst_null
/*     */     //   288: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;Lkotlin/coroutines/Continuation;)V
/*     */     //   291: checkcast kotlin/jvm/functions/Function2
/*     */     //   294: aload #11
/*     */     //   296: aload #11
/*     */     //   298: aconst_null
/*     */     //   299: putfield L$0 : Ljava/lang/Object;
/*     */     //   302: aload #11
/*     */     //   304: aconst_null
/*     */     //   305: putfield L$1 : Ljava/lang/Object;
/*     */     //   308: aload #11
/*     */     //   310: aconst_null
/*     */     //   311: putfield L$2 : Ljava/lang/Object;
/*     */     //   314: aload #11
/*     */     //   316: iconst_2
/*     */     //   317: putfield label : I
/*     */     //   320: invokestatic first : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   323: dup
/*     */     //   324: aload #12
/*     */     //   326: if_acmpne -> 339
/*     */     //   329: aload #12
/*     */     //   331: areturn
/*     */     //   332: aload #10
/*     */     //   334: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   337: aload #10
/*     */     //   339: pop
/*     */     //   340: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   343: areturn
/*     */     //   344: new java/lang/IllegalStateException
/*     */     //   347: dup
/*     */     //   348: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   350: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   353: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #69	-> 60
/*     */     //   #70	-> 97
/*     */     //   #72	-> 117
/*     */     //   #69	-> 150
/*     */     //   #72	-> 187
/*     */     //   #75	-> 195
/*     */     //   #76	-> 200
/*     */     //   #80	-> 204
/*     */     //   #81	-> 212
/*     */     //   #84	-> 216
/*     */     //   #85	-> 225
/*     */     //   #131	-> 228
/*     */     //   #132	-> 235
/*     */     //   #133	-> 238
/*     */     //   #134	-> 251
/*     */     //   #135	-> 252
/*     */     //   #86	-> 255
/*     */     //   #136	-> 258
/*     */     //   #137	-> 265
/*     */     //   #138	-> 268
/*     */     //   #139	-> 280
/*     */     //   #140	-> 281
/*     */     //   #87	-> 282
/*     */     //   #69	-> 329
/*     */     //   #88	-> 339
/*     */     //   #69	-> 344
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	56	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl;
/*     */     //   180	20	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl;
/*     */     //   204	8	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl;
/*     */     //   216	9	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/IdeLicenseRepositoryImpl;
/*     */     //   97	56	1	desiredAiFlag	Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;
/*     */     //   171	29	1	desiredAiFlag	Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;
/*     */     //   204	8	1	desiredAiFlag	Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;
/*     */     //   216	37	1	desiredAiFlag	Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;
/*     */     //   253	29	1	desiredAiFlag	Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;
/*     */     //   282	41	1	desiredAiFlag	Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;
/*     */     //   110	43	3	oldFacadeValue	Lcom/intellij/ui/LicensingFacade;
/*     */     //   162	38	3	oldFacadeValue	Lcom/intellij/ui/LicensingFacade;
/*     */     //   204	8	3	oldFacadeValue	Lcom/intellij/ui/LicensingFacade;
/*     */     //   216	35	3	oldFacadeValue	Lcom/intellij/ui/LicensingFacade;
/*     */     //   195	5	4	isValidationLaunched	Z
/*     */     //   225	28	5	$this$filter$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   255	27	5	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   232	20	7	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   262	19	7	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   238	13	9	$i$f$unsafeFlow	I
/*     */     //   235	17	8	$i$f$unsafeTransform	I
/*     */     //   228	25	6	$i$f$filter	I
/*     */     //   268	12	9	$i$f$unsafeFlow	I
/*     */     //   265	16	8	$i$f$unsafeTransform	I
/*     */     //   258	24	6	$i$f$map	I
/*     */     //   0	354	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	294	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	287	10	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final boolean refreshAiFlagAndAwait$lambda$1() {
/*     */     return JunieIdeLicenseRepositoryKt.access$launchLicenseValidation();
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieIdeLicenseRepository.kt", l = {72, 87}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "desiredAiFlag", "oldFacadeValue"}, m = "refreshAiFlagAndAwait", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.IdeLicenseRepositoryImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return IdeLicenseRepositoryImpl.this.refreshAiFlagAndAwait(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieIdeLicenseRepository.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;"})
/*     */   static final class IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4 extends SuspendLambda implements Function2<IdeLicenseAiFlag, Continuation<? super Boolean>, Object> {
/*     */     int label;
/*     */     
/*     */     IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4(IdeLicenseAiFlag $desiredAiFlag, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IdeLicenseAiFlag it;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           it = (IdeLicenseAiFlag)this.L$0;
/*     */           return Boxing.boxBoolean((it == this.$desiredAiFlag));
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4> $completion) {
/*     */       IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4 ideLicenseRepositoryImpl$refreshAiFlagAndAwait$4 = new IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4(this.$desiredAiFlag, $completion);
/*     */       ideLicenseRepositoryImpl$refreshAiFlagAndAwait$4.L$0 = value;
/*     */       return (Continuation<Unit>)ideLicenseRepositoryImpl$refreshAiFlagAndAwait$4;
/*     */     }
/*     */     
/*     */     public final Object invoke(IdeLicenseAiFlag p1, Continuation<?> p2) {
/*     */       return ((IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\IdeLicenseRepositoryImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */