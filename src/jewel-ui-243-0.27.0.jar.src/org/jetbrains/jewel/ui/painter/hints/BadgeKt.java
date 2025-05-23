/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*    */ import org.jetbrains.jewel.ui.painter.badge.BadgeShape;
/*    */ import org.jetbrains.jewel.ui.painter.badge.DotBadgeShape;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032\037\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007¨\006\b"}, d2 = {"Badge", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "color", "Landroidx/compose/ui/graphics/Color;", "shape", "Lorg/jetbrains/jewel/ui/painter/badge/BadgeShape;", "Badge-DxMtmZc", "(JLorg/jetbrains/jewel/ui/painter/badge/BadgeShape;)Lorg/jetbrains/jewel/ui/painter/PainterHint;", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\norg/jetbrains/jewel/ui/painter/hints/BadgeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,23:1\n696#2:24\n*S KotlinDebug\n*F\n+ 1 Badge.kt\norg/jetbrains/jewel/ui/painter/hints/BadgeKt\n*L\n22#1:24\n*E\n"})
/*    */ public final class BadgeKt
/*    */ {
/*    */   @NotNull
/*    */   public static final PainterHint Badge-DxMtmZc(long color, @NotNull BadgeShape shape) {
/* 22 */     Intrinsics.checkNotNullParameter(shape, "shape"); long $this$isSpecified$iv = color; int $i$f$isSpecified-8_81llA = 0; return (
/*    */       
/* 24 */       ($this$isSpecified$iv != 16L)) ? (PainterHint)new BadgeImpl(color, shape, null) : (PainterHint)PainterHint.None;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\BadgeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */