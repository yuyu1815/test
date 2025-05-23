/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\006\n\002\b\n\bg\030\0002\0020\0012\b\022\004\022\0020\0030\002R\030\020\004\032\0020\003X¦\016¢\006\f\032\004\b\005\020\006\"\004\b\007\020\bR$\020\t\032\0020\0032\006\020\t\032\0020\0038W@WX\016¢\006\f\032\004\b\n\020\013\"\004\b\f\020\bø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\003"}, d2 = {"Landroidx/compose/runtime/MutableDoubleState;", "Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/MutableState;", "", "doubleValue", "getDoubleValue", "()D", "setDoubleValue", "(D)V", "value", "getValue", "()Ljava/lang/Double;", "setValue", "runtime"})
/*     */ @Stable
/*     */ public interface MutableDoubleState
/*     */   extends DoubleState, MutableState<Double>
/*     */ {
/*     */   @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
/*     */   @NotNull
/*     */   default Double getValue() {
/* 100 */     return Double.valueOf(getDoubleValue()); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue") @NotNull public static Double getValue(@NotNull MutableDoubleState $this) { return Double.valueOf(MutableDoubleState.access$getValue$jd($this)); } @Deprecated @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
/* 101 */     public static void setValue(@NotNull MutableDoubleState $this, double value) { $this.setValue(value); } } @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue") default void setValue(double value) { setDoubleValue(value); }
/*     */ 
/*     */   
/*     */   double getDoubleValue();
/*     */   
/*     */   void setDoubleValue(double paramDouble);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\MutableDoubleState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */