/*     */ package androidx.compose.ui.graphics.drawscope;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.SizeKt;
/*     */ import androidx.compose.ui.graphics.Canvas;
/*     */ import androidx.compose.ui.graphics.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\002¨\006\003"}, d2 = {"asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics"})
/*     */ public final class CanvasDrawScopeKt
/*     */ {
/*     */   private static final DrawTransform asDrawTransform(DrawContext $this$asDrawTransform) {
/* 735 */     return new CanvasDrawScopeKt$asDrawTransform$1($this$asDrawTransform); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000?\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\007\n\002\b\022\n\002\030\002\n\002\b\004*\001\000\b\n\030\0002\0020\001J\"\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016H\026ø\001\000¢\006\004\b\017\020\020J:\020\021\032\0020\n2\006\020\022\032\0020\0232\006\020\024\032\0020\0232\006\020\025\032\0020\0232\006\020\026\032\0020\0232\006\020\r\032\0020\016H\026ø\001\000¢\006\004\b\027\020\030J(\020\031\032\0020\n2\006\020\022\032\0020\0232\006\020\024\032\0020\0232\006\020\025\032\0020\0232\006\020\026\032\0020\023H\026J\"\020\032\032\0020\n2\006\020\033\032\0020\0232\006\020\034\032\0020\003H\026ø\001\000¢\006\004\b\035\020\036J*\020\037\032\0020\n2\006\020 \032\0020\0232\006\020!\032\0020\0232\006\020\034\032\0020\003H\026ø\001\000¢\006\004\b\"\020#J\032\020$\032\0020\n2\006\020%\032\0020&H\026ø\001\000¢\006\004\b'\020(J\030\020)\032\0020\n2\006\020\022\032\0020\0232\006\020\024\032\0020\023H\026R\032\020\002\032\0020\0038VX\004ø\001\000ø\001\001¢\006\006\032\004\b\004\020\005R\032\020\006\032\0020\0078VX\004ø\001\000ø\001\001¢\006\006\032\004\b\b\020\005\002\013\n\005\b¡\0360\001\n\002\b!¨\006*"}, d2 = {"androidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "inset", "rotate", "degrees", "pivot", "rotate-Uv8p0NA", "(FJ)V", "scale", "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "ui-graphics"})
/*     */   @SourceDebugExtension({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,791:1\n33#2,7:792\n*S KotlinDebug\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1\n*L\n745#1:792,7\n*E\n"})
/* 737 */   public static final class CanvasDrawScopeKt$asDrawTransform$1 implements DrawTransform { public long getSize-NH-jbRc() { return this.$this_asDrawTransform.getSize-NH-jbRc(); }
/*     */      CanvasDrawScopeKt$asDrawTransform$1(DrawContext $receiver) {}
/*     */     public long getCenter-F1C5BW0() {
/* 740 */       return SizeKt.getCenter-uvyYCjk(getSize-NH-jbRc());
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void inset(float left, float top, float right, float bottom) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $this_asDrawTransform : Landroidx/compose/ui/graphics/drawscope/DrawContext;
/*     */       //   4: invokeinterface getCanvas : ()Landroidx/compose/ui/graphics/Canvas;
/*     */       //   9: astore #5
/*     */       //   11: aload_0
/*     */       //   12: getfield $this_asDrawTransform : Landroidx/compose/ui/graphics/drawscope/DrawContext;
/*     */       //   15: astore #6
/*     */       //   17: aload #5
/*     */       //   19: astore #7
/*     */       //   21: iconst_0
/*     */       //   22: istore #8
/*     */       //   24: aload_0
/*     */       //   25: invokevirtual getSize-NH-jbRc : ()J
/*     */       //   28: invokestatic getWidth-impl : (J)F
/*     */       //   31: fload_1
/*     */       //   32: fload_3
/*     */       //   33: fadd
/*     */       //   34: fsub
/*     */       //   35: aload_0
/*     */       //   36: invokevirtual getSize-NH-jbRc : ()J
/*     */       //   39: invokestatic getHeight-impl : (J)F
/*     */       //   42: fload_2
/*     */       //   43: fload #4
/*     */       //   45: fadd
/*     */       //   46: fsub
/*     */       //   47: invokestatic Size : (FF)J
/*     */       //   50: lstore #9
/*     */       //   52: lload #9
/*     */       //   54: invokestatic getWidth-impl : (J)F
/*     */       //   57: fconst_0
/*     */       //   58: fcmpl
/*     */       //   59: iflt -> 76
/*     */       //   62: lload #9
/*     */       //   64: invokestatic getHeight-impl : (J)F
/*     */       //   67: fconst_0
/*     */       //   68: fcmpl
/*     */       //   69: iflt -> 76
/*     */       //   72: iconst_1
/*     */       //   73: goto -> 77
/*     */       //   76: iconst_0
/*     */       //   77: istore #11
/*     */       //   79: iconst_0
/*     */       //   80: istore #12
/*     */       //   82: nop
/*     */       //   83: iload #11
/*     */       //   85: ifne -> 96
/*     */       //   88: iconst_0
/*     */       //   89: istore #13
/*     */       //   91: ldc 'Width and height must be greater than or equal to zero'
/*     */       //   93: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */       //   96: nop
/*     */       //   97: aload #6
/*     */       //   99: lload #9
/*     */       //   101: invokeinterface setSize-uvyYCjk : (J)V
/*     */       //   106: aload #7
/*     */       //   108: fload_1
/*     */       //   109: fload_2
/*     */       //   110: invokeinterface translate : (FF)V
/*     */       //   115: nop
/*     */       //   116: nop
/*     */       //   117: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #743	-> 0
/*     */       //   #744	-> 24
/*     */       //   #745	-> 52
/*     */       //   #792	-> 82
/*     */       //   #795	-> 83
/*     */       //   #796	-> 88
/*     */       //   #746	-> 91
/*     */       //   #796	-> 93
/*     */       //   #798	-> 96
/*     */       //   #748	-> 97
/*     */       //   #749	-> 106
/*     */       //   #750	-> 115
/*     */       //   #743	-> 116
/*     */       //   #751	-> 117
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   91	2	13	$i$a$-requirePrecondition-CanvasDrawScopeKt$asDrawTransform$1$inset$1$1	I
/*     */       //   82	15	12	$i$f$requirePrecondition	I
/*     */       //   79	18	11	value$iv	Z
/*     */       //   24	92	8	$i$a$-let-CanvasDrawScopeKt$asDrawTransform$1$inset$1	I
/*     */       //   52	64	9	updatedSize	J
/*     */       //   21	95	7	it	Landroidx/compose/ui/graphics/Canvas;
/*     */       //   0	118	0	this	Landroidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1;
/*     */       //   0	118	1	left	F
/*     */       //   0	118	2	top	F
/*     */       //   0	118	3	right	F
/*     */       //   0	118	4	bottom	F
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void clipRect-N_I0leg(float left, float top, float right, float bottom, int clipOp) {
/* 760 */       this.$this_asDrawTransform.getCanvas().clipRect-N_I0leg(left, top, right, bottom, clipOp);
/*     */     }
/*     */     
/*     */     public void clipPath-mtrdD-E(@NotNull Path path, int clipOp) {
/* 764 */       Intrinsics.checkNotNullParameter(path, "path"); this.$this_asDrawTransform.getCanvas().clipPath-mtrdD-E(path, clipOp);
/*     */     }
/*     */     
/*     */     public void translate(float left, float top) {
/* 768 */       this.$this_asDrawTransform.getCanvas().translate(left, top);
/*     */     }
/*     */     
/*     */     public void rotate-Uv8p0NA(float degrees, long pivot) {
/* 772 */       Canvas canvas1 = this.$this_asDrawTransform.getCanvas(), $this$rotate_Uv8p0NA_u24lambda_u242 = canvas1; int $i$a$-apply-CanvasDrawScopeKt$asDrawTransform$1$rotate$1 = 0;
/* 773 */       $this$rotate_Uv8p0NA_u24lambda_u242.translate(Offset.getX-impl(pivot), Offset.getY-impl(pivot));
/* 774 */       $this$rotate_Uv8p0NA_u24lambda_u242.rotate(degrees);
/* 775 */       $this$rotate_Uv8p0NA_u24lambda_u242.translate(-Offset.getX-impl(pivot), -Offset.getY-impl(pivot));
/*     */     }
/*     */ 
/*     */     
/*     */     public void scale-0AR0LA0(float scaleX, float scaleY, long pivot) {
/* 780 */       Canvas canvas1 = this.$this_asDrawTransform.getCanvas(), $this$scale_0AR0LA0_u24lambda_u243 = canvas1; int $i$a$-apply-CanvasDrawScopeKt$asDrawTransform$1$scale$1 = 0;
/* 781 */       $this$scale_0AR0LA0_u24lambda_u243.translate(Offset.getX-impl(pivot), Offset.getY-impl(pivot));
/* 782 */       $this$scale_0AR0LA0_u24lambda_u243.scale(scaleX, scaleY);
/* 783 */       $this$scale_0AR0LA0_u24lambda_u243.translate(-Offset.getX-impl(pivot), -Offset.getY-impl(pivot));
/*     */     }
/*     */ 
/*     */     
/*     */     public void transform-58bKbWc(@NotNull float[] matrix) {
/* 788 */       Intrinsics.checkNotNullParameter(matrix, "matrix"); this.$this_asDrawTransform.getCanvas().concat-58bKbWc(matrix);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\drawscope\CanvasDrawScopeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */