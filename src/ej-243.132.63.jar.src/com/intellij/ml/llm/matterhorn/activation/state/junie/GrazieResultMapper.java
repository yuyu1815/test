/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpResult;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b\001\030\000 \n*\004\b\000\020\0012\032\022\n\022\b\022\004\022\002H\0010\003\022\004\022\0020\004\022\004\022\002H\0010\002:\001\nB\t\b\002¢\006\004\b\005\020\006J\"\020\007\032\016\022\004\022\0020\004\022\004\022\0028\0000\b2\f\020\t\032\b\022\004\022\0028\0000\003H\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieResultMapper;", "Val", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;", "<init>", "()V", "mapCompleted", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted;", "ret", "Companion", "state.junie.impl"})
/*    */ @StabilityInferred(parameters = 2)
/*    */ public final class GrazieResultMapper<Val> implements OpResultMapper<GrazieResult<? extends Val>, GrazieResult.GrazieFailure, Val> {
/*    */   @NotNull
/* 14 */   public OpResult.OpCompleted<GrazieResult.GrazieFailure, Val> mapCompleted(@NotNull GrazieResult ret) { Intrinsics.checkNotNullParameter(ret, "ret"); GrazieResult grazieResult = ret;
/*    */     
/* 16 */     if (grazieResult instanceof GrazieResult.GrazieSuccess) {
/*    */     
/*    */     } else {
/*    */       throw new NoWhenBranchMatchedException();
/*    */     } 
/*    */     return (grazieResult instanceof GrazieResult.GrazieFailure) ? (OpResult.OpCompleted<GrazieResult.GrazieFailure, Val>)new OpResult.OpCompleted.OpFailed(ret) : (OpResult.OpCompleted<GrazieResult.GrazieFailure, Val>)"JD-Core does not support Kotlin"; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\025\020\006\032\b\022\004\022\002H\0070\005\"\004\b\001\020\007H\002R\024\020\004\032\b\022\004\022\0020\0010\005X\004¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieResultMapper$Companion;", "", "<init>", "()V", "instance", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieResultMapper;", "invoke", "Val", "state.junie.impl"})
/*    */   public static final class Companion { @NotNull
/*    */     public final <Val> GrazieResultMapper<Val> invoke() {
/* 24 */       Intrinsics.checkNotNull(GrazieResultMapper.instance, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieResultMapper<Val of com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieResultMapper.Companion.invoke>"); return (GrazieResultMapper)GrazieResultMapper.instance;
/*    */     }
/*    */     
/*    */     private Companion() {} }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   public static final int $stable;
/*    */   @NotNull
/*    */   private static final GrazieResultMapper<Object> instance = new GrazieResultMapper();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\GrazieResultMapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */