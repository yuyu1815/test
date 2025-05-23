/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.annotation.FloatRange;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\000\032\030\020\002\032\0020\0032\006\020\004\032\0020\0012\b\b\003\020\005\032\0020\006\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\007"}, d2 = {"EmptyPath", "Landroidx/compose/ui/graphics/Path;", "PathHitTester", "Landroidx/compose/ui/graphics/PathHitTester;", "path", "tolerance", "", "ui-graphics"})
/*    */ public final class PathHitTesterKt
/*    */ {
/*    */   @NotNull
/*    */   public static final PathHitTester PathHitTester(@NotNull Path path, @FloatRange(from = 0.0D) float tolerance) {
/* 49 */     Intrinsics.checkNotNullParameter(path, "path"); PathHitTester pathHitTester1 = new PathHitTester(), $this$PathHitTester_u24lambda_u240 = pathHitTester1; int $i$a$-apply-PathHitTesterKt$PathHitTester$1 = 0;
/* 50 */     $this$PathHitTester_u24lambda_u240.updatePath(path, tolerance);
/*    */     return pathHitTester1;
/*    */   } @NotNull
/* 53 */   private static final Path EmptyPath = SkiaBackedPath_skikoKt.Path();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\PathHitTesterKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */