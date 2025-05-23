/*    */ package org.jetbrains.compose.resources;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\032S\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\f\020\005\032\b\022\004\022\002H\0020\0062\"\020\007\032\036\b\001\022\004\022\0020\t\022\n\022\b\022\004\022\002H\0020\n\022\006\022\004\030\0010\0040\bH\001¢\006\002\020\013\032[\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\006\020\f\032\0020\0042\f\020\005\032\b\022\004\022\002H\0020\0062\"\020\007\032\036\b\001\022\004\022\0020\t\022\n\022\b\022\004\022\002H\0020\n\022\006\022\004\030\0010\0040\bH\001¢\006\002\020\r\032c\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\006\020\f\032\0020\0042\006\020\016\032\0020\0042\f\020\005\032\b\022\004\022\002H\0020\0062\"\020\007\032\036\b\001\022\004\022\0020\t\022\n\022\b\022\004\022\002H\0020\n\022\006\022\004\030\0010\0040\bH\001¢\006\002\020\017¨\006\020"}, d2 = {"rememberResourceState", "Landroidx/compose/runtime/State;", "T", "key1", "", "getDefault", "Lkotlin/Function0;", "block", "Lkotlin/Function2;", "Lorg/jetbrains/compose/resources/ResourceEnvironment;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "library"}) @SourceDebugExtension({"SMAP\nResourceState.blocking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceState.blocking.kt\norg/jetbrains/compose/resources/ResourceState_blockingKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n77#2:50\n77#2:57\n77#2:64\n1225#3,6:51\n1225#3,6:58\n1225#3,6:65\n*S KotlinDebug\n*F\n+ 1 ResourceState.blocking.kt\norg/jetbrains/compose/resources/ResourceState_blockingKt\n*L\n12#1:50\n27#1:57\n43#1:64\n13#1:51,6\n28#1:58,6\n44#1:65,6\n*E\n"}) public final class ResourceState_blockingKt { @DebugMetadata(f = "ResourceState.blocking.kt", l = {15}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.ResourceState_blockingKt$rememberResourceState$1$1") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}) static final class ResourceState_blockingKt$rememberResourceState$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> { int label; ResourceState_blockingKt$rememberResourceState$1$1(Function2<ResourceEnvironment, Continuation<? super T>, Object> $block, ResourceEnvironment $environment, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$block.invoke(this.$environment, this) == object) ? object : this.$block.invoke(this.$environment, this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1;
/* 11 */       }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ResourceState_blockingKt$rememberResourceState$1$1> $completion) { return (Continuation<Unit>)new ResourceState_blockingKt$rememberResourceState$1$1(this.$block, this.$environment, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((ResourceState_blockingKt$rememberResourceState$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @Composable @NotNull public static final <T> State<T> rememberResourceState(@NotNull Object key1, @NotNull Function0 getDefault, @NotNull Function2 block, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(key1, "key1"); Intrinsics.checkNotNullParameter(getDefault, "getDefault"); Intrinsics.checkNotNullParameter(block, "block"); $composer.startReplaceGroup(-2043354779); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2043354779, $changed, -1, "org.jetbrains.compose.resources.rememberResourceState (ResourceState.blocking.kt:10)"); 
/* 12 */     CompositionLocal compositionLocal = (CompositionLocal)ResourceEnvironmentKt.getLocalComposeEnvironment(); int $changed$iv = 6, $i$f$getCurrent = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object1 = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ResourceEnvironment environment = ((ComposeEnvironment)object1).rememberEnvironment($composer, 0); $composer.startReplaceGroup(406036355); Composer composer = $composer; int i = $composer.changed(key1) | $composer.changed(environment), $i$f$cache = 0;
/* 51 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 52 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 53 */       int $i$a$-cache-ResourceState_blockingKt$rememberResourceState$1 = 0;
/*    */     }
/*    */     
/* 56 */     MutableState mutableState2 = (MutableState)it$iv; $composer.endReplaceGroup(); MutableState mutableState1 = mutableState2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (State<T>)mutableState1; } @Composable @NotNull public static final <T> State<T> rememberResourceState(@NotNull Object key1, @NotNull Object key2, @NotNull Function0 getDefault, @NotNull Function2 block, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(key1, "key1"); Intrinsics.checkNotNullParameter(key2, "key2"); Intrinsics.checkNotNullParameter(getDefault, "getDefault"); Intrinsics.checkNotNullParameter(block, "block"); $composer.startReplaceGroup(1165507973); if (ComposerKt.isTraceInProgress())
/* 57 */       ComposerKt.traceEventStart(1165507973, $changed, -1, "org.jetbrains.compose.resources.rememberResourceState (ResourceState.blocking.kt:25)");  CompositionLocal compositionLocal = (CompositionLocal)ResourceEnvironmentKt.getLocalComposeEnvironment(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object1 = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ResourceEnvironment environment = ((ComposeEnvironment)object1).rememberEnvironment($composer, 0); $composer.startReplaceGroup(406048553); Composer composer = $composer; int i = $composer.changed(key1) | $composer.changed(key2) | $composer.changed(environment), $i$f$cache = 0;
/* 58 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 59 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 60 */       int $i$a$-cache-ResourceState_blockingKt$rememberResourceState$2 = 0;
/*    */     }
/*    */     
/* 63 */     MutableState mutableState2 = (MutableState)it$iv; $composer.endReplaceGroup(); MutableState mutableState1 = mutableState2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (State<T>)mutableState1; } @Composable @NotNull public static final <T> State<T> rememberResourceState(@NotNull Object key1, @NotNull Object key2, @NotNull Object key3, @NotNull Function0 getDefault, @NotNull Function2 block, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(key1, "key1"); Intrinsics.checkNotNullParameter(key2, "key2"); Intrinsics.checkNotNullParameter(key3, "key3"); Intrinsics.checkNotNullParameter(getDefault, "getDefault"); Intrinsics.checkNotNullParameter(block, "block"); $composer.startReplaceGroup(-1116698203); if (ComposerKt.isTraceInProgress())
/* 64 */       ComposerKt.traceEventStart(-1116698203, $changed, -1, "org.jetbrains.compose.resources.rememberResourceState (ResourceState.blocking.kt:41)");  CompositionLocal compositionLocal = (CompositionLocal)ResourceEnvironmentKt.getLocalComposeEnvironment(); int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object1 = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ResourceEnvironment environment = ((ComposeEnvironment)object1).rememberEnvironment($composer, 0); $composer.startReplaceGroup(406061423); Composer composer = $composer; int i = $composer.changed(key1) | $composer.changed(key2) | $composer.changed(key3) | $composer.changed(environment), $i$f$cache = 0;
/* 65 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 66 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 67 */       int $i$a$-cache-ResourceState_blockingKt$rememberResourceState$3 = 0;
/*    */     }
/*    */     
/* 70 */     MutableState mutableState2 = (MutableState)it$iv;
/*    */     $composer.endReplaceGroup();
/*    */     MutableState mutableState1 = mutableState2;
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return (State<T>)mutableState1; }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "ResourceState.blocking.kt", l = {30}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.ResourceState_blockingKt$rememberResourceState$2$1")
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class ResourceState_blockingKt$rememberResourceState$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
/*    */     int label;
/*    */     
/*    */     ResourceState_blockingKt$rememberResourceState$2$1(Function2<ResourceEnvironment, Continuation<? super T>, Object> $block, ResourceEnvironment $environment, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 1;
/*    */           return (this.$block.invoke(this.$environment, this) == object) ? object : this.$block.invoke(this.$environment, this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ResourceState_blockingKt$rememberResourceState$2$1> $completion) {
/*    */       return (Continuation<Unit>)new ResourceState_blockingKt$rememberResourceState$2$1(this.$block, this.$environment, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((ResourceState_blockingKt$rememberResourceState$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ResourceState.blocking.kt", l = {46}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.ResourceState_blockingKt$rememberResourceState$3$1")
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class ResourceState_blockingKt$rememberResourceState$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
/*    */     int label;
/*    */     
/*    */     ResourceState_blockingKt$rememberResourceState$3$1(Function2<ResourceEnvironment, Continuation<? super T>, Object> $block, ResourceEnvironment $environment, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 1;
/*    */           return (this.$block.invoke(this.$environment, this) == object) ? object : this.$block.invoke(this.$environment, this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ResourceState_blockingKt$rememberResourceState$3$1> $completion) {
/*    */       return (Continuation<Unit>)new ResourceState_blockingKt$rememberResourceState$3$1(this.$block, this.$environment, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((ResourceState_blockingKt$rememberResourceState$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ResourceState_blockingKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */