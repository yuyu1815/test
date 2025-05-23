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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\020\007\n\002\b\007\bg\030\0002\b\022\004\022\0020\0020\001R\022\020\003\032\0020\002X¦\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\0020\0028WX\004¢\006\006\032\004\b\007\020\bø\001\000\002\006\n\004\b!0\001¨\006\tÀ\006\003"}, d2 = {"Landroidx/compose/runtime/FloatState;", "Landroidx/compose/runtime/State;", "", "floatValue", "getFloatValue", "()F", "value", "getValue", "()Ljava/lang/Float;", "runtime"})
/*    */ @Stable
/*    */ public interface FloatState
/*    */   extends State<Float>
/*    */ {
/*    */   float getFloatValue();
/*    */   
/*    */   @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
/*    */   @NotNull
/*    */   default Float getValue() {
/* 70 */     return Float.valueOf(getFloatValue()); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated @AutoboxingStateValueProperty(preferredPropertyName = "floatValue") @NotNull public static Float getValue(@NotNull FloatState $this) { return Float.valueOf(FloatState.access$getValue$jd($this)); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\FloatState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */