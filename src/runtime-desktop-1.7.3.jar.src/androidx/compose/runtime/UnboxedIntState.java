/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\b\b\n\002\020\016\n\000\b\000\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\b\020\f\032\0020\rH\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\024\020\006\032\0020\0048VX\004¢\006\006\032\004\b\007\020\bR\024\020\t\032\0020\0048VX\004¢\006\006\032\004\b\n\020\013¨\006\016"}, d2 = {"Landroidx/compose/runtime/UnboxedIntState;", "Landroidx/compose/runtime/IntState;", "baseState", "Landroidx/compose/runtime/State;", "", "(Landroidx/compose/runtime/State;)V", "intValue", "getIntValue", "()I", "value", "getValue", "()Ljava/lang/Integer;", "toString", "", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class UnboxedIntState
/*    */   implements IntState
/*    */ {
/*    */   @NotNull
/*    */   private final State<Integer> baseState;
/*    */   public static final int $stable;
/*    */   
/*    */   public UnboxedIntState(@NotNull State<Integer> baseState) {
/* 34 */     this.baseState = baseState;
/*    */   }
/*    */   public int getIntValue() {
/* 37 */     return ((Number)this.baseState.getValue()).intValue();
/*    */   }
/*    */   @NotNull
/* 40 */   public Integer getValue() { return this.baseState.getValue(); } @NotNull
/*    */   public String toString() {
/* 42 */     return "UnboxedIntState(baseState=" + this.baseState + ")@" + hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\UnboxedIntState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */