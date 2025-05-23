/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\002\n\002\020\006\n\002\b\n\n\002\020\013\n\002\b\b\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\003\b\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\026\020\026\032\0020\0032\006\020\027\032\0020\0032\006\020\030\032\0020\003J\b\020\031\032\0020\032H\002J-\020\033\032\0020\0342\006\020\027\032\0020\0032\006\020\030\032\0020\0032\006\020\035\032\0020\036H\000ø\001\000ø\001\001¢\006\004\b\037\020 R\016\020\005\032\0020\006X\016¢\006\002\n\000R$\020\b\032\0020\0032\006\020\007\032\0020\003@FX\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\004R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\f\020\n\"\004\b\r\020\004R\016\020\016\032\0020\006X\016¢\006\002\n\000R\016\020\017\032\0020\006X\016¢\006\002\n\000R\016\020\020\032\0020\021X\016¢\006\002\n\000R\016\020\022\032\0020\006X\016¢\006\002\n\000R$\020\023\032\0020\0032\006\020\007\032\0020\0038F@FX\016¢\006\f\032\004\b\024\020\n\"\004\b\025\020\004\002\013\n\002\b!\n\005\b¡\0360\001¨\006!"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "finalPosition", "", "(F)V", "dampedFreq", "", "value", "dampingRatio", "getDampingRatio", "()F", "setDampingRatio", "getFinalPosition", "setFinalPosition", "gammaMinus", "gammaPlus", "initialized", "", "naturalFreq", "stiffness", "getStiffness", "setStiffness", "getAcceleration", "lastDisplacement", "lastVelocity", "init", "", "updateValues", "Landroidx/compose/animation/core/Motion;", "timeElapsed", "", "updateValues-IJZedt4$animation_core", "(FFJ)J", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class SpringSimulation
/*     */ {
/*     */   private float finalPosition;
/*     */   private double naturalFreq;
/*     */   private boolean initialized;
/*     */   private double gammaPlus;
/*     */   private double gammaMinus;
/*     */   private double dampedFreq;
/*     */   private float dampingRatio;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public final float getFinalPosition() {
/*     */     return this.finalPosition;
/*     */   }
/*     */   
/*     */   public final void setFinalPosition(float <set-?>) {
/*     */     this.finalPosition = <set-?>;
/*     */   }
/*     */   
/*     */   public final void setStiffness(float value) {
/*     */     if (getStiffness() <= 0.0F)
/*     */       throw new IllegalArgumentException("Spring stiffness constant must be positive."); 
/*     */     this.naturalFreq = Math.sqrt(value);
/*     */     this.initialized = false;
/*     */   }
/*     */   
/*     */   public final float getStiffness() {
/*     */     return (float)(this.naturalFreq * this.naturalFreq);
/*     */   }
/*     */   
/*     */   public SpringSimulation(float finalPosition) {
/*  68 */     this.finalPosition = finalPosition;
/*     */ 
/*     */     
/*  71 */     this.naturalFreq = Math.sqrt(50.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     this.dampingRatio = 1.0F; } public final float getDampingRatio() { return this.dampingRatio; }
/*     */    public final void setDampingRatio(float value) {
/* 104 */     if (value < 0.0F) {
/* 105 */       throw new IllegalArgumentException("Damping ratio must be non-negative");
/*     */     }
/* 107 */     this.dampingRatio = value;
/*     */     
/* 109 */     this.initialized = false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getAcceleration(float lastDisplacement, float lastVelocity) {
/* 115 */     float adjustedDisplacement = lastDisplacement - this.finalPosition;
/*     */     
/* 117 */     double k = this.naturalFreq * this.naturalFreq;
/* 118 */     double c = 2.0D * this.naturalFreq * this.dampingRatio;
/*     */     
/* 120 */     return (float)(-k * adjustedDisplacement - c * lastVelocity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void init() {
/* 131 */     if (this.initialized) {
/*     */       return;
/*     */     }
/*     */     
/* 135 */     if ((this.finalPosition == SpringSimulationKt.getUNSET())) {
/* 136 */       throw new IllegalStateException(
/* 137 */           "Error: Final position of the spring must be set before the animation starts");
/*     */     }
/*     */ 
/*     */     
/* 141 */     double dampingRatioSquared = this.dampingRatio * this.dampingRatio;
/* 142 */     if (this.dampingRatio > 1.0F) {
/*     */       
/* 144 */       this.gammaPlus = 
/* 145 */         -this.dampingRatio * this.naturalFreq + this.naturalFreq * Math.sqrt(dampingRatioSquared - true);
/* 146 */       this.gammaMinus = 
/* 147 */         -this.dampingRatio * this.naturalFreq - this.naturalFreq * Math.sqrt(dampingRatioSquared - true);
/* 148 */     } else if (this.dampingRatio >= 0.0F && this.dampingRatio < 1.0F) {
/*     */       
/* 150 */       this.dampedFreq = this.naturalFreq * Math.sqrt(true - dampingRatioSquared);
/*     */     } 
/*     */     
/* 153 */     this.initialized = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final long updateValues-IJZedt4$animation_core(float lastDisplacement, float lastVelocity, long timeElapsed) {
/* 162 */     init();
/*     */     
/* 164 */     float adjustedDisplacement = lastDisplacement - this.finalPosition;
/* 165 */     double deltaT = timeElapsed / 1000.0D;
/* 166 */     double displacement = 0.0D;
/* 167 */     double currentVelocity = 0.0D;
/* 168 */     if (this.dampingRatio > 1.0F) {
/*     */       
/* 170 */       double coeffA = 
/*     */         
/* 172 */         adjustedDisplacement - (
/* 173 */         this.gammaMinus * adjustedDisplacement - lastVelocity) / (
/* 174 */         this.gammaMinus - this.gammaPlus);
/*     */ 
/*     */       
/* 177 */       double coeffB = (
/* 178 */         this.gammaMinus * adjustedDisplacement - lastVelocity) / (
/* 179 */         this.gammaMinus - this.gammaPlus);
/*     */       
/* 181 */       displacement = 
/* 182 */         coeffA * Math.exp(this.gammaMinus * deltaT) + 
/* 183 */         coeffB * Math.exp(this.gammaPlus * deltaT);
/*     */       
/* 185 */       currentVelocity = 
/* 186 */         coeffA * this.gammaMinus * Math.exp(this.gammaMinus * deltaT) + 
/* 187 */         coeffB * this.gammaPlus * Math.exp(this.gammaPlus * deltaT);
/*     */     }
/* 189 */     else if ((this.dampingRatio == 1.0F)) {
/*     */       
/* 191 */       float coeffA = adjustedDisplacement;
/* 192 */       double coeffB = lastVelocity + this.naturalFreq * adjustedDisplacement;
/* 193 */       displacement = (coeffA + coeffB * deltaT) * Math.exp(-this.naturalFreq * deltaT);
/* 194 */       currentVelocity = (
/*     */ 
/*     */         
/* 197 */         coeffA + coeffB * deltaT) * Math.exp(-this.naturalFreq * deltaT) * 
/* 198 */         -this.naturalFreq + 
/* 199 */         coeffB * Math.exp(-this.naturalFreq * deltaT);
/*     */     }
/*     */     else {
/*     */       
/* 203 */       float cosCoeff = adjustedDisplacement;
/* 204 */       double sinCoeff = 
/*     */         
/* 206 */         true / this.dampedFreq * (
/*     */         
/* 208 */         this.dampingRatio * this.naturalFreq * adjustedDisplacement + 
/* 209 */         lastVelocity);
/*     */ 
/*     */ 
/*     */       
/* 213 */       displacement = 
/* 214 */         Math.exp(-this.dampingRatio * this.naturalFreq * deltaT) * (
/*     */ 
/*     */         
/* 217 */         cosCoeff * Math.cos(this.dampedFreq * deltaT) + 
/* 218 */         sinCoeff * Math.sin(this.dampedFreq * deltaT));
/*     */ 
/*     */ 
/*     */       
/* 222 */       currentVelocity = 
/* 223 */         displacement * -this.naturalFreq * this.dampingRatio + 
/*     */         
/* 225 */         Math.exp(-this.dampingRatio * this.naturalFreq * deltaT) * (
/*     */ 
/*     */         
/* 228 */         -this.dampedFreq * cosCoeff * 
/* 229 */         Math.sin(this.dampedFreq * deltaT) + this.dampedFreq * sinCoeff * 
/* 230 */         Math.cos(this.dampedFreq * deltaT));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 237 */     float newValue = (float)(displacement + this.finalPosition);
/* 238 */     float newVelocity = (float)currentVelocity;
/*     */     
/* 240 */     return SpringSimulationKt.Motion(newValue, newVelocity);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\SpringSimulation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */