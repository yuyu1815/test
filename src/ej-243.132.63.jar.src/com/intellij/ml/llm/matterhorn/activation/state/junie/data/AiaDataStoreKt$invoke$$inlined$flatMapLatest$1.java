/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie.data;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.InlineMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import kotlinx.coroutines.flow.FlowKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "AiaDataStore.kt", l = {189}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.data.AiaDataStoreKt$invoke$$inlined$flatMapLatest$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\b\022\004\022\002H\0030\0042\006\020\005\032\002H\002H@¨\006\006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"})
/*     */ @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n*L\n1#1,214:1\n75#2:215\n*E\n"})
/*     */ public final class AiaDataStoreKt$invoke$$inlined$flatMapLatest$1
/*     */   extends SuspendLambda
/*     */   implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   public AiaDataStoreKt$invoke$$inlined$flatMapLatest$1(Continuation $completion, Function1 paramFunction1) {
/*     */     super(3, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Continuation $completion) {
/*     */     FlowCollector $this$transformLatest;
/*     */     Object it;
/*     */     FlowCollector flowCollector1;
/*     */     Object object2;
/*     */     int $i$a$-flatMapLatest-AiaDataStoreKt$invoke$1;
/*     */     Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */     switch (this.label)
/*     */     { case 0:
/*     */         ResultKt.throwOnFailure($completion);
/*     */         $this$transformLatest = (FlowCollector)this.L$0;
/*     */         it = this.L$1;
/* 189 */         flowCollector1 = $this$transformLatest; (Continuation)this; object2 = it; $i$a$-flatMapLatest-AiaDataStoreKt$invoke$1 = 0; this.label = 1; if (FlowKt.emitAll(flowCollector1, 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 215 */             (Flow)this.$flow$inlined.invoke(object2), (Continuation)this) == object1) return object1;  FlowKt.emitAll(flowCollector1, (Flow)this.$flow$inlined.invoke(object2), (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure($completion); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @Nullable public final Object invokeSuspend$$forInline(@NotNull Object $result) { FlowCollector $this$transformLatest = (FlowCollector)this.L$0; Object it = this.L$1; FlowCollector flowCollector1 = $this$transformLatest; Continuation continuation = (Continuation)this; Object object1 = it; int $i$a$-flatMapLatest-AiaDataStoreKt$invoke$1 = 0; object1 = this.$flow$inlined.invoke(object1);
/*     */     InlineMarker.mark(0);
/*     */     InlineMarker.mark(1);
/*     */     FlowKt.emitAll(flowCollector1, (Flow)object1, (Continuation)this);
/*     */     return Unit.INSTANCE; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull FlowCollector p1, Object p2, @Nullable Continuation p3) {
/*     */     AiaDataStoreKt$invoke$$inlined$flatMapLatest$1 aiaDataStoreKt$invoke$$inlined$flatMapLatest$1 = new AiaDataStoreKt$invoke$$inlined$flatMapLatest$1(p3, this.$flow$inlined);
/*     */     aiaDataStoreKt$invoke$$inlined$flatMapLatest$1.L$0 = p1;
/*     */     aiaDataStoreKt$invoke$$inlined$flatMapLatest$1.L$1 = p2;
/*     */     return aiaDataStoreKt$invoke$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\AiaDataStoreKt$invoke$$inlined$flatMapLatest$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */