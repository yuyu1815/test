/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\b`\030\0002\036\022\f\022\n\022\006\022\004\030\0010\0030\002\022\f\022\n\022\006\022\004\030\0010\0030\0040\0012\0020\0052\0020\006:\001\020J\b\020\013\032\0020\fH&J(\020\r\032\0020\0002\016\020\016\032\n\022\006\022\004\030\0010\0030\0022\016\020\017\032\n\022\006\022\004\030\0010\0030\004H&R$\020\007\032\002H\b\"\004\b\000\020\b*\b\022\004\022\002H\b0\0028VX\004¢\006\006\032\004\b\t\020\nø\001\000\002\006\n\004\b!0\001¨\006\021À\006\001"}, d2 = {"Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/CompositionLocalMap;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "currentValue", "T", "getCurrentValue", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "builder", "Landroidx/compose/runtime/PersistentCompositionLocalMap$Builder;", "putValue", "key", "value", "Builder", "runtime"})
/*    */ public interface PersistentCompositionLocalMap
/*    */   extends PersistentMap<CompositionLocal<Object>, ValueHolder<Object>>, CompositionLocalMap, CompositionLocalAccessorScope
/*    */ {
/*    */   @NotNull
/*    */   PersistentCompositionLocalMap putValue(@NotNull CompositionLocal<Object> paramCompositionLocal, @NotNull ValueHolder<Object> paramValueHolder);
/*    */   
/*    */   default <T> T getCurrentValue(@NotNull CompositionLocal<T> $this$currentValue) {
/* 67 */     Intrinsics.checkNotNullParameter($this$currentValue, "<this>"); return CompositionLocalMapKt.read(this, $this$currentValue);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   Builder builder();
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\036\022\f\022\n\022\006\022\004\030\0010\0030\002\022\f\022\n\022\006\022\004\030\0010\0030\0040\001J\b\020\005\032\0020\006H&ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Landroidx/compose/runtime/PersistentCompositionLocalMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "build", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime"})
/*    */   public static interface Builder extends PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> {
/*    */     @NotNull
/*    */     PersistentCompositionLocalMap build();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\PersistentCompositionLocalMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */