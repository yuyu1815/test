/*    */ package com.intellij.ml.llm.activation.state.junie;
/*    */ 
/*    */ import androidx.compose.runtime.AbstractApplier;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\004\n\002\020\b\n\002\b\n\bÂ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\035\020\005\032\0020\0022\006\020\006\032\0020\0072\006\020\b\032\0020\002H\026¢\006\002\020\tJ\035\020\n\032\0020\0022\006\020\006\032\0020\0072\006\020\b\032\0020\002H\026¢\006\002\020\tJ \020\013\032\0020\0022\006\020\f\032\0020\0072\006\020\r\032\0020\0072\006\020\016\032\0020\007H\026J\030\020\017\032\0020\0022\006\020\006\032\0020\0072\006\020\016\032\0020\007H\026J\b\020\020\032\0020\002H\024¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/activation/state/junie/NopApplier;", "Landroidx/compose/runtime/AbstractApplier;", "", "<init>", "()V", "insertBottomUp", "index", "", "instance", "(ILkotlin/Unit;)V", "insertTopDown", "move", "from", "to", "count", "remove", "onClear", "state.junie.impl"})
/*    */ final class NopApplier
/*    */   extends AbstractApplier<Unit>
/*    */ {
/*    */   @NotNull
/*    */   public static final NopApplier INSTANCE = new NopApplier();
/*    */   
/*    */   private NopApplier() {
/* 52 */     super(Unit.INSTANCE);
/* 53 */   } public void insertBottomUp(int index, @NotNull Unit instance) { Intrinsics.checkNotNullParameter(instance, "instance"); } public void insertTopDown(int index, @NotNull Unit instance) {
/* 54 */     Intrinsics.checkNotNullParameter(instance, "instance");
/*    */   }
/*    */   
/*    */   public void move(int from, int to, int count) {}
/*    */   
/*    */   public void remove(int index, int count) {}
/*    */   
/*    */   protected void onClear() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\activation\state\junie\NopApplier.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */