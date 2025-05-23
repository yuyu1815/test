/*    */ package androidx.compose.animation.core;
/*    */ 
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\030\002\n\000\n\002\020\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\004\032\016\020\000\032\0020\0012\006\020\002\032\0020\003\032\026\020\000\032\0020\0042\006\020\002\032\0020\0032\006\020\005\032\0020\003\032\036\020\000\032\0020\0062\006\020\002\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\003\032&\020\000\032\0020\b2\006\020\002\032\0020\0032\006\020\005\032\0020\0032\006\020\007\032\0020\0032\006\020\t\032\0020\003\032\033\020\n\032\002H\013\"\b\b\000\020\013*\0020\f*\002H\013H\000¢\006\002\020\r\032#\020\016\032\0020\017\"\b\b\000\020\013*\0020\f*\002H\0132\006\020\020\032\002H\013H\000¢\006\002\020\021\032\033\020\022\032\002H\013\"\b\b\000\020\013*\0020\f*\002H\013H\000¢\006\002\020\r¨\006\023"}, d2 = {"AnimationVector", "Landroidx/compose/animation/core/AnimationVector1D;", "v1", "", "Landroidx/compose/animation/core/AnimationVector2D;", "v2", "Landroidx/compose/animation/core/AnimationVector3D;", "v3", "Landroidx/compose/animation/core/AnimationVector4D;", "v4", "copy", "T", "Landroidx/compose/animation/core/AnimationVector;", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "copyFrom", "", "source", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "newInstance", "animation-core"})
/*    */ public final class AnimationVectorsKt
/*    */ {
/*    */   @NotNull
/*    */   public static final AnimationVector1D AnimationVector(float v1) {
/* 42 */     return new AnimationVector1D(v1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final AnimationVector2D AnimationVector(float v1, float v2) {
/* 50 */     return new AnimationVector2D(v1, v2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final AnimationVector3D AnimationVector(float v1, float v2, float v3) {
/* 59 */     return new AnimationVector3D(v1, v2, v3);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final AnimationVector4D AnimationVector(float v1, float v2, float v3, float v4) {
/* 74 */     return new AnimationVector4D(v1, v2, v3, v4);
/*    */   }
/*    */   @NotNull
/*    */   public static final <T extends AnimationVector> T newInstance(@NotNull AnimationVector $this$newInstance) {
/* 78 */     Intrinsics.checkNotNullParameter($this$newInstance, "<this>"); Intrinsics.checkNotNull($this$newInstance.newVector$animation_core(), "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"); return (T)$this$newInstance.newVector$animation_core();
/*    */   }
/*    */   @NotNull
/*    */   public static final <T extends AnimationVector> T copy(@NotNull AnimationVector $this$copy) {
/* 82 */     Intrinsics.checkNotNullParameter($this$copy, "<this>"); AnimationVector newVector = newInstance($this$copy);
/* 83 */     for (int i = 0, j = newVector.getSize$animation_core(); i < j; i++) {
/* 84 */       newVector.set$animation_core(i, $this$copy.get$animation_core(i));
/*    */     }
/* 86 */     return (T)newVector;
/*    */   }
/*    */   
/*    */   public static final <T extends AnimationVector> void copyFrom(@NotNull AnimationVector $this$copyFrom, @NotNull AnimationVector source) {
/* 90 */     Intrinsics.checkNotNullParameter($this$copyFrom, "<this>"); Intrinsics.checkNotNullParameter(source, "source"); for (int i = 0, j = $this$copyFrom.getSize$animation_core(); i < j; i++)
/* 91 */       $this$copyFrom.set$animation_core(i, source.get$animation_core(i)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\AnimationVectorsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */