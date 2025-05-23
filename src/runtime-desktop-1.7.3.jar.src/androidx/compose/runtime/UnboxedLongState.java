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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\t\n\002\b\b\n\002\020\016\n\000\b\000\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\b\020\f\032\0020\rH\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\024\020\006\032\0020\0048VX\004¢\006\006\032\004\b\007\020\bR\024\020\t\032\0020\0048VX\004¢\006\006\032\004\b\n\020\013¨\006\016"}, d2 = {"Landroidx/compose/runtime/UnboxedLongState;", "Landroidx/compose/runtime/LongState;", "baseState", "Landroidx/compose/runtime/State;", "", "(Landroidx/compose/runtime/State;)V", "longValue", "getLongValue", "()J", "value", "getValue", "()Ljava/lang/Long;", "toString", "", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class UnboxedLongState
/*    */   implements LongState
/*    */ {
/*    */   @NotNull
/*    */   private final State<Long> baseState;
/*    */   public static final int $stable;
/*    */   
/*    */   public UnboxedLongState(@NotNull State<Long> baseState) {
/* 60 */     this.baseState = baseState;
/*    */   }
/*    */   public long getLongValue() {
/* 63 */     return ((Number)this.baseState.getValue()).longValue();
/*    */   }
/*    */   @NotNull
/* 66 */   public Long getValue() { return this.baseState.getValue(); } @NotNull
/*    */   public String toString() {
/* 68 */     return "UnboxedLongState(baseState=" + this.baseState + ")@" + hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\UnboxedLongState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */