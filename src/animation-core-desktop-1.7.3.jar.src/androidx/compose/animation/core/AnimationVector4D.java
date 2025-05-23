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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\005\n\002\020\b\n\002\b\016\n\002\020\013\n\000\n\002\020\000\n\002\b\007\n\002\020\002\n\002\b\005\n\002\020\016\n\000\b\007\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\002\020\007J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032H\002J\026\020\033\032\0020\0032\006\020\034\032\0020\tH\002¢\006\002\b\035J\b\020\036\032\0020\tH\026J\r\020\037\032\0020\000H\020¢\006\002\b J\r\020!\032\0020\"H\020¢\006\002\b#J\036\020$\032\0020\"2\006\020\034\032\0020\t2\006\020%\032\0020\003H\002¢\006\002\b&J\b\020'\032\0020(H\026R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R$\020\002\032\0020\0032\006\020\f\032\0020\003@@X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R$\020\004\032\0020\0032\006\020\f\032\0020\003@@X\016¢\006\016\n\000\032\004\b\021\020\016\"\004\b\022\020\020R$\020\005\032\0020\0032\006\020\f\032\0020\003@@X\016¢\006\016\n\000\032\004\b\023\020\016\"\004\b\024\020\020R$\020\006\032\0020\0032\006\020\f\032\0020\003@@X\016¢\006\016\n\000\032\004\b\025\020\016\"\004\b\026\020\020¨\006)"}, d2 = {"Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", "v1", "", "v2", "v3", "v4", "(FFFF)V", "size", "", "getSize$animation_core", "()I", "<set-?>", "getV1", "()F", "setV1$animation_core", "(F)V", "getV2", "setV2$animation_core", "getV3", "setV3$animation_core", "getV4", "setV4$animation_core", "equals", "", "other", "", "get", "index", "get$animation_core", "hashCode", "newVector", "newVector$animation_core", "reset", "", "reset$animation_core", "set", "value", "set$animation_core", "toString", "", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class AnimationVector4D
/*     */   extends AnimationVector
/*     */ {
/*     */   private float v1;
/*     */   private float v2;
/*     */   private float v3;
/*     */   private float v4;
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
/*     */   public final float getV3() {
/*     */     return this.v3;
/*     */   }
/*     */   
/*     */   public final void setV3$animation_core(float <set-?>) {
/*     */     this.v3 = <set-?>;
/*     */   }
/*     */   
/*     */   public final float getV4() {
/*     */     return this.v4;
/*     */   }
/*     */   
/*     */   public final void setV4$animation_core(float <set-?>) {
/*     */     this.v4 = <set-?>;
/*     */   }
/*     */   
/*     */   public void reset$animation_core() {
/*     */     this.v1 = 0.0F;
/*     */     this.v2 = 0.0F;
/*     */     this.v3 = 0.0F;
/*     */     this.v4 = 0.0F;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public AnimationVector4D newVector$animation_core() {
/*     */     return new AnimationVector4D(0.0F, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   public float get$animation_core(int index) {
/*     */     switch (index) {
/*     */       case 0:
/*     */       
/*     */       case 1:
/*     */       
/*     */       case 2:
/*     */       
/*     */       case 3:
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
/*     */       case 2:
/*     */         this.v3 = value;
/*     */         break;
/*     */       case 3:
/*     */         this.v4 = value;
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public AnimationVector4D(float v1, float v2, float v3, float v4) {
/* 266 */     super(null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 271 */     this.v1 = v1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 277 */     this.v2 = v2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 283 */     this.v3 = v3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 289 */     this.v4 = v4;
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
/* 320 */     this.size = 4; } public int getSize$animation_core() { return this.size; }
/*     */    @NotNull
/*     */   public String toString() {
/* 323 */     return "AnimationVector4D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3 + ", v4 = " + this.v4;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 327 */     return (other instanceof AnimationVector4D && (
/* 328 */       (((AnimationVector4D)other).v1 == this.v1)) && (
/* 329 */       (((AnimationVector4D)other).v2 == this.v2)) && (
/* 330 */       (((AnimationVector4D)other).v3 == this.v3)) && (
/* 331 */       (((AnimationVector4D)other).v4 == this.v4)));
/*     */   }
/*     */   public int hashCode() {
/* 334 */     return ((Float.hashCode(this.v1) * 31 + Float.hashCode(this.v2)) * 31 + Float.hashCode(this.v3)) * 31 + Float.hashCode(this.v4);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\AnimationVector4D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */