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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\002\n\002\020\b\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\002\b\007\n\002\020\002\n\002\b\004\n\002\020\016\n\000\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\026\020\022\032\0020\0032\006\020\023\032\0020\006H\002¢\006\002\b\024J\b\020\025\032\0020\006H\026J\r\020\026\032\0020\000H\020¢\006\002\b\027J\r\020\030\032\0020\031H\020¢\006\002\b\032J\036\020\033\032\0020\0312\006\020\023\032\0020\0062\006\020\n\032\0020\003H\002¢\006\002\b\034J\b\020\035\032\0020\036H\026R\024\020\005\032\0020\006XD¢\006\b\n\000\032\004\b\007\020\bR$\020\n\032\0020\0032\006\020\t\032\0020\003@@X\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\004¨\006\037"}, d2 = {"Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector;", "initVal", "", "(F)V", "size", "", "getSize$animation_core", "()I", "<set-?>", "value", "getValue", "()F", "setValue$animation_core", "equals", "", "other", "", "get", "index", "get$animation_core", "hashCode", "newVector", "newVector$animation_core", "reset", "", "reset$animation_core", "set", "set$animation_core", "toString", "", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class AnimationVector1D
/*     */   extends AnimationVector
/*     */ {
/*     */   private float value;
/*     */   private final int size;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public final float getValue() {
/*     */     return this.value;
/*     */   }
/*     */   
/*     */   public final void setValue$animation_core(float <set-?>) {
/*     */     this.value = <set-?>;
/*     */   }
/*     */   
/*     */   public void reset$animation_core() {
/*     */     this.value = 0.0F;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public AnimationVector1D newVector$animation_core() {
/*     */     return new AnimationVector1D(0.0F);
/*     */   }
/*     */   
/*     */   public float get$animation_core(int index) {
/*     */     if (index == 0)
/*     */       return this.value; 
/*     */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void set$animation_core(int index, float value) {
/*     */     if (index == 0)
/*     */       this.value = value; 
/*     */   }
/*     */   
/*     */   public AnimationVector1D(float initVal) {
/* 101 */     super(null);
/*     */ 
/*     */ 
/*     */     
/* 105 */     this.value = initVal;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 128 */     this.size = 1; } public int getSize$animation_core() { return this.size; }
/*     */    @NotNull
/*     */   public String toString() {
/* 131 */     return "AnimationVector1D: value = " + this.value;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 135 */     return (other instanceof AnimationVector1D && ((((AnimationVector1D)other).value == this.value)));
/*     */   } public int hashCode() {
/* 137 */     return Float.hashCode(this.value);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\AnimationVector1D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */