/*      */ package androidx.compose.ui.graphics.drawscope;
/*      */ 
/*      */ import androidx.compose.ui.graphics.Canvas;
/*      */ import androidx.compose.ui.graphics.DegreesKt;
/*      */ import androidx.compose.ui.graphics.Path;
/*      */ import androidx.compose.ui.graphics.layer.GraphicsLayer;
/*      */ import androidx.compose.ui.unit.Density;
/*      */ import androidx.compose.ui.unit.LayoutDirection;
/*      */ import kotlin.Deprecated;
/*      */ import kotlin.DeprecationLevel;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.internal.InlineMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000^\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\007\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\016\n\002\030\002\n\002\b\002\032E\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\b\b\002\020\005\032\0020\0062\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000ø\001\001¢\006\004\b\n\020\013\032e\020\f\032\0020\001*\0020\0022\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0162\b\b\002\020\020\032\0020\0162\b\b\002\020\021\032\0020\0162\b\b\002\020\005\032\0020\0062\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000ø\001\001¢\006\004\b\022\020\023\032S\020\024\032\0020\001*\0020\0022\006\020\025\032\0020\0262\006\020\027\032\0020\0302\006\020\031\032\0020\0322\006\020\033\032\0020\0342\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000ø\001\001¢\006\004\b\035\020\036\032_\020\024\032\0020\001*\0020\0022\006\020\025\032\0020\0262\006\020\027\032\0020\0302\006\020\031\032\0020\0322\006\020\033\032\0020\0342\n\b\002\020\037\032\004\030\0010 2\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000ø\001\001¢\006\004\b!\020\"\032$\020#\032\0020\001*\0020\0022\022\020\007\032\016\022\004\022\0020\032\022\004\022\0020\0010\bH\bø\001\000\0321\020$\032\0020\001*\0020\0022\006\020$\032\0020\0162\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000\032=\020$\032\0020\001*\0020\0022\b\b\002\020%\032\0020\0162\b\b\002\020&\032\0020\0162\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000\032I\020$\032\0020\001*\0020\0022\006\020\r\032\0020\0162\006\020\017\032\0020\0162\006\020\020\032\0020\0162\006\020\021\032\0020\0162\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000\032E\020'\032\0020\001*\0020\0022\006\020(\032\0020\0162\b\b\002\020)\032\0020*2\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000ø\001\001¢\006\004\b+\020,\032E\020-\032\0020\001*\0020\0022\006\020.\032\0020\0162\b\b\002\020)\032\0020*2\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000ø\001\001¢\006\004\b/\020,\032E\0200\032\0020\001*\0020\0022\006\0200\032\0020\0162\b\b\002\020)\032\0020*2\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000ø\001\001¢\006\004\b1\020,\032M\0200\032\0020\001*\0020\0022\006\0202\032\0020\0162\006\0203\032\0020\0162\b\b\002\020)\032\0020*2\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000ø\001\001¢\006\004\b4\0205\032=\0206\032\0020\001*\0020\0022\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0162\027\020\007\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000\032B\0207\032\0020\001*\0020\0022\027\0208\032\023\022\004\022\00209\022\004\022\0020\0010\b¢\006\002\b\t2\027\020:\032\023\022\004\022\0020\002\022\004\022\0020\0010\b¢\006\002\b\tH\bø\001\000\002\016\n\005\b20\001\n\005\b¡\0360\001¨\006;"}, d2 = {"clipPath", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/functions/Function1;)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkotlin/jvm/functions/Function1;)V", "draw", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "draw-GRGpd60", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "draw-ymL40Pk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "drawIntoCanvas", "inset", "horizontal", "vertical", "rotate", "degrees", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkotlin/jvm/functions/Function1;)V", "rotateRad", "radians", "rotateRad-Rg1IO4c", "scale", "scale-Rg1IO4c", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkotlin/jvm/functions/Function1;)V", "translate", "withTransform", "transformBlock", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "drawBlock", "ui-graphics"})
/*      */ @SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1062:1\n68#1,7:1063\n272#1,14:1070\n272#1,14:1084\n272#1,14:1098\n272#1,14:1112\n272#1,14:1126\n272#1,14:1140\n329#1,26:1154\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n112#1:1063,7\n151#1:1070,14\n168#1:1084,14\n189#1:1098,14\n206#1:1112,14\n232#1:1126,14\n248#1:1140,14\n298#1:1154,26\n*E\n"})
/*      */ public final class DrawScopeKt
/*      */ {
/*      */   public static final void inset(@NotNull DrawScope $this$inset, float left, float top, float right, float bottom, @NotNull Function1 block) {
/*   68 */     Intrinsics.checkNotNullParameter($this$inset, "<this>"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$inset = 0; $this$inset.getDrawContext().getTransform().inset(left, top, right, bottom);
/*      */     try {
/*   70 */       block.invoke($this$inset);
/*      */     } finally {
/*   72 */       InlineMarker.finallyStart(1); $this$inset.getDrawContext().getTransform().inset(-left, -top, -right, -bottom); InlineMarker.finallyEnd(1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final void inset(@NotNull DrawScope $this$inset, float inset, @NotNull Function1 block) {
/*   89 */     Intrinsics.checkNotNullParameter($this$inset, "<this>"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$inset = 0; $this$inset.getDrawContext().getTransform().inset(inset, inset, inset, inset);
/*      */     try {
/*   91 */       block.invoke($this$inset);
/*      */     } finally {
/*   93 */       InlineMarker.finallyStart(1); $this$inset.getDrawContext().getTransform().inset(-inset, -inset, -inset, -inset); InlineMarker.finallyEnd(1);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static final void translate(@NotNull DrawScope $this$translate, float left, float top, @NotNull Function1 block) {
/*      */     Intrinsics.checkNotNullParameter($this$translate, "<this>");
/*      */     Intrinsics.checkNotNullParameter(block, "block");
/*      */     int $i$f$translate = 0;
/*      */     $this$translate.getDrawContext().getTransform().translate(left, top);
/*      */     try {
/*      */       block.invoke($this$translate);
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       $this$translate.getDrawContext().getTransform().translate(-left, -top);
/*      */       InlineMarker.finallyEnd(1);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static final void inset(@NotNull DrawScope $this$inset, float horizontal, float vertical, @NotNull Function1 block) {
/*  112 */     Intrinsics.checkNotNullParameter($this$inset, "<this>"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$inset = 0; DrawScope $this$inset$iv = $this$inset; int i = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1063 */     $this$inset$iv.getDrawContext().getTransform().inset(horizontal, vertical, horizontal, vertical);
/*      */     try {
/* 1065 */       block.invoke($this$inset$iv);
/*      */     } finally {
/* 1067 */       InlineMarker.finallyStart(1); $this$inset$iv.getDrawContext().getTransform().inset(-horizontal, -vertical, -horizontal, -vertical); InlineMarker.finallyEnd(1);
/*      */     }  } public static final void rotate-Rg1IO4c(@NotNull DrawScope $this$rotate_u2dRg1IO4c, float degrees, long pivot, @NotNull Function1 block) { Intrinsics.checkNotNullParameter($this$rotate_u2dRg1IO4c, "$this$rotate"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$rotate-Rg1IO4c = 0; DrawScope $this$withTransform$iv = $this$rotate_u2dRg1IO4c;
/*      */     int $i$f$withTransform = 0;
/* 1070 */     DrawContext $this$withTransform_u24lambda_u246$iv = $this$withTransform$iv.getDrawContext(); int $i$a$-with-DrawScopeKt$withTransform$1$iv = 0;
/*      */ 
/*      */ 
/*      */     
/* 1074 */     long previousSize$iv = $this$withTransform_u24lambda_u246$iv.getSize-NH-jbRc();
/* 1075 */     $this$withTransform_u24lambda_u246$iv.getCanvas().save();
/*      */     try {
/* 1077 */       DrawTransform $this$rotate_Rg1IO4c_u24lambda_u240 = $this$withTransform_u24lambda_u246$iv.getTransform(); int $i$a$-withTransform-DrawScopeKt$rotate$1 = 0; $this$rotate_Rg1IO4c_u24lambda_u240.rotate-Uv8p0NA(degrees, pivot);
/* 1078 */       block.invoke($this$withTransform$iv);
/*      */     } finally {
/* 1080 */       InlineMarker.finallyStart(1); $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
/* 1081 */       $this$withTransform_u24lambda_u246$iv.setSize-uvyYCjk(previousSize$iv); InlineMarker.finallyEnd(1);
/*      */     }  } public static final void rotateRad-Rg1IO4c(@NotNull DrawScope $this$rotateRad_u2dRg1IO4c, float radians, long pivot, @NotNull Function1 block) { Intrinsics.checkNotNullParameter($this$rotateRad_u2dRg1IO4c, "$this$rotateRad"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$rotateRad-Rg1IO4c = 0; DrawScope $this$withTransform$iv = $this$rotateRad_u2dRg1IO4c;
/*      */     int $i$f$withTransform = 0;
/* 1084 */     DrawContext $this$withTransform_u24lambda_u246$iv = $this$withTransform$iv.getDrawContext(); int $i$a$-with-DrawScopeKt$withTransform$1$iv = 0;
/*      */ 
/*      */ 
/*      */     
/* 1088 */     long previousSize$iv = $this$withTransform_u24lambda_u246$iv.getSize-NH-jbRc();
/* 1089 */     $this$withTransform_u24lambda_u246$iv.getCanvas().save();
/*      */     try {
/* 1091 */       DrawTransform $this$rotateRad_Rg1IO4c_u24lambda_u241 = $this$withTransform_u24lambda_u246$iv.getTransform(); int $i$a$-withTransform-DrawScopeKt$rotateRad$1 = 0; $this$rotateRad_Rg1IO4c_u24lambda_u241.rotate-Uv8p0NA(DegreesKt.degrees(radians), pivot);
/* 1092 */       block.invoke($this$withTransform$iv);
/*      */     } finally {
/* 1094 */       InlineMarker.finallyStart(1); $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
/* 1095 */       $this$withTransform_u24lambda_u246$iv.setSize-uvyYCjk(previousSize$iv); InlineMarker.finallyEnd(1);
/*      */     }  } public static final void scale-Fgt4K4Q(@NotNull DrawScope $this$scale_u2dFgt4K4Q, float scaleX, float scaleY, long pivot, @NotNull Function1 block) { Intrinsics.checkNotNullParameter($this$scale_u2dFgt4K4Q, "$this$scale"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$scale-Fgt4K4Q = 0; DrawScope $this$withTransform$iv = $this$scale_u2dFgt4K4Q;
/*      */     int $i$f$withTransform = 0;
/* 1098 */     DrawContext $this$withTransform_u24lambda_u246$iv = $this$withTransform$iv.getDrawContext(); int $i$a$-with-DrawScopeKt$withTransform$1$iv = 0;
/*      */ 
/*      */ 
/*      */     
/* 1102 */     long previousSize$iv = $this$withTransform_u24lambda_u246$iv.getSize-NH-jbRc();
/* 1103 */     $this$withTransform_u24lambda_u246$iv.getCanvas().save();
/*      */     try {
/* 1105 */       DrawTransform $this$scale_Fgt4K4Q_u24lambda_u242 = $this$withTransform_u24lambda_u246$iv.getTransform(); int $i$a$-withTransform-DrawScopeKt$scale$1 = 0; $this$scale_Fgt4K4Q_u24lambda_u242.scale-0AR0LA0(scaleX, scaleY, pivot);
/* 1106 */       block.invoke($this$withTransform$iv);
/*      */     } finally {
/* 1108 */       InlineMarker.finallyStart(1); $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
/* 1109 */       $this$withTransform_u24lambda_u246$iv.setSize-uvyYCjk(previousSize$iv); InlineMarker.finallyEnd(1);
/*      */     }  } public static final void scale-Rg1IO4c(@NotNull DrawScope $this$scale_u2dRg1IO4c, float scale, long pivot, @NotNull Function1 block) { Intrinsics.checkNotNullParameter($this$scale_u2dRg1IO4c, "$this$scale"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$scale-Rg1IO4c = 0; DrawScope $this$withTransform$iv = $this$scale_u2dRg1IO4c;
/*      */     int $i$f$withTransform = 0;
/* 1112 */     DrawContext $this$withTransform_u24lambda_u246$iv = $this$withTransform$iv.getDrawContext(); int $i$a$-with-DrawScopeKt$withTransform$1$iv = 0;
/*      */ 
/*      */ 
/*      */     
/* 1116 */     long previousSize$iv = $this$withTransform_u24lambda_u246$iv.getSize-NH-jbRc();
/* 1117 */     $this$withTransform_u24lambda_u246$iv.getCanvas().save();
/*      */     try {
/* 1119 */       DrawTransform $this$scale_Rg1IO4c_u24lambda_u243 = $this$withTransform_u24lambda_u246$iv.getTransform(); int $i$a$-withTransform-DrawScopeKt$scale$2 = 0; $this$scale_Rg1IO4c_u24lambda_u243.scale-0AR0LA0(scale, scale, pivot);
/* 1120 */       block.invoke($this$withTransform$iv);
/*      */     } finally {
/* 1122 */       InlineMarker.finallyStart(1); $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
/* 1123 */       $this$withTransform_u24lambda_u246$iv.setSize-uvyYCjk(previousSize$iv); InlineMarker.finallyEnd(1);
/*      */     }  } public static final void clipRect-rOu3jXo(@NotNull DrawScope $this$clipRect_u2drOu3jXo, float left, float top, float right, float bottom, int clipOp, @NotNull Function1 block) { Intrinsics.checkNotNullParameter($this$clipRect_u2drOu3jXo, "$this$clipRect"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$clipRect-rOu3jXo = 0; DrawScope $this$withTransform$iv = $this$clipRect_u2drOu3jXo;
/*      */     int $i$f$withTransform = 0;
/* 1126 */     DrawContext $this$withTransform_u24lambda_u246$iv = $this$withTransform$iv.getDrawContext(); int $i$a$-with-DrawScopeKt$withTransform$1$iv = 0;
/*      */ 
/*      */ 
/*      */     
/* 1130 */     long previousSize$iv = $this$withTransform_u24lambda_u246$iv.getSize-NH-jbRc();
/* 1131 */     $this$withTransform_u24lambda_u246$iv.getCanvas().save();
/*      */     try {
/* 1133 */       DrawTransform $this$clipRect_rOu3jXo_u24lambda_u244 = $this$withTransform_u24lambda_u246$iv.getTransform(); int $i$a$-withTransform-DrawScopeKt$clipRect$1 = 0; $this$clipRect_rOu3jXo_u24lambda_u244.clipRect-N_I0leg(left, top, right, bottom, clipOp);
/* 1134 */       block.invoke($this$withTransform$iv);
/*      */     } finally {
/* 1136 */       InlineMarker.finallyStart(1); $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
/* 1137 */       $this$withTransform_u24lambda_u246$iv.setSize-uvyYCjk(previousSize$iv); InlineMarker.finallyEnd(1);
/*      */     }  } public static final void clipPath-KD09W0M(@NotNull DrawScope $this$clipPath_u2dKD09W0M, @NotNull Path path, int clipOp, @NotNull Function1 block) { Intrinsics.checkNotNullParameter($this$clipPath_u2dKD09W0M, "$this$clipPath"); Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$clipPath-KD09W0M = 0; DrawScope $this$withTransform$iv = $this$clipPath_u2dKD09W0M;
/*      */     int $i$f$withTransform = 0;
/* 1140 */     DrawContext $this$withTransform_u24lambda_u246$iv = $this$withTransform$iv.getDrawContext(); int $i$a$-with-DrawScopeKt$withTransform$1$iv = 0;
/*      */ 
/*      */ 
/*      */     
/* 1144 */     long previousSize$iv = $this$withTransform_u24lambda_u246$iv.getSize-NH-jbRc();
/* 1145 */     $this$withTransform_u24lambda_u246$iv.getCanvas().save();
/*      */     try {
/* 1147 */       DrawTransform $this$clipPath_KD09W0M_u24lambda_u245 = $this$withTransform_u24lambda_u246$iv.getTransform(); int $i$a$-withTransform-DrawScopeKt$clipPath$1 = 0; $this$clipPath_KD09W0M_u24lambda_u245.clipPath-mtrdD-E(path, clipOp);
/* 1148 */       block.invoke($this$withTransform$iv);
/*      */     } finally {
/* 1150 */       InlineMarker.finallyStart(1); $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
/* 1151 */       $this$withTransform_u24lambda_u246$iv.setSize-uvyYCjk(previousSize$iv); InlineMarker.finallyEnd(1);
/*      */     }  }
/*      */ 
/*      */   
/*      */   public static final void drawIntoCanvas(@NotNull DrawScope $this$drawIntoCanvas, @NotNull Function1 block) {
/*      */     Intrinsics.checkNotNullParameter($this$drawIntoCanvas, "<this>");
/*      */     Intrinsics.checkNotNullParameter(block, "block");
/*      */     int $i$f$drawIntoCanvas = 0;
/*      */     block.invoke($this$drawIntoCanvas.getDrawContext().getCanvas());
/*      */   }
/*      */   
/*      */   public static final void withTransform(@NotNull DrawScope $this$withTransform, @NotNull Function1 transformBlock, @NotNull Function1 drawBlock) {
/*      */     Intrinsics.checkNotNullParameter($this$withTransform, "<this>");
/*      */     Intrinsics.checkNotNullParameter(transformBlock, "transformBlock");
/*      */     Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
/*      */     int $i$f$withTransform = 0;
/*      */     DrawContext $this$withTransform_u24lambda_u246 = $this$withTransform.getDrawContext();
/*      */     int $i$a$-with-DrawScopeKt$withTransform$1 = 0;
/*      */     long previousSize = $this$withTransform_u24lambda_u246.getSize-NH-jbRc();
/*      */     $this$withTransform_u24lambda_u246.getCanvas().save();
/*      */     try {
/*      */       transformBlock.invoke($this$withTransform_u24lambda_u246.getTransform());
/*      */       drawBlock.invoke($this$withTransform);
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       $this$withTransform_u24lambda_u246.getCanvas().restore();
/*      */       $this$withTransform_u24lambda_u246.setSize-uvyYCjk(previousSize);
/*      */       InlineMarker.finallyEnd(1);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static final void draw-ymL40Pk(@NotNull DrawScope $this$draw_u2dymL40Pk, @NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long size, @Nullable GraphicsLayer graphicsLayer, @NotNull Function1 block) {
/*      */     Intrinsics.checkNotNullParameter($this$draw_u2dymL40Pk, "$this$draw");
/*      */     Intrinsics.checkNotNullParameter(density, "density");
/*      */     Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*      */     Intrinsics.checkNotNullParameter(canvas, "canvas");
/*      */     Intrinsics.checkNotNullParameter(block, "block");
/*      */     int $i$f$draw-ymL40Pk = 0;
/*      */     Density prevDensity = $this$draw_u2dymL40Pk.getDrawContext().getDensity();
/*      */     LayoutDirection prevLayoutDirection = $this$draw_u2dymL40Pk.getDrawContext().getLayoutDirection();
/*      */     Canvas prevCanvas = $this$draw_u2dymL40Pk.getDrawContext().getCanvas();
/*      */     long prevSize = $this$draw_u2dymL40Pk.getDrawContext().getSize-NH-jbRc();
/*      */     GraphicsLayer prevLayer = $this$draw_u2dymL40Pk.getDrawContext().getGraphicsLayer();
/*      */     DrawContext $this$draw_ymL40Pk_u24lambda_u247 = null = $this$draw_u2dymL40Pk.getDrawContext();
/*      */     int $i$a$-apply-DrawScopeKt$draw$1 = 0;
/*      */     $this$draw_ymL40Pk_u24lambda_u247.setDensity(density);
/*      */     $this$draw_ymL40Pk_u24lambda_u247.setLayoutDirection(layoutDirection);
/*      */     $this$draw_ymL40Pk_u24lambda_u247.setCanvas(canvas);
/*      */     $this$draw_ymL40Pk_u24lambda_u247.setSize-uvyYCjk(size);
/*      */     $this$draw_ymL40Pk_u24lambda_u247.setGraphicsLayer(graphicsLayer);
/*      */     canvas.save();
/*      */     try {
/*      */       block.invoke($this$draw_u2dymL40Pk);
/*      */     } finally {
/*      */       InlineMarker.finallyStart(1);
/*      */       canvas.restore();
/*      */       DrawContext $this$draw_ymL40Pk_u24lambda_u248 = $this$draw_ymL40Pk_u24lambda_u247 = $this$draw_u2dymL40Pk.getDrawContext();
/*      */       int $i$a$-apply-DrawScopeKt$draw$2 = 0;
/*      */       $this$draw_ymL40Pk_u24lambda_u248.setDensity(prevDensity);
/*      */       $this$draw_ymL40Pk_u24lambda_u248.setLayoutDirection(prevLayoutDirection);
/*      */       $this$draw_ymL40Pk_u24lambda_u248.setCanvas(prevCanvas);
/*      */       $this$draw_ymL40Pk_u24lambda_u248.setSize-uvyYCjk(prevSize);
/*      */       $this$draw_ymL40Pk_u24lambda_u248.setGraphicsLayer(prevLayer);
/*      */       InlineMarker.finallyEnd(1);
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\drawscope\DrawScopeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */