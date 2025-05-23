/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import java.util.concurrent.CopyOnWriteArrayList;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.AbstractCoroutineContextElement;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\016\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ExecutionContextElement;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "<init>", "()V", "traceIds", "Ljava/util/concurrent/CopyOnWriteArrayList;", "", "getTraceIds", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "core"})
/*    */ public final class ExecutionContextElement
/*    */   extends AbstractCoroutineContextElement
/*    */ {
/*    */   @NotNull
/*    */   private final CopyOnWriteArrayList<String> traceIds;
/*    */   
/*    */   public ExecutionContextElement() {
/* 35 */     super(ExecutionContextKey.INSTANCE);
/* 36 */     this.traceIds = new CopyOnWriteArrayList<>(); } @NotNull public final CopyOnWriteArrayList<String> getTraceIds() { return this.traceIds; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ExecutionContextElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */