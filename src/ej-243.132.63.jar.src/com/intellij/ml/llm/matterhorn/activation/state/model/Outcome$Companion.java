/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\001\n\002\b\t\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J'\020\004\032\016\022\004\022\0020\006\022\004\022\002H\0070\005\"\004\b\002\020\0072\006\020\b\032\002H\007¢\006\004\b\t\020\nJ'\020\013\032\016\022\004\022\002H\f\022\004\022\0020\0060\005\"\004\b\002\020\f2\006\020\r\032\002H\f¢\006\004\b\016\020\n¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome$Companion;", "", "<init>", "()V", "ofComplete", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "", "T", "value", "ofComplete-l12Rbqo", "(Ljava/lang/Object;)Ljava/lang/Object;", "ofIncomplete", "I", "incomplete", "ofIncomplete-l12Rbqo", "state.model"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final <T> Object ofComplete-l12Rbqo(Object value) {
/* 25 */     return Outcome.access$constructor-impl(value); } @NotNull
/* 26 */   public final <I> Object ofIncomplete-l12Rbqo(Object incomplete) { return Outcome.access$constructor-impl(new Outcome.Incomplete(incomplete)); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\Outcome$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */