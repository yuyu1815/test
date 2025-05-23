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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\004\n\002\020\b\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\007\n\002\020\002\n\002\b\005\n\002\020\016\n\000\b\007\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027H\002J\026\020\030\032\0020\0032\006\020\031\032\0020\bH\002¢\006\002\b\032J\b\020\033\032\0020\bH\026J\r\020\034\032\0020\000H\020¢\006\002\b\035J\r\020\036\032\0020\037H\020¢\006\002\b J\036\020!\032\0020\0372\006\020\031\032\0020\b2\006\020\"\032\0020\003H\002¢\006\002\b#J\b\020$\032\0020%H\026R\024\020\007\032\0020\bXD¢\006\b\n\000\032\004\b\t\020\nR$\020\002\032\0020\0032\006\020\013\032\0020\003@@X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017R$\020\004\032\0020\0032\006\020\013\032\0020\003@@X\016¢\006\016\n\000\032\004\b\020\020\r\"\004\b\021\020\017R$\020\005\032\0020\0032\006\020\013\032\0020\003@@X\016¢\006\016\n\000\032\004\b\022\020\r\"\004\b\023\020\017¨\006&"}, d2 = {"Landroidx/compose/animation/core/AnimationVector3D;", "Landroidx/compose/animation/core/AnimationVector;", "v1", "", "v2", "v3", "(FFF)V", "size", "", "getSize$animation_core", "()I", "<set-?>", "getV1", "()F", "setV1$animation_core", "(F)V", "getV2", "setV2$animation_core", "getV3", "setV3$animation_core", "equals", "", "other", "", "get", "index", "get$animation_core", "hashCode", "newVector", "newVector$animation_core", "reset", "", "reset$animation_core", "set", "value", "set$animation_core", "toString", "", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class AnimationVector3D
/*     */   extends AnimationVector
/*     */ {
/*     */   private float v1;
/*     */   private float v2;
/*     */   private float v3;
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
/*     */   public void reset$animation_core() {
/*     */     this.v1 = 0.0F;
/*     */     this.v2 = 0.0F;
/*     */     this.v3 = 0.0F;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public AnimationVector3D newVector$animation_core() {
/*     */     return new AnimationVector3D(0.0F, 0.0F, 0.0F);
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
/*     */     } 
/*     */   }
/*     */   
/*     */   public AnimationVector3D(float v1, float v2, float v3) {
/* 200 */     super(null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 205 */     this.v1 = v1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 211 */     this.v2 = v2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 217 */     this.v3 = v3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 246 */     this.size = 3; } public int getSize$animation_core() { return this.size; }
/*     */    @NotNull
/*     */   public String toString() {
/* 249 */     return "AnimationVector3D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 253 */     return (other instanceof AnimationVector3D && ((((AnimationVector3D)other).v1 == this.v1)) && ((((AnimationVector3D)other).v2 == this.v2)) && ((((AnimationVector3D)other).v3 == this.v3)));
/*     */   } public int hashCode() {
/* 255 */     return (Float.hashCode(this.v1) * 31 + Float.hashCode(this.v2)) * 31 + Float.hashCode(this.v3);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\AnimationVector3D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */