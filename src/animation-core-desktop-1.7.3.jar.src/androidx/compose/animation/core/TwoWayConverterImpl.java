/*    */ package androidx.compose.animation.core;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\002\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004B-\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006\022\022\020\007\032\016\022\004\022\0028\001\022\004\022\0028\0000\006¢\006\002\020\bR \020\007\032\016\022\004\022\0028\001\022\004\022\0028\0000\006X\004¢\006\b\n\000\032\004\b\t\020\nR \020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\b\n\000\032\004\b\013\020\n¨\006\f"}, d2 = {"Landroidx/compose/animation/core/TwoWayConverterImpl;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/TwoWayConverter;", "convertToVector", "Lkotlin/Function1;", "convertFromVector", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getConvertFromVector", "()Lkotlin/jvm/functions/Function1;", "getConvertToVector", "animation-core"})
/*    */ final class TwoWayConverterImpl<T, V extends AnimationVector>
/*    */   implements TwoWayConverter<T, V>
/*    */ {
/*    */   @NotNull
/*    */   private final Function1<T, V> convertToVector;
/*    */   @NotNull
/*    */   private final Function1<V, T> convertFromVector;
/*    */   
/*    */   public TwoWayConverterImpl(@NotNull Function1<T, V> convertToVector, @NotNull Function1<V, T> convertFromVector) {
/* 65 */     this.convertToVector = convertToVector;
/* 66 */     this.convertFromVector = convertFromVector; } @NotNull public Function1<V, T> getConvertFromVector() { return this.convertFromVector; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Function1<T, V> getConvertToVector() {
/*    */     return this.convertToVector;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\TwoWayConverterImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */