/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.data;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableInferredTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\032\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032\035\020\000\032\002H\001\"\004\b\000\020\001*\b\022\004\022\002H\0010\002H\007¢\006\002\020\003\0321\020\004\032\b\022\004\022\002H\0010\002\"\004\b\000\020\001*\b\022\004\022\002H\0010\0052\006\020\006\032\0020\0072\006\020\b\032\002H\001¢\006\002\020\t¨\006\n"}, d2 = {"observeValue", "T", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;", "(Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "stateLazyIn", "Lkotlinx/coroutines/flow/Flow;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "initialValue", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;", "state.junie.impl"})
/*    */ public final class StateLazyKt
/*    */ {
/*    */   @Composable
/*    */   @ComposableInferredTarget(scheme = "[0[0]]")
/*    */   public static final <T> T observeValue(@NotNull StateLazy<T> $this$observeValue, @Nullable Composer $composer, int $changed) {
/* 32 */     Intrinsics.checkNotNullParameter($this$observeValue, "<this>"); $composer.startReplaceGroup(1527954439); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1527954439, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.data.observeValue (StateLazy.kt:31)");  Object object = $this$observeValue.observeState($composer, 0xE & $changed).getValue(); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (T)object;
/*    */   }
/*    */   @NotNull
/*    */   public static final <T> StateLazy<T> stateLazyIn(@NotNull Flow<? extends T> $this$stateLazyIn, @NotNull CoroutineScope cs, Object initialValue) {
/* 36 */     Intrinsics.checkNotNullParameter($this$stateLazyIn, "<this>"); Intrinsics.checkNotNullParameter(cs, "cs"); return new StateLazyImpl<>(cs, $this$stateLazyIn, (T)initialValue);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\StateLazyKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */