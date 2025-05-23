/*    */ package androidx.compose.animation.core;
/*    */ 
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\t\bf\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\0020\004J\025\020\023\032\0028\0002\006\020\024\032\0020\006H&¢\006\002\020\025J\025\020\026\032\0028\0012\006\020\024\032\0020\006H&¢\006\002\020\027J\020\020\030\032\0020\n2\006\020\024\032\0020\006H\026R\024\020\005\032\0020\0068fX¦\004¢\006\006\032\004\b\007\020\bR\022\020\t\032\0020\nX¦\004¢\006\006\032\004\b\t\020\013R\022\020\f\032\0028\000X¦\004¢\006\006\032\004\b\r\020\016R\036\020\017\032\016\022\004\022\0028\000\022\004\022\0028\0010\020X¦\004¢\006\006\032\004\b\021\020\022ø\001\000\002\006\n\004\b!0\001¨\006\031À\006\003"}, d2 = {"Landroidx/compose/animation/core/Animation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "durationNanos", "", "getDurationNanos", "()J", "isInfinite", "", "()Z", "targetValue", "getTargetValue", "()Ljava/lang/Object;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "getValueFromNanos", "playTimeNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "isFinishedFromNanos", "animation-core"})
/*    */ public interface Animation<T, V extends AnimationVector>
/*    */ {
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     @Deprecated
/*    */     public static <T, V extends AnimationVector> boolean isFinishedFromNanos(@NotNull Animation $this, long playTimeNanos) {
/* 87 */       return $this.isFinishedFromNanos(playTimeNanos); } } default boolean isFinishedFromNanos(long playTimeNanos) {
/* 88 */     return (playTimeNanos >= getDurationNanos());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   V getVelocityVectorFromNanos(long paramLong);
/*    */   
/*    */   T getValueFromNanos(long paramLong);
/*    */   
/*    */   boolean isInfinite();
/*    */   
/*    */   T getTargetValue();
/*    */   
/*    */   @NotNull
/*    */   TwoWayConverter<T, V> getTypeConverter();
/*    */   
/*    */   long getDurationNanos();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\Animation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */