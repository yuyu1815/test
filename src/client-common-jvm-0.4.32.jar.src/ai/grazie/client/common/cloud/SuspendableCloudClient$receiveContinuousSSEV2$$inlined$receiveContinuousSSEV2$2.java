/*     */ package ai.grazie.client.common.cloud;
/*     */ 
/*     */ import ai.grazie.model.cloud.sse.continuous.ContinuousSSEEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.jvm.internal.InlineMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 176, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\005*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\034\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0028\0000\005H@¢\006\002\020\006¨\006\007¸\006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$receiveContinuousSSEV2$$inlined$map$3"})
/*     */ @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
/*     */ public final class SuspendableCloudClient$receiveContinuousSSEV2$$inlined$receiveContinuousSSEV2$2
/*     */   implements Flow<O>
/*     */ {
/*     */   public SuspendableCloudClient$receiveContinuousSSEV2$$inlined$receiveContinuousSSEV2$2(Flow paramFlow, ContinuousSSEEvent.Companion paramCompanion) {}
/*     */   
/*     */   @Nullable
/*     */   public Object collect(@NotNull FlowCollector collector, @NotNull Continuation $completion) {
/* 107 */     Continuation continuation = $completion; FlowCollector $this$unsafeTransform_u24lambda_u240 = collector; int $i$a$-unsafeFlow-FlowKt__EmittersKt$unsafeTransform$1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     Intrinsics.needClassReification(); if (this.$this_unsafeTransform$inlined.collect((FlowCollector)new Object($this$unsafeTransform_u24lambda_u240, this.receiver$inlined), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.$this_unsafeTransform$inlined.collect((FlowCollector)new Object($this$unsafeTransform_u24lambda_u240, this.receiver$inlined), $completion);  this.$this_unsafeTransform$inlined.collect((FlowCollector)new Object($this$unsafeTransform_u24lambda_u240, this.receiver$inlined), $completion); return Unit.INSTANCE; } @Nullable public Object collect$$forInline(@NotNull FlowCollector collector, @NotNull Continuation $completion) { InlineMarker.mark(4); InlineMarker.mark(5); new ContinuationImpl($completion) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return SuspendableCloudClient$receiveContinuousSSEV2$$inlined$receiveContinuousSSEV2$2.this.collect(null, (Continuation)this); } }; Continuation continuation = $completion; FlowCollector $this$unsafeTransform_u24lambda_u240 = collector; int $i$a$-unsafeFlow-FlowKt__EmittersKt$unsafeTransform$1 = 0; Intrinsics.needClassReification(); InlineMarker.mark(0); InlineMarker.mark(1); this.$this_unsafeTransform$inlined.collect((FlowCollector)new Object($this$unsafeTransform_u24lambda_u240, this.receiver$inlined), $completion);
/*     */     return Unit.INSTANCE; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\cloud\SuspendableCloudClient$receiveContinuousSSEV2$$inlined$receiveContinuousSSEV2$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */