/*     */ package org.jetbrains.jewel.ui.painter;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.DpRect;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\020\"\n\002\030\002\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\013\n\002\030\002\n\000\n\002\020\b\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\r\b\002\030\0002\0020\0012\0020\002B?\022\006\020\003\032\0020\002\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\b\b\002\020\t\032\0020\005\022\016\b\002\020\n\032\b\022\004\022\0020\f0\013¢\006\004\b\r\020\016J\020\020\026\032\004\030\0010\0002\006\020\027\032\0020\030J\024\020\031\032\0020\032*\0020\033H\001¢\006\004\b\034\020\035J\024\020\031\032\0020\032*\0020\036H\001¢\006\004\b\037\020 J\024\020!\032\0020\033*\0020\"H\001¢\006\004\b#\020$J\024\020!\032\0020\033*\0020\032H\001¢\006\004\b#\020%J\024\020!\032\0020\033*\0020\036H\001¢\006\004\b&\020'J\024\020(\032\0020)*\0020*H\001¢\006\004\b+\020,J\024\020-\032\0020\"*\0020\033H\001¢\006\004\b.\020$J\024\020-\032\0020\"*\0020\036H\001¢\006\004\b/\020'J\r\0200\032\00201*\00202H\001J\024\0203\032\0020**\0020)H\001¢\006\004\b4\020,J\024\0205\032\0020\036*\0020\"H\001¢\006\004\b6\0207J\024\0205\032\0020\036*\0020\032H\001¢\006\004\b6\0208J\024\0205\032\0020\036*\0020\033H\001¢\006\004\b9\0207R\016\020\003\032\0020\002X\004¢\006\002\n\000R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\t\032\0020\005X\004¢\006\b\n\000\032\004\b\023\020\020R\032\020\n\032\b\022\004\022\0020\f0\013X\004¢\006\b\n\000\032\004\b\024\020\025R\024\020:\032\0020\"8\026X\005¢\006\006\032\004\b;\020<R\024\020=\032\0020\"8\026X\005¢\006\006\032\004\b>\020<¨\006?"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;", "Lorg/jetbrains/jewel/ui/painter/ResourcePainterProviderScope;", "Landroidx/compose/ui/unit/Density;", "localDensity", "rawPath", "", "classLoaders", "", "Ljava/lang/ClassLoader;", "path", "acceptedHints", "", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "<init>", "(Landroidx/compose/ui/unit/Density;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/List;)V", "getRawPath", "()Ljava/lang/String;", "getClassLoaders", "()Ljava/util/Set;", "getPath", "getAcceptedHints", "()Ljava/util/List;", "apply", "pathHint", "Lorg/jetbrains/jewel/ui/painter/PainterPathHint;", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "toDp-GaN1DYA", "(J)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "toSp-0xMU5do", "density", "getDensity", "()F", "fontScale", "getFontScale", "ui"})
/*     */ final class Scope
/*     */   implements ResourcePainterProviderScope, Density
/*     */ {
/*     */   @NotNull
/*     */   private final Density localDensity;
/*     */   @NotNull
/*     */   private final String rawPath;
/*     */   @NotNull
/*     */   private final Set<ClassLoader> classLoaders;
/*     */   @NotNull
/*     */   private final String path;
/*     */   @NotNull
/*     */   private final List<PainterHint> acceptedHints;
/*     */   
/*     */   @NotNull
/*     */   public String getRawPath() {
/*     */     return this.rawPath;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Set<ClassLoader> getClassLoaders() {
/*     */     return this.classLoaders;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getPath() {
/*     */     return this.path;
/*     */   }
/*     */   
/*     */   public Scope(@NotNull Density localDensity, @NotNull String rawPath, @NotNull Set<ClassLoader> classLoaders, @NotNull String path, @NotNull List<PainterHint> acceptedHints) {
/* 218 */     this.localDensity = localDensity;
/* 219 */     this.rawPath = rawPath;
/* 220 */     this.classLoaders = classLoaders;
/* 221 */     this.path = path;
/* 222 */     this.acceptedHints = acceptedHints; } @NotNull public List<PainterHint> getAcceptedHints() { return this.acceptedHints; }
/*     */    @Nullable
/*     */   public final Scope apply(@NotNull PainterPathHint pathHint) {
/* 225 */     Intrinsics.checkNotNullParameter(pathHint, "pathHint"); PainterPathHint $this$apply_u24lambda_u240 = pathHint; int $i$a$-with-ResourcePainterProvider$Scope$apply$1 = 0;
/* 226 */     String patched = $this$apply_u24lambda_u240.patch(this);
/* 227 */     if (Intrinsics.areEqual(patched, getPath())) {
/* 228 */       return null;
/*     */     }
/* 230 */     return new Scope(
/* 231 */         this.localDensity, 
/* 232 */         getRawPath(), 
/* 233 */         getClassLoaders(), 
/* 234 */         patched, 
/* 235 */         getAcceptedHints());
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public int roundToPx-0680j_4(float $this$roundToPx_u2d0680j_4) {
/*     */     return this.localDensity.roundToPx-0680j_4($this$roundToPx_u2d0680j_4);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public int roundToPx--R2X_6o(long $this$roundToPx_u2d_u2dR2X_6o) {
/*     */     return this.localDensity.roundToPx--R2X_6o($this$roundToPx_u2d_u2dR2X_6o);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public float toDp-u2uoSUM(float $this$toDp_u2du2uoSUM) {
/*     */     return this.localDensity.toDp-u2uoSUM($this$toDp_u2du2uoSUM);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public float toDp-u2uoSUM(int $this$toDp_u2du2uoSUM) {
/*     */     return this.localDensity.toDp-u2uoSUM($this$toDp_u2du2uoSUM);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public float toDp-GaN1DYA(long $this$toDp_u2dGaN1DYA) {
/*     */     return this.localDensity.toDp-GaN1DYA($this$toDp_u2dGaN1DYA);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public long toDpSize-k-rfVVM(long $this$toDpSize_u2dk_u2drfVVM) {
/*     */     return this.localDensity.toDpSize-k-rfVVM($this$toDpSize_u2dk_u2drfVVM);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public float toPx-0680j_4(float $this$toPx_u2d0680j_4) {
/*     */     return this.localDensity.toPx-0680j_4($this$toPx_u2d0680j_4);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public float toPx--R2X_6o(long $this$toPx_u2d_u2dR2X_6o) {
/*     */     return this.localDensity.toPx--R2X_6o($this$toPx_u2d_u2dR2X_6o);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Rect toRect(@NotNull DpRect $this$toRect) {
/*     */     Intrinsics.checkNotNullParameter($this$toRect, "<this>");
/*     */     return this.localDensity.toRect($this$toRect);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public long toSize-XkaWNTQ(long $this$toSize_u2dXkaWNTQ) {
/*     */     return this.localDensity.toSize-XkaWNTQ($this$toSize_u2dXkaWNTQ);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public long toSp-kPz2Gy4(float $this$toSp_u2dkPz2Gy4) {
/*     */     return this.localDensity.toSp-kPz2Gy4($this$toSp_u2dkPz2Gy4);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public long toSp-kPz2Gy4(int $this$toSp_u2dkPz2Gy4) {
/*     */     return this.localDensity.toSp-kPz2Gy4($this$toSp_u2dkPz2Gy4);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public long toSp-0xMU5do(float $this$toSp_u2d0xMU5do) {
/*     */     return this.localDensity.toSp-0xMU5do($this$toSp_u2d0xMU5do);
/*     */   }
/*     */   
/*     */   public float getDensity() {
/*     */     return this.localDensity.getDensity();
/*     */   }
/*     */   
/*     */   public float getFontScale() {
/*     */     return this.localDensity.getFontScale();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\ResourcePainterProvider$Scope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */