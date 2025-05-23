/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.Path;
/*     */ import org.jetbrains.skia.PathSegment;
/*     */ import org.jetbrains.skia.PathSegmentIterator;
/*     */ import org.jetbrains.skia.PathVerb;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\024\n\002\b\002\b\002\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\020\020\023\032\0020\0242\006\020\025\032\0020\026H\026J\t\020\027\032\0020\026H\002J\t\020\030\032\0020\031H\002J\030\020\030\032\0020\0322\006\020\033\032\0020\0342\006\020\035\032\0020\024H\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\t\020\nR\016\020\013\032\0020\fX\004¢\006\002\n\000R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\r\020\016R\016\020\017\032\0020\020X\004¢\006\002\n\000R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\021\020\022¨\006\036"}, d2 = {"Landroidx/compose/ui/graphics/SkiaPathIterator;", "Landroidx/compose/ui/graphics/PathIterator;", "path", "Landroidx/compose/ui/graphics/Path;", "conicEvaluation", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "tolerance", "", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)V", "getConicEvaluation", "()Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "iterator", "Lorg/jetbrains/skia/PathSegmentIterator;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "skiaPath", "Lorg/jetbrains/skia/Path;", "getTolerance", "()F", "calculateSize", "", "includeConvertedConics", "", "hasNext", "next", "Landroidx/compose/ui/graphics/PathSegment;", "Landroidx/compose/ui/graphics/PathSegment$Type;", "points", "", "offset", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nSkiaPathIterator.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkiaPathIterator.skiko.kt\nandroidx/compose/ui/graphics/SkiaPathIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n1#2:195\n*E\n"})
/*     */ final class SkiaPathIterator
/*     */   implements PathIterator
/*     */ {
/*     */   @NotNull
/*     */   private final Path path;
/*     */   @NotNull
/*     */   private final PathIterator.ConicEvaluation conicEvaluation;
/*     */   private final float tolerance;
/*     */   @NotNull
/*     */   private final Path skiaPath;
/*     */   @NotNull
/*     */   private final PathSegmentIterator iterator;
/*     */   
/*     */   @NotNull
/*     */   public Path getPath() {
/*     */     return this.path;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public PathIterator.ConicEvaluation getConicEvaluation() {
/*     */     return this.conicEvaluation;
/*     */   }
/*     */   
/*     */   public float getTolerance() {
/*     */     return this.tolerance;
/*     */   }
/*     */   
/*     */   public SkiaPathIterator(@NotNull Path path, @NotNull PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
/*  70 */     this.path = path;
/*  71 */     this.conicEvaluation = conicEvaluation;
/*  72 */     this.tolerance = tolerance;
/*     */     
/*  74 */     this.skiaPath = SkiaBackedPath_skikoKt.asSkiaPath(getPath());
/*  75 */     this.iterator = this.skiaPath.iterator();
/*     */   }
/*     */   public int calculateSize(boolean includeConvertedConics) {
/*  78 */     return this.skiaPath.getVerbsCount();
/*     */   } public boolean hasNext() {
/*  80 */     return this.iterator.hasNext();
/*     */   } @NotNull
/*     */   public PathSegment.Type next(@NotNull float[] points, int offset) {
/*  83 */     Intrinsics.checkNotNullParameter(points, "points"); if (!((points.length - offset >= 8) ? 1 : 0)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 195 */       int $i$a$-check-SkiaPathIterator$next$1 = 0;
/*     */       String str = "The points array must contain at least 8 floats";
/*     */       throw new IllegalStateException(str.toString());
/*     */     } 
/*     */     if (!hasNext())
/*     */       return PathSegment.Type.Done; 
/*     */     PathSegment segment = this.iterator.next();
/*     */     if (segment == null) {
/*     */       String str = "Required value was null.";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     switch (WhenMappings.$EnumSwitchMapping$0[segment.getVerb().ordinal()]) {
/*     */       case 1:
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         points[offset] = segment.getP0().getX();
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         points[offset + 1] = segment.getP0().getY();
/*     */       case 2:
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         points[offset] = segment.getP0().getX();
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         points[offset + 1] = segment.getP0().getY();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         points[offset + 2] = segment.getP1().getX();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         points[offset + 3] = segment.getP1().getY();
/*     */       case 3:
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         points[offset] = segment.getP0().getX();
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         points[offset + 1] = segment.getP0().getY();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         points[offset + 2] = segment.getP1().getX();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         points[offset + 3] = segment.getP1().getY();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         points[offset + 4] = segment.getP2().getX();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         points[offset + 5] = segment.getP2().getY();
/*     */       case 4:
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         points[offset] = segment.getP0().getX();
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         points[offset + 1] = segment.getP0().getY();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         points[offset + 2] = segment.getP1().getX();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         points[offset + 3] = segment.getP1().getY();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         points[offset + 4] = segment.getP2().getX();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         points[offset + 5] = segment.getP2().getY();
/*     */         points[offset + 6] = segment.getConicWeight();
/*     */         points[offset + 7] = segment.getConicWeight();
/*     */       case 5:
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         points[offset] = segment.getP0().getX();
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         points[offset + 1] = segment.getP0().getY();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         points[offset + 2] = segment.getP1().getX();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         points[offset + 3] = segment.getP1().getY();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         points[offset + 4] = segment.getP2().getX();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         points[offset + 5] = segment.getP2().getY();
/*     */         Intrinsics.checkNotNull(segment.getP3());
/*     */         points[offset + 6] = segment.getP3().getX();
/*     */         Intrinsics.checkNotNull(segment.getP3());
/*     */         points[offset + 7] = segment.getP3().getY();
/*     */       case 6:
/*     */       
/*     */       case 7:
/*     */       
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public PathSegment next() {
/*     */     float[] arrayOfFloat;
/*     */     if (!hasNext())
/*     */       return PathSegmentKt.getDoneSegment(); 
/*     */     PathSegment segment = this.iterator.next();
/*     */     if (segment == null) {
/*     */       String str = "Required value was null.";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     switch (WhenMappings.$EnumSwitchMapping$0[segment.getVerb().ordinal()]) {
/*     */       case 1:
/*     */         arrayOfFloat = new float[2];
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         arrayOfFloat[0] = segment.getP0().getX();
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         arrayOfFloat[1] = segment.getP0().getY();
/*     */         return new PathSegment(PathSegment.Type.Move, arrayOfFloat, 0.0F);
/*     */       case 2:
/*     */         arrayOfFloat = new float[4];
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         arrayOfFloat[0] = segment.getP0().getX();
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         arrayOfFloat[1] = segment.getP0().getY();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         arrayOfFloat[2] = segment.getP1().getX();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         arrayOfFloat[3] = segment.getP1().getY();
/*     */         return new PathSegment(PathSegment.Type.Line, arrayOfFloat, 0.0F);
/*     */       case 3:
/*     */         arrayOfFloat = new float[6];
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         arrayOfFloat[0] = segment.getP0().getX();
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         arrayOfFloat[1] = segment.getP0().getY();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         arrayOfFloat[2] = segment.getP1().getX();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         arrayOfFloat[3] = segment.getP1().getY();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         arrayOfFloat[4] = segment.getP2().getX();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         arrayOfFloat[5] = segment.getP2().getY();
/*     */         return new PathSegment(PathSegment.Type.Quadratic, arrayOfFloat, 0.0F);
/*     */       case 4:
/*     */         arrayOfFloat = new float[6];
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         arrayOfFloat[0] = segment.getP0().getX();
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         arrayOfFloat[1] = segment.getP0().getY();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         arrayOfFloat[2] = segment.getP1().getX();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         arrayOfFloat[3] = segment.getP1().getY();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         arrayOfFloat[4] = segment.getP2().getX();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         arrayOfFloat[5] = segment.getP2().getY();
/*     */         return new PathSegment(PathSegment.Type.Quadratic, arrayOfFloat, segment.getConicWeight());
/*     */       case 5:
/*     */         arrayOfFloat = new float[8];
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         arrayOfFloat[0] = segment.getP0().getX();
/*     */         Intrinsics.checkNotNull(segment.getP0());
/*     */         arrayOfFloat[1] = segment.getP0().getY();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         arrayOfFloat[2] = segment.getP1().getX();
/*     */         Intrinsics.checkNotNull(segment.getP1());
/*     */         arrayOfFloat[3] = segment.getP1().getY();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         arrayOfFloat[4] = segment.getP2().getX();
/*     */         Intrinsics.checkNotNull(segment.getP2());
/*     */         arrayOfFloat[5] = segment.getP2().getY();
/*     */         Intrinsics.checkNotNull(segment.getP3());
/*     */         arrayOfFloat[6] = segment.getP3().getX();
/*     */         Intrinsics.checkNotNull(segment.getP3());
/*     */         arrayOfFloat[7] = segment.getP3().getY();
/*     */         return new PathSegment(PathSegment.Type.Cubic, arrayOfFloat, 0.0F);
/*     */       case 6:
/*     */       
/*     */       case 7:
/*     */       
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   public void remove() {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaPathIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */