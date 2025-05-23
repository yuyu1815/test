/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\024\n\000\n\002\020\021\n\000\n\002\020\007\n\002\b\002\n\002\020\013\n\002\b\r\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\t\b\001\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0030\005\022\006\020\006\032\0020\007¢\006\002\020\bJ8\020\020\032\0020\0072\006\020\021\032\0020\0072\006\020\022\032\0020\0072\006\020\023\032\0020\0072\006\020\024\032\0020\0072\006\020\025\032\0020\0072\006\020\026\032\0020\007H\002J \020\027\032\0020\0302\006\020\002\032\0020\0072\006\020\031\032\0020\0322\b\b\002\020\033\032\0020\034J\026\020\027\032\0020\0072\006\020\035\032\0020\0072\006\020\036\032\0020\034J \020\037\032\0020\0302\006\020\002\032\0020\0072\006\020\031\032\0020\0322\b\b\002\020\033\032\0020\034J\026\020\037\032\0020\0302\006\020\002\032\0020\0072\006\020\031\032\0020\003J\030\020\037\032\0020\0072\006\020\002\032\0020\0072\006\020\036\032\0020\034H\002J8\020 \032\0020\0072\006\020\021\032\0020\0072\006\020\022\032\0020\0072\006\020\023\032\0020\0072\006\020\024\032\0020\0072\006\020\025\032\0020\0072\006\020\026\032\0020\007H\002J#\020!\032\b\022\004\022\0020\0030\0052\006\020\"\032\0020\0342\006\020#\032\0020\034H\002¢\006\002\020$R\016\020\t\032\0020\nXD¢\006\002\n\000R\016\020\013\032\0020\003X\004¢\006\002\n\000R\026\020\f\032\b\022\004\022\0020\0030\005X\004¢\006\004\n\002\020\rR\016\020\016\032\0020\003X\004¢\006\002\n\000R\026\020\017\032\b\022\004\022\0020\0030\005X\004¢\006\004\n\002\020\r¨\006%"}, d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "time", "", "y", "", "periodicBias", "", "([F[[FF)V", "isExtrapolate", "", "slopeTemp", "tangents", "[[F", "timePoints", "values", "diff", "h", "x", "y1", "y2", "t1", "t2", "getPos", "", "v", "Landroidx/compose/animation/core/AnimationVector;", "index", "", "t", "j", "getSlope", "interpolate", "makeFloatArray", "a", "b", "(II)[[F", "animation-core"})
/*     */ @ExperimentalAnimationSpecApi
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class MonoSpline
/*     */ {
/*     */   @NotNull
/*     */   private final float[] timePoints;
/*     */   @NotNull
/*     */   private final float[][] values;
/*     */   @NotNull
/*     */   private final float[][] tangents;
/*     */   private final boolean isExtrapolate = true;
/*     */   @NotNull
/*     */   private final float[] slopeTemp;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public MonoSpline(@NotNull float[] time, @NotNull float[][] y, float periodicBias) {
/*  34 */     int n = time.length;
/*  35 */     int dim = (y[0]).length;
/*  36 */     this.slopeTemp = new float[dim];
/*  37 */     float[][] slope = makeFloatArray(n - 1, dim);
/*  38 */     float[][] tangent = makeFloatArray(n, dim); int j;
/*  39 */     for (j = 0; j < dim; j++) {
/*  40 */       for (int m = 0, i1 = n - 1; m < i1; m++) {
/*  41 */         float dt = time[m + 1] - time[m];
/*  42 */         slope[m][j] = (y[m + 1][j] - y[m][j]) / dt;
/*  43 */         if (m == 0) {
/*  44 */           tangent[m][j] = slope[m][j];
/*     */         } else {
/*  46 */           tangent[m][j] = (slope[m - 1][j] + slope[m][j]) * 0.5F;
/*     */         } 
/*     */       } 
/*  49 */       tangent[n - 1][j] = slope[n - 2][j];
/*     */     } 
/*  51 */     if (!Float.isNaN(periodicBias)) {
/*  52 */       for (j = 0; j < dim; j++) {
/*     */         
/*  54 */         float adjustedSlope = 
/*  55 */           slope[n - 2][j] * (true - periodicBias) + slope[0][j] * periodicBias;
/*  56 */         slope[0][j] = adjustedSlope;
/*  57 */         slope[n - 2][j] = adjustedSlope;
/*  58 */         tangent[n - 1][j] = adjustedSlope;
/*  59 */         tangent[0][j] = adjustedSlope;
/*     */       } 
/*     */     }
/*  62 */     for (int i = 0, k = n - 1; i < k; i++) {
/*  63 */       for (int m = 0; m < dim; m++) {
/*  64 */         if ((slope[i][m] == 0.0F)) {
/*  65 */           tangent[i][m] = 0.0F;
/*  66 */           tangent[i + 1][m] = 0.0F;
/*     */         } else {
/*  68 */           float a = tangent[i][m] / slope[i][m];
/*  69 */           float b = tangent[i + 1][m] / slope[i][m];
/*  70 */           float h = (float)Math.hypot(a, b);
/*  71 */           if (h > 9.0D) {
/*  72 */             float t = 3.0F / h;
/*  73 */             tangent[i][m] = t * a * slope[i][m];
/*  74 */             tangent[i + 1][m] = t * b * slope[i][m];
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  79 */     this.timePoints = time;
/*  80 */     this.values = y;
/*  81 */     this.tangents = tangent;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final float[][] makeFloatArray(int a, int b) {
/*     */     float[][] arrayOfFloat;
/*  88 */     for (byte b1 = 0; b1 < a; ) { byte b2 = b1; arrayOfFloat[b2] = new float[b]; b1++; }  return arrayOfFloat;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getPos(float t, int j) {
/*  94 */     int n = this.timePoints.length;
/*  95 */     if (this.isExtrapolate) {
/*  96 */       if (t <= this.timePoints[0]) {
/*  97 */         return this.values[0][j] + (t - this.timePoints[0]) * getSlope(this.timePoints[0], j);
/*     */       }
/*  99 */       if (t >= this.timePoints[n - 1]) {
/* 100 */         return this.values[n - 1][j] + (t - this.timePoints[n - 1]) * getSlope(this.timePoints[n - 1], j);
/*     */       }
/*     */     } else {
/* 103 */       if (t <= this.timePoints[0]) {
/* 104 */         return this.values[0][j];
/*     */       }
/* 106 */       if (t >= this.timePoints[n - 1]) {
/* 107 */         return this.values[n - 1][j];
/*     */       }
/*     */     } 
/* 110 */     for (int i = 0, k = n - 1; i < k; i++) {
/* 111 */       if ((t == this.timePoints[i])) {
/* 112 */         return this.values[i][j];
/*     */       }
/* 114 */       if (t < this.timePoints[i + 1]) {
/* 115 */         float h = this.timePoints[i + 1] - this.timePoints[i];
/* 116 */         float x = (t - this.timePoints[i]) / h;
/* 117 */         float y1 = this.values[i][j];
/* 118 */         float y2 = this.values[i + 1][j];
/* 119 */         float t1 = this.tangents[i][j];
/* 120 */         float t2 = this.tangents[i + 1][j];
/* 121 */         return interpolate(h, x, y1, y2, t1, t2);
/*     */       } 
/*     */     } 
/* 124 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void getPos(float time, @NotNull AnimationVector v, int index) {
/* 133 */     Intrinsics.checkNotNullParameter(v, "v"); int n = this.timePoints.length;
/* 134 */     int dim = (this.values[0]).length;
/* 135 */     if (this.isExtrapolate) {
/* 136 */       if (time <= this.timePoints[0]) {
/* 137 */         getSlope(this.timePoints[0], this.slopeTemp);
/* 138 */         for (int k = 0; k < dim; k++) {
/* 139 */           v.set$animation_core(k, this.values[0][k] + (time - this.timePoints[0]) * this.slopeTemp[k]);
/*     */         }
/*     */         return;
/*     */       } 
/* 143 */       if (time >= this.timePoints[n - 1]) {
/* 144 */         getSlope(this.timePoints[n - 1], this.slopeTemp);
/* 145 */         for (int k = 0; k < dim; k++) {
/* 146 */           v.set$animation_core(k, this.values[n - 1][k] + (time - this.timePoints[n - 1]) * this.slopeTemp[k]);
/*     */         }
/*     */         return;
/*     */       } 
/*     */     } else {
/* 151 */       if (time <= this.timePoints[0]) {
/* 152 */         for (int k = 0; k < dim; k++) {
/* 153 */           v.set$animation_core(k, this.values[0][k]);
/*     */         }
/*     */         return;
/*     */       } 
/* 157 */       if (time >= this.timePoints[n - 1]) {
/* 158 */         for (int k = 0; k < dim; k++) {
/* 159 */           v.set$animation_core(k, this.values[n - 1][k]);
/*     */         }
/*     */         return;
/*     */       } 
/*     */     } 
/* 164 */     for (int i = index, j = n - 1; i < j; i++) {
/* 165 */       if ((time == this.timePoints[i])) {
/* 166 */         for (int k = 0; k < dim; k++) {
/* 167 */           v.set$animation_core(k, this.values[i][k]);
/*     */         }
/*     */       }
/* 170 */       if (time < this.timePoints[i + 1]) {
/* 171 */         float h = this.timePoints[i + 1] - this.timePoints[i];
/* 172 */         float x = (time - this.timePoints[i]) / h;
/* 173 */         for (int k = 0; k < dim; k++) {
/* 174 */           float y1 = this.values[i][k];
/* 175 */           float y2 = this.values[i + 1][k];
/* 176 */           float t1 = this.tangents[i][k];
/* 177 */           float t2 = this.tangents[i + 1][k];
/* 178 */           v.set$animation_core(k, interpolate(h, x, y1, y2, t1, t2));
/*     */         } 
/*     */         return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void getSlope(float time, @NotNull float[] v) {
/* 190 */     Intrinsics.checkNotNullParameter(v, "v"); float t = time;
/* 191 */     int n = this.timePoints.length;
/* 192 */     int dim = (this.values[0]).length;
/* 193 */     if (t <= this.timePoints[0]) {
/* 194 */       t = this.timePoints[0];
/* 195 */     } else if (t >= this.timePoints[n - 1]) {
/* 196 */       t = this.timePoints[n - 1];
/*     */     } 
/* 198 */     for (int i = 0, j = n - 1; i < j; i++) {
/* 199 */       if (t <= this.timePoints[i + 1]) {
/* 200 */         float h = this.timePoints[i + 1] - this.timePoints[i];
/* 201 */         float x = (t - this.timePoints[i]) / h;
/* 202 */         for (int k = 0; k < dim; k++) {
/* 203 */           float y1 = this.values[i][k];
/* 204 */           float y2 = this.values[i + 1][k];
/* 205 */           float t1 = this.tangents[i][k];
/* 206 */           float t2 = this.tangents[i + 1][k];
/* 207 */           v[k] = diff(h, x, y1, y2, t1, t2) / h;
/*     */         } 
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void getSlope(float time, @NotNull AnimationVector v, int index) {
/* 222 */     Intrinsics.checkNotNullParameter(v, "v"); float t = time;
/* 223 */     int n = this.timePoints.length;
/* 224 */     int dim = (this.values[0]).length;
/*     */ 
/*     */     
/* 227 */     if (t <= this.timePoints[0]) {
/* 228 */       for (int k = 0; k < dim; k++)
/* 229 */         v.set$animation_core(k, this.tangents[0][k]); 
/*     */       return;
/*     */     } 
/* 232 */     if (t >= this.timePoints[n - 1]) {
/* 233 */       for (int k = 0; k < dim; k++) {
/* 234 */         v.set$animation_core(k, this.tangents[n - 1][k]);
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 240 */     for (int i = index, j = n - 1; i < j; i++) {
/* 241 */       if (t <= this.timePoints[i + 1]) {
/* 242 */         float h = this.timePoints[i + 1] - this.timePoints[i];
/* 243 */         float x = (t - this.timePoints[i]) / h;
/* 244 */         for (int k = 0; k < dim; k++) {
/* 245 */           float y1 = this.values[i][k];
/* 246 */           float y2 = this.values[i + 1][k];
/* 247 */           float t1 = this.tangents[i][k];
/* 248 */           float t2 = this.tangents[i + 1][k];
/* 249 */           v.set$animation_core(k, diff(h, x, y1, y2, t1, t2) / h);
/*     */         } 
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private final float getSlope(float time, int j) {
/* 258 */     float t = time;
/* 259 */     int n = this.timePoints.length;
/* 260 */     if (t < this.timePoints[0]) {
/* 261 */       t = this.timePoints[0];
/* 262 */     } else if (t >= this.timePoints[n - 1]) {
/* 263 */       t = this.timePoints[n - 1];
/*     */     } 
/* 265 */     for (int i = 0, k = n - 1; i < k; i++) {
/* 266 */       if (t <= this.timePoints[i + 1]) {
/* 267 */         float h = this.timePoints[i + 1] - this.timePoints[i];
/* 268 */         float x = (t - this.timePoints[i]) / h;
/* 269 */         float y1 = this.values[i][j];
/* 270 */         float y2 = this.values[i + 1][j];
/* 271 */         float t1 = this.tangents[i][j];
/* 272 */         float t2 = this.tangents[i + 1][j];
/* 273 */         return diff(h, x, y1, y2, t1, t2) / h;
/*     */       } 
/*     */     } 
/* 276 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final float interpolate(float h, float x, float y1, float y2, float t1, float t2) {
/* 290 */     float x2 = x * x;
/* 291 */     float x3 = x2 * x;
/* 292 */     return -2 * x3 * y2 + 
/* 293 */       3 * x2 * y2 + 
/* 294 */       2 * x3 * y1 - 
/* 295 */       3 * x2 * y1 + 
/* 296 */       y1 + h * t2 * x3 + 
/* 297 */       h * t1 * x3 - 
/* 298 */       h * t2 * x2 - 
/* 299 */       2 * h * t1 * x2 + 
/* 300 */       h * t1 * x;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final float diff(float h, float x, float y1, float y2, float t1, float t2) {
/* 307 */     float x2 = x * x;
/* 308 */     return -6 * x2 * y2 + 
/* 309 */       6 * x * y2 + 
/* 310 */       6 * x2 * y1 - 
/* 311 */       6 * x * y1 + 
/* 312 */       3 * h * t2 * x2 + 
/* 313 */       3 * h * t1 * x2 - 
/* 314 */       2 * h * t2 * x - 
/* 315 */       4 * h * t1 * x + h * t1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\MonoSpline.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */