/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpResult;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\000\n\002\030\002\n\002\020\001\n\002\b\003\n\002\030\002\n\002\b\004\b\002\030\000 \n*\004\b\003\020\0012\024\022\004\022\002H\001\022\004\022\0020\003\022\004\022\002H\0010\002:\001\nB\007¢\006\004\b\004\020\005J!\020\006\032\016\022\004\022\0020\003\022\004\022\0028\0030\0072\006\020\b\032\0028\003H\026¢\006\002\020\t¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper$Companion$ReturnAsSucceeded;", "Ret", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;", "", "<init>", "()V", "mapCompleted", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted;", "ret", "(Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted;", "Companion", "state.junie.impl"})
/*    */ final class ReturnAsSucceeded<Ret>
/*    */   implements OpResultMapper
/*    */ {
/*    */   @NotNull
/*    */   public OpResult.OpCompleted mapCompleted(Object ret) {
/* 17 */     return (OpResult.OpCompleted)new OpResult.OpCompleted.OpSucceeded(ret);
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0010\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper$Companion$ReturnAsSucceeded$Companion;", "", "<init>", "()V", "instance", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper$Companion$ReturnAsSucceeded;", "getInstance", "()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper$Companion$ReturnAsSucceeded;", "state.junie.impl"})
/*    */   public static final class Companion { @NotNull
/* 20 */     public final OpResultMapper.Companion.ReturnAsSucceeded<Object> getInstance() { return OpResultMapper.Companion.ReturnAsSucceeded.instance; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); @NotNull private static final ReturnAsSucceeded<Object> instance = new ReturnAsSucceeded();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\OpResultMapper$Companion$ReturnAsSucceeded.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */