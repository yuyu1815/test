/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\t\n\002\b\n\bg\030\0002\0020\0012\b\022\004\022\0020\0030\002R\030\020\004\032\0020\003X¦\016¢\006\f\032\004\b\005\020\006\"\004\b\007\020\bR$\020\t\032\0020\0032\006\020\t\032\0020\0038W@WX\016¢\006\f\032\004\b\n\020\013\"\004\b\f\020\bø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\003"}, d2 = {"Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/LongState;", "Landroidx/compose/runtime/MutableState;", "", "longValue", "getLongValue", "()J", "setLongValue", "(J)V", "value", "getValue", "()Ljava/lang/Long;", "setValue", "runtime"})
/*    */ @Stable
/*    */ public interface MutableLongState
/*    */   extends LongState, MutableState<Long>
/*    */ {
/*    */   @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
/*    */   @NotNull
/*    */   default Long getValue() {
/* 96 */     return Long.valueOf(getLongValue()); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated @AutoboxingStateValueProperty(preferredPropertyName = "longValue") @NotNull public static Long getValue(@NotNull MutableLongState $this) { return Long.valueOf(MutableLongState.access$getValue$jd($this)); } @Deprecated @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
/* 97 */     public static void setValue(@NotNull MutableLongState $this, long value) { $this.setValue(value); } } @AutoboxingStateValueProperty(preferredPropertyName = "longValue") default void setValue(long value) { setLongValue(value); }
/*    */ 
/*    */   
/*    */   long getLongValue();
/*    */   
/*    */   void setLongValue(long paramLong);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\MutableLongState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */