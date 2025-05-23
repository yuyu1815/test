/*     */ package androidx.lifecycle.compose;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.ProduceStateScope;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.lifecycle.Lifecycle;
/*     */ import androidx.lifecycle.LifecycleOwner;
/*     */ import androidx.lifecycle.RepeatOnLifecycleKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.EmptyCoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032G\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\004\032\002H\0022\006\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\nH\007¢\006\002\020\013\032I\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\004\032\002H\0022\b\b\002\020\f\032\0020\r2\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\nH\007¢\006\002\020\016\032?\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0172\006\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\nH\007¢\006\002\020\020\032A\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0172\b\b\002\020\f\032\0020\r2\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\nH\007¢\006\002\020\021¨\006\022"}, d2 = {"collectAsStateWithLifecycle", "Landroidx/compose/runtime/State;", "T", "Lkotlinx/coroutines/flow/Flow;", "initialValue", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose"})
/*     */ @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,181:1\n74#2:182\n74#2:183\n1117#3,6:184\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n*L\n58#1:182\n131#1:183\n171#1:184,6\n*E\n"})
/*     */ public final class FlowExtKt {
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final <T> State<T> collectAsStateWithLifecycle(@NotNull StateFlow $this$collectAsStateWithLifecycle, @NotNull Lifecycle lifecycle, @Nullable Lifecycle.State minActiveState, @Nullable CoroutineContext context, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     Intrinsics.checkNotNullParameter($this$collectAsStateWithLifecycle, "<this>");
/*     */     Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
/*     */     $composer.startReplaceableGroup(-1858162195);
/*     */     ComposerKt.sourceInformation($composer, "C(collectAsStateWithLifecycle)P(1,2)95@4299L147:FlowExt.kt#2vxrgp");
/*     */     if ((paramInt1 & 0x2) != 0)
/*     */       minActiveState = Lifecycle.State.STARTED; 
/*     */     if ((paramInt1 & 0x4) != 0)
/*     */       context = (CoroutineContext)EmptyCoroutineContext.INSTANCE; 
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-1858162195, $changed, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:95)"); 
/*     */     State<T> state = collectAsStateWithLifecycle((Flow)$this$collectAsStateWithLifecycle, $this$collectAsStateWithLifecycle.getValue(), lifecycle, minActiveState, context, $composer, 0xE & $changed | 0x380 & $changed << 3 | 0x1C00 & $changed << 3 | 0xE000 & $changed << 3, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceableGroup();
/*     */     return state;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final <T> State<T> collectAsStateWithLifecycle(@NotNull StateFlow $this$collectAsStateWithLifecycle, @Nullable LifecycleOwner lifecycleOwner, @Nullable Lifecycle.State minActiveState, @Nullable CoroutineContext context, @Nullable Composer $composer, int $changed, int paramInt1) {
/*  58 */     Intrinsics.checkNotNullParameter($this$collectAsStateWithLifecycle, "<this>"); $composer.startReplaceableGroup(743249048); ComposerKt.sourceInformation($composer, "C(collectAsStateWithLifecycle)P(1,2)57@2548L7,60@2688L162:FlowExt.kt#2vxrgp"); if ((paramInt1 & 0x1) != 0) { CompositionLocal compositionLocal = (CompositionLocal)LocalLifecycleOwnerKt.getLocalLifecycleOwner(); int $changed$iv = 6, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 182 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); lifecycleOwner = (LifecycleOwner)object; }  if ((paramInt1 & 0x2) != 0) minActiveState = Lifecycle.State.STARTED;  if ((paramInt1 & 0x4) != 0) context = (CoroutineContext)EmptyCoroutineContext.INSTANCE;  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(743249048, $changed, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:60)");  State<T> state = collectAsStateWithLifecycle((Flow)$this$collectAsStateWithLifecycle, $this$collectAsStateWithLifecycle.getValue(), lifecycleOwner.getLifecycle(), minActiveState, context, $composer, 0xE & $changed | 0x1C00 & $changed << 3 | 0xE000 & $changed << 3, 0); if (ComposerKt.isTraceInProgress())
/* 183 */       ComposerKt.traceEventEnd();  $composer.endReplaceableGroup(); return state; } @Composable @NotNull public static final <T> State<T> collectAsStateWithLifecycle(@NotNull Flow<?> $this$collectAsStateWithLifecycle, Object initialValue, @Nullable LifecycleOwner lifecycleOwner, @Nullable Lifecycle.State minActiveState, @Nullable CoroutineContext context, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$collectAsStateWithLifecycle, "<this>"); $composer.startReplaceableGroup(-1485997211); ComposerKt.sourceInformation($composer, "C(collectAsStateWithLifecycle)P(1,2,3)130@5826L7,133@5966L164:FlowExt.kt#2vxrgp"); if ((paramInt1 & 0x2) != 0) { CompositionLocal compositionLocal = (CompositionLocal)LocalLifecycleOwnerKt.getLocalLifecycleOwner(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); lifecycleOwner = (LifecycleOwner)object; }  if ((paramInt1 & 0x4) != 0) minActiveState = Lifecycle.State.STARTED;  if ((paramInt1 & 0x8) != 0) context = (CoroutineContext)EmptyCoroutineContext.INSTANCE;  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1485997211, $changed, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:133)");  State<T> state = collectAsStateWithLifecycle($this$collectAsStateWithLifecycle, initialValue, lifecycleOwner.getLifecycle(), minActiveState, context, $composer, 0xE & $changed | (0x8 & $changed >> 3) << 3 | 0x70 & $changed | 0x1C00 & $changed | 0xE000 & $changed, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceableGroup(); return state; } @Composable @NotNull public static final <T> State<T> collectAsStateWithLifecycle(@NotNull Flow<? extends T> $this$collectAsStateWithLifecycle, Object initialValue, @NotNull Lifecycle lifecycle, @Nullable Lifecycle.State minActiveState, @Nullable CoroutineContext context, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$collectAsStateWithLifecycle, "<this>"); Intrinsics.checkNotNullParameter(lifecycle, "lifecycle"); $composer.startReplaceableGroup(1977777920); ComposerKt.sourceInformation($composer, "C(collectAsStateWithLifecycle)P(1,2,3)170@7594L359,170@7525L428:FlowExt.kt#2vxrgp"); if ((paramInt1 & 0x4) != 0) minActiveState = Lifecycle.State.STARTED;  if ((paramInt1 & 0x8) != 0) context = (CoroutineContext)EmptyCoroutineContext.INSTANCE;  if (ComposerKt.isTraceInProgress())
/* 184 */       ComposerKt.traceEventStart(1977777920, $changed, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:169)");  Object[] arrayOfObject = new Object[4]; arrayOfObject[0] = $this$collectAsStateWithLifecycle; arrayOfObject[1] = lifecycle; arrayOfObject[2] = minActiveState; arrayOfObject[3] = context; $composer.startReplaceableGroup(710004817); ComposerKt.sourceInformation($composer, "CC(remember):FlowExt.kt#9igjgp"); Composer composer = $composer; int i = $composer.changedInstance(lifecycle) | (((($changed & 0x1C00 ^ 0xC00) > 2048 && $composer.changed(minActiveState)) || ($changed & 0xC00) == 2048) ? 1 : 0) | $composer.changedInstance(context) | $composer.changedInstance($this$collectAsStateWithLifecycle), $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 185 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 186 */       Object arrayOfObject1[] = arrayOfObject, object1 = initialValue; int $i$a$-cache-FlowExtKt$collectAsStateWithLifecycle$1 = 0; FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, minActiveState, context, $this$collectAsStateWithLifecycle, null); Object value$iv = flowExtKt$collectAsStateWithLifecycle$1$1;
/* 187 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 189 */     Function2 function2 = (Function2)it$iv;
/*     */     $composer.endReplaceableGroup();
/*     */     State<T> state = SnapshotStateKt.produceState(object1, arrayOfObject1, function2, $composer, 0x8 & $changed >> 3 | 0xE & $changed >> 3);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceableGroup();
/*     */     return state; }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "FlowExt.kt", l = {172}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/runtime/ProduceStateScope;"})
/*     */   static final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends SuspendLambda implements Function2<ProduceStateScope<T>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     FlowExtKt$collectAsStateWithLifecycle$1$1(Lifecycle $lifecycle, Lifecycle.State $minActiveState, CoroutineContext $context, Flow<T> $receiver, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       ProduceStateScope<T> $this$produceState;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$produceState = (ProduceStateScope)this.L$0;
/*     */           this.label = 1;
/*     */           if (RepeatOnLifecycleKt.repeatOnLifecycle(this.$lifecycle, this.$minActiveState, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$context, this.$this_collectAsStateWithLifecycle, $this$produceState, null) {
/*     */                 int label;
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invokeSuspend(@NotNull Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore_2
/*     */                   //   4: aload_0
/*     */                   //   5: getfield label : I
/*     */                   //   8: tableswitch default -> 153, 0 -> 36, 1 -> 92, 2 -> 143
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: aload_0
/*     */                   //   41: getfield $context : Lkotlin/coroutines/CoroutineContext;
/*     */                   //   44: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */                   //   47: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */                   //   50: ifeq -> 101
/*     */                   //   53: aload_0
/*     */                   //   54: getfield $this_collectAsStateWithLifecycle : Lkotlinx/coroutines/flow/Flow;
/*     */                   //   57: new androidx/lifecycle/compose/FlowExtKt$collectAsStateWithLifecycle$1$1$1$1
/*     */                   //   60: dup
/*     */                   //   61: aload_0
/*     */                   //   62: getfield $$this$produceState : Landroidx/compose/runtime/ProduceStateScope;
/*     */                   //   65: invokespecial <init> : (Landroidx/compose/runtime/ProduceStateScope;)V
/*     */                   //   68: checkcast kotlinx/coroutines/flow/FlowCollector
/*     */                   //   71: aload_0
/*     */                   //   72: checkcast kotlin/coroutines/Continuation
/*     */                   //   75: aload_0
/*     */                   //   76: iconst_1
/*     */                   //   77: putfield label : I
/*     */                   //   80: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   85: dup
/*     */                   //   86: aload_2
/*     */                   //   87: if_acmpne -> 97
/*     */                   //   90: aload_2
/*     */                   //   91: areturn
/*     */                   //   92: aload_1
/*     */                   //   93: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   96: aload_1
/*     */                   //   97: pop
/*     */                   //   98: goto -> 149
/*     */                   //   101: aload_0
/*     */                   //   102: getfield $context : Lkotlin/coroutines/CoroutineContext;
/*     */                   //   105: new androidx/lifecycle/compose/FlowExtKt$collectAsStateWithLifecycle$1$1$1$2
/*     */                   //   108: dup
/*     */                   //   109: aload_0
/*     */                   //   110: getfield $this_collectAsStateWithLifecycle : Lkotlinx/coroutines/flow/Flow;
/*     */                   //   113: aload_0
/*     */                   //   114: getfield $$this$produceState : Landroidx/compose/runtime/ProduceStateScope;
/*     */                   //   117: aconst_null
/*     */                   //   118: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Landroidx/compose/runtime/ProduceStateScope;Lkotlin/coroutines/Continuation;)V
/*     */                   //   121: checkcast kotlin/jvm/functions/Function2
/*     */                   //   124: aload_0
/*     */                   //   125: checkcast kotlin/coroutines/Continuation
/*     */                   //   128: aload_0
/*     */                   //   129: iconst_2
/*     */                   //   130: putfield label : I
/*     */                   //   133: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   136: dup
/*     */                   //   137: aload_2
/*     */                   //   138: if_acmpne -> 148
/*     */                   //   141: aload_2
/*     */                   //   142: areturn
/*     */                   //   143: aload_1
/*     */                   //   144: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   147: aload_1
/*     */                   //   148: pop
/*     */                   //   149: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   152: areturn
/*     */                   //   153: new java/lang/IllegalStateException
/*     */                   //   156: dup
/*     */                   //   157: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   159: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   162: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #172	-> 3
/*     */                   //   #173	-> 40
/*     */                   //   #174	-> 53
/*     */                   //   #172	-> 90
/*     */                   //   #174	-> 97
/*     */                   //   #175	-> 101
/*     */                   //   #172	-> 141
/*     */                   //   #178	-> 148
/*     */                   //   #172	-> 153
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   40	113	0	this	Landroidx/lifecycle/compose/FlowExtKt$collectAsStateWithLifecycle$1$1$1;
/*     */                   //   40	113	1	$result	Ljava/lang/Object;
/*     */                 }
/*     */                 
/*     */                 @NotNull
/*     */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, $completion);
/*     */                 }
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           RepeatOnLifecycleKt.repeatOnLifecycle(this.$lifecycle, this.$minActiveState, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$context, this.$this_collectAsStateWithLifecycle, $this$produceState, null) {
/*     */                 int label;
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invokeSuspend(@NotNull Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore_2
/*     */                   //   4: aload_0
/*     */                   //   5: getfield label : I
/*     */                   //   8: tableswitch default -> 153, 0 -> 36, 1 -> 92, 2 -> 143
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: aload_0
/*     */                   //   41: getfield $context : Lkotlin/coroutines/CoroutineContext;
/*     */                   //   44: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */                   //   47: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */                   //   50: ifeq -> 101
/*     */                   //   53: aload_0
/*     */                   //   54: getfield $this_collectAsStateWithLifecycle : Lkotlinx/coroutines/flow/Flow;
/*     */                   //   57: new androidx/lifecycle/compose/FlowExtKt$collectAsStateWithLifecycle$1$1$1$1
/*     */                   //   60: dup
/*     */                   //   61: aload_0
/*     */                   //   62: getfield $$this$produceState : Landroidx/compose/runtime/ProduceStateScope;
/*     */                   //   65: invokespecial <init> : (Landroidx/compose/runtime/ProduceStateScope;)V
/*     */                   //   68: checkcast kotlinx/coroutines/flow/FlowCollector
/*     */                   //   71: aload_0
/*     */                   //   72: checkcast kotlin/coroutines/Continuation
/*     */                   //   75: aload_0
/*     */                   //   76: iconst_1
/*     */                   //   77: putfield label : I
/*     */                   //   80: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   85: dup
/*     */                   //   86: aload_2
/*     */                   //   87: if_acmpne -> 97
/*     */                   //   90: aload_2
/*     */                   //   91: areturn
/*     */                   //   92: aload_1
/*     */                   //   93: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   96: aload_1
/*     */                   //   97: pop
/*     */                   //   98: goto -> 149
/*     */                   //   101: aload_0
/*     */                   //   102: getfield $context : Lkotlin/coroutines/CoroutineContext;
/*     */                   //   105: new androidx/lifecycle/compose/FlowExtKt$collectAsStateWithLifecycle$1$1$1$2
/*     */                   //   108: dup
/*     */                   //   109: aload_0
/*     */                   //   110: getfield $this_collectAsStateWithLifecycle : Lkotlinx/coroutines/flow/Flow;
/*     */                   //   113: aload_0
/*     */                   //   114: getfield $$this$produceState : Landroidx/compose/runtime/ProduceStateScope;
/*     */                   //   117: aconst_null
/*     */                   //   118: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Landroidx/compose/runtime/ProduceStateScope;Lkotlin/coroutines/Continuation;)V
/*     */                   //   121: checkcast kotlin/jvm/functions/Function2
/*     */                   //   124: aload_0
/*     */                   //   125: checkcast kotlin/coroutines/Continuation
/*     */                   //   128: aload_0
/*     */                   //   129: iconst_2
/*     */                   //   130: putfield label : I
/*     */                   //   133: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   136: dup
/*     */                   //   137: aload_2
/*     */                   //   138: if_acmpne -> 148
/*     */                   //   141: aload_2
/*     */                   //   142: areturn
/*     */                   //   143: aload_1
/*     */                   //   144: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   147: aload_1
/*     */                   //   148: pop
/*     */                   //   149: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   152: areturn
/*     */                   //   153: new java/lang/IllegalStateException
/*     */                   //   156: dup
/*     */                   //   157: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   159: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   162: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #172	-> 3
/*     */                   //   #173	-> 40
/*     */                   //   #174	-> 53
/*     */                   //   #172	-> 90
/*     */                   //   #174	-> 97
/*     */                   //   #175	-> 101
/*     */                   //   #172	-> 141
/*     */                   //   #178	-> 148
/*     */                   //   #172	-> 153
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   40	113	0	this	Landroidx/lifecycle/compose/FlowExtKt$collectAsStateWithLifecycle$1$1$1;
/*     */                   //   40	113	1	$result	Ljava/lang/Object;
/*     */                 }
/*     */                 
/*     */                 @NotNull
/*     */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, $completion);
/*     */                 }
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super FlowExtKt$collectAsStateWithLifecycle$1$1> $completion) {
/*     */       FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, $completion);
/*     */       flowExtKt$collectAsStateWithLifecycle$1$1.L$0 = value;
/*     */       return (Continuation<Unit>)flowExtKt$collectAsStateWithLifecycle$1$1;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull ProduceStateScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((FlowExtKt$collectAsStateWithLifecycle$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-runtime-compose-desktop-2.8.4.jar!\androidx\lifecycle\compose\FlowExtKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */