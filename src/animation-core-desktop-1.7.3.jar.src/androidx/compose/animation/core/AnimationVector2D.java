/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\003\n\002\020\b\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\002\b\007\n\002\020\002\n\002\b\005\n\002\020\016\n\000\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\024H\002J\026\020\025\032\0020\0032\006\020\026\032\0020\007H\002¢\006\002\b\027J\b\020\030\032\0020\007H\026J\r\020\031\032\0020\000H\020¢\006\002\b\032J\r\020\033\032\0020\034H\020¢\006\002\b\035J\036\020\036\032\0020\0342\006\020\026\032\0020\0072\006\020\037\032\0020\003H\002¢\006\002\b J\b\020!\032\0020\"H\026R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR$\020\002\032\0020\0032\006\020\n\032\0020\003@@X\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R$\020\004\032\0020\0032\006\020\n\032\0020\003@@X\016¢\006\016\n\000\032\004\b\017\020\f\"\004\b\020\020\016¨\006#"}, d2 = {"Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/AnimationVector;", "v1", "", "v2", "(FF)V", "size", "", "getSize$animation_core", "()I", "<set-?>", "getV1", "()F", "setV1$animation_core", "(F)V", "getV2", "setV2$animation_core", "equals", "", "other", "", "get", "index", "get$animation_core", "hashCode", "newVector", "newVector$animation_core", "reset", "", "reset$animation_core", "set", "value", "set$animation_core", "toString", "", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class AnimationVector2D
/*     */   extends AnimationVector
/*     */ {
/*     */   private float v1;
/*     */   private float v2;
/*     */   private final int size;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public final float getV1() {
/*     */     return this.v1;
/*     */   }
/*     */   
/*     */   public final void setV1$animation_core(float <set-?>) {
/*     */     this.v1 = <set-?>;
/*     */   }
/*     */   
/*     */   public final float getV2() {
/*     */     return this.v2;
/*     */   }
/*     */   
/*     */   public final void setV2$animation_core(float <set-?>) {
/*     */     this.v2 = <set-?>;
/*     */   }
/*     */   
/*     */   public void reset$animation_core() {
/*     */     this.v1 = 0.0F;
/*     */     this.v2 = 0.0F;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public AnimationVector2D newVector$animation_core() {
/*     */     return new AnimationVector2D(0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   public float get$animation_core(int index) {
/*     */     switch (index) {
/*     */       case 0:
/*     */       
/*     */       case 1:
/*     */       
/*     */     } 
/*     */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void set$animation_core(int index, float value) {
/*     */     switch (index) {
/*     */       case 0:
/*     */         this.v1 = value;
/*     */         break;
/*     */       case 1:
/*     */         this.v2 = value;
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public AnimationVector2D(float v1, float v2) {
/* 146 */     super(null);
/*     */ 
/*     */ 
/*     */     
/* 150 */     this.v1 = v1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 156 */     this.v2 = v2;
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
/* 181 */     this.size = 2; } public int getSize$animation_core() { return this.size; }
/*     */    @NotNull
/*     */   public String toString() {
/* 184 */     return "AnimationVector2D: v1 = " + this.v1 + ", v2 = " + this.v2;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 188 */     return (other instanceof AnimationVector2D && ((((AnimationVector2D)other).v1 == this.v1)) && ((((AnimationVector2D)other).v2 == this.v2)));
/*     */   } public int hashCode() {
/* 190 */     return Float.hashCode(this.v1) * 31 + Float.hashCode(this.v2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\AnimationVector2D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */